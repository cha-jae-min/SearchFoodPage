package com.example.searchfoodpage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Food_PageActivity extends AppCompatActivity  {

    private TextView foodWriter;
    private TextView foodTitle;
    private TextView foodKind;
    private TextView foodDescription;
    private ImageView foodImage;
    private TextView foodUploadDate;

    private RecyclerView foodIngredient;
    private FoodPageAdapter foodPageAdpater;
    private RecyclerView.LayoutManager layoutManager;

    private FoodPageData foodPageData;
    private ArrayList<FoodPageData> foodPageDataArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_page);

        Intent intent = getIntent();
        String food_writer = intent.getExtras().getString("food_writer");
        String food_title = intent.getExtras().getString("food_title");
        String food_kind = intent.getExtras().getString("food_kind");
        String food_description = intent.getExtras().getString("food_description");
        String food_image = intent.getExtras().getString("food_image");
        String food_upload_date = intent.getExtras().getString("food_upload_date");

        foodWriter = (TextView) findViewById(R.id.food_writer);
        foodTitle = (TextView) findViewById(R.id.food_title);
        foodKind = (TextView) findViewById(R.id.food_kind);
        foodDescription = (TextView) findViewById(R.id.food_description);
        foodImage = (ImageView) findViewById(R.id.food_image);
        foodUploadDate = (TextView) findViewById(R.id.food_upload_date);

        foodWriter.setText(food_writer);
        foodTitle.setText(food_title);
        foodKind.setText(food_kind);
        foodDescription.setText(food_description);
        //foodImage.setImageResource(food_image);
        foodUploadDate.setText(food_upload_date);



    }


}
