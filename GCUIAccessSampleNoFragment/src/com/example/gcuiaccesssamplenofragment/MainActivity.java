package com.example.gcuiaccesssamplenofragment;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	//Private variables for the EditText and TextView
	private EditText mtextInput;
	private TextView mtextOutput;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Obtain reference to EditText and TextView form fields
		mtextInput = (EditText) findViewById(R.id.textInput);
		mtextOutput = (TextView) findViewById(R.id.textOutput);
		//Add a listener
		mtextInput.addTextChangedListener(new TextWatcher(){
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub
				mtextOutput.setText("You Entered: " + mtextInput.getText().toString());
			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}

		});
		
	}


}

