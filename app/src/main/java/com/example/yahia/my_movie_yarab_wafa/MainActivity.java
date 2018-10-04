package com.example.yahia.my_movie_yarab_wafa;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.yahia.my_movie_yarab_wafa.data.dataList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      //  MovieFragment movieFragmentTop = new MovieFragment(dataList.movieListTopRated);
        MovieFragment movieFragmentPop = new MovieFragment();
        MovieFragment movieFragmentFav = new MovieFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_view,movieFragmentTop)
                .commit();

        TabLayout tabLayout=findViewById(R.id.TAB);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.top_ratred));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.popular));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.favorite));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                case 0:

                    break;
                    case 1:

                        break;
                        case 2:

                            break;
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
