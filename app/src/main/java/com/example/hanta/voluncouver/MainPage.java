package com.example.hanta.voluncouver;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class MainPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button youtubeButton = (Button) findViewById(R.id.Youtube_Button);
        youtubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String youtubeURI = "https://www.youtube.com";
                Uri youtube = Uri.parse(youtubeURI);
                Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, youtube);
                if (youtubeIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(youtubeIntent);
                }
            }
        });

        Button facebookButton = (Button) findViewById(R.id.Facebook_Button);
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String facebookURI = "https://www.facebook.com";
                Uri facebook = Uri.parse(facebookURI);
                Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, facebook);
                if (youtubeIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(youtubeIntent);
                }
            }
        });

        Button googleButton = (Button) findViewById(R.id.Google_Button);
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String googleURI = "https://www.google.ca";
                Uri google = Uri.parse(googleURI);
                Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, google);
                if (youtubeIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(youtubeIntent);
                }
            }
        });


    }

}
