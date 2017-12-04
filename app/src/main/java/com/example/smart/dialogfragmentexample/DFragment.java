package com.example.smart.dialogfragmentexample;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Smart on 04-Dec-17.
 */

public class DFragment extends DialogFragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.dialogfragment, container, false);
        getDialog().setTitle("DialogFragment Tutorial");
        return rootView;
    }
}
