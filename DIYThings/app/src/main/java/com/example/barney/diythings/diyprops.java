package com.example.barney.diythings;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class diyprops extends AppCompatActivity {

    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.stream1)
    VideoView stream1;
    @BindView(R.id.txtJudul)
    TextView text1;
    @BindView(R.id.txtDetail)
    TextView text2;
    String judul, deskripsi, link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diyprops);

        ButterKnife.bind(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_ATTACHED_IN_DECOR, WindowManager.LayoutParams.FLAG_LAYOUT_ATTACHED_IN_DECOR);
        setContentView(R.layout.activity_diyprops);
        ButterKnife.bind(this);
//        final ProgressDialog dialog = new ProgressDialog(diyprops.this);
//        dialog.setTitle("Loading");
//        dialog.setMessage("Please Wait");
//        dialog.setIndeterminate(false);
//        dialog.setCancelable(false);
//        dialog.show();

        judul = getIntent().getStringExtra("any");
        deskripsi = getIntent().getStringExtra("deskripsi");
        link = getIntent().getStringExtra("url");

        text1.setText(judul);
        text2.setText(deskripsi);

        MediaController controller = new MediaController(this);
        controller.setAnchorView(stream1);
        stream1.setMediaController(controller);

        Uri uri_url = Uri.parse(link);
        stream1.setVideoURI(uri_url);
        stream1.requestFocus();

        stream1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
//                dialog.dismiss();
                mediaPlayer.start();
            }
        });
    }
}
