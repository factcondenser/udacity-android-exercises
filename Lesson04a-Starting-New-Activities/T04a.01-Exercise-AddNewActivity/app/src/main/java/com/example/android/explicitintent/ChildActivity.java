package com.example.android.explicitintent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

// COMPLETED (1) Use Android Studio's Activity wizard to create a new Activity called ChildActivity
public class ChildActivity extends Activity {

    // COMPLETED (6) Create a TextView field to display your message
    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // COMPLETED (7) Get a reference to your TextView in Java
        mMessageTextView = (TextView) findViewById(R.id.tv_message_display);
    }
}
