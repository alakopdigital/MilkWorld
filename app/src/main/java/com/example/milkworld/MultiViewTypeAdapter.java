package com.example.milkworld;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MultiViewTypeAdapter extends RecyclerView.Adapter<MultiViewTypeAdapter.MultipleViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<DashboardDataModel> recyclerList;

    //getting the context and product list with constructor
    public MultiViewTypeAdapter(Context mCtx, List<DashboardDataModel> recyclerList) {
        this.mCtx = mCtx;
        this.recyclerList = recyclerList;
    }

    @Override
    public MultipleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.recylerview_list, null);
        return new MultipleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MultipleViewHolder holder, int position) {
        //getting the product of the specified position
        DashboardDataModel product = recyclerList.get(position);

        //binding the data with the viewholder views
       // holder.rv_listcat.setText(product.getCategory());
        holder.rv_listtext.setText(product.getSub_category());

        holder.rv_listimage.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

    }


    @Override
    public int getItemCount() {
        return recyclerList.size();
    }


    class MultipleViewHolder extends RecyclerView.ViewHolder {

        TextView rv_listcat, rv_listtext;
        ImageView rv_listimage;

        public MultipleViewHolder(View itemView) {
            super(itemView);

           // rv_listcat = itemView.findViewById(R.id.rv_listCat);
            rv_listtext = itemView.findViewById(R.id.rv_listText);
           rv_listimage = itemView.findViewById(R.id.rv_listImage);


           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   int pos = getAdapterPosition();
                   if (pos != RecyclerView.NO_POSITION){
                       DashboardDataModel clickedDataItem = recyclerList.get(pos);
                       Intent intent = new Intent(mCtx, MainActivity.class);
                       //intent.putExtra("category", (Parcelable) clickedDataItem);
                       intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                       mCtx.startActivity(intent);
                       Toast.makeText(v.getContext(), "You clicked " + clickedDataItem.getSub_category(), Toast.LENGTH_SHORT).show();
                   }

               }
           });

        }


    }
}
