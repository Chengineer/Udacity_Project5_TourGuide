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
public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rishon_list, container, false);
        // Create a list of RishonItems
        final ArrayList<RishonItem> rishonItems = new ArrayList<RishonItem>();
        // Add RishonItems (places-restaurants) to the list (details: image,name,description,address,coordinates,phone,facebook, and if exists: instagram and website)
        rishonItems.add(new RishonItem(R.drawable.vamos, R.string.vamos, R.string.vamos_description, R.string.vamos_address, R.string.vamos_location, R.string.vamos_phone, R.string.vamos_facebook));
        rishonItems.add(new RishonItem(R.drawable.noale, R.string.noale, R.string.noale_description, R.string.noale_address, R.string.noale_location, R.string.noale_phone, R.string.noale_facebook, R.string.noale_instagram));
        rishonItems.add(new RishonItem(R.drawable.cafegansipur, R.string.cafegansipur, R.string.cafegansipur_description, R.string.cafegansipur_address, R.string.cafegansipur_location, R.string.cafegansipur_phone, R.string.cafegansipur_facebook, R.string.cafegansipur_instagram, R.string.cafegansipur_website));
        rishonItems.add(new RishonItem(R.drawable.powow, R.string.powwow, R.string.powwoow_description, R.string.powwow_address, R.string.powwow_location, R.string.powwow_phone, R.string.powwow_facebook, R.string.powwow_instagram, R.string.powwow_website));
        rishonItems.add(new RishonItem(R.drawable.biscookit, R.string.biscookit, R.string.biscookit_description, R.string.biscookit_address, R.string.biscookit_location, R.string.biscookit_phone, R.string.biscookit_facebook, R.string.biscookit_instagram, R.string.biscookit_website));
        rishonItems.add(new RishonItem(R.drawable.soho, R.string.soho, R.string.soho_description, R.string.soho_address, R.string.soho_location, R.string.soho_phone, R.string.soho_facebook, R.string.soho_instagram, R.string.soho_website));
        rishonItems.add(new RishonItem(R.drawable.francesca, R.string.francesca, R.string.francesca_description, R.string.francesca_address, R.string.francesca_location, R.string.francesca_phone, R.string.francesca_facebook, R.string.francesca_instagram, R.string.francesca_website));
        rishonItems.add(new RishonItem(R.drawable.sunflower, R.string.sunflower, R.string.sunflower_description, R.string.sunflower_address, R.string.sunflower_location, R.string.sunflower_phone, R.string.sunflower_facebook));
        rishonItems.add(new RishonItem(R.drawable.bernard, R.string.bernard, R.string.bernard_description, R.string.bernard_address, R.string.bernard_location, R.string.bernard_phone, R.string.bernard_facebook, R.string.bernard_instagram, R.string.bernard_website));
        rishonItems.add(new RishonItem(R.drawable.garage, R.string.garage, R.string.garage_description, R.string.garage_address, R.string.garage_location, R.string.garage_phone, R.string.garage_facebook, R.string.garage_instagram, R.string.garage_website));
        rishonItems.add(new RishonItem(R.drawable.delicream, R.string.delicream, R.string.delicream_description, R.string.delicream_address, R.string.delicream_location, R.string.delicream_phone, R.string.delicream_facebook, R.string.delicream_instagram, R.string.delicream_website));
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
