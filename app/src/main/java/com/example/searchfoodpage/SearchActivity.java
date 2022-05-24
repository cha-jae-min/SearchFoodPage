/*
package com.example.searchfoodpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView foodSearchRecyclerView;
    private RecyclerView.Adapter foodAdpater;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<FoodData> foodDataArrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    private FoodData foodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        foodSearchRecyclerView = (RecyclerView)findViewById(R.id.foodSearchRecyclerView);
        foodSearchRecyclerView.setHasFixedSize(true); // 리사이클러뷰 기존성능 강화
        layoutManager = new LinearLayoutManager(this);
        foodSearchRecyclerView.setLayoutManager(layoutManager);
        foodDataArrayList = new ArrayList<>(); // User 객체를 담을 어레이 리스트 (어댑터쪽으로)



        foodData = new FoodData("차재민","당이 내려가는 신비한 음식"
                ,"초콜릿","달달하지만 당이 내려가는 신기한 음식",R.drawable.ic_launcher_background,"2020-02-05");
        foodDataArrayList.add(foodData);
        foodData = new FoodData("차재민","식빵의 변신"
                ,"식빵","식빵의 식감을 살린다.",R.drawable.ic_launcher_background,"2025-02-05");
        foodDataArrayList.add(foodData);


        /*
        database = FirebaseDatabase.getInstance(); // 파이어베이스 데이터베이스 연동
        databaseReference = database.getReference("cafeList_ Gongneung"); // DB 테이블 연결
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // 파이어베이스 데이터베이스의 데이터를 받아오는 곳
                foodDataArrayList.clear(); // 기존 배열리스트가 존재하지않게 초기화
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) { // 반복문으로 데이터 List를 추출해냄
                    FoodData foodData = snapshot.getValue(FoodData.class); // 만들어뒀던 User 객체에 데이터를 담는다.
                    foodDataArrayList.add(foodData); // 담은 데이터들을 배열리스트에 넣고 리사이클러뷰로 보낼 준비
                }
                foodAdpater.notifyDataSetChanged(); // 리스트 저장 및 새로고침해야 반영이 됨
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // 디비를 가져오던중 에러 발생 시
                Log.e("Fraglike", String.valueOf(databaseError.toException())); // 에러문 출력
            }
        });


        foodAdpater = new FoodAdapter(foodDataArrayList, this);
        foodSearchRecyclerView.setAdapter(foodAdpater); // 리사이클러뷰에 어댑터 연결
    }
}
*/