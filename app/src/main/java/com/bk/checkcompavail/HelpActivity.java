package com.bk.checkcompavail;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.bk.computeravailcheck.R;

public class HelpActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help_activity);
		
		// set the help title
		setTitle("Tips");

        Log.i("log message", "hello from chenhan");

    }

}
