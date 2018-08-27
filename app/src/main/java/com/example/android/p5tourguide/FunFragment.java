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
public class FunFragment extends Fragment {
    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rishon_list, container, false);
        // Create a list of RishonItems
        final ArrayList<RishonItem> rishonItems = new ArrayList<RishonItem>();
        // Add RishonItems (places-restaurants) to the list (details: image,name,description,address,coordinates,phone,facebook,instagram,website)
        rishonItems.add(new RishonItem(R.drawable.superland, R.string.superland, R.string.superland_description, R.string.superland_address, R.string.superland_location, R.string.superland_phone, R.string.superland_facebook, R.string.superland_instagram, R.string.superland_website));
        rishonItems.add(new RishonItem(R.drawable.flybox, R.string.flybox, R.string.flybox_description, R.string.flybox_address, R.string.flybox_location, R.string.flybox_phone, R.string.flybox_facebook, R.string.flybox_instagram, R.string.flybox_website));
        rishonItems.add(new RishonItem(R.drawable.escapestation, R.string.escapestation, R.string.escapestation_description, R.string.escapestation_address, R.string.escapestation_location, R.string.escapestation_phone, R.string.escapestation_facebook, R.string.escapestation_instagram, R.string.escapestation_website));
        rishonItems.add(new RishonItem(R.drawable.haykef, R.string.haykef, R.string.haykef_description, R.string.haykef_address, R.string.haykef_location, R.string.haykef_phone, R.string.haykef_facebook, R.string.haykef_instagram, R.string.haykef_website));
        rishonItems.add(new RishonItem(R.drawable.jumpark, R.string.jumpark, R.string.jumpark_description, R.string.jumpark_address, R.string.jumpark_location, R.string.jumpark_phone, R.string.jumpark_facebook, R.string.jumpark_instagram, R.string.jumpark_website));
        rishonItems.add(new RishonItem(R.drawable.vrstation, R.string.vrstation, R.string.vrstation_description, R.string.vrstation_address, R.string.vrstation_location, R.string.vrstation_phone, R.string.vrstation_facebook, R.string.vrstation_instagram, R.string.vrstation_website));
        rishonItems.add(new RishonItem(R.drawable.cinemacity, R.string.cinemacity, R.string.cinemacity_description, R.string.cinemacity_address, R.string.cinemacity_location, R.string.cinemacity_phone, R.string.cinemacity_facebook, R.string.cinemacity_instagram, R.string.cinemacity_website));
        rishonItems.add(new RishonItem(R.drawable.yesplanet, R.string.yesplanet, R.string.yesplanet_description, R.string.yesplanet_address, R.string.yesplanet_location, R.string.yesplanet_phone, R.string.yesplanet_facebook, R.string.yesplanet_instagram, R.string.yesplanet_website));
        // Create a {@link RishonAdapter}, whose data source is a list of RishonItems. This list item layout contains a single {@link TextView},
        // which the adapter will set to display a single RishonItem.
        RishonAdapter adapter = new RishonAdapter(getActivity(), rishonItems, true);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}. There should be a {@link ListView} with
        // the ID called list, which is declared in rishon_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link RishonAdapter} we created above, so that the {@link ListView} will display list
        // items for each RishonItem in the list of RishonItems.
        listView.setAdapter(adapter);
        return rootView;
    }
}
