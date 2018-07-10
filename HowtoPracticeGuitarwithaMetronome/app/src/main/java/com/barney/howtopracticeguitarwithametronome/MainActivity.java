package com.barney.howtopracticeguitarwithametronome;

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

        String[] any = {"Set the rhythm of the metronome to 4/4 time",
                "Set your metronome's tempo to a comfortable, easy pace to begin",
                "Evenly strum the guitar to the beat, hitting just one strum per beat",
                "Try out a more complicated strumming pattern",
                "Set the metronome to cut out every other measure, forcing you to stay on time without a guide.",
                "Try different tempos and time signatures",
                "Move your foot or head along with the beat",
                "Count yourself in if you struggle to find the beat",
                "Focus on the one",
                "Play with other musicians, or a jam track"};
        String[] deskripsi = {"This is the most common time signature in modern music, the one counted out \"1, 2, 3, 4 // 1, 2, 3, 4 // 1, 2...\" The metronome will count out these beats for you, giving you a perfectly timed track to match up with.\n" +
                "Not all metronomes advertise time signatures like \"4/4\" or \"3/4.\" Some make you pick the note length. If it asks, set the machine to \"quarter notes.\"",
                "Metronomes determine their speed in beats per minute, or BPM. While many songs are around 100 BPM or more, you need to focus on getting perfect rhythm across a variety of tempos. Start slow, then move up as you get better.\n" +
                        "Some people actually find slower tempos harder to match up to, helping you improve even faster. If you can hold at 70 BPM, then 120 will be much easier.",
                "Just work on one simple strum per beat. This isn't glamorous, but focus on hitting every beat perfectly for 1-2 minutes straight. Really try to get you strumming perfectly matched to the beat.\n" +
                        "Once this becomes easier, start upping the speed, still sticking to just one strum per beat.",
                "Once you can strum every beat, it's time to start playing \"real\" guitar. Pick a couple of chords you are comfortable with -- something simple, like G-C-D -- and start an up-down strumming pattern you can hold comfortably. Up the speed of the metronome, focusing on holding your rhythm even when you have to change chords.",
                "This is a key feature for practice -- the metronome goes silent for a measure, but comes back in right on time. Your job is to come back on time with it. As you get better and better, keep making the intervals between measures longer and longer. Once you can stay on perfect time even when the metronome cuts out you will have the rhythm mastered.",
                "Set the machine to eighth notes, or 3/4 time. Get really crazy and try out a song in 7/4, or drop the BPM so low you really need to focus on each well-spaced beat. Metronome practice doesn't have to be boring if you're willing to challenge yourself.\n" +
                        "Again, never just screw around or play halfheartedly, making mistakes without corrections. You need to actually work on staying with the metronome to gain anything from these exercises.",
                "This isn't just to look cool -- moving another part of your body along with beat helps you sink into the groove, making it easier to sync your strumming up. Tap a foot or nod you head.",
                "With the guitar in your hand, simply count with the metronome -- \"1, 2, 3, 4 // 1, 2, 3, 4 // 1, 2...\" Once you feel comfortable with the beat, keep counting as you drop in with the guitar, letting your voice help guide you with the rhythm.\n" +
                        "If you're really struggling, adjust the tempo. Don't practice at a pace that forces you to make multiple mistakes -- you want to learn to hold consistent rhythm.",
                "The first beat of every measure is a good benchmark to hit on time, especially if you're struggling. Counting out the beats, just focus on strumming on the first beat for a few measures. Get use to where the beat \"resets.\" When playing with other musicians, the most essential beat to hit in any measure is usually the first one.",
                "At the end of the day, you're not going to be on stage with a metronome -- you'll be with a percussionist, other guitarist, or no one at all. That said, many recording studios use metronomes, so you do need both skills. Never rely on just one or the other to practice rhythm -- both of them are essential to becoming a top guitarist."};
    }

}
