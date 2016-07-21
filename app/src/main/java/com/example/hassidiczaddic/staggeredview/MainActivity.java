package com.example.hassidiczaddic.staggeredview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(MainActivity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
     // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();



        for (int i=0;i<=11;i++) {
            listViewItems.add(new ItemObjects("ANGRY-BIRD:" +i, R.drawable.angry_bird_1));

           // listViewItems.add(new ItemObjects("ANGRY-BIRD:" +i, R.drawable.angry_bird_one));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD" +i, R.drawable.angry_bird_one));
            //listViewItems.add(new ItemObjects("Benzene", R.drawable.angry_bird_three));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD", R.drawable.angry_bird_two));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD", R.drawable.angry_bird_four));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD", R.drawable.angry_bird_one));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD", R.drawable.angry_bird_two));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD", R.drawable.angry_bird_four));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD", R.drawable.angry_bird_four));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD", R.drawable.angry_bird_two));
            //listViewItems.add(new ItemObjects("ANGRY-BIRD", R.drawable.angry_bird_one));
            //listViewItems.add(new ItemObjects("Ester", R.drawable.angry_bird_three));
            // listViewItems.add(new ItemObjects("Alcohol", R.drawable.angry_bird_three));
        }
        return listViewItems;
    }
}