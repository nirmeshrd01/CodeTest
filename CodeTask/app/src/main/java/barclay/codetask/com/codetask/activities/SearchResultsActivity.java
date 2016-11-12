package barclay.codetask.com.codetask.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import barclay.codetask.com.codetask.Adapters.SearchResultsAdapter;
import barclay.codetask.com.codetask.R;
import barclay.codetask.com.codetask.model.ResponseData;
import barclay.codetask.com.codetask.model.Result;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchResultsActivity extends Activity{

    private static final String TAG = "SearchResultsActivity.class";

    private final Context mContext = this;

    ArrayList<Result> mArrayList;

    @BindView(R.id.searchResultsListView) ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);
        ButterKnife.bind(this);
        mArrayList = new ArrayList<>();

        Bundle b = getIntent().getExtras();
        ResponseData responseDataObj = b.getParcelable("SEARCHRESULTS");



        final List<Result> searchResultsList = responseDataObj.getResults();
        int sizeOfList = responseDataObj.getResultCount();


        for(int i =0; i <sizeOfList; i++ )
        {
            Result result = searchResultsList.get(i);
            String artistName = result.getArtistName();
            String trackName = result.getTrackName();
            double trackPrice = result.getTrackPrice();
            String imageurl = result.getArtworkUrl30();
            String imageurl100 = result.getArtworkUrl100();
            mArrayList.add(new Result(artistName, trackName, trackPrice, imageurl, imageurl100));
        }

        SearchResultsAdapter adapter = new SearchResultsAdapter(getApplicationContext(), R.layout.activity_items, mArrayList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Result clickedObj = mArrayList.get(position);

                Intent i = new Intent(mContext, ItemDetailsActivity.class);
                i.putExtra("CLICKEDITEM", clickedObj);
                startActivity(i);


            }
        });

    }


}
