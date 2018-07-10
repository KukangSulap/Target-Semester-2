package com.barney.howtomakeaheatingpad;

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

        String[] any = {"Fill an old sock with uncooked rice",
                "Consider adding lavender oil",
                "Tie or sew shut the sock",
                "Heat it up in the microwave",
                "Grab a zip-lock freezer bag",
                "Pour rice into the bag",
                "Pop it in the microwave",
                "Get your chosen fabric",
                "Cut it to size",
                "Pin the two pieces of fabric together",
                "Sew along the edges",
                "Pour in the rice and sew it shut",
                "Use it for lower back pain",
                "Use it for headaches",
                "Use your heating pad for other",
                "Consider using it as a cold press"};
        String[] deskripsi = {"The most simple method for a reusable rice-filled heating pad. It just requires and old sock, some rice, a microwave and something to tie or sew the sock shut. First of all get hold a a good sized clean cotton sock that you won't miss, and then pour in the rice.\n" +
                "There is no fixed amount of rice to use, but it is recommended that the sock be at least half or three quarters full.[1]\n" +
                "Don't overfill it though. There should be a bit of flexibility so that the pad can rest comfortably on your skin.\n" +
                "You want it to be able to mold itself to the shape of your body a little.[2]\n" +
                "Some alternative fillings to rice include corn, barley, oatmeal and beans.",
                "If you are making a heating pad to try to soothe your headaches, you can add some herbal ingredients to help. The most commonly cited extra ingredient is lavender oil. Simply mix in a few drops, 4-6, of essential 100% lavender oil in with your rice.[4]\n" +
                        "It's best to mix this in before you put the rice in the sock.\n" +
                        "Other suggestions for herbal additions include marjoram, rose petals, and rosemary.[5]\n" +
                        "You can use dried herbs.",
                "Once you have added the rice, you need to secure it by closing up the sock. For those that are handy with a needle and thread, it'll be straight forward enough just the sew shut the open end of the sock.\n" +
                        "An even easier option is just to tie off the end of sock.\n" +
                        "Tie it as close to the end of the sock as possible.\n" +
                        "Tie it as tight as you can as you don't want any rice slipping out.",
                "Now you have made your rice sock all you need to do is heat it up in the microwave. Simply put your secured sock in the microwave and heat it up. The length of time you will need to put it in for will depend on the size of sock and amount of rice you have used.\n" +
                        "One and a half to two minutes should be long enough.[7]\n" +
                        "Keep an eye on it and don't leave it unattended.\n" +
                        "As a safety precaution you can put a cup of water in alongside the sock. If you have added dried herbs, this is a good idea.",
                "This is a very quick and easy way to make a heating pad. All you need is a zip-lock freezer bag, and some uncooked rice. Make sure the freezer bag is microwave safe, if not it'll melt and smoke and be a disaster. If you have just found a freezer bag around the kitchen and aren't sure if it's microwave safe, don't use it.",
                "Once you are certain you have a bag you can use in the microwave, pour in some rice. Fill the bag so that it is about three quarters full with uncooked rice and then secure it with the zip-lock across the top.",
                "Warm it up in the microwave for a minute, adding another seconds to a minute if necessary. Once it is heated up, take it out out the microwave and wrap it in a hand towel or other piece of insulating fabric.[10] You don't want to put the heated bag directly onto your skin.",
                "You choose pretty much whatever you like to make the heating pad, but you will want to use a cotton fabric, such as a T-shirt or a pillowcase. Cotton is able to withstand high heats so this is the best choice for your fabric. Ask yourself if what you have chosen would handle being ironed a high heat as a basic guide to it's suitability.[11]\n" +
                        "Make sure nobody is going to miss whatever you decide to use.",
                "In theory you could make your heating pad in whatever size or shape you like, providing it will fit in the microwave when you're done. The obvious shape to use would be a rectangle, but the same basic methods apply to whichever shape you opt for. Cut two pieces of fabric to your desired shape that are the same size.[12]\n" +
                        "If you using a rectangle something like a book can be a handy template.\n" +
                        "You can use a plate for a circular one.\n" +
                        "You can also use a sleeve from an old shirt.",
                "Once you have your two equal size and shape pieces of fabric you need to pin them together in preparation for sewing. You should have the side of the fabric you want to be displayed on the finished article facing inward now. When you sew it together it will be inside out.[14]\n" +
                        "Doing it this way means that the stitching will be more hidden and neater.",
                "Now you need to sew the two pieces of fabric together. You can do this either on a machine or by hand, whichever is best for you. Sew along the sides, but be sure to leave a gap of an inch or two on one side. You will need this to turn it the right way out, and to add the rice.[15]\n" +
                        "Push the fabric through this gap to turn it the right way out.\n" +
                        "This might be a bit tricky, so be fairly careful, especially if your sewing isn't the best and could come loose.",
                "Now pour in the rice so it is around three quarters full. You might find it helpful to use a funnel to get the rice in, especially if the hole is small. Go ahead and sew shut the gap you left. Now your pad is full of rice it could be tricky to manoeuvre with a sewing machine, so you might find it easier to sew this bit by hand.",
                "There is some evidence that adding heat to your lower back can help relieve pain there,as heat can release tension in muscles. To use your heating pad for this simply lay it on your lower back, or the part of your back which is sore. Leave it there for fifteen to twenty minutes.",
                "Heating pads can also be used for headaches and migraines in a similar way as for back pain. The heat relaxes tense muscles which can ease the pain in your head which is caused by a headache or migraine. Just place the pad on your head or neck to feel the benefits.",
                "As the heat from your heating pad relaxes muscles, you can use to it to relieve pain anywhere on your body that you feel discomfort or aching. Pads like this are often used to ease tense neck and shoulder muscles as well as back pain.",
                "You can also use the same heating pad as a cold press, simply by cooling it in the freezer first. There is less proof that cold will be as effective for lower back pain as heat will be.[20] If you are using a plastic bag, be sure to wrap it in a towel before applying it to your skin."};
    }

}
