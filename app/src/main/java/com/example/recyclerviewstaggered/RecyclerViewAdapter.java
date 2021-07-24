package com.example.recyclerviewstaggered;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by User on 1/1/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    // ArrayList
    ArrayList<Integer> Image;
    Context context;

    // constructor
    public RecyclerViewAdapter(Context context, ArrayList<Integer> Image) {
        super();
        this.context = context;
        this.Image = Image;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        // setting image resource
        viewHolder.imgview.setImageResource(Image.get(i));
    }

    @Override
    public int getItemCount() {
        return Image.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgview;
        public ViewHolder(View itemView) {
            super(itemView);

            // getting ImageView reference
            imgview = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}