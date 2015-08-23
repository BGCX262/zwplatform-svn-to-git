package com.zwplatform.framework.ui.basewidget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.place.shared.Place;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.zwplatform.framework.Presenter;

/**
 * the root component responsible in loading the correct layout for widgets
 * for a particular {@Link Place}. it loads the appropriate layout from the
 * map that is automatically populated whenever a new instance of it is created.
 * hence, all {@link Layout} instantiation should be handled by Gin.
 */
public class BaseViewImpl extends Composite implements IBaseWidgetView {

	interface Binder extends UiBinder<Widget, BaseViewImpl> {
	}
	
	private static final Binder binder = GWT.create(Binder.class);

	private Presenter listener;
	public BaseViewImpl() {
		initWidget(binder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter listener) {
		this.listener = listener;
	}

}
