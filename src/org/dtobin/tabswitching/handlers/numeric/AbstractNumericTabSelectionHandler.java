package org.dtobin.tabswitching.handlers.numeric;

import org.dtobin.tabswitching.handlers.AbstractTabSelectionHandler;
import org.eclipse.ui.IEditorReference;

public abstract class AbstractNumericTabSelectionHandler extends AbstractTabSelectionHandler {

	@Override
	protected IEditorReference chooseEditorReference(IEditorReference[] references) {
		int tabIndex = getTabIndex();
		if (tabIndex < references.length) {
			return references[tabIndex];
		} else {
			return null;
		}
	}
	
	protected abstract int getTabIndex();

}
