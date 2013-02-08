package com.example.sp_application;


import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.android.maps.MapActivity;

public class TaskProjectActivity extends MapActivity {
	
	private String[] Time_vars = {"1:00 - 2:00", "2:00 - 3:00", "3:00 - 4:00", "4:00 - 5:00"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_project);
		
		this.setTitle("Task 1"); //Here will be current task name
		
		ImageView mimageView = (ImageView) findViewById(R.id.imageView1);
		mimageView.setImageResource(R.drawable.logo);
		
		// Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Time_vars);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.setAdapter(adapter);
        
        spinner.setPrompt("Выберите время");
        
        //spinner.setSelection(2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_task_project, menu);
		return true;
	}
	
	@Override
    protected boolean isRouteDisplayed() {
        return false;
    }

}
