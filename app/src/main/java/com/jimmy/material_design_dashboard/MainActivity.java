package com.jimmy.material_design_dashboard;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.solver.widgets.Snapshot;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String CALCULATOR_PACKAGE ="com.android.calculator2";
    public static final String CALCULATOR_CLASS ="com.android.calculator2.Calculator";
    CardView homecard,appscard,camaracard,calccard,mapcard,addcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homecard = findViewById(R.id.homecard);
        appscard = findViewById(R.id.appscard);
        camaracard = findViewById(R.id.camaracard);
        calccard = findViewById(R.id.calccard);
        mapcard = findViewById(R.id.mapcard);
        addcard = findViewById(R.id.addcard);

        homecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome Home", Toast.LENGTH_SHORT).show();
            }
        });

        appscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=")));
            }
        });

        camaracard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
            }
        });

        calccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Calculator", Toast.LENGTH_SHORT).show();
            }
        });

        mapcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "http://maps.google.com/maps?saddr=";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        addcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Added", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
