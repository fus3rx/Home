package com.imaginers.onirban.home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.imaginers.onirban.home.network.CategoryEntry;
import com.imaginers.onirban.home.network.ImageRequester;

import java.util.List;

/**
 * Adapter used to show a simple grid of Category.
 */
public class CategoryCardRecyclerViewAdapter extends RecyclerView.Adapter<CategoryCardViewHolder> {

    private List<CategoryEntry> categoryList;
    private ImageRequester imageRequester;

    public CategoryCardRecyclerViewAdapter(List<CategoryEntry> categoryList) {
        this.categoryList = categoryList;
        imageRequester = ImageRequester.getInstance();
    }

    @NonNull
    @Override
    public CategoryCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_card, parent, false);
        return new CategoryCardViewHolder(layoutView);
    }


    @Override
    public void onBindViewHolder(@NonNull CategoryCardViewHolder holder, int position) {
        if (categoryList != null && position < categoryList.size()) {
            CategoryEntry category = categoryList.get(position);
            holder.categoryTitle.setText(category.title);
            imageRequester.setImageFromUrl(holder.categoryImage, category.url);
        }
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
