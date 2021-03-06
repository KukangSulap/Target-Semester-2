package com.barney.howtothinlatexpaint;

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

        String[] any = {"Open your can of paint",
                "Stir the paint",
                "Assess the paint’s thickness",
                "Pour the paint into a bucket",
                "Add water",
                "Stir the paint and add water gradually",
                "Pour the paint through a funnel",
                "Test your paint",
                "Add more water if needed",
                "Start your project"};
        String[] deskripsi = {"If your paint is in a metal can, grab a flat edge screwdriver. Wedge the screwdriver’s head under the lid. Push down on the handle of the screwdriver to loosen the airtight seal. Repeat this process three to four times around the lid. When the lid is unsealed, remove it from the paint can.\n" +
                "This method may be used on old and new paint cans.",
                "Using a paint stick, stir the latex paint for 5 to 10 minutes. Stir the paint in an upward and downward spiral motion. This will combine the heavy molecules that settled on the bottom with the lighter molecules settled on the top.[1]\n" +
                        "Another method of mixing the paint is to pour it repeatedly from one bucket or paint can to another.\n" +
                        "Instead of a paint stick, use an electric drill with a paint mixing attachment.",
                "Observe the paint coming off the paint stick. Slowly lift the stick out of the paint and hold it over the paint can. If the paint coming off the stick looks like smooth, thick cream, it does not need to be thinned and doing so will actually render the paint unusable. If the paint remains on the stick or comes off in clumps, it needs to be thinned.[2]\n" +
                        "You can also use a funnel to evaluate the paint’s thickness. Hold a funnel over the paint can. Use a ladle to pour the paint into the funnel. If it flows freely through your funnel, then the paint is thin enough. If it does not flow freely through the funnel, it must be thinned.",
                "If you have a large paint job planned, then use at least a 5-gallon (19 l) bucket for this project. Thinning a large patch of latex paint will ensure consistent results![3]\n" +
                        "For quantities under 1 gallon, such as 1 pint, use a smaller bucket.",
                "For every gallon (3.7 l) of paint you plan to use, set aside 1/2 cup (118 ml) of water. The water should be at room temperature. Do not pour all of the water in at once, adding too much water will ruin the paint. Instead, pour it into the bucket in increments throughout the stirring process.[4]\n" +
                        "While you must thin latex paint with water, the amount of water you must add varies from brand to brand. Higher quality latex paint is thicker, therefore requiring more water; lower quality latex paint is thinner, therefore requiring less water.\n" +
                        "Most paint will require 1.6 cups of water per 1 gallon of latex paint. Instead of adding all of this water at once, however, it is better to begin by adding less water and gradually add more water as needed.\n" +
                        "Never add more than 4 cups of water per 1 gallon of latex paint.[5]\n" +
                        "If you are using pints of paint, add 2 tablespoons of water per 1 pint of latex paint.",
                "Use a paint stir stick to mix the paint thoroughly with the water. Move the stick in upward and downward spirals. Periodically pull the paint stick out and observe how the paint runs off the stick and into the bucket. If the paint is still clumpy or sticking to the paint stick, add a little bit more water. Repeat until the paint is a smooth, rich creamy texture.[6]\n" +
                        "Never add all of the water at once. Add it to the paint in small increments. Before adding more water, pull the paint stick out of the paint to see if it has become smooth or remains clumpy. Repeat as needed.\n" +
                        "Instead of stirring the paint, you can repeatedly pour the paint from one 5-gallon bucket to another 5-gallon bucket.",
                "Hold the funnel over the bucket of paint. Use a ladle or scoop to run the paint through a funnel. If it flows freely through your funnel, then it will also flow through your sprayer nozzle. If it does not flow freely through the funnel, slowly add more water until it achieves the correct consistency.",
                "Apply the thinned paint to a piece of scrap wood or cardboard with either a paint sprayer or a paint brush. Allow it to dry before adding a second coat.[7] After adding the second coat and allowing it to dry, observe the results. Paint that is too thin tends to drip when applied. Paint that is too thick can achieve a texture like that of an orange peel. Paint that is the right consistency will dry smooth and not drip.[8]\n" +
                        "When using a sprayer, pour the paint through a strainer and into the reservoir. This will remove any debris that could clog the nozzle. Cap off the reservoir and grab the sprayer. Place the nozzle 8 inches away from the scrap wood or cardboard and spray.The paint should flow smoothly.[9]\n" +
                        "When using a brush, dip the tip into the paint. Spread the paint smoothly and evenly over the scrap piece of wood. Allow the first coat to dry before adding a second coat.\n" +
                        "Test your paint thoroughly before applying it to a large surface.",
                "If the latex paint is still too thick, measure out an additional half cup of water per gallon of paint. Incorporate the room temperature water in increments while mixing until you achieve the desired consistency. Repeat the funnel test to measure the paint’s viscosity.[10]\n" +
                        "If you are not successfully thinning the paint with water, try adding a commercial thinning additive. These products are very expensive, so always try water first!",
                "Once you have thinned your latex paint, you can begin your project! If using a sprayer, pour the paint into the reservoir through a strainer. If using a brush, pour the paint into a paint tray. Apply the thinned latex paint smoothly and evenly.[11]\n" +
                        "Remember, it is less expensive and time consuming to properly thin latex paint than it is to remove improperly thinned latex paint and purchase more materials!"};
    }

}
