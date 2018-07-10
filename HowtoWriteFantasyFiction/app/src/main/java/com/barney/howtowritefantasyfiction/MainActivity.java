package com.barney.howtowritefantasyfiction;

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

        String[] any = {"Choose the kind of fantasy you're writing about",
                "Create maps to navigate by",
                "Focus on themes readers connect with",
                "Do your research",
                "Plan ahead",
                "Think about your characters",
                "Build the profile you give your characters before writing the book",
                "Develop the plot",
                "Gather everything together and prepare to write",
                "Enrich everything with details",
                "Think about plot twists"};
        String[] deskripsi = {"Decide whether you'll write about a medieval, futuristic or any other type of era. Take the time to imagine your fantasy world and the characters within it. Take notes or write an outline of how your fantasy world works. For example, if you have included supernatural creatures, are there special rules they must live by - like vampires avoiding sunlight. Rules help to give your world structure.",
                "If your story isn't set on Earth then it may be useful to draw up maps of your new world which could be included in your finished novel to give your readers a better idea of what it looks like. Don't stress too much about how well the map looks. It's purpose is to help you keep track of where all the important places are in your world. If you want to include a map in your book, you can create a beautiful detailed map later.",
                "The best fantasy novels make the unbelievable, believable by giving the reader familiar themes that they recognize. Even if your main character isn't human, they must have human problems. For example are they dealing with family feuds, relationship issues or personal problems that your reader can relate to. If they can relate to the problems then they will feel empathy to your character and care about their plight.",
                "Look at the current bestselling fantasy novels and see if you can find their unique selling point. You can be inspired by them but don't plagiarize your favorite writers. They were published for their uniqueness, so you need to seek your own.",
                "Do you want your small novel to end up in as a long series? Make a \"mind map\" to get a hold on all the possible outcomes.",
                "Decide how they behave, think and if they have any striking features. Also think about what made them the way they are. Write everything you make up about them down somewhere you can check often, because you'll need it.\n" +
                        "They can be anything from humans to creatures you made up yourself.\n" +
                        "They can be well-known fantasy creatures like elves or vampires, but try to give your own spin on them.",
                "For an example, you don't want to actually say someone stands up for their friends, but you can put a scene where he or she does it.",
                "What does your main character want? How will he or she try to get it? Will he or she manage to? What are going to be the problems he or she will be facing?",
                "Write the way you like better, but keep that style throughout the whole book. No one likes a book that changes in the middle.",
                "Give your text rich descriptions of places and events, but don't overdo it because, then, your text will get slow and won't flow well.",
                "This one isn't necessary, but helps you keeping your readers interested. More traditional plot twists include[1]:\n" +
                        "Anagnorisis, or discovery- the main character's sudden and abrupt recognition of the true nature or identity of a person or the meaning of an event. For example, a girl finds out that her best friend is just a figment of her imagination, and was never alive in the first place.\n" +
                        "Flashback- an evocative revelation of past events. In books, flashbacks are usually italicized, worded in past tense, or told from a younger narrator's point of view. Instead of a flashback, a foreshadowing could also be used.\n" +
                        "Unreliable narrator- in the end it is revealed that the narrator has falsified, made up, or greatly exaggerated the story that you've read up until that point.\n" +
                        "Peripeteia- A realistic or logical reversal of the protagonist's fortune, whether for good or for worse. For example, the main character of a story, after struggling through an arduous murder case and about to give up, stumbles upon the missing piece of information he needed.\n" +
                        "Deus ex machina, meaning \"god out of the machine\"- an unexpected, artificial, or improbable character, device, or event that is introduced to resolve the main conflict, or even a side conflict, of the story.\n" +
                        "Poetic justice- an ironic \"turning of the tables\" where the character is either rewarded or punished for their actions, such as a sudden death or a compensation.\n" +
                        "Chekhov's gun- a character or plot element is introduced early in the narrative. The importance of the character or plot element is not recognized until later in the story. Also known as a \"plant\", or an initial device that is repeated throughout the story.\n" +
                        "Red herring, or false foreshadowing- a false clue that misleads the investigators toward an incorrect solution. If the protagonist is misled, then the reader is typically misled by extension.\n" +
                        "In medias res, or into the middle of things- the story is began in the middle of the story rather than the beginning; the beginning is revealed through flashbacks. Everything ultimately leads up to a big revelation.\n" +
                        "Non-linear narrative- the plot and characters are revealed in a non-chronological order, meaning that instead of beginning, middle, and end, it might be end, beginning, and middle. This will force the reader to piece things together themselves, but not fully understand until a piece of crucial information is revealed at the climax.\n" +
                        "Reverse chronology, a form of non-linear narrative- Events are revealed from end to beginning."};
    }
}
