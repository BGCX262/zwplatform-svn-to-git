package com.zwplatform.framework;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;

public abstract class AbstractDisplayArea implements IDisplayArea{
	
	private ActivityManager activityManager;
	private ActivityMapper activityMapper;
	
	public ActivityManager getActivityManager(){
		return activityManager;
	}
	
	public void setActivityManager(ActivityManager am){
		this.activityManager = am;
	}

	public ActivityMapper getActivityMapper() {
		return activityMapper;
	}

	public void setActivityMapper(ActivityMapper activityMapper) {
		this.activityMapper = activityMapper;
	}
	
	public IView getView(){
		this.activityMapper.getActivity(place)
	}
	
}
