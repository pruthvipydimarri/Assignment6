package com.pruthvi.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		final Button CofigPreferences;
		
		CofigPreferences=(Button) findViewById(R.id.ConfigPre);

		CofigPreferences.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	             
	        	 setContentView(R.layout.manage_preferences); 
	        	 //startActivity(new Intent( getApplication(), ManagePrefrences.class) );
	         }
	     });
	}
	
}