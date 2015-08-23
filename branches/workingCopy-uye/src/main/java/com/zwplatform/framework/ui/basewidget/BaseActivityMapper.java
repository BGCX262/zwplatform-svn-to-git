package com.zwplatform.framework.ui.basewidget;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class BaseActivityMapper implements ActivityMapper{

	
	@Override
	public Activity getActivity(Place place) {
		// TODO use gin to whitelist places that use a certain layout; otherwise use default activity
		return null;
	}

}
