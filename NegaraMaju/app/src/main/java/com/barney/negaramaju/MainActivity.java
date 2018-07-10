package com.barney.negaramaju;
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

        String[] any = {"Jepang", "Inggris","Amerika Serikat", "Selandia Baru", "Swedia", "Kanada", "Islandia","Irlandia","Belanda","Jerman"};
        String[] deskripsi = {"Negara kepulauan yang secara geografis terletak di satu benua dengan bangsa kita dan memiliki iklim yang cenderung dingin ini termasuk ke dalam negara yang terbilang maju. Jepang memiliki jumlah penduduk lebih dari 130 juta pada tahun 2016 ini mempunyai HDI sebesar 0.903. Secara geografis Negara maju Jepang terletak di kawasan Asia Timur, tepatnya di sebelah timur dari China dan semenanjung Korea. Negara Jepang memiliki 4 pulau besar yaitu Pulau Hokkaido, Honshu, Shikoku, dan Kyushu. Sementara secara astronomis, Jepang terletak pada 30 derajat hingga 47 derajat lintang utara dan 128 derajat hingga 146 derajat bujur timur. Penduduk Jepang terkenal memiliki etos kerja tinggi, pekerja keras, dan disiplin yang kuat. Hal tersebut juga mendorong kemajuan Jepang di segala bidang, terutama sektor perekonomian tersebut.",
                "Inggris mempunyai HDI 0.909 mempunyai jumlah penduduk sebesar 70 juta. Tak hanya mempunyai daya tarik di bidang fashion, Inggris juga menyimpan banyak sejarah dalam dunia arsitektur dengan beberapa desain jembatan yang sangat eksotik nan megah. Selain itu, di Inggris juga terdapat banyak tempat wisata yang banyak menarik wisatawan asing. Bentuk pemerintahan Negara Inggris adalah monarki parlementer. Kepala pemerintahan Inggris dipegang oleh perdana menteri, sedangkan kepala negara dijabat oleh seorang ratu. Dalam sektor ekonomi, Inggris merupakan negara industri yang maju, terutama dalam bidang teknologi, ilmu pengetahuan, dan juga sastra.\n" +
                        "\n",
                "Amerika Serikat atau yang lebih umum dikenal dengan Amerika adalah sebuah negara republik konstitusional federal yang terletak di kawasan Amerika utara. Amerika merupakan negara termaju di dunia dalam segala bidang sehingga negara ini mendapat julukan negara super power.  Amerika dengan jumlah penduduk mencapai 321 juta ini memiliki HDI 0.920. Amerika memiliki pendapatn per kapita yang cukup tinggi yaitu 47.400 US Dollar. Kegiatan industry terpenting dari negara ini antara lain, industri pesawat terbang, industri mobil, tekstil, industri pertambangan, serta industri perfilman yang terkenal yaitu di Kota Hollywood.",
                "Selandia Baru memiliki nilai HDI sebesar 0.915 dan pendapatan per kapita sebesar 37.807 US Dollar menjadikan negara ini termasuk dalam daftar negara maju yang ada di bumi bagian selatan selain Australia. Beberapa komoditas ekspor yang mampu menunjang perekonomian negara ini antara lain produk susu, buah, daging, dan lain-lain.",
                "Negara yang terletak di semenanjung Skandinavia ini memiliki jumlah penduduk sekitar 10 juta jiwa. Swedia memiliki tingkat pengangguran yang sangat kecil. Negara dengan pendapatan per kapita 50.272 USD pada tahun 2015 ini memiliki nilai HDI 0.913. Pendapatan per kapita Swedia juga terus naik dari tahun ke tahun. Swedia sendiri terkenal memiliki banyak pantai eksotik yang mempunyai jalur perdagangan laut super sibuk di dunia.\n" +
                        "\n",
                "Negara yang terletak di sebelah utara Amerika Serikat ini mempunyai nilai HDI 0.920. Tak hanya menyandang gelar negara maju, Negara yang beribu kota Ottawa ini juga salah satu negara terkaya di dunia dengan berlimpahnya sumber daya alam yang dimilikinya.  Selain itu, Kanada memiliki banyak destinasi wisata yang mendunia seperti air terjun Niagara serta beberapa destinasi seperti taman dan gunung yang menjadi pilihan utama wisatawan internasional yang mengunjungi negara tersebut.",
                "Islandia merupakan negara Nordik yang terletak di sebelah barat laut dari benua Eropa. Dengan jumlah penduduk yang kecil yaitu 230.823 jiwa dan HDI 0.921 serta pendapatan per kapita sebesar 50.173 USD membuat Islandia menjadi salah negara paling maju di seluruh dunia saat ini. Selain itu, Islandia dikenal dengan sebagai negara dengan keanekaragaman hayati yang lumayan banyak, tercatat sekitar 1300 spesies serangga menghuni negara ini.",
                "Negara dengan ibu kota Dublin ini mempunyai sistem pemerintahan republik parlementer yang mana kepala negara dipilih oleh rakyat dan peran parlemen menjadi yang paling penting di Irlandia. Negara dengan HDI 0.923 dan jumlah penduduk sekitar 5 juta jiwa ini mampu menunjukkan pribadi yang bisa mengangkat negaranya termasuk ke dalam negara maju.",
                "Belanda adalah bangsa yang terkenal dengan kincir angin dan juga bunga tulipnya. Belanda merupakan negara yang hanya 20% daratan ini hidup setidaknya hanya 1 meter di atas permukaan laut. Belanda mempunyai HDI 0.924 dengan jumlah penduduk sekitar 23 juta jiwa ini merupakan salah satu pendiri dari uni Eropa.",
                "Jerman merupakan negara paling berpengaruh di benua Eropa. Negara dengan jumlah penduduk lebih 82 juta jiwa ini memiliki HDI 0.926 dan pendapatan per kapita sekitar 46.896 USD membuat Jerman memiliki kesejahteraan masyarakat yang sangat baik."};
    }

}
