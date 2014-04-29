package org.dtobin.tabswitching.handlers;

import org.eclipse.ui.IEditorReference;

public class LastTabSelectionHandler extends AbstractTabSelectionHandler {

	@Override
	protected IEditorReference chooseEditorReference(IEditorReference[] references) {
		if (references.length > 0) {
			return references[references.length - 1];
		} else {
			return null;
		}
	}

}
