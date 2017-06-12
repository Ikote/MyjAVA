package com.ikey.testme;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.TextView;

import com.ikey.testme.R;

public class ResultActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		//get rating bar object
		RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1); 
		bar.setNumStars(5);
		bar.setStepSize(0.5f);
		//get text view
		TextView t=(TextView)findViewById(R.id.textResult);
		//get score
		Bundle b = getIntent().getExtras();
		int score= b.getInt("score");
		//display score
		bar.setRating(score);
		switch (score)
		{
			case 0: t.setText("Sorry; you failed to get even one correct answer. Please read your Bible more often.");
				break;
		case 1:
		case 2: t.setText("Sorry; your score is below average. Read your Bible and try again.");
		break;
		case 3:
		case 4:t.setText("Your score is average. Good try.");
		break;
		case 5:t.setText("Your score is EXCELLENT! Congratulations!");
		break;
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_result, menu);
		return true;
	}
}
