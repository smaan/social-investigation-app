package com.example.sp_application;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Loading extends Activity {
	private Timer myTimer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);
		
		myTimer = new Timer();
	    myTimer.schedule(new TimerTask() {          
	        @Override
	        public void run() {
	            TimerMethod();
	        }

	    }, 1000);//Delay in ms
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_loading, menu);
		return true;
	}

	public void goToLogin(View view){
		Intent intent = new Intent(this, LoginActivity.class);
	    startActivity(intent);
	}
	
	private void TimerMethod()
	{
	    //This method is called directly by the timer
	    //and runs in the same thread as the timer.

	    //We call the method that will work with the UI
	    //through the runOnUiThread method.
		Intent intent = new Intent(this, LoginActivity.class);
	    startActivity(intent);
	}
}
