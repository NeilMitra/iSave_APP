package com.example.eyecane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void eyecaneca(View view) {
        openURL("https://itsalmo.st/time-for-isave-d9zy");

    }

    public void openURL(String url){
        Uri uri=Uri.parse(url);
        Intent launchWeb=new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchWeb);
    }

    //Instagram starts here

    public void instagram(View view) {
        openURL2("https://www.instagram.com/eye.cane/");

    }

    public void openURL2(String url2){
        Uri uri=Uri.parse(url2);
        Intent launchWeb2=new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchWeb2);
    }
}
