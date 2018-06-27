package com.example.minebayrakdar.mine_bayrakdar_assignment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mine BAYRAKDAR on 31.10.2017.
 */

public class OzelAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Movie> movieList;
    Context context;

    public OzelAdapter(MainActivity activity, List<Movie> movieListe) {
        context = activity;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        movieList = movieListe;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Movie getItem(int position) {
        return movieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowicon;

        rowicon = mInflater.inflate(R.layout.row_icon, null);
        TextView twmovie = (TextView) rowicon.findViewById(R.id.twMovie);
        TextView twlanguage = (TextView) rowicon.findViewById(R.id.twLanguage);
        TextView twsession = (TextView) rowicon.findViewById(R.id.twSession);
        ImageView imovie = (ImageView) rowicon.findViewById(R.id.iMovie);

        Movie movie = movieList.get(position);

        twmovie.setText(movie.getMovie());
        twlanguage.setText(movie.getLanguage());
        twsession.setText(movie.getSession());
        imovie.setImageResource(movie.getImage());
        return rowicon;
    }
}