package com.example.android.p5tourguide;

/**
 * {@link RishonItem} represents a place worth visiting in the city of Rishon Lezion.
 * It contains info about the place.
 */
public class RishonItem {
    /**
     * Constant value that represents no phone number was provided for this item
     */
    private static final int NO_PHONE_PROVIDED = -1;
    /**
     * Constant value that represents no facebook page was provided for this item
     */
    private static final int NO_FACEBOOK_PROVIDED = -1;
    /**
     * Constant value that represents no instagram account was provided for this item
     */
    private static final int NO_INSTAGRAM_PROVIDED = -1;
    /**
     * Constant value that represents no website was provided for this item
     */
    private static final int NO_WEBSITE_PROVIDED = -1;
    /**
     * The name resource ID of the place
     */
    private int mNameResourceId;
    /**
     * The description resource ID of the place
     */
    private int mDescriptionResourceId;
    /**
     * The address resource ID of the place
     */
    private int mAddressResourceId;
    /**
     * The phone number resource ID of the place
     */
    private int mPhoneResourceId = NO_PHONE_PROVIDED;
    /**
     * The facebook page resource ID of the place
     */
    private int mFacebookResourceId = NO_FACEBOOK_PROVIDED;
    /**
     * The instagram account resource ID of the place
     */
    private int mInstagramResourceId = NO_INSTAGRAM_PROVIDED;
    /**
     * The website resource ID of the place
     */
    private int mWebsiteResourceId = NO_WEBSITE_PROVIDED;
    /**
     * The coordinates resource ID of the place
     */
    private int mLocationResourceId;
    /**
     * The image resource ID of the place
     */
    private int mImageResourceId;

    /**
     * Create a new word object.
     */
    public RishonItem(int imageId, int name, int description, int address, int location) {
        mImageResourceId = imageId;
        mNameResourceId = name;
        mDescriptionResourceId = description;
        mAddressResourceId = address;
        mLocationResourceId = location;
    }

    /**
     * Create a new word object.
     */
    public RishonItem(int imageId, int name, int description, int address, int location, int phone) {
        mImageResourceId = imageId;
        mNameResourceId = name;
        mDescriptionResourceId = description;
        mAddressResourceId = address;
        mLocationResourceId = location;
        mPhoneResourceId = phone;
    }

    /**
     * Create a new word object.
     */
    public RishonItem(int imageId, int name, int description, int address, int location, int phone, int facebook) {
        mImageResourceId = imageId;
        mNameResourceId = name;
        mDescriptionResourceId = description;
        mAddressResourceId = address;
        mLocationResourceId = location;
        mPhoneResourceId = phone;
        mFacebookResourceId = facebook;
    }

    /**
     * Create a new word object.
     */
    public RishonItem(int imageId, int name, int description, int address, int location, int phone, int facebook, int instagram) {
        mImageResourceId = imageId;
        mNameResourceId = name;
        mDescriptionResourceId = description;
        mAddressResourceId = address;
        mLocationResourceId = location;
        mPhoneResourceId = phone;
        mFacebookResourceId = facebook;
        mInstagramResourceId = instagram;
    }

    /**
     * Create a new word object.
     */
    public RishonItem(int imageId, int name, int description, int address, int location, int phone, int facebook, int instagram, int website) {
        mImageResourceId = imageId;
        mNameResourceId = name;
        mDescriptionResourceId = description;
        mAddressResourceId = address;
        mLocationResourceId = location;
        mPhoneResourceId = phone;
        mFacebookResourceId = facebook;
        mInstagramResourceId = instagram;
        mWebsiteResourceId = website;
    }

    /**
     * Get the name resource ID of the place item
     *
     * @return
     */
    public int getNameResourceId() {
        return mNameResourceId;
    }

    /**
     * Get the description resource ID of the place item
     *
     * @return
     */
    public int getDescriptionResourceId() {
        return mDescriptionResourceId;
    }

    /**
     * Get the address resource ID of the place item
     *
     * @return
     */
    public int getAddressResourceId() {
        return mAddressResourceId;
    }

    /**
     * Get the phone number resource ID of the place item
     *
     * @return
     */
    public int getPhoneResourceId() {
        return mPhoneResourceId;
    }

    /**
     * Get the facebook page resource ID of the place item
     *
     * @return
     */
    public int getFacebookResourceId() {
        return mFacebookResourceId;
    }

    /**
     * Get the instagram account resource ID of the place item
     *
     * @return
     */
    public int getInstagramResourceId() {
        return mInstagramResourceId;
    }

    /**
     * Get the website resource ID of the place item
     *
     * @return
     */
    public int getWebsiteResourceId() {
        return mWebsiteResourceId;
    }

    /**
     * Get the coordinates resource ID of the place item
     *
     * @return
     */
    public int getLocationResourceId() {
        return mLocationResourceId;
    }

    /**
     * Get the image resource ID of the word
     *
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is a phone number for this place item
     *
     * @return
     */
    public boolean hasPhone() {
        return (mPhoneResourceId != NO_PHONE_PROVIDED);
    }

    /**
     * Returns whether or not there is a facebook page for this place item
     *
     * @return
     */
    public boolean hasFacebook() {
        return (mFacebookResourceId != NO_FACEBOOK_PROVIDED);
    }

    /**
     * Returns whether or not there is an instagram account for this place item
     *
     * @return
     */
    public boolean hasInstagram() {
        return (mInstagramResourceId != NO_INSTAGRAM_PROVIDED);
    }

    /**
     * Returns whether or not there is a website for this place item
     *
     * @return
     */
    public boolean hasWebsite() {
        return (mWebsiteResourceId != NO_WEBSITE_PROVIDED);
    }
}
