package org.shoalcreek;

import android.content.Intent;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ScripturesAdapter extends RecyclerView.Adapter<ScripturesAdapter.ViewHolder>{

    private List<String> data;
    private RecyclerView recyclerView;


    public ScripturesAdapter(RecyclerView recyclerView, List<String> models) {
        this.recyclerView = recyclerView;
        this.data = models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.single_scripture_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.verseOfScripture.setText(data.get(position));

        holder.verseOfScripture.setMovementMethod(LinkMovementMethod.getInstance());

        holder.verseOfScripture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(""));

            }
        });

    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView verseOfScripture;

        ViewHolder(View itemView) {
            super(itemView);
            verseOfScripture = itemView.findViewById(R.id.verse_of_scripture);

        }

    }

}