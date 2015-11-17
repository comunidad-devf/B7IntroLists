package mx.devf.b7introlists.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import mx.devf.b7introlists.R;
import mx.devf.b7introlists.model.Movie;

/**
 * Created by gerardogtn on 11/11/15.
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<Movie> mMovies;
    private LayoutInflater mInflater;

    public MovieAdapter(Context context, List<Movie> movies){
        mMovies = movies;
        mInflater = LayoutInflater.from(context);

    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.le_movie, parent, false);
        MovieViewHolder viewHolder = new MovieViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie current = mMovies.get(position);

        holder.setTitle(current.getTitle());
        holder.setGenre(current.getGenre());
        holder.setProtagonist(current.getProtagonist());
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{

        private TextView mTitle;
        private TextView mGenre;
        private TextView mProtagonist;

        public MovieViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.txt_movie_title);
            mGenre = (TextView) itemView.findViewById(R.id.txt_genre);
            mProtagonist = (TextView) itemView.findViewById(R.id.txt_protagonista);
        }

        public void setTitle(String title){
            this.mTitle.setText(title);
        }

        public void setGenre(String genre){
            this.mGenre.setText(genre);
        }

        public void setProtagonist(String protagonist){
            this.mProtagonist.setText(protagonist);
        }

    }
}
