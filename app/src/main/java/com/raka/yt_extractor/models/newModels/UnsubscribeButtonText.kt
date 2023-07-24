package com.raka.yt_extractor.models.newModels

import com.google.gson.annotations.SerializedName

class UnsubscribeButtonText {
    @SerializedName("runs")
    var runs: List<RunsItem>? = null
    override fun toString(): String {
        return "UnsubscribeButtonText{" +
                "runs = '" + runs + '\'' +
                "}"
    }
}