package com.example.food_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.food_app.food.Food;
import com.example.food_app.food.FoodAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FoodAdapter foodAdapter;

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv1);
        foodAdapter = new FoodAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        foodAdapter.setData(getListFood());
        recyclerView.setAdapter(foodAdapter);

        int image[] = {R.drawable.flipper1, R.drawable.flipper2, R.drawable.flipper3, R.drawable.flipper4};
        v_flipper = findViewById(R.id.flip1);
        for(int images: image){
            flipperImage(images);
        }
    }
    public void flipperImage(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
    }

    private List<Food> getListFood(){

        List<Food> list = new ArrayList<>();
        list.add(new Food(R.drawable.banh_cuon, "Banh cuon", "50.000" ));
        list.add(new Food(R.drawable.banhbao, "Banh bao", "20.000" ));
        list.add(new Food(R.drawable.ca_kho, "Ca kho", "30.000" ));
        list.add(new Food(R.drawable.comtam, "Com tam", "35.000" ));
        list.add(new Food(R.drawable.humber, "Humbeger", "55.000" ));
        list.add(new Food(R.drawable.phocuon, "Pho cuon", "40.000" ));
        list.add(new Food(R.drawable.suonxao, "Suon xao", "45.000" ));

        list.add(new Food(R.drawable.banh_cuon, "Banh cuon", "50.000" ));
        list.add(new Food(R.drawable.banhbao, "Banh bao", "20.000" ));
        list.add(new Food(R.drawable.ca_kho, "Ca kho", "30.000" ));
        list.add(new Food(R.drawable.comtam, "Com tam", "35.000" ));
        list.add(new Food(R.drawable.humber, "Humbeger", "55.000" ));
        list.add(new Food(R.drawable.phocuon, "Pho cuon", "40.000" ));
        list.add(new Food(R.drawable.suonxao, "Suon xao", "45.000" ));
        list.add(new Food(R.drawable.banh_cuon, "Banh cuon", "50.000" ));

        list.add(new Food(R.drawable.banhbao, "Banh bao", "20.000" ));
        list.add(new Food(R.drawable.ca_kho, "Ca kho", "30.000" ));
        list.add(new Food(R.drawable.comtam, "Com tam", "35.000" ));
        list.add(new Food(R.drawable.humber, "Humbeger", "55.000" ));
        list.add(new Food(R.drawable.phocuon, "Pho cuon", "40.000" ));
        list.add(new Food(R.drawable.suonxao, "Suon xao", "45.000" ));
        return list;
    }
}