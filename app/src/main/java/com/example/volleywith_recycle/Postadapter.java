package com.example.volleywith_recycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Postadapter extends RecyclerView.Adapter<Postadapter.ViewHolder> implements View.OnClickListener {


    View.OnLongClickListener onLongClickListener;
    LayoutInflater inflater;
    List<Postmodel> postList;

    public Postadapter(Context ctx, List<Postmodel>postList){
        this.inflater=LayoutInflater.from(ctx);

        this.postList=postList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemList= layoutInflater.inflate(R.layout.row_item,null,false);
        ViewHolder view=new ViewHolder(itemList);

        itemList.setOnClickListener(this);

        //View view=inflater.inflate(R.layout.custom_list,parent,false);


        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userid.setText(Integer.toString(postList.get(position).getUserid()));
        holder.title.setText(postList.get(position).getTitle());
        holder.email.setText(postList.get(position).getEmail());
        holder.desc.setText(postList.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    // public boolean onLongClicklistner(View.OnLongClickListener onLongClickListener){
    // this.onLongClickListener=onLongClickListener;
    //return true;

    //  }
    @Override
    public void onClick(View v) {
        onLongClickListener.onLongClick(v);
        return;
    }

    public void onLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onLongClickListener=onLongClickListener;

    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView userid, title,email, desc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userid = itemView.findViewById(R.id.userId);
            title = itemView.findViewById(R.id.text);
            email=itemView.findViewById(R.id.email);
            desc = itemView.findViewById(R.id.postdescription);
        }
    }
}
