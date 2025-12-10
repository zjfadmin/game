package com.xy.text;

import java.text.DecimalFormat;

public class CFPSMaker {
   private DecimalFormat df = new DecimalFormat("0.0");
   public static final long PERIOD = 125000000L;
   public static final int FPS = 8;
   private long frameCount = 0L;
   public static long FPS_MAX_INTERVAL = 1000000000L;
   private long interval = 0L;
   private long time;
   private double nowFPS = 0.0D;

   public void setTime(long var1) {
      this.time = var1;
   }

   public String getFPS() {
      return this.df.format(this.nowFPS);
   }

   public void setInterval(long var1) {
      this.interval = var1;
   }

   public void a() {
      ++this.frameCount;
      this.interval += 125000000L;
      if (this.interval >= FPS_MAX_INTERVAL) {
         long var1;
         long var3 = (var1 = System.nanoTime()) - this.time;
         this.nowFPS = (double)this.frameCount / (double)var3 * (double)FPS_MAX_INTERVAL;
         this.frameCount = 0L;
         this.interval = 0L;
         this.time = var1;
      }

   }

   public long getTime() {
      return this.time;
   }

   public void setFrameCount(long var1) {
      this.frameCount = var1;
   }

   public long getFrameCount() {
      return this.frameCount;
   }

   public long getInterval() {
      return this.interval;
   }

   public void setNowFPS(double var1) {
      this.nowFPS = var1;
   }

   public double getNowFPS() {
      return this.nowFPS;
   }
}
