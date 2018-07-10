package com.barney.parodymarbelbinatang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    ImageView Image;
    TextView Any,Deskripsi;
    String any,deskripsi;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Image = findViewById(R.id.Image);
        Any = findViewById(R.id.Any);
        Deskripsi = findViewById(R.id.Deskripsi);

        any = getIntent().getStringExtra("any");
        deskripsi = getIntent().getStringExtra("deskripsi");
        image = getIntent().getIntExtra("image", 0);

        Any.setText(any);
        Deskripsi.setText(deskripsi);
        Image.setImageResource(image);
    }
}
