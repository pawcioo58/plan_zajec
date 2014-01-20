package com.pawcioo5.plan;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements AnimationListener {
	private SharedPreferences preferences;
	public static final String MY_PREFERENCES = "myPreferences";
TextView text1;
int in=0,out=0;
Animation animFadein,animFadeout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		preferences = getSharedPreferences(MY_PREFERENCES, Activity.MODE_PRIVATE);
		if(preferences.getString("pierwszy", "1").matches("0")){
			Log.d("plan1","Drugie uruchomienie" + preferences.getString("pierwszy", "1") );
			Intent newActivity = new Intent(getApplicationContext(), View_plan.class);     
            startActivity(newActivity);
            finish();
		}
		else
		{Log.d("plan1","Pierwsze uruchomienie"+ preferences.getString("pierwszy", "1"));
			SharedPreferences.Editor preferencesEditor = preferences.edit();
	        preferencesEditor.putString("pierwszy","0");
	        preferencesEditor.commit();
		text1 = (TextView) findViewById(R.id.textas);

		text1.setVisibility(View.INVISIBLE);
		text1.setText("Witaj w planie zajêæ\n by\n Pawe³ Wróblewski");
		animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
		animFadeout = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);
		animFadein.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				switch(in){
				
				default:	text1.startAnimation(animFadeout);break;
						}
				// text1.startAnimation(animFadeout);
				in++;
			}
		});
		
		animFadeout.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
				}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				switch(out){
				case 1:text1.setText("Dodaj swoje przedmioty.");
				text1.startAnimation(animFadein);
			break;
				case 0:text1.setText("Zanim zaczniesz...");
				text1.startAnimation(animFadein);
			break;
				case 2:text1.setText("Potem stwórz swój plan zajêæ.");
				text1.startAnimation(animFadein);
			break;
				case 3:text1.setText("Zaczynajmy ;D");
				text1.startAnimation(animFadein);
			break;
				case 4:	 Intent intent = new Intent(getApplicationContext(), Dodawanie_przedmiotow.class);
	             startActivity(intent);
	             finish();
	             break;
	             }
				out++;
			}
		});
		 // a.startAnimation(animFadein);
		    text1.startAnimation(animFadein);
		    //a.setVisibility(View.INVISIBLE);
		}
	}
public void btn (View target) {
    //a.startAnimation(animFadeout);
    text1.startAnimation(animFadeout);
    
	
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub
		
	}
	

}
