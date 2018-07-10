package com.barney.howtostartanonlinebusiness;

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

        String[] any = {"Define your product or service",
                "Register your business",
                "Register a domain name",
                "Get a web hosting service",
                "Create a stylish and functional website",
                "Get ecommerce software",
                "Set up a merchant account",
                "Add catchy content to your site",
                "Be social",
                "Become an affiliate marketer",
                "Add Google AdSense advertisements"};
        String[] deskripsi = {"Starting an online business gives you the benefit of having access to millions of customers, but you also have a lot more competition. No matter what you're trying to sell, you can bet that hundreds more online retailers have a similar idea. What differentiates your product from other similar products? To help your product stand apart from the rest, you'll need to find a niche.[1]\n" +
                "Let’s say you make jewellery—but so do a few million other people. What makes yours different? If one-of-a-kind jewellery (or another product) is your gig, make sure it's truly original.\n" +
                "Offer expertise in an area. Even if the product itself isn't very unique, your expertise might be a strong selling point. If you're selling a line of skincare products, for example, it helps if you have a degree in a field related to skin health.\n" +
                "Check into the competition. Figure out what isn't already being offered, and find a way to fill the hole with your product.",
                "Your business needs to be registered according to your state's laws. Choose an official business name and fill out the appropriate paperwork to make your business official.\n" +
                        "Before you register your business, it can help to have a business plan laid out. Consider your production costs, shipping costs, taxes, and web hosting fees.\n" +
                        "Know the business regulations in your state, and be sure to comply when you get things up and running.",
                "Like the name of any other business, go for something short and catchy that will be easy for people to remember. Visit the website of a domain registration company and test out some of the names you're interested in to determine whether they're available. Once you land on a good name, go ahead and register it.",
                "There are free hosting services to be found, but if you're serious about running an online business long term, consider paying for one that offers all the services you need. You'll be less likely to run into problems when your business starts to take off. Choose a hosting service that allows for growth.[3]\n" +
                        "Some hosting services are highly structured, allowing you to choose from among different templates to create a website quite easily. Others allow you to do your own programming, giving you greater flexibility.",
                "Elegant or funky, classical or hipster, your online store should reflect what you’re selling. No matter what your style is, it's important to give off a professional air. Since you won't be able to earn people's trust in person, your website will have to do the selling for you. Your site should be engaging, and most importantly, easy for customers to use when they're ready to make a purchase.[4]\n" +
                        "Make sure your site design matches your product. For example, if you make traditionally styled diamond jewelry, having a website that looks like shredded cardboard with edgy fonts and images taped to the cardboard would tend to drive away your potential customers.\n" +
                        "Consider setting up an online portfolio. Whether you are a programmer who specializes in Javascript, a graphic designer who works on commissions, a plumber who is on call 24/7, or a copywriter who will write about anything at all, having an exemplary website where potential clients can evaluate your work is crucial to your online business success.\n" +
                        "You don’t have to design the website yourself—there are professional designers who are more than up to the task, plus ecommerce websites will offer dozens of appropriate templates for you. If you know in advance what you want, you’ll make selecting a designer or a template that much easier.\n" +
                        "When designing your site you need to remember to focus on what is important. Your ultimate goal is to make your site simple and easy to use.\n" +
                        "Your customers should have to make no more than 2 clicks in order to land on the page where they can make a purchase.\n" +
                        "The top of every page should have a link to your shopping cart if its an ecommerce store\n" +
                        "Buttons should be large and clear to read and input boxes should be large and easy to enter your information\n" +
                        "Less is more. Don’t be wordy when you don’t need to on payment pages\n" +
                        "Make sure your logo at the top of the page always links to the homepage\n" +
                        "If you have dark backgrounds use light text and vice versa.",
                "You'll need this so your customers can view your products, enter their information and make a secure purchase. The software safely stores customer information. Don't skimp in this area, since the ecommerce software you choose will make a big difference in how easy it is for customers to feel secure buying something from your store.\n" +
                        "You can also use an all-inclusive ecommerce web service. Sites such as Shopify and Volusion offer competitive packages, with free templates, custom packages, credit card processing, and more. Ecommerce web services makes it easy to sell your products on the web, without a lot of overhead. There are no custom interfaces or templates to work with; you simply create an online store within the framework of the service.",
                "Service businesses in the past had to generally rely on cash or check—setting up an entire credit card processing system was a thankless, expensive task at best. Using a service such as PayPal makes it possible to accept virtually any form of credit or debit card for your services, and includes dispute resolution should the need arise (and it will arise).",
                "Focus on your key areas of expertise, and display them professionally. Much like you would do when having potential employers contact references, put your best foot forward for potential clients. Include descriptions, where appropriate or necessary.\n" +
                        "Don't use jargon. If you are offering technical expertise, include descriptions that appeal to your client base, not your peers. For example, if you are showing that you can code with PHP and AJAX, don't say \"in this case, if the input field is empty (str.length==0), the function clears the content of the txtHint placeholder and exits the function.\" The person who needs you to work on their site will just scratch their head and say \"huh?\" Say, instead, \"Start entering text into this field, and it will auto-complete.\"",
                "Whatever your business, whatever your venue, keeping your name in the air is key to internet success. Have a business account on Facebook, Twitter, and LinkedIn. If your business is graphically oriented, have accounts on Flickr and Tumblr as well. Whenever there is news of any kind—a new contract, a new page, a new entry, a new photo—cross-post it to all your social media sites. Also make sure those sites link back to your main website, and that your website has links to all of them.",
                "There are many companies and webmasters who use affiliate programs to boost their online sales, and most of these affiliate programs are free to join. When you sign up for an affiliate program, an affiliate link with a unique affiliate ID will be assigned to you. The affiliate link is used for marketing the products of your merchant. When a visitor buys an item through your affiliate link, you earn affiliate commission.\n" +
                        "For example, if you are an affiliate marketer for Musician's Friend, an online musical instrument retailer, you can advertise their products on your site. If a person visits your site, and clicks on the link that takes them to the Musician's Friend website, and they purchase an instrument within a certain amount of time (24 hours or more, typically), you get a commission on the sale.",
                "Google’s AdSense is a revenue-sharing opportunity for small, medium and large web sites that places ads for goods and services that are relevant to the content of your site, targeted to the people who frequent your pages. In turn, you get paid a small amount when the ad is either displayed on your page, or clicked on."};
    }

}
