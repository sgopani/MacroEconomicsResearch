package com.example.macroeconomicsresearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnnotationsActivity extends AppCompatActivity {
    private String selectedCountry;
    private int selectedUser;
    private int selectedTable;
    ArrayList<String> checkedStrings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annotations);
        Button annotations_btn=findViewById(R.id.annotations_btn);
        TextView selectedCountry_tv=findViewById(R.id.country_name);
        Intent intent = getIntent();
        selectedCountry=intent.getStringExtra("selectedCountry");
        selectedUser=intent.getIntExtra("selectedUser",0);
        selectedTable=intent.getIntExtra("selectedTable",0);
        checkedStrings= (ArrayList<String>) getIntent().getSerializableExtra("checkedStrings");
        ImageView macroeconomics_table_image=findViewById(R.id.macroeconomics_table_image);
        ImageView agriculture_table_image=findViewById(R.id.agriculture_table_image);
        ImageView debt_table_image=findViewById(R.id.debt_table_image);
        selectedCountry_tv.setText(selectedCountry);
        if(selectedTable==0){
            annotations_btn.setBackgroundColor(getResources().getColor(R.color.Blue_color));;
            macroeconomics_table_image.setBackgroundColor(getResources().getColor(R.color.Blue_color));
        }
        else if(selectedTable==1){
            annotations_btn.setBackgroundColor(getResources().getColor(R.color.Green_color));;
            agriculture_table_image.setBackgroundColor(getResources().getColor(R.color.Green_color));
        }
        else{
            annotations_btn.setBackgroundColor(getResources().getColor(R.color.Brown_color));;
            debt_table_image.setBackgroundColor(getResources().getColor(R.color.Brown_color));
        }
    }
}