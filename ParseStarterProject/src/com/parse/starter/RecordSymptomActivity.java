package com.parse.starter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RecordSymptomActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_symptom);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_record_symptom, menu);
        return true;
    }
}
