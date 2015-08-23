package com.zwplatform.framework;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class Application implements EntryPoint {

	
	private SimplePanel appWidget = new SimplePanel();

	@Override
	public void onModuleLoad(){
		GeneratedGinApplicationContext appCtx = GWT.create(GeneratedGinApplicationContext.class);

		RootPanel.get().add(appCtx.getRootDisplayArea().)
		
//		RootPanel.get("header").add(injector.getMenu());
//		RootPanel.get("body").add(injector.getAppWidget());

		// Goes to the place represented on URL else default place
//		injector.getPlaceHistoryHandler().handleCurrentHistory();

	}
	
//	@Override
//	public void onModuleLoad() {
//		// Create ClientFactory using deferred binding so we can replace with
//		// different
//		// impls in gwt.xml
//		ClientFactory clientFactory = GWT.create(ClientFactory.class);
//		EventBus eventBus = clientFactory.getEventBus();
//		PlaceController placeController = clientFactory.getPlaceController();
//		Place defaultPlace = GWT.create(Place.class);
//
//		// Start ActivityManager for the main widget with our ActivityMapper
//		ActivityMapper activityMapper = new GeneratedRootActivityMapper(clientFactory);
//		ActivityManager activityManager = new ActivityManager(activityMapper,
//				eventBus);
//		activityManager.setDisplay(appWidget);
//
//		// Start PlaceHistoryHandler with our PlaceHistoryMapper
//		AppPlaceHistoryMapper historyMapper = GWT
//				.create(AppPlaceHistoryMapper.class);
//		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(
//				historyMapper);
//		historyHandler.register(placeController, eventBus, defaultPlace);
//
//		RootPanel.get().add(appWidget);
//		// Goes to place represented on URL or default place
//		historyHandler.handleCurrentHistory();
//		
//		GWT.log("zwplatform started up successfully");
//	}
}
