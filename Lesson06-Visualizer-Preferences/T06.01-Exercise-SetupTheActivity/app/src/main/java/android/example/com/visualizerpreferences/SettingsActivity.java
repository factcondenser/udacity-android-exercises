package android.example.com.visualizerpreferences;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

// COMPLETED (1) Create a new Empty Activity named SettingsActivity; make sure to generate the
// activity_settings.xml layout file as well and add the activity to the manifest
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
// TECHNICALLY DON'T NEED THE FOLLOWING, BUT IS EXTRA VERBOSE TO SHOW EXACTLY WHAT'S GOING ON
//        ActionBar actionBar = this.getSupportActionBar();
//        if (actionBar != null) {
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        }
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == R.id.home) {
//            NavUtils.navigateUpFromSameTask(this);
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
