package com.zwplatform.framework;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.zwplatform.client.inspector.IInspectorView;
import com.zwplatform.client.inspector.InspectorViewImpl;

public class ClientFactoryImpl implements ClientFactory
{
	private static final EventBus eventBus = new SimpleEventBus();
	private static final PlaceController placeController = new PlaceController(eventBus);
	private static final IInspectorView testView = new InspectorViewImpl();

	@Override
	public EventBus getEventBus()
	{
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController()
	{
		return placeController;
	}

	@Override
	public IInspectorView getTestView()
	{
		return testView;
	}

}
