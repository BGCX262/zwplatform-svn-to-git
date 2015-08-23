package com.zwplatform.framework;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zwplatform.client.inspector.InspectorPlace;
import com.zwplatform.client.inspector.InspectorPresenter;


/**
 * To be generated based on annotations. Should be created specific for each
 * application that uses the framework. In essence, each Place will represent
 * a different layout/behavior for the entire application.
 * @author uye
 *
 */
public class GeneratedRootActivityMapper implements ActivityMapper{
	
	protected Provider<InspectorPresenter> inspectorPresenterProvider;
	
	@Inject
	public GeneratedRootActivityMapper(
				Provider<InspectorPresenter> inpsectorPresenterProvider
			){		
		this.inspectorPresenterProvider = inspectorPresenterProvider;
	}
	
	
	@Override
	public Activity getActivity(Place place) {
		if (place instanceof InspectorPlace){
			return inspectorPresenterProvider.get();
		}		
		return null;
	}

	
	
	
}
