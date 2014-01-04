package org.michenux.yourappidea.aroundme;

import android.content.UriMatcher;
import android.net.Uri;

import org.michenux.drodrolib.db.AbstractContentProvider;

public class CityContentProvider extends AbstractContentProvider {

    public static final String TABLE_NAME = "T_CITY";
    public static final String NAME_COLUMN = "NAME";
    public static final String COUNTRY_COLUMN = "COUNTRY";
    public static final String LONGITUDE_COLUMN = "LONGITUDE";
    public static final String LATITUDE_COLUMN = "LATITUDE";

    private static final String AUTHORITY = "org.michenux.yourappidea.cities";
    private static final String BASE_PATH = "cities";

    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + BASE_PATH);

    protected static final UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        uriMatcher.addURI(AUTHORITY, BASE_PATH, LIST);
        uriMatcher.addURI(AUTHORITY, BASE_PATH + "/#", ITEM_ID);
    }

    public CityContentProvider() {
        super(TABLE_NAME, uriMatcher, BASE_PATH );
    }
}
