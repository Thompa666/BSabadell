package com.ideaknow.api.client.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class AtmMobileEnrollmentListModel implements Parcelable {

    private ArrayList<AtmMobileEnrollmentModel> enrollments;

    public AtmMobileEnrollmentListModel() {
    }

    public ArrayList<AtmMobileEnrollmentModel> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(ArrayList<AtmMobileEnrollmentModel> enrollments) {
        this.enrollments = enrollments;
    }

    @Override
    public String toString() {
        return "AtmMobileEnrollmentListModel{" +
                "enrollments=" + enrollments +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.enrollments);
    }

    private AtmMobileEnrollmentListModel(Parcel in) {
        if (this.enrollments == null) {
            this.enrollments = new ArrayList<AtmMobileEnrollmentModel>();
        }
        in.readList(this.enrollments, AtmMobileEnrollmentModel.class.getClassLoader());
    }

    public static final Creator<AtmMobileEnrollmentListModel> CREATOR =
            new Creator<AtmMobileEnrollmentListModel>() {
        public AtmMobileEnrollmentListModel createFromParcel(Parcel source) {
            return new AtmMobileEnrollmentListModel(source);
        }

        public AtmMobileEnrollmentListModel[] newArray(int size) {
            return new AtmMobileEnrollmentListModel[size];
        }
    };
}
