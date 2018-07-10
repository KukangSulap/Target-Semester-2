package com.barney.howtounderstanddepression;

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

        String[] any = {"Understand the daily cycle of depression",
                "Know that the emotional pain can lead to literal pain",
                "Learn that depression makes everything more difficult",
                "Expect a change in perspective",
                "Realize that enjoyable things are no longer enjoyable",
                "Grasp the seriousness of finding your own emotions disturbing",
                "Understand how it makes one virtually unemotional",
                "Know in serious cases that death may feel like a plausible alternative",
                "Know the difference between depression and the blues",
                "Know the etiology of depression",
                "Realize how common depression is",
                "Look for signs of insecurity that drive the person away",
                "Notice if the person takes up bad habits",
                "Expect changes in job performance",
                "Look for weight change",
                "Understand that men are more likely",
                "Realize that a man with depression may avoid social",
                "Pay attention to a change in sexual habits",
                "Know how suicide affects men and women differently",
                "Understand that depression is more prevalent in women than in men",
                "Know how hormone cycles can affect women",
                "See how the pressure women are under can lead",
                "Be aware that the seasons may affect women more"};
        String[] deskripsi = {"For someone who is depressed, life is a cycle of anxiety, despair, and exhaustion. Depression can be marked by exhaustion at the end of the day, which leads to a deep sleep that, despite often being quite long, not restful.[2] Then, the mornings are greeted with dread and anxiety that make it difficult to get out of bed. That emotional exhaustion becomes a weight that holds down the person, making just rising out of bed seem like an insurmountable task. It gives the feeling that the person is suffocating or drowning in despair. It's a heavy burden to bear.\n" +
                "Depression doesn't always show up as sadness. The feelings of emotional exhaustion can also cause a person to seem irritable or moody.\n" +
                "Depression has commonalities, but individuals experience it differently. One person may be unable to get out of bed, while another may be walking around the neighborhood trying to stifle a panic attack.\n" +
                "Depression may not be constant or consistent. A person may have uniformly awful days, or have \"good days\" and \"bad days\", while another may have seasonal depression during the winter.",
                " Depression can manifest itself as a physical-feeling pain with no specific origin and no body part in particular. In fact, depression diagnoses can be difficult to make sometimes because patients sometimes only discuss their physical symptoms.[3]\n" +
                        "This pain is often chronic and typically involves multiple bodily areas, meaning it tends to stick around for long periods of time.",
                "With depression, any kind of movement can feel like a major chore. For some, it's nearly impossible to handle day-to-day tasks. It becomes difficult to get up and to do more than just roll over in bed. It seems to require a veritable plan to even go across the room — the depressed person may need to work up the energy just to do so. [5]\n" +
                        "There can be a difficulty carrying on a conversation, because the effort to express oneself can seem too great. This inability to move physically manifests in just about any form — even mere thought requires work, much less conversation.",
                "The way the surroundings look can be affected by depression. When reality looks bleaker, it is difficult for one to maintain a sunny disposition. Even the sun can look less cheerful in its sheen and feel like it’s lost some of its warmth. Everything gets cast in a grayer glow. Those will less severe depression may experience something called \"depressive realism.\" People typically have a bias to see the world and themselves in a positive light, but this fades away with depressive realism.[6]\n" +
                        "Dark days take on a more gloomy tone and mornings do not appear to have the gloss of newness with untold possibilities. Whatever optimism the person had, it's now gone — regardless of what positive events ensue.",
                "This is also called anhedonia. It means that the things that used to be enjoyed, cherished and anticipated have much less of an impact for someone who's suffering from depression [7]\n" +
                        "For example, nature lovers no longer feel that sense of calm and peacefulness when taking a walk in natural surroundings. Flowers lose their scent and music sounds discordant. Money, love, making artwork, partying — it all lacks a certain glamour it may have once had for the depressed person.\n" +
                        "Everything becomes shrouded in cloudiness and a heaviness that is difficult to bear. It seems like one's world is moving at a slower, duller pace than everyone else's. Things just generally seem “off.\"",
                "For the depressed person, there is a great sense of hopelessness and it may seem that nothing brings about positive emotions. This extreme emotional pain and lack of joyful feelings can be incredibly overwhelming. This emotional pain may seem to just get worse and worse, seemingly for no reason.[9]\n" +
                        "A depressed person might have bouts of crying for no obvious reason. There may be feelings of irritation towards family and friends for simply doing the things they normally do or behaving the way they normally behave.",
                "Depression may cause the person to be empty, numb, and unable to feel emotionally. This lack of feeling can make one seem completely alone even when surrounded by family and friends.[10]\n" +
                        "The feeling that one is in a cloud or a bubble away from others is also a possibility. The depressed person may feel as if no one around him can truly understand what he's going through; that feeling alone might worsen the underlying depression.",
                "The pain and trauma of depression can be so real and persistent that suicide seems like a logical, sensible answer. The depressed person might speak of and attempt on multiple occasions to commit suicide. This is because they can see no end to the feelings of isolation, worthlessness and despair except through the putative relief of suicide.[11]\n" +
                        "When life has no real meaning, death doesn't seem like that big of a deal. It's not so much that you want to die, but that you don't want to live. The depressed person may feel no interest or may not take any joy in life, so life may seem pointless.\n" +
                        "If someone feels this way, has thoughts, and a plan to carry out the suicide — whether it's someone you know or if it's you yourself — seek help immediately. Call the National Suicide Prevention Hotline at 1-800-273-TALK (8255), a therapist, friend, doctor, or family member for help.\n" +
                        "Keep in mind not all depressed individuals are suicidal. Although depression puts one at risk, having depression does not automatically mean one becomes suicidal.",
                "Everyone gets sad sometimes, but depression is different. It is not just a typical bout of the blues. Instead, depression tends to involve:[12]\n" +
                        "A bleak outlook on life wherein one feels hopeless.\n" +
                        "A loss of interest or joy for life wherein what used to be enjoyable isn't at all anymore.\n" +
                        "Weight problems wherein a depressed person can lose or gain 5% of her normal weight in a very short amount of time.\n" +
                        "Sleeping issues such as insomnia or excessive sleep.\n" +
                        "Temper issues wherein the depressed individual may lash out or be irritable or easily frustrated.\n" +
                        "Feeling fatigued and sluggish and without the energy to accomplish even simple tasks.\n" +
                        "Feelings of guilt wherein the depressed individual berates herself or won't let herself off the hook for something she perceives that she has done.\n" +
                        "Suicidal thoughts or reckless behavior wherein the thought of death is entertained and perhaps fantasized about or seen as a means of a convenient escape; this lack of caring for living can lead to impulsive or reckless actions.",
                "Although depression may not have a single cause, and it's not exactly known what causes it, it is a real chemical change in the body and is a true mental illness. There are some factors that are predictive of an individual coming down with depression, including:[13][14]\n" +
                        "The death of a loved one.\n" +
                        "Separation from a loved one.\n" +
                        "Financial loss.\n" +
                        "Dramatic life changes such as relocating to a different city, retirement, or changing jobs.\n" +
                        "Conflicts in personal life such as divorce, disputes.\n" +
                        "Burnout or too much work.\n" +
                        "Additional responsibilities such as the birth of a baby or having to take care of sick parents or relatives.\n" +
                        "Conflicts in professional life such as changing roles and responsibilities that are not in sync with the person’s interests and skills.\n" +
                        "Physical, sexual, or emotional abuse.\n" +
                        "Debilitating diseases and illnesses such as HIV/AIDS, Parkinson’s, heart diseases, or cancer.\n" +
                        "Changes in the brain. Sometimes depression happens for \"no good reason.\"\n" +
                        "However, a certain amount of sadness or difficult feelings are normal when bad things happen. If things don't improve after around 6 months, that's when a bigger problem is assumed to be at hand.",
                "Depression affects 6–7% of the total adult population in the US alone.[15] The majority (70%) of diagnosed cases are seen in women — however this may be in part because women may be more comfortable than men in seeking treatment for depression and/or because of the higher risk of suicide in men.\n" +
                        "Suicide (a behavior associated with depression) is relatively common, too, being a leading cause of death nearly as common as influenza and pneumonia.",
                "The person's feelings of self-worth and self-confidence take a beating day in and day out thanks to their negative thought patterns. They are constantly pursued by thoughts which tell them they are not good enough, not lovable, wanted, or competent enough to be liked by others. They have persistent feelings that their company is not something people long for. So, in their mind, it's better to avoid interacting or mingling with people no matter how close they have been to those people in the past.\n" +
                        "Depression affects the thought process and information processing facilities of the person which in turn slows down their thinking, response, and decision-making capacities. This inability negatively impacts their self-confidence which compel them to keep away from family and friends. This includes deliberately staying away from activities which the person once enjoyed as well.\n" +
                        "Lethargy can also impact the person's ability to spend time with others.",
                "With a view to overcome this self-imposed isolation, anxiety and loneliness, some people try to seek refuge in alcohol, drugs, and junk food high in sugars and carbohydrates. Alcohol, sugars and carbohydrates do the job of making them feel good and elevating their mood, but only for a brief period. However, it’s the same disastrous feelings once the good feelings wear off. Unfortunately, eating disorders and anxiety go hand in hand with depression.\n" +
                        "Some people go off the other end and don't eat. The person just doesn't have a desire anymore. Try to notice any weight changes and if the person eats around you. It's not their diet, it's just their mind thinking, \"Why bother?\"",
                "A depressed person's information processing facilities, together with their feelings of inadequacy and low self-concept, can result in faltering concentration, productivity, performance and competence. Often, depressed people suffer at work or while attempting any activity that requires a keen mental edge.[17]\n" +
                        "People with depression also have sleep problems such as insomnia or hypersomnia (sleeping too much).[18] Some health problems such as headaches, stomachaches, back pain, constipation, diarrhea are some symptoms which are common in people with depression, too.[19] All of these can affect job performance, in turn.",
                "Depression is associated with weight gain or in some cases severe weight loss, which can be one of the consequences of depression. It is not clear, however, whether depression always follows from or causes weight changes. For example, someone may become obese and then become depressed at their new self-image and perceived lack of self-control.",
                "Differences do exist in the way men and women experience depression or in the way they present their symptoms and sometimes it's in the most glaring manner.[21] Specifically, men are less likely to show depression through their feelings and emotions. They are less vocal about expressing feelings of sadness, hopelessness and worthlessness.\n" +
                        "Instead, they might show their depression by getting angry and frustrated at the slightest provocations.[22] They are more likely to present their symptoms in the form of being irritable. Men may also be more likely to complain of tiredness and sleeplessness regularly and show decreased interest in once enjoyed activities.",
                "Because of this painful juxtaposition between how they feel and how society wants them to feel, men make great efforts to minimize their chances of having to spend time with family and friends as much as possible. They instead push themselves more and more into their work, or may turn to drugs or alcohol for relief.",
                "Depression in men can give rise to issues in their sex life. It can cause a loss of interest in sex and can contribute to causing erectile dysfunction. [25]\n" +
                        "Men prefer to use socially favorable and socially acceptable nomenclature to mask their symptoms of depression. They are likely to emphasize attributing their symptoms to stress rather than depression.",
                "Though women are more likely to attempt suicide, it is men who have higher mortality rates because of suicide. It is because men tend to act quickly, instantly, and hastily on suicidal thoughts and also use more lethal means, such as guns, to complete their suicide attempt. Women, on the other hand, are more open about their thoughts are prone to less active or guaranteed suicidal behaviors, like overdosing on pills.[26]\n" +
                        "Men are also less likely to indicate their intentions to others. With fewer warning signs from them, friends and family are not likely to intervene.",
                "However, it is possible that more women are more comfortable reporting it, or that men assume they don't have it when women do. However, assuming women are more likely to be depressed than men, the reasons could be any of the following:[27]\n" +
                        "Hormonal changes.\n" +
                        "Pregnancy.\n" +
                        "Menopause.\n" +
                        "Hypothyroidism.[28]\n" +
                        "Chronic illnesses (Studies show that illness is comorbid with depression more often in women than in men).",
                "Hormones have a direct relationship with the chemicals in the brain that are in charge of influencing our mood and emotions. Hormonal fluctuations are common during the menstrual cycle, menopause, pregnancy and post-delivery. This can start out as episodic (temporary, to make the explanation short) and lead to chronic depression (a lifelong battle). [29]\n" +
                        "To add to the hormonal changes, the additional responsibilities that come with the arrival of a baby are enormous and can be overwhelming for some women which can lead to depression — specifically postpartum depression.\n" +
                        "Men also have hormones, and this could affect their depression as well.",
                "Psychosocial factors are also linked to high rates of depression in women.[30] Women can feel pressure to be expected to handle more than their fair share of responsibilities such as in caring for family, working a part-time or full-time job, and taking on the stress and strains of keeping relationships strong and intact.\n" +
                        "Facing sexism may also take a toll on women. For example, a woman who faces sexual harassment at work may become depressed.",
                "Depression that comes with the onset of a particular season, called Seasonal Affective Disorder (SAD), is more prevalent among women.[31] This form of depression passes with the onset of warmer seasons such as spring and summer but comes back with the onset of winter. Though the cause of this depression is different, the symptoms are the same — sadness, mood swings, anxiety, cravings for foods high in sugars and carbohydrates, and sleep problems are all prevalent.\n" +
                        "SAD is one such form of depression which is caused by lack of/exposure to adequate sunlight. This is mostly experienced by people living in cold places where winters and snow are intense and severe."};
    }

}
