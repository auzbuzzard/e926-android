package net.auzbuzzard.e926.Backend.DataStructure.Result;

import java.util.ArrayList;

/**
 * Created by Austin on 6/12/17.
 */

public class ListResult implements ResultListable<ListResult, ImageResult> {

    // Properties

    ArrayList<ImageResult> results = new ArrayList<>();

    // Methods

    @Override
    public ArrayList<ImageResult> getResults() {
        return results;
    }

    @Override
    public void setResults(ArrayList<ImageResult> results) {
        this.results = results;
    }

    void add(ArrayList<ImageResult> result) {
        this.results.addAll(result);
    }

    void add(ListResult result) {
        this.add(result.results);
    }
}
