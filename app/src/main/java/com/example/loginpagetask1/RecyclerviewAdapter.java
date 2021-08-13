package com.example.loginpagetask1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.RecyclerviewAdapterHolder>{
   String data1[],data2[],data3[];
   int images[];
   Context context;
   public RecyclerviewAdapter(Context c,String s1[],String s2[],String s3[],int image[]){
       context = c;
       data1 = s1;
       data2 = s2;
       data3 = s3;
       images = image;
   }

    @NonNull
    @Override
    public RecyclerviewAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(context);
        View view =layoutInflater.inflate(R.layout.activity_recyclerview_items,parent,false);
       return new RecyclerviewAdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapterHolder holder, int position) {
       holder.rcv_t1.setText(data1[position]);
       holder.rcv_t2.setText(data2[position]);
       holder.rcv_t3.setText(data3[position]);
       int image_id =images[position];
       holder.rcv_image.setImageResource(image_id);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class RecyclerviewAdapterHolder extends RecyclerView.ViewHolder {
       ImageView rcv_image;
       TextView rcv_t1,rcv_t2,rcv_t3;
       ConstraintLayout constraintLayout;
        public RecyclerviewAdapterHolder(@NonNull View itemView) {
            super(itemView);
            rcv_image = itemView.findViewById(R.id.rcv_dImage);
            rcv_t1 = itemView.findViewById(R.id.rcv_dcamp_location);
            rcv_t2 = itemView.findViewById(R.id.rcv_dcamp_name);
            rcv_t3 = itemView.findViewById(R.id.rcv_d_date);
            constraintLayout = itemView.findViewById(R.id.rcv_layout);
        }
    }
}
