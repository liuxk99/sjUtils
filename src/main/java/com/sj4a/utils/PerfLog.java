package com.sj4a.utils;

import android.os.SystemClock;
import android.util.Log;

import java.util.Locale;

public class PerfLog {
    private static final String PREFIX_BEGIN = " => ";
    private static final String PREFIX_END = " <- ";

    private static final boolean LOG_ON = true;

    static public long begin(String TAG, String message) {
        long uptime = SystemClock.uptimeMillis();
        if (LOG_ON) {
            Log.d(TAG, formatTime(uptime) + PREFIX_BEGIN + message);
        }
        return uptime;
    }

    static public void end(String TAG, String message, long beginTime) {
        if (LOG_ON) {
            long uptime = SystemClock.uptimeMillis();
            long deltaTime = uptime - beginTime;

            Log.d(TAG, formatTime(uptime) + PREFIX_END + message);
            Log.d(TAG,  "exec time: " + formatTime(deltaTime) + "s");
        }
    }

    private static String formatTime(long time){
        long sec = time / 1000;
        long ms = time % 1000;

        return String.format(Locale.getDefault(), "%04d.%03d", sec, ms);
    }
}
