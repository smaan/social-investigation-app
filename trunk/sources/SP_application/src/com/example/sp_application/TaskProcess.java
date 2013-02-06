package com.example.sp_application;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TaskProcess extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_process);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_task_process, menu);
		return true;
	}

}
