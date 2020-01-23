package org.shoalcreek.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.shoalcreek.helpers.ExpandListener;
import org.shoalcreek.R;
import org.shoalcreek.helpers.RecyclerItemClickListener;
import org.shoalcreek.helpers.RecyclerViewItemDecorator;
import org.shoalcreek.models.SpecialExpandModel;
import org.shoalcreek.custom.ExpandableLinearLayout;

import java.util.List;

public class ReadingPlansViewAdapter extends RecyclerView.Adapter<ReadingPlansViewAdapter.ViewHolder>{

    private List<SpecialExpandModel> data;
    private RecyclerView recyclerView;
    private int lastExpandedCardPosition;
    private Context context;


    public ReadingPlansViewAdapter(RecyclerView recyclerView, List<SpecialExpandModel> models, Context context) {
        this.recyclerView = recyclerView;
        this.data = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.special_card_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.headTextView.setText(data.get(position).getQuestion());

        final List<String> verses = data.get(position).getAnswers();
        final List<String> urls = data.get(position).getUrls();

        ScripturesAdapter adapter = new ScripturesAdapter(holder.specialRecyclerView, verses);

        holder.specialRecyclerView.setAdapter(adapter);

        holder.specialRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        holder.specialRecyclerView.setHasFixedSize(true);
        holder.specialRecyclerView.addItemDecoration( new RecyclerViewItemDecorator(context, RecyclerViewItemDecorator.VERTICAL_LIST));

        adapter.notifyDataSetChanged();

        holder.specialRecyclerView.addOnItemTouchListener( new RecyclerItemClickListener(context, holder.specialRecyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                Uri uri = Uri.parse(urls.get(position));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);

            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        }));

        if(data.get(position).isExpanded()){
            holder.expandableView.setVisibility(View.VISIBLE);
            holder.expandableView.setExpanded(true);
        }
        else{
            holder.expandableView.setVisibility(View.GONE);
            holder.expandableView.setExpanded(false);
        }
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<SpecialExpandModel> data) {
        this.data = data;
    }

    public void addItem(int i) {
        data.add(i, new SpecialExpandModel());
        if(i <= lastExpandedCardPosition)
            lastExpandedCardPosition++;
        notifyDataSetChanged();
    }

    public void deleteItem(int i) {
        data.remove(i);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ExpandableLinearLayout expandableView;
        TextView headTextView;
        RecyclerView specialRecyclerView;

        ExpandListener expandListener = new ExpandListener() {
            @Override
            public void onExpandComplete() {
                if(lastExpandedCardPosition!=getAdapterPosition() && recyclerView.findViewHolderForAdapterPosition(lastExpandedCardPosition)!=null){
                    ((ExpandableLinearLayout)recyclerView.findViewHolderForAdapterPosition(lastExpandedCardPosition).itemView.findViewById(R.id.expandableView)).setExpanded(false);
                    data.get(lastExpandedCardPosition).setExpanded(false);
                    ((ExpandableLinearLayout)recyclerView.findViewHolderForAdapterPosition(lastExpandedCardPosition).itemView.findViewById(R.id.expandableView)).toggle();
                }
                else if(lastExpandedCardPosition!=getAdapterPosition() && recyclerView.findViewHolderForAdapterPosition(lastExpandedCardPosition)==null){
                    data.get(lastExpandedCardPosition).setExpanded(false);
                }
                lastExpandedCardPosition = getAdapterPosition();
            }

            @Override
            public void onCollapseComplete() {

            }
        };

        ViewHolder(View itemView) {
            super(itemView);
            headTextView = itemView.findViewById(R.id.head_textview);
            specialRecyclerView = itemView.findViewById(R.id.special_recycler_view);
            expandableView = itemView.findViewById(R.id.expandableView);
            initializeClicks();
        }

        private void initializeClicks() {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (expandableView.isExpanded()) {
                        expandableView.setExpanded(false);
                        expandableView.toggle();
                        data.get(getAdapterPosition()).setExpanded(false);
                    } else {
                        expandableView.setExpanded(true);
                        data.get(getAdapterPosition()).setExpanded(true);
                        expandableView.toggle();
                    }
                }
            });
        }
    }
}