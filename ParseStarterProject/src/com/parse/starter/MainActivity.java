package com.parse.starter;

import com.parse.LogInCallback;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseRole;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


	/** Called when the activity is first created. */
	@Override

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ParseUser currentUser = ParseUser.getCurrentUser();
		if (currentUser.getUsername() != null) {
			// do stuff with the user
			Intent homeActivity = new Intent(this, HomeActivity.class);
			startActivity(homeActivity);
		} else {
			// Show the sign up or login screen
			Intent intent = new Intent(this, LoginActivity.class);
			startActivity(intent);
		} 
/*
		ParseACL roleDoctorACL = new ParseACL();
		roleDoctorACL.setPublicReadAccess(true);
		ParseRole roleDoctor = new ParseRole("Doctor", roleDoctorACL);
		final Intent intent = new Intent(this, HomeActivity.class);
		roleDoctor.saveInBackground(new SaveCallback() {
			public void done(ParseException e) {
				// Now let's update it with some new data. In this case, only cheatMode and score
				// will get sent to the Parse Cloud. playerName hasn't changed.

				startActivity(intent);
			}
		});

		ParseACL roleDoctorPhyACL = new ParseACL();
		roleDoctorPhyACL.setPublicReadAccess(true);
		ParseRole roleDoctorPhy = new ParseRole("Physician", roleDoctorPhyACL);
		roleDoctorPhy.saveInBackground();

		ParseACL roleDoctorPedACL = new ParseACL();
		roleDoctorPedACL.setPublicReadAccess(true);
		ParseRole roleDoctorPed = new ParseRole("Pediatrician", roleDoctorPedACL);
		roleDoctorPed.saveInBackground();

		ParseACL roleDoctorCardACL = new ParseACL();
		roleDoctorCardACL.setPublicReadAccess(true);
		ParseRole roleDoctorCard = new ParseRole("Cardiologist", roleDoctorCardACL);
		roleDoctorCard.saveInBackground();

		ParseACL roleDoctorGastroACL = new ParseACL();
		roleDoctorGastroACL.setPublicReadAccess(true);
		ParseRole roleDoctorGastro = new ParseRole("Gastrologist", roleDoctorGastroACL);
		roleDoctorGastro.saveInBackground();

		ParseACL roleDoctorGynaeACL = new ParseACL();
		roleDoctorGynaeACL.setPublicReadAccess(true);
		ParseRole roleDoctorGynae = new ParseRole("Gynecologist", roleDoctorGynaeACL);
		roleDoctorGynae.saveInBackground();

		ParseACL roleDoctorPathACL = new ParseACL();
		roleDoctorPathACL.setPublicReadAccess(true);
		ParseRole roleDoctorPath = new ParseRole("Pathologist", roleDoctorPathACL);
		roleDoctorPath.saveInBackground();

		ParseACL roleDoctorOrthACL = new ParseACL();
		roleDoctorOrthACL.setPublicReadAccess(true);
		ParseRole roleDoctorOrth = new ParseRole("Orthopedist", roleDoctorOrthACL);
		roleDoctorOrth.saveInBackground();

		ParseACL roleDoctorOpthACL = new ParseACL();
		roleDoctorOpthACL.setPublicReadAccess(true);
		ParseRole roleDoctorOpth = new ParseRole("Ophthalmologist", roleDoctorOpthACL);
		roleDoctorOpth.saveInBackground();

		ParseACL roleDoctorDentACL = new ParseACL();
		roleDoctorDentACL.setPublicReadAccess(true);
		ParseRole roleDoctorDent = new ParseRole("Dentist", roleDoctorDentACL);
		roleDoctorDent.saveInBackground();

		ParseACL roleDoctorDermACL = new ParseACL();
		roleDoctorDermACL.setPublicReadAccess(true);
		ParseRole roleDoctorDerm = new ParseRole("Dermatologist", roleDoctorDermACL);
		roleDoctorDerm.saveInBackground();

		roleDoctor.getRoles().add(roleDoctorDerm);
		roleDoctor.getRoles().add(roleDoctorDent);
		roleDoctor.getRoles().add(roleDoctorOpth);
		roleDoctor.getRoles().add(roleDoctorOrth);
		roleDoctor.getRoles().add(roleDoctorPath);
		roleDoctor.getRoles().add(roleDoctorGynae);
		roleDoctor.getRoles().add(roleDoctorGastro);
		roleDoctor.getRoles().add(roleDoctorCard);
		roleDoctor.getRoles().add(roleDoctorPed);
		roleDoctor.getRoles().add(roleDoctorPhy);
		roleDoctor.saveInBackground();

		 */
/*
		ParseACL rolePatientACL = new ParseACL();
		rolePatientACL.setPublicReadAccess(true);
		ParseRole rolePatient = new ParseRole("Patient", rolePatientACL);
		final Intent intent = new Intent(this, HomeActivity.class);
		rolePatient.saveInBackground(new SaveCallback() {
			public void done(ParseException e) {
				// Now let's update it with some new data. In this case, only cheatMode and score
				// will get sent to the Parse Cloud. playerName hasn't changed.

				startActivity(intent);
			}
		}); */

	}
}