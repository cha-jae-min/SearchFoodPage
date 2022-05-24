package com.example.searchfoodpage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;

public class FoodPageAdapter extends RecyclerView.Adapter<FoodPageAdapter.CustomViewHolder>{


    private ArrayList<FoodPageData> arrayList;
    private Context context;

    public FoodPageAdapter(ArrayList<FoodPageData> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_search_list,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_ingredient.setText(arrayList.get(position).getFood_ingredient());



        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                remove(holder.getAdapterPosition());
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {

        return (null !=arrayList ? arrayList.size():0);
    }
    public void remove(int position){
        try{
            arrayList.remove(position);
            notifyItemRemoved(position);
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }

    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected TextView food_ingredient;



        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.food_ingredient = (TextView) itemView.findViewById(R.id.foodIngredient);

        }
    }


}
