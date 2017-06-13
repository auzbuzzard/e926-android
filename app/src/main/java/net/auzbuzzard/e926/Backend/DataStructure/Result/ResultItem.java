package net.auzbuzzard.e926.Backend.DataStructure.Result;

/**
 * Created by Austin on 6/12/17.
 */

public interface ResultItem<This extends ResultItem<This, Metadata>, Metadata extends ResultItemMetadata<Metadata>> {
    int getId();
    Metadata getMetadata();
}
