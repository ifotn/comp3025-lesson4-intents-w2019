package com.infrontofthenet.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText urlEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate edittext
        urlEditText = findViewById(R.id.urlEditText);
    }

    public void showSecondActivity(View view) {
        // instantiate new explicit intent
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        // get url entered and store in an extra to be passed to the next activity
        intent.putExtra("url", urlEditText.getText().toString());

        // launch new activity with the above intent
        startActivity(intent);
    }
}
