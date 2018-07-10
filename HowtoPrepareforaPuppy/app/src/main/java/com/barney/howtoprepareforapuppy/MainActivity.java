package com.barney.howtoprepareforapuppy;

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

        String[] any = {"Create an area in your house just for the puppy",
                "Make your puppy’s area safe",
                "Choose a crate for your puppy",
                "Purchase bedding to help your dog sleep",
                "Buy equipment for potty training",
                "Select and purchase a high quality food",
                "Purchase at least two bowls",
                "Give your puppy a substitute for chewing",
                "Buy a collar (or harness) and leash",
                "Stock up on brushes to groom",
                "Get a dog-safe toothbrush and toothpaste",
                "Understand that dominating your dog will not work",
                "Keep in mind that puppies learn by result",
                "Consider enrolling your puppy in an obedience training course"};
        String[] deskripsi = {"When you first bring your new puppy home, it is a good idea to keep him within the confines of just one or two rooms at first. Common choices include the kitchen, laundry room, or den. This allows your puppy to explore while keeping him safe. It also makes it easier for you to keep track of your puppy and clean up after him.\n" +
                "If allowed to wander the house freely, a puppy may feel overwhelmed and confused by all the new scents and sounds.\n" +
                "Puppies are more likely to soil an area again after they have an accident in the house, so it is good to keep a close watch on him so that you can take him to go potty when he needs to go.",
                "You can puppy-proof the area that you have chosen for your puppy by cleaning it well, removing any wires or other items the puppy may chew, removing ornaments or anything the puppy may bump into or break. Also, make sure that you remove anything from this area you don't want soiled, chewed or scratched.\n" +
                        "Keep in mind that puppies will chew anything, electrical cables are no exception. Make sure they are out of your puppy’s reach.\n" +
                        "Place all hazardous substances out of your puppy’s reach. This includes cleaning products, medications, vitamins, plants, cat litter boxes, tobacco products, garbage, and anything else that your puppy may try to eat.",
                "Crate training is a powerful method to train your puppy, but it is not required. If you do decide to crate train your puppy, choose a crate the puppy can stand up in and lie down with his legs extended. Make sure that there is a soft bed inside the crate as well.\n" +
                        "The idea of crate training is to teach the puppy that the crate is his safe place, kind of like a wild dog’s den.\n" +
                        "Keep in mind that the crate should never be used as a punishment or a prison. It should be a place where the dog goes willingly for a time-out and where you know he is safe when you aren't with him.[3]\n" +
                        "Wire crates are ideal because the dog can see everything around him. This helps him to feel more secure.",
                "Choose bedding that is machine washable and that your puppy can snuggle into. Get at least two sets of bedding. That way one set can be in the wash while the other set is in use.[4]\n" +
                        "Make sure your puppy is raised slightly off the ground in his bed, so he avoids draughts at floor level.",
                "Even if you will be taking your puppy outside to a toilet spot, it is also a good idea to provide him with a place to relieve himself indoors in case of an emergency. Puppy pads are useful for this - they are like a large flat, absorbent cloth that you can just throw away.\n" +
                        "You can also use newspaper but it is slightly less absorbent, so there is a greater chance that you will end up with some urine on the floor.\n" +
                        "It is also a good idea to get some disposable gloves, a disposable kitchen towel, and some disinfectant spray (enzymatic - not ammonia or bleach based) for cleaning up messes.[5]\n" +
                        "Some dog trainers also recommend getting a timer, and setting it to go off every half hour. Then, every time the timer goes off, take your puppy out for a toilet break.",
                "Make sure that the food you choose for your puppy is formulated for puppies and that it is appropriate for your dog’s breed. Talk to your vet about what dog foods have the best quality ingredients for your puppy and ask for recommendations about how much and how often to feed your puppy.[6]\n" +
                        "Puppies require more frequent feedings than adult dogs. That means that you will have to feed your puppy three meals per day until he reaches 18 weeks. Then you can switch to two meals per day.[7]\n" +
                        "Provide treats for your puppy as well. Use treats to reinforce your puppy’s good behavior. Doing so will also improve your bond with your new puppy.[8]\n" +
                        "Be consistent with the type of food you feed your puppy. Changing his food overnight can cause severe gastric distress. If you must change him to a new brand, do so gradually. Add about 1/3 of the new food to the old food and increase the amount over the course of a week until you are feeding him only the new food.[9]\n" +
                        "Keep in mind it is quite difficult to feed a balanced homemade diet to a growing puppy. The balance of calcium and phosphate needs to be exactly right in order to provide for growing bones, and this is difficult for even expert nutritionists to achieve. Remember, wild dogs don't live nearly as long as our pets.",
                "You will need to have two separate bowls for your puppy’s food and water. Choose bowls that are easy to clean and that are dishwasher safe. It is a good idea to choose ceramic or stainless steel bowls because these cannot be damaged by chewing and they have a smooth surface that does not harbor as much bacteria as plastic bowls.[10]\n" +
                        "Make sure that your puppy always has access to fresh, clean water. Keep the bowl filled and change his water out every day.",
                "Puppies have to chew, so always provide something suitable for your puppy to chew on. Make sure that you choose your puppy’s chew toys with care because many toys are not safe for an unsupervised puppy. If your puppy chews a hole in a toy and swallows some plastic, this can lead to a serious bowel obstruction.\n" +
                        "Select toys or chews that are suitable for unsupervised access, such as a KONG toy. These toys are designed to be filled with treats to keep your puppy entertained and give him a chewing outlet.[11]\n" +
                        "Make sure the toy is large enough that it can't be swallowed whole. If you are trying to decide between two toys, buy the larger one.",
                "Usually collars come in x-small, small, medium, large, and x-large. Choose a collar and leash that is appropriate for your dog’s size and breed.[13]\n" +
                        "For example, smaller dog’s will require a lightweight leash, while a large dog may require a harness and heavyweight leash.\n" +
                        "Get a retractable leash for walking and 2–4 foot (0.6–1.2 m) leash for training.",
                "Purchase a soft brush to shine your puppy’s coat and a wire or pin brush to eliminate knots and mats. You may also want to get a comb for detail grooming.[14]\n" +
                        "Teach your puppy to enjoy being brushed and groomed from day one. Doing so will help you to avoid problems when the dog is an adult.",
                "Dental disease is very common in dogs due to a lack of dental care in most dogs. Introducing your puppy to a dental care at a young age helps him to accept tooth brushing as normal. This way, you can brush your dog’s teeth daily and ensure that he has good dental health as he grows.[15]\n" +
                        "Start getting your puppy used to having your fingers in his mouth by putting some chicken broth or peanut butter on one of your fingers and letting him lick it off. Do this a few times and try to rub a finger on his teeth and gums as you do so.\n" +
                        "After your puppy gets used to your fingers, start introducing the toothbrush. Try to brush your puppy’s teeth once every day for a couple of minutes.",
                "Dominating the puppy in order to make him behave is regarded as old-fashioned now. The observations of wolf packs which lead to the theory of dominance hierarchy were made on wolves kept in a zoo under artificial and stressful conditions. The conditions forced the wolves to behave in an aggressive, challenging way to one another, but wolves in the wild do not behave this way. Wolves in the wild live as family units and cooperate with each other.[16]\n" +
                        "Try to think of yourself as a more mature member of the family who will guide your puppy (a new member) to be well-behaved and offer gentle correction whenever he steps out of line.",
                "Young puppies love to explore and experiment. Puppies will repeat behaviors that give them pleasure, such as playing with a ball. They will not repeat behaviors that get no response or that are unpleasant (such as disturbing a bee and getting stung).[17]\n" +
                        "Ignore your puppy if he displays bad behavior and give him lots of praise if he displays good behavior. Reward your puppy with treats and praise when he obeys a command or does something good, like going potty outside.[18]\n" +
                        "Make sure that you set firm rules and apply them in a consistent way.",
                "An obedience training course will help you to develop some appropriate strategies for responding to your puppy’s behavior. It will also give you an opportunity to bond with your puppy and give him a chance to socialize with some other puppies.[19]\n" +
                        "Check with your local pet store, groomer, or veterinarian to find out about puppy training classes in your area."};
    }

}
