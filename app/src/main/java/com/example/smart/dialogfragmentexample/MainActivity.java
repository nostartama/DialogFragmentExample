package com.example.smart.dialogfragmentexample;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button dfrag;
    Button alertdfragbutton;
    FragmentManager fm = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dfrag = (Button) findViewById(R.id.bt_dfrag);
        alertdfragbutton = (Button) findViewById(R.id.bt_alertdfrag);

        dfrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DFragment dFragment = new DFragment();
                dFragment.show(fm, "Dialog Fragment");
            }
        });

        alertdfragbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDFragment alertDFragment = new AlertDFragment();
                alertDFragment.show(fm, "Alert Dialog Fragment");
            }
        });
    }
}
