package com.example.gcintrafragment;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ToggleButton;

	public class IntraFragment extends Fragment {
		private EditText editName;
		private ToggleButton toggle;

		public IntraFragment() {
		}

		@Override
		public void onCreate (Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
		}
		
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			editName = (EditText) rootView.findViewById(R.id.editName);
			toggle = (ToggleButton) rootView.findViewById(R.id.toggleNamePresent);
			editName.addTextChangedListener(new TextWatcher(){

				@Override
				public void beforeTextChanged(CharSequence s, int start,
						int count, int after) {
					// TODO Auto-generated method stub
				}

				@Override
				public void onTextChanged(CharSequence s, int start,
						int before, int count) {
					// TODO Auto-generated method stub
					if (s.toString().length() > 0){
						toggle.setChecked(true);
					} else {
						toggle.setChecked(false);
					}
				}

				@Override
				public void afterTextChanged(Editable s) {
					// TODO Auto-generated method stub
				}
			});
			return rootView;
		}
	}