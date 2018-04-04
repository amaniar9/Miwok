package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
      //  getActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Word> family = new ArrayList<Word>();

        family.add(new Word("mom", "lutti", R.drawable.family_mother, R.raw.family_mother));
        family.add(new Word("dad", "otiiko",  R.drawable.family_father, R.raw.family_father));
        family.add(new Word("brother", "tolookosu",  R.drawable.family_older_brother, R.raw.family_older_brother));
        family.add(new Word("sister", "oyyisa",  R.drawable.family_older_sister, R.raw.family_older_sister));
        family.add(new Word("aunt", "massokka",  R.drawable.family_daughter, R.raw.family_older_sister));
        family.add(new Word("uncle", "temmokka",  R.drawable.family_son, R.raw.family_older_brother));
        family.add(new Word("grandfather", "kenekaku",  R.drawable.family_grandfather, R.raw.family_grandfather));
        family.add(new Word("grandmother", "kawinta",  R.drawable.family_grandmother, R.raw.family_grandmother));
        family.add(new Word("son", "wo'e",  R.drawable.family_younger_brother, R.raw.family_younger_brother));
        family.add(new Word("daughter", "na'aacha",  R.drawable.family_younger_sister, R.raw.family_younger_sister));


        WordAdapter wordAdapter = new WordAdapter(this, family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Word word = family.get(i);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
