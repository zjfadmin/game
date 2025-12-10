package com.xy.battle;

import com.xy.W;
import com.xy.ev;
import com.xy.fR;
import com.xy.hd;
import com.xy.ho;
import com.xy.iO;
import com.xy.iy;
import com.xy.lz;
import com.xy.mi;
import com.xy.bean.FightingEndD;
import com.xy.bean.SummonPetBean;
import com.xy.entity.Lingbao;
import com.xy.game.RolePet;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BattleScene {
   public BattleBuffUtil buffUtil;
   private int battleType;
   public static final int HANDLE_PET = 2;
   public boolean battleTip;
   public int campPetDie2;
   public boolean gameBattle;
   public static final int HANDLE = 1;
   public static final int REMOVE = 3333;
   public int campLingDie1;
   private LinkedList<BattleControl> controlList = new LinkedList();
   public static final int USUAL = 0;
   private int battleRound;
   public String campName1;
   public static final int AUTOMATION_PET = 750;
   private long controlTime;
   public static final int ROUND_TIME = 50000;
   public int campLingDie2;
   private String musicNow;
   private int battleEventIndex;
   public String campName2;
   public static final int HANDLE_PLAYER = 1;
   public static final int ROUND_TIME_INDEX = 50;
   public int battleRoundMax;
   private long battleId;
   private long time;
   private Map<Integer, BattlePlay> battlePlayMap;
   public static final int HANDLEPLAY = 2;
   private int battleState;
   public boolean video;
   private ArrayList<iO> showUnitList = new ArrayList();
   public ArrayList<BattleSkillShow> showSkillList = new ArrayList();
   public int campPetDie1;
   private long countdown;
   public long battleMapId;
   private Image[] images;
   private String rountString;
   private LinkedList<iO> battleUnitList;
   public static final int AUTOMATION_PLAYER = 2000;
   public static final int HANDLEPLAYEND = 3;
   private String music;

   public void a(int var1, BattlePlay var2) {
      synchronized(this) {
         if (this.battlePlayMap.get(var1) == null) {
            if (var1 >= this.battleRound) {
               this.battlePlayMap.put(var1, var2);
               this.s(--2, ev.f());
            }
         }
      }
   }

   public void b() {
      Iterator var1;
      for(Iterator var10000 = var1 = this.battleUnitList.iterator(); var10000.hasNext(); var10000 = var1) {
         ((iO)var1.next()).i((boolean)(3 >> 2));
      }

   }

   public long getBattleId() {
      return this.battleId;
   }

   public void c(int var1, String var2, int var3) {
      int var4 = 5 >> 3;
      String var5 = null;
      String var6 = null;
      Point var7 = null;
      Point var8 = null;
      int var10000;
      synchronized(this) {
         int var10 = 0;

         int var11;
         for(var10000 = var11 = 3 & 4; var10000 < var2.length(); var10000 = var11) {
            if ((var11 = var2.indexOf("|", var3 + --1)) == -4 >> 2) {
               var11 = var2.length();
            }

            label127: {
               if (var10 == 0) {
                  if (hd.b(var2, var3, var11) != this.battleRound) {
                     return;
                  }
               } else {
                  int var12;
                  if (var10 == 3 >> 1) {
                     if ((var12 = hd.b(var2, var3, var11)) < 0) {
                        var4 = 2 ^ 3;
                        var12 = -var12;
                     }

                     if (var12 <= this.battleEventIndex) {
                        return;
                     }

                     this.battleEventIndex = var12;
                     var10000 = var11;
                     break label127;
                  }

                  Point var13;
                  if (var1 == 0) {
                     if (var10 == --2) {
                        if ((var5 = var2.substring(var3, var11)).startsWith("技能,")) {
                           var6 = var5.substring(--3);
                           var5 = var5.substring(3 >> 2, --2);
                           var10000 = var11;
                           break label127;
                        }
                     } else if (var10 == --3 || var10 == --4) {
                        var12 = var2.indexOf(",", var3 + --1);
                        var13 = new Point();
                        var13.x = hd.b(var2, var3, var12);
                        var13.y = hd.b(var2, var12 + (2 ^ 3), var11);
                        if (var10 == --3) {
                           var7 = var13;
                           var10000 = var11;
                        } else {
                           var8 = var13;
                           var10000 = var11;
                        }
                        break label127;
                     }
                  } else if (var1 == 5 >> 2) {
                     var12 = var2.indexOf(",", var3 + (3 & 5));
                     var13 = new Point();
                     var13.x = hd.b(var2, var3, var12);
                     var13.y = hd.b(var2, var12 + --1, var11);
                     iO var17;
                     if ((var17 = this.getBattleUnitByCampMan(var13.x, var13.y)) == null) {
                        var10000 = var11;
                        break label127;
                     }

                     var17.i((boolean)(5 >> 3));
                     this.t(var17);
                     StringBuffer var14;
                     (var14 = new StringBuffer()).append("#F");
                     this.g(var14, var17, "#G");
                     var14.append("#W撤回指令");
                     this.e(var13.x, var14.toString());
                  }
               }

               var10000 = var11;
            }

            ++var10;
            var3 = var10000 + 1;
         }
      }

      if (var1 == 0) {
         iO var9;
         if ((var9 = this.getBattleUnitByCampMan(var7.x, var7.y)) != null) {
            if (var4 == 0) {
               var9.i((boolean)(--1));
            }

            iO var16 = var8 != null ? this.getBattleUnitByCampMan(var8.x, var8.y) : null;
            StringBuffer var18 = new StringBuffer();
            var18.append("#F");
            this.g(var18, var9, "#G");
            if (!var5.equals("防御") && !var5.equals("保护") && !var5.equals("捕捉") && !var5.equals("逃跑") && !var5.equals("召唤") && !var5.equals("召回")) {
               var18.append("#W对");
               String var19;
               if (var16 != null) {
                  this.g(var18, var16, var7.x == var8.x ? "#G" : "#R");
                  var19 = var5;
               } else {
                  var18.append("#G随机目标");
                  var19 = var5;
               }

               if (var19.equals("药")) {
                  var10000 = var4;
                  var18.append("#W使用#Y药品");
               } else if (var5.equals("技能")) {
                  var10000 = var4;
                  var18.append("#W使用#Y");
                  var18.append(var6);
               } else if (var5.equals("普通攻击")) {
                  var18.append("#Y物理攻击");
                  var10000 = var4;
               } else {
                  var18.append("#W使用#Y");
                  var18.append(var5);
                  var10000 = var4;
               }
            } else {
               var18.append("#W使用");
               var18.append(var5);
               var10000 = var4;
            }

            if (var10000 != 0) {
               var18.append("#G(额外指令)");
            }

            this.e(var7.x, var18.toString());
         }
      }
   }

   public int getBattleType() {
      return this.battleType;
   }

   public iO getHandleUnit(long var1) {
      iO var3 = null;
      Iterator var5;
      Iterator var10000 = var5 = this.battleUnitList.iterator();

      while(true) {
         while(var10000.hasNext()) {
            iO var4;
            if ((var4 = (iO)var5.next()).h()) {
               var10000 = var5;
            } else {
               BattleMan var6;
               if ((var6 = var4.bt()).getType() == 0 && (long)var6.getId() == var1) {
                  return var4;
               }

               if (var6.getType() == (4 ^ 5) && (long)var6.getCampId() == var1 && (var3 == null || var6.getId() > var3.bt().getId())) {
                  var3 = var4;
               }

               var10000 = var5;
            }
         }

         return var3;
      }
   }

   public BattleScene() {
      BattleScene var10000;
      int var1;
      if ((var1 = W.c.nextInt(61 & 79)) != 0 && var1 != 5 >> 2) {
         if (var1 >= 5 >> 1 && var1 <= (39 & 94)) {
            var10000 = this;
            this.music = "m" + ((5 >> 1) + var1) + ".mp3";
         } else if (var1 >= (119 & 15) && var1 <= (108 & 31)) {
            var10000 = this;
            this.music = "m" + (--3 + var1) + ".mp3";
         } else {
            var10000 = this;
            this.music = "m1.mp3";
         }
      } else {
         var10000 = this;
         this.music = "m" + (--1 + var1) + ".mp3";
      }

      var10000.buffUtil = new BattleBuffUtil(this);
      Image[] var10001 = new Image[79 & 63];
      boolean var10003 = true;
      this.images = var10001;
      this.controlTime = ev.l();
   }

   public iO d(int var1, int var2) {
      Iterator var3;
      Iterator var10000 = var3 = this.battleUnitList.iterator();

      while(var10000.hasNext()) {
         iO var4;
         if ((var4 = (iO)var3.next()).bt().getCamp() != var1) {
            var10000 = var3;
         } else {
            if (var4.bt().getMan() == var2) {
               var3.remove();
               return var4;
            }

            var10000 = var3;
         }
      }

      return null;
   }

   public void e(int var1, String var2) {
      if (!hd.o(var2)) {
         Iterator var3;
         Iterator var10000 = var3 = this.controlList.iterator();

         while(true) {
            while(var10000.hasNext()) {
               BattleControl var4 = (BattleControl)var3.next();
               if (var1 != -4 >> 2 && var1 != var4.battleCamp) {
                  var10000 = var3;
               } else if (!var4.gameView.getClient().gameText) {
                  var10000 = var3;
               } else {
                  var4.gameView.chatBox.addChat(127 & 10, var2);
                  var10000 = var3;
               }
            }

            return;
         }
      }
   }

   public void f(int var1) {
      synchronized(this) {
         if (var1 > this.battleRound) {
            if (this.battleState != --1) {
               long var3 = 25L;
               BattleScene var10000 = this;

               while(var10000.battleState == 5 >> 1) {
                  var10000 = this;
                  this.ad(var3);
               }

               int var10002 = 4 ^ 5;
               this.battleRound = var1;
               this.rountString = "第 " + this.battleRound + " 回 合";
               this.s(var10002, ev.f());
            }
         }
      }
   }

   public int getBattleRound() {
      return this.battleRound;
   }

   public void g(StringBuffer var1, iO var2, String var3) {
      var1.append(var3);
      iO var4;
      if (var2.bt().getType() == 5 >> 2 && (var4 = this.getBattleUnit(5 >> 3, (long)var2.bt().getCampId())) != null) {
         var1.append(var4.aw());
         var1.append("#W的");
         var1.append(var3);
      }

      var1.append(var2.aw());
   }

   public int getBattleState() {
      return this.battleState;
   }

   public void h(String var1) {
      this.battleTip = (boolean)(hd.o(var1) ? 2 & 5 : 1);
      int var10002 = 3 >> 2;
      int var10004 = 5 >> 3;
      int var10008 = 3 ^ 3;
      int var10010 = 3 ^ 3;
      this.battleRoundMax = 126 & 121;
      this.campName1 = null;
      this.campPetDie1 = var10010;
      this.campLingDie1 = var10008;
      this.campName2 = null;
      this.campPetDie2 = var10004;
      this.campLingDie2 = var10002;
      if (this.battleTip) {
         int var4 = 3 & 4;
         int var3 = 3 & 4;

         int var2;
         for(int var10000 = var2 = 3 >> 2; var10000 < var1.length(); var10000 = var2) {
            if ((var2 = var1.indexOf("|", var3 + (2 ^ 3))) == -4 >> 2) {
               var2 = var1.length();
            }

            if (var4 == 0) {
               var10000 = var2;
               this.battleRoundMax = hd.b(var1, var3, var2);
            } else if (var4 == --1) {
               var10000 = var2;
               this.campName1 = var1.substring(var3, var2);
            } else if (var4 == (1 ^ 3)) {
               var10000 = var2;
               this.campName2 = var1.substring(var3, var2);
            } else {
               int var5;
               if (var4 == --3) {
                  var5 = var1.indexOf(",", var3 + --1);
                  this.campPetDie1 = hd.b(var1, var3, var5);
                  this.campLingDie1 = hd.b(var1, var5 + (5 >> 2), var2);
                  var10000 = var2;
               } else {
                  if (var4 == --3) {
                     var5 = var1.indexOf(",", var3 + --1);
                     this.campPetDie2 = hd.b(var1, var3, var5);
                     this.campLingDie2 = hd.b(var1, var5 + (4 ^ 5), var2);
                  }

                  var10000 = var2;
               }
            }

            ++var4;
            var3 = var10000 + 1;
         }
      }

   }

   public void i(Graphics var1) {
      Graphics2D var7;
      Graphics2D var10000 = var7 = (Graphics2D)var1;
      Object var6 = var10000.getRenderingHint(RenderingHints.KEY_RENDERING);
      Object var3 = var10000.getRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING);
      Object var4 = var10000.getRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS);
      Object var5 = var10000.getRenderingHint(RenderingHints.KEY_STROKE_CONTROL);
      Object var2 = var10000.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
      Object var8;
      if (var6 != RenderingHints.VALUE_RENDER_QUALITY) {
         var8 = var3;
         var7.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      } else {
         var6 = null;
         var8 = var3;
      }

      if (var8 != RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB) {
         var8 = var4;
         var7.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
      } else {
         var3 = null;
         var8 = var4;
      }

      if (var8 != RenderingHints.VALUE_FRACTIONALMETRICS_ON) {
         var8 = var5;
         var7.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
      } else {
         var4 = null;
         var8 = var5;
      }

      if (var8 != RenderingHints.VALUE_STROKE_DEFAULT) {
         var8 = var2;
         var7.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
      } else {
         var5 = null;
         var8 = var2;
      }

      if (var8 != RenderingHints.VALUE_ANTIALIAS_ON) {
         var10000 = var7;
         var7.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      } else {
         var2 = null;
         var10000 = var7;
      }

      var10000.setFont(lz.av);
      var7.setColor(Color.yellow);
      var7.drawString(this.rountString, --5, 126 & 83);
      if (var6 != null) {
         var7.setRenderingHint(RenderingHints.KEY_RENDERING, var6);
      }

      if (var3 != null) {
         var7.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var3);
      }

      if (var4 != null) {
         var7.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, var4);
      }

      if (var5 != null) {
         var7.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, var5);
      }

      if (var2 != null) {
         var7.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var2);
      }

   }

   public void j(Graphics var1, BattleControl var2) {
      int var3 = var2.battleCamp == -4 >> 2 ? --1 : var2.battleCamp;
      iO var4 = null;
      this.showUnitList.clear();
      double var5 = (double)var2.gameView.screenData.Screen_x / 1024.0D;
      double var7 = (double)var2.gameView.screenData.Screen_y / 728.0D;
      int var9 = Math.max(3 ^ 3, (var2.gameView.screenData.Screen_x - (5159 & 28632)) / (1 ^ 3));
      int var10 = Math.max(3 >> 2, (var2.gameView.screenData.Screen_y - (31743 & 1752)) / (5 >> 1) + (63 & 79));
      int var11 = var2.gameView.getMousePoint().x;
      int var12 = var2.gameView.getMousePoint().y;

      Iterator var14;
      for(Iterator var10000 = var14 = this.battleUnitList.iterator(); var10000.hasNext(); var10000 = var14) {
         iO var13 = (iO)var14.next();
         var13.cd(var5, var7, var9, var10, var3);
         if ((var4 == null || var4.al < var13.al) && var13.bt().getType() != --3 && var13.bt().getType() != --4 && var13.bt().getType() != (11255 & 22511) && var13.c(var11, var12)) {
            var4 = var13;
         }

         this.showUnitList.add(var13);
      }

      iy.a(this.showUnitList, 3 & 4, this.showUnitList.size() - --1);
      var2.setXZUnit(var4);
      if (this.images[111 & 27] == null) {
         BattleScene var19;
         label532: {
            if (var2.gameView.getClient().n(1 ^ 3, 91 & 47)) {
               label530: {
                  if (this.battleMapId != 1207L && this.battleMapId != 1236L && this.battleMapId != 1237L && this.battleMapId != 1238L && this.battleMapId != 1243L && (this.battleMapId < 1246L || this.battleMapId > 1250L) && (this.battleMapId < 1297L || this.battleMapId > 1300L) && this.battleMapId != 3000L) {
                     if (this.battleMapId == 1228L || this.battleMapId == 1229L || this.battleMapId == 1277L || this.battleMapId >= 3360L && this.battleMapId <= 3363L || this.battleMapId == 40001L || this.battleMapId == 40002L) {
                        var19 = this;
                        this.images[107 & 31] = ho.i(String.valueOf(31 & 115));
                        break label532;
                     }

                     if (this.battleMapId >= 1230L && this.battleMapId <= 1234L) {
                        var19 = this;
                        this.images[47 & 91] = ho.i(String.valueOf(25 & 119));
                        break label532;
                     }

                     if (this.battleMapId == 3304L || this.battleMapId == 3305L || this.battleMapId == 3318L) {
                        var19 = this;
                        this.images[111 & 27] = ho.i(String.valueOf(54 & 91));
                        break label532;
                     }

                     if (this.battleMapId != 1244L && this.battleMapId != 1245L && this.battleMapId != 1272L && this.battleMapId != 3156L && this.battleMapId != 3161L && this.battleMapId != 3180L && this.battleMapId != 3190L) {
                        if (this.battleMapId != 3011L && this.battleMapId != 3203L) {
                           if (this.battleMapId != 1254L && this.battleMapId != 1255L && this.battleMapId != 1256L && (this.battleMapId < 1282L || this.battleMapId > 1288L) && this.battleMapId != 3323L && this.battleMapId != 3325L && this.battleMapId != 3326L && this.battleMapId != 40003L) {
                              if (this.battleMapId >= 1257L && this.battleMapId <= 1266L || this.battleMapId >= 1289L && this.battleMapId <= 1295L || this.battleMapId == 3324L || this.battleMapId == 3327L || this.battleMapId == 3328L) {
                                 var19 = this;
                                 this.images[11] = ho.i(String.valueOf(14));
                                 break label532;
                              }

                              if (this.battleMapId == 1176L || this.battleMapId == 1267L || this.battleMapId == 1296L) {
                                 var19 = this;
                                 this.images[11] = ho.i(String.valueOf(12));
                                 break label532;
                              }

                              if (this.battleMapId != 1278L && this.battleMapId != 1279L && this.battleMapId != 1280L && this.battleMapId != 3015L && this.battleMapId != 3205L && (this.battleMapId < 3208L || this.battleMapId > 3211L) && this.battleMapId != 3301L && this.battleMapId != 3302L && this.battleMapId != 3303L) {
                                 if (this.battleMapId == 1210L) {
                                    this.images[11] = ho.i(String.valueOf(20));
                                    var19 = this;
                                    break label532;
                                 }

                                 if (this.battleMapId != 3012L && this.battleMapId != 3013L && this.battleMapId != 3014L && this.battleMapId != 40007L) {
                                    if (this.battleMapId != 3316L && this.battleMapId != 3317L) {
                                       if (this.battleMapId == 1214L || this.battleMapId == 1215L || this.battleMapId == 1216L) {
                                          var19 = this;
                                          this.images[11] = ho.i(String.valueOf(24));
                                          break label532;
                                       }

                                       if (this.battleMapId == 1211L || this.battleMapId == 1227L || this.battleMapId >= 1268L && this.battleMapId <= 1271L || this.battleMapId >= 1273L && this.battleMapId <= 1276L || this.battleMapId == 1281L) {
                                          var19 = this;
                                          this.images[11] = ho.i(String.valueOf(25));
                                          break label532;
                                       }

                                       if (this.battleMapId == 3202L || this.battleMapId == 3334L || this.battleMapId == 3335L || this.battleMapId == 3336L) {
                                          var19 = this;
                                          this.images[11] = ho.i(String.valueOf(26));
                                          break label532;
                                       }

                                       if (this.battleMapId != 1860L && this.battleMapId != 3312L && this.battleMapId != 3313L && this.battleMapId != 3314L && this.battleMapId != 3373L) {
                                          if (this.battleMapId != 3204L && (this.battleMapId < 3329L || this.battleMapId > 3333L) && this.battleMapId != 3353L && this.battleMapId != 3354L && this.battleMapId != 3355L) {
                                             if (this.battleMapId == 1950L || this.battleMapId == 3010L || this.battleMapId == 3315L || this.battleMapId == 3320L || this.battleMapId == 3356L || this.battleMapId == 3365L || this.battleMapId >= 40008L && this.battleMapId <= 40012L) {
                                                var19 = this;
                                                this.images[11] = ho.i(String.valueOf(--3));
                                                break label532;
                                             }

                                             if (this.battleMapId != 1241L && this.battleMapId != 3016L && this.battleMapId != 3017L && this.battleMapId != 3201L && this.battleMapId != 3319L && this.battleMapId != 3321L && this.battleMapId != 3322L) {
                                                if (this.battleMapId != 1240L && this.battleMapId != 3155L && this.battleMapId != 3352L) {
                                                   if (this.battleMapId == 1193L) {
                                                      this.images[11] = ho.i(String.valueOf(10));
                                                      var19 = this;
                                                      break label532;
                                                   }

                                                   if (this.battleMapId >= 1221L && this.battleMapId <= 1226L || this.battleMapId == 3306L || this.battleMapId == 3311L || this.battleMapId >= 3338L && this.battleMapId <= 3351L) {
                                                      var19 = this;
                                                      this.images[11] = ho.i(String.valueOf(7));
                                                      break label532;
                                                   }

                                                   if (this.battleMapId != 1136L && this.battleMapId != 1208L && this.battleMapId != 3307L) {
                                                      if (this.battleMapId == 3308L || this.battleMapId == 3309L || this.battleMapId == 3310L || this.battleMapId == 3337L) {
                                                         var19 = this;
                                                         this.images[11] = ho.i(String.valueOf(--4));
                                                         break label532;
                                                      }

                                                      if (this.battleMapId == 1242L || this.battleMapId == 3364L) {
                                                         var19 = this;
                                                         this.images[11] = ho.i(String.valueOf(9));
                                                         break label532;
                                                      }

                                                      if (this.battleMapId != 1213L && this.battleMapId != 1251L && this.battleMapId != 1252L && this.battleMapId != 1253L && this.battleMapId != 40004L && this.battleMapId != 40005L && this.battleMapId != 40006L) {
                                                         this.images[11] = ho.i(String.valueOf(1L + this.battleId / 100000L % 28L));
                                                         break label530;
                                                      }

                                                      var19 = this;
                                                      this.images[11] = ho.i(String.valueOf(8));
                                                      break label532;
                                                   }

                                                   var19 = this;
                                                   this.images[11] = ho.i(String.valueOf(6));
                                                   break label532;
                                                }

                                                var19 = this;
                                                this.images[11] = ho.i(String.valueOf(--1));
                                                break label532;
                                             }

                                             var19 = this;
                                             this.images[11] = ho.i(String.valueOf(5 >> 1));
                                             break label532;
                                          }

                                          var19 = this;
                                          this.images[11] = ho.i(String.valueOf(28));
                                          break label532;
                                       }

                                       var19 = this;
                                       this.images[11] = ho.i(String.valueOf(27));
                                       break label532;
                                    }

                                    var19 = this;
                                    this.images[11] = ho.i(String.valueOf(23));
                                    break label532;
                                 }

                                 var19 = this;
                                 this.images[11] = ho.i(String.valueOf(22));
                                 break label532;
                              }

                              var19 = this;
                              this.images[11] = ho.i(String.valueOf(21));
                              break label532;
                           }

                           var19 = this;
                           this.images[11] = ho.i(String.valueOf(13));
                           break label532;
                        }

                        var19 = this;
                        this.images[47 & 91] = ho.i(String.valueOf(16));
                        break label532;
                     }

                     var19 = this;
                     this.images[31 & 107] = ho.i(String.valueOf(111 & 31));
                     break label532;
                  }

                  var19 = this;
                  this.images[31 & 107] = ho.i(String.valueOf(--5));
                  break label532;
               }
            }

            var19 = this;
         }

         if (var19.images[11] == null || this.images[11] == ho.p()) {
            long var16 = this.battleId / 100000L % 5L + 1L;
            this.images[11] = ho.i(String.valueOf(var16));
         }
      }

      var1.drawImage(this.images[11], 3 >> 2, 3 >> 2, var2.gameView.screenData.Screen_x, var2.gameView.screenData.Screen_y, (ImageObserver)null);
      int var10001 = 5 >> 3;
      this.buffUtil.e(var1, var3, var2);
      int var17 = var10001;

      int var21;
      iO var22;
      for(var21 = var17; var21 < this.showUnitList.size(); var21 = var17) {
         var22 = (iO)this.showUnitList.get(var17);
         ++var17;
         var22.cg(var1, var3, var4, var2);
      }

      for(var21 = var17 = 5 >> 3; var21 < this.showSkillList.size(); var21 = var17) {
         BattleSkillShow var23 = (BattleSkillShow)this.showSkillList.get(var17);
         ++var17;
         var23.b(var1, var3, var2);
      }

      for(var21 = var17 = 2 & 5; var21 < this.showUnitList.size(); var21 = var17) {
         var22 = (iO)this.showUnitList.get(var17);
         ++var17;
         var22.cc(var1, var3);
      }

      this.buffUtil.d(var1, var3, var2);
      this.i(var1);
      if (var2.battleCamp != -4 >> 2) {
         var1.setFont(lz.ca);
         var1.setColor(Color.yellow);
         if (this.images[12] == null) {
            this.images[12] = ho.a("sc/map/yq.png");
         }

         if (this.images[13] == null) {
            this.images[13] = ho.a("sc/map/nq.png");
         }

         if (this.images[14] == null) {
            this.images[14] = ho.a("sc/map/xy.png");
         }

         var17 = var2.gameView.screenData.Screen_x / (1 ^ 3) - 80;
         var1.drawImage(this.images[12], var17, --5, (ImageObserver)null);
         var1.drawString(var2.yqz, var17 + 40, 26);
         var17 += 80;
         var1.drawImage(this.images[13], var17, --5, (ImageObserver)null);
         var1.drawString(var2.nqz, var17 + 40, 26);
         var17 += 80;
         var1.drawImage(this.images[14], var17, --5, (ImageObserver)null);
         var1.drawString(var2.xyz, var17 + 40, 26);
      }

      if (this.battleState == (4 ^ 5)) {
         if (var2.getHandleUnit() == null) {
            if (this.images[10] == null) {
               this.images[10] = ho.a("sc/b/F10.png");
            }

            var1.drawImage(this.images[10], (var2.gameView.screenData.Screen_x - this.images[10].getWidth((ImageObserver)null)) / (1 ^ 3), 62, (ImageObserver)null);
            return;
         }

         if (this.countdown >= 0L) {
            var17 = var2.gameView.screenData.Screen_x / 2 + 38;
            byte var18 = 62;
            int var15;
            var21 = var15 = (int)this.countdown;

            while(true) {
               var3 = var21 % 10;
               if (this.images[var3] == null) {
                  this.images[var3] = ho.a("sc/b/F" + var3 + ".png");
               }

               Image var20 = this.images[var3];
               int var10002 = var17;
               var17 -= 38;
               var1.drawImage(var20, var10002, var18, (ImageObserver)null);
               if (var15 < 10) {
                  return;
               }

               var21 = var15 /= 10;
            }
         }
      }

   }

   public iO getPetUnit(long var1) {
      Iterator var3;
      for(Iterator var10000 = var3 = this.battleUnitList.iterator(); var10000.hasNext(); var10000 = var3) {
         iO var4;
         BattleMan var5;
         if ((var5 = (var4 = (iO)var3.next()).bt()).getType() == (3 & 5) && (long)var5.getCampId() == var1) {
            return var4;
         }
      }

      return null;
   }

   public void k(int var1, int var2, BigDecimal var3) {
      iO var6;
      if ((var6 = this.getBattleUnitByCampMan(var1, var2)) != null && var6.bt().getType() == 0) {
         Iterator var4;
         for(Iterator var10000 = var4 = this.controlList.iterator(); var10000.hasNext(); var10000 = var4) {
            BattleControl var7;
            if ((var7 = (BattleControl)var4.next()).getRoleId() == (long)var6.bt().getId()) {
               GameView var8;
               if ((var8 = var7.gameView).roleData.pets.size() >= (63 & 85)) {
                  var8.f("您的召唤兽可携带的数量已满！！！");
                  return;
               }

               SummonPetBean var5 = new SummonPetBean();
               var5.setPetid(var3);
               String var9 = Agreement.getSendTextAES("summonpet", mi.b().toJson(var5));
               var8.getClient().d(var9);
               var8.chatBox.addChat(--5, "#T#Y获得您成功捕获了召唤兽");
               return;
            }
         }

      }
   }

   public iO getBattleUnitByCampMan(int var1, int var2) {
      Iterator var3;
      Iterator var10000 = var3 = this.battleUnitList.iterator();

      while(var10000.hasNext()) {
         iO var4;
         BattleMan var5;
         if ((var5 = (var4 = (iO)var3.next()).bt()).getCamp() == var1) {
            if (var5.getMan() == var2) {
               return var4;
            }

            var10000 = var3;
         } else {
            var10000 = var3;
         }
      }

      return null;
   }

   public void l(BattleVideo var1) {
      if (this.battleUnitList == null) {
         this.battleUnitList = new LinkedList();
      }

      if (this.battlePlayMap == null) {
         this.battlePlayMap = new HashMap();
      }

      this.battleRound = var1.getRound();
      this.rountString = "第 " + this.battleRound + " 回 合";
      this.h(var1.getTip());

      int var10001;
      int var2;
      for(int var10000 = var2 = 2 & 5; var10000 < var1.getLists().size(); var10000 = var2) {
         BattlePlay var3;
         (var3 = new BattlePlay(0L, this.battleRound + var2)).setRound((List)var1.getLists().get(var2));
         var10001 = this.battleRound + var2;
         ++var2;
         this.battlePlayMap.put(var10001, var3);
      }

      this.buffUtil.c(var1.getBuff());
      this.battleUnitList.clear();
      Iterator var4;
      Iterator var6 = var4 = var1.getDatas().iterator();

      while(var6.hasNext()) {
         BattleMan var5 = (BattleMan)var4.next();
         var6 = var4;
         this.r(var5);
      }

      var10001 = 1 ^ 3;
      this.video = (boolean)(2 ^ 3);
      this.s(var10001, 0L);
   }

   public void m() {
      synchronized(this) {
         this.controlTime = ev.l();

         Iterator var2;
         for(Iterator var10000 = var2 = this.controlList.iterator(); var10000.hasNext(); var10000 = var2) {
            ((BattleControl)var2.next()).setBattle(5 >> 3, (BattleScene)null);
         }

         this.controlList.clear();
      }
   }

   public boolean n() {
      return (boolean)(this.controlList.size() == 0 && ev.l() - this.controlTime >= 3333L ? 4 ^ 5 : 0);
   }

   public void o(GameView var1) {
      if (var1.roleUnit.ad() != null) {
         if (var1.roleUnit.r.getTroop_id() != null) {
            String var2 = Agreement.getSendTextAES("team5", "D");
            var1.getClient().d(var2);
            var1.getFormManagement().n(45 & 95);
         }
      }
   }

   public void p(iO var1) {
      if (var1 != null) {
         this.battleUnitList.add(var1);
      }
   }

   public int getOtherCamp(int var1) {
      Iterator var2;
      for(Iterator var10000 = var2 = this.battleUnitList.iterator(); var10000.hasNext(); var10000 = var2) {
         BattleMan var3;
         if ((var3 = ((iO)var2.next()).bt()).getCamp() != var1) {
            return var3.getCamp();
         }
      }

      return -4 >> 2;
   }

   public boolean q() {
      return this.battleType != --5 && this.battleType != (59 & 79) && this.battleType != (108 & 31) && this.battleType != (95 & 63) && this.battleType != (41 & 119) && this.battleType != (99 & 62);
   }

   public iO r(BattleMan var1) {
      if (var1 == null) {
         return null;
      } else {
         synchronized(this) {
            Iterator var3;
            Iterator var10000 = var3 = this.battleUnitList.iterator();

            while(var10000.hasNext()) {
               iO var4;
               if ((var4 = (iO)var3.next()).bt().getCamp() != var1.getCamp()) {
                  var10000 = var3;
               } else if (var4.bt().getMan() != var1.getMan()) {
                  var10000 = var3;
               } else {
                  var10000 = var3;
                  var3.remove();
               }
            }

            iO var6 = new iO(var1, this);
            this.battleUnitList.add(var6);
            return var6;
         }
      }
   }

   public void s(int var1, long var2) {
      this.battleState = var1;
      this.time = var2;
      Iterator var10000;
      BattleControl var4;
      Iterator var5;
      if (this.battleState == (3 & 5)) {
         this.b();

         for(var10000 = var5 = this.controlList.iterator(); var10000.hasNext(); var10000 = var5) {
            BattleControl var6 = var4 = (BattleControl)var5.next();
            var6.m();
            var6.gameView.getBaseView().kn().r((boolean)(var4.battleCamp != -4 >> 2 ? --1 : 0));
         }

      } else if (this.battleState == (1 ^ 3)) {
         this.e(-4 >> 2, "#F*****第#Y " + this.battleRound + " #W回合战斗指令结束*****");
         var10000 = var5 = this.controlList.iterator();

         while(var10000.hasNext()) {
            var4 = (BattleControl)var5.next();
            var10000 = var5;
            var4.t();
            var4.gameView.getBaseView().kn().r((boolean)(3 ^ 3));
         }

      } else {
         if (this.battleState == --3) {
            this.af();
            if (this.video) {
               this.battleRound += 2 ^ 3;
               this.rountString = "第 " + this.battleRound + " 回 合";
               if ((BattlePlay)this.battlePlayMap.get(this.battleRound) != null) {
                  this.s(--2, 0L);
                  return;
               }

               this.m();
               return;
            }

            var10000 = var5 = this.controlList.iterator();

            while(var10000.hasNext()) {
               var4 = (BattleControl)var5.next();
               var10000 = var5;
               var4.r(this.battleRound);
            }
         }

      }
   }

   public void t(iO var1) {
      BattleMan var2;
      long var3;
      if ((var3 = (long)((var2 = var1.bt()).getType() == 0 ? var1.bt().getId() : (var2.getType() == (4 ^ 5) ? var2.getCampId() : 0))) != 0L) {
         Iterator var6;
         for(Iterator var10000 = var6 = this.controlList.iterator(); var10000.hasNext(); var10000 = var6) {
            BattleControl var5;
            if ((var5 = (BattleControl)var6.next()).getRoleId() == var3) {
               var5.m();
               return;
            }
         }

      }
   }

   public boolean u(iO var1) {
      if (var1.bt().getHp_Current() > 0) {
         return (boolean)(3 & 4);
      } else {
         long var2 = (long)var1.bt().getId();

         Iterator var5;
         for(Iterator var10000 = var5 = this.battleUnitList.iterator(); var10000.hasNext(); var10000 = var5) {
            BattleMan var4;
            if ((var4 = ((iO)var5.next()).bt()).getType() == 5 >> 2 && (long)var4.getCampId() == var2 && var4.getHp_Current() > 0) {
               return (boolean)(3 >> 2);
            }
         }

         return (boolean)(2 ^ 3);
      }
   }

   public void v(String var1) {
      if (!hd.o(var1)) {
         Iterator var2;
         for(Iterator var10000 = var2 = this.controlList.iterator(); var10000.hasNext(); var10000 = var2) {
            ((BattleControl)var2.next()).gameView.chatBox.addChat(3 >> 2, var1);
         }

      }
   }

   public String getMusic() {
      return this.music;
   }

   public iO getBattleUnit(int var1, long var2) {
      Iterator var5;
      Iterator var10000 = var5 = this.battleUnitList.iterator();

      while(var10000.hasNext()) {
         iO var4;
         if ((var4 = (iO)var5.next()).bt().getType() != var1) {
            var10000 = var5;
         } else {
            if ((long)var4.bt().getId() == var2) {
               return var4;
            }

            var10000 = var5;
         }
      }

      return null;
   }

   public void w(int var1, BattleMan var2) {
      if (var2.getType() == --3) {
         iO var4;
         if ((var4 = this.getBattleUnitByCampMan(var2.getCamp(), var2.getMan() - (122 & 15))) != null) {
            Iterator var5;
            for(Iterator var10000 = var5 = this.controlList.iterator(); var10000.hasNext(); var10000 = var5) {
               BattleControl var3;
               if ((var3 = (BattleControl)var5.next()).getRoleId() == (long)var4.bt().getId()) {
                  GameView var7 = var3.gameView;
                  Lingbao var6 = var1 == 0 ? var7.roleData.getLingbao(new BigDecimal(var2.getId())) : null;
                  var7.baseView.kq().bq(var1 == 0 && var6 != null ? var6 : null);
                  return;
               }
            }

         }
      }
   }

   public void x(int var1, BattleMan var2) {
      if (var2.getType() == (4 ^ 5)) {
         Iterator var4;
         for(Iterator var10000 = var4 = this.controlList.iterator(); var10000.hasNext(); var10000 = var4) {
            BattleControl var3;
            if ((var3 = (BattleControl)var4.next()).getRoleId() == (long)var2.getCampId()) {
               GameView var7 = var3.gameView;
               RolePet var5 = var1 == 0 ? var7.roleData.getRolePet((long)var2.getId()) : null;
               fR var6;
               if (var5 != null && (var6 = (fR)var7.getFormManagement().e(79 & 54)) != null) {
                  var6.w(var5);
               }

               var7.baseView.kw().bq(var5 != null ? var5.getPet() : null);
               return;
            }
         }

      }
   }

   public void y(String var1) {
      if (!hd.o(var1)) {
         if (!hd.r(var1, this.musicNow)) {
            this.musicNow = var1;

            Iterator var2;
            for(Iterator var10000 = var2 = this.controlList.iterator(); var10000.hasNext(); var10000 = var2) {
               ((BattleControl)var2.next()).gameView.abh((boolean)(3 & 4), var1 + ".mp3");
            }

         }
      }
   }

   public void z(BattleControl var1) {
      synchronized(this) {
         if (!this.controlList.contains(var1)) {
            iO var3 = !this.video ? this.getBattleUnit(3 >> 2, var1.getRoleId()) : null;
            int var10001;
            BattleScene var10002;
            if (var3 != null) {
               var10001 = var3.bt().getCamp();
               var10002 = this;
            } else {
               var10001 = -1;
               var10002 = this;
            }

            var1.setBattle(var10001, var10002);
            this.controlList.add(var1);
            this.controlTime = ev.l();
            if (this.battleState == --3) {
               var1.r(this.battleRound);
            }

         }
      }
   }

   public void aa(iO var1) {
      BattleMan var2;
      long var3;
      if ((var3 = (long)((var2 = var1.bt()).getType() == 0 ? var1.bt().getId() : (var2.getType() == --1 ? var2.getCampId() : 0))) != 0L) {
         Iterator var5;
         for(Iterator var10000 = var5 = this.controlList.iterator(); var10000.hasNext(); var10000 = var5) {
            BattleControl var7;
            if ((var7 = (BattleControl)var5.next()).getRoleId() == var3) {
               GameView var6 = var7.gameView;
               if (var2.getType() == 0) {
                  var7.yqz = String.valueOf(var2.getYqz());
                  var7.nqz = String.valueOf(var2.getNqz());
                  var7.xyz = String.valueOf(var2.getXyz());
                  if (this.q()) {
                     var6.roleData.getLoginResult().setHp(new BigDecimal(var2.getHp_Current()));
                     var6.roleData.getLoginResult().setMp(new BigDecimal(var2.getMp_Current()));
                  }

                  var6.baseView.kr(2 & 5, (double)var2.getHp_Current() / (double)var2.getHp_Total());
                  var6.baseView.kr(--1, (double)var2.getMp_Current() / (double)var2.getMp_Total());
                  return;
               }

               if (var2.getType() == (4 ^ 5)) {
                  var6.baseView.kz(3 >> 2, (double)var2.getHp_Current() / (double)var2.getHp_Total());
                  var6.baseView.kz(3 & 5, (double)var2.getMp_Current() / (double)var2.getMp_Total());
               }

               return;
            }
         }

      }
   }

   public void ab(iO var1) {
      if (var1.bt().getType() == 0) {
         Iterator var3;
         for(Iterator var10000 = var3 = this.controlList.iterator(); var10000.hasNext(); var10000 = var3) {
            BattleControl var2;
            if ((var2 = (BattleControl)var3.next()).getRoleId() == (long)var1.bt().getId()) {
               var2.g(var1.bt().g("技能"));
               return;
            }
         }

      }
   }

   public void setHandleUnit(long var1, int var3, boolean var4) {
      iO var5 = null;
      Iterator var7;
      Iterator var10000 = var7 = this.battleUnitList.iterator();

      iO var9;
      while(true) {
         if (!var10000.hasNext()) {
            var9 = var5;
            break;
         }

         iO var6;
         BattleMan var8;
         if ((var8 = (var6 = (iO)var7.next()).bt()).getType() != var3) {
            var10000 = var7;
         } else {
            if (var8.getType() == 0 && (long)var8.getId() == var1) {
               var9 = var5 = var6;
               break;
            }

            if (var8.getType() == --1 && (long)var8.getCampId() == var1 && (var5 == null || var8.getId() > var5.bt().getId())) {
               var5 = var6;
            }

            var10000 = var7;
         }
      }

      if (var9 != null) {
         var5.i(var4);
      }

   }

   public void ac(BattleConnection var1) {
      BattleScene var2 = this;
      synchronized(this) {
         if (this.battleRound != var1.getRound() || this.battleState != var1.getState()) {
            if (this.battleUnitList == null) {
               this.battleUnitList = new LinkedList();
            }

            if (this.battlePlayMap == null) {
               this.battlePlayMap = new HashMap();
            }

            this.battleId = (long)var1.getFightingNumber();
            this.battleRound = var1.getRound();
            this.rountString = "第 " + this.battleRound + " 回 合";
            this.h(var1.tip);
            if (var1.getPlayeEvents() != null) {
               this.battlePlayMap.put(this.battleRound, var1.getPlay());
            }

            this.buffUtil.c(var1.getBuff());
            this.battleUnitList.clear();
            Iterator var4;
            Iterator var10000 = var4 = var1.getDatas().iterator();

            while(var10000.hasNext()) {
               BattleMan var3 = (BattleMan)var4.next();
               var10000 = var4;
               this.r(var3);
            }

            BattleScene var9;
            if (var1.getState() == 0) {
               var9 = var2;
               this.s(3 >> 1, ev.f() - var1.getTime());
            } else if (var1.getState() == --1) {
               var9 = var2;
               this.s(3 & 5, ev.f() - var1.getTime());
            } else if (var1.getState() == 5 >> 1) {
               this.s(5 >> 1, ev.f() - var1.getTime());
               long var8 = var1.getTime();
               long var5 = 25L;
               long var10 = var8;

               while(var10 > 0L) {
                  var10 = var8 -= var5;
                  this.ad(var5);
               }

               var9 = var2;
            } else {
               if (var1.getState() == --3) {
                  this.s(--3, ev.f() - var1.getTime());
               }

               var9 = var2;
            }

         }
      }
   }

   public void ad(long var1) {
      BattleScene var8 = this;
      synchronized(this) {
         Iterator var5;
         Iterator var10000 = var5 = this.battleUnitList.iterator();

         while(var10000.hasNext()) {
            iO var4 = (iO)var5.next();
            var10000 = var5;
            var4.bu(var1);
         }

         int var15;
         int var22;
         for(var22 = var15 = this.showSkillList.size() - (3 >> 1); var22 >= 0; var22 = var15) {
            if (((BattleSkillShow)this.showSkillList.get(var15)).a(var1)) {
               this.showSkillList.remove(var15);
            }

            --var15;
         }

         BattleScene var23;
         label143: {
            if (this.battleState == (4 ^ 5)) {
               long var16 = ev.f();
               long var6;
               if ((var6 = 50L - (var16 - this.time) / 1000L) < 0L) {
                  var6 = 0L;
               }

               if (this.countdown != var6) {
                  this.countdown = var6;
                  if (this.countdown < 47L) {
                     Iterator var9;
                     var10000 = var9 = this.controlList.iterator();

                     while(var10000.hasNext()) {
                        BattleControl var3 = (BattleControl)var9.next();
                        var10000 = var9;
                        var3.p(this.countdown);
                     }

                     var23 = var8;
                     break label143;
                  }
               }
            } else if (this.battleState == 5 >> 1) {
               BattlePlay var17;
               if ((var17 = (BattlePlay)this.battlePlayMap.get(this.battleRound)) == null) {
                  this.s(--3, ev.f());
                  return;
               }

               int var18 = 1;
               if (var17.a()) {
                  List var19;
                  if ((var19 = var17.getState()) == null) {
                     var17.setState(var19 = BattleHandle.a(var17.getEvents(), var17.getProgress(), this));
                  }

                  label134: {
                     try {
                        int var7;
                        for(var22 = var7 = var19.size() - (5 >> 2); var22 >= 0; var22 = var7) {
                           BattlePlayProgress var13;
                           if (!(var13 = (BattlePlayProgress)var19.get(var7)).a(var1) && var13.getBattleUnit().ch(var13)) {
                              var18 = 2 & 5;
                           }

                           --var7;
                        }

                        for(var22 = var7 = this.showSkillList.size() - (2 ^ 3); var22 >= 0; var22 = var7) {
                           if (((BattleSkillShow)this.showSkillList.get(var7)).getShadowMode() != null) {
                              var22 = var18 = 3 & 4;
                              break label134;
                           }

                           --var7;
                        }
                     } catch (Exception var10) {
                        var22 = var18;
                        var10.printStackTrace();
                        break label134;
                     }

                     var22 = var18;
                  }

                  if (var22 != 0) {
                     var17.setProgress(var17.getProgress() + --1);
                     var17.setState((List)null);
                     this.musicNow = null;
                     ArrayList var20 = null;

                     int var14;
                     for(var22 = var14 = var19.size() - (2 ^ 3); var22 >= 0; var22 = var14) {
                        BattlePlayProgress var21;
                        iO var12 = (var21 = (BattlePlayProgress)var19.get(var14)).getEscape() == 5 >> 2 ? var21.getBattleUnit() : null;
                        if (var12 != null) {
                           if (var20 == null) {
                              var20 = new ArrayList();
                           }

                           var20.add(var12);
                        }

                        --var14;
                     }

                     var14 = var20 != null ? var20.size() - (3 >> 1) : -1;

                     for(var22 = var14; var22 >= 0; var22 = var14) {
                        this.ah((iO)var20.get(var14--));
                     }
                  }
               }

               if (!var17.a()) {
                  var23 = var8;
                  this.s(--3, ev.f());
                  break label143;
               }

               if (var18 != 0 && this.battleState == --2) {
                  this.ad(0L);
               }
            }

            var23 = var8;
         }

      }
   }

   public void ae(String var1, iO var2) {
      if (!hd.o(var1)) {
         Iterator var3;
         for(Iterator var10000 = var3 = this.controlList.iterator(); var10000.hasNext(); var10000 = var3) {
            BattleControl var4;
            if ((var4 = (BattleControl)var3.next()).getRoleId() == (long)var2.bt().getId()) {
               var4.gameView.f(var1);
               return;
            }
         }

      }
   }

   public void af() {
      Iterator var1;
      Iterator var10000 = var1 = this.battleUnitList.iterator();

      while(true) {
         while(var10000.hasNext()) {
            iO var2;
            if ((var2 = (iO)var1.next()).bt().getHp_Current() > 0) {
               var10000 = var1;
            } else if (var2.bt().getType() == 0) {
               var10000 = var1;
            } else {
               label42: {
                  if (var2.bt().getType() == --2) {
                     if (var2.bt().getDie() == null) {
                        break label42;
                     }

                     if (var2.bt().getDie() != --1) {
                        var10000 = var1;
                        continue;
                     }
                  }

                  var1.remove();
                  if (var2.bt().getType() == 3 >> 1) {
                     var10000 = var1;
                     this.x(--1, var2.bt());
                     continue;
                  }

                  if (var2.bt().getType() == --3) {
                     this.w(4 ^ 5, var2.bt());
                  }
               }

               var10000 = var1;
            }
         }

         return;
      }
   }

   public void ag(BattleControl var1) {
      synchronized(this) {
         if (this.controlList.remove(var1)) {
            this.controlTime = ev.l();
            var1.setBattle(3 ^ 3, (BattleScene)null);
         }
      }
   }

   public void ah(iO var1) {
      int var4 = var1.bt().getType();
      int var3 = var1.bt().getCamp();
      int var2 = var1.bt().getMan();
      this.d(var3, var2);
      if (var4 != 0) {
         if (var4 == 5 >> 1 && var2 >= 0 && var2 <= --4) {
            this.d(var3, var2 + (122 & 15));
         }

      } else {
         this.d(var3, var2 + --5);
         this.d(var3, var2 + (30 & 107));
         this.d(var3, var2 + (95 & 47));
         long var5 = (long)var1.bt().getId();
         Iterator var7 = this.controlList.iterator();

         for(Iterator var10000 = var7; var10000.hasNext(); var10000 = var7) {
            BattleControl var9;
            if ((var9 = (BattleControl)var7.next()).getRoleId() == var5) {
               this.o(var9.gameView);
               FightingEndD var8 = new FightingEndD();
               var8.setFightingsumber((int)this.battleId);
               String var10 = Agreement.getSendTextAES("fig6", mi.b().toJson(var8));
               var9.gameView.getClient().d(var10);
               return;
            }
         }

      }
   }
}
