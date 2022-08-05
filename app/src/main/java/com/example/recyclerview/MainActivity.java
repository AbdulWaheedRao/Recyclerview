package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdopterProduct productAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        productAdaptor = new AdopterProduct(generateData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(productAdaptor);
        recyclerView.setHasFixedSize(true);
    }

    List<Product> generateData() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Burger", 550.0, R.drawable.burger1));
        products.add(new Product("Pizza", 550.0, R.drawable.img_2));
        products.add(new Product("Pasta", 550.0, R.drawable.img_1));
        products.add(new Product("Wings", 550.0, R.drawable.img));
        return products;
    }
}