package android.example.maduraitourguider;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {

        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView place = (TextView) listItemView.findViewById(R.id.name);
        place.setText(currentPlace.getName());


        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentPlace.getLocation());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlace.hasImage()) {
            // Get the image resource ID from the current Word object and
            // set the image to image resource specified in the current word
            imageView.setImageResource(currentPlace.getImageResourceId());

            //make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //otherwise hide the image view(set visibility as gone)
            imageView.setVisibility(View.GONE);
        }

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //set the background color of the text container view
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an image view)
        // so that it can be shown in the ListView
        return listItemView;


    }


}

