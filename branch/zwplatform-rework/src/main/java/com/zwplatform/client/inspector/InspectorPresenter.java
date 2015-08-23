package com.zwplatform.client.inspector;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.zwplatform.framework.ClientFactory;
import com.zwplatform.framework.IView;
import com.zwplatform.framework.root.IRootPresenter;

public class InspectorPresenter extends AbstractActivity implements
		IInspectorView.Presenter, IRootPresenter {
	// Used to obtain views, eventBus, placeController
	// Alternatively, could be injected via GIN
	private ClientFactory clientFactory;
	// Name that will be appended to "Hello,"
	private String name;

	public InspectorPresenter(InspectorPlace place, ClientFactory clientFactory) {
		this.name = place.getName();
		this.clientFactory = clientFactory;
	}

	/**
	 * Invoked by the ActivityManager to start a new Activity
	 */
	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		IInspectorView testView = clientFactory.getTestView();
		testView.setName(name);
		testView.setPresenter(this);
		containerWidget.setWidget(testView.asWidget());
	}

	/**
	 * Ask user before stopping this activity
	 */
	@Override
	public String mayStop() {
		return "Please hold on. This activity is stopping.";
	}

	/**
	 * Navigate to a new Place in the browser
	 */
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}

	@Override
	public IView getView() {
		// TODO Auto-generated method stub
		return null;
	}
}
