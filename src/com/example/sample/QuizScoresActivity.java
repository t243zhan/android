package com.example.sample;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class QuizScoresActivity extends QuizActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scores);
    
	    // Set up the tabs
	    TabHost host = (TabHost) findViewById(R.id.TabHost1);
	    host.setup();
	    // All Scores tab
	    TabSpec allScoresTab = host.newTabSpec("allTab");
	    allScoresTab.setIndicator(getResources().getString(R.string.all_scores), getResources().getDrawable(
	            android.R.drawable.star_on));
	    allScoresTab.setContent(R.id.ScrollViewAllScores);
	    host.addTab(allScoresTab);
	    // Friends Scores tab
	    TabSpec friendScoresTab = host.newTabSpec("friendsTab");
	    friendScoresTab.setIndicator(getResources().getString(R.string.friends_scores), getResources().getDrawable(
	            android.R.drawable.star_on));
	    friendScoresTab.setContent(R.id.ScrollViewFriendScores);
	    host.addTab(friendScoresTab);
	    // Set the default tab
	    host.setCurrentTabByTag("allTab");
    }
}