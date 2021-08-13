package com.example.loginpagetask1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerviewActivity extends AppCompatActivity {
    ImageView d_image;
    TextView d_list;
    RecyclerView rcv_d_details;
    String s1[],s2[],s3[];
    int images[] = {R.drawable.u1,R.drawable.u2,R.drawable.u3,R.drawable.u4,R.drawable.u5,R.drawable.u6,R.drawable.u7,R.drawable.u8,R.drawable.u9,R.drawable.u10};
    RecyclerviewAdapter recyclerviewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        d_image = findViewById(R.id.rcv_dimage);
        d_list = findViewById(R.id.rcv_dblist);
        rcv_d_details = findViewById(R.id.rcv_A_details);
        s1 =getResources().getStringArray(R.array.donate_camp_location);
        s2 = getResources().getStringArray(R.array.donate_camp_name);
        s3 = getResources().getStringArray(R.array.donate_date);

         recyclerviewAdapter = new RecyclerviewAdapter(this,s1,s2,s3,images);
         rcv_d_details.setAdapter(recyclerviewAdapter);
         rcv_d_details.setLayoutManager(new LinearLayoutManager(this));
    }
}