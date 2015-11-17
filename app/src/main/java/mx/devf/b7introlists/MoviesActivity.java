package mx.devf.b7introlists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import mx.devf.b7introlists.adapter.MovieAdapter;
import mx.devf.b7introlists.model.Movie;

public class MoviesActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        setUpRecyclerView();
    }

    public void setUpRecyclerView(){
        mRecyclerView = (RecyclerView) findViewById(R.id.list_movies);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(new MovieAdapter(this, createMovies()));
    }

    public List<Movie> createMovies(){
        List<Movie> movies = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            movies.add(new Movie("Mision Imposible", "Accion", "Tom Cruise"));
            movies.add(new Movie("Scary Movie", "Comedia"));
            movies.add(new Movie("Pasante de Moda", "Desconocido"));
            movies.add(new Movie("Toy Story", "Familiar", "Woody"));
            movies.add(new Movie("Star Wars: Episodio VII", "Ciencia Ficcion", "Harrison Ford"));
            movies.add(new Movie("James Bond: Spectre", "Accion", "Daniel Craig"));
            movies.add(new Movie("Gladiador", "Accion"));
            movies.add(new Movie("Como perder a un hombre en diez dias", "Comedia"));
            movies.add(new Movie("Diario de una Pasion", "Romantica", "Ryan Gosling"));
        }


        return movies;
    }

}
