package com.example.cynth.test;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Mood Tracker");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        Button submit = (Button) findViewById(R.id.submit);
        final TextView ratingDisplayTextView = (TextView) findViewById(R.id.rating_display_text_View);
        final ImageView imgView=(ImageView) findViewById(R.id.imgView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingDisplayTextView.setText("Your rating is: "+ ratingBar.getRating());
                if(ratingBar.getRating()==0) {
                    imgView.setImageResource(R.drawable.stem);
                } else if(ratingBar.getRating()>0 && ratingBar.getRating()<2) {
                    imgView.setImageResource(R.drawable.sadflower);
                } else if (ratingBar.getRating()>=2 && ratingBar.getRating()<3) {
                    imgView.setImageResource(R.drawable.sadishflower);
                } else if (ratingBar.getRating()>=3 && ratingBar.getRating()<4) {
                    imgView.setImageResource(R.drawable.okflower);
                } else if (ratingBar.getRating()>=4 && ratingBar.getRating()<=5) {
                    imgView.setImageResource(R.drawable.happyflower);
                }



            }

        });






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
