package com.pawcioo5.plan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Plan_na_dzien_edit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plan_na_dzien_edit);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.plan_na_dzien_edit, menu);
		return true;
	}

}
