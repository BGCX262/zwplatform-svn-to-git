package com.zwplatform.framework;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.zwplatform.client.test.TestPlace;

/**
 * PlaceHistoryMapper interface is used to attach all places which the
 * PlaceHistoryHandler should be aware of. This is done via the @WithTokenizers
 * annotation or by extending PlaceHistoryMapperWithFactory and creating a
 * separate TokenizerFactory.
 */
@WithTokenizers( { TestPlace.Tokenizer.class })
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
