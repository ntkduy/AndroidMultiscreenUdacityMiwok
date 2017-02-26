package com.ntkduy1604.androidmultiscreenudacitymiwok;

/**
 * Created by NTKDUY on 2/26/2017
 * for PIGGY HOUSE
 * you can contact me at: ntkduy1604@gmail.com
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This class inherits all the properties of ArrayAdapter
 * but it will extend ArrayAdapter class to support double TextView
 * for a particular data type Word (custom class)
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter (Activity context, ArrayList<Word> word){
        super(context, 0, word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_list_view);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        miwokTranslation.setText(currentWord.getMiwokTranslation());

//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
//        iconView.setImageResource(currentWord.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
