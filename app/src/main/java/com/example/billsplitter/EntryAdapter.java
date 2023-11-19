package com.example.billsplitter;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EntryAdapter extends RecyclerView.Adapter<EntryViewHolder> {

    Context context;
    List<Entry> entries;

    public EntryAdapter(Context context, List<Entry> entries) {
        this.context = context;
        this.entries = entries;
    }

    @NonNull
    @Override
    public EntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EntryViewHolder(LayoutInflater.from(context).inflate(R.layout.entry_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull EntryViewHolder holder, int position) {
        holder.itemView.setText(entries.get(position).getItem());
        holder.priceView.setText(String.valueOf(entries.get(position).getPrice()));

    }

    @Override
    public int getItemCount() {
        return entries.size();
    }
}
