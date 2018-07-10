package com.barney.matapelajarantingkatsma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DEEEEEETAAAAIIILLL  extends AppCompatActivity {

    @BindView(R.id.txtHeader)
    TextView txtHeader;
    @BindView(R.id.Description)
    TextView Description;
    String header, deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deeeeeetaaaaiiilll);
        ButterKnife.bind(this);

        header = getIntent().getStringExtra("any");
        deskripsi = getIntent().getStringExtra("deskripsi");

        txtHeader.setText(header);
        Description.setText(deskripsi);

    }
}
