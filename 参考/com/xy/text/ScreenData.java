package com.xy.text;

public class ScreenData {
   public static final int Screen_x_1 = 1024;
   public static final int Screen_y_2 = 960;
   public static final int Screen_x_2 = 1280;
   public static final int Screen_y_D_Int = 728;
   public static final double Screen_y_D = 728.0D;
   public boolean isChat;
   public int ChatFram_y;
   public int TeamImg_x;
   public int ChatFram_X;
   public static final int Screen_x_3 = 1366;
   public static final int Screen_y_0 = 600;
   public static final double Screen_x_D = 1024.0D;
   public static final int Screen_x_0 = 800;
   public static final int Screen_y_1 = 768;
   public static final int Screen_y_3 = 768;
   public static final int Screen_x_D_Int = 1024;
   public int Screen_y;
   public int Screen_x;

   public int getCentreX(int var1) {
      return (this.Screen_x - var1) / --2;
   }

   public void a(int var1) {
      int var10001;
      int var10003;
      int var10005;
      int var10007;
      switch(var1) {
      case 0:
         while(false) {
         }

         var10001 = 8030 & 25007;
         var10003 = 27387 & 5980;
         var10005 = 7613 & 25454;
         var10007 = 8957 & 24410;
         this.Screen_x = 27508 & 6059;
         this.Screen_y = var10007;
         this.ChatFram_X = var10005;
         this.ChatFram_y = var10003;
         this.TeamImg_x = var10001;
         return;
      case 1:
         var10001 = 14334 & 18927;
         var10003 = 27407 & 6128;
         var10005 = 4012 & 29055;
         var10007 = 18281 & 15254;
         this.Screen_x = 6039 & 27752;
         this.Screen_y = var10007;
         this.ChatFram_X = var10005;
         this.ChatFram_y = var10003;
         this.TeamImg_x = var10001;
         return;
      case 2:
         var10001 = 14334 & 19183;
         var10003 = 12284 & 21443;
         var10005 = 14332 & 18735;
         var10007 = 30698 & 3029;
         this.Screen_x = 30642 & 3405;
         this.Screen_y = var10007;
         this.ChatFram_X = var10005;
         this.ChatFram_y = var10003;
         this.TeamImg_x = var10001;
         return;
      case 3:
         var10001 = 30718 & 2885;
         this.Screen_x = 1366;
         this.Screen_y = 768;
         this.ChatFram_X = 300;
         this.ChatFram_y = 768;
         this.TeamImg_x = var10001;
      default:
      }
   }

   public ScreenData(int var1) {
      int var10003 = 3 >> 1;
      super();
      this.isChat = (boolean)var10003;
      this.a(var1);
   }

   public int getScreen_y() {
      return this.Screen_y;
   }

   public int getCentreY(int var1) {
      return (this.Screen_y - var1) / --2;
   }

   public int getChatFram_y() {
      return this.ChatFram_y;
   }

   public int getScreen_x() {
      return this.Screen_x;
   }

   public int getChatFram_X() {
      return this.ChatFram_X;
   }

   public int getTeamImg_x() {
      return this.TeamImg_x;
   }
}
