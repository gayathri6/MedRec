package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseRole;
import com.parse.PushService;
import com.parse.ParseUser;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.parse.PushService;

public class MainActivity extends Activity {

	private static final String YOUR_APPLICATION_ID = "vQyhiWo3htopZhxEX2t7pspvbB2vDRSSuPPAASuX";
	private static final String YOUR_CLIENT_KEY = "JCtAgree2otOnZI1inaziB4tM0RrlNJoZMe5lDJ5";

	/** Called when the activity is first created. */
	@Override

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
		PushService.subscribe(this, "", MainActivity.class);
		
		ParseUser currentUser = ParseUser.getCurrentUser();
		ParseACL.setDefaultACL(new ParseACL(), true);
		if (currentUser.getUsername() != null) {
			// do stuff with the user
			
			Intent homeActivity = new Intent(this, PatientHomeActivity.class);
			startActivity(homeActivity);
		} else {
			// Show the sign up or login screen
			Intent intent = new Intent(this, LoginActivity.class);
			startActivity(intent);
		} 

		/*//Doctor Roles
		ParseACL roleDoctorACL = new ParseACL();
		roleDoctorACL.setPublicReadAccess(true);
		roleDoctorACL.setPublicWriteAccess(true);
		ParseRole roleDoctor = new ParseRole("Doctor", roleDoctorACL);
		roleDoctor.saveInBackground();

		ParseACL roleDoctorPhyACL = new ParseACL();
		roleDoctorPhyACL.setPublicReadAccess(true);
		roleDoctorPhyACL.setPublicWriteAccess(true);
		ParseRole roleDoctorPhy = new ParseRole("Physician", roleDoctorPhyACL);
		roleDoctorPhy.saveInBackground();

		ParseACL roleDoctorPedACL = new ParseACL();
		roleDoctorPedACL.setPublicReadAccess(true);
		roleDoctorPedACL.setPublicWriteAccess(true);
		ParseRole roleDoctorPed = new ParseRole("Pediatrician", roleDoctorPedACL);
		roleDoctorPed.saveInBackground();

		ParseACL roleDoctorCardACL = new ParseACL();
		roleDoctorCardACL.setPublicReadAccess(true);
		roleDoctorCardACL.setPublicWriteAccess(true);
		ParseRole roleDoctorCard = new ParseRole("Cardiologist", roleDoctorCardACL);
		roleDoctorCard.saveInBackground();

		ParseACL roleDoctorGastroACL = new ParseACL();
		roleDoctorGastroACL.setPublicReadAccess(true);
		roleDoctorGastroACL.setPublicWriteAccess(true);
		ParseRole roleDoctorGastro = new ParseRole("Gastrologist", roleDoctorGastroACL);
		roleDoctorGastro.saveInBackground();

		ParseACL roleDoctorGynaeACL = new ParseACL();
		roleDoctorGynaeACL.setPublicReadAccess(true);
		roleDoctorGynaeACL.setPublicWriteAccess(true);
		ParseRole roleDoctorGynae = new ParseRole("Gynecologist", roleDoctorGynaeACL);
		roleDoctorGynae.saveInBackground();

		ParseACL roleDoctorPathACL = new ParseACL();
		roleDoctorPathACL.setPublicReadAccess(true);
		roleDoctorPathACL.setPublicWriteAccess(true);
		ParseRole roleDoctorPath = new ParseRole("Pathologist", roleDoctorPathACL);
		roleDoctorPath.saveInBackground();

		ParseACL roleDoctorOrthACL = new ParseACL();
		roleDoctorOrthACL.setPublicReadAccess(true);
		roleDoctorOrthACL.setPublicWriteAccess(true);
		ParseRole roleDoctorOrth = new ParseRole("Orthopedist", roleDoctorOrthACL);
		roleDoctorOrth.saveInBackground();

		ParseACL roleDoctorOpthACL = new ParseACL();
		roleDoctorOpthACL.setPublicReadAccess(true);
		roleDoctorOpthACL.setPublicWriteAccess(true);
		ParseRole roleDoctorOpth = new ParseRole("Ophthalmologist", roleDoctorOpthACL);
		roleDoctorOpth.saveInBackground();

		ParseACL roleDoctorDentACL = new ParseACL();
		roleDoctorDentACL.setPublicReadAccess(true);
		roleDoctorDentACL.setPublicWriteAccess(true);
		ParseRole roleDoctorDent = new ParseRole("Dentist", roleDoctorDentACL);
		roleDoctorDent.saveInBackground();

		ParseACL roleDoctorDermACL = new ParseACL();
		roleDoctorDermACL.setPublicReadAccess(true);
		roleDoctorDermACL.setPublicWriteAccess(true);
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

		//Patient Role
		ParseACL rolePatientACL = new ParseACL();
		rolePatientACL.setPublicReadAccess(true);
		rolePatientACL.setPublicWriteAccess(true);
		ParseRole rolePatient = new ParseRole("Patient", rolePatientACL);
		rolePatient.saveInBackground();*/
		 

	}
}