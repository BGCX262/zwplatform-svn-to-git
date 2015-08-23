package com.zwplatform.framework;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * Used by the base widget to determine how the display areas are mapped 
 * out in the view. Implementing or extending layouts should also extend
 * their version of {@link ILayout.IDisplayAreaAssignments} that will be used by their layouts.
 * 
 * @author uye
 *
 * @param <T>
 */
public interface ILayout<T extends ILayout.IDisplayAreaAssignments> {
	
	/**
	 * The interface is to be used by gin to generate an unnamed class to be used by
	 * the layout. This is just a marker interface and the concrete layout
	 * must know how to use their specific, accompanying, concrete DisplayAreaAssignment.
	 * 
	 * @author uye
	 *
	 */
	public interface IDisplayAreaAssignments{}
	
	public void setDisplayAreaAssignments(T widgets);
	public T getDisplayAreaAssignments();
	
	public IsWidget getRootWidget();
}
