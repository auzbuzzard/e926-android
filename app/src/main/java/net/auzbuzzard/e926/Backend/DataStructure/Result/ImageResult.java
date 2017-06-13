package net.auzbuzzard.e926.Backend.DataStructure.Result;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Austin on 6/12/17.
 */

public class ImageResult implements ResultItem<ImageResult, ImageResult.Metadata> {

    // Properties

    private Metadata metadata = new Metadata();

    // Getters and Setters

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public Metadata getMetadata() {
        return metadata;
    }

    // Class Declarations

    public class Metadata implements ResultItemMetadata<Metadata> {
        // Properties
        int id;
        String author;
        String tags;
        String status;

        String file_url;
        String file_ext;
        int file_size;

        int width, height;
        int score, fav_count;
        String rating;

        int creator_id;
        int sample_width, sample_height, preview_width, preview_height;
        String sample_url, preview_url;

        ArrayList<String> artist;

        // Computed Properties
        ArrayList<String> getTagsAsArray() {
            return tags != null ? new ArrayList<>(Arrays.asList(tags.split(" "))) : null;

        }

        Metadata_Status getStatusAsEnum() {
            return status != null ? Metadata_Status.valueOf(status) : null;
        }

        Metadata_File_Ext getFileExtAsEnum() {
            return file_ext != null ? Metadata_File_Ext.valueOf(file_ext) : null;
        }

        Metadata_Rating getRatingAsEnum() {
            return rating != null ? Metadata_Rating.valueOf(rating) : null;
        }

        // Convenience Methods
        int getWidthForSize(Metadata_ImageSize size) {
            switch (size) {
                case file:
                    return width;
                case sample:
                    return sample_width;
                case preview:
                    return preview_width;
                default:
                    return sample_width;
            }
        }

        int getHeightForSize(Metadata_ImageSize size) {
            switch (size) {
                case file:
                    return height;
                case sample:
                    return sample_height;
                case preview:
                    return preview_height;
                default:
                    return sample_height;
            }
        }
    }

    public enum Metadata_Status {
        active, flagged, pending, deleted;
    }

    public enum Metadata_File_Ext {
        jpg, png, gif, swf, webm;
    }

    public enum Metadata_ImageSize {
        file, sample, preview;
    }

    public enum Metadata_Rating {
        s, q, e;
    }

}
