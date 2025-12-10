/*
 * Decompiled with CFR 0.152.
 */
package com.xy.text;

import java.text.DecimalFormat;

public class CFPSMaker {
    private long interval = 0L;
    public static final int FPS = 8;
    private DecimalFormat df = new DecimalFormat("0.0");
    public static long FPS_MAX_INTERVAL = 1000000000L;
    private long frameCount = 0L;
    private double nowFPS = 0.0;
    public static final long PERIOD = 125000000L;
    private long time;

    public long getTime() {
        return this.time;
    }

    public void ALLATORIxDEMO() {
        ++this.frameCount;
        this.interval += 125000000L;
        if (this.interval < FPS_MAX_INTERVAL) return;
        long IiiiiiiiIIIII = System.nanoTime();
        long IiiiiiiiIIIII2 = IiiiiiiiIIIII - this.time;
        this.nowFPS = (double)this.frameCount / (double)IiiiiiiiIIIII2 * (double)FPS_MAX_INTERVAL;
        this.frameCount = 0L;
        this.interval = 0L;
        this.time = IiiiiiiiIIIII;
    }

    public double getNowFPS() {
        return this.nowFPS;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public String getFPS() {
        return this.df.format(this.nowFPS);
    }

    public void setFrameCount(long frameCount) {
        this.frameCount = frameCount;
    }

    public long getFrameCount() {
        return this.frameCount;
    }

    public void setNowFPS(double nowFPS) {
        this.nowFPS = nowFPS;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getInterval() {
        return this.interval;
    }
}
