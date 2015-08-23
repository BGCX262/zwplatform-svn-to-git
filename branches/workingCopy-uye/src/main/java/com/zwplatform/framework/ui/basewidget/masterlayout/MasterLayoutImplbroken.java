package com.zwplatform.framework.ui.basewidget.masterlayout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.zwplatform.framework.ILayout;
import com.zwplatform.framework.Presenter;
import com.zwplatform.framework.ui.basewidget.BaseViewImpl;
import com.zwplatform.framework.ui.basewidget.IBaseWidgetView;

/**
 * The default concrete implementation of {@link ILayout} that is based on the
 * the display area assignments laid out on
 * http://code.google.com/webtoolkit/doc/1.6/DevGuideUserInterface.html
 * 
 * @author uye
 * 
 */
public class MasterLayoutImplbroken extends Composite implements IBaseWidgetView, ILayout<IMasterLayoutDisplayAreas> {

	
	private IMasterLayoutDisplayAreas displayAreaAssignments;
	private SimplePanel rootPanel = new SimplePanel();

	public MasterLayoutImplbroken() {
//		initWidget(binder.createAndBindUi(this));
	}
	
	public void init() {
		if (null != displayAreaAssignments) {
		}
	}

	@Override
	public void setDisplayAreaAssignments(IMasterLayoutDisplayAreas widgets) {
		displayAreaAssignments = widgets;
		init();
	}

	@Override
	public IMasterLayoutDisplayAreas getDisplayAreaAssignments() {
		return displayAreaAssignments;
	}

	@Override
	public IsWidget getRootWidget() {
		return rootPanel;
	}

	@Override
	public void setPresenter(Presenter listener) {
		// TODO Auto-generated method stub
		
	}

}
