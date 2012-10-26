package com.parse.starter;

import com.parse.ParseUser;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.app.TabActivity;
@SuppressWarnings("deprecation")
public class HomeActivity  extends TabActivity   {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		TabHost tabHost = getTabHost();

		// Tab for Photos
		TabSpec profileTab = tabHost.newTabSpec("Profile");
		// setting Title and Icon for the Tab
		profileTab.setIndicator("Profile", getResources().getDrawable(R.drawable.profileicon));
		Intent profileIntent = new Intent(this, ProfileActivity.class);
		profileTab.setContent(profileIntent);

		// Tab for Songs
		TabSpec recordSymptom = tabHost.newTabSpec("Record Symptom");
		recordSymptom.setIndicator("Record Symptoms", getResources().getDrawable(R.drawable.sickicon));
		Intent recordSymptomIntent = new Intent(this, RecordSymptomActivity.class);
		recordSymptom.setContent(recordSymptomIntent);

		

		// Adding all TabSpec to TabHost
		tabHost.addTab(profileTab); 
		tabHost.addTab(recordSymptom);
		

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_home, menu);
		return true;
	}
}
