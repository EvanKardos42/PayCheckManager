package kardos.engima.paycheckmanager;

import android.provider.BaseColumns;

public final class DatabaseContract {

    public DatabaseContract(){}

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry.db";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COLOR = "color";
        public static final String COLUMN_NAME_PERCENTAGE = "percentage";
    }
}
