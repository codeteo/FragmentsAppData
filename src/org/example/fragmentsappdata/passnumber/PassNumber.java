package org.example.fragmentsappdata.passnumber;

import org.example.fragmentsappdata.R;
import org.example.fragmentsappdata.passnumber.Fragments_A.OnSomethingSelectedListener;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class PassNumber extends FragmentActivity implements OnSomethingSelectedListener {

	private static final String TAG = "passNumberTAG";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.passnumber_main);
		
	}

	@Override
	public void onSomethingSelected(int position) {
		Log.d(TAG, "Give me the result  " + position  );
		position = position +1;
		Log.d(TAG, "Give me the result  " + position  );
		
	}
}
