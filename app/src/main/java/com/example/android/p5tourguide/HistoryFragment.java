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
public class HistoryFragment extends Fragment {
    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rishon_list, container, false);
        // Create a list of RishonItems
        final ArrayList<RishonItem> rishonItems = new ArrayList<RishonItem>();
        // Add RishonItems (places-historical sites) to the list (details: image,name,description,address,coordinates, and if exists: phone,facebook,instagram,website)
        rishonItems.add(new RishonItem(R.drawable.museum, R.string.museum, R.string.museum_description, R.string.museum_address, R.string.museum_location, R.string.museum_phone, R.string.museum_facebook, R.string.museum_instagram, R.string.museum_website));
        rishonItems.add(new RishonItem(R.drawable.well, R.string.well, R.string.well_description, R.string.well_address, R.string.well_location));
        rishonItems.add(new RishonItem(R.drawable.winery, R.string.winery, R.string.winery_description, R.string.winery_address, R.string.winery_location, R.string.winery_phone, R.string.winery_facebook, R.string.winery_instagram, R.string.winery_website));
        rishonItems.add(new RishonItem(R.drawable.synagogue, R.string.synagogue, R.string.synagogue_description, R.string.synagogue_address, R.string.synagogue_location, R.string.synagogue_phone));
        rishonItems.add(new RishonItem(R.drawable.byzantine, R.string.byzantine, R.string.byzantine_description, R.string.byzantine_address, R.string.byzantine_location));
        rishonItems.add(new RishonItem(R.drawable.haviv, R.string.haviv, R.string.haviv_description, R.string.haviv_address, R.string.haviv_location, R.string.haviv_phone));
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
