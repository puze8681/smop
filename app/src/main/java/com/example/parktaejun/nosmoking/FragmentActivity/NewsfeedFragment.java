package com.example.parktaejun.nosmoking.FragmentActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.parktaejun.nosmoking.Data.FriendsList;
import com.example.parktaejun.nosmoking.Data.NewsList;
import com.example.parktaejun.nosmoking.FragmentAdapter.FriendsAdapter;
import com.example.parktaejun.nosmoking.FragmentAdapter.NewsfeedAdapter;
import com.example.parktaejun.nosmoking.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parktaejun on 2017. 7. 9..
 */

public class NewsfeedFragment extends Fragment {

    public NewsfeedFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_newsfeed, container, false);

        RecyclerView recyclerView = (RecyclerView)getView().findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        List<NewsList> items = new ArrayList<>();
        NewsList[] item = new NewsList[5];
        item[0] = new NewsList("독고현님이 오늘 3개를 피셨어요", "마지막으로 핀 날짜 : 2017/07/09");
        item[2] = new NewsList("나인채님이 오늘 7개를 피셨어요", "마지막으로 핀 날짜 : 2017/07/09");
        item[3] = new NewsList("최동근님이 오늘 2개를 피셨어요", "마지막으로 핀 날짜 : 2017/07/09");
        item[4] = new NewsList("송원준님이 어제 11개를 피셨어요", "마지막으로 핀 날짜 : 2017/07/08");
        item[5] = new NewsList("김진원님이 어제 6개를 피셨어요", "마지막으로 핀 날짜 : 2017/07/08");

        for(int i = 0; i <= 4; i++){
            items.add(item[i]);
        }

        recyclerView.setAdapter(new NewsfeedAdapter(getContext(), items, R.layout.activity_main));

        return view;
    }

}
