package com.example.android.waitlist.data;

import android.provider.BaseColumns;

import com.example.android.waitlist.R;

public class WaitlistContract {
    // COMPLETED (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    private class WaitListEntry implements BaseColumns {
        // COMPLETED (2) Inside create a static final members for the table name and each of the db columns
        final String TABLE_NAME = "waitlist";
        final String COLUMN_GUEST_NAME = "guestName";
        final String COLUMN_PARTY_SIZE = "partySize";
        final String COLUMN_TIMESTAMP = "timestamp";
    }
}
