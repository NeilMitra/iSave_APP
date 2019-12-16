package com.example.eyecane;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.PermissionStep;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class scrollActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //fragment 1
        addFragment(new Step.Builder().setTitle("Business Sign-Up")
                .setContent("Upload their Ads")
                .setBackgroundColor(Color.parseColor("#342f78")) // int background color
                .setDrawable(R.drawable.gallery_img01) // int top drawable
                .setSummary("Viewed by consumers")
                .build());
        // Permission Step


        //fragment 2
        addFragment(new Step.Builder().setTitle("Router Networks")
                .setContent("Mass Foot-traffic")
                .setBackgroundColor(Color.parseColor("#342f78")) // int background color
                .setDrawable(R.drawable.gallery_img02) // int top drawable
                .setSummary("Free WiFi using iSave")
                .build());
        // Permission Step

        //fragment 3
        addFragment(new Step.Builder().setTitle("Business Analytics")
                .setContent("Allows Businesses to see consumer growth")
                .setBackgroundColor(Color.parseColor("#342f78")) // int background color
                .setDrawable(R.drawable.gallery_img03) // int top drawable
                .setSummary("Monitor their ROMI")
                .build());
        // Permission Step


        //fragment 4
        addFragment(new Step.Builder().setTitle("Real-Time Ads")
                .setContent("Allows people to see latest deals")
                .setBackgroundColor(Color.parseColor("#342f78")) // int background color
                .setDrawable(R.drawable.gallery_img04) // int top drawable
                .setSummary("Increasing Business-Customer relations")
                .build());
        // Permission Step


        //fragment 5
        addFragment(new Step.Builder().setTitle("Customer Personalization")
                .setContent("Personalized Ads")
                .setBackgroundColor(Color.parseColor("#342f78")) // int background color
                .setDrawable(R.drawable.gallery_img05) // int top drawable
                .setSummary("Using Open Mesh and A.I.")
                .build());
        // Permission Step


        //fragment 6
        addFragment(new Step.Builder().setTitle("Customer Attraction")
                .setContent("Connects consumer with Business")
                .setBackgroundColor(Color.parseColor("#342f78")) // int background color
                .setDrawable(R.drawable.gallery_img06) // int top drawable
                .setSummary("No Flyers, No Hassles, Best Outcome. ")
                .build());

    }

    @Override
    public void currentFragmentPosition(int position) {

    }
}
