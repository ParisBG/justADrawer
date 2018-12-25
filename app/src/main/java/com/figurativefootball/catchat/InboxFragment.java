package com.figurativefootball.catchat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class InboxFragment extends Fragment {


    public InboxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_inbox,
                container, false);

        TextView text = layout.findViewById(R.id.text);
        Random r = new Random();
        int random = 0;
        text.setText("outside# =" + String.valueOf(random)+"\n");

        for (int x = 0; x < 5; x++){
             random = r.nextInt(12);

            text.append("Inside# =" + String.valueOf(random)+"\n");
            text.append("Inside#2 =" + String.valueOf(random)+"\n");

        }
        return layout;


    }

}
