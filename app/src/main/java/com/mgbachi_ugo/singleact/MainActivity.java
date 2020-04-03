package com.mgbachi_ugo.singleact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Details> detail = new ArrayList<>();
    private ArrayList<String> likes, hobbies, dislike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // info for likes view
        likes = new ArrayList<>();
        likes.add("Life");
        likes.add("Money");
        likes.add("Food");
        likes.add("Water");
        likes.add("Comfort");
        likes.add("Clothes");
        likes.add("Shoes");
        likes.add("Money");
        likes.add("Sex");
        likes.add("Honesty");
        likes.add("Driving");
        likes.add("Money");
        likes.add("Money");
        likes.add("Music");
        likes.add("Driving");
        likes.add("0 Errors");

        //info for hobbies view
        hobbies = new ArrayList<>();
        hobbies.add("Eating");
        hobbies.add("Sleep");
        hobbies.add("Travel");
        hobbies.add("Chilling");
        hobbies.add("Movies");
        hobbies.add("games");
        hobbies.add("reading");
        hobbies.add("Dancing");
        hobbies.add("Cake");
        hobbies.add("Twitter");
        hobbies.add("Jollof");
        hobbies.add("Riding");


        //info for dislike view
        dislike = new ArrayList<>();
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");
        dislike.add("Bugs");



        //recyclerview for details
         RecyclerView recyclerDetails = findViewById(R.id.detail_recycler_view);
        DetailRecyclerAdapter detailAdapter = new DetailRecyclerAdapter(detail);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerDetails.setLayoutManager(layoutManager);
        recyclerDetails.setAdapter(detailAdapter);

        // recyclerview for likes
        RecyclerView recyclerLikes = findViewById(R.id.like_list_recycler_view);
        LikesRecyclerAdapter likesAdapter = new LikesRecyclerAdapter(likes);
        RecyclerView.LayoutManager likesManager = new LinearLayoutManager(getApplicationContext());
        recyclerLikes.setLayoutManager(likesManager);
        recyclerLikes.setAdapter(likesAdapter);


        // recycler view for hobbies
        RecyclerView recyclerHobbies = findViewById(R.id.hobbies_recycler_view);
        LikesRecyclerAdapter hobbiesAdapter = new LikesRecyclerAdapter(hobbies);
        RecyclerView.LayoutManager hobbiesManager = new LinearLayoutManager(getApplicationContext());
        recyclerHobbies.setLayoutManager(hobbiesManager);
        recyclerHobbies.setAdapter(hobbiesAdapter);


        // recyclerview for dislikes
        RecyclerView recyclerDisLikes = findViewById(R.id.dislike_recycler_view);
        LikesRecyclerAdapter disLikesAdapter = new LikesRecyclerAdapter(dislike);
        RecyclerView.LayoutManager disLikesManager = new LinearLayoutManager(getApplicationContext());
        recyclerDisLikes.setLayoutManager(disLikesManager);
        recyclerDisLikes.setAdapter(disLikesAdapter);





        detailList();
    }

    // info for details
    private void detailList() {
        Details list = new Details("Name:", "Mgbachi Ugochukwu");
        detail.add(list);
        list = new Details("Slack Id:", "ugwonder");
        detail.add(list);
        list = new Details("Email:", "ugochukwu_mgbachi@yahoo.com");
        detail.add(list);
    }

}
