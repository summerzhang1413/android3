package com.example.demo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class ViewPagerFragment1 extends Fragment {

    private String   text;
    private TextView tv = null;

    public ViewPagerFragment1(String text){ 
        super();
        this.text = text; 
    }

    /**
     * ���Ǵ˺�������ͨ��inflater inflate�����õ�view��󷵻�
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.view_pager_fragment_demo1, container, false);
        tv = (TextView)v.findViewById(R.id.viewPagerText);
        tv.setText(text);
        return v;
    }
}