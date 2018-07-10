package com.barney.howtotreatabeesting;

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

        String[] any = {"Remove the stinger as quickly as possible",
                "Wash the area with soap and cold water",
                "Watch out for symptoms of an allergic reaction",
                "Call emergency services if you’re having an allergic reaction",
                "Apply cold to the area",
                "Elevate your arm or leg",
                "Make a baking soda paste",
                "Apply honey to the sting",
                "Put toothpaste on the sting",
                "Dab on apple cider vinegar",
                "Take over-the-counter pain medicine",
                "Apply hydrocortisone cream",
                "Dab on calamine lotion",
                "Take antihistamine pill"};
        String[] deskripsi = {"As soon as you get stung, get the stinger out of your skin. This is the most important thing you can do! Some people suggest that scraping the stinger out with a credit card is better than pinching it out, but this is more likely to slow down the removal. Some scientists don’t think this is even true, and that removing the stinger as quickly as possible is the best thing you can do.[1]\n" +
                "You should be able to see the stinger where you’ve been stung. It will be about the size of the tip of a pen and consists of the stinger itself with some torn flesh from the bee. Sometimes, the bee will remain connected to the stinger by a string of flesh.\n" +
                "Get it out with your fingernails, if possible. Otherwise grab a credit card to sweep it out don't pinch it or it will release more venom into the body.",
                "The cold water will be soothing and the soap can help wash away any residual dirt or venom. Lather up well and rinse the area thoroughly.",
                "Even if you’ve been stung by a bee before without any problem, be on the alert for signs that you’re having an allergic reaction. Allergies can develop or worsen over time. Severe reactions (anaphylaxis) can by life-threatening. Watch out for any of the following signs of anaphylaxis:[4]\n" +
                        "Difficulty breathing or wheezing\n" +
                        "Swelling of the lips, tongue, face, or throat\n" +
                        "Dizziness, fainting, or a drop in blood pressure\n" +
                        "Skin reaction like hives, flushing, itching, or paleness\n" +
                        "A fast, weak pulse\n" +
                        "Nausea, vomiting, or diarrhea\n" +
                        "Restlessness and anxiety\n" +
                        "Take an antihistamine like Benadryl immediately after the bee sting. This is a preventative measure, even if you don’t end up having an allergic reaction.",
                "If any of the above symptoms are present, call for emergency help right away. While you’re waiting for help to arrive (or on your way to the hospital), take Benadryl or another antihistamine before a reaction sets in. If you have an EpiPen, use it.\n" +
                        "If you’re waiting and start to have a serious reaction, you can take a double dose of antihistamine. Just be sure to tell the emergency team what you have taken and in what dosages.\n" +
                        "After you’ve been treated, see your doctor for a prescription for an EpiPen – a shot of epinephrine that you keep on hand in case of another reaction. Carry the epi-pen with you at all times. Make sure someone in your group knows you have an epi-pen and may need it.\n" +
                        "If you’ve had a serious reaction to a bee sting or any other sting, you should also make an appointment with an allergist. They can give you shots to help prevent severe reactions from recurring.",
                "Run the sting under cold water, or place ice or an ice pack on the area. Wrap the ice in a towel first instead of putting it directly on your skin. Keep this on for 20 minutes.\n" +
                        "Reapply the ice later if the area gets sore again.\n" +
                        "While using home remedies, continue to assess the size of the sting. Often, stings will grow into larger areas. You can gauge the size of the sting by marking it with a pen. If the redness continues to spread, seek medical help.",
                "If you were stung on the arm or leg, elevate it. Prop your foot up on pillows to be above the level of your heart. Rest your arm on something above your heart. This can improve pain and swelling.",
                "Mix baking soda with water, apply the paste, and let it dry. This may pull out the venom if applied quickly and help relieve pain and swelling. Put a tablespoon of baking soda in a bowl and add enough water to turn it into a thick paste.\n" +
                        "You can also try making a paste out of baking soda, vinegar, and meat tenderizer and applying it to the sting.[6] Add enough vinegar to a tablespoon of baking soda to make a paste, and add in a pinch of meat tenderizer.",
                "Dab some honey onto the sting with your fingers or a cotton ball. Honey has traditionally been used for its antiseptic qualities.[7] Use honey that is as pure as possible, preferably 100% honey without preservatives, for the best effect.",
                "Apply a dab of toothpaste to the sore area. It may feel like tingling, which can improve the itchiness of the sting. Apply it as often as you want to.[8]\n" +
                        "Natural toothpaste may work better than regular toothpaste, but give either a try.",
                "Wet a cotton ball with apple cider vinegar and hold it against the sting. It may burn momentarily, but then may provide some pain relief.",
                "Alleviate pain with OTC pain medicine from your local pharmacy or drug store, such as ibuprofen (Advil, Motrin IB) or acetaminophen (Tylenol).[11] Ask your doctor or pharmacist which is the best medicine for you if you have any medical issues, especially if you have liver or kidney problems. Take the medicine as indicated on the bottle or by your doctor.",
                "Apply hydrocortisone cream or other corticosteroid cream to the red, swollen area. This can decrease the pain and inflammation in the area. Use it as directed on the label.[12]\n" +
                        "Reapply it after four hours if you need to.",
                "Calamine lotion can help bee stings as much as it helps poison ivy rashes. Dab some onto your sting with a cotton ball. Use it as indicated on the label.[13] Calamine lotion with analgesic (e.g. Caladryl), may be especially effective.\n" +
                        "Reapply it after four hours if you need to.",
                "Take oral antihistamines like diphenhydramine (Benadryl) or chlorphenamine (Chlor-Trimeton). Use it as directed on the label or by your doctor or pharmacist. This can help relieve itching.\n" +
                        "Antihistamine pills might make you very drowsy. Be sure you know how they affect you before taking them when driving or going to work."};
    }

}
