package com.xy;

import com.xy.readbean.MapModel;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Class426 extends Class345 {
   private int fk;
   private MapModel ads;
   private static Class8 bm;
   private int bn;
   private Class322[] adt;
   private <undefinedtype> adu;

   protected void paintChildren(Graphics var1) {
      Class426 var5;
      label86: {
         super.paintChildren(var1);
         if (this.ads != this.aej.mapScene.d) {
            label85: {
               this.ads = this.aej.mapScene.d;
               if (this.ads == null) {
                  return;
               }

               this.bn = this.fk = 3 ^ 3;
               int var2;
               int var10000 = var2 = --3;

               while(true) {
                  if (var10000 >= this.adt.length) {
                     break label85;
                  }

                  Object var3;
                  if ((var3 = this.adt[var2].hr()) != null) {
                     int var4;
                     if ((var4 = (Integer)var3) == -4 >> 2) {
                        if (this.ads.getMapId() >= 1282L && this.ads.getMapId() <= 1288L) {
                           break;
                        }
                     } else if (var4 == (-2 & -1)) {
                        if (this.ads.getMapId() >= 1289L && this.ads.getMapId() <= 1295L) {
                           break;
                        }
                     } else if (var4 == (-1 & -3)) {
                        if (this.ads.getMapId() >= 1268L && this.ads.getMapId() <= 1271L) {
                           break;
                        }
                     } else if (var4 == (-1 & -4)) {
                        if (this.ads.getMapId() >= 1221L && this.ads.getMapId() <= 1226L || this.ads.getMapId() == 3311L) {
                           break;
                        }
                     } else if (var4 == (-1 & -5)) {
                        if (this.ads.getMapId() >= 1273L && this.ads.getMapId() <= 1276L) {
                           break;
                        }
                     } else if (this.ads.getMapId() == (long)var4) {
                        break;
                     }
                  }

                  ++var2;
                  var10000 = var2;
               }

               var5 = this;
               this.fk = this.adt[var2].getX() + this.adt[var2].getWidth() / --2;
               this.bn = this.adt[var2].getY() + this.adt[var2].getHeight() / --2;
               break label86;
            }
         }

         var5 = this;
      }

      if (var5.fk > 0) {
         if (bm == null) {
            bm = Class330.s(Class222.m("word"), (short[])null);
         }

         if (bm != null) {
            bm.d(Class280.l(), 5 >> 3);
            bm.aa(var1, this.fk, this.bn);
         }
      }

   }

   public void q() {
      if (this.adu != null) {
         this.adu.setVisible((boolean)(5 >> 3));
      }

      super.q();
   }

   public void ut(int var1, Object var2, Class322 var3) {
      if (var1 == (9113 & 23935)) {
         this.ve().n(this.ae());
      } else if (var1 == (22014 & 11035)) {
         ((Class418)this.ve().e(18622 & 14301)).iv(this.aej.mapScene.d);
      } else if (var1 == (6079 & 26971)) {
         ((Class4)this.ve().e(15263 & 17661)).iv(this.aej.mapScene.d);
      } else {
         if (var1 == (11132 & 21919)) {
            if (var2 == null) {
               return;
            }

            int var4;
            if ((var4 = (Integer)var2) < 0) {
               if (this.adu == null) {
                  this.adu = new MouseListener() {
                     private RichLabel bv;
                     private List<RichLabel> ie;
                     private InputBean akc;

                     public void mouseClicked(MouseEvent var1) {
                     }

                     public {
                        this.bv = new RichLabel("#Y可打开以下地图:", Class681.ce, 11445 & 21502);
                        this.bv.setBounds(103 & 31, 127 & 11, this.bv.getWidth(), this.bv.getHeight());
                        this.add(this.bv);
                        this.addMouseListener(this);
                        this.ie = new ArrayList();
                     }

                     public void mouseExited(MouseEvent var1) {
                     }

                     public void mousePressed(MouseEvent var1) {
                        if (var1.isMetaDown()) {
                           Class426.this.adu.setVisible((boolean)(2 & 5));
                        } else {
                           int var2;
                           for(int var10000 = var2 = 0; var10000 < this.ie.size(); var10000 = var2) {
                              RichLabel var3;
                              if (!(var3 = (RichLabel)this.ie.get(var2)).isVisible()) {
                                 return;
                              }

                              this.akc = var3.isMonitor(var1.getX() - var3.getX(), var1.getY() - var3.getY());
                              if (this.akc != null) {
                                 this.akc.setM((boolean)(4 ^ 5));
                                 return;
                              }

                              ++var2;
                           }

                        }
                     }

                     public void mouseReleased(MouseEvent var1) {
                        if (this.akc != null) {
                           this.akc.setM((boolean)(5 >> 3));
                           if (!Class426.this.adu.isVisible()) {
                              return;
                           }

                           MapModel var2;
                           if ((var2 = Class426.this.vc().ay(this.akc.getId().toString())) == null) {
                              return;
                           }

                           ((Class49)Class426.this.ve().e(63 & 86)).iv(var2);
                        }

                     }

                     public void mouseEntered(MouseEvent var1) {
                     }

                     public void ab(int var1) {
                        this.akc = null;
                        Class603 var4 = Class426.this.vc();
                        int var7 = 5 >> 3;
                        int var2 = 3 >> 2;
                        int var5 = 3 ^ 3;
                        int var10000;
                        if (var1 == -4 >> 2) {
                           var2 = 26411 & 7638;
                           var5 = 30139 & 3916;
                           var10000 = var2;
                        } else if (var1 == (-1 & -2)) {
                           var2 = 3471 & 30585;
                           var5 = 28495 & 5567;
                           var10000 = var2;
                        } else if (var1 == (-3 & -1)) {
                           var2 = 8183 & 25852;
                           var5 = 7671 & 26367;
                           var10000 = var2;
                        } else if (var1 == (-1 & -4)) {
                           var2 = 24525 & 9463;
                           var5 = 4063 & 29931;
                           var10000 = var2;
                        } else {
                           if (var1 == (-1 & -5)) {
                              var2 = 15867 & 18173;
                              var5 = 16127 & 17916;
                           }

                           var10000 = var2;
                        }

                        int var6 = var10000;

                        for(var10000 = var6; var10000 <= var5; var10000 = var6) {
                           var2 = var6;
                           if (var1 == (-1 & -4) && var6 == (1759 & 32235)) {
                              var2 = 3311;
                           }

                           MapModel var9;
                           if ((var9 = var4.ay(String.valueOf(var2))) != null) {
                              RichLabel var3 = var7 < this.ie.size() ? (RichLabel)this.ie.get(var7) : null;
                              if (var3 == null) {
                                 var3 = new RichLabel("", Class681.ce);
                                 this.ie.add(var3);
                                 this.add(var3);
                              }

                              InputBean var8 = new InputBean(14);
                              var8.setId(new BigDecimal(var9.getMapId()));
                              var8.setName(var9 != null ? var9.getMapName() : "未知地图");
                              StringBuffer var10;
                              (var10 = new StringBuffer()).append("#Y");
                              var10.append("#V");
                              var10.append(Class695.b().toJson(var8));
                              var10.append("#L");
                              int var10005 = 5 >> 2;
                              var3.setTextSize(var10.toString(), 180);
                              int var10008 = 32 + var7 * 22;
                              int var10009 = var3.getWidth();
                              ++var7;
                              var3.setBounds(7, var10008, var10009, 22);
                              var3.setVisible((boolean)var10005);
                           }

                           ++var6;
                        }

                        for(var10000 = var6 = var7; var10000 < this.ie.size(); var10000 = var6) {
                           Object var11 = this.ie.get(var6);
                           ++var6;
                           ((RichLabel)var11).setVisible((boolean)(5 >> 3));
                        }

                        this.setBounds(2 & 5, 2 & 5, 185, Math.max(90, 46 + var7 * 22));
                     }
                  };
               }

               this.adu.ab(var4);
               Point var6 = GameView.abi(var3.getX(), var3.getY(), this.adu.getWidth(), this.adu.getHeight(), this.getWidth(), this.getHeight());
               this.adu.setBounds(var6.x, var6.y, this.adu.getWidth(), this.adu.getHeight());
               this.add(this.adu, 3 ^ 3);
               this.adu.setVisible((boolean)(5 >> 2));
               return;
            }

            MapModel var5;
            if ((var5 = this.vc().ay(String.valueOf(var4))) == null) {
               return;
            }

            ((Class49)this.ve().e(127 & 22)).iv(var5);
         }

      }
   }

   public Class426(GameView var1) {
      int var10001 = 55 & 127;
      int var10005 = -4 >> 2;
      super(8635 & 24287, --2, Class345.aef, var1);
      this.va(var10005, 3 & 4, 2045 & 31675, 25591 & 7677, Class345.aei);
      this.uv(Class511.q("sc/d/91.png", 5 >> 3, 5 >> 3, 5 >> 3, 5 >> 3, (boolean)(5 >> 3)), (String)null);
      Class322[] var4 = new Class322[var10001];
      boolean var10003 = true;
      this.adt = var4;

      int var2;
      for(int var10000 = var2 = 5 >> 3; var10000 < this.adt.length; var10000 = var2) {
         Class322[] var3 = this.adt;
         Class322 var10002 = new Class322;
         var10005 = 4 ^ 5;
         int var10006;
         Class426 var10007;
         if (var2 == 0) {
            var10006 = 28479 & 4569;
            var10007 = this;
         } else if (var2 == (4 ^ 5)) {
            var10006 = 26554 & 6495;
            var10007 = this;
         } else if (var2 == (1 ^ 3)) {
            var10006 = 4571 & 28479;
            var10007 = this;
         } else {
            var10006 = 284;
            var10007 = this;
         }

         var10002.<init>((String)null, var10005, var10006, var10007);
         var3[var2] = var10002;
         this.add(this.adt[var2]);
         if (var2 == 0) {
            this.adt[var2].setImage("sc/e/140.png");
            this.adt[var2].setBounds(10195 & 23422, 111 & 54, 23 & 124, 23 & 124);
         } else if (var2 == 3 >> 1) {
            this.adt[var2].setImage("sc/e/138.png");
            this.adt[var2].setBounds(16590 & 16319, 959 & 32236, 107 & 124, 59 & 110);
         } else if (var2 == --2) {
            this.adt[var2].setImage("sc/e/139.png");
            this.adt[var2].setBounds(12127 & 20902, 30636 & 2559, 104, 42);
         } else if (var2 == --3) {
            this.adt[var2].bq(1230);
            this.adt[var2].setImage("sc/e/128.png");
            this.adt[var2].setBounds(182, 115, 49, 25);
         } else if (var2 == --4) {
            this.adt[var2].bq(1267);
            this.adt[var2].setImage("sc/e/129.png");
            this.adt[var2].setBounds(396, 96, 110, 31);
         } else if (var2 == --5) {
            this.adt[var2].bq(1250);
            this.adt[var2].setImage("sc/e/130.png");
            this.adt[var2].setBounds(580, 127, 82, 32);
         } else if (var2 == 6) {
            this.adt[var2].bq(1244);
            this.adt[var2].setImage("sc/e/131.png");
            this.adt[var2].setBounds(562, 220, 55, 29);
         } else if (var2 == 7) {
            this.adt[var2].setImage("sc/e/132.png");
            this.adt[var2].setBounds(770, 221, 57, 31);
         } else if (var2 == 8) {
            this.adt[var2].bq(1228);
            this.adt[var2].setImage("sc/e/133.png");
            this.adt[var2].setBounds(154, 226, 81, 33);
         } else if (var2 == 9) {
            this.adt[var2].bq(3180);
            this.adt[var2].setImage("sc/e/134.png");
            this.adt[var2].setBounds(258, 249, 72, 27);
         } else if (var2 == 10) {
            this.adt[var2].bq(1207);
            this.adt[var2].setImage("sc/e/135.png");
            this.adt[var2].setBounds(476, 299, 95, 35);
         } else if (var2 == 11) {
            this.adt[var2].bq(1236);
            this.adt[var2].setImage("sc/e/136.png");
            this.adt[var2].setBounds(435, 420, 77, 29);
         } else if (var2 == 12) {
            this.adt[var2].bq(1211);
            this.adt[var2].setImage("sc/e/137.png");
            this.adt[var2].setBounds(585, 446, 52, 26);
         } else if (var2 == 13) {
            this.adt[var2].bq(1241);
            this.adt[var2].setImage("sc/e/141.png");
            this.adt[var2].setBounds(205, 39, 59, 21);
         } else if (var2 == 14) {
            this.adt[var2].bq(1240);
            this.adt[var2].setImage("sc/e/142.png");
            this.adt[var2].setBounds(143, 47, 59, 20);
         } else if (var2 == 15) {
            this.adt[var2].bq(1232);
            this.adt[var2].setImage("sc/e/143.png");
            this.adt[var2].setBounds(152, 86, 43, 21);
         } else if (var2 == 16) {
            this.adt[var2].bq(1231);
            this.adt[var2].setImage("sc/e/78.png");
            this.adt[var2].setBounds(226, 88, 59, 21);
         } else if (var2 == 17) {
            this.adt[var2].bq(3205);
            this.adt[var2].setImage("sc/e/79.png");
            this.adt[var2].setBounds(432, 34, 79, 20);
         } else if (var2 == 18) {
            this.adt[var2].bq(1296);
            this.adt[var2].setImage("sc/e/80.png");
            this.adt[var2].setBounds(402, 53, 61, 23);
         } else if (var2 == 19) {
            this.adt[var2].bq(-4 >> 2);
            this.adt[var2].setImage("sc/e/81.png");
            this.adt[var2].setBounds(472, 65, 41, 20);
         } else if (var2 == 20) {
            this.adt[var2].bq(-2);
            this.adt[var2].setImage("sc/e/82.png");
            this.adt[var2].setBounds(373, 75, 41, 20);
         } else if (var2 == 21) {
            this.adt[var2].bq(1248);
            this.adt[var2].setImage("sc/e/83.png");
            this.adt[var2].setBounds(628, 102, 59, 20);
         } else if (var2 == 22) {
            this.adt[var2].bq(40001);
            this.adt[var2].setImage("sc/e/84.png");
            this.adt[var2].setBounds(625, 162, 59, 20);
         } else if (var2 == 23) {
            this.adt[var2].bq(3155);
            this.adt[var2].setImage("sc/e/85.png");
            this.adt[var2].setBounds(602, 185, 56, 20);
         } else if (var2 == 24) {
            this.adt[var2].bq(-3);
            this.adt[var2].setImage("sc/e/86.png");
            this.adt[var2].setBounds(608, 249, 78, 22);
         } else if (var2 == 25) {
            this.adt[var2].bq(1208);
            this.adt[var2].setImage("sc/e/87.png");
            this.adt[var2].setBounds(656, 292, 77, 20);
         } else if (var2 == 26) {
            this.adt[var2].bq(1213);
            this.adt[var2].setImage("sc/e/88.png");
            this.adt[var2].setBounds(653, 321, 77, 21);
         } else if (var2 == 27) {
            this.adt[var2].bq(1214);
            this.adt[var2].setImage("sc/e/89.png");
            this.adt[var2].setBounds(661, 356, 76, 18);
         } else if (var2 == 28) {
            this.adt[var2].bq(40007);
            this.adt[var2].setImage("sc/e/90.png");
            this.adt[var2].setBounds(808, 178, 41, 19);
         } else if (var2 == 29) {
            this.adt[var2].bq(40004);
            this.adt[var2].setImage("sc/e/91.png");
            this.adt[var2].setBounds(826, 262, 42, 20);
         } else if (var2 == 30) {
            this.adt[var2].bq(40005);
            this.adt[var2].setImage("sc/e/92.png");
            this.adt[var2].setBounds(788, 311, 42, 19);
         } else if (var2 == 31) {
            this.adt[var2].bq(40006);
            this.adt[var2].setImage("sc/e/93.png");
            this.adt[var2].setBounds(752, 336, 84, 27);
         } else if (var2 == 32) {
            this.adt[var2].bq(1136);
            this.adt[var2].setImage("sc/e/94.png");
            this.adt[var2].setBounds(119, 172, 78, 19);
         } else if (var2 == 33) {
            this.adt[var2].bq(1246);
            this.adt[var2].setImage("sc/e/95.png");
            this.adt[var2].setBounds(146, 197, 59, 19);
         } else if (var2 == 34) {
            this.adt[var2].bq(1229);
            this.adt[var2].setImage("sc/e/96.png");
            this.adt[var2].setBounds(131, 277, 78, 21);
         } else if (var2 == 35) {
            this.adt[var2].bq(1252);
            this.adt[var2].setImage("sc/e/97.png");
            this.adt[var2].setBounds(113, 371, 58, 20);
         } else if (var2 == 36) {
            this.adt[var2].bq(3307);
            this.adt[var2].setImage("sc/e/98.png");
            this.adt[var2].setBounds(239, 288, 56, 18);
         } else if (var2 == 37) {
            this.adt[var2].bq(3210);
            this.adt[var2].setImage("sc/e/99.png");
            this.adt[var2].setBounds(216, 328, 73, 20);
         } else if (var2 == 38) {
            this.adt[var2].bq(3308);
            this.adt[var2].setImage("sc/e/100.png");
            this.adt[var2].setBounds(213, 351, 58, 20);
         } else if (var2 == 39) {
            this.adt[var2].bq(1280);
            this.adt[var2].setImage("sc/e/101.png");
            this.adt[var2].setBounds(331, 269, 57, 19);
         } else if (var2 == 40) {
            this.adt[var2].bq(1278);
            this.adt[var2].setImage("sc/e/102.png");
            this.adt[var2].setBounds(314, 297, 59, 21);
         } else if (var2 == 41) {
            this.adt[var2].bq(1279);
            this.adt[var2].setImage("sc/e/103.png");
            this.adt[var2].setBounds(301, 328, 58, 20);
         } else if (var2 == 42) {
            this.adt[var2].bq(1251);
            this.adt[var2].setImage("sc/e/104.png");
            this.adt[var2].setBounds(281, 362, 78, 21);
         } else if (var2 == 43) {
            this.adt[var2].bq(1259);
            this.adt[var2].setImage("sc/e/105.png");
            this.adt[var2].setBounds(271, 391, 60, 20);
         } else if (var2 == 44) {
            this.adt[var2].bq(1263);
            this.adt[var2].setImage("sc/e/106.png");
            this.adt[var2].setBounds(393, 298, 60, 20);
         } else if (var2 == 45) {
            this.adt[var2].bq(1272);
            this.adt[var2].setImage("sc/e/107.png");
            this.adt[var2].setBounds(373, 334, 59, 20);
         } else if (var2 == 46) {
            this.adt[var2].bq(1242);
            this.adt[var2].setImage("sc/e/119.png");
            this.adt[var2].setBounds(371, 359, 59, 20);
         } else if (var2 == 47) {
            this.adt[var2].bq(1254);
            this.adt[var2].setImage("sc/e/120.png");
            this.adt[var2].setBounds(501, 248, 59, 20);
         } else if (var2 == 48) {
            this.adt[var2].bq(-4);
            this.adt[var2].setImage("sc/e/121.png");
            this.adt[var2].setBounds(455, 274, 60, 20);
         } else if (var2 == 49) {
            this.adt[var2].bq(1298);
            this.adt[var2].setImage("sc/e/122.png");
            this.adt[var2].setBounds(540, 276, 40, 20);
         } else if (var2 == 50) {
            this.adt[var2].bq(1193);
            this.adt[var2].setImage("sc/e/123.png");
            this.adt[var2].setBounds(570, 344, 58, 20);
         } else if (var2 == 51) {
            this.adt[var2].bq(1210);
            this.adt[var2].setImage("sc/e/124.png");
            this.adt[var2].setBounds(430, 381, 78, 21);
         } else if (var2 == 52) {
            this.adt[var2].bq(-5);
            this.adt[var2].setImage("sc/e/125.png");
            this.adt[var2].setBounds(605, 411, 78, 21);
         } else if (var2 == 53) {
            this.adt[var2].bq(1227);
            this.adt[var2].setImage("sc/e/126.png");
            this.adt[var2].setBounds(534, 424, 58, 20);
         } else if (var2 == 54) {
            this.adt[var2].bq(3012);
            this.adt[var2].setImage("sc/e/127.png");
            this.adt[var2].setBounds(653, 454, 58, 20);
         }

         ++var2;
      }

   }
}
