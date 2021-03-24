package com.example.first_android_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clickRegister (View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        EditText editText1 = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        String message = editText1.getText().toString() + "," + editText2.getText().toString();
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}