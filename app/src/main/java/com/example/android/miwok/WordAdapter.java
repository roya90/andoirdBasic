package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    //define a new constructor which only requires the essential inputs

    private int mColorResourceId=NO_COLOR;
    final static private int NO_COLOR=-1;

    public WordAdapter(Context context,  ArrayList<Word> objects) {

        super(context, 0, objects);
    }

    public WordAdapter(Context context,  ArrayList<Word> objects, int colorResourceId) {
        super(context, 0, objects);


        mColorResourceId=colorResourceId;
    }

    public boolean hasColor(){return mColorResourceId!=NO_COLOR;}

    public int getColorResourceId(){return mColorResourceId;}
    // overwriting the getView method so it makes the proper view which matches what we want.
    @Override
    public View getView(int position, View convertView, ViewGroup parent ) {
        // every view has a parent, first we define the child view.
        View listItemView = convertView;

        if(listItemView == null) {
            // if this view is not there , we need to use layoutinflater to make one. the last
            // input is false as we don't want to attach it to the parent.
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // the word is accessible to this getView method. using getItem(position) we get the
        // appropriate position.
        Word currentWord= getItem(position);

        // the textviews which were defined in the proper custom view will be created and two
        // textview object will be created to point to them.
        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.numberEnglish);
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.numberMiwok);





        ImageView imageView= (ImageView) listItemView.findViewById(R.id.image_icon);
        // the above mentioned textViews will be filled with the appropriate values.
        defaultTranslation.setText(currentWord.getmDefaultTranslation());
        miwokTranslation.setText(currentWord.getmMiwoktTranslation());

        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImage());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);}

        if (this.hasColor()){
            View textContainer = listItemView.findViewById(R.id.text_ll);
            int color= ContextCompat.getColor(getContext(),this.getColorResourceId());
            textContainer.setBackgroundColor(color);

        }





        return listItemView;

    }
}
