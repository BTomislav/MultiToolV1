package com.example.guest248.multitool10;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.w3c.dom.Text;

public class QrscannerActivity extends AppCompatActivity {

    private Button button;
    private TextView tekst;
    private IntentIntegrator qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscanner);
        final WebView myWebView = (WebView) findViewById(R.id.webview);
        button=(Button) findViewById(R.id.button);
        tekst=(TextView) findViewById(R.id.tekst);

        qrScan = new IntentIntegrator(this);

        myWebView.setVisibility(View.GONE);

        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    myWebView.setVisibility(View.GONE);
                    qrScan.initiateScan();
                }
            });
        }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent
        data) {
            final IntentResult result =
                    IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
            if (result != null) {
                if (result.getContents() == null) {
                    Toast.makeText(this, "QR kod je nevaljan ili prazan. Pokušajte ponovno.",
                    Toast.LENGTH_LONG).show();
                }
                else {
                    if (result.getContents().toString().contains("://"))
                    {
                        final ProgressBar mProgressBar=(ProgressBar) findViewById(R.id.progressBar);
                        WebView myWebView = (WebView) findViewById(R.id.webview);
                        myWebView.setVisibility(View.VISIBLE);

                        myWebView.loadUrl(result.getContents().toString());
                        myWebView.getSettings().setJavaScriptEnabled(true);


                        myWebView.setWebViewClient(new WebViewClient() {
                            @Override
                            public void onPageCommitVisible(WebView view, String url) {
                                url=result.getContents().toString();
                                super.onPageCommitVisible(view, url);
                                mProgressBar.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                    else {
                        tekst.setText(result.getContents().toString());
                    }
                }
            }
        }
}
