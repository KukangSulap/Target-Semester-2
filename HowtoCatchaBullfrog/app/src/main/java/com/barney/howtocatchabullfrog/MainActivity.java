package com.barney.howtocatchabullfrog;

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

        String[] any = {"Choose your tools",
                "Find a good bullfrog habitat",
                "Listen for the chorus of bullfrog calls",
                "Go hunting at night",
                "Shine an LED light along the shoreline",
                "Move slowly and quietly",
                "Shine the light in their eyes",
                "Pounce quickly and use a firm grip",
                "Put the bullfrog in a closed container",
                "Let the little bullfrogs go",
                "Use a five-pronged frog gig",
                "Find out the bullfrog season",
                "Decide whether you are going",
                "Get a fishing or a hunting license",
                "Stay within the fishing or hunting limit"};
        String[] deskripsi = {"Bullfrogs can be caught bare-handed, but your hands should be clean and wet. Bullfrogs absorb things through their skin, so dirty hands could harm the frog. Alternatively, you may want to consider other tools, such as a frog gig. A frog gig is especially good for catching larger bullfrogs. If you don’t have a frog gig, a fishing net is also a good option. You’ll also need a flashlight and something to hold the bullfrogs, like a bucket.[1]\n" +
                "If you are catching frogs to keep in an aquarium, you may want to use a net or your hands.\n" +
                "A fishing net with a longer pole works best!\n" +
                "The brighter the flashlight, the better!\n" +
                "If you use a fishing pole, a fly fishing lure without a barb is a good choice.\n" +
                "If you're transporting the frog, consider bringing a large plastic bucket with a lid.",
                "Bullfrogs dwell in freshwater lakes, ponds, rivers, and streams. They tend to live where there is a tree canopy, cattails, and little to no current. Make sure you are hunting on public land during bullfrog season.[2]\n" +
                        "Never hunt for bullfrogs in a conservation area.\n" +
                        "Don’t hunt on private property, unless it is your own.",
                "Bullfrogs make a distinctive low-toned bass-like call, which sounds like a low \"Ru-u-umm - Ru-u-umm.\" From early spring until summer, the male bullfrogs will sing together in a deep, roaring tone. Follow this sound to catch them.",
                "Wait until the moon comes out to go frogging. Since it is easier to see the bullfrogs at night, you’ll want to wait till it is really dark outside.",
                "Use your LED flashlight to light up the shoreline of the pond or stream. Move the beam of light slowly until you see a pair of bullfrog eyes.[5]\n" +
                        "If the eyes are set wide apart, it is a big bullfrog.",
                "If you are walking, take gentle steps. If you are in a canoe, don’t let your paddle hit the side of the canoe. Stop and pause occasionally, since you are likely to spot frogs more easily if you search for movement on the banks or in the river or bog.",
                "As soon as you get to around 10 or 15 yards away, direct the LED light right into their eyes. This method is called “Jacking.” The bullfrog will go into a trance, like a deer in your car headlights. Use this opportunity to catch the bullfrog with your hands, frog gig or other instrument.[8]\n" +
                        "“Jacking\" a bullfrog means using a strong flashlight directed at the frog's eyes at night.",
                "Since bullfrogs are quick to respond to movement, you’ll need to pounce quickly and use a firm grip. They can easily slip out of your hands, so grab them firmly around the upper thighs. You will probably only get one chance.[9]\n" +
                        "Hold the bullfrog by grasping around the upper thighs with its legs together. This position minimizes chance of injury, while making it difficult for the critter to get away.",
                "Take the bullfrog off the gig, if you used one, and put it in the sack or container. Close the lid. If it is a burlap sack, pull the drawstring to close the bag. Unless you close the container or bag, the bullfrog will hop away!",
                "If you are catching bullfrogs to eat, you should let the little frogs go! Use your hands to catch the the little ones and then put them back in the water.",
                "If you see a larger size bullfrog with eyes set wide apart, you’ll need a bigger tool! Don’t bother with the regular sized, 2-inch frog gig. Rather, pick the five-pronged frog gig to ensnare the larger bullfrogs.",
                "You’ll need to find out the local bullfrog season for your region. Although a few places, like Texas and Florida, allow bullfrog hunting all year, most places have a few summer months designated for bullfrog hunting. Your local tackle store should be able to give you the dates for bullfrog season but, if they can’t tell you, you can always contact your local department of parks and wildlife.[13]\n" +
                        "For instance, the bullfrog season in Kansas goes from July 1st to October 1st.",
                "Since the type of license you require to catch bullfrogs often depends on how you will catch them, you’ll need to make this decision before getting your license. Once you have an idea of what kind of fishing or hunting instrument you want to use, such as a frog gig, you should contact your department of fish and wildlife to find out if it is legal and what type of license is required.[15]\n" +
                        "A traditional and challenging way of catching bullfrogs is by hand, which is a lot of fun!\n" +
                        "Many people prefer to use a six or eight-foot pole with barbed tines, which is called a frog gig. People also use fishing lines, dip nets, bows, and rifles.\n" +
                        "If you are using a fishing net, you may need a fishing license.",
                "Call your department of parks and wildlife to find out what license you need. If you are using fishing methods to catch bullfrogs, you’ll need a fishing license. However, if you are shooting bullfrogs, you’ll obviously need a hunting license. Pay for the license that is required for your region and the instrument you want to use.",
                "Your region will have a limit on the number of bullfrogs you can catch during bullfrog season, which is typically set by the department of parks and wildlife. Give them a ring or look on the website to find out the limit for your region. It is important to stay within this limit, which will help to ensure the integrity of local ecosystems and allow you to come back and catch more frogs next season![17]\n" +
                        "For instance, Kansas has a limit of 24 bullfrogs."};
    }

}
