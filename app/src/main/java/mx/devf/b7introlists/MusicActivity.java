package mx.devf.b7introlists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mx.devf.b7introlists.adapter.MusicAdapter;
import mx.devf.b7introlists.model.Song;

public class MusicActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener{

    private Button mNextActivityButton;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        mNextActivityButton = (Button) findViewById(R.id.btn_activity_next);
        mNextActivityButton.setOnClickListener(this);
        setUpListView();
    }

    private void setUpListView(){
        mListView = (ListView) findViewById(R.id.list_music);
        MusicAdapter adapter = new MusicAdapter(this, R.layout.le_song, createSongs());
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(this);
    }

    private List<Song> createSongs(){
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            songs.add(new Song("Hello", "Adele"));
            songs.add(new Song("Girl Crush", "Little Big Town"));
            songs.add(new Song("Beautiful Day", "U2"));
            songs.add(new Song("Welcome to the Jungle", "Guns N Roses"));
            songs.add(new Song("Last Minute Late", "Kane Brown"));
            songs.add(new Song("Fireworks", "Katy Perry"));
            songs.add(new Song("Automatic", "Aluna George"));
            songs.add(new Song("Noviembre sin ti", "Reik"));
            songs.add(new Song("Sirena", "Sin Bandera"));
            songs.add(new Song("This Love", "Maroon 5"));
            songs.add(new Song("La chica del bikini azul", "Luis Miguel"));
        }
        return songs;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_activity_next){
            Intent intent = new Intent(MusicActivity.this, MoviesActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this, createSongs().get(position).getTitle(), Toast.LENGTH_SHORT).show();
    }
}
