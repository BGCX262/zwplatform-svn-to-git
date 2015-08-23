package com.zwplatform.framework;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.Event;

public interface IPresenter extends Activity{
	
	/**
	 * Implement 
	 */
	public void validate();
	public void resetView();
	public void goTo(Place place);
	public void fireEvent(Event event);
	public void showFacet(IFacet facet);
	public IsWidget getView();
	
}
