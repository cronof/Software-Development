package com.a5635512088.activity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 5635512088 on 3/30/2018.
 */
public class MyData implements Parcelable {
    int x=1, y=2;


    protected MyData(Parcel in) {
        x = in.readInt();
        y = in.readInt();
    }

    public static final Creator<MyData> CREATOR = new Creator<MyData>() {
        @Override
        public MyData createFromParcel(Parcel in) {
            return new MyData(in);
        }

        @Override
        public MyData[] newArray(int size) {
            return new MyData[size];
        }
    };

    public MyData() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(x);
        dest.writeInt(y);
    }
}
