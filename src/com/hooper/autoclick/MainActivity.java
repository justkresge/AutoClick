package com.hooper.autoclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int Count;
	Button Add;
	TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Count = 0;
        Add = (Button)findViewById(R.id.button);
        text = (TextView)findViewById(R.id.text);
        
    	
        
        Add.setOnClickListener(new View.OnClickListener() {
        	
        
			
				@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Count ++;
				text.setText("Count: " + Count);
				
				while(Count < 10){
					 Add.performClick();
					try {
		        	    Thread.sleep(1000);
		        	} catch(InterruptedException ex) {
		        		
		        	    Thread.currentThread().interrupt();
		        	   
		        	}
					
				}
				}
		});
        
       
        
        
   

    
  
    		
    	
    }
    
}

