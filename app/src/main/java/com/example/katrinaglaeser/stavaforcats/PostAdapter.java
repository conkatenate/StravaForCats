package com.example.katrinaglaeser.stavaforcats;

/**
 * Created by katrinaglaeser on 9/22/17.
 */

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


//what does this library do?
import com.bumptech.glide.Glide;

import java.util.List;

public class PostAdapter extends ArrayAdapter<InactivityForCats> {
    public PostAdapter(Context context, int resource, List<InactivityForCats> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_post, parent, false);
        }

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView postTextView = (TextView) convertView.findViewById(R.id.postTextView);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);

        InactivityForCats post = getItem(position);

        boolean isPhoto = post.getPhotoUrl() != null;
        if (isPhoto) {
            postTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext())
                    .load(post.getPhotoUrl())
                    .into(photoImageView);
        } else {
            postTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            postTextView.setText(post.getInactivity());
        }
        authorTextView.setText(post.getName());

        return convertView;
    }
}
