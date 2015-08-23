package com.zwplatform.framework.ui.basewidget;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.Event;
import com.zwplatform.framework.IFacet;
import com.zwplatform.framework.IPresenter;

/**
 * Activities are started and stopped by an ActivityManager associated with a container Widget.
 */
public class BasePresenter extends AbstractActivity implements IPresenter {
	
	
	private ActivityManager northActivityManager;
	
	
	

	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		IBaseWidgetView view = new BaseViewImpl();
//		view.setPresenter(this);
		containerWidget.setWidget(view.asWidget());
	}

	@Override
	public String mayStop() {
		return "Please hold on. This activity is stopping.";
	}

	/**
	 * @see IRootView.Presenter#goTo(Place)
	 */
	public void goTo(Place place) {
		// TODO
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
