package com.xy;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.DataLine.Info;

public class Class411 {
   private SourceDataLine a;
   private String b;
   private AudioInputStream c;
   private volatile boolean d;
   private AudioFormat e;
   Class411 f;
   private Thread g;

   public String a() {
      return this.b;
   }

   protected void finalize() throws Throwable {
      super.finalize();
      this.a.drain();
      this.a.close();
      this.c.close();
   }


   private void b(boolean var1) throws InterruptedException {
      try {
         if (var1) {
            Class411 var10000 = this;

            while(true) {
               var10000.l();
               var10000 = this;
            }
         }

         this.l();
         this.a.drain();
         this.a.close();
         this.c.close();
      } catch (Exception var2) {
      }
   }

   public void c(final boolean var1) {
      this.g = new Thread(new Runnable() {
         public void run() {
            try {
               Class411.this.b(var1);
               if (!var1) {
                  Class96.c(Class411.this.f);
                  return;
               }
            } catch (InterruptedException var1x) {
               if (!var1) {
                  Class96.c(Class411.this.f);
               }
            }

         }
      });
      this.g.start();
   }

   public void d() {
      (new Thread(new Runnable() {
         public void run() {
            Class411.this.h();
         }
      })).start();
   }

   public Thread f() {
      return this.g;
   }

   public void g() {
      try {
         File var1 = new File("sc/music/" + this.b);
         this.c = AudioSystem.getAudioInputStream(var1);
         this.e = this.c.getFormat();
         if (this.e.getEncoding() != Encoding.PCM_SIGNED) {
            this.e = new AudioFormat(Encoding.PCM_SIGNED, this.e.getSampleRate(), 83 & 60, this.e.getChannels(), this.e.getChannels() * --2, this.e.getSampleRate(), (boolean)(2 & 5));
            this.c = AudioSystem.getAudioInputStream(this.e, this.c);
         }

         Info var2 = new Info(SourceDataLine.class, this.e, -4 >> 2);
         this.a = (SourceDataLine)AudioSystem.getLine(var2);
         this.a.open(this.e);
         this.a.start();
      } catch (Exception var3) {
         System.err.println(this.b);
         System.err.println("音乐报错");
         Class96.g((boolean)(3 ^ 3));
         Class96.b((boolean)(3 & 4));
      }
   }


   private void h() {
      synchronized(this) {
         this.d = (boolean)(3 ^ 3);
         this.notifyAll();
      }
   }

   public void i(Thread var1) {
      this.g = var1;
   }

   public boolean j() {
      return this.d;
   }

   public Class411(String var1) {
      int var10005 = 4 ^ 5;
      super();
      this.d = (boolean)var10005;
      this.f = this;
      this.b = var1;
   }

   public void k(String var1) {
      this.b = var1;
   }


   private void l() throws Exception {
      synchronized(this) {
         this.d = (boolean)(--1);
      }

      File var1 = new File("sc/music/" + this.b);
      this.c = AudioSystem.getAudioInputStream(var1);
      this.e = this.c.getFormat();
      if (this.e.getEncoding() != Encoding.PCM_SIGNED) {
         this.e = new AudioFormat(Encoding.PCM_SIGNED, this.e.getSampleRate(), 23 & 120, this.e.getChannels(), this.e.getChannels() * (5 >> 1), this.e.getSampleRate(), (boolean)(5 >> 3));
         this.c = AudioSystem.getAudioInputStream(this.e, this.c);
      }

      byte[] var10000 = new byte[1024];
      boolean var10002 = true;
      byte[] var2 = var10000;

      int var6;
      for(Class411 var7 = this; (var6 = var7.c.read(var2, 3 ^ 3, var2.length)) != -4 >> 2; var7 = this) {
         synchronized(this) {
            while(!this.d) {
               this.wait();
            }
         }

         this.a.write(var2, 2 & 5, var6);
      }

   }


   private void n() {
      synchronized(this) {
         this.d = (boolean)(--1);
         this.notifyAll();
      }
   }

   public void o() {
      (new Thread(new Runnable() {
         public void run() {
            Class411.this.n();
         }
      })).start();
   }
}
