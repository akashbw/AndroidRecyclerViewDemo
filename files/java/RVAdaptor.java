package com.example.akash.retrofitdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class RVAdaptor extends RecyclerView.Adapter<RVAdaptor.ViewHolder> {


    // creating ViewHolder for THIS RecyclerView Adapter
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // elements of the layout defined for one row/item
        public TextView personName;
        public TextView personEmail;
        public ImageView personImage;

        // assigning references of the views to THIS viewHolder object
        public ViewHolder(View itemView) {
            super(itemView);
            personName = (TextView) itemView.findViewById(R.id.personName);
            personEmail = (TextView) itemView.findViewById(R.id.personEmail);
            personImage = (ImageView) itemView.findViewById(R.id.personImage);
        }
    }

    // in the constructor, we initialise the object containing data
    // and the context
    private Context theContext;
    private List<Result> theResults;

    public RVAdaptor(Context context, List<Result> results) {
        theContext = context;
        theResults = results;
    }

    private Context getContext() {
        return theContext;
    }

    // now implementing the built-in methods of RecyclerView by over-riding them
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // inflate the layout in a view object
        View item_layout = inflater.inflate(R.layout.one_item, parent, false);

        // initialise viewHolder with the inflated layout
        ViewHolder viewHolder = new ViewHolder(item_layout);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RVAdaptor.ViewHolder viewholder, int position) {

        Result personData = theResults.get(position);

        // attach teh views with the ViewHolder objects
        TextView personName = viewholder.personName;
        TextView personEmail = viewholder.personEmail;
        ImageView personImage = viewholder.personImage;

        // assign values to the views
        personName.setText(personData.getName().getFirst() + " " + personData.getName().getLast());
        personEmail.setText(personData.getEmail());

        // using Picasso library to load image into the ImageView
        String imageUrl = personData.getPicture().getLarge();
        Picasso.with(getContext()).load(imageUrl).into(personImage);
    }

    @Override
    public int getItemCount() {
        return theResults.size();
    }
}
