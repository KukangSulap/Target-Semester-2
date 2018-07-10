package com.barney.howtocleanametalroof;

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

        String[] any = {"Wait for dry weather and overcast skies",
                "Clean only those areas that are easily reached",
                "Have a partner",
                "Secure yourself",
                "Favor using plain water over chemical cleaners",
                "Use pressure",
                "Clear a path first",
                "Start from the top if possible and blast downward",
                "Work slowly and patiently",
                "Mix water and mild detergent for stubborn areas",
                "Use a cloth or sponge to clean",
                "Scrub problem areas with your detergent solution",
                "Repeat with stronger cleaners if necessary"};
        String[] deskripsi = {"Avoid cleaning your roof in direct sunlight. Keep in mind that metal and light-colored paint will reflect sunlight and create glare, which may drastically reduce your vision. If the layout of your roof requires you to climb onto it, do so when it’s dry out to reduce the risk of slipping.[1]\n" +
                "Of course, once you start washing your roof, it will get wet and pose a risk. However, it’s still a smart idea to reduce that risk as much as possible.",
                "Before you haul all of your gear up, set up your ladder. Climb onto the roof and judge your ability to reach all of its parts. If you feel that certain parts are too precarious for you to safely reach, err on the side of caution and do not attempt to clean it.[2]\n" +
                        "Keep in mind that your power washer or hose will extend your reach considerably. If any out-of-reach areas look like they need scrubbing afterward, hire a professional to do so.",
                "Do not attempt to wash your roof alone. Whether you need to mount the roof itself or can do the job from a ladder, play it safe. Ask someone to spot you so they can:[3]\n" +
                        "Assist you in bringing gear up and down.\n" +
                        "Alert you to any hazards that you may not be aware of.\n" +
                        "Call for help in the event of an accident.",
                "Protect yourself from a fall. Wear a safety harness. Attach a safety line between that and a sturdy feature of your roof (like a chimney).[4] If none are available, use either a:[5]\n" +
                        "Bolt-strap anchor for corrugated roofs.\n" +
                        "Ridge clamp for standing-seam roofs.",
                "Expect clean water alone to get the job done most of the time. Save yourself the time and money and use chemical cleaners only when absolutely necessary.[6] Expect these to leave behind streaks and film if you don’t thoroughly rinse them off.[7]\n" +
                        "Rinsing your roof with water at least once a year should reduce the need for using chemical cleaners.",
                "Don’t expect a simple splash of water to accomplish much. Use pressurized water to blast dirt away. For a light job, start by using your garden hose and a wand or spray nozzle attachment and see if its jet setting is strong enough to work. If not, rent or invest in a power washer and use that instead.",
                "Avoid stepping directly onto dirt, grime, and debris. Treat any material other than the roof itself as unstable. Before climbing onto or advancing along your roof, use your hose or power washer to clear a path for yourself to reduce the chance of slipping.[9]\n" +
                        "If you have to first clear a path in order to attach safety lines and other gear to the roof, wait until the washed path has dried before climbing onto the roof.",
                "Make washing easier by cleaning the highest points first so the dirty runoff flows over yet-to-cleaned sections. Continue blasting dirt and debris by advancing downward along the roof’s slope while steadily pushing dirt and debris down toward its edge. However:[10]\n" +
                        "Roof designs vary greatly, so don’t treat this as an absolute must. If your roof is particularly steep and/or has sections well out of reach, always opt for safety and hose it down from a lower, safer point.",
                "Don’t rush the job. Opt for a slow and steady approach to ensure safety. Advance along your roof at a safe pace while minding your footing at all times to minimize the risk of slipping.",
                "For any areas that don’t wash away with pressurized water, fill a bucket or other container with water. For every part water, combine 0.05 part mild dish or laundry detergent.",
                "Opt for something soft to protect your roof’s paint and parts. Avoid using more abrasive materials like steel wool or wire brushes. Expect these to scratch and otherwise damage your roof.",
                "Soak your cloth or sponge in the water/detergent mixture. Scrub from the bottom of the panel upward in a left-to-right, back-and-forth fashion. Once each panel is clean, rinse it immediately with clean water to prevent streaks and film. Then wipe the panel again with a cloth or sponge soaked in plain water.[14]\n" +
                        "With persistent dirt that refuses to come off, go slow and steady and scrub for longer rather than apply more pressure to speed things up. The more pressure you add, the greater the risk of damaging the panel.",
                "If stains or other eyesores remain no longer how you scrub with your detergent solution, check with the roof’s manufacturer or installer about using stronger agents, since some may damage the roof, depending on its materials.[15] Whichever cleaner they recommend, follow its directions regarding use. Scrub the dirty panels in question in the same manner that you did with your detergent solution.[16]\n" +
                        "If the cleaner has bleach as an ingredient, rinse the scrubbed area with clean water immediately afterward. Do not wait until you complete a whole panel as you did with the detergent. Rinse all panels again when the entire job is finished."};
    }

}
