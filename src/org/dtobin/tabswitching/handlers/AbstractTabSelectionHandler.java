package org.dtobin.tabswitching.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class AbstractTabSelectionHandler extends AbstractHandler {

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			IWorkbenchPage page = window.getActivePage();	
			
			IEditorReference chosenEditorReference = chooseEditorReference(page.getEditorReferences());
			
			if (chosenEditorReference != null) {
				page.activate(page.findEditor(chosenEditorReference.getEditorInput()));
			}
						
			return null;
		} catch (PartInitException ex) {
			throw new ExecutionException("Failed to switch editors.", ex);
		}
	}
	
	protected abstract IEditorReference chooseEditorReference(IEditorReference[] references);
	
}
