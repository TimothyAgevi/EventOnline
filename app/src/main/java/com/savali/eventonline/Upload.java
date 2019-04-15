package com.savali.eventonline;

import com.google.firebase.storage.UploadTask;

public class Upload {
    private String mName,mImageUri,key;

    public Upload(String mName, String mImageUri, String key) {
        if (mName.trim().equals("")){
            mName = "No Name";
        }
        this.mName = mName;
        this.mImageUri = mImageUri;
        this.key = key;
    }

    public Upload() {
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUri() {
        return mImageUri;
    }

    public void setmImageUri(String mImageUri) {
        this.mImageUri = mImageUri;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
