package com.raka.yt_extractor;

import com.raka.yt_extractor.exception.YoutubeRequestException;
import com.raka.yt_extractor.models.newModels.VideoPlayerConfig;

public interface JExtractorCallback {

    void onSuccess(VideoPlayerConfig videoData);

    void onNetworkException(YoutubeRequestException e);

    void onError(Exception exception);
}
