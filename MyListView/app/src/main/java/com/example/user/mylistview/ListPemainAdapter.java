package com.example.user.mylistview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListPemainAdapter extends RecyclerView.Adapter<ListPemainAdapter.CategoryViewHolder>{
    private Context context;

    ArrayList<Pemain> getListPemain() {
        return listPemain;
    }

    void setListPemain(ArrayList<Pemain> listPemain) {
        this.listPemain = listPemain;
    }

    private ArrayList<Pemain> listPemain;


    ListPemainAdapter(Context context) {
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_pemain, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.tvName.setText(getListPemain().get(position).getName());
        holder.tvRemarks.setText(getListPemain().get(position).getRemarks());

        Glide.with(context)
                .load(getListPemain().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPemain().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
        }
    }
}

