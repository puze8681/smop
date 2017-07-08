package com.example.parktaejun.nosmoking.FragmentAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.parktaejun.nosmoking.FragmentActivity.FriendsFragment;
import com.example.parktaejun.nosmoking.R;

import java.util.List;

/**
 * Created by parktaejun on 2017. 7. 9..
 */

public class FriendsAdapter extends BaseAdapter {

    private Context context;
    private List<FriendsFragment> items;

    public FriendsAdapter(Context context, List<FriendsFragment> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if(position == 0){
            view = LayoutInflater.from(context).inflate(R.layout.iteam_search, null);
        }else {
            view = LayoutInflater.from(context).inflate(R.layout.iteam_friends, null);
            TextView name = (TextView) view.findViewById(R.id.name);
            name.setText(items.get(position).getName());
        }
    }
}
