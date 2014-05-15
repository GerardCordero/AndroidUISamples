package com.example.gcuiactivityfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public class PlaceholderFragment extends Fragment {
		private TextView fragmentText;
		private EditText fragmentEdit;
				
		public PlaceholderFragment() {
		}

		public void setFragmentTextView(String editString){
			this.fragmentText.setText(editString);
		}
		
		public String getFragmentTextView(){
			return this.fragmentText.getText().toString();
		}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			//Save reference to UI elements
			fragmentText = (TextView) rootView.findViewById(R.id.fragmentTextView);
			fragmentEdit = (EditText) rootView.findViewById(R.id.fragmentEditText);
			fragmentEdit.addTextChangedListener(new TextWatcher(){

				@Override
				public void beforeTextChanged(CharSequence s, int start,
						int count, int after) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onTextChanged(CharSequence s, int start,
						int before, int count) {
					View parentActivity = getActivity().findViewById(R.id.container);
					TextView activityTextView = (TextView) parentActivity.findViewById(R.id.activityTextView);
					if (s.length()>0){
						activityTextView.setText(s.toString());
					} else {
						activityTextView.setText(R.string.activity_default);
					}
				}

				@Override
				public void afterTextChanged(Editable s) {
					// TODO Auto-generated method stub
					
				}});
			return rootView;
		}
	}