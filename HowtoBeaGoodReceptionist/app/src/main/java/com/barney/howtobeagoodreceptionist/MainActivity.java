package com.barney.howtobeagoodreceptionist;

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

        String[] any = {"Have top-notch organizational skills",
                "Have some knowledge about technology",
                "Be dependable",
                "Possess excellent listening skills",
                "Take notes on everything",
                "Answer the phone politely with a standard greeting",
                "Greet delivery personnel with the same professionalism",
                "Handle customers who come to your business",
                "Have a positive attitude",
                "Have a greeting ready",
                "Be courteous",
                "Dress to impress"};
        String[] deskripsi = {"Receptionists are the people that represent the face of the company--they are the ones that clients first speak with them and the people and coworkers go to for information and event planning. Aside from taking calls and directing visitors, they often deal with clients, organize events, set up meetings, etc. With all of these responsibilities, receptionists need to be really organized while dealing with multiple demands at once. A person won’t last long as a receptionist if he or she can’t juggle more than one thing at a time and deal with them in an orderly fashion.\n" +
                "A great way to stay organized is to invest in a filing system that works best for you. It is important to know what papers and information your boss, your coworkers and your clients may need. Keep all of this information in separate folders--be they on your computer desktop or in hard copy. Organize your filing system in a way that works best for you--if that requires neon sticky notes attached to everything, so be it.\n" +
                "Being organized also means being self-motivated--you don’t need anyone else to tell you how to do something, or keep you on track. If you are organized, you will know what tasks you need to complete each day, and what tasks are priorities.\n" +
                "Have phone numbers handy. (lots and lots) i.e. co-workers, employers, contractors, vendors, emergency contact numbers, etc. You will need them all at one point or another. Keep the phone numbers organized on a Rolodex or appropriate computer program.",
                "he number one piece of technology receptionists have to deal with is the telephone--and all of the buttons and separate lines that it comes with. Computer skills are also a must--most receptionists have to know how to use email and must be skilled at word processing. It is also helpful to know how to create spreadsheets, and use any industry-specific programs.\n" +
                        "Keep in mind that if the copier, scanner, or printer are near your desk, you will mostly likely be depended on to use them (and troubleshoot for coworkers who run into problems while using them.) Once you know the kind of machine being used at your office, brush up on its main functions and the ways to fix common problems.",
                "A receptionist is counted on to man the desk at all times--it reflects poorly on the company if no one picks up the phone, or there is a line of people waiting to be helped. Make being dependable a priority--if your boss knows that you are reliable and are always there to help, you become indispensable.",
                "A big part of being a receptionist is listening to people--whether it is on the phone, a question a client is asking, or information being relayed to you. Being able to listen well will make you more efficient--you will be able to solve problems more quickly when you understand what the person is asking the first time around, and you’ll connect clients to the person they are trying to reach quickly.",
                "If a boss asks you to do something, takes notes on the specifics. If a customer calls, make sure to write down their information (name, contact information, what they want, etc.) Notes are a great way to stay organized and remind you of all the little things that come up during the day. Keep your notes in a notepad and have it with you at all times. You will be surprised by how helpful they are, especially when trying to remember what the person who called five hours ago wanted.\n" +
                        "Make sure that you write out messages in detail and read over what you have written and most importantly when taking a message, repeat back the message and contact info that you were given so that you can make sure before you hang up that you have the proper information to relay.",
                "Make sure the phone is answered on the first or second ring. It is not good to keep people on hold for more than one minute. (It's longer than you may think.)\n" +
                        "Listen carefully to the name of the person the caller is asking for. Repeat back to caller if necessary. Cell phones often distort sounds. Write the person's name to whom the call is directed if pronunciation is difficult.\n" +
                        "Direct the call politely with a standard phrase such as \"One moment please for Mr. Smith.\" Or if that individual is on the phone, \"I am sorry, Mr. Smith is on the phone at the moment. Would you like to wait on hold or would you like to leave him a voicemail message?\" Politely thank them and direct the call accordingly.",
                "You may be required to sign for deliveries. Make sure your signature is legible. Delivery personnel may need directions where to leave packages. Make sure you contact appropriate employees for such matters.",
                "After the visitors identify who they are and who they are looking for, contact that individual and let her/him know who is there. A standard appropriate phrase is \"Mr. Smith, Mr. Jones from XYZ Corporation is here to see you for his 2 o'clock appointment.\" Always get a first and last name and the name of the organization they are from. It is helpful to ask if they have an appointment with Mr. Smith. Mr. Smith will give you instructions about where to have visitor wait and for how long. You can then tell visitor \"Mr. Smith will be with you in a moment.\" or \"Mr. Smith said that he is finishing up a meeting and will be with you in 5 minutes. You may have a seat. Thank you.\"",
                "As mentioned above, receptionists are the face of a company--they are who clients deal with first, and the people who answer the questions of people who can’t come into the office. No one wants to be greeted by a sour expression and a grumpy attitude. Make it a priority to always have a smile on your face and a cheerful, upbeat personality. Remember to stay patient with challenging customers, even if they get on your last nerve.\n" +
                        "Even you come up against a challenging client, remind yourself that you are a strong, happy individual. Tell yourself that they are acting out of frustration but know that as long as you are trying your best to accommodate them, you are not the one at fault. It is better to be the one that keeps your head than the one who explodes and looks like an ornery, mean person.",
                "Its always important to greet your clients in a friendly way. Even if you continue what you are doing before helping them, its important to greet them so that they feel acknowledged and know that you will help them in a moment.\n" +
                        "Some greetings are “Hi! Welcome to [Business name]” or “Good morning! If you’ll have a seat, I will be with you in just a moment!”",
                "Be respectful. Treat everyone like they are the most important person that has walked into the office that day. This is your job- nobody cares about how you got stuck in traffic this morning, how you ruined your brand new purse, or even how you lost your favorite CD. Leave personal matters at home. (Even if you don't respect their message or the way they convey it- fake it) Overall, make sure the person is totally relaxed and happy to talk to you.",
                "You are representing a business, thus you should dress the part. Invest in some business casual clothes. Alternatively, if you are a receptionist at a specific sort of store (such as a clothing store) you may consider dressing the part by buying some of the store’s clothing and wearing them. Tend to the conservative, unless you work somewhere where fashion, trendiness, or other factors are pushed to the forefront.\n" +
                        "Check to see if your business has a specific dress code. Your business may be fine with casual dress, just remember that you should never dress too casually (sweats should be banned from the workplace.)"};
    }

}
