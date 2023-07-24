package com.raka.yt_extractor.models.newModels

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
class ConfirmButton : Parcelable, Serializable {
    @SerializedName("buttonRenderer")
    var buttonRenderer: ButtonRenderer? = null
    override fun toString(): String {
        return "ConfirmButton{" +
                "buttonRenderer = '" + buttonRenderer + '\'' +
                "}"
    }
}