package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdopterProduct extends RecyclerView.Adapter<AdopterProduct.ProductViewholder> {
    private List<Product> products;

    public AdopterProduct(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View rootview= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_rowview,null);
        View rootview= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_rowview_grid,null);
        return new ProductViewholder(rootview);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewholder holder, int position) {
    Product product=products.get(position);
    holder.iv.setImageResource(product.getImageResourceId());
    holder.tvPrice.setText(Double.toString(product.getPrice()));
    holder.tvTitle.setText(product.getTitle());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }


    class ProductViewholder extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tvTitle, tvPrice;

        public ProductViewholder(@NonNull View rootView) {
            super(rootView);
            iv=rootView.findViewById(R.id.iv);
            tvTitle =rootView.findViewById(R.id.tvTitle);
            tvPrice =rootView.findViewById(R.id.tvPrice);
        }
    }

    }

