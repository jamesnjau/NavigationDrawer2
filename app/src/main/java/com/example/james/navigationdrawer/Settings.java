package com.example.james.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class Settings extends AppCompatActivity{
    private WebView mwebView;
    private View tv;
    private SearchView searchView;
    private String url="https://www.youtube.com/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        mwebView= (WebView) findViewById(R.id.webView);
        url="https://www.google.com/";
        mwebView.loadUrl(url);
    }


    public void searchClick(View view) {
        int searchViewId = view.getId();
        Toast.makeText(this,"Searching...",Toast.LENGTH_SHORT).show();
    }
}
