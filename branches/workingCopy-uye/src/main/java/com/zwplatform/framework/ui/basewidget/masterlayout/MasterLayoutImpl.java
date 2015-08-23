package com.zwplatform.framework.ui.basewidget.masterlayout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.place.shared.Place;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.zwplatform.framework.ILayout;
import com.zwplatform.framework.ui.basewidget.IBaseWidgetView;

/**
 * Sample implementation of {@link MasterLayout}.
 */
public class MasterLayoutImpl extends Composite implements IBaseWidgetView, ILayout<IMasterLayoutDisplayAreas> {

	interface Binder extends UiBinder<Widget, MasterLayoutImpl> {
	}
	
	private static final Binder binder = GWT.create(Binder.class);

	private Presenter listener;
	@UiField
	Button button;

	public MasterLayoutImpl() {
		initWidget(binder.createAndBindUi(this));
	}

	@Override
	public void setName(String name) {
		button.setHTML(name);
	}

	@Override
	public void setPresenter(Presenter listener) {
		this.listener = listener;
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		Place newPlace = null;
		// TODO
		listener.goTo(newPlace);
	}
}
