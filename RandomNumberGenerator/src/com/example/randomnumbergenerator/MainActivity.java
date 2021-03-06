package com.example.randomnumbergenerator;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button b = (Button) findViewById(R.id.button);
		final EditText min = (EditText) findViewById(R.id.field);
		final EditText max = (EditText) findViewById(R.id.fieldtwo);
		final TextView o = (TextView) findViewById(R.id.outputs);

		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				int minInt = Integer.valueOf(min.getText().toString());
				int maxInt = Integer.valueOf(max.getText().toString());

				o.setText(String.valueOf(new Random().nextInt(maxInt - minInt)
						+ minInt));
			}

		});
	}
}
