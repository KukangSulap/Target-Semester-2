package com.barney.howtoberesponsiblewhenyouhaveacat;

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

        String[] any = {"Remove any hazardous items from your home",
                "Hide all electrical cords",
                "Keep your cat indoors",
                "Monitor the area around your home for other cats",
                "Feed your cat daily",
                "Provide water for your cat",
                "Clean the litter box regularly",
                "Groom your cat",
                "Play with your cat",
                "Provide your cat with their own space",
                "Take your cat to the vet",
                "Get your cat spayed or neutered",
                "Avoid keeping plants that are toxic to cats",
                "Keep loose strings away from the cat",
                "Give your cat an identification tag or microchip"};
        String[] deskripsi = {"Cats need to be in a safe place where there is little chance they can get hurt. If you have any breakable objects, they should be removed or placed out of your cat's reach. For example, vases, figurines, and glassware should be kept behind closed doors. You should also remove any small items, such as rubber bands, beads, safety pins, hair clips, etc. that could be choking hazards.[1]\n" +
                "Certain household plants, such as jade and aloe, can be toxic to cats and should be removed from your home. Ask your vet about poisonous household plants.",
                "Make sure all wires for televisions, phones, computers, etc. are hidden carefully. Cats are naturally playful and curious and they will likely bite on or play with cords if given the opportunity. This can be very dangerous and your cat could get seriously harmed from biting on an electrical wire.[2]\n" +
                        "Store wires behind furniture.\n" +
                        "Alternatively, you can tape cords to the floor or other furniture so your cat can’t access them.",
                "Responsible cat owners will not let their cats roam the neighbourhood unsupervised. This can be dangerous to both the cat and other animals in the area. Cats who are allowed outdoors can get into fights with other animals, or eat poisonous substances. They are also more likely to be killed by traffic.[3]\n" +
                        "Outdoor cats may also hunt and kill local songbirds and small rodents, which can have a negative impact on the local environment.",
                "Outdoor cats can fight with each other, which can cause injuries and spread diseases. It's best to keep your cat inside. However, some cats like to go outside. If your cat goes outdoors, keep an eye out for other cats that could harm yours. You can also take steps to discourage cats from coming into your yard:[4]\n" +
                        "Don't leave out food.\n" +
                        "Don't install a bird feeder.\n" +
                        "Install a motion-activated sprinkler around the perimeter.\n" +
                        "Make sure your cat is spayed or neutered.",
                "Feeding your cat is an essential part of responsible cat care. Make sure that you feed your cat a nutritional diet and that your cat has access to food on a daily basis. You may decide to feed your cat at specific times or let it graze throughout the day. Either option is fine. Choose the one that fits the best with your lifestyle.[5]\n" +
                        "If you ever go away make sure to arrange for someone to feed your cat.",
                "Cats should have access to water at all times. Although your cat may not drink a lot of water, it is very important that water is available throughout the day.[6]\n" +
                        "You should change your cat's water daily, even if the bowl still contains water.",
                "Although this is not the best part of cat ownership, it is essential! Not only will a dirty litter box smell, but your cat may avoid it if it is not cleaned. As a result, it is important that you clean the litter box at least twice a day, or after each use. To clean the box, scoop out the excrement and place it in the garbage.[7]\n" +
                        "The litter box should be placed away from your cat’s food and water, preferably in a quiet location.",
                "Cats are relatively clean animals and you will notice your cat grooming itself on a regular basis. However, you should still brush their coat at least once a week. This will help reduce shedding and prevents the likelihood that your cat will choke on a hairball.[8]\n" +
                        "You should also cut your cat’s nails every two to three weeks to prevent your cat from damaging furniture or clawing you.",
                "Your cat needs attention and stimulation throughout the day. You should play with your cat at least once each day. You can use toys, such as wand toys, to mimic different forms of prey. This will keep your cat active and engaged. Always let your cat catch the toy a few times during each play session.\n" +
                        "Do not tease your cat or play rough with your cat. This can cause aggressive behavioural issues.",
                "Cats like to have a little space to call their own, where they can curl up and enjoy the quiet. Set up a comfortable cat bed in a spare room in your home, or tuck it into an out-of-the-way spot with little human traffic.",
                "our cat should visit the vet at least once per year to ensure that all vaccines are up to date and to examine its overall health. Vaccinations can prevent your cat from developing fatal diseases, such as distemper, rabies, feline leukemia, calicivirus, and viral rhinotracheitis.",
                "This will help control cat populations and can positively impact your cat’s behaviour. Cats are less likely to spray urine after being spayed or neutered and in many instances cats will become more affectionate and less aggressive following this surgery.[10]\n" +
                        "You should have your cat desexed anytime over the age of six month.\n" +
                        "Cats that aren't spayed or neutered also add to the overpopulation of pets.",
                "Houseplants and cut flowers can be toxic if ingested by cats. Since cats are very curious, it's up to you to keep out plants that could harm them. Common houseplants that are toxic to cats include the following:[11]\n" +
                        "Aloe.\n" +
                        "Lily.\n" +
                        "Ivy.\n" +
                        "Chives.\n" +
                        "Daisies.\n" +
                        "Poinsettia.",
                "Cat's love to chase stings, but that game can turn toxic if your cat tries to eat the string, which is a common behavior. Innocent looking items like balloon strings, dental floss, and thread can harm the cat if ingested. Always keep these items off the floor and put away.[12]\n" +
                        "Make sure that dental floss and discarded strings are placed in the trash.\n" +
                        "Don't give your cat strings to play with unattended.\n" +
                        "Make sure items like yarn and thread are put away where the cat can't get them.",
                "Even though your cat will remain indoors, there is always the chance that it could slip out and get lost when you open the door. To avoid losing your cat, make sure it wears an identification tag on a cat safe collar at all times. Alternatively, you can have your cat microchipped. This way your cat can be returned to your address if found."};
    }

}
