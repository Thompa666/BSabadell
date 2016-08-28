package com.ideaknow.api.client.forms.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.ideaknow.api.client.model.AtmMobileEnrollmentModel;
import com.ideaknow.api.client.model.key.KeyModel;

public class EnrollmentRemoveForm implements Parcelable {

    private AtmMobileEnrollmentModel enrollment;
    private KeyModel key;

    public EnrollmentRemoveForm() {
    }

    public AtmMobileEnrollmentModel getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(AtmMobileEnrollmentModel enrollment) {
        this.enrollment = enrollment;
    }

    public KeyModel getKey() {
        return key;
    }

    public void setKey(KeyModel key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "EnrollmentRemoveForm{" +
                "enrollment=" + enrollment +
                ", key=" + key +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.enrollment, 0);
        dest.writeParcelable(this.key, 0);
    }

    private EnrollmentRemoveForm(Parcel in) {
        this.enrollment = in.readParcelable(AtmMobileEnrollmentModel.class.getClassLoader());
        this.key = in.readParcelable(KeyModel.class.getClassLoader());
    }

    public static final Creator<EnrollmentRemoveForm> CREATOR = new Creator<EnrollmentRemoveForm>() {
        public EnrollmentRemoveForm createFromParcel(Parcel source) {
            return new EnrollmentRemoveForm(source);
        }

        public EnrollmentRemoveForm[] newArray(int size) {
            return new EnrollmentRemoveForm[size];
        }
    };
}
