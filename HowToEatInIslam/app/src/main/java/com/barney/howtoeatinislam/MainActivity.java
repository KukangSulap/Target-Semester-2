package com.barney.howtoeatinislam;

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

        String[] any = {"Understand the difference between Haram and Halal",
                "Stay away from eating swine and pork",
                "Refrain from eating meats that are not meant to be eaten",
                "Eat meats that are slaughtered according to Islamic law",
                "Understand what type of meats are permissible",
                "Avoid adding alcohol in cooking",
                "Be sure foods are thoroughly clean before consuming",
                "Try to eat a variety of healthy, nutritious foods",
                "Know what beverages are permissible",
                "Understand what types of desserts can be eaten",
                "Wash your hands before eating",
                "Know what you're eating and ask",
                "Mention the name of Allah before you begin eating",
                "Always eat with your right hand",
                "Eat what's directly in front of you",
                "Eat with three fingers",
                "Sit down properly when you're eating",
                "Pick up food if you accidentally drop it",
                "Try to always eat with a group",
                "If it's time to pray by the time you set the table to eat, eat first",
                "Praise Allah after eating",
                "Wash your hands when you're done and clean up",
                "Avoid criticizing food or stating that you hate it",
                "Eat in moderation",
                "Avoid eating from plates or cups made from gold or silver",
                "Eat calmly and don't rush",
                "Know proper table manners, especially around others",
                "Avoid eating your food if it's piping hot",
                "Refrain from wasting food",
                "Consider sharing and serving the meal to others"};
        String[] deskripsi = {"The word 'Halal' in Islam means something that is permissible and permitted according to the Islamic law. The word 'Haram' is the opposite; it refers to things that are not allowed and not permissible. When choosing and eating foods, always stick to foods that are Halal.",
                "Allah has forbidden Muslims from eating anything made from pork or swine products as it is considered impure.[1][2] Bacon, pork lard, certain gelatin, pork grease, and other pork or swine products should be avoided.\n" +
                        "Allah says in the Quran, “He has forbidden you only of the Maytah (dead animals), and blood, and the flesh of swine…” [al-Baqarah 2:173][3][4]\n" +
                        "The downsides of consuming pork have been scientifically proven. Pork and swine products have been known to help the spread of cancer, stomach ulcers, allergies, and scabies.[5][6] Pork also contains the trichinosis worm when eating it undercooked or raw, which is known to lead to skin rashes or even paralysis.[7]\n" +
                        "In serious cases, eating pork may be a necessity. If you're in an area with no food available besides pork, and you believe you're going to die of starvation, eating pork would be acceptable in this case, for your survival.",
                "Animals such as dogs, cats, frogs, donkeys, mules, and so on should be avoided, since they are targeted to be companions rather than food. While it is not outright Haram to eat them if they're pure and cleansed, it is encouraged not to consume them.[9]\n" +
                        "Vicious animals such as tigers, crocodiles, lions, rhinos, etc. should also not be eaten as well. It's encouraged to eat animals that are herbivores, such as cattle, sheep, rabbits, goats, etc.",
                "According to the Islamic law, when slaughtering an animal, you should begin by mentioning Allah's name by saying Bismillah (بسم الله\u200E\u200E), which means 'In the name of Allah'. It is not permissible to eat the animal if it's been beaten, strangled, or savaged when slaughtered. Instead, Dhabiha should be performed to make the slaughtering easy on the animal and less stressful or painful. Most meats that are slaughtered this way will state on the package that they're Halal.\n" +
                        "Dhabiha is performed by killing an animal using fast cuts to the throat using a razor-sharp blade. It should not be done around other animals to avoid frightening them. The animal being slaughtered should be healthy and fed well. Following this method keeps the meat pure and fresh and helps keep the animal from being stressed or scared during the process.",
                "Any type of meat (besides pork and swine) is permissible as long as they are slaughtered correctly. The meat must be clean from any blood or filth before being cooked or eaten. Animals found dead are not permissible to consume.[12] An animal that was slaughtered by being beaten or gored is also not allowed to be eaten.",
                "Alcohol is forbidden in Islam and it has been mentioned clearly in the Quran to avoid it all costs. Keep away from adding it in any of your meals such as in meat, vegetables, certain desserts, and so forth.[13] If a recipe requires alcohol, substitute it with non-alcoholic sparkling wine or leave it out of the recipe completely.\n" +
                        "Allah says in the Quran, “O you who believe! Intoxicants (all kinds of alcoholic drinks), and gambling, and Al-Ansaab, and Al-Azlaam (arrows for seeking luck or decision) are an abomination of Shaytaan’s (Satan’s) handiwork. So avoid (strictly all) that (abomination) in order so that you may be successful.” [al-Maa’idah 5:90]",
                "Any meat used should be thoroughly cleaned, especially if it contained blood. Keep foods clean and pure by washing them thoroughly with water is necessary. When cleaning fruits and vegetables, scrub them well with a brush. This helps remove any filth or dirt off of the food.",
                "Having a healthy diet is encouraged in Islam.[16] Eat a variety of foods that are nutritious and good for your health. Examples include:\n" +
                        "Grains. Grains are foods made from rice, oats, wheat, cornmeal, and other different types of cereal grains. Foods such as pasta, rice, bread, tortillas, oatmeal, and grits are good options of food that are made of grains. It is highly encouraged to eat whole grains, as they contain more fiber and vitamins.[17]\n" +
                        "Fruits and vegetables. Strive to eat as many fruits and vegetables as possible. Pick a variety of colorful fruits and vegetables to get plenty of different nutrients and health effects, such as lowering blood pressure, reducing the risks of certain diseases, and helping other parts of your body.[18]\n" +
                        "Dairy products. Dairy products are made out of milk and provide plenty of calcium for your body. Some examples of dairy products include cheese, yogurt, cottage cheese, cream cheese, butter, and milk itself.[19]\n" +
                        "Meats and poultry products. Besides pork and swine, plenty of meat and poultry products are great for the body and include protein, iron, vitamin B, and magnesium. Meats such as turkey, chicken, sausage, and beef are great choices for meals.[20][21]\n" +
                        "Seafood. Allah says in the Quran, \"Lawful to you is from the sea and its food as provision for you and the travelers...\" [5:96][22] Seafood such as fish, shrimp, crab, and lobster contain minerals and vitamins, and can also prevent strokes and heart diseases.",
                "Any types of beverages are okay to drink as long as it is not alcoholic or contains any alcoholic products. Beverages such as soda, lemonade, fruit juice, tea, coffee, smoothies, and milk are all acceptable drinks to enjoy. However, drinks like vodka, beer, wine, liquor, cocktails, and other alcoholic drinks are not permissible to drink.[24]\n" +
                        "It is narrated in al-Bukhaari (5147) and Muslim (3736) from ‘Abd-Allaah ibn Umar that the Messenger of Allaah (SAW) said: “Whoever drinks wine in this world and does not repent from that, he will be deprived of it in the Hereafter.”",
                "Desserts such as cakes, chocolates, ice cream, and other sweet treats can all be eaten as long as they do not include any type of pork gelatin or alcoholic products.",
                "Before beginning to eat, wash your hands thoroughly with soap and warm water. This not only has many health benefits to avoid germs from entering your food, but is also Sunnah by keeping clean.",
                "Be aware of what you're eating before you take a bite. If you're not sure what the meal is, ask the cook or host about it. This can help you be aware of the food options so that you don't end up eating a food you dislike and offend the cook or host.[28]\n" +
                        "Al-Bukhaari narrated from Khaalid ibn al-Waleed that he and the Messenger of Allaah (SAW) entered upon Maymoonah and found that she had some roasted lizard that her sister Hafeedah bint al-Haarith had brought from Najd. She offered the lizard to the Messenger of Allah (SAW), but he would barely stretch forth his hand to [the] food until he had been told what it was. The Messenger of Allah (SAW) stretched forth his hand, [and] then one of the women who were present said, “Tell the Messenger of Allah (SAW) that what has been offered to him is a lizard.” The Messenger of Allah (SAW) withdrew his hand from the lizard, and Khaalid ibn al-Waleed asked, “Is lizard Haram, O Messenger of Allah?” He said, “No, but it is not found in the land of my people and I feel that I would have no liking for it.\"",
                "It is Wajib (mandatory) to mention Allah's name before you put anything in your mouth. Mention Allah's name by saying Bismillah (بسم الله\u200E\u200E), which means \"In the name of Allah\" before eating. You may also want to recite the Dua or prayer before eating as well, but it is not obligatory and only Sunnah.\n" +
                        "The most common Dua said before eating is \"Allahomma barik lana fima razaqtana waqina athaban-nar. Bismillah\", meaning \"Oh Allah! Bless the food You have provided us and save us from the punishment of the hell fire. In the name of Allah.\"[30]\n" +
                        "It was narrated from Umm Kalthoom from ‘Aa’ishah that the Messenger of Allaah (SAW) said: “When any one of you eats, let him mention the name of Allah. If he forgets to mention the name of Allah at the beginning, then let him say ‘Bismillahi awwalahu wa aakhirahu (In the name of Allah at the beginning and at the end).’”",
                "In Islam, most daily tasks are done with the right hand. Shaytan (Satan) eats with his left hand, so all Muslims are required to eat food with their right hand to differ from him, and to honor the right hand over the left.[32] In al-Saheehayn it is narrated that ‘Umar ibn Salamah said that The Messenger of Allah (SAW) said: “O young boy, say the name of Allah and eat with your right hand, and eat from what is nearest to you.” Narrated by al-Bukhaari (5376) and Muslim (2022).[33]\n" +
                        "In Sunan Abi Dawood (33), it is narrated that ‘Aa’ishah said: The right hand of the Messenger of Allah (SAW) was for his purification and food, and his left hand was for using the toilet and anything that was dirty. Classed as saheeh by al-Albaani in Saheeh Abi Dawood.[34]\n" +
                        "A reason for not eating with your right hand is injury or sickness. If, for example, you end up spraining your right hand and it's easiest to eat with your left, this is an acceptable reason to use your left hand.",
                "Avoid reaching out to get food from the middle of the plate or food that is from other people's plates. It is Sunnah and better manners to eat what is directly in front of your plate. [36]\n" +
                        "The Prophet (SAW) said to Umar ibn Abi Salamah, “O young boy, say Bismillaah, eat with your right hand, and eat from what is directly in front of you.” (Narrated by al-Bukhaari, 3576; Muslim, 2022)",
                "When eating finger food or using an utensil, it is Sunnah to eat using only three fingers. Eating with more than three is considered a sign of greed, and using only three fingers is the normal and common amount of fingers to use while eating a meal.[38]\n" +
                        "Ka'b bin Maalik narrated that he saw the prophet Muhammad (SAW) licking his three fingers (after having finished the food). (Sahih Muslim Hadith 5039)",
                "Avoid laying down or reclining as you eat. Not only does this have potentially dangerous health effects such as choking, heartburn, and GERD,[40] but it's also discouraged in Islam. It was narrated that the Prophet (SAW) said: “I do not eat whilst I am reclining.” (Narrated by al-Bukhaari, 5399)[41]\n" +
                        "In some cases, eating while laying down is acceptable. For example, if you have a high fever and can't get out of bed but need to eat, eating while laying down in bed would be okay to do in this case for your well-being.",
                "If you mistakenly drop food on the ground while eating, pick it up immediately and blow it off to remove any dirt. Anas ibn Malik narrated that that the Prophet (SAW) said, \"If any one of you drops a piece of food, let him remove any dirt from it and eat it, and not leave it for the Shaytaan.\" (Narrated by Muslim, 2034).[42]\n" +
                        "If you happen to drop food and don't notice it until you're done eating, do not eat it. The food should be thrown away as it contains dirt and bacteria from the long timing on the ground.",
                "It is Sunnah to eat with a group, such as with your family. Eating together allows you to bond together and brings you together as you talk and communicate with each other. It's also a blessing to eat together and brings barakah (closeness of Allah) to the family.[43]\n" +
                        "Wahshi bin Harb reported: Some of the companions of the Messenger of Allah (SAW) said: “We eat but are not satisfied.” He (SAW) said, “”Perhaps you eat separately.” The Companions replied in the affirmative. He then said: “Eat together and mention the Name of Allah over your food. It will be blessed for you.” [Abu Dawud].",
                "If, by the time you set the table and everyone is ready to eat, the Athan (call of prayer) goes off, eat first. This is especially important if you're hungry and your mind is on food. If you're stomach is growling during Salah and you're thinking only about food, your concentration is not on the prayer. That's why it's highly encouraged to eat before the prayer.[45]\n" +
                        "The scholars of Islam have stated that, \"Beginning by eating food (when Salah is present), is allowed at a time when a person is extremely hungry and he wishes to eat, but there is sufficient time for Salah. If this is not the case, then he must begin with Salah since this was the practice of the Prophet (SAW)\". (Umdatul Qari –Commentary of Sahih Al Bukhari).",
                " After you finish eating, it is encouraged to praise Allah by saying Alhamdulillah (الحمد لله), which means 'Praise be to Allah'. The Prophet Muhammad (SAW) said: \"Allah will be pleased with His slave who praises Him (i.e., says Alhamdulillah) when he eats and praises Him and when he drinks.\"[47]\n" +
                        "You can also say the Dua when you're finished with your meal. The most common Dua to say after you're done is Alhamdulillah il-lathi at'amana wasaqona waja'alana Muslimeen. (Praise be to Allah Who has fed us and given us drink, and made us Muslims).",
                "After you're done eating, be sure to wash your hands thoroughly with soap and warm water. Clear the table and help clean up, if necessary. This is proper Islamic manners, especially if you're eating at someone else's house.",
                "While it's okay not to like every food, it's discouraged to criticize food on the dinner table. If you don't like the food you are given, kindly refuse it and say you don't want it. You don't need to outright say you hate it. This is the Sunnah of the Prophet (SAW).[49]\n" +
                        "Abu Hurayrah narrated that the Prophet (SAW) never criticized any food. If he liked it he would eat it, and if he did not like it he would leave it. (Narrated by al-Bukhaari, 3370; Muslim, 2046",
                "Avoid eating until you're full, as this is not proper etiquette in Islam and is also unhealthy.[51] Eat until you are no longer hungry, which is enough to help you last till your next meal.\n" +
                        "Al-Hassan Al-Basri said: \"O, son of Adam, eat with one third of your stomach and drink with one third and leave one third of your stomach to breathe so that you may think [and work better].\"",
                "Hudhayfah B. al-Yamân relates that Allah’s Messenger (SAW) said: “Do not drink from gold and silver vessels and do not eat from gold and silver dishes, because indeed they are for them in this world and for you in the Hereafter.”[53] Eat from normal plates and cups that are made from plastic, glass, or paper, instead.",
                "Avoid rushing when you're eating and shoving as much as food as possible in your mouth. Take your time to chew and swallow as you enjoy your meal. Not only is eating too fast a health risk and choking hazard, it's not proper etiquette.",
                "Follow basic table manners when eating, such as not chewing with your mouth open, not eating too loudly, and not talking when you're eating. If you're eating with a group, be sure to let everyone have a turn to speak. Simple words such as \"Please\", \"Thank you\" and \"Excuse me\" go a long way as well and are a good example of table manners.\n" +
                        "When eating with a group or with your family, avoid having a heated discussion that may lead to an argument. The dinner table should be calm and pleasant as you eat; it doesn't need to be a war zone with fights and debates.",
                "If your food is too hot to eat, wait patiently until it is cool. It is not permissible to blow on it to cool it off because Ibn Abbaas said: \"The Prophet (SAW) forbade blowing onto food and drink.” [Ahmad][54] Let the food cool off until it's at a comfortable temperature to eat.",
                "Food should not be wasted in Islam and it is not permissible to throw it out in the trash. In Fatawa al-Lajnah al-Daa’imah (22/341) it was said: \"Leftover food must be saved for the next time or it should be given to the needy; if there are no needy people, then it should be given to animals, even after it has dried out, for the one who is able to do that.\"\n" +
                        "Shaykh Saalih al-Fawzaan said: \"It is not permissible to throw any food into dirty places or impure places such as washrooms, because that is a waste [and] mistreatment of the blessing and a lack of gratitude to Allah.\"",
                "It's Sunnah to share and serve your food with your family, friends, guests, and to others who are hungry and need it such as those who are poor. This small action of sharing brings a lot of blessing and Hasanat (rewards)."};
    }

}
