package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
      //  getActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Word> phrases = new ArrayList<Word>();

       phrases.add(new Word("Are you coming", "minto wuksus", R.raw.phrase_are_you_coming));
        phrases.add(new Word("Come here", "tinnә oyaase'nә", R.raw.phrase_come_here));
        phrases.add(new Word("I'm coming", "oyaaset...", R.raw.phrase_im_coming));
        phrases.add(new Word("I'm feeling good", "michәksәs?", R.raw.phrase_im_feeling_good));
        phrases.add(new Word("Let's go", "kuchi achit", R.raw.phrase_lets_go));
        phrases.add(new Word("My name is", "әәnәs'aa?", R.raw.phrase_my_name_is));
        phrases.add(new Word("What is your name", "hәә’ әәnәm", R.raw.phrase_what_is_your_name));
        phrases.add(new Word("Where are you going?", "kawinta", R.raw.phrase_where_are_you_going));
        phrases.add(new Word("Yes, i'm coming", "әәnәm", R.raw.phrase_yes_im_coming));



        WordAdapter wordAdapter = new WordAdapter(this, phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Word word = phrases.get(i);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
