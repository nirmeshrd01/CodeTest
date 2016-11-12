package barclay.codetask.com.codetask.Adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import barclay.codetask.com.codetask.R;
import barclay.codetask.com.codetask.model.Result;

/**
 * Created by Nirmesh on 11/10/2016.
 */

public class SearchResultsAdapter extends ArrayAdapter<Result> {

    ArrayList<Result> result;
    Context context;
    int resource;

    public SearchResultsAdapter(Context context, int resource, ArrayList<Result> result) {
        super(context, resource, result);
        this.result = result;
        this.context = context;
        this.resource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {




        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.activity_items, null, true);
        }

        Result result = getItem(position);
        ImageView imageThumbnail = (ImageView) convertView.findViewById(R.id.imageThumbnail);
        Picasso.with(context).load(result.getArtworkUrl30()).into(imageThumbnail);

        TextView artistName = (TextView) convertView.findViewById(R.id.artistName);
        artistName.setText("Name:"+result.getArtistName());
        TextView trackName = (TextView) convertView.findViewById(R.id.trackName);
        trackName.setText("Track name: "+result.getTrackName());
        TextView trackPrice = (TextView) convertView.findViewById(R.id.trackPrice);
        trackPrice.setText("Track Price: $" + String.valueOf(result.getTrackPrice()));

        return convertView;
    }
}
