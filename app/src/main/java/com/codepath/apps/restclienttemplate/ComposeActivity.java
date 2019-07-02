package com.codepath.apps.restclienttemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComposeActivity extends AppCompatActivity {

    Button btnTweet;
    EditText tvTweetInput;
    TextView tvCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
        btnTweet = (Button) findViewById(R.id.btnTweet);
        tvTweetInput = (EditText) findViewById(R.id.tvTweetInput);
        tvCounter = (TextView) findViewById(R.id.tvCounter);

        btnTweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Prepare data intent
                Intent data = new Intent();
                // Pass relevant data back as a result
                data.putExtra("tweet", tvTweetInput.getText().toString());
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish();
            }
        });

        tvTweetInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String charsLeft = Integer.toString(240 - s.length());
                tvCounter.setText(charsLeft + " chars left");

            }
        });
    }
}
