package com.atguigu.hdct;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private MyScrollow scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         scrollView=findViewById(R.id.scrollView);
        String[] str=new String[100];
        scrollView.Setlistview(listView);
        for (int z = 0; z < str.length; z++) {
            str[z] = z + "d";
        }
           // listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str));

        }
    }
