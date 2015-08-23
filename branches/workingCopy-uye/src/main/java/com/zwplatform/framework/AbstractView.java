package com.zwplatform.framework;

import com.google.gwt.core.client.GWT;
import com.google.gwt.layout.client.Layout;
import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Binder;
import com.zwplatform.framework.ui.basewidget.IBaseWidgetView;

/**
 * the root component responsible in loading the correct layout for widgets
 * for a particular {@Link Place}. it loads the appropriate layout from the
 * map that is automatically populated whenever a new instance of it is created.
 * hence, all {@link Layout} instantiation should be handled by Gin.
 */
public class AbstractView extends Composite implements IBaseWidgetView {

	
	private static final Binder binder = GWT.create(Binder.class);

	private Presenter listener;
	
	/**
	 * to be called by the constructor to initialize ui binder. 
	 * override for extending classes
	 */
	public abstract Binder getUiBinder();
	
	public AbstractView() {
		initWidget((getUiBinder()).createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter listener) {
		this.listener = listener;
	}

}
