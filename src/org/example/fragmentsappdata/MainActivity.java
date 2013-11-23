package org.example.fragmentsappdata;

import org.example.fragmentsappdata.passnumber.PassNumber;
import org.example.fragmentsappdata.passtext.PassText;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
		
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
          
        
        Button passNumber = (Button) findViewById(R.id.passNumber_id);
        passNumber.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this , PassNumber.class);
			    startActivity(intent);
				
			}
		});

        Button passText = (Button) findViewById(R.id.passText_id );
        passText.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this , PassText.class);
			    startActivity(intent);
				
			}
		});

        
	}
	
}
