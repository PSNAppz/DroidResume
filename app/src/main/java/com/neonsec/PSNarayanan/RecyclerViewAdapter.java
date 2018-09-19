package com.neonsec.PSNarayanan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{


    private ArrayList<String> mTitle ;
    private ArrayList<String> mDesc ;
    private ArrayList<String> mDuration;

    public RecyclerViewAdapter(Context context, ArrayList<String> Titles, ArrayList<String> duration, ArrayList<String> desc) {
        mTitle = Titles;
        mDuration = duration;
        mDesc = desc;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {


        holder.title.setText(mTitle.get(position));
        holder.desc.setText(mDesc.get(position));
        holder.duration.setText(mDuration.get(position));
    }

    @Override
    public int getItemCount() {
        return mTitle.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title,desc,duration;

        public ViewHolder(View itemView) {
            super(itemView);
            duration = itemView.findViewById(R.id.duration);
            title = itemView.findViewById(R.id.main_title);
            desc = itemView.findViewById(R.id.subText);
        }
    }
}
