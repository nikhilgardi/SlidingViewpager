package com.example.nikhilg.slidingviewpager;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//import com.example.nikhilg.bankapp.adapter.ImageAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class offers extends Fragment {
    /** (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
//    List<String> list;
//    GridView grid;
//
//    static final String[] MOBILE_OS = new String[] {
//            "Android", "iOS","Windows", "Blackberry" };
    GridView gv;
    Context context;
    ArrayList prgmName;
    public static String [] prgmNameList={"Pockets","Net Banking","Credit Cards","Debit Cards","Life Style","Electronics"};
    public static int [] prgmImages={
            R.drawable.images,
            R.drawable.images,
            R.drawable.images,
            R.drawable.images,
            R.drawable.images,
            R.drawable.images
            };
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (container == null) {
            return null;
        }
        //return (RelativeLayout)inflater.inflate(R.layout.activity_offers,container, false);
        View view = inflater.inflate(R.layout.activity_offers,container,false);
//        GridView gridView = (GridView) view.findViewById(R.id.gridView1);
//        gridView.setAdapter(new MyAdapter(view.getContext())); // uses the view to get the context instead of getActivity().
        gv=(GridView) view.findViewById(R.id.gridView1);
        gv.setAdapter(new CustomAdapter(view.getContext(), prgmNameList,prgmImages));
        return view;

    }
}
