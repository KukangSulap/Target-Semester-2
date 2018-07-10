package com.barney.howtopackyourbagforthegym;

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

        String[] any = {"Buy an adequately sized bag",
                "Gather plastic bags",
                "Pack from the bottom up",
                "Pack your bag the night before",
                "Leave emergency gym bags in your car",
                "Pack quality workout clothes",
                "Bring gym shoes",
                "Throw in a few hair ties or sweatbands",
                "Pack all the essential toiletries",
                "Keep a towel with you",
                "Bring a water bottle",
                "Throw in some snacks",
                "Don't forget the electronics",
                "Remember the sanitizer",
                "Don't overlook first aid"};
        String[] deskripsi = {"When choosing a gym bag, you want to make sure it has adequate room. Look for bags that have multiple, roomy compartments. You'll want to put your clothes in one compartment, shoes in a separate compartment, and your food in another compartment. If you can find a gym bag with smaller zipped compartments, that's even better. This helps you keep the different items in your bag separated while your bag remains organized.",
                "Collect some plastic bags for your various items. This is especially important if you don't have a gym bag with tons of separate compartments. It is important to separate the different items in your gym bag so you don't have things leaking on each other.[2]\n" +
                        "Get one larger bag to place your shoes in. You don't want your sweaty sneakers getting all over your clothes. Think about getting a shoe bag specifically designed for gym shoes. Placing your shoes in a bag can keep odors and bacteria at bay, saving your entire gym bag from smelling like dirty, sweaty feet.[3]\n" +
                        "Buy smaller Ziploc bags for toiletries and your underwear. You can pack your clean underwear in the plastic bag to keep it fresh, then place your dirty underwear in the bag after you change.\n" +
                        "You can also use the plastic bags for ice in case you have an injury.",
                "Start by packing your shoes either on the bottom of your bag or in your shoe compartment. Then pack all your items in your smaller compartments. Next place your toiletries into the bag, then add your towels and clothes on top so they won't get wet if one of your toiletries has a leak. Place any electronics or reading material on top.",
                "Mornings are rushed and crazy. Sometimes you oversleep, spend too long in the shower, your breakfast burns, or you end up hitting the snooze button three times. On mornings like this, the last thing you're thinking about is your gym bag. Remove that stress from your morning by packing the bag the night before.[6]\n" +
                        "Leave the bag by the door or near your briefcase, shoes, keys, or coat. That way, you won't accidentally walk out of the door and leave the bag in your bedroom floor.",
                "For those days that you do leave that gym bag on the bedroom floor, have a back up bag in your trunk. Keep only the necessities in this bag - a t-shirt or tank top, a pair of workout shorts, socks, an older pair of sneakers, and cheap headphones. This ensures that you never miss your workout.",
                "Two key items you must have in your gym bag are a workout shirt and bottom. Make sure the fabric is breathable and well-fitted. Think about what you are going to be doing that day; you wouldn't want your low-hanging pants to slip down when you're doing a squat or your shirt to fall over your face when you're bending over in yoga. Go for quality and usefulness over fashion.[8]\n" +
                        "Decide if you would like to wear tank tops or short sleeve shirts, along with workout shorts, tights, or pants. It doesn't matter as long as you keep in mind your fitness regiment.\n" +
                        "For colder months, pack a jacket and track pants. This is especially essential if you plan on walking out of the gym still wearing your gym clothes.[9]\n" +
                        "It's a good idea to pack extra underwear, especially if you are going straight to the office. You don't want to put on your nice, clean work clothes over sweaty underwear.[10]\n" +
                        "Ladies, you might want to pack a sports bra if you're planning on wearing your normal bra to the gym.",
                "Good shoes are essential for working out. Most gym goers can wear trainers or running shoes. If you are an advanced weight lifter, you may want lifting shoes instead. Regardless of the shoes you wear, make sure you pack them.[11] Trying to run on the treadmill in your work heels or loafers would probably not work very well.\n" +
                        "Don't forget the socks. Working out without socks would be gross and painful. Make sure to always have a pair of socks in your bag, even if you have worn a pair to the gym. You never know when your socks are going to slide down in your shoes, get wet, or have something else happen to them. Socks are essential items in your gym bag.[12]\n" +
                        "Make sure to bring flip-flops. Flip-flops are a must have if you are showering at the gym after your workout. You should never place your bare feet on the shower floor; instead, wear flip-flops to protect your feet from bacteria and fungi.",
                "For women, hair ties are necessary for keeping your hair pulled back and out of your face during workouts. For men or women with short hair, headbands or sweatbands can help keep the hair off your face and soak up the sweat.",
                "If you are hitting the gym on your lunch hour or before work, you need to make sure your gym bag contains the proper items to help you stay refreshed and professional for the rest of the day. Consider packing the the following:\n" +
                        "Deodorant and possibly some kind of body spray or cologne. Just be careful not to overspray the cologne and perfume, especially if you're not showering fully.\n" +
                        "Body wash. If you are a guy, you can buy a body wash and shampoo in one for the gym.\n" +
                        "Face wash or wipes, and moisturizer to clean your face of all the sweat. You might want to throw in some toner or astringent, too.\n" +
                        "Shaving cream and razor. Only pack this one if you're planning on shaving at the gym.\n" +
                        "Dry shampoo. This comes in really handy if you don't have time to wash, dry, and style your hair before getting back to work.",
                "It is good practice to keep a towel with you. Not all gyms offer towels for free, and though gyms wash them, they might not be the cleanest. To wipe up the sweat from your body or wipe down machines, bring your own towel.",
                "Hydration is essential when working out. Bring a water bottle so you can refill it as often as necessary. You don't want to be left without a way to hydrate yourself or have to buy an overpriced water at the gym.",
                "Pack healthy snacks into your bag for a pre- or post-workout boost. Try nuts, apples, protein bars.[17] Or go for healthy juice, bananas, and nutrition bars.",
                "No workout is complete without music, so make sure to keep headphones in your bag to hook to your smartphone with its playlist. If you have an iPod or iPod shuffle, keep that in your bag.\n" +
                        "You can also pack heart monitors, fitness trackers, and any other fitness equipment you have.",
                "Gyms can harbor a lot of germs since you are sharing equipment (and sweat!) with other members. To cut down on germs, bring hand sanitizer with you to rub on your hands afterwards.\n" +
                        "An alternate to hand sanitizer is bringing disinfectant towelettes or wipes. You can wipe your hands down, and more importantly, you can wipe the machines and weights down before touching them. Plus, towelettes and wipes won't open in your gym bag and make a mess.",
                "Small injuries can easily occur at the gym. Blisters, small cuts, and other abrasions can crop up from using the machines, holding barbells, or doing push ups. Be prepared for these instances by carrying band aids and small bandages in your gym bag."};
    }

}
