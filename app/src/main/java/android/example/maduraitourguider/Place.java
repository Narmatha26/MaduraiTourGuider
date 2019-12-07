package android.example.maduraitourguider;


public class Place {

    private String mName;

    private String mLocation;

    private int mGeoLocationId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    Place(String name, String location, int imageResourceId, int geoLocationId) {
        mName = name;
        mLocation = location;
        mImageResourceId = imageResourceId;
        mGeoLocationId = geoLocationId;
    }

    Place(String name, String location, int imageResourceId) {
        mName = name;
        mLocation = location;
        mImageResourceId = imageResourceId;

    }

    public String getName() {
        return mName;
    }

    public String getLocation() {
        return mLocation;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getGeoLocationId() {
        return mGeoLocationId;
    }
}

