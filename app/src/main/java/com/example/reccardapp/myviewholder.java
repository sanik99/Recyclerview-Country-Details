package com.example.reccardapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class myviewholder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView coname, code;

    public myviewholder(@NonNull View itemView) {
        super(itemView);
        img = (ImageView) itemView.findViewById(R.id.img1);
        coname = (TextView) itemView.findViewById(R.id.coname);
        code = (TextView) itemView.findViewById(R.id.code);

    }
}
