package com.zwplatform.framework;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.zwplatform.client.test.TestView;

public interface ClientFactory 
{
	EventBus getEventBus();
	PlaceController getPlaceController();
	TestView getTestView();
}
