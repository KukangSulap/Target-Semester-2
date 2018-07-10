package com.barney.matapelajarantingkatsma;

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

        String[] any = {"Matematika", "Bahasa Inggris", "Bahasa Indonesia", "Fisika", "Kimia", "Biologi", "Sejarah", "Sosiologi","Ekonomi","Geografi"};
        String[] deskripsi = {"Matematika (dari bahasa Yunani: μαθημα - mathēma, \"pengetahuan, pemikiran, pembelajaran\") adalah studi besaran, struktur, ruang, dan perubahan. Para matematikawan mencari berbagai pola, dan menggunakannya untuk merumuskan konjektur baru, dan membangun kebenaran melalui metode deduksi yang ketat diturunkan dari aksioma-aksioma dan definisi-definisi yang bersesuaian.\n" +
                "\n" +
                "Terjadi perdebatan tentang apakah objek-objek matematika seperti bilangan dan titik sudah ada di semesta, jadi ditemukan, atau ciptaan manusia. Seorang matematikawan Benjamin Peirce menyebut matematika sebagai \"ilmu yang menggambarkan simpulan-simpulan yang penting\". Namun, walau matematika pada kenyataannya sangat bermanfaat bagi kehidupan, perkembangan sains dan teknologi, sampai upaya melestarikan alam, matematika hidup di alam gagasan, bukan di realita atau kenyataan. Dengan tepat, Albert Einstein menyatakan bahwa \"sejauh hukum-hukum matematika merujuk kepada kenyataan, mereka tidaklah pasti; dan sejauh mereka pasti, mereka tidak merujuk kepada kenyataan.\" Makna dari \"Matematika tak merujuk kepada kenyataan\" menyampaikan pesan bahwa gagasan matematika itu ideal dan steril atau terhindar dari pengaruh manusia. Uniknya, kebebasannya dari kenyataan dan pengaruh manusia ini nantinya justru memungkinkan penyimpulan pernyataan bahwa semesta ini merupakan sebuah struktur matematika, menurut Max Tegmark. Jika kita percaya bahwa realita di luar semesta ini haruslah bebas dari pengaruh manusia, maka harus struktur matematika lah semesta itu.",
                "Bahasa Inggris atau English adalah bahasa Jermanik yang pertama kali dituturkan di Inggris pada Abad Pertengahan Awal dan saat ini merupakan bahasa yang paling umum digunakan di seluruh dunia.[4] Bahasa Inggris dituturkan sebagai bahasa pertama oleh mayoritas penduduk di berbagai negara, termasuk Britania Raya, Irlandia, Amerika Serikat, Kanada, Australia, Selandia Baru, dan sejumlah negara-negara Karibia; serta menjadi bahasa resmi di hampir 60 negara berdaulat. Bahasa Inggris adalah bahasa ibu ketiga yang paling banyak dituturkan di seluruh dunia, setelah bahasa Mandarin dan bahasa Spanyol. Bahasa Inggris juga digunakan sebagai bahasa kedua dan bahasa resmi oleh Uni Eropa, Negara Persemakmuran, dan Perserikatan Bangsa-Bangsa, serta beragam organisasi lainnya.\n" +
                        "\n" +
                        "Bahasa Inggris berkembang pertama kali di Kerajaan Anglo-Saxon Inggris dan di wilayah yang saat ini membentuk Skotlandia tenggara. Setelah meluasnya pengaruh Britania Raya pada abad ke-17 dan ke-20 melalui Imperium Britania, bahasa Inggris tersebar luas di seluruh dunia. Di samping itu, luasnya penggunaan bahasa Inggris juga disebabkan oleh penyebaran kebudayaan dan teknologi Amerika Serikat yang mendominasi di sepanjang abad ke-20. Hal-hal tersebut telah menyebabkan bahasa Inggris saat ini menjadi bahasa utama dan secara tidak resmi (de facto) dianggap sebagai lingua franca di berbagai belahan dunia",
                "Bahasa Indonesia adalah bahasa Melayu yang dijadikan sebagai bahasa resmi Republik Indonesia[1] dan bahasa persatuan bangsa Indonesia.[2] Bahasa Indonesia diresmikan penggunaannya setelah Proklamasi Kemerdekaan Indonesia, tepatnya sehari sesudahnya, bersamaan dengan mulai berlakunya konstitusi. Di Timor Leste, bahasa Indonesia berstatus sebagai bahasa kerja.\n" +
                        "\n" +
                        "Dari sudut pandang linguistik, bahasa Indonesia adalah salah satu dari banyak ragam bahasa Melayu.[3] Dasar yang dipakai adalah bahasa Melayu Riau (wilayah Kepulauan Riau sekarang)[4] dari abad ke-19. Dalam perkembangannya ia mengalami perubahan akibat penggunaanya sebagai bahasa kerja di lingkungan administrasi kolonial dan berbagai proses pembakuan sejak awal abad ke-20. Penamaan \"Bahasa Indonesia\" diawali sejak dicanangkannya Sumpah Pemuda, 28 Oktober 1928, untuk menghindari kesan \"imperialisme bahasa\" apabila nama bahasa Melayu tetap digunakan.[5] Proses ini menyebabkan berbedanya Bahasa Indonesia saat ini dari varian bahasa Melayu yang digunakan di Riau maupun Semenanjung Malaya. Hingga saat ini, Bahasa Indonesia merupakan bahasa yang hidup, yang terus menghasilkan kata-kata baru, baik melalui penciptaan maupun penyerapan dari bahasa daerah dan bahasa asing.\n" +
                        "\n" +
                        "Meskipun dipahami dan dituturkan oleh lebih dari 90% warga Indonesia, Bahasa Indonesia bukanlah bahasa ibu bagi kebanyakan penuturnya. Sebagian besar warga Indonesia menggunakan salah satu dari 748 bahasa yang ada di Indonesia sebagai bahasa ibu.[6] Penutur Bahasa Indonesia kerap kali menggunakan versi sehari-hari (kolokial) dan/atau mencampuradukkan dengan dialek Melayu lainnya atau bahasa ibunya. Meskipun demikian, Bahasa Indonesia digunakan sangat luas di perguruan-perguruan, di media massa, sastra, perangkat lunak, surat-menyurat resmi, dan berbagai forum publik lainnya,[7] sehingga dapatlah dikatakan bahwa bahasa Indonesia digunakan oleh semua warga Indonesia.",
                "Fisika (bahasa Yunani: φυσικός (fysikós), \"alamiah\", dan φύσις (fýsis), \"alam\") adalah sains atau ilmu alam yang mempelajari materi [1] beserta gerak dan perilakunya dalam lingkup ruang dan waktu, bersamaan dengan konsep yang berkaitan seperti energi dan gaya.[2] Salah satu ilmu sains paling dasar, tujuan utama fisika adalah memahami bagaimana alam semesta berkerja.[a][3][4][5]\n" +
                        "\n" +
                        "Fisika adalah salah satu disiplin akademik paling tua, mungkin yang tertua melalui astronomi yang juga termasuk di dalamnya.[6] Lebih dari dua milenia, fisika menjadi bagian dari Ilmu Alam bersama dengan kimia, biologi, dan cabang tertentu matematika, namun ketika munculnya revolusi ilmiah pada abad ke-17, ilmu alam berkembang sebagai program penelitian sendiri.[b] Fisika berpotongan dengan banyak area penelitian bidang ilmu lain, seperti biofisika dan kimia kuantum, dan batasan fisiknya tidak didefinisikan dengan jelas. Ilmu baru dalam fisika terkadang digunakan untuk menjelaskan mekanisme dasar sains lainnya[3] serta membuka jalan area penelitian lainnya seperti matematika dan filsafat.\n" +
                        "\n" +
                        "Fisika juga menyumbangkan kontribusi yang penting dalam pengembangan teknologi yang berkembang dari pemikiran teoretis. Contohnya, pemahaman lebih lanjut mengenai elektromagnetisme atau fisika nuklir mengarahkan langsung pada pengembangan produk baru yang secara dramatis membentuk masyarakat modern, seperti televisi, komputer, peralatan rumah tangga, dan senjata nuklir;[3] kemajuan termodinamika mengarah pada pengembangan industrialisasi, dan kemajuan mekanika menginspirasi pengembangan kalkulus.",
                "Kimia adalah cabang dari ilmu fisik yang mempelajari tentang susunan, struktur, sifat, dan perubahan materi.[1][2] Ilmu kimia meliputi topik-topik seperti sifat-sifat atom, cara atom membentuk ikatan kimia untuk menghasilkan senyawa kimia, interaksi zat-zat melalui gaya antarmolekul yang menghasilkan sifat-sifat umum dari materi, dan interaksi antar zat melalui reaksi kimia untuk membentuk zat-zat yang berbeda.\n" +
                        "\n" +
                        "Kimia kadang-kadang disebut sebagai ilmu pengetahuan pusat karena menjembatani ilmu-ilmu pengetahuan alam, termasuk fisika, geologi, dan biologi.[3][4][5]\n" +
                        "\n" +
                        "Para ahli berbeda pendapat mengenai etimologi dari kata kimia. Sejarah kimia dapat ditelusuri kembali sampai pada alkimia, yang sudah dipraktikkan selama beberapa milenia di berbagai belahan dunia.",
                "Biologi adalah kajian tentang kehidupan, dan organisme hidup, termasuk struktur, fungsi, pertumbuhan, evolusi, persebaran, dan taksonominya.[1] Ilmu biologi modern sangat luas, dan eklektik, serta terdiri dari berbagai macam cabang, dan subdisiplin. Namun, meskipun lingkupnya luas, terdapat beberapa konsep umum yang mengatur semua penelitian, sehingga menyatukannya dalam satu bidang. Biologi umumnya mengakui sel sebagai satuan dasar kehidupan, gen sebagai satuan dasar pewarisan, dan evolusi sebagai mekanisme yang mendorong terciptanya spesies baru. Selain itu, organisme diyakini bertahan dengan mengonsumsi, dan mengubah energi serta dengan meregulasi keadaan dalamnya agar tetap stabil, dan vital.\n" +
                        "\n" +
                        "Subdisiplin biologi didefinisikan berdasarkan skala organisme yang dipelajari, jenis organisme yang dipelajari, dan metode yang digunakan untuk mempelajarinya antara lain:[2]\n" +
                        "\n" +
                        "Biokimia mempelajari kimia kehidupan.\n" +
                        "Biologi molekuler terkait dengan interaksi antar molekul biologis.\n" +
                        "Botani mempelajari biologi tumbuhan\n" +
                        "Biologi seluler meneliti satuan dasar semua kehidupan, yaitu sel\n" +
                        "Fisiologi mempelajari fungsi fisik, dan kimia jaringan organ, dan sistem organ suatu organisme\n" +
                        "Biologi evolusioner meneliti proses yang menghasilkan keanekaragaman hayati; dan ekologi mempelajari interaksi antara organisme dengan lingkungannya.",
                "Sejarah (bahasa Yunani: ἱστορία, historia, artinya \"mengusut, pengetahuan yang diperoleh melalui penelitian\")[2][3] adalah kajian tentang masa lampau, khususnya bagaimana kaitannya dengan manusia.[4][5] Dalam bahasa Indonesia sejarah babad, hikayat, riwayat, atau tambo dapat diartikan sebagai kejadian dan peristiwa yang benar-benar terjadi pada masa lampau atau asal usul (keturunan) silsilah, terutama bagi raja-raja yang memerintah.[6] Ini adalah istilah umum yang berhubungan dengan peristiwa masa lalu serta penemuan, koleksi, organisasi, dan penyajian informasi mengenai peristiwa ini. Istilah ini mencakup kosmik, geologi, dan sejarah makhluk hidup, tetapi seringkali secara umum diartikan sebagai sejarah manusia. Para sarjana yang menulis tentang sejarah disebut ahli sejarah atau sejarawan. Peristiwa yang terjadi sebelum catatan tertulis disebut Prasejarah.\n" +
                        "\n" +
                        "Sejarah juga dapat mengacu pada bidang akademis yang menggunakan narasi untuk memeriksa dan menganalisis urutan peristiwa masa lalu, dan secara objektif menentukan pola sebab dan akibat yang menentukan mereka.[7][8] Ahli sejarah terkadang memperdebatkan sifat sejarah dan kegunaannya dengan membahas studi tentang ilmu sejarah sebagai tujuan itu sendiri dan sebagai cara untuk memberikan \"pandangan\" pada permasalahan masa kini.",
                "Sosiologi berasal dari bahasa Latin yaitu Socius yang berarti kawan, sedangkan Logos berarti ilmu pengetahuan. Ungkapan ini dipublikasikan diungkapkan pertama kalinya dalam buku yang berjudul \"Cours De Philosophie Positive\" karangan August Comte (1798-1857). Walaupun banyak definisi tentang sosiologi namun umumnya sosiologi dikenal sebagai ilmu pengetahuan tentang masyarakat.\n" +
                        "\n" +
                        "Masyarakat adalah sekelompok individu yang mempunyai hubungan, memiliki kepentingan bersama, dan memiliki budaya. Sosiologi hendak mempelajari masyarakat, perilaku masyarakat, dan perilaku sosial manusia dengan mengamati perilaku kelompok yang dibangunnya.[butuh rujukan] Sebagai sebuah ilmu, sosiologi merupakan pengetahuan kemasyarakatan yang tersusun dari hasil-hasil pemikiran ilmiah dan dapat di kontrol secara kritis oleh orang lain atau umum.\n" +
                        "\n" +
                        "Kelompok tersebut mencakup keluarga, suku bangsa, negara, dan berbagai organisasi politik, ekonomi, sosial.",
                "Ekonomi merupakan salah satu ilmu sosial yang mempelajari aktivitas manusia yang berhubungan dengan produksi, distribusi, dan konsumsi terhadap barang dan jasa. Istilah \"ekonomi\" sendiri berasal dari bahasa Yunani, yaitu οἶκος (oikos) yang berarti \"keluarga, rumah tangga\" dan νόμος (nomos) yang berarti \"peraturan, aturan, hukum\". Secara garis besar, ekonomi diartikan sebagai \"aturan rumah tangga\" atau \"manajemen rumah tangga.\" Sementara yang dimaksud dengan ahli ekonomi atau ekonom adalah orang menggunakan konsep ekonomi, dan data dalam bekerja.",
                "Geografi adalah ilmu yang mempelajari tentang lokasi serta persamaan, dan perbedaan (variasi) keruangan atas fenomena fisik, dan manusia di atas permukaan bumi. Kata geografi berasal dari Bahasa Yunani yaitu gêo (\"Bumi\"), dan graphein (\"tulisan\", atau \"menjelaskan\").\n" +
                        "\n" +
                        "Geografi juga merupakan nama judul buku bersejarah pada subjek ini, yang terkenal adalah Geographia tulisan Klaudios Ptolemaios (abad kedua).\n" +
                        "\n" +
                        "Geografi lebih dari sekadar kartografi, studi tentang peta. Geografi tidak hanya menjawab apa, dan di mana di atas muka bumi, tapi juga mengapa di situ, dan tidak di tempat lainnya, kadang diartikan dengan \"lokasi pada ruang.\" Geografi mempelajari hal ini, baik yang disebabkan oleh alam atau manusia. Juga mempelajari akibat yang disebabkan dari perbedaan yang terjadi itu."};
    }

}
