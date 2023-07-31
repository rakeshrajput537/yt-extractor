package com.raka.ytube_extractor.models

class AudioVideoUrl() {
    private var audioUrl: String = ""
    private var videoUrl: String = ""

    fun setAudioUrl(audioUrl: String) {
        this.audioUrl = audioUrl
    }

    fun setVideoUrl(videoUrl: String) {
        this.videoUrl = videoUrl
    }

    fun getAudioUrl(): String{
        return this.audioUrl
    }

    fun getVideoUrl(): String{
        return this.videoUrl
    }
}
