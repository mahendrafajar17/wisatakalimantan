package com.mahendrafajar17.wisatakalimantan

import android.os.Parcel
import android.os.Parcelable

data class Wisata(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0)

    : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeString(detail)
        dest?.writeInt(photo)
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<Wisata> {
        override fun createFromParcel(parcel: Parcel): Wisata {
            return Wisata(parcel)
        }

        override fun newArray(size: Int): Array<Wisata?> {
            return arrayOfNulls(size)
        }
    }
}
