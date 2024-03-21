package com.hippo.camunda.delegates.componsation1;

import java.util.List;
import jakarta.inject.Named;

@Named("lineItems")
public class LineItemsCollectionDelegate {
    public List<String> getItems() {
        return List.of("a","b","c");
    }
    
}
