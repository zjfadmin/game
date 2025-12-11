package com.xy.v;

import com.xy.bean.ChongjipackBean;
import com.xy.formula.SkillUtil;
import com.xy.game.GameUtil;
import com.xy.readbean.Activity;
import com.xy.readbean.ActivityFC;
import com.xy.readbean.ActivitySeries;
import com.xy.readbean.AlchemySet;
import com.xy.readbean.AllACard;
import com.xy.readbean.AllAchieve;
import com.xy.readbean.AllActive;
import com.xy.readbean.AllBabyResult;
import com.xy.readbean.AllBbuy;
import com.xy.readbean.AllBuff;
import com.xy.readbean.AllColorScheme;
import com.xy.readbean.AllDoorBean;
import com.xy.readbean.AllEventModelBean;
import com.xy.readbean.AllFB;
import com.xy.readbean.AllFM;
import com.xy.readbean.AllGuide;
import com.xy.readbean.AllLabor;
import com.xy.readbean.AllMapBean;
import com.xy.readbean.AllNpcBean;
import com.xy.readbean.AllPal;
import com.xy.readbean.AllPetExchange;
import com.xy.readbean.AllStallBuy;
import com.xy.readbean.AllStarSoul;
import com.xy.readbean.AllSuit;
import com.xy.readbean.AllTalent;
import com.xy.readbean.AllTask;
import com.xy.readbean.AllTitleBean;
import com.xy.readbean.AllTx;
import com.xy.readbean.BabyResult;
import com.xy.readbean.Bbuy;
import com.xy.readbean.Buff;
import com.xy.readbean.ColorScheme;
import com.xy.readbean.Door;
import com.xy.readbean.Eshop;
import com.xy.readbean.EshopBean;
import com.xy.readbean.Fly;
import com.xy.readbean.GemOld;
import com.xy.readbean.GoodsBean;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.readbean.NpcShopBean;
import com.xy.readbean.PalData;
import com.xy.readbean.Question;
import com.xy.readbean.Robots;
import com.xy.readbean.RobotsBean;
import com.xy.readbean.RoleExpBean;
import com.xy.readbean.RoleSuitBean;
import com.xy.readbean.RoleTxBean;
import com.xy.readbean.Shop;
import com.xy.readbean.Skill;
import com.xy.readbean.SkillBean;
import com.xy.readbean.StallBuyData;
import com.xy.readbean.StarSoul;
import com.xy.readbean.TYC;
import com.xy.readbean.TYCModel;
import com.xy.readbean.Talent;
import com.xy.readbean.TaskData;
import com.xy.readbean.TaskSet;
import com.xy.readbean.Title;
import com.xy.readbean.petExchange;
import java.awt.Point;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class8 {
   private List<Class26> a;
   private Map<Integer, Fly> b;
   private AllEventModelBean c;
   private AllBabyResult d;
   private AllAchieve e;
   private AllDoorBean f;
   private Map<Integer, GemOld> g;
   private AllTalent h;
   private AllSuit i;
   private int j;
   private AllFM k;
   private AllNpcBean l;
   private AllPal m;
   private com.xy.n.Class3 n;
   private List<Eshop> o;
   private Map<Integer, ChongjipackBean> p;
   private AllPetExchange q;
   private Goodstable[] r;
   private AlchemySet s;
   private AllTx t;
   private ActivitySeries u;
   private AllStallBuy v;
   public List<TYC> w;
   private AllGuide x;
   private AllTask y;
   private Map<Long, List<TYCModel>> z;
   public List<TYC> aa;
   public List<TYC> ab;
   private AllFB ac;
   private AllACard ad;
   private NpcShopBean ae;
   private RobotsBean af;
   private Map<Integer, BigDecimal> ag;
   public static Object ah = new Object();
   private AllMapBean ai;
   private AllLabor aj;
   private Map<String, Skill> ak;
   private GoodsBean al;
   private AllBbuy am;
   public List<TYC> an;
   private String ao;
   private AllStarSoul ap;
   private AllTitleBean aq;
   private Map<Integer, Question> ar;
   private AllActive as;
   private AllBuff at;
   private Map<String, String> au;
   private AllColorScheme av;

   public Buff a(int var1) {
      return this.cc().getBuff(var1);
   }

   public AllTask b() {
      if (this.y != null) {
         return this.y;
      } else {
         synchronized (ah) {
            if (this.y != null) {
               return this.y;
            } else {
               String var10002 = "skta";
               this.j("task");
               return this.y;
            }
         }
      }
   }

   public Door c(String var1) {
      return this.bn().getAlldoor().get(var1);
   }

   public String d(String var1) {
      MapModel var2;
      if ((var2 = this.g(var1)) != null) {
         return var2.getMapName();
      } else {
         String var10000 = "札矯圷围";
         return "未知地图";
      }
   }

   public petExchange e(int var1) {
      return this.aq().getAllPetExchange().get(var1);
   }

   public Question f(int var1) {
      return this.bm().get(var1);
   }

   public MapModel g(String var1) {
      return this.af().getAllMap().get(var1);
   }

   public ColorScheme h(int var1) {
      this.u();
      ArrayList var2 = new ArrayList();
      Iterator var4 = this.av.getAllMap().values().iterator();

      for (Iterator var10000 = var4; var10000.hasNext(); var10000 = var4) {
         ColorScheme var3;
         if ((var3 = (ColorScheme)var4.next()).getZid() == 0 || var3.getZid() == var1) {
            var2.add(var3.getId());
         }
      }

      return var2.size() == 0 ? null : this.av.getAllMap().get(var2.get(Class0.a.nextInt(var2.size())));
   }

   public List<Eshop> i() {
      if (this.o != null) {
         return this.o;
      } else {
         synchronized (ah) {
            if (this.o != null) {
               return this.o;
            } else {
               this.j("eshop");
               return this.o;
            }
         }
      }
   }

   public void j(String var1) {
      StringBuilder var10001 = new StringBuilder(String.valueOf(var1));
      String var10002 = "=\u001ck\u001c";
      String var2 = this.v(var10001.append(".txt").toString());
      switch (var1.hashCode()) {
         case -1422950650:

            String var138 = "fiscqo";
            if (!var1.equals("active")) {
               return;
            } else {
               AllActive var59 = Class31.a().fromJson(var2, AllActive.class);
               this.as = var59;
               return;
            }
         case -1172895151:
            String var137 = "\tp\u0000z\re\r";
            if (!var1.equals("achieve")) {
               return;
            }

            AllAchieve var61 = Class31.a().fromJson(var2, AllAchieve.class);
            this.e = var61;
            return;
         case -1165870106:
            String var136 = "v\u007fbyschd";
            if (!var1.equals("question")) {
               return;
            }

            Map var69 = Class31.a().fromJson(var2, new Class18(this).getType());
            this.ar = var69;
            return;
         case -1036776069:
            String var133 = "\u000b{\u0007}\u000fy\u0001c\tp\u0003";
            if (!var1.equals("chongjipack")) {
               return;
            } else {
               Map var40 = Class31.a().fromJson(var2, new Class30(this).getType());
               ArrayList var41 = new ArrayList();
               Iterator var74;
               Iterator var85 = var74 = var40.values().iterator();

               label361:
               while (var85.hasNext()) {
                  ChongjipackBean var71;
                  if ((var71 = (ChongjipackBean)var74.next()).getPacktype() == 11) {
                     String var134 = var71.getHuitime();
                     var10002 = "v";
                     int var44 = var134.indexOf("|");
                     Point var45;
                     Point var135 = var45 = new Point();
                     var45.x = Class12.ad(var71.getHuitime(), 0, var44);
                     var135.y = Class12.ad(var71.getHuitime(), var44 + 1, var71.getHuitime().length());
                     var71.setPointLvl(var135);
                     var71.setHuitime(null);

                     Iterator var47;
                     for (Iterator var86 = var47 = var41.iterator(); var86.hasNext(); var86 = var47) {
                        Class26 var46;
                        if (Class12.am((var46 = (Class26)var47.next()).a, var71.getPackname())) {
                           var85 = var74;
                           var46.b = Math.min(var46.b, var71.getPackgradetype().intValue());
                           continue label361;
                        }
                     }

                     var41.add(new Class26(var71.getPackname(), var71.getPackgradetype().intValue()));
                  }

                  var85 = var74;
               }

               int var72;
               for (int var87 = var72 = 0; var87 < var41.size() - 1; var87 = ++var72) {
                  int var75;
                  for (int var88 = var75 = 1; var88 < var41.size() - var72; var88 = ++var75) {
                     if (((Class26)var41.get(var75 - 1)).b > ((Class26)var41.get(var75)).b) {
                        Class26 var76 = (Class26)var41.get(var75 - 1);
                        var41.set(var75 - 1, (Class26)var41.get(var75));
                        var41.set(var75, var76);
                     }
                  }
               }

               for (int var89 = var72 = 0; var89 < var41.size(); var89 = var72) {
                  ((Class26)var41.get(var72)).b = 22 + var72++;
               }

               this.p = var40;
               this.a = var41;
               return;
            }
         case -925703351:
            String var132 = "ueeesy";
            if (!var1.equals("robots")) {
               return;
            }

            RobotsBean var48 = Class31.a().fromJson(var2, RobotsBean.class);
            this.af = var48;
            return;
         case -881086228:
            String var131 = "g\t\u007f\r}\u001c";
            if (!var1.equals("talent")) {
               return;
            }

            AllTalent var18 = Class31.a().fromJson(var2, AllTalent.class);
            this.h = var18;
            return;
         case 3260:
            String var130 = "ah";
            if (!var1.equals("fb")) {
               return;
            }

            AllFB var63 = Class31.a().fromJson(var2, AllFB.class);
            this.ac = var63;
            return;
         case 3271:
            if (!var1.equals("fm")) {
               return;
            }

            AllFM var65 = Class31.a().fromJson(var2, AllFM.class);
            this.k = var65;
            return;
         case 3716:
            String var129 = "g\u0010";
            if (!var1.equals("tx")) {
               return;
            }

            AllTx var20 = Class31.a().fromJson(var2, AllTx.class);
            this.t = var20;
            return;
         case 100893:
            String var128 = "o\u007fz";
            if (!var1.equals("exp")) {
               return;
            }

            RoleExpBean var8 = Class31.a().fromJson(var2, RoleExpBean.class);
            this.ag = var8.getRolePetExpMap();
            return;
         case 101491:
            String var127 = "\u000e\u007f\u0011";
            if (!var1.equals("fly")) {
               return;
            }

            Map var70 = Class31.a().fromJson(var2, new Class17(this).getType());
            this.b = var70;
            return;
         case 102223:
            String var126 = "mbg";
            if (!var1.equals("gem")) {
               return;
            }

            Map var39 = Class31.a().fromJson(var2, new Class20(this).getType());
            this.g = var39;
            return;
         case 107868:
            String var125 = "\u0005r\u0018";
            if (!var1.equals("map")) {
               return;
            }

            AllMapBean var4 = Class31.a().fromJson(var2, AllMapBean.class);
            this.ai = var4;
            return;
         case 109281:
            if (!var1.equals("npc")) {
               return;
            }

            AllNpcBean var5 = Class31.a().fromJson(var2, AllNpcBean.class);
            this.l = var5;
            return;
         case 110747:
            String var124 = "zff";
            if (!var1.equals("pal")) {
               return;
            }

            AllPal var55 = Class31.a().fromJson(var2, AllPal.class);
            this.m = var55;
            return;
         case 115326:
            String var109 = "\u001cj\u000b";
            if (!var1.equals("tyc")) {
               return;
            } else {
               HashMap var23 = Class31.a().fromJson(var2, HashMap.class);
               HashMap var24 = new HashMap();
               Iterator var25;
               Iterator var78 = var25 = var23.entrySet().iterator();

               while (var78.hasNext()) {
                  Entry var50;
                  String var53;
                  String var79 = var53 = (String)(var50 = (Entry)var25.next()).getKey();
                  String var110 = "斺央漞筑'";
                  if (!var79.startsWith("新天演策-")) {
                     var78 = var25;
                  } else {
                     label323: {
                        String var54 = var53.substring(5);
                        byte var56 = -1;
                        int var30 = 0;
                        String var111 = "甤仒";
                        byte var80;
                        if (var54.equals("男人")) {
                           var56 = 0;
                           var30 = 1;
                           var80 = var56;
                        } else {
                           String var112 = "奴亰";
                           if (var54.equals("女人")) {
                              var56 = 0;
                              var30 = 2;
                              var80 = var56;
                           } else {
                              String var113 = "甤鬼";
                              if (var54.equals("男魔")) {
                                 var56 = 0;
                                 var30 = 3;
                                 var80 = var56;
                              } else {
                                 String var114 = "奴魞";
                                 if (var54.equals("女魔")) {
                                    var56 = 0;
                                    var30 = 4;
                                    var80 = var56;
                                 } else {
                                    String var115 = "甤亱";
                                    if (var54.equals("男仙")) {
                                       var56 = 0;
                                       var30 = 5;
                                       var80 = var56;
                                    } else {
                                       String var116 = "奴仓";
                                       if (var54.equals("女仙")) {
                                          var56 = 0;
                                          var30 = 6;
                                          var80 = var56;
                                       } else {
                                          String var117 = "甤魔";
                                          if (var54.equals("男鬼")) {
                                             var56 = 0;
                                             var30 = 7;
                                             var80 = var56;
                                          } else {
                                             String var118 = "奴鬶";
                                             if (var54.equals("女鬼")) {
                                                var56 = 0;
                                                var30 = 8;
                                                var80 = var56;
                                             } else {
                                                String var119 = "甤鿱";
                                                if (var54.equals("男龙")) {
                                                   var56 = 0;
                                                   var30 = 9;
                                                   var80 = var56;
                                                } else {
                                                   String var120 = "奴龓";
                                                   if (var54.equals("女龙")) {
                                                      var56 = 0;
                                                      var30 = 10;
                                                      var80 = var56;
                                                   } else {
                                                      String var121 = "K";
                                                      int var31;
                                                      if ((var31 = var54.indexOf("#")) != -1) {
                                                         int var32 = SkillUtil.getSmIndex(var54.substring(0, var31));
                                                         int var33 = SkillUtil.getSmIndex(var54.substring(var31 + 1));
                                                         if (var32 == 0 || var33 == 0) {
                                                            break label323;
                                                         }

                                                         if (var32 == var33) {
                                                            var78 = var25;
                                                            continue;
                                                         }

                                                         if (var32 > var33) {
                                                            int var81 = var32;
                                                            var32 = var33;
                                                            var33 = var81;
                                                         }

                                                         var56 = 2;
                                                         var30 = var33 << 8 | var32;
                                                         var80 = var56;
                                                      } else {
                                                         var56 = 1;
                                                         var30 = SkillUtil.getSmIndex(var54);
                                                         var80 = var56;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        if (var80 != -1) {
                           if (var30 == 0) {
                              var78 = var25;
                              continue;
                           }

                           String var60 = (String)var50.getValue();
                           LinkedList var62 = new LinkedList();
                           String var122 = "[v";
                           String[] var64 = var60.split("\\|");
                           int var66 = var56 == 0 ? 0 : 1;

                           int var67;
                           for (int var82 = var67 = 0; var82 < var64.length; var82 = ++var67) {
                              String var83 = var64[var67];
                              String var123 = "K";
                              String[] var68 = var83.split("#");

                              int var37;
                              for (int var84 = var37 = 0; var84 < var68.length; var84 = var37) {
                                 TYCModel var38 = new TYCModel(var56, var30, var37);
                                 var38.setLvl(var66 + var67);
                                 String var10003 = var68[var37];
                                 var37++;
                                 var38.setSkillId(Integer.parseInt(var10003));
                                 var62.add(var38);
                              }
                           }

                           var24.put((long)var56 << 32 | var30, var62);
                           var25.remove();
                        }
                     }

                     var78 = var25;
                  }
               }

               this.au = var23;
               this.z = var24;
               return;
            }
         case 3017444:
            String var108 = "ehrs";
            if (!var1.equals("bbuy")) {
               return;
            }

            AllBbuy var17 = Class31.a().fromJson(var2, AllBbuy.class);
            this.am = var17;
            return;
         case 3035219:
            String var107 = "q\u001du\u000e";
            if (!var1.equals("buff")) {
               return;
            }

            AllBuff var34 = Class31.a().fromJson(var2, AllBuff.class);
            this.at = var34;
            return;
         case 3089326:
            String var106 = "cehx";
            if (!var1.equals("door")) {
               return;
            }

            AllDoorBean var6 = Class31.a().fromJson(var2, AllDoorBean.class);
            this.f = var6;
            return;
         case 3541773:
            String var105 = "`\u001dz\u001c";
            if (!var1.equals("suit")) {
               return;
            }

            AllSuit var21 = Class31.a().fromJson(var2, AllSuit.class);
            this.i = var21;
            return;
         case 3552645:
            String var104 = "skta";
            if (!var1.equals("task")) {
               return;
            }

            AllTask var49 = Class31.a().fromJson(var2, AllTask.class);
            var49.a();
            this.y = var49;
            return;
         case 92627697:
            String var103 = "\tp\ta\f";
            if (!var1.equals("acard")) {
               return;
            }

            AllACard var26 = Class31.a().fromJson(var2, AllACard.class);
            this.ad = var26;
            return;
         case 94842723:
            String var102 = "ihfhx";
            if (!var1.equals("color")) {
               return;
            }

            AllColorScheme var19 = Class31.a().fromJson(var2, AllColorScheme.class);
            this.av = var19;
            return;
         case 96805083:
            if (!var1.equals("eshop")) {
               return;
            }

            EshopBean var9 = Class31.a().fromJson(var2, EshopBean.class);
            this.o = var9.getEshops();
            return;
         case 96891546:
            String var101 = "\re\r}\u001c";
            if (!var1.equals("event")) {
               return;
            }

            AllEventModelBean var52 = Class31.a().fromJson(var2, AllEventModelBean.class);
            this.c = var52;
            return;
         case 98539350:
            String var100 = "mhecy";
            if (!var1.equals("goods")) {
               return;
            }

            GoodsBean var12 = Class31.a().fromJson(var2, GoodsBean.class);
            Goodstable[] var13 = new Goodstable[24];
            int var14 = 0;

            int var15;
            for (int var10000 = var15 = 50; var10000 < 74; var10000 = ++var15) {
               Goodstable var16;
               if ((var16 = var12.getAllGoodsMap().remove(new BigDecimal(var15))) != null) {
                  var13[var14] = var16;
                  var13[var14].setRgid(var13[var14++].getGoodsid());
               }
            }

            var12.a();
            this.al = var12;
            this.r = var13;
            return;
         case 98712316:
            String var99 = "\u000ff\u0001w\r";
            if (!var1.equals("guide")) {
               return;
            }

            AllGuide var22 = Class31.a().fromJson(var2, AllGuide.class);
            this.x = var22;
            return;
         case 102727728:
            if (!var1.equals("labor")) {
               return;
            }

            AllLabor var36 = Class31.a().fromJson(var2, AllLabor.class);
            this.aj = var36;
            return;
         case 109496913:
            String var98 = "ylckf";
            if (!var1.equals("skill")) {
               return;
            }

            SkillBean var10 = Class31.a().fromJson(var2, SkillBean.class);
            var10.a();
            this.ak = var10.getSkillMap();
            return;
         case 110371416:
            String var97 = "\u001cz\u001c\u007f\r";
            if (!var1.equals("title")) {
               return;
            } else {
               if (var2 != null) {
                  AllTitleBean var51 = Class31.a().fromJson(var2, AllTitleBean.class);
                  this.aq = var51;
                  return;
               }

               AllTitleBean var27 = new AllTitleBean();
               HashMap var28 = new HashMap();
               var27.setTitleMap(var28);
               this.aq = var27;
               return;
            }
         case 780014690:
            String var96 = "zb~Brdbfd`o";
            if (!var1.equals("petExchange")) {
               return;
            }

            AllPetExchange var29 = Class31.a().fromJson(var2, AllPetExchange.class);
            this.q = var29;
            return;
         case 880075398:
            String var95 = "R\u000bg\u0001e\u0001g\u0011@\ra\u0001v\u001b";
            if (!var1.equals("ActivitySeries")) {
               return;
            }

            ActivitySeries var42 = Class31.a().fromJson(var2, ActivitySeries.class);
            var42.a();
            this.u = var42;
            return;
         case 1063146611:
            String var94 = "ekesuot\u007fk~";
            if (!var1.equals("babyresult")) {
               return;
            }

            AllBabyResult var11 = Class31.a().fromJson(var2, AllBabyResult.class);
            this.d = var11;
            return;
         case 1311020774:
            if (!var1.equals("stallbuy")) {
               return;
            } else {
               AllStallBuy var43 = Class31.a().fromJson(var2, AllStallBuy.class);
               var43.a();
               this.v = var43;
            }
         default:
            return;
         case 1315829605:
            String var93 = "`\u001cr\u001a@\u0007f\u0004";
            if (!var1.equals("starSoul")) {
               return;
            }

            AllStarSoul var35 = Class31.a().fromJson(var2, AllStarSoul.class);
            this.ap = var35;
            return;
         case 2028001277:
            String var92 = "ffdbbg~YOY";
            if (!var1.equals("alchemySHS")) {
               return;
            }

            this.s = new AlchemySet(var2);
            return;
         case 2142580055:
            String var91 = "\u0006c\u000b`\u0000|\u0018";
            if (var1.equals("npcshop")) {
               NpcShopBean var7 = Class31.a().fromJson(var2, NpcShopBean.class);
               this.ae = var7;
            }
      }
   }

   public AllStallBuy k() {
      if (this.v != null) {
         return this.v;
      } else {
         synchronized (ah) {
            if (this.v != null) {
               return this.v;
            } else {
               this.j("stallbuy");
               return this.v;
            }
         }
      }
   }

   public Map<String, String> l() {
      if (this.au != null) {
         return this.au;
      } else {
         synchronized (ah) {
            if (this.au != null) {
               return this.au;
            } else {
               String var10002 = "\u001cj\u000b";
               this.j("tyc");
               return this.au;
            }
         }
      }
   }

   public long m(int var1, int var2) {
      return this.ag(var1, var2);
   }

   public long n(int var1, int var2) {
      return (long)(this.m(var1, var2) * 0.7);
   }

   public AllAchieve o() {
      if (this.e != null) {
         return this.e;
      } else {
         synchronized (ah) {
            if (this.e != null) {
               return this.e;
            } else {
               String var10002 = "kdbnoqo";
               this.j("achieve");
               return this.e;
            }
         }
      }
   }

   public StarSoul p(int var1) {
      return this.cg().getStarSoulMap().get(var1);
   }

   public AllActive q() {
      if (this.as != null) {
         return this.as;
      } else {
         synchronized (ah) {
            if (this.as != null) {
               return this.as;
            } else {
               String var10002 = "r\u000bg\u0001e\r";
               this.j("active");
               return this.as;
            }
         }
      }
   }

   public AllFM r() {
      if (this.k != null) {
         return this.k;
      } else {
         synchronized (ah) {
            if (this.k != null) {
               return this.k;
            } else {
               this.j("fm");
               return this.k;
            }
         }
      }
   }

   public boolean s() {
      return this.u != null;
   }

   public ChongjipackBean t(int var1) {
      return this.bv().get(var1);
   }

   public AllColorScheme u() {
      if (this.av != null) {
         return this.av;
      } else {
         synchronized (ah) {
            if (this.av != null) {
               return this.av;
            } else {
               String var10002 = "\u000b|\u0004|\u001a";
               this.j("color");
               return this.av;
            }
         }
      }
   }

   public String v(String var1) {
      Object var2 = null;

      try {
         StringBuilder var10003 = new StringBuilder(String.valueOf(this.ao)).append(var1);
         String var10004 = "W";
         if ((var2 = this.aa(new URL(var10003.append("?").append(System.currentTimeMillis()).toString()))) == null) {
            Thread.sleep(2000L);
            String var7 = "了欦努轺0";
            System.out.println("二次加载:" + var1);
            var10003 = new StringBuilder(String.valueOf(this.ao)).append(var1);
            var10004 = "W";
            var2 = this.aa(new URL(var10003.append("?").append(System.currentTimeMillis()).toString()));
         }

         return var2 == null ? null : Class23.a(new String((byte[])var2, Class23.c));
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public AllBbuy w() {
      if (this.am != null) {
         return this.am;
      } else {
         synchronized (ah) {
            if (this.am != null) {
               return this.am;
            } else {
               String var10002 = "q\nf\u0011";
               this.j("bbuy");
               return this.am;
            }
         }
      }
   }

   public Class26 x(String var1) {
      this.bv();
      int var2 = 0;

      for (int var10000 = var2; var10000 < this.a.size(); var10000 = ++var2) {
         Class26 var3 = this.a.get(var2);
         if (Class12.am(var1, var3.a)) {
            return var3;
         }
      }

      return null;
   }

   public com.xy.n.Class3 y() {
      return this.n;
   }

   public List<ChongjipackBean> z(int var1, String var2) {
      ArrayList var3 = new ArrayList();
      Iterator var6;
      Iterator var10000 = var6 = this.bv().values().iterator();

      label37:
      while (var10000.hasNext()) {
         ChongjipackBean var5;
         if ((var5 = (ChongjipackBean)var6.next()).getPacktype() == var1) {
            if (!Class12.am(var5.getPackname(), var2)) {
               var10000 = var6;
               continue;
            }

            int var7;
            for (int var8 = var7 = 0; var8 < var3.size(); var8 = ++var7) {
               if (var5.getPackgradetype() <= ((ChongjipackBean)var3.get(var7)).getPackgradetype()) {
                  var3.add(var7, var5);
                  var10000 = var6;
                  continue label37;
               }
            }

            var3.add(var5);
         }

         var10000 = var6;
      }

      return var3;
   }

   public byte[] aa(URL var1) {
      try {
         long var2 = System.currentTimeMillis();
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         InputStream var5 = var1.openStream();
         byte[] var6 = new byte[1024];
         int var7 = 0;

         for (InputStream var11 = var5; (var7 = var11.read(var6)) != -1; var11 = var5) {
            var4.write(var6, 0, var7);
         }

         var4.close();
         var5.close();
         if ((var2 = System.currentTimeMillis() - var2) > 1000L) {
            String var12 = "赎溗丁轺宆毒0耐旼";
            System.err.println("资源下载完毕:耗时" + var2);
         }

         return var4.toByteArray();
      } catch (IOException var8) {
         PrintStream var10000 = System.err;
         String var10003 = "乣轮贬溃奙贶Hv\u001aa\u0007aU";
         StringBuilder var10001 = new StringBuilder("下载资源失败 error=").append(var8.getMessage());
         String var10002 = "0";
         var10000.println(var10001.append(":").append(var1.getPath()).toString());
         return null;
      }
   }

   public ActivitySeries ab() {
      if (this.u != null) {
         return this.u;
      } else {
         synchronized (ah) {
            if (this.u != null) {
               return this.u;
            } else {
               String var10002 = "FiscqcssToucby";
               this.j("ActivitySeries");
               return this.u;
            }
         }
      }
   }

   public Skill ac(String var1) {
      return this.ca().get(var1);
   }

   public GemOld ad(int var1) {
      return this.bz().get(var1);
   }

   public String ae(String var1) {
      return this.l().get(var1);
   }

   public AllMapBean af() {
      if (this.ai != null) {
         return this.ai;
      } else {
         synchronized (ah) {
            if (this.ai != null) {
               return this.ai;
            } else {
               String var10002 = "gfz";
               this.j("map");
               return this.ai;
            }
         }
      }
   }

   public long ag(int var1, int var2) {
      if (var2 > 199) {
         var2 = 199;
      }

      long var3 = this.bu().get(var2).longValue();
      if (var1 >= 3) {
         var3 *= 3L;
      }

      if (var2 > 100 && var3 < 5000000L) {
         String var10002 = "%Y+Y+Q'^%X";
         var3 = new BigDecimal("6181894660").longValue();
      }

      return var3;
   }

   public static void main(String[] var0) {
      String var10001 = "\u0000$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)\r)'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*$\u0000$*'*'*'*')$*$*'*$*'*')$*$)$*$)$*$)'*$)$*'*'*'*')\r)'*'*'*')')')'*')'*')')'*$*')')')')'*$*'*'*'*'*$\u0000$*'*'*'*$)$*$*'*$*'*$)$*')'*$*$*$)'*')'*'*'*'*')\r)'*'*'*')')')$)')$)')')'*$*')$)')')')$)'*'*'*'*$\u0000$*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*')\r)'Eelrydkschd'h~*Ffkkseuc'Eelrydkseu*q=)='NBGH*$\u0000$*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*')\r)'*'*'*'*'*'bs~w0(%p}p$ffkkseuc)ihg'*'*'*'*'*'*$\u0000$*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*'*')\r)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$)$\u0000";
      System.out
         .println(
            "\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n"
         );
      String var10000 = ")\u007f\u0004@\u001cr\u0004\u007f*f\u0011";
      var10001 = "kkfT~ffkHrs";
      bl("AllStallBuy", "allStallBuy", "stallbuy");
   }

   public GoodsBean ah() {
      if (this.al != null) {
         return this.al;
      } else {
         synchronized (ah) {
            if (this.al != null) {
               return this.al;
            } else {
               String var10002 = "mhecy";
               this.j("goods");
               return this.al;
            }
         }
      }
   }

   public static List<TYC> ai(String var0) {
      if (var0 != null && !var0.equals("")) {
         ArrayList var1 = new ArrayList();
         String var10001 = "O\u0014";
         String[] var2 = var0.split("\\|");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = var3) {
            TYC var4 = new TYC(var2[var3]);
            var3++;
            var1.add(var4);
         }

         return var1;
      } else {
         return null;
      }
   }

   public String aj(int var1) {
      ActivityFC var2 = var1 != 0 ? this.ba(var1) : null;
      return var2 != null ? var2.getValue() : null;
   }

   public AllTalent ak() {
      if (this.h != null) {
         return this.h;
      } else {
         synchronized (ah) {
            if (this.h != null) {
               return this.h;
            } else {
               String var10002 = "skkoi~";
               this.j("talent");
               return this.h;
            }
         }
      }
   }

   public AllTx al() {
      if (this.t != null) {
         return this.t;
      } else {
         synchronized (ah) {
            if (this.t != null) {
               return this.t;
            } else {
               String var10002 = "sr";
               this.j("tx");
               return this.t;
            }
         }
      }
   }

   public AllLabor am() {
      if (this.aj != null) {
         return this.aj;
      } else {
         synchronized (ah) {
            if (this.aj != null) {
               return this.aj;
            } else {
               this.j("labor");
               return this.aj;
            }
         }
      }
   }

   public Title an(String var1) {
      return this.aw().getTitleMap().get(var1);
   }

   public com.xy.n.Class0 ao(long var1, com.xy.n.Class0 var3) throws Exception {
      if (var3 == null) {
         var3 = new com.xy.n.Class0();
      }

      var3.f = this;
      var3.a = var1;
      MapModel var4;
      int var5 = (var4 = this.g(String.valueOf(var1))).getMapModel();
      if (var1 == 1207L && Class22.r) {
         var5 = -var5;
      }

      com.xy.n.Class2 var6 = com.xy.w.Class16.d(var5);
      var3.ab(var4, var6);
      GameUtil.e(var4.getNpcs(), var3, this);
      return var3;
   }

   public Fly ap(int var1) {
      return this.cf().get(var1);
   }

   public AllPetExchange aq() {
      if (this.q != null) {
         return this.q;
      } else {
         synchronized (ah) {
            if (this.q != null) {
               return this.q;
            } else {
               String var10002 = "zb~Brdbfd`o";
               this.j("petExchange");
               return this.q;
            }
         }
      }
   }

   public List<ChongjipackBean> ar(int var1) {
      ArrayList var2 = new ArrayList();
      Iterator var5;
      Iterator var10000 = var5 = this.bv().values().iterator();

      label32:
      while (var10000.hasNext()) {
         ChongjipackBean var4;
         if ((var4 = (ChongjipackBean)var5.next()).getPacktype() != var1) {
            var10000 = var5;
         } else {
            int var6;
            for (int var7 = var6 = 0; var7 < var2.size(); var7 = ++var6) {
               if (var4.getPackgradetype() <= ((ChongjipackBean)var2.get(var6)).getPackgradetype()) {
                  var2.add(var6, var4);
                  var10000 = var5;
                  continue label32;
               }
            }

            var10000 = var5;
            var2.add(var4);
         }
      }

      return var2;
   }

   public RobotsBean as() {
      if (this.af != null) {
         return this.af;
      } else {
         synchronized (ah) {
            if (this.af != null) {
               return this.af;
            } else {
               String var10002 = "a\u0007q\u0007g\u001b";
               this.j("robots");
               return this.af;
            }
         }
      }
   }

   public NpcInfoBean at(String var1) {
      return this.ax().getAllNpcInfo().get(var1);
   }

   public Shop au(String var1) {
      Iterator var2;
      Iterator var10000 = var2 = this.bg().getNpcShopMap().keySet().iterator();

      while (var10000.hasNext()) {
         String var3 = (String)var2.next();
         List var4;
         if ((var4 = this.bg().getNpcShopMap().get(var3)) == null) {
            var10000 = var2;
         } else {
            Iterator var6;
            for (Iterator var7 = var6 = var4.iterator(); var7.hasNext(); var7 = var6) {
               Shop var5;
               if ((var5 = (Shop)var6.next()).getShopid().equals(var1)) {
                  return var5;
               }
            }

            var10000 = var2;
         }
      }

      return null;
   }

   public BabyResult av(String var1) {
      this.bp();
      int var2 = this.d.getAllBabyResults().size() - 1;

      for (int var10000 = var2; var10000 >= 0; var10000 = --var2) {
         BabyResult var3;
         if ((var3 = this.d.getAllBabyResults().get(var2)).getNan().equals(var1)) {
            return var3;
         }

         if (var3.getNv().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public AllTitleBean aw() {
      if (this.aq != null) {
         return this.aq;
      } else {
         synchronized (ah) {
            if (this.aq != null) {
               return this.aq;
            } else {
               String var10002 = "\u001cz\u001c\u007f\r";
               this.j("title");
               return this.aq;
            }
         }
      }
   }

   public AllNpcBean ax() {
      if (this.l != null) {
         return this.l;
      } else {
         synchronized (ah) {
            if (this.l != null) {
               return this.l;
            } else {
               this.j("npc");
               return this.l;
            }
         }
      }
   }

   public Goodstable ay(BigDecimal var1) {
      return this.ah().getAllGoodsMap().get(var1);
   }

   public Talent az(int var1) {
      return this.ak().getAllTalent().get(var1);
   }

   public ActivityFC ba(int var1) {
      return this.ab().getActivityFCMap().get(var1);
   }

   public Activity bb() {
      return this.ab().getActivityBeau();
   }

   public Bbuy bc(BigDecimal var1) {
      return this.w().getAllbbuy().get(var1.intValue());
   }

   public RoleSuitBean bd(int var1) {
      return this.bs().getRolesuit().get(var1);
   }

   public ColorScheme be(String var1) {
      this.u();
      Iterator var3 = this.av.getAllMap().values().iterator();

      for (Iterator var10000 = var3; var10000.hasNext(); var10000 = var3) {
         ColorScheme var2;
         if ((var2 = (ColorScheme)var3.next()).getName().equals(var1)) {
            return var2;
         }
      }

      return null;
   }

   public AllPal bf() {
      if (this.m != null) {
         return this.m;
      } else {
         synchronized (ah) {
            if (this.m != null) {
               return this.m;
            } else {
               String var10002 = "\u0018r\u0004";
               this.j("pal");
               return this.m;
            }
         }
      }
   }

   public NpcShopBean bg() {
      if (this.ae != null) {
         return this.ae;
      } else {
         synchronized (ah) {
            if (this.ae != null) {
               return this.ae;
            } else {
               String var10002 = "dwitbhz";
               this.j("npcshop");
               return this.ae;
            }
         }
      }
   }

   public AllFB bh() {
      if (this.ac != null) {
         return this.ac;
      } else {
         synchronized (ah) {
            if (this.ac != null) {
               return this.ac;
            } else {
               String var10002 = "u\n";
               this.j("fb");
               return this.ac;
            }
         }
      }
   }

   public AlchemySet bi() {
      if (this.s != null) {
         return this.s;
      } else {
         synchronized (ah) {
            if (this.s != null) {
               return this.s;
            } else {
               String var10002 = "r\u0004p\u0000v\u0005j;[;";
               this.j("alchemySHS");
               return this.s;
            }
         }
      }
   }

   public PalData bj(int var1) {
      return this.bf().getAllPalData().get(var1);
   }

   public AllEventModelBean bk() {
      if (this.c != null) {
         return this.c;
      } else {
         synchronized (ah) {
            if (this.c != null) {
               return this.c;
            } else {
               String var10002 = "oqoi~";
               this.j("event");
               return this.c;
            }
         }
      }
   }

   public static void bl(String var0, String var1, String var2) {
      StringBuffer var3;
      StringBuffer var10000 = var3 = new StringBuffer();
      String var10001 = "\u001a\u0018f\n\u007f\u0001pH";
      var10000.append("\tpublic ");
      var3.append(var0);
      String var10003 = "'mb~";
      var3.append(" get");
      var3.append(var0);
      String var10005 = "@:Hhb\u001aaz\u000e3@";
      var3.append("() {\n\t\tif (");
      var3.append(var1);
      String var10007 = "+:drfk#'xb~rxi*";
      var3.append("!=null) return ");
      var3.append(var1);
      String var10009 = "S\u0019a\u001a\u001bj\u0006p\u0000a\u0007}\u0001i\rwH;\u0004|\u000bx<v\u0010gA3\u0013\u0019a\u001aaz\u000e3@";
      var3.append(";\n\t\tsynchronized (lockText) {\n\t\t\tif (");
      var3.append(var1);
      String var10011 = "+:drfk#'xb~rxi*";
      var3.append("!=null) return ");
      var3.append(var1);
      String var10013 = "(b\u001aa\u001a\fv\u001ez\u000bv+\u007f\t`\u001bU\u0007a%v\u001b;J";
      var3.append(";\n\t\t\tdeviceClassForMes(\"");
      var3.append(var2);
      String var10015 = "%#<xb~rxi*";
      var3.append("\");return ");
      var3.append(var1);
      String var10017 = "(b\u001aanb\u001a\u0015";
      var3.append(";\n\t\t}\n\t}");
      System.out.println(var3);
   }

   public Map<Integer, Question> bm() {
      if (this.ar != null) {
         return this.ar;
      } else {
         synchronized (ah) {
            if (this.ar != null) {
               return this.ar;
            } else {
               String var10002 = "v\u007fbyschd";
               this.j("question");
               return this.ar;
            }
         }
      }
   }

   public AllDoorBean bn() {
      if (this.f != null) {
         return this.f;
      } else {
         synchronized (ah) {
            if (this.f != null) {
               return this.f;
            } else {
               String var10002 = "w\u0007|\u001a";
               this.j("door");
               return this.f;
            }
         }
      }
   }

   public Robots bo(String var1) {
      return this.as().getRobotsMap().get(var1);
   }

   public AllBabyResult bp() {
      if (this.d != null) {
         return this.d;
      } else {
         synchronized (ah) {
            if (this.d != null) {
               return this.d;
            } else {
               String var10002 = "q\tq\u0011a\r`\u001d\u007f\u001c";
               this.j("babyresult");
               return this.d;
            }
         }
      }
   }

   public Skill bq(String var1) {
      this.ak = this.ca();

      Iterator var2;
      for (Iterator var10000 = var2 = this.ak.keySet().iterator(); var10000.hasNext(); var10000 = var2) {
         String var3 = (String)var2.next();
         Skill var4;
         if ((var4 = this.ak.get(var3)).getSkillname().equals(var1)) {
            return var4;
         }
      }

      return null;
   }

   public List<TYCModel> br(long var1) {
      this.l();
      return this.z.get(var1);
   }

   public AllSuit bs() {
      if (this.i != null) {
         return this.i;
      } else {
         synchronized (ah) {
            if (this.i != null) {
               return this.i;
            } else {
               String var10002 = "`\u001dz\u001c";
               this.j("suit");
               return this.i;
            }
         }
      }
   }

   public AllGuide bt() {
      if (this.x != null) {
         return this.x;
      } else {
         synchronized (ah) {
            if (this.x != null) {
               return this.x;
            } else {
               String var10002 = "mrcco";
               this.j("guide");
               return this.x;
            }
         }
      }
   }

   public Map<Integer, BigDecimal> bu() {
      if (this.ag != null) {
         return this.ag;
      } else {
         synchronized (ah) {
            if (this.ag != null) {
               return this.ag;
            } else {
               String var10002 = "\rk\u0018";
               this.j("exp");
               return this.ag;
            }
         }
      }
   }

   public Map<Integer, ChongjipackBean> bv() {
      if (this.p != null) {
         return this.p;
      } else {
         synchronized (ah) {
            if (this.p != null) {
               return this.p;
            } else {
               String var10002 = "\u000b{\u0007}\u000fy\u0001c\tp\u0003";
               this.j("chongjipack");
               return this.p;
            }
         }
      }
   }

   public Class8(int var1, String var2, int var3) {
      this.j = var1;
      StringBuffer var4;
      StringBuffer var10000 = var4 = new StringBuffer();
      String var10001 = "bs~w0(%";
      var10000.append("http://");
      var4.append(var2);
      String var10003 = "R";
      var4.append(":");
      var4.append(var3);
      String var10005 = "(Mb~SRS%";
      var4.append("/GetTXT/");
      this.ao = var4.toString();
      this.n = new com.xy.n.Class3(this);
   }

   public Goodstable[] bw() {
      this.ah();
      return this.r;
   }

   public AllACard bx() {
      if (this.ad != null) {
         return this.ad;
      } else {
         synchronized (ah) {
            if (this.ad != null) {
               return this.ad;
            } else {
               String var10002 = "kdkun";
               this.j("acard");
               return this.ad;
            }
         }
      }
   }

   public List<TYC> by(String var1) {
      String var10001 = "爁琕粓";
      if (var1.equals("物理系")) {
         if (this.ab != null && this.ab.size() != 0) {
            return this.ab;
         } else {
            this.ab = ai(this.ae(var1));
            return this.ab;
         }
      } else {
         var10001 = "泟木糱";
         if (var1.equals("法术系")) {
            if (this.an != null && this.an.size() != 0) {
               return this.an;
            } else {
               this.an = ai(this.ae(var1));
               return this.an;
            }
         } else {
            var10001 = "迭劺粓";
            if (var1.equals("辅助系")) {
               if (this.aa != null && this.aa.size() != 0) {
                  return this.aa;
               } else {
                  this.aa = ai(this.ae(var1));
                  return this.aa;
               }
            } else {
               var10001 = "忄愅俩炶";
               if (var1.equals("心意修炼")) {
                  if (this.w != null && this.w.size() != 0) {
                     return this.w;
                  } else {
                     this.w = ai(this.ae(var1));
                     return this.w;
                  }
               } else {
                  return null;
               }
            }
         }
      }
   }

   public Map<Integer, GemOld> bz() {
      if (this.g != null) {
         return this.g;
      } else {
         synchronized (ah) {
            if (this.g != null) {
               return this.g;
            } else {
               String var10002 = "mbg";
               this.j("gem");
               return this.g;
            }
         }
      }
   }

   public Map<String, Skill> ca() {
      if (this.ak != null) {
         return this.ak;
      } else {
         synchronized (ah) {
            if (this.ak != null) {
               return this.ak;
            } else {
               String var10002 = "ylckf";
               this.j("skill");
               return this.ak;
            }
         }
      }
   }

   public StallBuyData cb(int var1) {
      return this.k().getBuyDataMap().get(var1);
   }

   public AllBuff cc() {
      if (this.at != null) {
         return this.at;
      } else {
         synchronized (ah) {
            if (this.at != null) {
               return this.at;
            } else {
               String var10002 = "e\u007fal";
               this.j("buff");
               return this.at;
            }
         }
      }
   }

   public Activity cd(int var1) {
      return this.ab().getActivityMap().get(var1);
   }

   public TaskData ce(int var1) {
      return this.b().getAllTaskData().get(var1);
   }

   public Map<Integer, Fly> cf() {
      if (this.b != null) {
         return this.b;
      } else {
         synchronized (ah) {
            if (this.b != null) {
               return this.b;
            } else {
               String var10002 = "\u000e\u007f\u0011";
               this.j("fly");
               return this.b;
            }
         }
      }
   }

   public AllStarSoul cg() {
      if (this.ap != null) {
         return this.ap;
      } else {
         synchronized (ah) {
            if (this.ap != null) {
               return this.ap;
            } else {
               String var10002 = "`\u001cr\u001a@\u0007f\u0004";
               this.j("starSoul");
               return this.ap;
            }
         }
      }
   }

   public Class26 ch(int var1) {
      this.bv();
      int var2 = 0;

      for (int var10000 = var2; var10000 < this.a.size(); var10000 = ++var2) {
         Class26 var3 = this.a.get(var2);
         if (var1 == var3.b) {
            return var3;
         }
      }

      return null;
   }

   public RoleTxBean ci(int var1) {
      return this.al().getTxmap().get(var1);
   }

   public TaskSet cj(int var1) {
      return this.b().getAllTaskSet().get(var1);
   }
}
