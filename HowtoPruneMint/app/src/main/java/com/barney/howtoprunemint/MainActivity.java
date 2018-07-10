package com.barney.howtoprunemint;

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

        String[] any = {"Prune mint back by about one third after flowering",
                "Shape your mint plant",
                "Store your mint for future use",
                "Mint is usually harvested fresh throughout the year",
                "Trim your mint plant regularly",
                "Use mint for cooking",
                "Turn a small harvest into a new mint plant",
                "Plant your mint in a pot",
                "Choose the right time to plant mint",
                "Water your mint plant often",
                "Fertilize your mint on occasion",
                "Plant your mint properly"};
        String[] deskripsi = {"Wait to prune mint until after it's fully flowered. Using a pair of shears, cut about one third of the length off the end of each stem.[1] Mint is a relatively hearty, fast growing herb, so do not be afraid to prune--your plant will be fine.\n" +
                "Pruning can actually encourage growth. This is not a destructive thing to do to your mint plant.\n" +
                "If you don't have shears or don't like to use them, you can also prune mint with your fingertips. This process will take a bit longer, but is just as effective. With your fingertips, pinch off about one third of the length of the stem. Use your fingernails when pinching the stems to create a clean break.[2]\n" +
                "It may be easier to use your fingertips if you're pruning a small amount of mint indoors. You might also want to use scissors or a sharp knife.",
                "As you're trimming your mint plant, consider what shape you'd like your plant to be in. You want to shape the mint in a way that grows in the confines of its pot without getting out of control. Mint can grow fast, and in many directions, so you want to trim your plan into a shape that's compatible with the pot.[3]\n" +
                        "Shape the plant so it does not have too many leaves and shoots pouring over the plant.\n" +
                        "Focus on trimming around the plant. Make sure the plant isn't sprawling too far over the side of the pot.",
                "After a big harvest, it's important to store your mint properly so that it can be used for months to come. There are various ways to store mint, the most popular being drying mint. There are several methods to dry mint, including baking it on the oven, hanging it to air-dry, and dehydrating it.\n" +
                        "You can freeze mint. Pick through your mint leaves and remove any damaged leaves. Pat dry the mint leaves with a towel. Cut up the mint leaves and remove the stems. Place about 1 to 2 teaspoons of leaves in various compartments of an ice cube tray, fill with water, and place in the freezer. Once the cubes are frozen, place them in an airtight container or bag and leave them in the freezer. Frozen mint will keep for three months.\n" +
                        "You can also vacuum seal mint. Once again, pick through mint to remove damaged leaves and pat the plant dry. Place the mint in a bag and label it with the date. Use a vacuum sealer, which can buy online, to vacuum seal the bag. Each vacuum sealer operates slightly differently, so you'll have to follow manufacturer's instructions.",
                "Avoid harvesting if the plant is not growing very well due to very cold weather or other bad conditions.",
                "Mint is mature when it begins to bloom (after about 90 days), but it can be harvested any time after it is 3 to 4 inches tall. Trimming your mint plant regularly will allow it to become full and healthy. You'll also be able to use fresh mint after each mini harvest.\n" +
                        "Make sure to trim your mint carefully each time it needs to be cut back. Remember to trim the mint so it grows in the rough shape of the pot you're using. If you're trimming mint outside, make sure to trim mint so mint plants do not overgrow your garden.\n" +
                        "While you can use shears to prune mint, small plants can easily be pruned just using your fingers.",
                "Small pieces of mint can be used in many recipes. If a recipe calls for dry mint, try using freshly cut mint in its place. This can add a stronger mint flavor. You can all add mint leaves to beverages like lemonade or mojitos to add flavor.",
                "If you want more mint plants, you can create them using the trimmings from your existing mint plant. Clip off 6 inches of a stem from your mint plant, and place it in a pot filled with potting soil. This stem will transform into its own plant with lots of sunshine and water.[6]\n" +
                        "Fill a plant with potting soil mixed with a heavy amount of compost. Take the stem you cut from the original mint plant and slide it into the soil.\n" +
                        "You can also place mint stems in a glass of water. Remove any leaves that would sit below the water line or they will rot. Eventually, roots will start to grow.",
                "Mint plants have a fast-growing root system, which is why it's best to plant your mint in a pot. If you plant mint in your garden without a container, it will quickly spread to take over the entire garden.\n" +
                        "If you want to plant your mint outside, dig a hole at least 5 inches deep, and place a container (such as a pot or a mesh bag) into the hole. Then, plant your mint inside of the container and pack dirt on top of it. The container will keep the roots from spreading to the entire garden.\n" +
                        "If you want to plant your mint indoors, purchase a pot to plant your mint in. Place the pot near a window where it will get sunlight throughout the day. Don't place the plant near a heat source.",
                "If you're leaving your mint outdoors, when you plant your mint is important. Make sure to plant your mint in the spring if you live in a climate that experiences winter. If you live in a frost free climate, mint will thrive in mid-fall.",
                "Make sure to water your mint often, as mint thrives in damp soil. Mint can grow in a variety of soils, but doesn't do well in dry environments. If you live in a dry environment, keep an eye on the plant and water it more frequently. Water your mint plant at least once per day.",
                "For the most part, mint should grow well enough on its own. However, you should occasionally supply a light amount of fertilizer to the soil surrounding your mint. This will encourage healthy growth. This can be especially helpful if you harvest your mint a lot.[9]\n" +
                        "Do not fertilize your mint often. Harvesting it every 3 to 4 weeks should be enough.\n" +
                        "Choose a fertilizer that's low in salt, as salt can cause the tips of mint leaves to turn brown.",
                "When you plant your mint, plant it so that it is about 1/4 inch below the surface. You should only plant one seedling if you're using a pot. If you're planting your mint in your garden, plant each seedling about 2 feet apart. Be sure to plant each seedling it it's own container.\n" +
                        "Make sure to plant mint where it can receive sunlight. When planting mint in pots, make sure you can move the pots near direct sunlight. Do not choose pots that are too big to fit on a porch or patio.\n" +
                        "While it's best to grow mint indoors, you can plant it inside. If you choose to do so, pick an area where your mint will be consistently exposed to morning light. You should also keep it away from anything like a heater or furnace, as this can dry mint out.\n" +
                        "Make sure the pot you use to plant mint is free from cracks. Mint roots grow fast, and they will spread through the crack of a damaged pot."};
    }

}
