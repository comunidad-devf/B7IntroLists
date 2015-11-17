package mx.devf.b7introlists.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import mx.devf.b7introlists.R;
import mx.devf.b7introlists.model.Song;

/**
 * Created by gerardogtn on 11/9/15.
 */
public class MusicAdapter extends ArrayAdapter<Song>{

    private List<Song> mSongs;
    private LayoutInflater mInflater;

    public MusicAdapter(Context context, int resource, List<Song> songs) {
        super(context, resource, songs);
        mSongs = songs;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        MusicViewHolder viewHolder;

        Song current = mSongs.get(position);

        if (convertView == null){
            view = mInflater.inflate(R.layout.le_song, parent, false);
            viewHolder = new MusicViewHolder(view, current.getTitle(), current.getArtist());
            view.setTag(viewHolder);
            view.setBackgroundColor(Color.GREEN);

        } else {
            view = convertView;
            view.setBackgroundColor(Color.RED);
            viewHolder = (MusicViewHolder) view.getTag();
            viewHolder.setSongName(current.getTitle());
            viewHolder.setArtistName(current.getArtist());
        }

        return view;
    }

    private static class MusicViewHolder{

        private TextView mSongName;
        private TextView mArtistName;

        public MusicViewHolder(View itemView, String songName, String artistName){
            mSongName = (TextView) itemView.findViewById(R.id.txt_song);
            mArtistName = (TextView) itemView.findViewById(R.id.txt_artist);
            mSongName.setText(songName);
            mArtistName.setText(artistName);
        }

        public void setSongName(String songName) {
            mSongName.setText(songName);
        }

        public void setArtistName(String artistName) {
            mArtistName.setText(artistName);
        }
    }
}
