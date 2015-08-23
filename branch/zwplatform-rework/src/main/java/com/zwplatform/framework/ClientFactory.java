package com.zwplatform.framework;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.zwplatform.client.inspector.IInspectorView;

public interface ClientFactory 
{
	EventBus getEventBus();
	PlaceController getPlaceController();
	IInspectorView getTestView();
}
