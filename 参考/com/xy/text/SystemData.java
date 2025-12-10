package com.xy.text;

public class SystemData {
   public static boolean shadow;
   public boolean b4;
   public long chatDown;
   public static boolean isOld;
   public boolean b1;
   public static boolean ISNAME = 3 & 5;
   private int FPSMax;
   public boolean music;
   public boolean b3;
   public static boolean isWing;
   public boolean musicSound;
   public static boolean ISTCP = 3 >> 1;
   public boolean b5;
   public static boolean ISMOUNT = 3 >> 1;
   public boolean b2;
   public static boolean ISSTALL = 3 & 5;
   public boolean b7;
   public long value;
   public static boolean ISTITLE = --1;
   private int showView;
   public long chatUp;
   public boolean b6;

   public void setMusic(boolean var1) {
      this.music = var1;
   }

   public boolean a() {
      return this.b7;
   }

   public boolean b() {
      return this.b4;
   }

   public void setB3(boolean var1) {
      this.b3 = var1;
   }

   public boolean c() {
      return this.b1;
   }

   public boolean d() {
      return this.b2;
   }

   public void setShowView(int var1) {
      this.showView = var1;
   }

   public void e(long var1) {
      this.value = var1;
      this.showView = (int)(var1 & 15L);
      this.FPSMax = (int)(var1 >> --4 & 15L);
      this.music = (boolean)((var1 >> (9 & 126) & 1L) == 1L ? 2 ^ 3 : 0);
      this.musicSound = (boolean)((var1 >> (93 & 43) & 1L) == 1L ? 3 & 5 : 0);
      this.b1 = (boolean)((var1 >> (46 & 91) & 1L) == 1L ? 2 ^ 3 : 0);
      this.b2 = (boolean)((var1 >> (27 & 111) & 1L) == 1L ? 3 >> 1 : 0);
      this.b3 = (boolean)((var1 >> (93 & 46) & 1L) == 1L ? 3 >> 1 : 0);
      this.b4 = (boolean)((var1 >> (15 & 125) & 1L) == 1L ? --1 : 0);
      this.b5 = (boolean)((var1 >> (126 & 15) & 1L) == 1L ? --1 : 0);
      this.b6 = (boolean)((var1 >> (95 & 47) & 1L) == 1L ? 5 >> 2 : 0);
      this.b7 = (boolean)((var1 >> (51 & 92) & 1L) == 1L ? 4 ^ 5 : 0);
      isOld = this.b1;
      isWing = this.b2;
   }

   public void setMusicSound(boolean var1) {
      this.musicSound = var1;
   }

   public void f() {
      // $FF: Couldn't be decompiled
   }

   public boolean g() {
      return this.b3;
   }

   public boolean setValue(long var1) {
      if (this.value == var1) {
         return (boolean)(3 ^ 3);
      } else {
         int var3 = this.showView;
         this.e(var1);
         this.i();
         return (boolean)(var3 != this.showView ? 5 >> 2 : 0);
      }
   }

   public int getFPSMax() {
      return this.FPSMax;
   }

   public boolean h() {
      return this.music;
   }

   public boolean setValue() {
      long var1 = (long)(this.showView | this.FPSMax << --4);
      if (this.music) {
         var1 |= 256L;
      }

      if (this.musicSound) {
         var1 |= 512L;
      }

      if (this.b1) {
         var1 |= 1024L;
      }

      if (this.b2) {
         var1 |= 2048L;
      }

      if (this.b3) {
         var1 |= 4096L;
      }

      if (this.b4) {
         var1 |= 8192L;
      }

      if (this.b5) {
         var1 |= 16384L;
      }

      if (this.b6) {
         var1 |= 32768L;
      }

      if (this.b7) {
         var1 |= 65536L;
      }

      return this.setValue(var1);
   }

   public void setB5(boolean var1) {
      this.b5 = var1;
   }

   public int getShowView() {
      return this.showView;
   }

   public void i() {
      // $FF: Couldn't be decompiled
   }

   public void setB7(boolean var1) {
      this.b7 = var1;
   }

   public void setB2(boolean var1) {
      this.b2 = var1;
   }

   public boolean j() {
      return this.b6;
   }

   public int getFPS() {
      if (this.FPSMax == 0) {
         return 95 & 62;
      } else if (this.FPSMax == (2 ^ 3)) {
         return 62 & 105;
      } else if (this.FPSMax == 5 >> 1) {
         return 114 & 63;
      } else {
         return this.FPSMax == --3 ? 125 & 62 : 30;
      }
   }

   public boolean setSystemValue(long var1) {
      if (this.b3) {
         var1 |= 4096L;
      }

      if (this.b4) {
         var1 |= 8192L;
      }

      if (this.b6) {
         var1 |= 32768L;
      }

      return this.setValue(var1);
   }

   public void setB4(boolean var1) {
      this.b4 = var1;
   }

   public boolean k() {
      return this.musicSound;
   }

   public boolean l() {
      return this.b5;
   }

   public void setB1(boolean var1) {
      this.b1 = var1;
   }

   public void setB6(boolean var1) {
      this.b6 = var1;
   }

   public SystemData() {
      int var10003 = 3 >> 1;
      int var10005 = 3 >> 1;
      super();
      this.showView = var10005;
      this.FPSMax = var10003;
      this.value = (long)(this.showView | this.FPSMax << --4);
      this.f();
   }
}
