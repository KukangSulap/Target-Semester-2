package com.barney.howtoenjoyablackberry;

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

        String[] any = {"Shop for blackberries",
                "Ensure the blackberry is ripe",
                "Avoid moldy or unripe berries",
                "Prevent mold from forming on the blackberry",
                "Rinse each blackberry thoroughly with water",
                "Consume the blackberry",
                "Eat a blackberry raw",
                "Create a blackberry jam",
                "Enjoy a blackberry as part of a fruit salad",
                "Bake a blackberry pie"};
        String[] deskripsi = {"Believe it or not, there are plenty of different ways to obtain blackberries. Some people prefer to go to their local grocery store, while others prefer picking them straight off the bush.\n" +
                "Some people can tell a taste between organic and non-organic blackberries, organic fruits can offer added health benefits. Non-organic blackberries use pesticides to keep the bugs away, and preservatives to prevent mold from growing.",
                "In the grocery store, blackberries most often come in clear plastic containers pre-picked, with holes on the container for air to pass through. It’s best to check all around the container at all sides of the visible blackberries to avoid choosing a container with moldy berries on the bottom.\n" +
                        "When picking from the bushes in hedgerows or on a farm, look for fully ripe, blackberries with no mold. Blackberries do not ripen after they're picked.[2]\n" +
                        "Blackberries are seasonal fruits that peak in the summertime in the United States and in Autumn in the UK and elsewhere in world. [3] When not in season, you have to look carefully for signs of unripe blackberries.",
                "Although other fruits like bananas and avocados may be safe to pick before they’re fully ripe, blackberries will just remain unripe and unappetizing. Some signs of moldy or unripe blackberries include:\n" +
                        "Temperature. (Berries mold more quickly when left at room temperature.)\n" +
                        "Fuzzy growths on the berries.\n" +
                        "Dis-colorization.\n" +
                        "Bruising or dents in the fruit.\n" +
                        "Soft spots and wrinkles.\n" +
                        "Leaky juices.",
                "If you don’t use all the blackberries at once, then the berries can spoil very quickly. Leaving berries out at room temperature can cause them to mold overnight.\n" +
                        "Leave only 1-2 days’ worth of berries in the refrigerator. They’ll spoil after that.\n" +
                        "If you want to keep more for longer periods of time, you can freeze blackberries for several months without air. (Be sure to wash them first!)\n" +
                        "Wash the berries right before you are about to consume them.[4] Once they're washed, berries are more likely to go bad.\n",
                "It’s also wise to rinse the blackberry before freezing them, too. If you rinse before storing them in the refrigerator, you risk allowing the berry to mold quicker.\n" +
                        "Don’t press too hard while rinsing, as blackberries can be easy to squeeze.",
                "There are many different uses of blackberries. They are flavorful and can enhance an entree or dish, or they can be enjoyed alone as a fruit or on a salad. You can also create blackberry jams. Adding blackberries to yoghurt can also enhance the taste of a plain but healthy dish.\n" +
                        "You can find more recipes and uses for blackberries on recipe sites such as Allrecipes.",
                "You can start by taking a small bite out of the side of the berry, and work your way around the center, avoiding the seeds. The center and seeds of blackberries can be bitter to some.\n" +
                        "Alternatively, you can put the whole blackberry in your mouth and enjoy the full taste, including the center and the seeds.\n" +
                        "For the most health benefits, eat the entire blackberry. Blackberries are very high in Vitamin C and other essential nutrients.",
                "If you have some blackberries left over, you can easily make a blackberry jam with leftover or frozen berries. Sometimes, it can be easy as mashing up the leftover berries and using it on toast.\n" +
                        "Berry jams can be made from virtually any berries. All you need is a pot, stove, mason jar, berries and sugar. Place the berries and 1 1/2 cups of sugar in the pot over medium heat, and watch until the sugar dissolves. Leave the jam to simmer for 15 minutes, then remove it from the heat.",
                "Many times, blackberries can complement a fruit salad alongside blueberries, strawberries and raspberries.[8] You can add mangos and cantaloupe for more color and a different texture. This dish is nutritious and refreshing, especially in the summertime.\n" +
                        "You can add blackberries to nonfat yoghurt and muesli, or just put them on top of a crumpet with a dollop of yoghurt.[9] Blackberries can naturally sweeten and enhance your breakfast or mid-morning snack.\n" +
                        "Remember, you can enjoy the blackberry whole, or eat around the center or the seeds if you want to avoid a bitter aftertaste.",
                "Similar to apple or strawberry pies, blackberries can be used as a primary ingredient for a summertime dessert pie. Add some whipped cream and enjoy as you would any other fruit pies.\n" +
                        "Most recipes for blackberry pies are as simple as blackberries, sugar, flour, milk, and pie crust. Combining the berries, sugar and flour into the pie shell and placing it in the oven for 15-35 minutes can emerge a wonderfully baked blackberry pie."};
    }

}
