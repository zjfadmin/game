package com.xy.scene;

import com.xy.bp;
import com.xy.br;
import com.xy.cY;
import com.xy.dx;
import com.xy.z;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

public class Build {
   private z s1;
   public static int TOWER_LONG = --3;
   public static int PO = 5 >> 1;
   private int v;
   private int x;
   public static int CAN = 3 >> 1;
   public static int LY2 = 87 & 47;
   public static int TOWER_DOOR = 3 >> 2;
   private int px;
   private int bh;
   private int type;
   public static int TOWER_FIRE = --1;
   public static int LZ2 = --4;
   private int y;
   public static int LZ1 = --3;
   private int py;
   private z sprite;
   public static int LY3 = 88 & 47;
   private int state;
   public static int LY1 = 87 & 46;
   private int hp;
   public static int MAN = 5 >> 3;
   public static int LZ3 = --5;
   private z s3;
   public static int TOWER_ICE = --2;
   private Image image;
   private int time;
   private z s2;
   public static int TOWER_HUO = --4;

   public int getState() {
      return this.state;
   }

   public int getBh() {
      return this.bh;
   }

   public int getY() {
      return this.y;
   }

   public void setX(int var1) {
      this.x = var1;
   }

   public void setType(int var1) {
      this.type = var1;
   }

   public void setHp(int var1) {
      if (this.hp == var1) {
         if (this.type == TOWER_FIRE || this.type == TOWER_ICE) {
            int var10001 = 5 >> 1;
            this.time = 4 ^ 5;
            this.v = var10001;
         }

      } else {
         if (this.type == TOWER_DOOR || this.type == TOWER_FIRE || this.type == TOWER_ICE) {
            this.v = this.time = --1;
         }

         this.hp = var1;
      }
   }

   public Build(int var1, int var2, int var3, int var4) {
      this.bh = var1;
      this.type = var2;
      this.state = var3;
      this.hp = var4;
      int var10001;
      switch(var1) {
      case 0:
         while(false) {
         }

         var10001 = 19308 & 13819;
         this.x = 26619 & 6455;
         this.y = var10001;
         return;
      case 1:
         var10001 = 30271 & 4089;
         this.x = 29556 & 3551;
         this.y = var10001;
         return;
      case 2:
         var10001 = 25727 & 8153;
         this.x = 6015 & 27593;
         this.y = var10001;
         return;
      case 3:
         var10001 = 13631 & 20423;
         this.x = 17502 & 16383;
         this.y = var10001;
         return;
      case 4:
         var10001 = 22524 & 11471;
         this.x = 3647 & 29676;
         this.y = var10001;
         return;
      case 5:
         var10001 = 16294 & 17887;
         this.x = 12283 & 21366;
         this.y = var10001;
         return;
      case 11:
         var10001 = 16318 & 17001;
         this.x = 31085 & 3831;
         this.y = var10001;
         return;
      case 12:
         var10001 = 18399 & 15149;
         this.x = 30143 & 4089;
         this.y = var10001;
         return;
      case 13:
         this.x = 1767;
         this.y = 956;
         return;
      case 14:
         this.x = 1701;
         this.y = 648;
         return;
      case 15:
         this.x = 2001;
         this.y = 826;
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      default:
      }
   }

   public String getName() {
      switch(this.type) {
      case 0:
         while(false) {
         }

         return "城门";
      case 1:
         return "火塔";
      case 2:
         return "冰塔";
      case 3:
         return "龙神大炮";
      default:
         return "";
      }
   }

   public int getPy() {
      return this.py;
   }

   public void setBh(int var1) {
      this.bh = var1;
   }

   public void setPx(int var1) {
      this.px = var1;
   }

   public Image getImage() {
      return this.image;
   }

   public void setPy(int var1) {
      this.py = var1;
   }

   public void setState(int var1) {
      int var10003 = --1;
      this.sprite = null;
      this.image = null;
      this.time = var10003;
      this.state = var1;
   }

   public int getX() {
      return this.x;
   }

   public int getType() {
      return this.type;
   }

   public int getHp() {
      return this.hp;
   }

   public void setY(int var1) {
      this.y = var1;
   }

   public int getPx() {
      return this.px;
   }

   public void setImage(Image var1) {
      this.image = var1;
   }

   public void a(Graphics var1, bp var2) {
      if (this.type == TOWER_DOOR && this.state == PO) {
         this.image = null;
      } else {
         Build var10000;
         bp var6;
         label103: {
            this.time += 95 & 41;
            if (this.state >= LZ1) {
               if (this.sprite != null && this.time > this.sprite.k()) {
                  if (this.state != LY3 && this.state != LZ3) {
                     var10000 = this;
                     this.state += 4 ^ 5;
                  } else {
                     var10000 = this;
                     this.state = MAN;
                  }

                  var10000.setState(this.state);
                  var6 = var2;
                  break label103;
               }
            } else {
               this.time += 25 & 111;
            }

            var6 = var2;
         }

         Point var4 = var6.i(this.x, this.y);
         if (this.sprite == null) {
            StringBuffer var3 = new StringBuffer();
            var3.append(cY.b);
            var3.append(this.type == TOWER_ICE ? TOWER_FIRE : this.type);
            StringBuffer var7;
            if (this.state == LZ3) {
               var7 = var3;
               var3.append(LZ1);
            } else if (this.state == LY3) {
               var7 = var3;
               var3.append(LY1);
            } else {
               var7 = var3;
               var3.append(this.state);
            }

            var7.append(cY.p);
            this.sprite = dx.q(var3.toString());
         }

         if (this.sprite == null) {
            this.image = null;
         } else if (var4 == null) {
            this.image = null;
         } else {
            label118: {
               if (this.type == TOWER_FIRE || this.type == TOWER_ICE) {
                  if (this.s2 == null) {
                     if (this.type == TOWER_FIRE) {
                        var10000 = this;
                        this.s2 = dx.q("sc/bang/BgTDbR.tcp");
                     } else {
                        var10000 = this;
                        this.s2 = dx.q("sc/bang/BgTDbB.tcp");
                     }
                     break label118;
                  }

                  this.s2.d((long)this.time, 5 >> 3);
                  this.s2.aa(var1, var4.x, var4.y);
               }

               var10000 = this;
            }

            if (var10000.state != LZ3 && this.state != LY3) {
               var10000 = this;
               this.sprite.d((long)this.time, 5 >> 3);
            } else {
               var10000 = this;
               this.sprite.d((long)(this.sprite.k() - this.time), 3 >> 2);
            }

            var10000.sprite.aa(var1, var4.x, var4.y);
            br var5;
            this.px = (var5 = this.sprite.ac()).k();
            this.py = var5.i();
            this.image = var5.g();
            if (this.v != 0) {
               if (this.s3 == null) {
                  if (this.v == 5 >> 2) {
                     if (this.type == TOWER_DOOR) {
                        this.s3 = dx.q("sc/bang/BgTHs.tcp");
                        return;
                     }

                     this.s3 = dx.q("sc/bang/BgTDj.tcp");
                     return;
                  }

                  if (this.type == TOWER_FIRE) {
                     this.s3 = dx.q("sc/bang/BgTQR.tcp");
                     return;
                  }

                  this.s3 = dx.q("sc/bang/BgTQB.tcp");
                  return;
               }

               this.s3.d((long)this.time, 3 ^ 3);
               this.s3.aa(var1, var4.x, var4.y);
               if (this.time > this.s3.k()) {
                  this.v = 3 >> 2;
                  this.s3 = null;
               }
            }

         }
      }
   }
}
