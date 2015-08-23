package com.zwplatform.client.test;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceTokenizer;

/**
 * A place object representing a particular state of the UI. A Place can be converted to and from a
 * URL history token by defining a {@link PlaceTokenizer} for each {@link Place}, and the 
 * {@link PlaceHistoryHandler} automatically updates the browser URL corresponding to each 
 * {@link Place} in your app.
 */

public class TestPlace extends Place{
  
	/**
	 * Sample property (stores token). 
	 */
	private String name;

	public TestPlace() {
		name="";		
	}
	public TestPlace(String token) {
		this.name = token;
	}

	public String getName() {
		return name;
	}

	/**
	 * PlaceTokenizer knows how to serialize the Place's state to a URL token.
	 */
	public static class Tokenizer implements PlaceTokenizer<TestPlace> {

		@Override
		public String getToken(TestPlace place) {
			return place.getName();
		}

		@Override
		public TestPlace getPlace(String token) {
			return new TestPlace(token);
		}

	}
}
