package com.example.loginpagetask1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ListviewAdapter extends ArrayAdapter<DonarDetails> {
    private static final String TAG = "ListviewAdapter";
    public Context mcontext;
    int mResource;

    public ListviewAdapter(@NonNull Context context, int resource, ArrayList<DonarDetails> objects) {
        super(context, resource,objects);
        mcontext = context;
        mResource =resource;
    }
    public View getView(int position,View convertView,ViewGroup parent){
        String s1 = getItem(position).getA_dname();
        String s2 = getItem(position).getA_dno();
        String s3 = getItem(position).getA_dbloodtype();
        DonarDetails donarDetails = new DonarDetails(s1,s2,s3);
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        convertView = layoutInflater.inflate(mResource,parent,false);
        TextView Aname = convertView.findViewById(R.id.A_donar_name);
        TextView Ano = convertView.findViewById(R.id.A_donar_no);
        TextView Abloodtype = convertView.findViewById(R.id.A_dbloodtype);
         Aname.setText(s1);
         Ano.setText(s2);
         Abloodtype.setText(s3);
         return convertView;
    }
}
