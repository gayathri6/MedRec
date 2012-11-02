package com.parse.starter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.PushService;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseRole;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends Activity {
	private static final String TAG = "Register Activity";

	private static final String YOUR_APPLICATION_ID = "vQyhiWo3htopZhxEX2t7pspvbB2vDRSSuPPAASuX";
	private static final String YOUR_CLIENT_KEY = "JCtAgree2otOnZI1inaziB4tM0RrlNJoZMe5lDJ5";
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
        setContentView(R.layout.activity_register);
    }
    
    /** Register User */
    public void registerUser(View view) {
        
    	//Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editTextUserName = (EditText) findViewById(R.id.reg_username);
        String username = editTextUserName.getText().toString();
        
        EditText editTextPassword = (EditText) findViewById(R.id.reg_password);
        String password = editTextPassword.getText().toString();
    	
        EditText editTextEmail = (EditText) findViewById(R.id.reg_email);
        String email = editTextEmail.getText().toString();
    	
        Spinner rolesSpinner = (Spinner) findViewById(R.id.rolesSpinner);
        String userRole = String.valueOf(rolesSpinner.getSelectedItem());
        
    	final ParseUser user = new ParseUser();
    	user.setUsername(username);
    	user.setPassword(password);
    	user.setEmail(email);
    	 
    	ParseQuery query = ParseRole.getQuery();
    	query.whereEqualTo("name", userRole);
    	query.findInBackground(new FindCallback() {
    	    public void done(List<ParseObject> roles, ParseException e) {
    	        if (e == null) {
    	            ParseRole a = (ParseRole) roles.get(0);
    	            a.getUsers().add(user);
    	        } else {
    	            Log.d("score", "Error: " + e.getMessage());
    	        }
    	    }
    	});
    	
    	/*ParseACL roleACL = new ParseACL();
        ParseRole role = new ParseRole(userRole,roleACL);
        role.getUsers().add(user);*/
        
    	// other fields can be set just like with ParseObject
    	//user.put("phone", "650-253-0000");
		
    	user.signUpInBackground(new SignUpCallback() {
    	  public void done(ParseException e) {
    	    if (e == null) {
    	      // Hooray! Let them use the app now.
    	    	Intent homeIntent = new Intent(getApplicationContext(), PatientHomeActivity.class);
    	    	startActivity(homeIntent);
    	    } else {
    	    	// Sign up didn't succeed. Look at the ParseException to figure out what went wrong
    	    	Toast.makeText(getApplicationContext(), "Login Failed. Incorrect Username/Password.", Toast.LENGTH_SHORT).show();
				Log.d(TAG , e.getMessage());    	    	
    	    }
    	  }
    	});
    }
}
