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

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.CustomViewHolder>{


    private ArrayList<FoodData> arrayList;
    private Context context;

    public FoodAdapter(ArrayList<FoodData> arrayList, Context context) {
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
    public void onBindViewHolder(@NonNull FoodAdapter.CustomViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.food_title.setText(arrayList.get(position).getFood_title());
        holder.food_writer.setText(arrayList.get(position).getFood_writer());
        Glide.with(holder.itemView).load(arrayList.get(position).getFood_image()).into(holder.food_image);

        holder.itemView.setTag(position);
        holder.food_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(),Food_PageActivity.class);
                intent.putExtra("food_writer",arrayList.get(position).getFood_writer());
                intent.putExtra("food_title",arrayList.get(position).getFood_title());
                intent.putExtra("food_kind",arrayList.get(position).getFood_kind());
                intent.putExtra("food_description",arrayList.get(position).getFood_description());
                intent.putExtra("food_image",arrayList.get(position).getFood_image());
                intent.putExtra("food_upload_date",arrayList.get(position).getFood_upload_data());
                //intent.putExtra("food_ingredient",arrayList.get(position).getFood_ingredient());
                context.startActivity(intent);
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

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

        protected TextView food_writer;
        protected TextView food_title;
        protected ImageView food_image;
        protected LinearLayout food_information;



        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.food_writer = (TextView) itemView.findViewById(R.id.foodWriter);
            this.food_title = (TextView) itemView.findViewById(R.id.foodTitle);
            this.food_image = (ImageView) itemView.findViewById(R.id.foodImage);
            this.food_information = (LinearLayout) itemView.findViewById(R.id.food_information);
        }
    }

    public  void filterList(ArrayList<FoodData> m){
        arrayList = m;
        notifyDataSetChanged();
    }


    //정렬 처음에는 MainActivity쪽에 놓았다가 검색한 것은 정렬이 안되길래 여기다 옮김
    //compareTo는 내림차순으로 맞춰둠
    public void Array_recent(){
        Collections.sort(arrayList, new Comparator<FoodData>() {
            @Override
            public int compare(FoodData m1, FoodData m2) {
                return m2.getFood_upload_data().compareTo(m1.getFood_upload_data());
            }
        });
    }

}
