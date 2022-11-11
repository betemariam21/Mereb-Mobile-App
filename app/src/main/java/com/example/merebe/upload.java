package com.example.merebe;

public class upload {
    private String mName;
    private String mImageUrl;
    private String mDate;
    private String mDes;

    public upload() {
        //empty constructor needed
    }

    public upload(String name, String imageUrl, String date, String des) {
        if (name.trim().equals("")) {
            name = "No Name";
        }
        if (date.trim().equals("")) {
            name = "No Date";
        }
        if (des.trim().equals("")) {
            name = "No Description for this Event";
        }

        mName = name;
        mImageUrl = imageUrl;
        mDate = date;
        mDes = des;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }
    public String getDes() {
        return mDes;
    }

    public void setDes(String des) {
        mDes = des;
    }
}
