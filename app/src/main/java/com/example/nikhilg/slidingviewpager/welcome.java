package com.example.nikhilg.slidingviewpager;

import android.content.Context;
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
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.content.SharedPreferences;



public class welcome extends Fragment {
    public static final String Name = "nameKey";
   SharedPreferences sharedpreferences;
   private EditText e1,e2;
   private Button b1;
    private CheckBox checkBox;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
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
        View root = inflater.inflate(R.layout.activity_welcome, container, false);
        e1=(EditText) root.findViewById(R.id.username);
        e2=(EditText) root.findViewById(R.id.password);
        b1=(Button) root.findViewById(R.id.login);
        checkBox=(CheckBox) root.findViewById(R.id.chckBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked)
                {
                    e2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                else
                {
                    e2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
        //sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        //sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=e1.getText().toString();
                String pass=e2.getText().toString();
                if(!isValidnumber(username))
                {
                    e1.setError("Enter Correct Username");
                }
                else if(!isvalidpassword(pass))
                {
                    e2.setError("Enter Correct password");
                }
                else
                {
                    Intent intent = new Intent(getActivity(), Item1Activity.class);
                    startActivity(intent);
                }
            }
        });
        return root;
    }
    private boolean isValidnumber(String mob)
    {
        if(mob.length()!=0&& mob.equals("admin"))
        {
            return true;
        }
        return false;
    }
    private boolean isvalidpassword(String pass)
    {
        if(pass.length()!=0&& pass.equals("admin"))
        {
            return true;
        }
        return false;
    }
}