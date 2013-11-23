package org.example.fragmentsappdata.passtext;

import org.example.fragmentsappdata.R;
import org.example.fragmentsappdata.passtext.Fragments_A.OnSomethingSelectedListenerText;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class PassText extends FragmentActivity implements OnSomethingSelectedListenerText {

	private static final String TAG = "mainactivityTAG";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.passtext_main );
		
		
	}

	@Override
	public void passData(int position) {
		Log.d(TAG, "Give me the result  " + position  );
		position = position +1;
		Log.d(TAG, "Give me the result  " + position  );
		
	}
	
	
	public String changeText(String newText )	{
		return newText;
	}

		
	
}
