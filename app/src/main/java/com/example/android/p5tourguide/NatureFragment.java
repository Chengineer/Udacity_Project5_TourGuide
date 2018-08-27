package com.example.android.p5tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureFragment extends Fragment {
    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rishon_list, container, false);
        // Create a list of RishonItems
        final ArrayList<RishonItem> rishonItems = new ArrayList<RishonItem>();
        // Add RishonItems (places-nature locations) to the list (details: image,name,description,address,coordinates)
        rishonItems.add(new RishonItem(R.drawable.beach, R.string.beach, R.string.beach_description, R.string.beach_address, R.string.beach_location));
        rishonItems.add(new RishonItem(R.drawable.lake, R.string.lake, R.string.lake_description, R.string.lake_address, R.string.lake_location));
        rishonItems.add(new RishonItem(R.drawable.nakik, R.string.nakik, R.string.nakik_description, R.string.nakik_address, R.string.nakik_location));
        // Create a {@link RishonAdapter}, whose data source is a list of RishonItems. This list item layout contains a single {@link TextView},
        // which the adapter will set to display a single RishonItem.
        RishonAdapter adapter = new RishonAdapter(getActivity(), rishonItems, false);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}. There should be a {@link ListView} with
        // the ID called list, which is declared in rishon_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link RishonAdapter} we created above, so that the {@link ListView} will display list
        // items for each RishonItem in the list of RishonItems.
        listView.setAdapter(adapter);
        return rootView;
    }
}
