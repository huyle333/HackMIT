package com.example.hackmit;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class LoginPage extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);
		
		Parse.initialize(this, "ZF3tzb2RBU4J5PYLlVxgnlMGHa3SWkRAoI6Y2OAN", "34XmgZk4QgkOPqdStKzn3tNHQyNWoW5AeeEighYP");
		
		//Is current user an anonymous user or not?
		if (ParseAnonymousUtils.isLinked(ParseUser.getCurrentUser())){
			
		}else{
			// If current user is not an anonymous user
			ParseUser currentUser = ParseUser.getCurrentUser();
			if (currentUser != null){
				// Send the logged in user to the MainActivity.class
				Intent intent = new Intent(LoginPage.this, MainActivity.class);
				startActivity(intent);
				finish();
			}else{
				
			}
		}
	}

}
