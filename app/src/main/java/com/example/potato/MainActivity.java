package com.example.potato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox ch_arms,ch_ears,ch_eyebrows,ch_eyes,ch_glasses,ch_hat,
                ch_mouth,ch_mustache,ch_nose,ch_shoes;
        ch_arms=findViewById(R.id.c_arms);
        ch_ears=findViewById(R.id.c_ears);
        ch_eyebrows=findViewById(R.id.c_eyebrows);
        ch_eyes=findViewById(R.id.c_eyes);
        ch_glasses=findViewById(R.id.c_glasses);
        ch_hat=findViewById(R.id.c_hat);
        ch_mouth=findViewById(R.id.c_mouth);
        ch_mustache=findViewById(R.id.c_mustache);
        ch_nose=findViewById(R.id.c_nose);
        ch_shoes=findViewById(R.id.c_shoes);
        final ImageView arms=findViewById(R.id.arms);
        final ImageView ears=findViewById(R.id.ears);
        final ImageView eyebrows=findViewById(R.id.eyebrows);
        final ImageView eyes=findViewById(R.id.eyes);
        final ImageView glasses=findViewById(R.id.glasses);
        final ImageView hat=findViewById(R.id.hat);
        final ImageView mouth=findViewById(R.id.mouth);
        final ImageView mustache=findViewById(R.id.mustache);
        final ImageView nose=findViewById(R.id.nose);
        final ImageView shoes=findViewById(R.id.shoes);

        ch_arms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    arms.setVisibility(View.VISIBLE);
                }else{
                    arms.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    ears.setVisibility(View.VISIBLE);
                }else{
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_eyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    eyebrows.setVisibility(View.VISIBLE);
                }else{
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_eyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    eyes.setVisibility(View.VISIBLE);
                }else{
                    eyes.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    glasses.setVisibility(View.VISIBLE);
                }else{
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    hat.setVisibility(View.VISIBLE);
                }else{
                    hat.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    mouth.setVisibility(View.VISIBLE);
                }else{
                    mouth.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_mustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    mustache.setVisibility(View.VISIBLE);
                }else{
                    mustache.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    nose.setVisibility(View.VISIBLE);
                }else{
                    nose.setVisibility(View.INVISIBLE);
                }
            }
        });
        ch_shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked){
                    shoes.setVisibility(View.VISIBLE);
                }else{
                    shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
