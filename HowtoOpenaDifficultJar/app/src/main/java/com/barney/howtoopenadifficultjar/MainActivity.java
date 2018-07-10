package com.barney.howtoopenadifficultjar;

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

        String[] any = {"Find something to grip the jar",
                "Grip the lid with your chosen item",
                "Twist off the lid",
                "Hold the jar tightly in your non-dominant hand",
                "Slap the bottom of the jar with the center of your palm",
                "Unscrew the lid",
                "Dent the edge of the jar lid with a firm object",
                "Unscrew the lid",
                "Heat a small amount of water",
                "Place the jar upside-down in the hot water",
                "Open the jar",
                "Grab a utensil you can use to pry up the lid",
                "Place the edge of the utensil under the lid",
                "Push the utensil up and out to loosen the jar",
                "Unscrew the lid",
                "Get a hair dryer or another source of direct heat",
                "Blow hot air around the edge of the lid",
                "Open the lid with a towel or glove"};
        String[] deskripsi = {"Jar lids are slippery, and it can be difficult to get a good grip on them using your hands alone. Gripping the lid with something aside from your fingers can make it can make it much easier to successfully open a finicky jar. Grab one of the these items to help you get a grip:\n" +
                "A rubber jar opener\n" +
                "A rubber glove\n" +
                "A silicon pad\n" +
                "Grippy shelf liners\n" +
                "A wide rubber band",
                "Place your palm on the top of the lid and apply pressure. Grasp the edges of the jar with your fingers. Use your other hand to hold the jar steady.",
                "Most jar lids open by twisting to the left (counterclockwise). Keep a firm grip on the jar to avoid spilling its contents. Alternatively, you can grip the lid firmly and apply force on the jar instead of the lid. If you're still having trouble opening the jar, move on to a method that breaks the seal.",
                "Hold it at a 45-degree angle with the bottom exposed.",
                "This causes a water hammer effect, raising the pressure near the lid and breaking the vacuum. Only slap hard enough to break the seal, but not hard enough to hurt your hand or break the jar. You should hear a \"pop\" sound when the seal breaks.",
                "Hold the jar upright and turn the lid to the left. It should come off without trouble if the seal was successfully broken.",
                "Hold your spoon at a 45-degree angle. Use it to strike the side of the jar lid hard enough to make a slight dent. Rotate the jar about an inch and strike it again. Continue to dent the lid until you've gone all around and you hear the seal pop.\n" +
                        "Make sure you hold the jar tightly with your other hand, so the jar doesn't fall over and break when you strike it.\n" +
                        "Be careful not to strike the jar itself, or strike too hard. The jar could shatter.",
                "Once you hear the seal pop, hold the jar upright in one hand. Use the other hand to turn the lid to the left and remove it. Check the jar's rim to make sure it did not get chipped before using the contents of the jar.",
                "You only need enough water to cover the lid when you turn the jar upside down into the water pot. Turn off the heat when the water is hot.[2]\n" +
                        "Hot tap water will also do the trick, especially if the jar is cold to start. Fill a small bowl with enough hot tap water to cover the lid.\n" +
                        "Or you can simply run hot tap water over the lid, making sure it doesn't touch the rest of the jar.",
                "Make sure the lid is submerged, but the jar itself is not covered in hot water. The hot water will make the lid expand temporarily and break the seal. Let the lid sit for one to two minutes, until you hear the seal pop open.",
                "Hold the jar upright, wipe off the water, and open it up. The lid should screw off easily once the seal has been popped. The heat may have melted the contents of the jar.",
                "You can use a number of different kitchen utensils to break the seal. Try one of these:\n" +
                        "A butter knife\n" +
                        "A teaspoon\n" +
                        "An old-fashioned triangle can opener\n" +
                        "A bottle opener\n" +
                        "Any other strong, thin-tipped object","" +
                "Stick it into the place where the bottom of the lid juts over the mouth of the jar. Push the utensil until it is firmly wedged between the lid and jar.",
                "Apply force to the utensil like a lever. Separate the lid from the jar a little to break the seal. Scoot the utensil over and do the same in another spot. You should hear a \"pop\" sound when the seal breaks.\n" +
                        "Be careful! Thin glass jars could crack, plastic could puncture.","" +
                "Once you hear the seal pop, hold the jar upright in one hand. Use the other hand to turn the lid to the left. It should come off easily with a gentle twist.",
                "Heating the lid will cause it to slightly expand, breaking the seal. It can also help melt jam or other food that may cause a lid to stick.\n" +
                        "This method may only be used to open jars with metal lids. Do not heat plastic lids, as they may melt.\n" +
                        "Only use this method as a last resort. Heating a jar lid can cause it to become hot enough to burn your skin. Be very careful when handling the jar.",
                "Do this just long enough to heat the lid. Don't hold it for too long in any particular place, or the lid could warp",
                "Don't place your hand directly on the lid, since it will be very hot. The lid should easily twist off. The heat may have melted the contents of the jar."};
    }

}
