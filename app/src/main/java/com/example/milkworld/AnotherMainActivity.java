package com.example.milkworld;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.synnapps.carouselview.ViewListener;
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;


import java.util.ArrayList;
import java.util.List;

public class AnotherMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private List<String> mImages;
    CarouselView carouselView;
    //int NUMBER_OF_PAGES = 5;
   List<DashboardDataModel> recyclerList1;
    List<DashboardDataModel> recyclerList2;
    List<DashboardDataModel> recyclerList3;
    List<DashboardDataModel> recyclerList4;
    List<DashboardDataModel> recyclerList5;
    MultiSnapRecyclerView recyclerView1;
    MultiSnapRecyclerView recyclerView2;
    MultiSnapRecyclerView recyclerView3;
    MultiSnapRecyclerView recyclerView4;
    MultiSnapRecyclerView recyclerView5;




    int[] sampleImages = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        carouselView = (CarouselView) findViewById(R.id.anoMain_cv);
        //carouselView.setPageCount(NUMBER_OF_PAGES);
       carouselView.setPageCount(sampleImages.length);


        recyclerView1 = (MultiSnapRecyclerView) findViewById(R.id.first_recycler_view);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recyclerList1 = new ArrayList<>();

        recyclerView2 = (MultiSnapRecyclerView) findViewById(R.id.second_recycler_view);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recyclerList2 = new ArrayList<>();

        recyclerView3 = (MultiSnapRecyclerView) findViewById(R.id.third_recycler_view);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recyclerList3 = new ArrayList<>();

        recyclerView4 = (MultiSnapRecyclerView) findViewById(R.id.fourth_recycler_view);
        recyclerView4.setHasFixedSize(true);
        recyclerView4.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recyclerList4 = new ArrayList<>();

        recyclerView5 = (MultiSnapRecyclerView) findViewById(R.id.fifth_recycler_view);
        recyclerView5.setHasFixedSize(true);
        recyclerView5.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recyclerList5 = new ArrayList<>();


        Button fab = (Button) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AnotherMainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        int[] cv_images = new int[]{
                R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5
        };

       com.synnapps.carouselview.CarouselView carouselView = (com.synnapps.carouselview.CarouselView)findViewById(R.id.anoMain_cv);
       int size = cv_images.length;
        //carouselView.setImageListener();

      // mImages = // load images here from database into a List with strings (URLs). Or simply create new ArrayList if your images URLs are hardcoded (already known).


       carouselView.setImageListener(imageListener);
        //carouselView.setViewListener(viewListener);

        recyclerList1.add(
                new DashboardDataModel(
                        1,
                        R.drawable.milk,
                        "Product1"));

        recyclerList1.add(
                new DashboardDataModel(
                        2,
                        R.drawable.milk,
                        "Product2"));

        recyclerList1.add(
                new DashboardDataModel(
                        3,
                        R.drawable.milk,
                        "Product3"));

        recyclerList2.add(
                new DashboardDataModel(
                        1,
                        R.drawable.milk,
                        "Product1"));

        recyclerList2.add(
                new DashboardDataModel(
                        2,
                        R.drawable.milk,
                        "Product2"));

        recyclerList2.add(
                new DashboardDataModel(
                        3,
                        R.drawable.milk,
                        "Product3"));

        recyclerList3.add(
                new DashboardDataModel(
                        1,
                        R.drawable.milk,
                        "Product1"));

        recyclerList3.add(
                new DashboardDataModel(
                        2,
                        R.drawable.milk,
                        "Product2"));

        recyclerList3.add(
                new DashboardDataModel(
                        3,
                        R.drawable.milk,
                        "Product3"));

        recyclerList4.add(
                new DashboardDataModel(
                        1,
                        R.drawable.milk,
                        "Product1"));

        recyclerList4.add(
                new DashboardDataModel(
                        2,
                        R.drawable.milk,
                        "Product2"));

        recyclerList4.add(
                new DashboardDataModel(
                        3,
                        R.drawable.milk,
                        "Product3"));

        recyclerList5.add(
                new DashboardDataModel(
                        1,
                        R.drawable.milk,
                        "Product1"));

        recyclerList5.add(
                new DashboardDataModel(
                        2,
                        R.drawable.milk,
                        "Product2"));

        recyclerList5.add(
                new DashboardDataModel(
                        3,
                        R.drawable.milk,
                        "Product3"));


        //creating recyclerview adapter
        MultiViewTypeAdapter adapter1 = new MultiViewTypeAdapter(this, recyclerList1);

        //setting adapter to recyclerview
        recyclerView1.setAdapter(adapter1);

        //creating recyclerview adapter
        MultiViewTypeAdapter adapter2 = new MultiViewTypeAdapter(this, recyclerList2);

        //setting adapter to recyclerview
        recyclerView2.setAdapter(adapter2);

        //creating recyclerview adapter
        MultiViewTypeAdapter adapter3 = new MultiViewTypeAdapter(this, recyclerList3);

        //setting adapter to recyclerview
        recyclerView3.setAdapter(adapter3);

        //creating recyclerview adapter
        MultiViewTypeAdapter adapter4 = new MultiViewTypeAdapter(this, recyclerList4);

        //setting adapter to recyclerview
        recyclerView4.setAdapter(adapter4);

        //creating recyclerview adapter
        MultiViewTypeAdapter adapter5 = new MultiViewTypeAdapter(this, recyclerList5);

        //setting adapter to recyclerview
        recyclerView5.setAdapter(adapter5);



    }



    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

   ViewListener viewListener = new ViewListener() {
       @Override
       public View setViewForPosition(int position) {
           View customView = getLayoutInflater().inflate(R.layout.content_another_main, null);
           return customView;
       }
   };





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.another_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_cart) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

        } else if (id == R.id.deals) {

        } else if (id == R.id.aboutUs) {

        } else if (id == R.id.callUs) {

        } else if (id == R.id.history) {

        } else if (id == R.id.settings) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
