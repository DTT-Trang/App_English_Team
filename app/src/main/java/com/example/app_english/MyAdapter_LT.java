package com.example.app_english;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter_LT extends RecyclerView.Adapter<MyAdapter_LT.MyViewHolder> {

    private final List<MyItems_LT> items;
    private final Context context;

    public MyAdapter_LT(List<MyItems_LT> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter_LT.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_adapter_layout,null));
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter_LT.MyViewHolder holder, int position) {

        MyItems_LT myItems = items.get(position);
        holder.word.setText(myItems.getWord());
        holder.types.setText(myItems.getTypes());
        holder.def.setText(myItems.getDef());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView word,types,def;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            word = itemView.findViewById(R.id.word);
            types = itemView.findViewById(R.id.types);
            def = itemView.findViewById(R.id.def);
        }
    }
}
