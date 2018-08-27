package com.example.android.p5tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link RishonAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link RishonItem} objects.
 */
public class RishonAdapter extends ArrayAdapter<RishonItem> {
    /**
     * Tells if the description should be centered horizontally or not
     */
    private boolean isDescriptionCentered;

    /**
     * Create a new {@link RishonAdapter} object
     *
     * @param context  is the current context (i.e. Activity) that the adapter is being created in.
     * @param items    is the list of {@link RishonItem}s to be displayed.
     * @param centered is true if the description should be in center horizontal mode (when the description is short)
     */
    public RishonAdapter(Activity context, ArrayList<RishonItem> items, boolean centered) {
        super(context, 0, items);
        // Should be true for the "restaurants" and "fun" lists
        isDescriptionCentered = centered;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        /** Place*/
        // Get the {@link RishonItem} object located at this position in the list
        final RishonItem currentItem = getItem(position);
        /** Image*/
        // Find the ImageView in the item_list.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set the ImageView to the image resource specified in the current item
        imageView.setImageResource(currentItem.getImageResourceId());
        /** Name*/
        // Find the TextView in the item_list.xml layout with the ID name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the place name from the resource specified in the currentItem object, and set this text on the name TextView
        nameTextView.setText(getContext().getResources().getString(currentItem.getNameResourceId()));
        /** Description*/
        // Find the TextView in the item_list.xml layout with the ID description
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the place description from the resource specified in the currentItem object, and set this text on the description TextView
        descriptionTextView.setText(getContext().getResources().getString(currentItem.getDescriptionResourceId()));
        // If the description is supposed to be centered horizontally
        if (isDescriptionCentered == true)
            // Set descriptionTextView's gravity to 1=center_horizontal
            descriptionTextView.setGravity(1);
        /** Address*/
        // Find the TextView in the item_list.xml layout with the ID address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        // Make that TextView clickable
        addressTextView.setClickable(true);
        // Get the place address from the resource specified in the currentItem object, and set this text on the address TextView
        addressTextView.setText(getContext().getResources().getString(currentItem.getAddressResourceId()));
        // Make the addressTextView look and behave like a hyperlink
        addressTextView.setMovementMethod(LinkMovementMethod.getInstance());
        Spannable spans = (Spannable) addressTextView.getText();
        // Click on the addressTextView will open google-maps with marker on the place's coordinates
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                // Get the place coordinates from the resource specified in the currentItem object
                Uri mapUri = Uri.parse(getContext().getResources().getString(currentItem.getLocationResourceId()));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                ((Activity) parent.getContext()).startActivity(mapIntent);
            }
        };
        spans.setSpan(clickableSpan, 0, spans.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        /** Phone-number*/
        // Find the TextView in the item_list.xml layout with the ID phone
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
        // Find the ImageView in the item_list.xml layout with the ID phone_image (the phone icon)
        ImageView phoneImageView = (ImageView) listItemView.findViewById(R.id.phone_image);
        if (currentItem.hasPhone()) {
            // If a phone number is available, set the TextView to the text resource specified in the current item:
            // Get the place phone number from the resource specified in the currentItem object, and set this text on the phone TextView
            phoneTextView.setText(getContext().getResources().getString(currentItem.getPhoneResourceId()));
            // Make sure the phone text and image views are visible
            phoneTextView.setVisibility(View.VISIBLE);
            phoneImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the phone text and image views (set visibility to GONE)
            phoneTextView.setVisibility(View.GONE);
            phoneImageView.setVisibility(View.GONE);
        }
        /** Facebook page*/
        // Find the ImageButton in the item_list.xml layout with the ID facebook (the facebook icon)
        ImageButton facebookImageButton = (ImageButton) listItemView.findViewById(R.id.facebook);
        if (currentItem.hasFacebook()) {
            // If a facebook page is available, make sure the view is visible
            facebookImageButton.setVisibility(View.VISIBLE);
        } else
            // Otherwise hide the ImageButton (set visibility to GONE)
            facebookImageButton.setVisibility(View.GONE);
        // Click on the facebookImageButton (the facebook icon) will open a browser with the current item's facebook page
        facebookImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                // Get the place's facebook page from the resource specified in the currentItem object
                intent.setData(Uri.parse(getContext().getResources().getString(currentItem.getFacebookResourceId())));
                ((Activity) parent.getContext()).startActivity(intent);
            }
        });
        /** Instagram account*/
        // Find the ImageButton in the item_list.xml layout with the ID instagram (the instagram icon)
        ImageButton instagramImageButton = (ImageButton) listItemView.findViewById(R.id.instagram);
        if (currentItem.hasInstagram()) {
            // If an instagram account is available, make sure the view is visible
            instagramImageButton.setVisibility(View.VISIBLE);
        } else
            // Otherwise hide the ImageButton (set visibility to GONE)
            instagramImageButton.setVisibility(View.GONE);
        // Click on the instagramImageButton (the instagram icon) will open a browser with the current item's instagram account
        instagramImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                // Get the place's instagram account from the resource specified in the currentItem object
                intent.setData(Uri.parse(getContext().getResources().getString(currentItem.getInstagramResourceId())));
                ((Activity) parent.getContext()).startActivity(intent);
            }
        });
        /** Website*/
        // Find the ImageButton in the item_list.xml layout with the ID website (the website icon)
        ImageButton websiteImageButton = (ImageButton) listItemView.findViewById(R.id.website);
        if (currentItem.hasWebsite()) {
            // If a website is available, make sure the view is visible
            websiteImageButton.setVisibility(View.VISIBLE);
        } else
            // Otherwise hide the ImageButton (set visibility to GONE)
            websiteImageButton.setVisibility(View.GONE);
        // Click on the websiteImageButton (the website icon) will open a browser with the current item's website
        websiteImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                // Get the place's website from the resource specified in the currentItem object
                intent.setData(Uri.parse(getContext().getResources().getString(currentItem.getWebsiteResourceId())));
                ((Activity) parent.getContext()).startActivity(intent);
            }
        });

        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;
    }
}
