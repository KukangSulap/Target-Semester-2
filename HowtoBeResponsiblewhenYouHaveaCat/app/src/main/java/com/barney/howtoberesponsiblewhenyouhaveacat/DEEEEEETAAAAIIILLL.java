package com.barney.howtoberesponsiblewhenyouhaveacat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DEEEEEETAAAAIIILLL extends AppCompatActivity {

    TextView txtHeader;
    TextView Description;
    String header, deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deeeeeetaaaaiiilll);

        header = getIntent().getStringExtra("any");
        deskripsi = getIntent().getStringExtra("deskripsi");

        txtHeader.setText(header);
        Description.setText(deskripsi);

    }
}
