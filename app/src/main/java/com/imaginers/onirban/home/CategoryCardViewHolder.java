package com.imaginers.onirban.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

public class CategoryCardViewHolder extends RecyclerView.ViewHolder {


    public NetworkImageView categoryImage;
    public TextView categoryTitle;

    public CategoryCardViewHolder(@NonNull View itemView) {
        super(itemView);
        categoryImage = itemView.findViewById(R.id.category_image);
        categoryTitle = itemView.findViewById(R.id.category_title);
    }
}
