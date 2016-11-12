package barclay.codetask.com.codetask.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import barclay.codetask.com.codetask.R;
import barclay.codetask.com.codetask.model.Result;
import butterknife.BindView;
import butterknife.ButterKnife;


public class ItemDetailsActivity extends AppCompatActivity {
    @BindView(R.id.trackName_longDes) TextView trackName;
    @BindView(R.id.artistName_longDes) TextView artistName;
    @BindView(R.id.trackPrice_longDes) TextView trackPrice;

    private final Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_long);
        ButterKnife.bind(this);

        Bundle b = getIntent().getExtras();
        Result resultObj = b.getParcelable("CLICKEDITEM");
        trackName.setText("Track Name: " +resultObj.getTrackName());
        artistName.setText("Artist Name: "+resultObj.getArtistName());
        trackPrice.setText("Track Price: $"+String.valueOf(resultObj.getTrackPrice()));
        ImageView imageThumbnail = (ImageView) findViewById(R.id.imageThumbnail_longDes);
        Picasso.with(mContext).load(resultObj.getArtworkUrl100()).into(imageThumbnail);

    }

    @Override
    protected void onPause() {
        finish();
        super.onPause();
    }
}
