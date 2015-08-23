package com.zwplatform.client.inspector;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * A place object representing a particular state of the UI. A Place can be converted to and from a
 * URL history token by defining a {@link PlaceTokenizer} for each {@link Place}, and the 
 * {@link PlaceHistoryHandler} automatically updates the browser URL corresponding to each 
 * {@link Place} in your app.
 */

public class InspectorPlace extends Place{
  
	/**
	 * Sample property (stores token). 
	 */
	private String name;

	public InspectorPlace() {
		name="";		
	}
	public InspectorPlace(String token) {
		this.name = token;
	}

	public String getName() {
		return name;
	}

	/**
	 * PlaceTokenizer knows how to serialize the Place's state to a URL token.
	 */
	public static class Tokenizer implements PlaceTokenizer<InspectorPlace> {

		@Override
		public String getToken(InspectorPlace place) {
			return place.getName();
		}

		@Override
		public InspectorPlace getPlace(String token) {
			return new InspectorPlace(token);
		}

	}
}
