package barclay.codetask.com.codetask.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import barclay.codetask.com.codetask.R;
import barclay.codetask.com.codetask.model.ResponseData;
import barclay.codetask.com.codetask.model.Result;
import barclay.codetask.com.codetask.remote.ItunesServiceAPI;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity.class";

    @BindView(R.id.searchBox) EditText searchBox;
    @BindView(R.id.options) RadioGroup options;

    //Radio buttons
    @BindView(R.id.rbMusic) RadioButton rbMusic;
    @BindView(R.id.rbMusicVideo) RadioButton rbMusicVideo;
    @BindView(R.id.rbAll) RadioButton rbAll;
    @BindView(R.id.rbAudioBook)RadioButton rbAudioBook;
    @BindView(R.id.rbPodcast)RadioButton rbPodcast;
    @BindView(R.id.rbShortFilm)RadioButton rbShortFilm;
    @BindView(R.id.rbSoftware)RadioButton rbSoftware;
    @BindView(R.id.rbEbook)RadioButton rbEbook;
    @BindView(R.id.rbTvShow)RadioButton rbTvShow;
    @BindView(R.id.rbMovie)RadioButton rbMovie;





    public final Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    @OnClick(R.id.searchButton)
    public void search()
    {
        if(searchBox.getText() == null | searchBox.getText().toString() == ""){
            Toast.makeText(mContext, "Please enter a valid search tag!", Toast.LENGTH_LONG ).show();
        }

            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.options);
            String radiovalue = ((RadioButton) findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();

        System.out.println(String.valueOf(searchBox.getText()));
            Map<String, String> data = new HashMap<>();
            data.put("term", String.valueOf(searchBox.getText()));
            data.put("entity", radiovalue);


        //To Search as per the input strings
        ItunesServiceAPI.Factory.getInstance().getDetails(data).enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Response <ResponseData> response, Retrofit retrofit) {
                if (response.isSuccess()) {
                    searchBox.setText("");
                    List<Result> listOfResults = response.body().getResults();
                    int totalResults = response.body().getResultCount();

                    Intent i = new Intent(mContext, SearchResultsActivity.class);
                    ResponseData responseDataObj = new ResponseData();
                    responseDataObj.setResults(listOfResults);
                    responseDataObj.setResultCount(totalResults);
                    i.putExtra("SEARCHRESULTS", responseDataObj);
                    startActivity(i);
                } else{
                    Toast.makeText(mContext,"Sorry coulnt find the results you are searching for", Toast.LENGTH_LONG).show();
                }



            }

            @Override
            public void onFailure(Throwable t) {
                Log.e(TAG, "Failed to connect to the internet");
                Log.e(TAG, t.getMessage());
            }
        });


    }
}
