package com.barney.parodymarbelbinatang;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        recyclerView = findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(this, albumList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        try {
            Glide.with(this).load(R.drawable.backdrop).into(( ImageView ) findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onBindViewHolder ( final AlbumsAdapter.MyViewHolder holder, final int position){

    }

    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Parody Marbel Binatang");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }


    /**
     * Adding few albums for testing
     */
    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.anteater,
                R.drawable.badger,
                R.drawable.bear,
                R.drawable.bull,
                R.drawable.camel,
                R.drawable.cat,
                R.drawable.chameleon,
                R.drawable.cock,
                R.drawable.cow,
                R.drawable.cowatu,
                R.drawable.crocodile,
                R.drawable.deer,
                R.drawable.dog,
                R.drawable.dolphin,
                R.drawable.donkey,
                R.drawable.duck,
                R.drawable.elephant,
                R.drawable.fish,
                R.drawable.fox,
                R.drawable.giraffe,
                R.drawable.goat,
                R.drawable.goose,
        };

        Album a = new Album("Ant-Eater", 13, covers[0]);
        albumList.add(a);

        a = new Album("Musang", 8, covers[1]);
        albumList.add(a);

        a = new Album("Beruang", 11, covers[2]);
        albumList.add(a);

        a = new Album("Banteng", 12, covers[3]);
        albumList.add(a);

        a = new Album("Unta", 14, covers[4]);
        albumList.add(a);

        a = new Album("Kucing", 1, covers[5]);
        albumList.add(a);

        a = new Album("Bunglon", 11, covers[6]);
        albumList.add(a);

        a = new Album("Ayam", 14, covers[7]);
        albumList.add(a);

        a = new Album("Sapi", 11, covers[8]);
        albumList.add(a);

        a = new Album("Kerbau", 17, covers[9]);
        albumList.add(a);

        a = new Album("Buaya", 17, covers[10]);
        albumList.add(a);

        a = new Album("Rusa", 17, covers[11]);
        albumList.add(a);

        a = new Album("Anjing", 17, covers[12]);
        albumList.add(a);

        a = new Album("Lumba-lumba", 17, covers[13]);
        albumList.add(a);

        a = new Album("Kedelai", 17, covers[14]);
        albumList.add(a);

        a = new Album("Bebek", 17, covers[15]);
        albumList.add(a);

        a = new Album("Gajah", 17, covers[16]);
        albumList.add(a);

        a = new Album("Ikan", 17, covers[17]);
        albumList.add(a);

        a = new Album("Rubah", 17, covers[18]);
        albumList.add(a);

        a = new Album("Jerapah", 17, covers[19]);
        albumList.add(a);

        a = new Album("Kambing", 17, covers[20]);
        albumList.add(a);

        a = new Album("Angsa", 17, covers[21]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}