package com.pawcioo5.plan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Dodawanie_przedmiotow extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dodawanie_przedmiotow);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dodawanie_przedmiotow, menu);
		return true;
	}
public void Anuluj_btn (View target){
	
	finish();
}

}
