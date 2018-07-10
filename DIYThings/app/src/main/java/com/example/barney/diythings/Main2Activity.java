package com.example.barney.diythings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    RecyclerView view;
    CustomAdapter adapter;
    private int adapterPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        view = findViewById(R.id.recycler1);
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
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,  null);
                return new MyViewHolder(v);
            }


            @Override
            public void onBindViewHolder(final MyViewHolder holder, final int position) {
                holder.icon.setImageResource(iconImg[position]);
                holder.nmWebsite.setText(any[position]);
                holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Main2Activity.this, diyprops.class);
                        intent.putExtra("any", any[position]);
                        intent.putExtra("url", url[position]);
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
                ImageView icon;
                TextView nmWebsite;

                public MyViewHolder(View itemView) {
                    super(itemView);
                    icon = itemView.findViewById(R.id.imgIcon);
                    nmWebsite = itemView.findViewById(R.id.Web);
                }
            }
        }

    String [] any = {"Making Optimus Prime’s Blaster","How to Make a Wooden Katana","How to make a cyborg arm","How to make a lightsaber and complete your Jedi training","Making a Shore Trooper helmet (Rogue One / Star Wars)","Making a Bödvar’s Viking Helm from Brawlhalla","How to make the Batman Mech Helmet Prop from BvS"};
    int [] iconImg = {R.drawable.diyprops1, R.drawable.diyprops2, R.drawable.diyprops3, R.drawable.diyprops4, R.drawable.diyprops5, R.drawable.diyprops6, R.drawable.diyprops7};
    String [] url = {
            "https://r4---sn-npoe7ne7.googlevideo.com/videoplayback?id=o-AP8I9lAnbAVCTtZyD-JPMeW2QWz4hDFNCistv1g0Zu4K&ip=162.210.251.144&key=cms1&gir=yes&clen=75151257&ipbits=0&sparams=clen,dur,ei,expire,gir,id,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pl,ratebypass,requiressl,source&signature=5946023223D5866A16364A324012211F2D78748B.05021AE7B8FAB3A9349082B082076C39905AFF33&ratebypass=yes&c=WEB&expire=1521216871&mime=video%2Fmp4&itag=18&pl=24&dur=927.033&source=youtube&requiressl=yes&lmt=1518194587498235&fvip=6&ei=B5mrWubNK8PT_AOTuITYBQ&video_id=AvA0VrdRRUA&title=How+to+make+an+Optimus+Prime+Blaster+Prop&redirect_counter=1&rm=sn-nx5lr7d&req_id=f10047c1de8ca3ee&cms_redirect=yes&ipbypass=yes&mip=180.244.232.30&mm=31&mn=sn-npoe7ne7&ms=au&mt=1521195255&m",
            "https://r4---sn-npoe7n76.googlevideo.com/videoplayback?requiressl=yes&expire=1521216218&ratebypass=yes&ipbits=0&sparams=clen,dur,ei,expire,gir,id,initcwndbps,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pcm2,pl,ratebypass,requiressl,source&ip=23.94.22.66&key=cms1&lmt=1518277353540667&fvip=4&source=youtube&id=o-AMZMFfsIc6qEdEF8KZVS7gF-x0ebyMX7HA1ivMmWWxRo&dur=841.073&itag=18&clen=67730515&gir=yes&pl=24&ei=eparWq-_DIiWhgaqkLaAAg&pcm2=yes&mime=video%2Fmp4&signature=6A74111953A6DC201BD4EB8FBA9B7FC16CEC7E82.5EEDE6D73F0D0EB9E11146B7FFDD694B803F1079&c=WEB&video_id=2nshBD9EbxE&title=How+to+make+a+Wooden+Katana+from+hardwood+flooring+--+Woodworking&redirect_counter=1&rm=sn-ab5rz7z&req_id=eabad53078ffa3ee&cms_redirect=yes&ipbypass=yes&mip=180.244.232.30&mm=31&mn=sn-npoe7n76&ms=au&mt=1521194525&mv=m",
            "https://r5---sn-npoe7n7r.googlevideo.com/videoplayback?lmt=1507876376543430&dur=725.321&source=youtube&ratebypass=yes&key=cms1&ei=z5mrWoPIMZqBhwaR9ZngCQ&clen=63188000&expire=1521217071&pl=24&mime=video%2Fmp4&itag=18&sparams=clen,dur,ei,expire,gir,id,initcwndbps,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pl,ratebypass,requiressl,source&id=o-AMHTc_6Fvsh8oBEY9-dk-QgK-xgUTv8e19dufuzRmNu4&c=WEB&fvip=5&ipbits=0&signature=79EFF165CBC66D46DE88A1F35621A07CE83B1A2A.191A485D55540D4E878343A7AAC35603803A3191&gir=yes&requiressl=yes&ip=50.31.8.50&video_id=BU0FBJ9APl8&title=Cyborg+Arm+%28Cosplay-Halloween+Costume+How+To%29&redirect_counter=1&rm=sn-vgqe7z76&req_id=9b2de1f3ae03a3ee&cms_redirect=yes&ipbypass=yes&mip=180.244.232.30&mm=31&mn=sn-npoe7n7r&ms=au&mt=1521195382&mv=m",
            "https://r4---sn-npoeenee.googlevideo.com/videoplayback?ei=IiSqWqnMK8nruQXkipqwCQ&dur=817.412&fvip=4&pl=24&lmt=1499944972233653&expire=1521121410&ipbits=0&sparams=dur,ei,expire,id,initcwndbps,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pl,ratebypass,requiressl,source&key=cms1&mime=video%2Fmp4&c=WEB&requiressl=yes&id=o-APH4E6D_MZ0gKcpASCiKyGvglp9ojfZlmb8o4tQWXz5s&itag=22&ratebypass=yes&source=youtube&signature=49EE22679CBC19B0CDDAE64C2375DB1C0DFCF4F4.6D9EF8B93999BC36CA2EFDA2A34D3ABEEFA95698&ip=173.234.194.248&video_id=a0d-wT6YS4w&title=How+to+make+a+Lightsaber+%28+for+Star+Wars+Day+%29&redirect_counter=1&rm=sn-vgqeez7z&req_id=9e2100255bcda3ee&cms_redirect=yes&ipbypass=yes&mip=180.244.232.30&mm=31&mn=sn-npoeenee&ms=au&mt=1521099683&mv=m",
            "https://r4---sn-npoeen7k.googlevideo.com/videoplayback?mime=video%2Fmp4&ip=50.31.8.50&key=cms1&lmt=1481891605355943&dur=600.073&itag=22&pl=24&source=youtube&expire=1521190467&fvip=4&c=WEB&id=o-APrV00JJemP0C4wDfXKhAgbaO8g8rCVy5ou5l2mHF-hg&ratebypass=yes&ipbits=0&ei=4zGrWpzDKsyf8wSqwoa4Dg&signature=257572F8682BD1B1FBD2DD4AD2A26D71567CE0AB.515E113F665A07FCF3B8FEAB1B409BE5A16E2108&requiressl=yes&sparams=dur,ei,expire,id,initcwndbps,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pl,ratebypass,requiressl,source&video_id=kCmJen4Fm-Q&title=Star+Wars+Rogue+One+Shore+Trooper+Helmet+%283d+printed%29+--+How-To&rm=sn-vgqee67z&req_id=4e834b1b397da3ee&ipbypass=yes&mip=180.244.232.30&redirect_counter=2&cm2rm=sn-2uuxa3vh-jb3s7z&cms_redirect=yes&mm=29&mn=sn-npoeen7k&ms=rdu&mt=1521168819&mv=m",
            "https://r6---sn-a5mlrn7l.googlevideo.com/videoplayback?source=youtube&ratebypass=yes&ipbits=0&c=WEB&ip=193.227.49.83&fvip=2&mime=video%2Fmp4&signature=40261AF522A7862ECD1B5A32D53B072E02BFFC51.01685C610ECC32A1F46FDB146DF4CDA96E4DDD74&ei=qzOrWuaoMZaF0wXEn5XwCw&id=o-ANetkf_JXLKv0e_MBXQ9ALey291pbHMX4rTXxmUvfm8K&pl=24&dur=717.194&expire=1521190923&key=cms1&requiressl=yes&lmt=1490381976004175&itag=22&sparams=dur,ei,expire,id,initcwndbps,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pl,ratebypass,requiressl,source&video_id=k4q6Xz4TVzU&title=How+to+make+B%C3%B6dvar%27s+Viking+Helm+from+Brawlhalla&rm=sn-upoxu-25gs7d&req_id=d0f8b2061d0aa3ee&ipbypass=yes&redirect_counter=2&cm2rm=sn-hpazk7l&cms_redirect=yes&mip=180.244.232.30&mm=34&mn=sn-a5mlrn7l&ms=ltu&mt=1521169231&mv=m",
            "https://r2---sn-a5meknee.googlevideo.com/videoplayback?expire=1521193143&pl=22&mime=video%2Fmp4&itag=22&ei=VzyrWpOQKsr6DvrYkqAE&sparams=dur,ei,expire,id,initcwndbps,ip,ipbits,ipbypass,itag,lmt,mime,mm,mn,ms,mv,nh,pl,ratebypass,requiressl,source&ipbits=0&id=o-AOVQBHmLLpJEWRtpYz3vNUvdyjbcSOCmds7ImrpWy4EG&c=WEB&fvip=6&signature=0544DB52F5E0D01A06708946419AB57012E5C19E.0FB373F37B4013B0B803BC9DF77CDF28B3D77F6A&requiressl=yes&ip=173.232.7.186&lmt=1477143440931072&dur=689.284&ratebypass=yes&source=youtube&key=cms1&video_id=muOiPOYXzKA&title=Batman+Mech+Helmet+Prop+from+BvS+--How-To&redirect_counter=1&cm2rm=sn-bvvbax-2imeez&req_id=7be7e6fa2afea3ee&cms_redirect=yes&ipbypass=yes&mm=30&mn=sn-a5meknee&ms=nxu&mt=1521171620&mv=m"
    };
    String[] deskripsi = {
            "Ok, first off, this project has been a dream of mine since I was a kid. I understand that it may not be accessible to everyone or very practical for that matter, but…It. Is. Awesome!\n" +
                    "\n" +
                    "If you know anything about me, it’s that I am a huge fan of 80’s toys and movies. I geek out the hardest over my favorite cartoon and toy collection, Transformers. In the past I’ve made the Transformer’s Matrix of Leadership and rigged up my Land Cruiser to play sounds form the show, but I’ve always wanted to recreate Optimus Prime’s blaster. But I didn’t want to just remake the tiny toy version, I wanted to make an ion cannon fit for Optimus Prime himself!\n" +
                    "\n" +
                    "I began this project by using my G-1 (Generation-1) toys as reference. I researched how tall Optimus would be in real life and tried to scale the blaster to fit his real-world size. As it turns out, the ion cannon would have to be 8 foot long…so…it’ll be scaled 1:2 and should end up about 4 foot long.\n" +
                    "\n" +
                    "I had some scrap 4 inch PVC pipe left over and decided to use it for the barrel pieces that are just basic cylinders. I initially decided to cover the PVC in EVA foam sheets so that I could carve out the transitions and the detail insets. I fashioned up a wooden pistol grip and magazine that I would also wrap in foam and carve. After all those pieces were assembled and I began to notch out the details, I realized that the scale was off and I wasn’t very happy with the project. I was already a few hours into the blaster and I wanted to muscle through to get it as close as I could to the actual toy. I stepped back and decided that my initial plan wasn’t going to produce the beloved prop from my childhood, it was heading toward a wonky-looking cannon that wouldn’t be immediately recognizable as Optimus Prime’s blaster.\n" +
                    "\n" +
                    "So, I changed plans.\n" +
                    "\n" +
                    "I still had some 4 inch PVC left over, so I decided to restart the project using those pieces (without any EVA foam) and 3d printing the rest of the intricate structure. I’ve had a lot of modeling practice in Fusion 360 lately, and I was confident that I could use reference photos of my old toys and recreated the blaster as a 3d model. I recently received a Lulzbot Taz 6 with a MOARstruder from Matterhackers and it really shined while printing these large parts. The MOARstruder is a custom filament extruder that pumps out 3 times as much plastic as a conventional extruder in a single pass, and it worked great!\n" +
                    "\n" +
                    "After a lot of time modeling and printing the individual components I had to assemble the pieces. The barrel was scaled perfectly using the PVC and 3d printed accents and the rest of the bulky pieces were printed without much infill because the 1.2mm extruder made some pretty strong walls. Some of the pieces were too big to fit on the Taz 6’s print bed, so they had to printed in pieces and glued together using CA glue and Bondo to fill in the seams. Then I sanded, a lot.\n" +
                    "\n" +
                    "I wanted the blaster to play sounds and have lights come out of the barrel so I rigged up an Arduino Nano with an Adafruit sound board and amp that would cycle blaster sounds and lights when a button was pressed. And because there’s always more than meets the eye, I had a separate button that played just Transformers sound clips. To defuse the LED strip when the lights fired, I printed a semi-translucent disc that would stand-off from the sides so that sound could still escape, but the light would be diffused. I decided to mount all of the audio components in the barrel so that the cannon could be taken apart to charge the battery back. If you want to get the code to use for you own projects, it’s on my GitHub.\n" +
                    "\n" +
                    "After a few coats of filler primer I used a metallic black spray paint to cover the whole blaster to match the G-1 toy. I lightly weathered the outside using dry brushing to give the cannon some dimension. After I was happy with the look, I went over the finished product with some clear coat to protect it.\n" +
                    "\n" +
                    "\n" +
                    "I am extremely happy with how this project turned out. It was a bit rocky in the beginning, but switching to a 3d modeling/printing process really gave me that accurate look that my 8-year-old self really wanted. If you enjoyed this nostalgic project, you can check out more of my prop builds!",
            "I have always been intrigued by martial arts and after watching Iron Fist on Netflix I had the idea of making my own practice katana. I had a lot of scrap hardwood flooring from our home renovations, so I found some really beautiful pieces and got to work.\n" +
                    "Most of the sword is made from left over cumaru teak flooring that I recently used in our house. It has a really beautiful grain pattern and some elegant figuring, plus it’s extremely dense and hard. I had just finished watching Alec Steele’s series on making a Damascus steel katana, so I had a rough idea on how the whole thing went together.\n" +
                    "\n" +
                    "First, I drew out the rough shape of the blade based on some online dimensions. I cut out this shape on the bandsaw making sure to leave a tang on the bottom that would fit inside the hilt. I rough sanded the blade to give the sword some definition and moved on to the tsuba, or hand guard.\n" +
                    "\n" +
                    "I found another smaller piece of teak flooring for the tsuba. I used some calipers to measure the tang dimensions and transferred those lines to the blank tsuba. I drilled out this space and had to chisel and file the pocket very carefully so that the blade tang would sit snuggly into it. After I had a good fit,  I cut the tsuba into an oval using a paper template.\n" +
                    "\n" +
                    "After researching how katana hilts are wrapped in cotton or silk strips, I decided to recreate that look with an inlayed contrasting wood. I had a piece of scrap oak flooring from my boys’ room which would look awesome against the teak hilt. While I worked on other projects, I had my friend Josh CNC out the hilt design and the resulting diamond pattern looked just like a traditional fabric wrap. I hogged out the inside of the hilt to receive the tang and once I got a snug fit, it was time to assemble the major components.\n" +
                    "\n" +
                    "The tsuba fit onto the tang and the tang fit into the hilt. I added a kashira or pommel to the end of the hilt and it was all done. I finished the katana with some linseed oil and beeswax polish and it looks gorgeous! I am so happy to have my own sword and I feel like a true samurai!",
            "Since we moved this past summer, I’ve been faced with lots and lots of practical projects to get our house and my shop in working order. After a considerable amount of hardwood flooring and shop furniture building, I needed a break to make something just for fun. With Halloween around the corner, I figured a simple costume would be a great project. Of course, I don’t have tons of time to make a complete elaborate costume, so I settled on just an arm.. for a cyborg of course.Making a cyborg arm allowed me to wear mostly normal clothes, then add the arm (tucked under my short sleeve). When I get tired of trick or treating (which won’t take too long), I can just slide the arm off and I’m back to regular old Dad.\n" +
                    "\n" +
                    "I love making projects with EVA foam and hope to do many more in the coming year. It’s a really accessible material that can produce some amazing pieces for prop and costume work!",
            "It’s safe to say, I’m a Star Wars nerd.  I’ll admit that.  Given that fact, making a lightsaber has been on my to do list for a very long time! I actually started this project almost two years ago and have worked on it on and off since then. At different points in the process, I ran into hardware problems and software problems. Each one of these would be a big enough stumbling block that  I would put the project down for six months or more before coming back to it.  After missing my May 4 (Star Wars day) deadline last year, I decided that this year it had to happen.\n" +
                    "\n" +
                    "I’ve been focused on it for the past couple of weeks and was able to work through all of the previous problems as well as completely remodel the hilt from scratch to account for some new electronics. I’m extremely excited to have a working version of the lightsaber, but also really motivated to improve it! Now that I’ve got a stable hardware and software platform, I’ve got plans for version 2, which should happen in far less than two years \uD83D\uDE42\n" +
                    "\n" +
                    "If you want to check out the code (be warned, it’s rough and ugly but functional) you can download it on my GitHub.\n" +
                    "\n" +
                    "Enjoy, and May the Fourth be with you!",
            "I’m a HUGE Star Wars nerd.. in case that wasn’t obvious.  With Rogue One coming out next week, I’ve been consuming every bit of Star Wars info and photos that I can get my hands on.  Early on in the movie promotion, they released an image of three new storm trooper helmets that would be featured in this new movie outing.  All three were cool, but one really caught my eye.. the Shore Trooper. I’ve been really interested in making props lately, so making a Star Wars prop seemed like a pretty logical next step.\n" +
                    "Since I already made the Batman helmet using eva foam, I decided to make this one with 3d printing.  This also gave me a really good reason to learn Fusion 360, which I’d been keeping at arms length until now.   All said, I probably put in 40-50 hours of modeling for this project and I still see lots of things that could be improved in the model to make it more accurate.  As with all projects, there could always be more time spent modeling, sanding, finishing, polishing.  Regardless of that, I’m EXTREMELY happy with how this thing came out.  Honestly, the photos and videos don’t quite do it justice in my opinion.  This MIGHT be my favorite thing I’ve ever made!\n" +
                    "\n" +
                    "Go check it out!",
            "A really good friend of mine is the lead artist on the video game Brawlhalla. he designs characters, backgrounds, weapons, etc. (He’s also the guy who drew the artwork for my arcade machine.) His team goes to all of the major video game shows and has a booth setup where people can come play the game. They asked me to make a costume piece from the game that they could take with them!\n" +
                    "\n" +
                    "They chose the character Bödvar, who looks like a viking with a horned helm. This piece would be quick and easy for someone to throw on and quickly take a photo. Check out how I made it!",
            "Remember when I recently made a life cast of my head? That was all preparation for THIS project.  I’ve been really interested in making some helmets for a while, more as props than as costumes.  I’ve always been a Batman fan and I really love the look of the mech armor from Batman Vs Superman. I THOUGHT that it’d be a relatively straight forward shape to make.  It turned out to be much more difficult than I expected, but after four tries, I finally got a base shape that I could work with.\n" +
                    "One of the reasons I love making projects with EVA foam, is that it can encompass a huge number of skills, but doesn’t absolutely require any special tools. Of course, tools make it faster and easier, but you can get a TON accomplished with a sharp knife, some sand paper and CA glue.\n" +
                    "\n" +
                    "This is just the first of my costume/prop builds that I have planned, and I hope it’ll teach you as much as it taught me!"
    };
}

