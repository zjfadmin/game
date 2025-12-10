package com.xy.battle;

import com.xy.hd;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class BattleBuffUtil {
   public List<BattleBuff> buffs;
   public boolean isMcqh2;
   public BattleScene battleScene;
   public BattleBuff buffZT1;
   public boolean isMcqh1;
   public BattleBuff buffZT2;

   public void a(int var1) {
      if (var1 == -4 >> 2) {
         var1 = 3 >> 1;
      }

      BattleBuff var14 = null;
      BattleBuff var6 = null;
      BattleBuff var4 = null;
      BattleBuff var5 = null;
      BattleBuff var3 = null;
      BattleBuff var7 = null;
      BattleBuff var8 = null;
      BattleBuff var9 = null;
      BattleBuff var10 = null;
      BattleBuff var11 = null;
      BattleBuff var12 = null;

      int var13;
      for(int var10000 = var13 = this.buffs.size() - --1; var10000 >= 0; var10000 = var13) {
         BattleBuff var2;
         BattleBuff var15 = var2 = (BattleBuff)this.buffs.get(var13);
         var15.setIsv((boolean)(5 >> 3));
         if (!var15.getType().equals("bbsgqx") && !var2.getType().equals("bbtm")) {
            if (var2.getType().equals("bbmcqh")) {
               var2.setXy(--2);
               var2.setIsv((boolean)(--1));
            } else if (var2.getType().equals("化无")) {
               if (var2.getCamp() == var1) {
                  var4 = var2;
               } else {
                  var6 = var2;
               }
            } else if (var2.getType().equals("1881")) {
               if (var2.getCamp() == var1) {
                  var10 = var2;
               } else {
                  var9 = var2;
               }
            } else if (var2.getType().equals("1234")) {
               if (var2.getCamp() == var1) {
                  var11 = var2;
               } else {
                  var12 = var2;
               }
            } else if (var2.getType().equals("bbxr")) {
               if (var2.getCamp() == var1) {
                  var5 = var2;
               } else {
                  var3 = var2;
               }
            } else if (var2.getType().equals("bbyh")) {
               if (var2.getCamp() == var1) {
                  var7 = var2;
               } else {
                  var8 = var2;
               }
            }
         } else {
            int var10002 = 3 >> 1;
            var2.setXy(5 >> 2);
            var2.setIsv((boolean)var10002);
            if (var2.getType().equals("bbsgqx")) {
               if (var14 != null) {
                  var14.setIsv((boolean)(3 ^ 3));
               }
            } else {
               var14 = var2;
            }
         }

         --var13;
      }

      if (var6 == null && var5 != null) {
         var6 = var5;
         var5 = null;
      }

      if (var5 == null) {
         var5 = var7;
      }

      int var10001;
      if (var6 != null) {
         var10001 = 3 & 5;
         var6.setXy(--3);
         var6.setIsv((boolean)var10001);
      }

      if (var5 != null) {
         var10001 = --1;
         var5.setXy(--4);
         var5.setIsv((boolean)var10001);
      }

      if (var11 != null) {
         var10001 = 4 ^ 5;
         var11.setXy(--5);
         var11.setIsv((boolean)var10001);
      }

      if (var9 != null) {
         var10001 = --1;
         var9.setXy(62 & 71);
         var9.setIsv((boolean)var10001);
      }

      if (var4 == null && var3 != null) {
         var4 = var3;
         var3 = null;
      }

      if (var3 == null) {
         var3 = var8;
      }

      if (var4 != null) {
         var10001 = --1;
         var4.setXy(--3);
         var4.setIsv((boolean)var10001);
      }

      if (var3 != null) {
         var10001 = 2 ^ 3;
         var3.setXy(--4);
         var3.setIsv((boolean)var10001);
      }

      if (var12 != null) {
         var10001 = 2 ^ 3;
         var12.setXy(--5);
         var12.setIsv((boolean)var10001);
      }

      if (var10 != null) {
         var10001 = 2 ^ 3;
         var10.setXy(6 & 127);
         var10.setIsv((boolean)var10001);
      }

      if (this.buffZT1 != null) {
         this.buffZT1.setXy(23 & 111);
         this.buffZT1.setIsv((boolean)(3 >> 1));
      }

      if (this.buffZT2 != null) {
         this.buffZT2.setXy(23 & 111);
         this.buffZT2.setIsv((boolean)(3 & 5));
      }

   }

   public void b(String var1) {
      if (!hd.o(var1)) {
         String[] var6 = var1.split("\\|");

         int var4;
         for(int var10000 = var4 = 2 & 5; var10000 < var6.length; var10000 = var4) {
            String[] var3;
            if ((var3 = var6[var4].split("="))[3 ^ 3].equals("0")) {
               BattleBuff var7;
               if (!var3[--3].equals("化无") && !var3[--3].equals("bbxr") && !var3[--3].equals("bbyh") && !var3[--3].equals("bbtm") && !var3[--3].equals("bbsgqx") && !var3[--3].equals("1881") && !var3[--3].equals("1234")) {
                  if (var3[--3].equals("bbmcqh")) {
                     var7 = new BattleBuff(var3);
                     this.buffs.add(var7);
                     if (var7.getCamp() == 5 >> 2) {
                        this.isMcqh1 = (boolean)(--1);
                     } else {
                        this.isMcqh2 = (boolean)(3 & 5);
                     }
                  } else if (var3[--3].equals("3028")) {
                     if ((var7 = new BattleBuff(var3)).getCamp() == 5 >> 2) {
                        this.buffZT1 = var7;
                     } else {
                        this.buffZT2 = var7;
                     }
                  }
               } else {
                  var7 = new BattleBuff(var3);
                  this.buffs.add(var7);
               }
            } else {
               int var2 = Integer.parseInt(var3[5 >> 2]);
               if (this.buffZT1 != null && this.buffZT1.getId() == var2) {
                  this.buffZT1 = null;
               } else {
                  int var8;
                  if (this.buffZT2 != null && this.buffZT2.getId() == var2) {
                     this.buffZT2 = null;
                  } else {
                     for(var10000 = var8 = this.buffs.size() - --1; var10000 >= 0; var10000 = var8) {
                        BattleBuff var5;
                        if ((var5 = (BattleBuff)this.buffs.get(var8)).getId() == var2) {
                           BattleBuffUtil var9;
                           label73: {
                              if (var5.getType().equals("bbmcqh")) {
                                 if (var5.getCamp() == 3 >> 1) {
                                    var9 = this;
                                    this.isMcqh1 = (boolean)(3 >> 2);
                                    break label73;
                                 }

                                 this.isMcqh2 = (boolean)(3 & 4);
                              }

                              var9 = this;
                           }

                           var9.buffs.remove(var8);
                           break;
                        }

                        --var8;
                     }
                  }
               }
            }

            ++var4;
         }

         this.a(3 >> 1);
      }
   }

   public void c(String var1) {
      this.isMcqh2 = this.isMcqh1 = (boolean)(5 >> 3);
      this.buffZT1 = null;
      this.buffZT2 = null;
      this.buffs.clear();
      this.b(var1);
   }

   public void d(Graphics var1, int var2, BattleControl var3) {
      BattleBuff var4 = var2 == 5 >> 2 ? this.buffZT2 : this.buffZT1;
      if (var4 != null) {
         var4.a(var1, var2, var3);
      }

   }

   public BattleBuff getZT(int var1) {
      return var1 == --1 ? this.buffZT1 : this.buffZT2;
   }

   public BattleBuffUtil(BattleScene var1) {
      int var10004 = 3 ^ 3;
      int var10006 = 3 ^ 3;
      super();
      this.isMcqh1 = (boolean)var10006;
      this.isMcqh2 = (boolean)var10004;
      this.buffs = new ArrayList();
      this.battleScene = var1;
   }

   public void e(Graphics var1, int var2, BattleControl var3) {
      int var10000;
      int var4;
      for(var10000 = var4 = this.buffs.size() - --1; var10000 >= 0; var10000 = var4) {
         BattleBuff var6 = (BattleBuff)this.buffs.get(var4);
         --var4;
         var6.a(var1, var2, var3);
      }

      for(var10000 = var4 = var3.skills.size() - --1; var10000 >= 0; var10000 = var4) {
         SkillTx var7 = (SkillTx)var3.skills.get(var4);
         --var4;
         var7.a(var1, var3);
      }

      BattleBuff var5 = var2 == (3 & 5) ? this.buffZT1 : this.buffZT2;
      if (var5 != null) {
         var5.a(var1, var2, var3);
      }

   }
}
