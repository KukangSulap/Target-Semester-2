package com.barney.howtowinagameofcluewithouttechnicallycheating;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView view;
    CustomAdapter adapter;
    int adapterPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.recyclerView);
        view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter();
        view.setAdapter(adapter);

    }

    public int getAdapterPosition() {
        return adapterPosition;
    }


    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list__item, null);
            return new MyViewHolder(v);
        }


        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int position) {
            holder.nmWebsite.setText(any[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, DEEEEEETAAAAIIILLL.class);
                    intent.putExtra("any", any[position]);
                    intent.putExtra("deskripsi", deskripsi[position]);
                    startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return any.length;
        }

        public class
        MyViewHolder extends RecyclerView.ViewHolder {
            TextView nmWebsite;

            public MyViewHolder(View itemView) {
                super(itemView);
                nmWebsite = itemView.findViewById(R.id.Web);
            }
        }

        String[] any = {"Keep good notes on the clues you collect",
                "Pay attention to the suggestions other players make",
                "Watch other players as they check items off on their lists",
                "Pay attention to what card names are being said over and over",
                "Keep your clues a secret",
                "Try to throw your opponents off",
                "Watch your body language to avoid giving away clues"};
        String[] deskripsi = {" As you play Clue, you will gather clues that will help you to determine the suspect, weapon, and location of the murder.[1] To keep track of the clues you collect, you should keep good notes and include the initials of the players who have each of the clues you collect. Doing so will help you to get closer to the truth and win the game.[2]\n" +
                "Make sure that you check off clues on your detective's notes sheet or write them on your notepad as you collect them.",
                "Your opponents will also be searching for clues to solve the murder, so it is a good idea to pay attention to their suggestions. Just keep in mind that they may try to throw you off sometimes, so be careful not to consider all of their suggestions as clues.",
                "If another player shows them a card, secretly watch where the first person writes the X down on the paper. If he writes it low on the sheet of paper, it is a room. If he writes it at the top, it means he was shown either a weapon or a character.[3]\n" +
                        "Try to become familiar with the layout of the detective’s notes sheet so that it is easier for you to tell what your opponents are marking off.\n" +
                        "Try flipping your sheet upside down to throw off other players who may be watching you as well.",
                "If a card keeps getting suggested and no one seems to have it, then it may be in the envelope. Make a note of it on your detective’s notes sheet, but try not to be obvious about it. Write it down a little after the name suspect, weapon, or room was mentioned.",
                "Never tell anyone that you know or have a hunch. They will be able to gather clues to your suspicion by the questions you ask. For example, if you admit to almost know who did it, then in your next turn you ask to see the Colonel Mustard card, people will believe you think it is Colonel Mustard and you were checking to make sure it was him.",
                "Clue is about detecting the truth, but it is also a game of deception. To deceive your opponents, try pretending that you have a hunch and suggesting a suspect or item that you have in your hand. This will make your opponents consider that item and give you more time to detect the truth.",
                "Your body language may give away answers about what cards you have or how close you are to winning the game. Try throwing them off by using body language that suggests that you are not doing well. This will help to take their attention off of you.\n" +
                        "For example, if you are winning, try slouching over and looking frustrated."};
    }

}
