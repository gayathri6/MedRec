package com.parse.starter;

import java.text.DateFormat;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.Parse;
import com.parse.PushService;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;


public class HelpActivityOLD extends Activity {

	private static final String YOUR_APPLICATION_ID = "vQyhiWo3htopZhxEX2t7pspvbB2vDRSSuPPAASuX";
	private static final String YOUR_CLIENT_KEY = "JCtAgree2otOnZI1inaziB4tM0RrlNJoZMe5lDJ5";
	private static final String TAG = "Help Activity";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
		Log.i(TAG, "Inside help activity");
		setContentView(R.layout.activity_help);
		setTitle(R.string.app_name);
	}

	/*@SuppressLint("NewApi")
	public void saveSymptom(View view){
		Log.i(TAG, "Inside create profile");
		try
		{
			EditText editTextSymptoms = (EditText) findViewById(R.id.symptoms);
			final String symptoms = editTextSymptoms.getText().toString();


			DatePicker symptomDateWidget = (DatePicker) findViewById(R.id.sympDate);
			final String symptomDate = DateFormat.getDateInstance().format(symptomDateWidget.getCalendarView().getDate());



			Spinner doctorRolesSpinner = (Spinner) findViewById(R.id.doctorRolesSpinner);
			final String doctorRole = String.valueOf(doctorRolesSpinner.getSelectedItem());


			ParseObject mySymptom = new ParseObject("UserSymptoms");
			mySymptom.put("symptoms", symptoms);
			mySymptom.put("symptomDate", symptomDate);
			mySymptom.put("doctorRolesSpinner", doctorRole);
			mySymptom.put("user", ParseUser.getCurrentUser());
			mySymptom.saveInBackground();
			Log.i(TAG , "Symptom saved successfully");


		}
		catch(Exception e)
		{
			Log.e(TAG, "Error in saving profile :" + e.getMessage());

		}


	}
*/
}
