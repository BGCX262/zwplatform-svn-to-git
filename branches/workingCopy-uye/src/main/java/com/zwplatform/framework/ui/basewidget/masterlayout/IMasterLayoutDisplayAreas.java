package com.zwplatform.framework.ui.basewidget.masterlayout;

import com.google.gwt.user.client.ui.IsWidget;
import com.zwplatform.framework.ILayout;

/**
 * 
 * 
 * ****************************************************
 * *                   First North                    *
 * ****************************************************
 * *                  Second North                    *
 * ****************************************************
 * *         **         Third North         **        *
 * *         *********************************        *
 * *  East   **           Center            **  West  *
 * *         *********************************        *
 * *         **         Third South         **        *
 * ****************************************************
 * *                  Second North                    *
 * ****************************************************
 * *                   First South                    *
 * ****************************************************
 * 
 * Overlay would be on top and cover the entire screen
 * 
 * @author uye
 *
 */
public interface IMasterLayoutDisplayAreas extends ILayout.IDisplayAreaAssignments{
	public IsWidget getNorthWidget();
	public IsWidget getSecondNorthWidget();
	public IsWidget getThirdNorthWidget();
	public IsWidget getSouthWidget();
	public IsWidget getSecondSouthWidget();
	public IsWidget getThirdSouthWidget();
	public IsWidget getEastWidget();
	public IsWidget getWestWidget();
	public IsWidget getCenterWidget();
	public IsWidget getOverlayWidget();
}
