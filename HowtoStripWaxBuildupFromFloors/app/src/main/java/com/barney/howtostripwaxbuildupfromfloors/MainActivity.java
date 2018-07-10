package com.barney.howtostripwaxbuildupfromfloors;

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

        String[] any = {"Strip old wax from vinyl with dishwasher detergent and ammonia",
                "Mop with a solution of water and ammonia",
                "Use ammonia, warm water, and laundry detergent",
                "Scrub vinyl floors with club soda",
                "Strip wax from stone tiles",
                "Scrub with a solution of cream of tartar and vinegar",
                "Try an isopropyl alcohol solution",
                "Rinse and dry the floor",
                "Scrub the floor with odorless mineral spirits",
                "Wipe and dry the floors",
                "Use safety precautions"};
        String[] deskripsi = {"Use a sponge mop to saturate your floor with a solution of 2 gallons (7.57 L) of hot water, 1 cup (240 mL) of non-bleaching powder dishwasher detergent and 2 cups (480 mL) of ammonia. Allow the solution to sit on the floor for a couple of minutes. Scrub gently using the scrubber edge of the mop or a scrub brush, then mop up any extra liquid. Go over the floor again with clear hot water, using your scrubber to remove any remaining wax.[1]\n" +
                "You may need to scrub corners and around baseboards by hand.\n" +
                "Dry the floor with old towels or rags.",
                "Combine ½ cup (120 mL) of ammonia with 2 gallons (7.57 L) of warm water. Use this solution to mop your vinyl or tile floor. Let it sit on the floor for at least ten minutes to eat through the wax buildup. Dry the floor with old towels.[2]\n" +
                        "Repeat the process if needed to completely remove the wax.\n" +
                        "Use hot water to clean epoxy floors. Mix ½ cup (120 mL) of ammonia with 2 gallons (7.57 L) of hot water and mop with a hard foam mop.",
                "Mop your tile floor with a solution of ¾ cup (180 mL) of ammonia and 1 cup (240 mL) of laundry detergent and 1 gallon (3.785 L) of warm water. Allow the solution to sit on the floor for about ten minutes. Scrub the floor with a scrubbing sponge or stiff scrub brush. Rinse the solution from the floor with clean water.[4]\n" +
                        "Dry with old towels or rags before applying new wax.\n" +
                        "Try the same stripping method on your tile floors with a solution of 1 cup (240 mL) of white vinegar, 1 cup (240 mL) of ammonia, and 1 gallon (3.785 L) of warm water.[5]",
                "Pour club soda directly on a section of your floor. Scrub with a stiff scrub brush or scrubbing sponge. Let it soak into the floor for a few minutes, then wipe the floor dry.",
                "Buy a polish-stripper that is made for the type of stone you have. Apply a liberal amount of the polish-stripper to a section of the floor. Let it set for about 10 minutes, then scrub it vigorously with a wire brush. Wipe up the stripper with rags and mop the section of floor with clean water to remove any stripping product. Repeat this process until you have scrubbed and mopped the entire floor.[7]\n" +
                        "You can scrub the polish with a floor buffer that has a stripping pad.\n" +
                        "Try wiping up the stripper with a wet/dry vacuum that has a squeegee attachment.",
                "Mix 1 cup (240 mL) cream of tartar into 1 gallon (3.785 L) of white vinegar, stirring until the tartar dissolves. Saturate the floor with the solution and let it sit for about 5 minutes. Hand scrub a section of the floor in a circular motion using a nylon scrubbing pad. Wipe with a damp cloth or sponge, then move onto the next section of floor.[8]\n" +
                        "Repeat this process in any areas that still have wax buildup.",
                "Mix 3 parts water to 1 part isopropyl alcohol. Before scrubbing the wax with this solution, put on rubber gloves and open your windows to ventilate the room. Scrub the floor using the water and alcohol solution and a stiff scrubbing brush or nylon scrubbing sponge.",
                "Mop your floor with clear, warm water after you’ve scrubbed it with the cream of tartar and vinegar or the isopropyl alcohol solution. Dry the floor thoroughly with old towels or rags. Once the floor is dry, you can apply fresh wax.",
                "Rub the mineral spirits into the wood. You can also use fast-drying naphtha. Scrub away the old wax using old rags or fine steel wool.",
                "After you scrub away the wax, wipe up the old wax, mineral spirits or naphtha with clean, soft rags. Rub it dry with old towels or rags. Prevent damage to the wood by making sure the floor is completely dry. Finish up by applying fresh wax and buffing the floor.",
                "Ventilate the room well as you scrub the floor and as it dries. Wear rubber gloves as you scrub and to dispose of your old rags and steel wool. If using naphtha, protect your eyes with goggles. Soak the rags you use in water and store them in an airtight container before you dispose of them at a hazardous waste disposal facility."};
    }

}
