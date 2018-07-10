package com.barney.howtosleeppeacefully;

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

        String[] any = {"Relax before bed",
                "Don’t eat a meal just before bed",
                "Drink something soothing",
                "Avoid late night TV and games",
                "Create the right environment",
                "Play soothing sounds in the background",
                "Alter your sleeping position",
                "Address other causative issues",
                "Deal with traumatic experiences",
                "Know when to talk to a doctor"};
        String[] deskripsi = {"If you have a hard time getting to sleep, you should take some steps to help you relax and prepare for bed before you want to go to sleep. Spending some time relaxing and clearing your mind can help you to fall asleep more quickly and sleep peacefully through the night. There are lots of different techniques you can try to help you relax before bed, such as:\n" +
                "Practicing some gentle yoga stretching.[1]\n" +
                "Progressively tensing and then relaxing the muscles in your body.[2]\n" +
                "Doing some controlled breathing exercises.[3]\n" +
                "Reading a book, or taking a nice warm bath.",
                "You should try to avoid things that might make it harder for you to fall asleep and stay asleep. If you eat a big meal before going to bed, your overfull stomach may make it more difficult to fall asleep. You should try to eat your evening meal at least three hours before you intend to go to bed.\n" +
                        "A carbohydrate-rich snack, such as oatcakes or a bowl of cereal an hour before bed, might help you sleep.[4]\n" +
                        "Going to bed when you are hungry or have an empty stomach will also make it harder to fall asleep.\n" +
                        "Eating too much or too little before can cause you discomfort throughout the night, preventing the peaceful sleep you need.",
                "Avoid drinking stimulants such as alcohol and caffeine before going to bed. Alcohol might seem like something that can help you sleep, but you are more likely to experience poor quality sleep if you have been drinking. You may be dehydrated, and you may have to get to use the toilet in the night.[6]\n" +
                        "Having a warm milky drink, or a herbal tea, can help you to prepare for sleep.[7]\n" +
                        "A glass of warm milk will help produce more of the chemicals in your brain that induce sleep.",
                "You may find it harder to get to sleep and sleep peacefully if you have been watching TV, playing video games, or using your computer or phone soon before bed. Looking at a bright screen can make it harder for you to relax, and can disrupt the secretion of melatonin.[9] It’s best to make sure that you have a break between looking at screens and getting into bed. [10]\n" +
                        "Research has suggested that playing video games in the early evening has a connection to sleeping difficulties.\n" +
                        "Similarly, those who use their phones in bed are often drowsier and less alert during the day.",
                "If you want to enjoy a peaceful sleep, making your bedroom into the perfect sleeping area can really help. Generally, you should try to keep your room dark, reasonably warm, and free of clutter and electronic devices which could irritate or distract you. You want to create a relaxing and comfortable place that you associate with sleeping more than anything else.\n" +
                        "Keep your room dark. Consider using blackout curtains or an eye mask.\n" +
                        "Try to keep the temperature between 60-65°F (16-18°C).\n" +
                        "Avoid bright colours which can be overly stimulating when you want to relax.\n" +
                        "Try not to have a TV or computer in your room.",
                "There is some evidence that soft and soothing sounds or music played quietly in the background can help you to get to sleep and ease you towards more peaceful dreams. Be sure that anything you play is quiet and calming, such as the sound of gentle ocean waves.[13]\n" +
                        "If you find soft music helps you get to sleep more peacefully, you can set your music player to go off after around half an hour.[14]\n" +
                        "Noises and sounds can disrupt your sleep too. Wear ear plugs if you are disturbed at night by sound.",
                "There is some evidence to suggest that the position you sleep in can have an impact on how you sleep and the kind of dreams you have. The most important thing is to be relaxed and comfortable, but try to be aware of the position you fall asleep and wake up in. You can try to alter this and see if it helps you have nice dreams and avoid nightmares.\n" +
                        "Sleeping on your right side is associated with more pleasant and relaxing dreams.\n" +
                        "Sleeping on your left side is thought to be connected with strange dreams and nightmares.\n" +
                        "Sleeping on your stomach may promote more erotic dreams.",
                "Research has shown that there is a link between depression and frequently disturbed sleep and nightmares. Nightmares may be closely connected to how we feel about ourselves and our lives. One way to try to address them is to think more about your life and try to improve your mental and physical health.\n" +
                        "A negative attitude towards yourself may increase your susceptibility to nightmares.[17]\n" +
                        "Try to think more positively about yourself, especially just before you go to bed.[18]\n" +
                        "Relaxation techniques, such as meditation and deep breathing may help.",
                "Nightmares are often thought to reflect stressful and fearful experiences in life. An emotionally difficult event, or a trauma of any kind, may return in a dream. If you have a recurring nightmare that you think is related to something you have experienced, you need to take steps to address the traumatic event in order to work through it.\n" +
                        "You can talk to a therapist about the event to try and understand it more clearly.\n" +
                        "If you have a recurring nightmare, spend some time trying to write a new and positive or neutral ending for the dream.\n" +
                        "Each night before you go to bed try to re-imagine and visualise the dream in your head with this new positive ending.",
                "Occasionally everybody has difficulty sleeping and experiences nightmares that disrupt their sleep. If you often have difficulty sleeping, and it is having an impact on your life and what you can do during the day, you should make an appointment to talk to your doctor.[20] The same applies for frequent disturbing nightmares. Talk to your doctor if:\n" +
                        "You or your child have nightmares that recur often and persist over time.\n" +
                        "The nightmares regularly disrupt sleep or cause a fear of going to sleep.\n" +
                        "They cause daytime behaviour problems."};
    }

}
