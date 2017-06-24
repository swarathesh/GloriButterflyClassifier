package com.swarathesh.butterflyclassifier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterfly_quiz);
        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("url");
        android.webkit.WebView webView = (android.webkit.WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
       // WebView.setBuiltInZoomControls(false);
        webView.setWebViewClient(new WebViewClient());
//        String newUA= "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
//        webView.getSettings().setUserAgentString(newUA);
        //webView.getSettings().setPluginState(true);
        //webvi.getSettings().setPluginState(WebSettings.PluginState‌​.ON);
        webView.loadUrl(url);
    }
}
