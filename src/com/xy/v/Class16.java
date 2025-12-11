package com.xy.v;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.DataLine.Info;

public class Class16 {
   private AudioFormat a;
   private String b;
   Class16 c;
   private SourceDataLine d;
   private volatile boolean e = true;
   private Thread f;
   private AudioInputStream g;

   // $VF: synthetic method
   static void a(Class16 var0) {
      var0.c();
   }

   public void b() {
      new Thread(new Class2(this)).start();
   }

   // $VF: synthetic method
   private void c() {
      synchronized (this) {
         this.e = false;
         this.notifyAll();
      }
   }

   public void d(Thread var1) {
      this.f = var1;
   }

   public static String e(String var0) {
      int var10000 = 4 << 4 ^ 3 << 2 ^ 3;
      int var10001 = 3 << 3;
      int var10002 = 1 << 3 ^ 3;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var3;
      int var9 = var3 = var10003 - 1;
      char[] var1 = var10005;
      int var4 = var10002;
      var10000 = var9;

      for (int var2 = var10001; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         int var10 = var5.charAt(var3);
         var3--;
         var1[var10001] = (char)(var10 ^ var2);
         if (var3 < 0) {
            break;
         }

         var10 = var3--;
         var1[var10] = (char)(var5.charAt(var10) ^ var4);
      }

      return new String(var1);
   }

   // $VF: synthetic method
   private void f() {
      synchronized (this) {
         this.e = true;
         this.notifyAll();
      }
   }

   public void g(String var1) {
      this.b = var1;
   }

   @Override
   protected void finalize() throws Throwable {
      super.finalize();
      this.d.drain();
      this.d.close();
      this.g.close();
   }

   public void h() {
      try {
         String var10004 = "yd%j\u007ftcd%";
         File var1 = new File("sc/music/" + this.b);
         this.g = AudioSystem.getAudioInputStream(var1);
         this.a = this.g.getFormat();
         if (this.a.getEncoding() != Encoding.PCM_SIGNED) {
            this.a = new AudioFormat(
               Encoding.PCM_SIGNED, this.a.getSampleRate(), 16, this.a.getChannels(), this.a.getChannels() * 2, this.a.getSampleRate(), false
            );
            this.g = AudioSystem.getAudioInputStream(this.a, this.g);
         }

         Info var2 = new Info(SourceDataLine.class, this.a, -1);
         this.d = (SourceDataLine)AudioSystem.getLine(var2);
         this.d.open(this.a);
         this.d.start();
      } catch (Exception var3) {
         System.err.println(this.b);
         String var10001 = "韥乗抳锞";
         System.err.println("音乐报错");
         Class1.a(false);
         Class1.b(false);
      }
   }

   public Class16(String var1) {
      this.c = this;
      this.b = var1;
   }

   public void i() {
      new Thread(new Class28(this)).start();
   }

   // $VF: synthetic method
   private void j(boolean var1) throws InterruptedException {
      try {
         if (var1) {
            Class16 var10000 = this;

            while (true) {
               var10000.n();
               var10000 = this;
            }
         }

         this.n();
         this.d.drain();
         this.d.close();
         this.g.close();
      } catch (Exception var3) {
      }
   }

   // $VF: synthetic method
   static void k(Class16 var0) {
      var0.f();
   }

   public Thread l() {
      return this.f;
   }

   // $VF: synthetic method
   static void m(Class16 var0, boolean var1) throws InterruptedException {
      var0.j(var1);
   }

   // $VF: synthetic method
   private void n() throws Exception {
      synchronized (this) {
         this.e = true;
      }

      String var10004 = "yd%j\u007ftcd%";
      File var1 = new File("sc/music/" + this.b);
      this.g = AudioSystem.getAudioInputStream(var1);
      this.a = this.g.getFormat();
      if (this.a.getEncoding() != Encoding.PCM_SIGNED) {
         this.a = new AudioFormat(
            Encoding.PCM_SIGNED, this.a.getSampleRate(), 16, this.a.getChannels(), this.a.getChannels() * 2, this.a.getSampleRate(), false
         );
         this.g = AudioSystem.getAudioInputStream(this.a, this.g);
      }

      byte[] var3 = new byte[1024];

      int var2;
      for (Class16 var10000 = this; (var2 = var10000.g.read(var3, 0, var3.length)) != -1; var10000 = this) {
         synchronized (this) {
            while (!this.e) {
               this.wait();
            }
         }

         this.d.write(var3, 0, var2);
      }
   }

   public void o(boolean var1) {
      this.f = new Thread(new Class21(this, var1));
      this.f.start();
   }

   public boolean p() {
      return this.e;
   }

   public String q() {
      return this.b;
   }
}
