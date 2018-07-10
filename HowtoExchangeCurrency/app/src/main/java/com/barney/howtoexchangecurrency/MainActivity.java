package com.barney.howtoexchangecurrency;

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

        String[] any = {"Understand the process so that you get the best deal",
                "Do exchange some money before you leave",
                "Look at the status of the exchange rate",
                "Go to your bank",
                "Get a traveler-friendly account",
                "Buy cash online",
                "Use an ATM",
                "Pay with your card",
                "Go to a major local bank once you arrive",
                "Buy a prepaid card",
                "Plan ahead to prevent over-exchanging",
                "Do your research",
                "Shop around to get the best rate",
                "Pay in your own currency when you can",
                "Exchange in the country you travel to",
                "Avoid the airport and hotels"};
        String[] deskripsi = {"If you've never exchanged currency before, it's a good idea for you to understand a bit about the process so that you don't get any expensive surprises. The general idea is that you'll find a business that exchanges currency, and they'll give you the currency that you want in exchange for a small fee (plus, obviously, the amount of money you want changed). Now, in addition to this, it's important to understand that some currencies are worth more than others. For example, a single euro is usually equivalent to $1.30 USD or .80 GBP. How much the difference is will fluctuate, usually with the state of those economies. So, even though you're exchanging $100, you may only get out 75 euro.\n" +
                "Your goal, then, is to exchange currency when your currency is high and the foreign currency is low, because this means that you'll get more of the foreign money than you would otherwise.\n" +
                "Understand that the dollar (for example) being worth less than the euro doesn't have much to do with the cost of items. The relative cost of items is determined by the market in that area. So, for example, a banana in the US is much cheaper than a banana in Sweden, even though the dollar is strong compared to krona.",
                "The ideal ratio told by multiple Pro travelers is 80:20 ( the famous Pareto principle ). Buy 20% in cash and 80% in Forex card. It is important to exchange some money before you leave for your trip. You’ll probably encounter the advice that it’s better to exchange currency in the country you’re traveling to and that’s usually true if you are exploring common countries. However, if its a relatively off the chart country, then you may not want to follow this advice. To understand this, you must know that there are two kinds of currencies; one is those who get highly traded, Like Euro, USD, etc. The other is less traded ones, also known as Exotic currencies. Its always better to buy Exotic currency at the location but exchanging it with USD ( because USD is the global currency). However, you will want to have some cash prepared for when you arrive. There is going to be some amount of travel time, between landing in your destination and getting the chance to exchange more money, where lots of things can go wrong. It’s a good idea to have a little cash on hand, including small bills and coins if possible, so that you’re prepared for anything.\n" +
                        "The amount that you should have will vary by where you’re traveling to, but the equivalent of $40 USD is generally a good starting point, if you’re going to be in your destination for more than 3 days.",
                "Before you exchange money or decide how much to exchange, do a little research on the exchange rate. The rate will fluctuate and if you’re likely to exchange a lot of money, you’ll want to time it carefully so that you don’t lose too much money. Generally, you’re better off waiting to exchange most of your money until you arrive. However, if the rate for your home currency is falling, you’re better off exchanging almost everything you’ll need before you go.\n" +
                        "Googling “currency exchange rate” will bring up a chart for your chosen currencies, letting you gauge where your currency currently sits.",
                "The easiest place to exchange currency when you’re at home is at your bank. Go to the banking institution that you use and tell them that you’d like to exchange currency. The upside of bank exchanging is that most banks will charge only a very small fee for exchanging currency (if they charge a fee at all) and you’ll know you’re getting a good rate.\n" +
                        "The only trick here is that, unless it is a very major bank in a very major city, they’re unlikely to have the currency on hand. You’ll need to order the currency at least a few days and sometimes as much as two weeks in advance. Plan ahead!",
                "Before you leave, call your bank or go in and ask about what their policy is of charging your card overseas. Many banks will charge you a fee for using your card, at an ATM, foreign bank, for writing checks, etc. when you’re overseas. If they charge a lot of fees, you might want to see about starting up a separate bank account with another bank. Shop around until you find a bank that charges low or no fees at all. Then, transfer your money into that account. You can then use this account whenever you want to travel abroad.\n" +
                        "Some banks charge a monthly fee for having below a certain amount of money in your account. If you plan on keeping a traveler’s account, you’ll want to plan on keeping at least a certain amount of money in the account at all times, to avoid incurring fees.",
                "It is possible to order money online as well. This will need to be done before you leave, as it isn’t particularly safe to do once you arrive. The rates tends to be up-to-date and the fees fair, but the cost to have the money shipped to you can make this option undesirable. If you’re feeling a bit lazy, however, this can save you a trip to the bank.\n" +
                        "The best time to do this is if you’re planning on getting a lot of cash exchanged. If you order a large amount, somewhere in the hundreds to thousands of dollars, then you can ask them to waive the delivery fees. Some companies may do this and it makes the rate you get much more reasonable.",
                "When you travel outside of your country, you should be prepared to pay cash for a lot more services and products that you normally would at home. Not all countries have the widespread use of cards that is seen in English speaking countries. This means that you should be aware that you might have to pay for things with cash that you’re accustomed to using your card to buy normally. Plan ahead.\n" +
                        "This is especially common in poorer countries. They often have less infrastructure for the widespread use of cards.",
                "Your best bet for exchanging currency when you’re traveling is to use an ATM. Find an ATM with a major bank in the area and then, so long as you have one of the major VISA or Master/Maestro cards, you’ll be able to do basic transactions like withdrawing money. This will usually give you the best rate and if you have a travel-friendly bank, you’ll hardly pay any fees at all.\n" +
                        "Finding an ATM can be tricky. Your best bet will be to let Google be your guide. Get to a place, early on, where you will have internet access and then ask Google Maps for the locations of all nearby ATMs. You can also usually locate an ATM by locating a bank. If you don’t know where to find those, ask a local hotel concierge or taxi driver.",
                "When you can, simply pay for items and services with your card. As long as it’s one of the major cards (VISA or Master/Maestro card), any business that takes credit and debit cards should be able to take your card without problems. This is handy because your bank will simply exchange the money on their end and you don’t have to worry about exchanging currency yourself much at all.\n" +
                        "Be aware, however, that you may encounter problems with the card itself. Certain countries have switched to the more secure chip-and-pin system. Certain card readers will then be unable to read the traditional North American swipe card.\n" +
                        "Again, some banks charge extortionate fees for this. Know what your bank charges before you leave.",
                "Just like you can exchange currency at home with a local bank, you can also use any bank once you arrive in your destination. This can be tricky but much like it is at home, you’re more likely to get a legitimate rate and minimal fees.\n" +
                        "You might think the language barrier will be your biggest issue but as long as you’re in a fairly large city and you go to a major bank in a central location, you’re very likely to find at least one teller who speaks English.\n" +
                        "The main problem is that some banks won’t exchange currency if you’re not a customer. Your best bet is to ask around and hope for the best. If they won’t exchange your currency, they’ll probably at least be able to help you find a bank that will. They are much more likely to exchange your currency if you’re withdrawing money using your card, since this is more secure for them.\n" +
                        "You can also ask your hotel concierge to help you find a bank that will exchange your currency.",
                "This is not your best option but it is an option that is available. Pre-paid cards are like debit cards but they have a set amount of cash on them. You can order these before you leave or you can buy them once you arrive. However, the rates on these tend to be terrible, some businesses may not accept them, and you’re in hot water if you lose it. Still, for some people it might be the best option they have.\n" +
                        "Be extremely cautious when purchasing these cards. They should only come from reputable vendors.",
                "Before you leave or at least before you exchange too much money, plan ahead on what you’ll be doing and how much money you’ll need. Exchange on the low side of how much you think you’re going to use. This way, you won’t risk over-exchanging and wasting money on having to exchange the money back once you return.\n" +
                        "This will also help you incur the minimum number of fees, if the exchange fee with your chosen method is a one-time fee (such as at an ATM or bank).",
                "Look up the most current exchange rate before you exchange money using a service, especially if you’re using a currency exchange service specifically. Businesses that specialize in exchanging currency and some small businesses that exchange currency will both often give you an outdated exchange rate that works in their favor, so that they can make more money off of you.\n" +
                        "Download an app before you leave so that you can easily check the exchange rate on your phone. Just be careful to only leave data on when you’re actively checking the rate, so that you don’t go over on your data plan while you’re abroad.",
                "Don’t be afraid to find out what you can get at a different location. Banks may be less of an issue, although some banks might have less fees than others, but currency exchange businesses will definitely have very variable rates. This will also give you the added bonus of possibly being able to haggle with the business, since a small currency exchange will be more willing to fight for your business.",
                "If you are in an area where you have the option to pay in your own currency, do that.[2] Usually, if a business allows this they will tell you or the price will be marked. Make sure you’re informed about the exchange rate before paying, however. You can expect a small markup, so that they can pay the exchange fees on their end, but it should only be small.\n" +
                        "This is most common in areas and countries where your currency is very highly valued or is used frequently.",
                "Most of the time, your best bet is to exchange your money in the country you travel to. This is especially true if you’re coming from one of the major countries to a minor one, because your money will be more highly valued. The idea is that you want to carry as little cash on you as possible when you’re traveling (although you can keep cash in hidden or secure locations, such as a hotel safe) so exchanging once you get there is better than possibly forgetting your wallet at an airport layover in Bangladesh.",
                "Do not, as much as is humanly possible, exchange currency at an airport or hotel. You will get charged huge fees and you will get a terrible exchange rate. Be especially cautious if they advertise as having “zero fees” or “fee free”, because those places will give you the worst exchange rate possible. Exchanging in either of these locations should be a last resort."};
    }

}
