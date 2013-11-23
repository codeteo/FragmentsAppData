package org.example.fragmentsappdata.passtext;


import org.example.fragmentsappdata.R;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragments_A extends Fragment {
	  
	protected static final String TAG = "FRAGMENTS_A";
	private OnSomethingSelectedListenerText listener;

	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.passtext_fragment_a_layout , container, false);
        
        Button button = (Button) view.findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Log.v(TAG, "onClick 1");
            	listener.passData(5);			//pass an Integer
            }
        });
        
        
        Button button2 = (Button) view.findViewById(R.id.button_id_2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Log.v(TAG, "onClick 2");
            	TextView aView = (TextView) getActivity().findViewById(R.id.tv1 );
            	String aText = listener.changeText("Text from Fragment");			//returns a String
            	aView.setText(aText);
            }
        });
        
        
        return view;			//returns view
    }
    
       
    
    
    // ********** declare INTERFACE ***************** //
    public interface OnSomethingSelectedListenerText {			
    		public void passData(int position);			// 2 methods, one to pass integer and the 2nd for a string
    		public String changeText(String newText);
      }        

    

    
    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        
        // This makes sure that the container activity has implemented the callback interface. If not, it throws an exception
        try {
            listener = (OnSomethingSelectedListenerText) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }
    
    
}