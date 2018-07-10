package com.barney.howtoresolveaconflictatwork;

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

        String[] any = {"Acknowledge the conflict",
                "Focus on the problem, not the person",
                "Take the initiative",
                "Choose the right time and place to talk",
                "Ask what’s not working",
                "Listen to their perspective",
                "Find things you agree upon",
                "Apologize for any wrongdoing",
                "Resist acting on impulse",
                "Avoid accusations and blame",
                "Involve human resources",
                "Develop a plan for resolution",
                "Follow through on your plan",
                "Make necessary changes"};
        String[] deskripsi = {"Pretending that nothing is wrong isn’t the way to handle a conflict. Begin by admitting there’s a problem that needs resolution. Acknowledge the conflict and the roles you and the other person have played in creating or sustaining the problem. Be honest with yourself about your own role in the situation.[2]\n" +
                "Think about what factors are influencing the problem, such as scheduling, personality conflicts, feeling overworked, or disrupting some kind of perceived pecking order.[3]\n" +
                "Look at not only your side, but the other side as well. Looking at both sides can help you understand the problem from both perspectives.",
                "If the conflict is not personal, don’t make it personal. Put your focus on the problem and finding ways to solve that problem. You can’t change the person, and you will likely continue working with them. Even if you don’t want to be friends with the person, keep your focus on the problem without making it a personal issue.[5]\n" +
                        "It’s easy to feel personally attacked for something, especially if it’s regarding your work. Do your best to not take things personally and keep everything within the lens of your work.",
                "It is important to address issues as soon as possible to prevent them from becoming larger issues in the future. If you notice a problem, then address it right away. For example, you could hold a meeting to discuss the issue and work together to find a solution.\n" +
                        "Don’t wait for the person to come to you. Be the first one to bring up the problem, no matter what your role is.\n" +
                        "Sometimes a conflict can arise over a personal failure. Even so, handling failure at work with honesty and integrity can do much to prevent even worse conflicts from emerging.",
                "A hurried conversation at your desk between emails and phone calls won’t solve anything. Put some thought into talking with the person. You need an undisturbed location and time to address the issue.\n" +
                        "Decide whether you want to send an email or have an in-person discussion. If you speak in-person, do so away from other employees and when both of you have time to talk.",
                "If somebody has done something that made you angry or if you don’t understand their actions, simply asking about it can make a world of difference. Don’t assume that people do what they do to annoy or harm you. Sometimes, there’s a good reason why that person does what he or she does. Other times, they may not even realize that they did something hurtful, and bringing it to their attention can clarify their intentions. Make an inquiry, not an accusation. Try to remain neutral and phrase your questions as matters of curiosity.[6]\n" +
                        "“Say, I was wondering why you brushed off my question yesterday,” or “I’ve noticed that you cut my work down, and I’m wondering why that is.”",
                "When hashing things out with a coworker, don’t make it all about you. Be willing to hear them out, listen to their perspective, and consider their feelings. Give them ample time to express their thoughts, feelings, and experiences. If they feel defensive, let them express that. Let them talk without interrupting them.[7]\n" +
                        "Don’t take up the whole interaction with your side. Be willing to hear them out. You may gain more information or understand them better.\n" +
                        "Check to see if they’re done speaking. Say, “Is there anything else you want to add or say to me?”",
                "Find some common ground with the person. This might mean that both of you acknowledge that a problem exists or that something needs to be solved. Perhaps you can agree that both you and they need to do something to create resolution. Whatever it is, find something each of you can get behind.[8]\n" +
                        "For example, if you feel bullied, both of you might agree that you have problems getting along or splitting responsibilities.\n" +
                        "Say, “I want us to resolve this. Let’s find some things we can agree upon so that we can move forward.”",
                "Apologize for your part in the conflict. Usually everyone involved has done something to create and sustain the conflict. Own up to how you contributed to the dispute and express regret and responsibility. Remember: you’re not accepting the entire blame, you’re taking responsibility for your contribution to the situation.[9]\n" +
                        "For example, say, “I’m sorry I said those hurtful things. I was upset, but it wasn’t right of me to call you that.”",
                "If your coworker says something offensive or hurtful, resist the urge to fire something harsh back. You might say something you regret or blow the issue out of proportion. If a conflict arises, take some time to think it over before immediately responding. You may come to realize that you misheard them, misunderstood them, or need further clarification.[10]\n" +
                        "Immediately responding will likely mean you respond in a negative way.",
                "Keep from becoming defensive or blaming the other person. Even if you feel victimized, don’t pour your negativity onto them. It might be tempting to call them out and let others know how they’ve wronged you, but keep some decorum as this is your workplace.[11]\n" +
                        "If you want to express how you feel wronged or hurt, use “I” statements. For example, say, “I felt really hurt when you took credit for the project during the meeting,” instead of, “I can’t believe you did that. You’re a horrible person.”",
                "Your human resources department can help you solve workplace conflicts. If the conflict is growing larger or you feel like you want to quit over it, now is the time to get HR involved. You may also want to involve your HR department if the conflict is personal or workplace morale is low for you and maybe even those around you.[13]\n" +
                        "Your HR department can send someone to mediate or get you and the other person talking more constructively. A good mediator will help the disputants find their own solution, not provide advice or push them toward any particular solution.",
                "Once you feel like you’ve talked over the problem, propose possible solutions. Keep the focus on the future and how each of you can respond better.[14] Find points where you can compromise or work on communicating more effectively. Create a different way of problem-solving or working together, such as taking turns or writing things out instead of saying them out loud.\n" +
                        "If you can’t create a plan on your own, involve your manager or HR in creating ways to approach conflicts.\n" +
                        "For example, if the person talks over you in meetings, say, “I want to be heard. Is it possible for you to wait until I finish speaking to chime in? If you start to talk over me, I will ask you to let me finish.”",
                "It’s not enough to just create a resolution. Both you and the other person must follow through on any agreed-upon solutions. Discuss ways to stay accountable, whether that means that other co-workers will participate or your workplace will step in. Create a system to be accountable. You might want to include HR in enforcing any changes.[15]\n" +
                        "For example, if you struggle to have balance in projects, divvy up tasks before starting the project so that they feel fair and equal. Have someone neutral step in and get their opinion on the tasks.",
                "Depending on the dispute, you may need to make some changes, such as by changing your role in the workplace. For example, if you can’t find a resolution, then consider changing departments or taking a different role in your workplace. If you know talking to the person will upset you or cause problems, engage only in “water cooler” discussions. Do what you can to avoid creating or perpetuating further disputes.",
                };
    }

}
