package com.mgbachi_ugo.singleact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DetailRecyclerAdapter extends RecyclerView.Adapter<DetailRecyclerAdapter.ViewHolder>  {
    private final List<Details> mDetails;

    public DetailRecyclerAdapter(List<Details> mDetails) {
        this.mDetails = mDetails;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_setup, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Details detail = mDetails.get(position);
        holder.content.setText(detail.getContent());
        holder.info.setText(detail.getInfo());

    }

    @Override
    public int getItemCount() {
        return mDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView content, info;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            content = itemView.findViewById(R.id.content_textView);
            info = itemView.findViewById(R.id.info_textView);

        }
    }

}
