package com.parse.starter;

import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.Parse;
import com.parse.PushService;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class HelpActivity extends Activity {

	private static final String YOUR_APPLICATION_ID = "vQyhiWo3htopZhxEX2t7pspvbB2vDRSSuPPAASuX";
	private static final String YOUR_CLIENT_KEY = "JCtAgree2otOnZI1inaziB4tM0RrlNJoZMe5lDJ5";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
        setContentView(R.layout.activity_help);
        setTitle(R.string.app_name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.helpmenu, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
      case R.id.profile:
        Intent profileActivity = new Intent(this, ProfileActivity.class);
        startActivity(profileActivity); 
        break;
      default:
        break;
      }
      return true;
      }
    
    public void createProfile(View view){
    	
    	EditText editTextAllergies = (EditText) findViewById(R.id.allergies);
        String allergies = editTextAllergies.getText().toString();
        
        EditText editTextLongTermIllness = (EditText) findViewById(R.id.longTermIllness);
        String longTermIllness = editTextLongTermIllness.getText().toString();
    	
        EditText editTextHeight = (EditText) findViewById(R.id.height);
        String height = editTextHeight.getText().toString();
    	
        EditText editTextWeight = (EditText) findViewById(R.id.weight);
        String weight = editTextWeight.getText().toString();
    	
        DatePicker dobWidget = (DatePicker) findViewById(R.id.dob);
        String dob = dobWidget.toString();
        
        ParseObject myProfile = new ParseObject("Profile");
        myProfile.put(getResources().getString(R.string.allergies), allergies);
        myProfile.put(getResources().getString(R.string.longTermIllness), longTermIllness);
        myProfile.put(getResources().getString(R.string.height), height);
        myProfile.put(getResources().getString(R.string.weight), weight);
        myProfile.put(getResources().getString(R.string.dob), dob);
        ParseUser currentUser = ParseUser.getCurrentUser();
        myProfile.put(getResources().getString(R.string.user), currentUser);
        myProfile.saveInBackground();
        
    }
}
