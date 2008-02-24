package org.zlibrary.core.optionEntries;

import org.zlibrary.core.dialogs.ZLBooleanOptionEntry;
import org.zlibrary.core.options.ZLBooleanOption;

public class ZLSimpleBooleanOptionEntry extends ZLBooleanOptionEntry {
	private ZLBooleanOption myOption;
	
	public ZLSimpleBooleanOptionEntry(ZLBooleanOption option) {
		myOption = option;
	}
	
	public boolean initialState() {
		return myOption.getValue();
	}

	public void onAccept(boolean state) {
		myOption.setValue(state);
	}
}