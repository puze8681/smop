package com.example.parktaejun.nosmoking.FragmentActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.parktaejun.nosmoking.FragmentAdapter.FriendsAdapter;
import com.example.parktaejun.nosmoking.FriendsList;
import com.example.parktaejun.nosmoking.Main.MainActivity;
import com.example.parktaejun.nosmoking.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parktaejun on 2017. 7. 9..
 */

public class FriendsFragment extends Fragment {
    private ListView friends_list;
    private FriendsAdapter listAdapter;
    private List<FriendsList> items = new ArrayList<>();

    public FriendsFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.fragment_friends, container, false);
        friends_list = (ListView) view.findViewById(R.id.friends_list);

        items.add(new FriendsList("홍길동", "7일"));
        items.add(new FriendsList("김민서", "15일"));
        items.add(new FriendsList("이장훈", "78일"));
        items.add(new FriendsList("아무개", "172일"));

        listAdapter = new FriendsAdapter(getContext(), items);
        friends_list.setAdapter(listAdapter);

        friends_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), items.get(position).getName()+" 님께서 "+ items.get(position).getLong()+"일 째 금연 중입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
