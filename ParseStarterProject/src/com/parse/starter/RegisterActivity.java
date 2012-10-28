package com.parse.starter;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {
	private static final String TAG = "Register Activity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    	
    	ParseUser user = new ParseUser();
    	user.setUsername(username);
    	user.setPassword(password);
    	user.setEmail(email);
    	 
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
