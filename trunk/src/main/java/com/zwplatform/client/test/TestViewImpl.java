package com.zwplatform.client.test;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * Sample implementation of {@link TestView}.
 */
public class TestViewImpl extends Composite implements TestView {

	private static HelloViewImplUiBinder uiBinder = GWT.create(HelloViewImplUiBinder.class);

	interface HelloViewImplUiBinder extends UiBinder<Widget, TestViewImpl>
	{
	}

	@UiField SpanElement nameSpan;
	@UiField Anchor goodbyeLink;
	private Presenter listener;
	private String name;

	public TestViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setName(String name)
	{
		this.name = name;
		nameSpan.setInnerText(name);
	}

	@UiHandler("goodbyeLink")
	void onClickGoodbye(ClickEvent e)
	{
		
	}

	@Override
	public void setPresenter(Presenter listener)
	{
		this.listener = listener;
	}

}
