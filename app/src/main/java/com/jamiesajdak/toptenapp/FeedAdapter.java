package com.jamiesajdak.toptenapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class FeedAdapter extends ArrayAdapter {
    private static final String TAG = "FeedAdapter";
    private final int layoutResorce;
    private final LayoutInflater layoutInflater;
    private List<FeedEntry> applications;

    public FeedAdapter(Context context, int resource, List<FeedEntry> applications) {
        super(context, resource);
        this.layoutResorce = resource;
        this.applications = applications;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return applications.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
           convertView = layoutInflater.inflate(layoutResorce, parent, false);
        }
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvArtist = convertView.findViewById(R.id.tvArtist);
        TextView tvSummery = convertView.findViewById(R.id.tvSummery);

        FeedEntry currentApp = applications.get(position);

        tvName.setText(currentApp.getName());
        tvArtist.setText(currentApp.getArtist());
        tvSummery.setText(currentApp.getPrice());

        return convertView;

    }
}
