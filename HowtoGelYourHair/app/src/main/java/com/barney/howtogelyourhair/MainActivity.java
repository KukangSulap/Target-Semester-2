package com.barney.howtogelyourhair;

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

        String[] any = {"Choose the right gel",
                "Wash your hair to get started",
                "Scoop out some of the gel",
                "Apply the gel",
                "Complete your style",
                "Try a messy and informal look",
                "Try a simple part",
                "Go for a classic slicked-back look",
                "Try spiking your hair",
                "Try a pompadour"};
        String[] deskripsi = {"Hair gels are usually categorized by the thickness of the compound and the power of the hold. The color and the scent of hair gels generally doesn't make any difference in terms of how they work. Most gels are applied with the fingertips, but there are a few which are spray-on. Decide which is best for your style, or try out each one and see which you prefer.\n" +
                "A light, foamy gel is effective in creating a playful, messy look. You'll still be able to have some bounce and some life in your hair.\n" +
                "A medium-hold gel is great for shiny spikes, getting your hair to stay in almost gravity-defying ways.\n" +
                "A thick gel will give you a slicked-back look, holding it in place firmly all day. You might not be able to run your fingers through it, but it'll hold fast in a windstorm.",
                "Starting with a solid foundation of clean hair will make creating your gelled style much easier. Shampoo and condition your hair as per normal, and then use a towel to dry it until damp. It’s important to have damp hair when you apply gel, so don’t dry it thoroughly. If you’re short on time, dampening your hair in the sink is also a good option.[1]\n" +
                        "Applying gel to dirty or greasy hair can make the gel less affective and more \"crunchy\" looking. It also promotes split ends and poor hair health, so it's always a good idea to give your hair a thorough washing first.",
                "Put a small dab of hair gel onto your fingertips and rub your hands together to coat your hands evenly and rub it into your hair, as if it were shampoo. Depending on how thick and long your hair is, you'll need to use an appropriate amount of be sure to spread it evenly across your fingertips. Remember, you can always add more, but it's hard to get hair gel out of your hair without rewashing, so go easy:\n" +
                        "Use a dime-sized amount for short hair.\n" +
                        "Use a quarter-sized amount for medium-length hair.\n" +
                        "Use two or more quarter-sized amounts for long (or especially thick) hair.",
                "Style your hair according to the look you’re going for (as aforementioned). Generally, you should start with the gel just above your hairline, and work it back towards the crown of your head/nape of your neck. Use your fingers to apply the gel, and if desired, use a comb to better incorporate the gel afterwards.\n" +
                        "For a straight-haired look, brush or shape hair to your desired style.\n" +
                        "Scrunch or twist your hair with your fingers to encourage curls.\n" +
                        "To give curly or wavy hair extra volume, especially at the roots, flip your head over to scrunch the gel in evenly.",
                "Most hair gels contain alcohol which allows them to dry quickly. If yours does not, you’ll need to wait a few minutes for the gel to set. You can manipulate the gel while it’s wet, but once it dries it will become stiff and firm. When the gel has set, your look is finished and you’re ready to show off your new hair!",
                "Gel is the best go-to hair product for creating that messy-yet-sophisticated look with your hair. This is great for days when you want to look casual yet put-together, and don’t have much time to style your hair.\n" +
                        "To create this look, spread the gel through your hair using only your fingertips, moving strands in different directions and taming fly-aways.\n" +
                        "The best gel for this type of look would be a lighter gel, and the best type of hair would be medium-length hair of moderate thickness.",
                "If you don’t want to spend a lot of time on your hair and are just looking for a way to keep it in place, gel is a good option. The idea with this style is that you make your hair look as natural as possible, parting it along it's natural line, but without risking frizz and a cowlick as the day goes on that would come from simply combing.\n" +
                        "Put a very small amount of gel in your hands, and finger-style your hair, pulling it down the side of your head along the part, in opposite directions.\n" +
                        "Take a comb and dampen it slightly under the water, then comb along the hair in the direction you started, if you want it to look slightly neater.\n" +
                        "This type of look is best with thinner hair of moderate or short length, but is also perfectly useful for all types of hair. It can be an effective style for masking a receding hairline, as well.",
                "Few things are as sophisticated as a slicked-back hair style reminiscent of Don Draper, Pat Riley, or Jay Gatsby. This type of hairstyle looks classy and simple. This look is best for special occasions and formal settings, and can be achieved with a heavy amount of gel and a fine-tooth comb.\n" +
                        "Spread the gel through your hair, sweeping your hair from the line of your forehead toward the back of your head, without parting it. Use the damp comb to sweep it into place as neatly and flatly as possible.\n" +
                        "This type of look works best with medium-longish hair of moderate thickness. It can emphasize a receding hairline, so be cautious if things aren't quite as thick up there as they used to be.",
                "If you’ve always dreamt of rockstar spiked hair, you can easily recreate the look with some of your favorite hair gel. Although this style is generally only appropriate for casual settings (don't wear it on a first date) it can be a fun change of pace.\n" +
                        "Use a dollop of gel on your fingertips, and spread it upwards through your hair, pulling your hair away from your head and pinching it in between your fingers to create spikes. For a milder look, you can do this only to the front portion of your hair.[3]\n" +
                        "Wait a few minutes and the let the initial spikes dry, then get a very tiny amount of gel on your fingertips and go back through, strengthening the spikes and building them up slightly, if you want to really emphasize them.\n" +
                        "This style looks best with medium-length hair of moderate thickness. If it's too long, you'll probably need to use hair spray (and maybe even egg whites) in conjunction with the gel to get things to stay in place.","" +
                "You know you want to. Channel your inner Elvis Presley and Conan O'Brien with this almost over-the-top rockabilly style. It's maybe the most challenging to style and to pull off, but it's basically a combination of some of the above techniques. Even if you just try it while you're sitting around the house one day, it's something to cross off the bucket list.\n" +
                "Put a liberal amount of gel into your fingertips and do a basic mussed-up look, getting your hair into a combination of spikes and casual messiness. Then, take a medium-tooth comb, wet it, and run it along the sides of your head, above each ear.\n" +
                "If you want a more formal pompadour, you can do a neat part along your natural hairline to one side with the comb, keeping it straight, then do the same straight-back action with the comb on both sides. You might need to use your fingers to get the front tips up as high as you want.\n" +
                "This works best for hair that's longish on top and quite short, or even buzzed, on the sides."};
    }

}
