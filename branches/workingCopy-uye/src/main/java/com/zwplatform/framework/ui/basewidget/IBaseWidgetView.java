package com.zwplatform.framework.ui.basewidget;

import com.google.gwt.user.client.ui.IsWidget;
import com.zwplatform.framework.Presenter;

/**
 * View base interface.
 * Extends IsWidget so a view impl can easily provide its container widget.
 */
public interface IBaseWidgetView extends IsWidget {
  
	void setPresenter(Presenter listener);
}
