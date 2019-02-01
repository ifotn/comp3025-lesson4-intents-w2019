package com.infrontofthenet.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView urlTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        urlTextView = findViewById(R.id.urlTextView);
        // get the extra url value using the bundle object
        Bundle extras = getIntent().getExtras();
        String url = extras.getString("url");

        urlTextView.setText(url);

    }

    public void launchUrl(View view) {
        String url = urlTextView.getText().toString();

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}
