package com.barney.howtoreorganizeyourlife;

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

        String[] any = {"Declutter your home",
                "Start using lists and schedules",
                "Reorganize your house and workspace",
                "Create a system for dealing with things",
                "Ask for help",
                "Get rid of unhealthy",
                "Make decisions you've been putting off",
                "Identify any negative assumptions",
                "Cut out activities that do not benefit you",
                "Get on a solid sleep schedule",
                "Start a new hobby",
                "Commit to regular reorganizing and cleaning",
                "Find a work/life balance"};
        String[] deskripsi = {"Many people's homes are plagued by unnecessary clutter. Clutter can make a home feel chaotic, leading to excess stress. Do a quick sweep through your house and see if you can find any items you no longer need. Donate or discard the items accordingly.[1]\n" +
                "Look through closets and drawers. Do you have any clothing you no longer wear? Are there any electronic gadgets you haven't used for years? Maybe it's time to stop hanging on and either toss these items or find a place to donate them.\n" +
                "Go through your kitchen and bathroom. Dispose of any expired spices, canned foods, or boxed foods. Throw out old lotions, shampoos, and makeup containers. Get rid of any expired medicine or empty medicine bottles.",
                "If you want to be more organized, lists and schedules can be a great way to keep on track. Make a habit of writing daily to-do lists, and organizing your day around a logical schedule for activities.[2]\n" +
                        "Figure out what your obligations are for the coming month or weeks. Write down everything you need to do, like doctor's appointments, errands, work commitments, and so on.\n" +
                        "Prioritize these items. How vital is it you get your doctor's appointment taken care of? If you need a prescription refilled, make an appointment for the next week. If you have a big commitment at work, like a presentation, break it up into small chunks and set weekly goals.\n" +
                        "You should also make small lists for weekly errands. For example, make a list before going to the grocery store. In addition to helping you get out of the store quicker, a list can help discourage you from overspending.",
                "You want to know where everything you need is at all times. Whether it's your office at work, or your home, work on organizing your space so you can work more efficiently.\n" +
                        "Organize items in your home by purpose. Keep the books on a separate shelf than the DVDs. Have a designated bin or cabinet for office supplies. At work, do not stack papers randomly. Have different folders for different types of documents.\n" +
                        "Keep important items places where you can easily reach them. Install a key hook in your home, for example. In your kitchen, organize spices by purpose. The ones you use most frequently should be at the front of your spice rack. You can push the others back.",
                "Many people struggle with paying bills promptly and returning emails regularly. Having bills and emails under control can help your life feel significantly more organized.[3]\n" +
                        "Color coordinate emails in your inbox. You can mark high priority emails in a certain color as this will help you remember to return them promptly. You can also work on setting aside a time of day to return emails. For example, you can plan on always returning emails between 11AM and 2PM.\n" +
                        "Set up automatic bill pay if it's offered for your various bills. Mark when your bills are due on your phone calendar, or on a physical calendar.",
                "If you're feeling overwhelmed as you attempt to reorganize, do not hesitate to ask for help. Everyone needs a little push now and then. If you have a friend who is well organized, ask him or her to offer you tips. You may also simply ask a friend to hang out with you as you organize your home. The company can make the process less taxing.",
                "If you want to reorganize your life, you need to cut out relationships that are putting a strain on you. You should not be putting time and energy into people who cause drama. People who drain your time and energy, treat you poorly, or who are emotionally manipulative should be cut out of your life.[5]\n" +
                        "Establish boundaries with these people and stick to them. You may, for example, be okay hanging out with your co-worker Melinda in the presence of others as not to create unnecessary drama. However, you may not want to see Melinda one-on-one as she tends to be difficult.\n" +
                        "In some cases, it's okay to tell someone directly you do not want to see them again. If the person is not taking the hint that you do not want a relationship, politely say something like, \"I don't think this friendship is working for me anymore. I appreciate the time we've had together, but I think we should both move on.\"",
                "Another way to reorganize your life is to not leave major decisions lingering. If you've been putting off making a decision about your job, your personal life, your health insurance, or other matters, now is the time to make the decision. You want to move forward without uncertainty.[6]\n" +
                        "Think about any lingering decisions in your life. Maybe you're unsure whether you should stay in your current romantic relationship. Try to weigh the pros and cons. Is this someone you could be with longterm? If so, it may be worth your time to stay. If not, consider whether casual dating is for you right now. Do you want to invest time in a relationship you know will eventually end?\n" +
                        "Start thinking about your career. Does your current job offer advancement? Do you see yourself on this path for the next 5 to 10 years? If you want to leave your job, make a solid decision to leave rather than letting the maybe/maybe not thought linger. This can motivate you to begin sending out applications.",
                "You may have a lot of negative and irrational thoughts about yourself and the world. In order to move forward with your life, work on identifying and disengaging from your own negativity.[7]\n" +
                        "People end up having negative thoughts a lot throughout the day. You may, for example, catastrophize. This means you see the worse possible outcome for any given situation. You could also have a tendency to engage in black and white thinking. Instead of seeing a setback as a chance for personal growth, you see it as solely bad rather than a mixed blessing.\n" +
                        "Work on being on the lookout for negative thoughts. When you find yourself having an extreme reaction to something, pause for a minute and question whether that reaction is accurate. Try to remind yourself that life is nuanced, and most situations are complicated. Consider all the factors in a situation before categorizing it as good or bad, and remind yourself that much of life's setbacks and rejections are not personal.",
                "Your life may be cluttered with excessive activities. Being busy does not necessarily translate to being successful or to being happy. If you feel overwhelmed by obligations, take stock of the activities in your life and look to where you can minimize.[8]\n" +
                        "Stick with activities you genuinely enjoy and you feel benefit you in some way. If you feel genuinely fulfilled attending your weekly poetry club, and it's helping you get some of your work out there, stick with this activity.\n" +
                        "However, not all activities are beneficial. There may be activities in your life that are causing you more stress than happiness. Maybe you don't really enjoy being on your church's vestry, and only do it out of a sense of obligation. If this is the case, you should consider cutting this activity. There are plenty of other volunteers who can take your place.",
                "If you want to stay organized and on top of things, solid sleep is vital. Work on establishing a healthy sleep cycle so you'll have the energy you need to stay organized and on-track throughout the day.[9]\n" +
                        "Go to sleep and wake up at the same time each day. Your body will adapt to a regular sleep/wake cycle, so try to stay on schedule even on the weekends.\n" +
                        "Form a relaxing bedtime ritual to signal to your body that it's time to wind down. You could read a book, do a crossword puzzle, take a warm bath, and so on. Just avoid using your computer close to bed time, as blue light emitted from electronic screens can stimulate your brain and make sleep difficult.\n" +
                        "Make sure your room is comfortable. If there are any sheets, blankets, or pillows that irritate your skin, replace them with higher quality items.",
                "A great way to reorganize your life is to find a new way to pass the time. Think about starting a new hobby. This can give you something to do during your down time, reducing feelings of stress or boredom.[10]\n" +
                        "Find something that interests you personally. Many people find doing something creative, like writing or playing a musical instrument, can help them feel balanced and fulfilled.\n" +
                        "You can also look into getting active. Exercise can make you feel more relaxed and boost your energy, allowing you to take the time necessary to get your life in shape. You could take up running, jogging, walking, biking, or any form of physical activity you enjoy.",
                "Organization and cleaning must happen on a regular basis. Your new, clean apartment or house will not stay that way if you don't commit to regular cleaning. Get on a schedule of cleaning, reorganizing, and downsizing on a regular basis.[11]\n" +
                        "You can set specific days of the week aside for cleaning. For example, maybe you have Tuesday afternoons off. This might be a good time to work on giving your house a quick cleaning.\n" +
                        "You may want to set aside a day once a month to reorganize and declutter. You can, for example, take the first Saturday of each month as a chance to get rid of unwanted items in your home and reorganize anything that's not working.",
                "Your career is important, but if it's eating up your ability to relax you may have trouble staying organized and on track. Find ways to find a solid work/life balance so you can feel happier and more fulfilled in your life.[12]\n" +
                        "Track your time in a journal. See how much time you spend on work per week. You should also track how work affects your mood, and the time you spend worrying or angry over work.\n" +
                        "Form a schedule for yourself. Set aside time at least once a day for yourself. Allow yourself not to think about work during certain blocks of time. For example, at 6 o'clock every night you'll play the piano for an hour and not think about your job.\n" +
                        "Talk with co-workers. They may also struggle with work/life balance, especially if you work in a demanding field, and may have advice on how to find the balance."};
    }

}
