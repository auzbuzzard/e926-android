package net.auzbuzzard.e926.Backend.DataStructure.Result;

import java.util.ArrayList;

/**
 * Created by Austin on 6/12/17.
 */

public interface ResultListable<This extends ResultListable<This, Item>, Item extends ResultItem<Item>> {
    ArrayList<Item> getResults();
    void setResults(ArrayList<Item> results);
}
