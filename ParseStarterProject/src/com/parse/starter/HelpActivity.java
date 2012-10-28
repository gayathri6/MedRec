package com.parse.starter;

import com.parse.ParseObject;
import com.parse.ParseUser;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class HelpActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
       
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
