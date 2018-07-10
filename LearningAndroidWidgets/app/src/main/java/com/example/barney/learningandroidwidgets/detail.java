package com.example.barney.learningandroidwidgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by barney on 20/03/18.
 */

public class detail extends AppCompatActivity {

    @BindView(R.id.txtHeader)
    TextView txtHeader;
    @BindView(R.id.Description)
    TextView Description;
    @BindView(R.id.txtCodeXML)
    EditText txtCodeXML;
    String header, deskripsi, code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        ButterKnife.bind(this);

        header = getIntent().getStringExtra("any");
        deskripsi = getIntent().getStringExtra("deskripsi");
        code = getIntent().getStringExtra("code");

        txtHeader.setText(header);
        Description.setText(deskripsi);
        txtCodeXML.setText(code);



    }
}
