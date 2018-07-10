package com.barney.howtoliveonyourownterms;

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

        String[] any = {"Recognize your freedom to choose",
                "Stand on your own two feet",
                "Assess your values",
                "Dream big",
                "Let go of others’ expectations",
                "Understand the power of your thoughts",
                "Stop comparing",
                "Set specific goals with deadlines that challenge you",
                "Do one thing daily that moves you closer to achieving your goals",
                "Spend time with people who inspire, uplift, and value you",
                "Take chances",
                "Learn from your mistakes"};
        String[] deskripsi = {"The three C’s of life are blatantly true: Choices. Chances. Changes. You have to be the one that makes a choice to take a chance, or your life will never change.[1] Only you have that power. And it’s yours to do with as you please. Everyone else has the same choice. Living life on your own terms starts with the knowledge that you can do just that (i.e. live life on your own terms), if you so choose\n" +
                "Everything you see around you in day-to-day life, and every person you frequently make contact with is there because of a choice you made. If you don’t like how your life is, make the choice to change it. Now.",
                "When you are steadily requiring guidance from those around you, you give up control of how your life plays out. This can translate to letting others make decisions for you, depending on others for financial help, or waiting on them before you make a move. Always maintain control of your life. Even when you ask for others’ advice, thoughtfully consider their suggestions, but always be the one who makes the final decision.",
                "Who you are as a person, what kind of people you surround yourself with, what you do for a living, what you are passionate about: all of these are guided by your personal values. Values are traits – in yourself and others – that you hold dear. Along with your individual belief system, values influence your entire life.\n" +
                        "Learn what your values are by taking a personal values assessment.[3] Understanding your values helps you grasp a deeper understanding of yourself, what motivates you, and what your dreams are. Do an internet search for \"personal values assessment\" and you should get a list of different tests you can take.",
                "As you move towards living life on your own terms, you must get a handle on exactly what that means to you. Does that mean moving to another country? Does that mean dropping out of your current major to take up a new subject? Or, does that simply meaning cutting the puppet strings that someone else has used to control your decisions?\n" +
                        "Sit down with a pen and paper and consider your wildest dreams for your life. Write them all down.\n" +
                        "This step is merely for exploration purposes. It does not matter right now if you do not have a clear-cut plan for reaching these dreams. You just need to uncover, at this very moment, what it is you want out of your life.",
                "Okay, so here’s the tough part. You need to make the decision today to no longer care what others think of you. This can be a very difficult practice, especially if you have lived a life governed by the opinions of your parents, teachers or friends. However, doing so is a necessary step to actually living by the beat of your own drum. Always trying to please others is an unbearable task in which you are designed to fail. Here’s how to stop letting others’ expectations haunt you:[6][7]\n" +
                        "Recognize that worrying about what others think immobilizes you. Simply put, you are not able to take effective action in your life when your moves are guided by other players. Consider that one person wants you to go right, and another equally significant person wants you to go left. What happens? You reach a stalemate and don’t move at all.\n" +
                        "Trust your instincts. If you know what your core values are, then you can trust your own decision-making skills as long as those decisions align with your values. If you feel uncomfortable about something you’re doing or thinking about doing, cool your heels and refrain from making a decision until you have considered all the variables.\n" +
                        "Stop looking for external validation. Early on in life, we count on signals from others (i.e. smiles, rewards, high-fives, etc.) to tell us whether we are doing good or bad. Once again, if you know your values and what you want to reflect in your life, then you have no reason to look to others for validation. Regularly perform your own self-assessments to assure that your actions are complimenting your values and your dreams, and then self-validate to reassure yourself that you are doing what is best for you.",
                "It is said that your thoughts are the architects of your destiny. Some believe that thoughts have a real physical presence and energy, and their focus determines how you feel and behave. The problem with this is that humans often spend too much time thinking about what we don’t want or don’t like as opposed to what we want and like. Take command of your thoughts and success is imminent.\n" +
                        "Become more aware of your thoughts. Over breakfast, in the shower, or while exercising, focus on the self-talk that is running through your head. Are these thoughts negative? Positive? Neutral?\n" +
                        "After you have spent some time noticing your thoughts and labeling them, take note of how you feel in your body while you are thinking these thoughts. Do you want to get back in bed and crawl under the covers? Do you want to hug everyone you see? Notice that negative thoughts generally result in a negative mood state and positive thoughts lead to a more positive mood.\n" +
                        "Aim to be a champion of positive thinking. When you notice your thoughts going down a negative path, challenge how realistic they are.\n" +
                        "For example, you may think that you’ll never get the job you want. This makes you feel bad, and you lose your motivation to go job-hunting. You can combat such a negative thought by looking for evidence to the contrary. Have you had success in finding other endeavors you enjoy, even if it took time? If so, then it bodes that eventually you might also find a job you like, too.",
                "Comparison is the thief of joy.[9] When you’re watering your own grass, you can’t be concerned if someone else’s is greener. This can be especially hard with social media, in which a person can carefully curate how their life appears to others (you only see the vacations and fancy dinners, not the fights with their spouse or food poisoning that kept them on the toilet for five hours).[10] As you now know, you can only control one life — yours. Comparing yourself to someone else put your focus on the other person instead of on yourself, where it should be.[11]\n" +
                        "Instead of comparing yourself to others, try to measure yourself against where you were last month, six months ago, a year ago. After working hard and practicing your basketball skills, you aren't Steve Curry, but you're playing far better than you were just a month ago. It's all about you becoming your best self, not becoming better than someone else.[12]\n" +
                        "Comparing yourself to others is a game you can never win: there will always be someone smarter, younger, prettier, wealthier, etc. But remember that no one has a perfect life, and the people you think have a perfect life are struggling, too.",
                "You may have heard that you should set SMART goals, which means goals that are Specific, Measurable, Achievable, Results-focused, and Time-bound.[15] So, grab that piece of paper on which you wrote down your wildest dreams. Develop an action plan to meet these goals with clear and measurable steps and a reasonable, yet challenging deadline.\n" +
                        "Take your goal-setting a step further by finding an accountability partner. Ask a coworker, close friend, or family member if you can email a weekly progress report to them outlining what steps you have taken in reaching your goals. This extra step will motivate you even more.\n" +
                        "If you can’t find an accountability partner, download an app that helps you stick to your goals.",
                "And do it first. If you are truly serious about living a life on your own terms, then you must be responsible for prioritizing your goals above all. Each week, make sure that the first tasks you perform each day are those with the highest priority/greatest importance. That way, even if you slack off for the remainder of the day, your day was still purposeful.[17]\n" +
                        "If you have a passion to do something, don’t allow money to deter you from doing it. Also, don’t give in to the belief that you do not have time. If your dreams are important enough to you, you will make time.",
                "Living a self-directed life can be enhanced by the people who surround you. You can’t expect to see positive changes in your life when you spend most of your time with negative people. Positive energy coming from your friends and loved ones gives you greater confidence, reduces stress, and makes you happier.[18]\n" +
                        "Of course, it is impossible to keep those who are endlessly critical, unmotivated, or mean-spirited completely out of your life. Just be mindful of their toxicity and monitor your thoughts when you are around them. If you find yourself thinking negatively, challenge those thoughts and reframe them into more positive thoughts.",
                "Get out there and collect experiences. If you have been living your life based on other's approval or expectations, it may be hard for you to take risks. Nonetheless, taking even small risks helps you to build confidence in yourself and your abilities. It also helps you better learn how to navigate different obstacles and refine your abilities.",
                "More than likely, in the process of taking chances, you will make a few errors. Don’t think too long on your mistakes other than finding ways of using them for growth. You often learn the most when you are put in an uncomfortable situation. Failure is only temporary, so use your losses to help you become better so that the next risk results in a win."};
    }

}
