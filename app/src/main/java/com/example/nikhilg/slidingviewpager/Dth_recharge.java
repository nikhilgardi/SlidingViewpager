package com.example.nikhilg.slidingviewpager;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.MenuItem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;


public class Dth_recharge extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        final String[] dth_operator;
        Spinner spinner;
        //e1=(EditText) findViewById(R.id.username);
        if (container == null) {
            // We have different layouts, and in one of them this
            // fragment's containing frame doesn't exist.  The fragment
            // may still be created from its saved state, but there is
            // no reason to try to create its view hierarchy because it
            // won't be displayed.  Note this is not needed -- we could
            // just run the code below, where we would create and return
            // the view hierarchy; it would just never be used.
            return null;
        }

        //return (RelativeLayout)inflater.inflate(R.layout.activity_welcome, container, false);
        View root = inflater.inflate(R.layout.activity_dth_recharge, container, false);
        dth_operator=getResources().getStringArray(R.array.dth_operator);
        spinner=(Spinner) root.findViewById(R.id.spinner);
        ArrayAdapter<String> dataAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item,dth_operator);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        return root;
    }

}