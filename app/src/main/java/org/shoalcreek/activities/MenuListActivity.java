package org.shoalcreek.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.shoalcreek.R;

public class MenuListActivity extends AppCompatActivity {

    private String targetEmail = "info@shoalcreek.org";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.training_tips).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent( MenuListActivity.this, TrainingAndTipsActivity.class));
            }
        });

        findViewById(R.id.discovery_process).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( MenuListActivity.this, DiscoveryProcessActivity.class));
            }
        });

        findViewById(R.id.reading_plans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent( MenuListActivity.this, ReadingPlansActivity.class));
            }
        });

        findViewById(R.id.feedback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                String[] recipients={targetEmail};
                emailIntent.putExtra(Intent.EXTRA_EMAIL, recipients);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Discovery Group Feedback");
                emailIntent.setType("text/plain");
                startActivity(emailIntent);
            }
        });


    }

}
