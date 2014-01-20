package com.pawcioo5.plan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Przedmioty_w_dany_dzien extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_przedmioty_w_dany_dzien);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.przedmioty_w_dany_dzien, menu);
		return true;
	}

}
