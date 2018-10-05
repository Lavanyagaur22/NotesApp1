package com.codingblocks.mynotes;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    ArrayList<Notes>arrayList;

    public NotesAdapter(ArrayList<Notes> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Notes mynotes=arrayList.get(position);
        holder.note.setText(mynotes.getNote());
        holder.time.setText(mynotes.getTime());
        holder.btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView note,time;
        Button btndel;
        public ViewHolder(View itemView) {
            super(itemView);
            note=itemView.findViewById(R.id.tvnote);
            time=itemView.findViewById(R.id.tvtime);
            btndel=itemView.findViewById(R.id.btndel);
        }
    }
}
