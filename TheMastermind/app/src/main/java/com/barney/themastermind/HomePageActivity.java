package com.barney.themastermind;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {
    private Intent selectGame = null;
    public static final String EXTRA_WORDLEN = "com.barney.themastermind.wordlength";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }

    public void btnStart4LetterClicked(View v) {
        selectGame = new Intent(this, MainActivity.class);
        selectGame.putExtra(EXTRA_WORDLEN, "4");
        startActivity(selectGame);
    }

    public void btnStart5LetterClicked(View v) {
        selectGame = new Intent(this, MainActivity.class);
        selectGame.putExtra(EXTRA_WORDLEN, "5");
        startActivity(selectGame);
    }

}
