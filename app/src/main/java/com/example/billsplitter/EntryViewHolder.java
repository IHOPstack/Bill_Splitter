package com.example.billsplitter;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class EntryViewHolder extends RecyclerView.ViewHolder {

    TextView priceView, itemView;
    Spinner ownerView;
    public EntryViewHolder(View entryView){
        super(entryView);
        priceView = entryView.findViewById(R.id.priceInput);
        itemView = entryView.findViewById(R.id.itemInput);
        ownerView = entryView.findViewById(R.id.spinner);
    }
}
