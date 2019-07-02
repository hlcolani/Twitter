package com.codepath.apps.restclienttemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ComposeActivity extends AppCompatActivity {

    Button btnTweet;
    EditText tvTweetInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);
        btnTweet = (Button) findViewById(R.id.btnTweet);
        tvTweetInput = (EditText) findViewById(R.id.tvTweetInput);

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
    }
}
