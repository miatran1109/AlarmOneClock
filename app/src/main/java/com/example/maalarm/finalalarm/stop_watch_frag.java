package com.example.maalarm.finalalarm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class stop_watch_frag extends Fragment {
    public stop_watch_frag() {
        // Required empty public constructor
        new  stop_watch();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.stop_watch, container, false);
    }

}

