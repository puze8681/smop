package com.example.parktaejun.nosmoking.FragmentAdapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.parktaejun.nosmoking.Data.NewsList;
import com.example.parktaejun.nosmoking.R;

import java.util.List;

/**
 * Created by parktaejun on 2017. 7. 9..
 */

public class NewsfeedAdapter extends RecyclerView.Adapter<NewsfeedAdapter.ViewHolder> {

    Context context;
    List<NewsList> items;
    int item_layout;

    public NewsfeedAdapter(Context context, List<NewsList> items, int item_layout){
        this.context = context;
        this.items = items;
        this.item_layout = item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final NewsList item = items.get(position);
        holder.news.setText(item.getNews());
        holder.last.setText(item.getLast());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, item.getNews(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView news;
        TextView last;
        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);
            news = (TextView) itemView.findViewById(R.id.news);
            last = (TextView) itemView.findViewById(R.id.last);
            cardview = (CardView) itemView.findViewById(R.id.cardview);
        }
    }
}