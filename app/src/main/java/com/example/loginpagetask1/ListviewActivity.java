package com.example.loginpagetask1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    private static final String TAG = "ListviewActivity";
    ListView lv_donar_details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        Log.d(TAG,"on create starting");
        lv_donar_details = findViewById(R.id.admin_listview);
        DonarDetails donarDetails1 = new DonarDetails("kajal","2365478918","A+");
        DonarDetails donarDetails2 = new DonarDetails("Maya","8965236589","B+");
        DonarDetails donarDetails3 = new DonarDetails("Riya","4563256987","AB+");
        DonarDetails donarDetails4 = new DonarDetails("Kriva","8563214569","O+");
        DonarDetails donarDetails5 = new DonarDetails("Hina","8965231456","A-");
        DonarDetails donarDetails6 = new DonarDetails("Bhavya","8745693256","AB-");
        DonarDetails donarDetails7 = new DonarDetails("Raj","4569874521","B+");
        DonarDetails donarDetails8 = new DonarDetails("Krushal","8965236589","A+");
        DonarDetails donarDetails9 = new DonarDetails("Vishva","4569874521","B+");
        DonarDetails donarDetails10 = new DonarDetails("Kiran","8965234569","AB+");
        DonarDetails donarDetails11 = new DonarDetails("Harman","8965423658","O+");
        DonarDetails donarDetails12 = new DonarDetails("Somaya","7569845632","B+");

        ArrayList<DonarDetails> donarDetails = new ArrayList<>();
        donarDetails.add(donarDetails1);
        donarDetails.add(donarDetails2);
        donarDetails.add(donarDetails3);
        donarDetails.add(donarDetails4);
        donarDetails.add(donarDetails5);
        donarDetails.add(donarDetails6);
        donarDetails.add(donarDetails7);
        donarDetails.add(donarDetails8);
        donarDetails.add(donarDetails9);
        donarDetails.add(donarDetails10);
        donarDetails.add(donarDetails11);
        donarDetails.add(donarDetails12);

        ListviewAdapter listviewAdapter = new ListviewAdapter(this,R.layout.activity_listview_items,donarDetails);
        lv_donar_details.setAdapter(listviewAdapter);
    }
}