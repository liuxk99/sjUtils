package com.sj.utils;

public class SjLogGen {
    private final String mTag;

    public SjLogGen(String tag) {
        mTag = tag;
    }

    public SjLog build(String msg) {
        SjLog sjLog = new SjLog(this.mTag);
        sjLog.setMsg(msg);
        return sjLog;
    }
}
