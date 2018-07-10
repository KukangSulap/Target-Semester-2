package com.barney.parodymarbelbinatang;

/**
 * Created by barney on 31/03/18.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Album> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail;
        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }


    public AlbumsAdapter(Context mContext, List<Album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final Album album = albumList.get(position);
        holder.title.setText(album.getName());

        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

        holder.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, detail.class);
                intent.putExtra("any", any[position]);
                intent.putExtra("deskripsi", deskripsi[position]);
                intent.putExtra("image", image[position]);
                mContext.startActivity(intent);
            }
        });
    }


    /**
     * Click listener for popup menu items
     */

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    String [] any = {"Ant-Eater","Musang","Beruang","Banteng","Unta","Kucing","Bunglon","Ayam","Sapi","Kerbau","Buaya","Rusa","Anjing","Lumba-Lumba","Keledai","Bebek","Gajah","Ikan","Rubah","Jerapah","Kambing","Angsa"};

    int [] image ={R.drawable.anteater,R.drawable.badger,R.drawable.bear,R.drawable.bull,R.drawable.camel,R.drawable.cat,R.drawable.chameleon,R.drawable.cock,R.drawable.cow,R.drawable.cowatu,R.drawable.crocodile,R.drawable.deer,R.drawable.dog,R.drawable.dolphin,R.drawable.donkey,R.drawable.duck,R.drawable.elephant,R.drawable.fish,R.drawable.fox,R.drawable.giraffe,R.drawable.goat,R.drawable.goose};

    String [] deskripsi = {"Trenggiling biasa (Manis javanica syn. Paramanis javanica) adalah wakil dari ordo Pholidota yang masih ditemukan di Asia Tenggara. Hewan ini memakan serangga dan terutama semut dan rayap. Trenggiling hidup di hutan hujan tropis dataran rendah. Trenggiling kadang juga dikenal sebagai anteater (pemakan semut).\n" +
            "\n" +
            "Bentuk tubuhnya memanjang, dengan lidah yang dapat dijulurkan hingga sepertiga panjang tubuhnya untuk mencari semut di sarangnya. Rambutnya termodifikasi menjadi semacam sisik besar yang tersusun membentuk perisai berlapis sebagai alat perlindungan diri. Jika diganggu, trenggiling akan menggulungkan badannya seperti bola. Ia dapat pula mengebatkan ekornya, sehingga \"sisik\"nya dapat melukai kulit pengganggunya.\n" +
            "\n" +
            "Trenggiling terancam keberadaannya akibat habitatnya terganggu serta menjadi objek perdagangan hewan liar. Trenggiling merupakan salah satu hewan yang dilindungi di Indonesia.",
            "Musang adalah nama umum bagi sekelompok mamalia pemangsa (bangsa karnivora) dari suku Viverridae. Hewan ini kebanyakan merupakan hewan malam (nokturnal) dan pemanjat yang baik.\n" +
                    "\n" +
                    "Yang paling dikenal dari berbagai jenisnya adalah musang luwak (Paradoxurus hermaphroditus). Musang ini biasa hidup di dekat pemukiman, termasuk perkotaan, dan sering pula didapati memangsa ayam peliharaan di malam hari.",
            "Beruang memiliki indra penciuman dan pendengaran yang ulung, bertelinga bundar, berekor kecil, berbulu yang panjang, lebat dan kasar, Mereka memiliki cakar yang lebar dan berjumlah lima pada telapak tangan yang tak dapat ditarik masuk. Cakar-cakarnya digunakan untuk menyobek, menggali, dan menangkap. Pengelihatan beruang hampir sama dengan pengelihatan manusia. Beruang hitam dan sejenisnya tidak buta warna.",
                    "Tengkorang Banteng di Taman Nasional Baluran\n" +
                    "Banteng atau tembadau (dari bahasa Jawa, banṭhèng), Bos javanicus, adalah hewan yang sekerabat dengan sapi dan ditemukan di Myanmar, Thailand, Kamboja, Laos, Vietnam, Kalimantan, Jawa, dan Bali. Banteng dibawa ke Australia Utara pada masa kolonisasi Britania Raya pada tahun 1849 dan sampai sekarang masih lestari.\n" +
                    "\n" +
                    "Terdapat tiga anak jenis banteng liar: B. javanicus javanicus (di Jawa, Madura, dan Bali), B. javanicus lowi (di Kalimantan, jantannya berwarna coklat bukan hitam), dan B. javanicus birmanicus (di Indocina). Anak jenis yang terakhir digolongkan sebagai Terancam oleh IUCN.",
            "Unta atau Onta adalah dua spesies hewan berkuku belah dari genus Camelus (satu berpunuk tunggal - Camelus dromedarius, satu lagi berpunuk ganda - Camelus bactrianus) yang hidup ditemukan di wilayah kering dan gurun di Asia dan Afrika Utara. Rata-rata umur harapan hidup unta adalah antara 30 sampai 50 tahun.\n" +
                    "\n" +
                    "Domestikasi unta oleh manusia telah dimulai sejak kurang lebih 5.000 tahun yang lalu. Pemanfaatan unta antara lain untuk diambil susu (yang memiliki nilai nutrisi lebih tinggi daripada susu sapi) serta dagingnya, dan juga digunakan sebagai hewan pekerja.",
            "Kucing disebut juga kucing domestik[1][2] atau kucing rumah (nama ilmiah: Felis silvestris catus atau Felis catus) adalah sejenis mamalia karnivora dari keluarga Felidae. Kata \"kucing\" biasanya merujuk kepada \"kucing\" yang telah dijinakkan,[6] tetapi bisa juga merujuk kepada \"kucing besar\" seperti singa dan harimau.\n" +
                    "\n" +
                    "Kucing telah berbaur dengan kehidupan manusia paling tidak sejak 6.000 tahun SM, dari kerangka kucing di Pulau Siprus.[7] Orang Mesir Kuno dari 3.500 SM telah menggunakan kucing untuk menjauhkan tikus atau hewan pengerat lain dari lumbung yang menyimpan hasil panen.[8]\n" +
                    "\n" +
                    "Saat ini, kucing adalah salah satu hewan peliharaan terpopuler di dunia.[9] Kucing yang garis keturunannya tercatat secara resmi sebagai kucing trah atau galur murni (pure breed), seperti persia, siam, manx, dan sphinx. Kucing seperti ini biasanya dibiakkan di tempat pemeliharaan hewan resmi. Jumlah kucing ras hanyalah 1% dari seluruh kucing di dunia, sisanya adalah kucing dengan keturunan campuran seperti kucing liar atau kucing kampung.",
            "Bunglon adalah sejenis reptil yang termasuk ke dalam suku (familia) Agamidae. Kadal lain yang masih sesuku adalah cecak terbang (Draco spp.) dan soa-soa (Hydrosaurus spp.).\n" +
                    "\n" +
                    "Bunglon meliputi beberapa marga, seperti Bronchocela, Calotes, Gonocephalus, Pseudocalotes dan lain-lain. Bunglon bisa mengubah-ubah warna kulitnya, meskipun tidak sehebat perubahan warna chamaeleon (suku Chamaeleonidae). Biasanya berubah dari warna-warna cerah (hijau, kuning, atau abu-abu terang) menjadi warna yang lebih gelap, kecoklatan atau kehitaman.",
            "Ayam peliharaan (Gallus gallus domesticus) adalah unggas yang biasa dipelihara orang untuk dimanfaatkan untuk keperluan hidup pemeliharanya. Ayam peliharaan (selanjutnya disingkat \"ayam\" saja) merupakan keturunan langsung dari salah satu subspesies ayam hutan yang dikenal sebagai ayam hutan merah (Gallus gallus) atau ayam bangkiwa (bankiva fowl). Kawin silang antarras ayam telah menghasilkan ratusan galur unggul atau galur murni dengan bermacam-macam fungsi; yang paling umum adalah ayam potong (untuk dipotong) dan ayam petelur (untuk diambil telurnya). Ayam biasa dapat pula dikawin silang dengan kerabat dekatnya, ayam hutan hijau, yang menghasilkan hibrida mandul yang jantannya dikenal sebagai ayam bekisar.\n" +
                    "\n" +
                    "Dengan populasi lebih dari 24 milyar pada tahun 2003, Firefly's Bird Encyclopaedia menyatakan ada lebih banyak ayam di dunia ini daripada burung lainnya. Ayam memasok dua sumber protein dalam pangan: daging ayam dan telur.",
            "Sapi adalah hewan ternak anggota suku Bovidae dan anak suku Bovinae. Sapi yang telah dikebiri dan biasanya digunakan untuk membajak sawah dinamakan Lembu. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia. Hasil sampingan, seperti kulit, jeroan, tanduk, dan kotorannya juga dimanfaatkan untuk berbagai keperluan manusia. Di sejumlah tempat, sapi juga dipakai sebagai penggerak alat transportasi, pengolahan lahan tanam (bajak), dan alat industri lain (seperti peremas tebu). Karena banyak kegunaan ini, sapi telah menjadi bagian dari berbagai kebudayaan manusia sejak lama.\n" +
                    "\n" +
                    "Kebanyakan sapi ternak merupakan keturunan dari jenis liar yang dikenal sebagai Auerochse atau Urochse (dibaca auerokse, bahasa Jerman berarti \"sapi kuno\", nama ilmiah: Bos primigenius[1]), yang sudah punah di Eropa sejak 1627. Namun, terdapat beberapa spesies sapi liar lain yang keturunannya didomestikasi, termasuk sapi bali yang juga diternakkan di Indonesia.",
            "Kerbau adalah binatang memamah biak yang menjadi ternak bagi banyak bangsa di dunia, terutama Asia. Hewan ini adalah domestikasi dari kerbau liar (orang India menyebutnya arni) yang masih dapat ditemukan di daerah-daerah Pakistan, India, Bangladesh, Nepal, Bhutan, Vietnam, Cina, Filipina, Taiwan, Indonesia, dan Thailand.\n" +
                    "\n" +
                    "Saat ini populasi kerbau liar di Asia mulai menurun dan dikhawatirkan pada masa yang akan datang tidak akan ada lagi populasi kerbau liar yang dapat ditemukan. Kerbau dewasa dapat memiliki berat sekitar 300 kg hingga 600 kg. Kerbau liar dapat memiliki berat yang lebih, kerbau liar betina dapat mencapai berat hingga 800 kg dan kerbau liar jantan dapat mencapai berat hingga 1200 kg. Berat rata-rata kerbau jantan adalah 900 kg dan tinggi rata-rata di bagian pundak kerbau adalah 1,7 meter.\n" +
                    "\n" +
                    "Salah satu ciri yang membedakan kerbau liar dari kerbau peliharaan adalah bahwa kerbau peliharaan memiliki perut yang bulat. Dengan adanya percampuran keturunan antara kerbau-kerbau antara populasi yang berbeda, berat badan kerbau dapat bervariasi.",
            "Buaya adalah reptil bertubuh besar yang hidup di air. Secara ilmiah, buaya meliputi seluruh spesies anggota suku Crocodylidae, termasuk pula buaya sepit (Tomistoma schlegelii). Meski demikian nama ini dapat pula dikenakan secara longgar untuk menyebut ‘buaya’ aligator, kaiman dan gavial; yakni kerabat-kerabat buaya yang berlainan suku.\n" +
                    "\n" +
                    "Buaya umumnya menghuni habitat perairan tawar seperti sungai, danau, rawa dan lahan basah lainnya, namun ada pula yang hidup di air payau seperti buaya muara. Makanan utama buaya adalah hewan-hewan bertulang belakang seperti bangsa ikan, reptil dan mamalia, kadang-kadang juga memangsa moluska dan krustasea bergantung pada spesiesnya. Buaya merupakan hewan purba, yang hanya sedikit berubah karena evolusi semenjak zaman dinosaurus.",
            "Rusa, sambar, atau menjangan (Bahasa Inggris: deer) adalah hewan mamalia pemamah biak (ruminan) yang termasuk familia Cervidae. Salah satu ciri khas rusa adalah adanya antler (tanduk rusa), dan bukan tanduk, yang merupakan pertumbuhan tulang yang berkembang setiap tahun (biasanya pada musim panas) terutama pada rusa jantan (walaupun ada beberapa pengecualian). Ada sekitar 34 spesies rusa di seluruh dunia yang terbagi menjadi dua kelompok besar: kelompok rusa dunia lama yang termasuk subfamilia Muntiacinae dan Cervinae; serta kelompok rusa dunia baru, Hydropotinae dan Odocoilinae.\n" +
                    "\n" +
                    "Bobot rusa umumnya berkisar 30-250 kilogram (70 hingga £ 600), meskipun Pudu Utara rata-rata 10 kilogram (20 lb) dan Moose rata-rata 431 kilogram (1.000 lb). Mereka umumnya memiliki luwes, badan kompak dan panjang, kaki kuat cocok untuk medan hutan kasar. Rusa juga jumper yang sangat baik dan perenang. Rusa ruminansia , atau kunyahan-pengunyah, dan memiliki empat bilik perut. Gigi rusa disesuaikan dengan makan pada vegetasi, dan seperti ruminansia lainnya, mereka kekurangan atas gigi seri , bukan memiliki pad berat di bagian depan rahang atas mereka. Beberapa rusa, seperti di pulau Rum , [3] jangan mengkonsumsi daging bila tersedia. [4] rusa air Cina, rusa Tufted dan kijang telah diperbesar atas gigi taring membentuk taring tajam, sementara spesies lain sering kekurangan atas taring sama sekali. Gigi pipi rusa memiliki pegunungan sabit dari enamel, yang memungkinkan mereka untuk menggiling berbagai vegetasi.",
            "Anjing adalah mamalia yang telah mengalami domestikasi dari serigala sejak 15.000 tahun yang lalu[3] atau mungkin sudah sejak 100.000 tahun yang lalu berdasarkan bukti genetik berupa penemuan fosil dan tes DNA.[4] Penelitian lain mengungkap sejarah domestikasi anjing yang belum begitu lama.[5][6][7]\n" +
                    "\n" +
                    "Anjing telah berkembang menjadi ratusan ras dengan berbagai macam variasi. Warna rambut anjing bisa beraneka ragam, mulai dari putih sampai hitam, juga merah, abu-abu (sering disebut \"biru\"), dan coklat. Selain itu, anjing memiliki berbagai jenis rambut. Rambut anjing bisa lurus atau keriting, dan bertekstur kasar hingga lembut seperti benang wol.",
            "Lumba-lumba adalah mamalia laut yang sangat cerdas, selain itu sistem alamiah yang melengkapi tubuhnya sangat kompleks. Sehingga banyak teknologi yang terinspirasi dari lumba-lumba. Salah satu contoh adalah kulit lumba-lumba yang mampu memperkecil gesekan dengan air, sehingga lumba-lumba dapat berenang dengan sedikit hambatan air. Hal ini yang digunakan para perenang untuk merancang baju renang yang mirip kulit lumba-lumba.\n" +
                    "\n" +
                    "Lumba-lumba memiliki sebuah sistem yang digunakan untuk berkomunikasi dan menerima rangsang yang dinamakan sistem sonar, sistem ini dapat menghindari benda-benda yang ada di depan lumba-lumba, sehingga terhindar dari benturan. Teknologi ini kemudian diterapkan dalam pembuatan radar kapal selam. Lumba-lumba adalah binatang menyusui karena lumba lumba adalah mamalia. Mereka hidup di laut dan sungai di seluruh dunia. Lumba-lumba adalah kerabat paus dan pesut. Ada lebih dari 40 jenis lumba-lumba.",
            "Keledai (Equus asinus) adalah mamalia dari keluarga Equidae. Merupakan hewan jinak yang digunakan untuk bertransportasi dan kerja lain, seperti menarik kereta kuda maupun membajak ladang.\n" +
                    "\n" +
                    "Keledai bisa memiliki anak campuran dengan kuda. Anak kuda betina dan keledai jantan disebut bagal. Anak keledai betina dan kuda jantan disebut hinny. Bagal lebih umum, dan telah digunakan untuk transportasi manusia dan benda.\n" +
                    "\n" +
                    "Keledai, hewan yang juga masih keluarga kuda ini sudah menemani manusia sejak 5000 tahun lalu. Nenek moyang dari keledai yaitu keledai liar di Afrika atau keledai e. Africanus. Bahkan keledai saat itu sudah memperlihatkan kehebatan tubuhnya, dengan menjadi hewan pekerja. Keledai menjadi alat transportasi yang dikhususkan membawa barang, sementara orang-orang pemilik barang akan menunggangi kuda.",
            "Bebek atau Itik adalah nama umum untuk beberapa spesies burung dalam famili Anatidae. Bebek umumnya adalah burung akuatik yang sebagian besar berukuran lebih kecil dibandingkan kerabatnya, angsa dan angsa berleher pendek, dan dapat ditemukan pada perairan air tawar maupun air laut.\n" +
                    "\n" +
                    "Bebek kadang-kadang disamakan dengan beberapa burung air yang berhubungan jauh namun mirip dalam penampilan, misalnya loon, grebe, gallinule, dan coot.\n" +
                    "\n" +
                    "Beberapa jenis bebek juga dapat melakukan kawin silang, namun menghasilkan keturunan yang steril dan tidak bisa memiliki keturunan. Seperti persilangan antara serati dan bebek pelari dapat menghasilkan keturunan steril, brati dan tiktok.",
            "Gajah adalah mamalia besar dari familia Elephantidae dan ordo Proboscidea. Secara tradisional, terdapat dua spesies yang diakui, yaitu gajah afrika (Loxodonta africana) dan gajah asia (Elephas maximus), walaupun beberapa bukti menunjukkan bahwa gajah semak afrika dan gajah hutan afrika merupakan spesies yang berbeda (L. africana dan L. cyclotis). Gajah tersebar di seluruh Afrika sub-Sahara, Asia Selatan, dan Asia Tenggara. Elephantidae adalah satu-satunya familia dari ordo Proboscidea yang masih lain; familia lain yang kini sudah punah termasuk mammoth dan mastodon. Gajah afrika jantan merupakan hewan darat terbesar dengan tinggi yang dapat mencapai 4 m (13 ft) dan massa yang kurang lebih 7.000 kg (15.000 lb). Gajah memiliki ciri-ciri khusus, dengan yang paling mencolok adalah belalai atau proboscis yang digunakan untuk banyak hal, terutama untuk bernapas, menghisap air, dan mengambil benda. Gigi serinya tumbuh menjadi taring yang dapat digunakan sebagai senjata dan alat untuk memindahkan benda atau menggali. Daun telinganya yang besar membantu mengatur suhu tubuh mereka. Gajah afrika memiliki telinga yang lebih besar dan punggung yang cekung, sementara telinga gajah asia lebih kecil dan punggungnya cembung.\n" +
                    "\n" +
                    "Gajah merupakan hewan herbivora yang dapat ditemui di berbagai habitat, seperti sabana, hutan, gurun, dan rawa-rawa. Mereka cenderung berada di dekat air. Gajah dianggap sebagai spesies kunci karena dampaknya terhadap lingkungan. Hewan-hewan lain cenderung menjaga jarak dari gajah, dan predator-predator seperti singa, harimau. hyena, dan anjing liar biasanya hanya menyerang gajah muda. Gajah betina cenderung hidup dalam kelompok keluarga, yang terdiri dari satu betina dengan anak-anaknya atau beberapa betina yang berhubungan dengan anak-anak mereka. Kelompok ini dipimpin oleh individu gajah yang disebut matriark, yang biasanya merupakan betina tertua. Gajah memiliki struktur kelompok fisi-fusi, yaitu ketika kelompok-kelompok keluarga bertemu untuk bersosialisasi. Gajah jantan meninggalkan kelompok keluarganya ketika telah mencapai masa pubertas, dan akan tinggal sendiri atau bersama jantan lainnya. Jantan dewasa biasanya berinteraksi dengan kelompok keluarga ketika sedang mencari pasangan dan memasuki tahap peningkatan testosteron dan agresi yang disebut musth, yang membantu mereka mencapai dominasi dan keberhasilan reproduktif. Anak gajah merupakan pusat perhatian kelompok keluarga dan bergantung pada induknya selama kurang lebih tiga tahun. Gajah dapat hidup selama 70 tahun di alam bebas. Mereka berkomunikasi melalui sentuhan, penglihatan, penciuman, dan suara; gajah menggunakan infrasuara dan komunikasi seismik untuk jarak jauh. Kecerdasan gajah telah dibandingkan dengan kecerdasan primata dan cetacea. Mereka tampaknya memiliki kesadaran diri dan menunjukkan empati kepada gajah lain yang hampir atau sudah mati.",
            "Ikan adalah anggota vertebrata poikilotermik (berdarah dingin)[1] yang hidup di air dan bernapas dengan insang. Ikan merupakan kelompok vertebrata yang paling beraneka ragam dengan jumlah spesies lebih dari 27,000 di seluruh dunia. Secara taksonomi, ikan tergolong kelompok paraphyletic yang hubungan kekerabatannya masih diperdebatkan; biasanya ikan dibagi menjadi ikan tanpa rahang (kelas Agnatha, 75 spesies termasuk lamprey dan ikan hag), ikan bertulang rawan (kelas Chondrichthyes, 800 spesies termasuk hiu dan pari), dan sisanya tergolong ikan bertulang keras (kelas Osteichthyes). Ikan dalam berbagai bahasa daerah disebut iwak (jv, bjn), jukut (vkt).\n" +
                    "\n" +
                    "Ikan memiliki bermacam ukuran, mulai dari paus hiu yang berukuran 14 meter (45 ft) hingga stout infantfish yang hanya berukuran 7 mm (kira-kira 1/4 inch). Ada beberapa hewan air yang sering dianggap sebagai \"ikan\", seperti ikan paus, ikan cumi dan ikan duyung, yang sebenarnya tidak tergolong sebagai ikan.\n" +
                    "\n" +
                    "Sampai saat ini, ikan pada umumnya dikonsumsi langsung. Upaya pengolahan belum banyak dilakukan kecuali ikan asin. Ikan dapat diolah menjadi berbagai produk seperti ikan kering, dendeng ikan, abon ikan, kerupuk ikan, ikan asin, kemplang, bakso ikan dan tepung darah ikan sebagai pupuk tanaman dan pakan ikan.",
            "Rubah adalah karnivora kecil. Terdapat 27 spesies rubah, mereka adalah hewan omnivora dan anggota terkecil famili Canidae (mamalia yang berhubungan dengan anjing). Mereka adalah pelari cepat dan tangkas.\n" +
                    "\n" +
                    "Rubah dapat ditemui di semua benua, hidup di hutan, semak-semak dan padang pasir. Kebanyakan rubah makan tikus, vole, kelinci, telur burung, serangga besar dan daging bangkai. Di Britania Raya, terdapat olahraga umum untuk berburu rubah dengan kuda dan anjing.",
            "Jerapah atau zarafah (nama ilmiah: Giraffa camelopardalis) adalah mamalia berkuku genap endemik Afrika dan merupakan spesies hewan tertinggi yang hidup di darat. Jerapah jantan dapat mencapai tinggi 4,8 sampai 5,5 meter dan memiliki berat yang dapat mencapai 1.360 kilogram. Jerapah betina biasanya sedikit lebih pendek dan lebih ringan.\n" +
                    "\n" +
                    "Jerapah berkerabat dengan rusa dan sapi tetapi dari suku yang berbeda, yaitu Giraffidae yang mencakup jerapah sendiri dan kerabat terdekatnya, okapi. Habitat aslinya mencakup area dari Chad sampai dengan Afrika Selatan\n" +
                    "\n" +
                    "Nama spesiesnya camelopardalis diambil dari nama dalam latin, karena dianggap sebagai bastar unta (camel) dan macan tutul (leopard). Nama camelopardalis dipakai oleh Plinius senior dalam ensiklopedia yang ditulisnya. Nama ini juga dipakai sebagai nama salah satu rasi bintang. Nama \"jerapah\" sendiri dipinjam dari nama hewan ini dalam bahasa Arab (الزرافة, zirafah).",
            "Kambing ternak (Capra aegagrus hircus) merupakan salah satu subspesies kambing yang dipelihara atau dijinakkan dari kambing liar Asia Barat Daya dan Eropa Timur. Kambing merupakan anggota dari keluarga Bovidae dan bersaudara dengan dengan biri-biri karena keduanya tergolong dalam sub famili Caprinae. Terdapat lebih 300 jenis kambing yang berbeda-beda.[1] Kambing adalah salah satu di antara spesies yang paling lama di ternakkan, yaitu untuk susu, daging, bulu, dan kulit di seluruh dunia.[2] Pada tahun 2011, populasi kambing yang hidup di seluruh dunia mencapai 924 juta menurut Organisasi Pangan dan Pertanian Perserikatan Bangsa-Bangsa.[3]\n" +
                    "\n" +
                    "\n" +
                    "Seekor kambing jantan dewasa.\n" +
                    "Kambing merupakan binatang memamah biak yang berukuran sedang. Kambing ternak (Capra aegagrus hircus) adalah subspesies kambing liar yang secara alami tersebar di Asia Barat Daya (daerah \"Bulan sabit yang subur\" dan Turki) dan Eropa. Kambing liar jantan maupun betina memiliki tanduk sepasang, namun tanduk pada kambing jantan lebih besar. Umumnya, kambing mempunyai janggut, dahi cembung, ekor agak ke atas, dan kebanyakan berrambut lurus dan kasar. Panjang tubuh kambing liar, tidak termasuk ekor, adalah 1,3 meter - 1,4 meter, sedangkan ekornya 12 sentimeter - 15 sentimeter. Bobot yang betina 50 kilogram - 55 kilogram, sedangkan yang jantan bisa mencapai 120 kilogram. Kambing liar tersebar dari Spanyol ke arah timur sampai India, dan dari India ke utara sampai Mongolia dan Siberia. Habitat yang disukainya adalah daerah pegunungan yang berbatu-batu.\n" +
                    "\n" +
                    "Kambing sudah dibudidayakan manusia kira-kira 8000 hingga 9000 tahun yang lalu. Di alam aslinya, kambing hidup berkelompok 5 sampai 20 ekor. Dalam pengembaraannnya mencari makanan, kelompok kambing ini dipimpin oleh kambing betina yang paling tua, sementara kambing-kambing jantan berperan menjaga keamanan kawanan. Waktu aktif mencari makannya siang maupun malam hari. Makanan utamanya adalah rumput-rumputan dan dedaunan.",
            "Angsa adalah burung air berukuran besar dari genus Cygnus famili Anatidae. Bebek dan Angsa berleher pendek juga terdapat di famili Anatidae. Angsa bersama angsa berleher pendek masuk ke dalam subfamili Anserinae namun Angsa memiliki suku sendiri, yaitu suku Cygnini. Terdapat tujuh spesies dalam genus Cygnus. Angsa adalah hewan monogami, 'perceraian' kadang-kadang terjadi jika proses bersarang mengalami kegagalan.\n" +
                    "\n" +
                    "Angsa adalah anggota terbesar dari famili Anatidae, dan merupakan salah satu burung air terbesar yang dapat terbang. Spesies terbesar dari angsa, yaitu Angsa Putih, Angsa Trompet, dan Angsa Whooper dapat mencapai panjang 60 inci dan berat 50 pound. Bentangan sayap mereka dapat mencapai panjang tiga meter. Dibandingkan dengan saudaranya, angsa berleher pendek, angsa berukuran lebih besar dalam ukuran dan secara proporsional memiliki kaki dan leher yang lebih besar. Pada angsa dewasa, mereka mempunyai tanda berupa kulit yang tidak ditutupi bulu di antara mata dan paruh. Angsa jantan dan betina mirip, tidak menunjukkan sifat dimorfisme seksual. Namun ukuran angsa jantan umumnya lebih besar dan lebih berat.\n" +
                    "\n" +
                    "Spesies di belahan bumi utara memiliki warna bulu yang putih bersih, namun angsa di belahan bumi selatan campuran warna hitam dan putih. Angsa Hitam Australia (Cygnus atratus) berwarna hitam secara keseluruhan kecuali bulu yang dugunakan untuk terbang pada bagian sayapnya. Angsa hitam muda berwarna abu-abu cerah. Di Amerika Selatan, Angsa Berleher Hitam memiliki leher berwarna hitam sesuai namanya. Kaki angsa umumnya berwarna abu-abu gelap, kecuali dua spesies yang berasal dari Amerika Selatan yang memiliki kaki berwarna merah muda. Warna paruh bervariasi; spesies subartik memiliki paruh berwarna hitam dengan campuran warna kuning. Yang lainnya berwarna merah dan hitam."};


}