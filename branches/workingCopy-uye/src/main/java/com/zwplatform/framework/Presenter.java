package com.zwplatform.framework;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.Event;

/**
 * Default Presenter. Keep in mind that presenters are disposable!
 * @author uye
 *
 */
public class Presenter extends AbstractActivity implements IPresenter{

	private EventBus eventBus;
	private ClientFactory clientFactory;
	
	
	
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goTo(Place place) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fireEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showFacet(IFacet facet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IsWidget getView() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	
}