package org.example.fragmentsappdata.passnumber;

import org.example.fragmentsappdata.R;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragments_A extends Fragment {
	  
	protected static final String TAG = "FRAGMENTS_A";
	private OnSomethingSelectedListener listener;

	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a_layout, container, false);
        
        Button button = (Button) view.findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Log.v(TAG, "I'm inside onClick method 1");
            	listener.onSomethingSelected(5);			//pass an Integer
            	Log.v(TAG, "I'm inside onClick method 2");
            }
        });
        
        return view;			//returns view
    }
    
    
    // ********** declare INTERFACE ***************** //
    public interface OnSomethingSelectedListener {			
    		public void onSomethingSelected(int position);
      }        

    

    
    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        
        // This makes sure that the container activity has implemented the callback interface. If not, it throws an exception
        try {
            listener = (OnSomethingSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }
    
    
}