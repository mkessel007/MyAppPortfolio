package com.mjkessel.android.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSpotify).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onClickToast(v);
            }
        });

        findViewById(R.id.btnScoreapp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onClickToast(v);
            }
        });

        findViewById(R.id.btnLibraryapp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onClickToast(v);
            }
        });

        findViewById(R.id.btnBuildbigger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onClickToast(v);
            }
        });

        findViewById(R.id.btnXyzreader).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onClickToast(v);
            }
        });

        findViewById(R.id.btnCapstonemyapp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onClickToast(v);
            }
        });
    }

    private void onClickToast(View v) {
        switch (v.getId()) {
            case R.id.btnSpotify:
                Toast.makeText(this, "This button will launch my Spotify Streamer app!", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnScoreapp:
                Toast.makeText(this, "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnLibraryapp:
                Toast.makeText(this, "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnBuildbigger:
                Toast.makeText(this, "This button will launch my Build it Bigger app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnXyzreader:
                Toast.makeText(this, "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnCapstonemyapp:
                Toast.makeText(this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
