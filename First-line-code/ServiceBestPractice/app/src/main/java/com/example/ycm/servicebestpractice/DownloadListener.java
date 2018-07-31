package com.example.ycm.servicebestpractice;

/**
 * Created by YCM on 2018/7/31.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
