package com.example.smart.dialogfragmentexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by Smart on 04-Dec-17.
 */

public class AlertDFragment extends DialogFragment
{
    public Dialog onCreateDialog (Bundle savedInstanceState)
    {
        return new AlertDialog.Builder(getActivity())
                .setIcon(R.drawable.ic_launcher_background)
                .setTitle("Alert DialogFragment")
                .setMessage("Alert DialogFragment Tutorial")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).create();
    }
}
