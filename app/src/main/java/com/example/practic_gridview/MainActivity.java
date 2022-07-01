package com.example.practic_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.practic_gridview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private static final int NUM_GRID_COLUMNS=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int gridWidth=getResources().getDisplayMetrics().widthPixels;
        int imageWidth=gridWidth/NUM_GRID_COLUMNS;
        binding.gridview.setColumnWidth(imageWidth);

        int[] housesImage={R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e,R.drawable.g, R.drawable.k, R.drawable.l, R.drawable.m,
        R.drawable.n, R.drawable.o};

        String[] housesName={"3 room house", "2 room", "4 room", "3 room", "2 room", "10 room", "2 room", "2 room", "4 room", "5 room"};

        GridAdapter gridAdapter=new GridAdapter( housesName, housesImage,MainActivity.this );
        binding.gridview.setAdapter(gridAdapter);

        binding.gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               /* Intent intent = new Intent(MainActivity.this, DescriptionGoodsActivity.class);
                startActivity(intent);*/

                Toast.makeText(MainActivity.this, "You clicked "+housesName[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}