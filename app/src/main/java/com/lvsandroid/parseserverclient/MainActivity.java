package com.lvsandroid.parseserverclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // == INSERT
//        ParseObject score = new ParseObject("Score");
//        score.put("username","donald");
//        score.put("score",960);
//        score.saveInBackground(new SaveCallback() {
//            @Override
//            public void done(ParseException e) {
//                if (e == null) {
//                    Log.i("saveInBackground", "Successful");
//                } else {
//                    Log.e("saveInBackground", "Failed");
//                    Log.e("saveInBackground",e.toString());
//                }
//            }
//        });

//        // == UPDATE
//        ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//        query.getInBackground("exA3wnLjdh", new GetCallback<ParseObject>() {
//            @Override
//            public void done(ParseObject object, ParseException e) {
//                object.put("score", 212);
//                object.saveInBackground(new SaveCallback() {
//                    @Override
//                    public void done(ParseException e) {
//                        if (e == null) {
//                            Log.i("saveInBackground", "Successful");
//                        } else {
//                            Log.e("saveInBackground", "Failed");
//                            Log.e("saveInBackground", e.toString());
//                        }
//                    }
//                });
//            }
//        });

//        // == SELECT ALL
//        ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//
//        query.findInBackground(new FindCallback<ParseObject>() {
//            @Override
//            public void done(List<ParseObject> objects, ParseException e) {
//                if (e == null) {
//                    Log.i("findInBackground","Retrieved " + objects.size() + " results");
//
//                    for(ParseObject object : objects) {
//                        Log.i("findInBackground users", String.valueOf(object.get("username")));
//                    }
//                } else {
//                    Log.e("findInBackground", "Failed");
//                    Log.e("findInBackground", e.toString());
//                }
//            }
//        });

//        // == SELECT SPECIFIC
//        ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
//
//        query.whereEqualTo("username","donald");
//
//        query.findInBackground(new FindCallback<ParseObject>() {
//            @Override
//            public void done(List<ParseObject> objects, ParseException e) {
//                if (e == null) {
//                    Log.i("findInBackground","Retrieved " + objects.size() + " results");
//
//                    for(ParseObject object : objects) {
//                        Log.i("findInBackground users", String.valueOf(object.get("username")));
//                    }
//                } else {
//                    Log.e("findInBackground", "Failed");
//                    Log.e("findInBackground", e.toString());
//                }
//            }
//        });


        ParseAnalytics.trackAppOpenedInBackground(getIntent());


    }
}
