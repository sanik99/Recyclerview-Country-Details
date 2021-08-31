package com.example.reccardapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder>
{
   ArrayList<Model> data;
   ArrayList<Model2> data2;
   Context context;

    public myadapter(ArrayList<Model> data, ArrayList<Model2> data2,Context context)
    {
        this.data = data;
        this.context = context;
        this.data2 = data2;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        final Model2 temp = data2.get(position);


       holder.coname.setText(data.get(position).getCountry());
       holder.code.setText(data.get(position).getCode());
       holder.img.setImageResource(data.get(position).getImgname());

        //making t1(country name) clickabke
       holder.coname.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(context,Details_activity.class);
               intent.putExtra("countryname", temp.getCountryID());
               intent.putExtra("area", temp.getAreaID());
               intent.putExtra("religion", temp.getReligionID());
               intent.putExtra("population", temp.getPopulationID());
               intent.putExtra("detailsarea", temp.getDetailsArea());
               intent.putExtra("flag", temp.getFlagID());
               intent.putExtra("animals", temp.getAnimalsID());
               intent.putExtra("birds", temp.getBirdsID());

               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(intent);
           }
       });

    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }
}
