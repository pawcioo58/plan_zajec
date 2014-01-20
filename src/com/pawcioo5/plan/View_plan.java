package com.pawcioo5.plan;

import android.os.Bundle;
import android.os.Parcelable;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class View_plan extends Activity implements OnClickListener {
Button pon,wt,sro,czw,pt,sobota,niedziela;
private MyViewPagerAdapter myAdapter;
private ViewPager myPager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_plan);
		this.myAdapter = new MyViewPagerAdapter();
		this.myPager = (ViewPager) this.findViewById(R.id.viewpager);
		this.myPager.setAdapter(this.myAdapter);
		myPager.setCurrentItem(0);
		pon = (Button) this.findViewById(R.id.Button04);
		
		wt = (Button) findViewById(R.id.Button03);
		sro = (Button) findViewById(R.id.Button02);
		czw = (Button) findViewById(R.id.Button01);
		pt = (Button) findViewById(R.id.button1);
		sobota = (Button) findViewById(R.id.Button05);
		niedziela = (Button) findViewById(R.id.Button06);
		sobota.setVisibility(View.GONE);
		niedziela.setVisibility(View.GONE);
		pon.setOnClickListener(this);
		wt.setOnClickListener(this);
		sro.setOnClickListener(this);
		czw.setOnClickListener(this);
		pt.setOnClickListener(this);
		sobota.setOnClickListener(this);
		niedziela.setOnClickListener(this);
		
	}
	public void onClick(View v) {
czysc_tlo();
		  switch(v.getId()){

		  case R.id.Button04: /** Start a new Activity MyCards.java */
		       pon.setBackgroundResource(R.drawable.button_week_select);	       
		       pon.setPadding(15, 0, 15, 0);
		       pon.setTypeface(null,Typeface.BOLD);
		       myPager.setCurrentItem(0);
		       break;

		  case R.id.Button03: 
			  wt.setBackgroundResource(R.drawable.button_week_select);
			  wt.setPadding(15, 0, 15, 0);
			  wt.setTypeface(null,Typeface.BOLD);
			  myPager.setCurrentItem(1);
		       break;
		  case R.id.Button02: 
			  sro.setBackgroundResource(R.drawable.button_week_select);
			  sro.setPadding(15, 0, 15, 0);
			  sro.setTypeface(null,Typeface.BOLD);
			  myPager.setCurrentItem(2);
		       break;
		  case R.id.Button01: 
			  czw.setBackgroundResource(R.drawable.button_week_select);
			  czw.setPadding(15, 0, 15, 0);
			  czw.setTypeface(null,Typeface.BOLD);
			  myPager.setCurrentItem(3);
		       break;
		  case R.id.button1: 
			  pt.setBackgroundResource(R.drawable.button_week_select);
			  pt.setPadding(15, 0, 15, 0);
			  pt.setTypeface(null,Typeface.BOLD);
			  myPager.setCurrentItem(4);
		       break;
		  case R.id.Button05: 
			  sobota.setBackgroundResource(R.drawable.button_week_select);
			  sobota.setPadding(15, 0, 15, 0);
			  sobota.setTypeface(null,Typeface.BOLD);
			  myPager.setCurrentItem(5);
		       break;
		  case R.id.Button06: 
			  niedziela.setBackgroundResource(R.drawable.button_week_select);
			  niedziela.setPadding(15, 0, 15, 0);
			  niedziela.setTypeface(null,Typeface.BOLD);
			  myPager.setCurrentItem(6);
		       break;
		  }
	}
	private void czysc_tlo() {
		// TODO Auto-generated method stub
		pon.setBackgroundResource(R.drawable.button_week);
		pon.setTypeface(null,Typeface.NORMAL);
		wt.setBackgroundResource(R.drawable.button_week);
		wt.setTypeface(null,Typeface.NORMAL);
		sro.setBackgroundResource(R.drawable.button_week);
		sro.setTypeface(null,Typeface.NORMAL);
		czw.setBackgroundResource(R.drawable.button_week);
		czw.setTypeface(null,Typeface.NORMAL);
		pt.setBackgroundResource(R.drawable.button_week);
		pt.setTypeface(null,Typeface.NORMAL);
		sobota.setBackgroundResource(R.drawable.button_week);
		sobota.setTypeface(null,Typeface.NORMAL);
		niedziela.setBackgroundResource(R.drawable.button_week);
		niedziela.setTypeface(null,Typeface.NORMAL);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		menu.add(0, 1, 0, "Dodaj przedmiot");
		return true;
	}
	@Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch(item.getItemId()) {
           case 1:
        		Intent i = new Intent(getApplicationContext(), Dodawanie_przedmiotow.class);
       		 startActivity(i);
       		 
                return true;
        }

        return super.onMenuItemSelected(featureId, item);
    }
	
	
	
	private class MyViewPagerAdapter<StableArrayAdapter> extends PagerAdapter {

		  
		
		@Override
		public void destroyItem(View collection, int position, Object view) {
			((ViewPager) collection).removeView((View) view);
		}

		
		@Override
		public void finishUpdate(View arg0) {
		}

		@Override
		public int getCount() {
			return 7; // Number of pages usually set with .length() or .size()
		}

		
		

		@Override
		public Object instantiateItem(View collection, int position) {
			final LayoutInflater inflater = (LayoutInflater) View_plan.this
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			//title = new TextView(ViewPagerPlusExpandableListActivity.this);
						switch (position) {
			case 0: // Full ExpandableList code here
				View v = inflater.inflate(R.layout.przedmiot_na_dzien, null, false);
		        TextView text = (TextView) v.findViewById(R.id.textas);
		        text.setText("1");
		       	((ViewPager) collection).addView(v, 0);
					return v;
			case 1: 
				View v2 = inflater.inflate(R.layout.przedmiot_na_dzien, null, false);
				TextView text2 = (TextView) v2.findViewById(R.id.textas);
		        text2.setText("2");
				((ViewPager) collection).addView(v2, 0);
				return v2;
			case 2: 
				View v3 = inflater.inflate(R.layout.przedmiot_na_dzien, null, false);
				TextView text3 = (TextView) v3.findViewById(R.id.textas);
		        text3.setText("3");
				((ViewPager) collection).addView(v3, 0);
				return v3;
			case 3: 
				View v4 = inflater.inflate(R.layout.przedmiot_na_dzien, null, false);
				TextView text4 = (TextView) v4.findViewById(R.id.textas);
		        text4.setText("4");
				((ViewPager) collection).addView(v4, 0);
				return v4;
			case 4: 
				View v5 = inflater.inflate(R.layout.przedmiot_na_dzien, null, false);
				TextView text5 = (TextView) v5.findViewById(R.id.textas);
		        text5.setText("5");
				((ViewPager) collection).addView(v5, 0);
				return v5;
			case 5: 
				View v6 = inflater.inflate(R.layout.przedmiot_na_dzien, null, false);
				TextView text6 = (TextView) v6.findViewById(R.id.textas);
		        text6.setText("6");
				((ViewPager) collection).addView(v6, 0);
				return v6;
			case 6: 
				View v7 = inflater.inflate(R.layout.przedmiot_na_dzien, null, false);
				TextView text7 = (TextView) v7.findViewById(R.id.textas);
		        text7.setText("7");
				((ViewPager) collection).addView(v7, 0);
				return v7;
			
				
			default:
				
				return null;
			}
		}



		public boolean isViewFromObject(View view, Object object) {
			return view == object;
		}

		@Override
		public void restoreState(Parcelable arg0, ClassLoader arg1) {
		}

		@Override
		public Parcelable saveState() {
			return null;
		}

		@Override
		public void startUpdate(View arg0) {
		}

	}

}
