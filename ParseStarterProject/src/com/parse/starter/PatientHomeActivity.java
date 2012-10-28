package com.parse.starter;

import com.parse.ParseUser;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class PatientHomeActivity  extends Activity   {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_patient_home);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.patientmenu, menu);
		return true;
	}
	
	 @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	      switch (item.getItemId()) {
	      case R.id.profile:
	        Intent profileActivity = new Intent(this, ProfileActivity.class);
	        startActivity(profileActivity); 
	        break;
	      case R.id.help:
		        Intent helpActivity = new Intent(this, HelpActivity.class);
		        startActivity(helpActivity); 
		        break;
	      default:
	        break;
	      }
	      return true;
	      }
}
