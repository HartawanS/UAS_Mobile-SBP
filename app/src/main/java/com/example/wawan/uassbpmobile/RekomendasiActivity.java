package com.example.wawan.uassbpmobile;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class RekomendasiActivity extends AppCompatActivity {

    private ShareActionProvider mShareActionProvider;
    private TextSwitcher switcher;
    private Button btnPrevious, btnNext;
    private static final String[] text = {"Budget", "Date Release", "Dimension", "Weight", "ScreenDots", "Max Resolution", "Effective Pixel"
            ,"Photo Detectors", "Sensor Size"};
    private int mposition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasi);
        btnPrevious = (Button) findViewById(R.id.idBtnPrevious);
        btnNext = (Button) findViewById(R.id.idBtnNext);
        switcher = (TextSwitcher) findViewById(R.id.idTextSwitcherHasil);
        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplication());
                TextView textView = new TextView(getApplicationContext());
                textView.setTextSize(18);
                textView.setTextColor(Color.BLACK);
                return textView;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate menu resource file.
        getMenuInflater().inflate(R.menu.menu_rekomen,menu);
        // Locate MenuItem with ShareActionProvider
        MenuItem item = menu.findItem(R.id.menu_item_share);
        // Fetch and store ShareActionProvider
        mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
        // Return true to display menu
        return true;
    }

    // Call to update the share intent
    private void setShareIntent(Intent shareIntent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_item_share:
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Check it out";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void prevClick(View view) {
        if (mposition>0){
            mposition = mposition-1;
            switcher.setText(text[mposition]);
        }
    }

    public void nextClick(View view) {

        if (mposition<text.length-1){
            mposition = mposition+1;
            switcher.setText(text[mposition]);
        }
    }
}
