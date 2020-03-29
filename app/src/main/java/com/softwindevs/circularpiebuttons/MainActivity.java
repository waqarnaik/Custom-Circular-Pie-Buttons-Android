package com.softwindevs.circularpiebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OnClickAndroid(View view) {
        Toast.makeText(this, "Android Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void OnClickRide(View view) {
        Toast.makeText(this, "Ride Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void OnClickBugs(View view) {
        Toast.makeText(this, "Bugs Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void OnClickFitness(View view) {
        Toast.makeText(this, "Fitness Button Clicked", Toast.LENGTH_SHORT).show();
    }
}
