package com.parse.starter;

import com.parse.ParseUser;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DoctorHomeActivity  extends Activity   {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_doctor_home);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.doctormenu, menu);
		return true;
	}
	
	 @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	      switch (item.getItemId()) {
	      case R.id.diagnosis:
	        Intent diagnosisActivity = new Intent(this, DiagnosisActivity.class);
	        startActivity(diagnosisActivity); 
	        break;
	      default:
	        break;
	      }
	      return true;
	      }
}
