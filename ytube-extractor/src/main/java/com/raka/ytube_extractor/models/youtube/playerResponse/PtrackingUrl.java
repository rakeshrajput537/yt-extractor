package com.raka.ytube_extractor.models.youtube.playerResponse;

import java.io.Serializable;

public class PtrackingUrl implements Serializable {
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public String toString() {
        return
                "PtrackingUrl{" +
                        "baseUrl = '" + baseUrl + '\'' +
                        "}";
    }
}
