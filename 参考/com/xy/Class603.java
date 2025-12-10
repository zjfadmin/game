package com.xy;

import com.google.gson.reflect.TypeToken;
import com.xy.bean.ChongjipackBean;
import com.xy.entity.RoleSummoning;
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
import com.xy.readbean.AllXuanBao;
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
import com.xy.readbean.XuanBao;
import com.xy.readbean.XuanYin;
import com.xy.readbean.petExchange;
import java.awt.Color;
import java.awt.Point;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class603 {
   public int a;
   private AllActive b;
   private Class571 c;
   private AllGuide d;
   private Map<Integer, ChongjipackBean> e;
   private Map<Integer, Fly> f;
   private Map<Long, List<TYCModel>> g;
   private AllPal h;
   private AlchemySet i;
   public String j;
   private Map<Integer, GemOld> k;
   private AllFB l;
   private AllBabyResult m;
   private AllTx n;
   private GoodsBean o;
   private ActivitySeries p;
   private AllDoorBean q;
   private AllTitleBean r;
   private Map<String, Skill> s;
   private AllTalent t;
   private AllACard u;
   private NpcShopBean v;
   private AllTask w;
   private AllStallBuy x;
   public static Object y = new Object();
   private Map<BigDecimal, RoleSummoning> z;
   private Map<Integer, BigDecimal> aa;
   private Goodstable[] ab;
   private AllColorScheme ac;
   private AllLabor ad;
   private AllMapBean ae;
   public List<TYC> af;
   private AllNpcBean ag;
   private AllEventModelBean ah;
   public List<TYC> ai;
   private Map<String, String> aj;
   private AllBbuy ak;
   private List<Class223> al;
   private RobotsBean am;
   public List<TYC> an;
   private AllXuanBao ao;
   private AllAchieve ap;
   public List<TYC> aq;
   private AllBuff ar;
   private Map<Integer, Question> as;
   private AllStarSoul at;
   private AllPetExchange au;
   private AllFM av;
   private List<Eshop> aw;
   private AllSuit ax;

   public Title a(String var1) {
      return (Title)this.bc().getTitleMap().get(var1);
   }

   public TaskSet b(int var1) {
      return (TaskSet)this.ap().getAllTaskSet().get(var1);
   }

   public Map<Integer, BigDecimal> c() {
      if (this.aa != null) {
         return this.aa;
      } else {
         synchronized(y) {
            if (this.aa != null) {
               return this.aa;
            } else {
               this.bv("exp");
               return this.aa;
            }
         }
      }
   }

   public long d(int var1, int var2) {
      return this.ac(var1, var2);
   }

   public Shop e(String var1) {
      Iterator var2;
      Iterator var10000 = var2 = this.bz().getNpcShopMap().keySet().iterator();

      while(true) {
         while(var10000.hasNext()) {
            String var3 = (String)var2.next();
            List var5;
            if ((var5 = (List)this.bz().getNpcShopMap().get(var3)) == null) {
               var10000 = var2;
            } else {
               Iterator var4;
               for(var10000 = var4 = var5.iterator(); var10000.hasNext(); var10000 = var4) {
                  Shop var6;
                  if ((var6 = (Shop)var4.next()).getShopid().equals(var1)) {
                     return var6;
                  }
               }

               var10000 = var2;
            }
         }

         return null;
      }
   }

   public ChongjipackBean f(int var1) {
      return (ChongjipackBean)this.ag().get(var1);
   }

   public AllTalent g() {
      if (this.t != null) {
         return this.t;
      } else {
         synchronized(y) {
            if (this.t != null) {
               return this.t;
            } else {
               this.bv("talent");
               return this.t;
            }
         }
      }
   }

   public Map<BigDecimal, RoleSummoning> h() {
      if (this.z != null) {
         return this.z;
      } else {
         synchronized(y) {
            if (this.z != null) {
               return this.z;
            } else {
               this.bv("pet");
               return this.z;
            }
         }
      }
   }

   public Map<String, String> i() {
      if (this.aj != null) {
         return this.aj;
      } else {
         synchronized(y) {
            if (this.aj != null) {
               return this.aj;
            } else {
               this.bv("tyc");
               return this.aj;
            }
         }
      }
   }

   public Class471 j(long var1, Class471 var3) throws Exception {
      if (var3 == null) {
         var3 = new Class471();
      }

      var3.c = this;
      var3.l = var1;
      MapModel var4;
      int var5 = (var4 = this.ay(String.valueOf(var1))).getMapModel();
      if (var1 == 1207L && Class280.d) {
         var5 = -var5;
      }

      Class409 var6 = Class511.o(var5);
      var3.af(var4, var6);
      GameUtil.h(var4.getNpcs(), var3, this);
      return var3;
   }

   public StarSoul k(int var1) {
      return (StarSoul)this.z().getStarSoulMap().get(var1);
   }

   public List<TYC> l(String var1) {
      if (var1.equals("物理系")) {
         if (this.ai != null && this.ai.size() != 0) {
            return this.ai;
         } else {
            this.ai = y(this.bj(var1));
            return this.ai;
         }
      } else if (var1.equals("法术系")) {
         if (this.af != null && this.af.size() != 0) {
            return this.af;
         } else {
            this.af = y(this.bj(var1));
            return this.af;
         }
      } else if (var1.equals("辅助系")) {
         if (this.an != null && this.an.size() != 0) {
            return this.an;
         } else {
            this.an = y(this.bj(var1));
            return this.an;
         }
      } else if (var1.equals("心意修炼")) {
         if (this.aq != null && this.aq.size() != 0) {
            return this.aq;
         } else {
            this.aq = y(this.bj(var1));
            return this.aq;
         }
      } else {
         return null;
      }
   }

   public ActivityFC m(int var1) {
      return (ActivityFC)this.br().getActivityFCMap().get(var1);
   }

   public Goodstable n(BigDecimal var1) {
      return (Goodstable)this.cc().getAllGoodsMap().get(var1);
   }

   public AllEventModelBean o() {
      if (this.ah != null) {
         return this.ah;
      } else {
         synchronized(y) {
            if (this.ah != null) {
               return this.ah;
            } else {
               this.bv("event");
               return this.ah;
            }
         }
      }
   }

   public Buff p(int var1) {
      return this.by().getBuff(var1);
   }

   public AlchemySet q() {
      if (this.i != null) {
         return this.i;
      } else {
         synchronized(y) {
            if (this.i != null) {
               return this.i;
            } else {
               this.bv("alchemySHS");
               return this.i;
            }
         }
      }
   }

   public Class223 r(String var1) {
      this.ag();
      int var2 = 3 ^ 3;

      for(int var10000 = var2; var10000 < this.al.size(); var10000 = var2) {
         Class223 var3 = (Class223)this.al.get(var2);
         if (Class394.r(var1, var3.a)) {
            return var3;
         }

         ++var2;
      }

      return null;
   }

   public ColorScheme s(int var1) {
      this.bl();
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.ac.getAllMap().values().iterator();

      for(Iterator var10000 = var3; var10000.hasNext(); var10000 = var3) {
         ColorScheme var4;
         if ((var4 = (ColorScheme)var3.next()).getZid() == 0 || var4.getZid() == var1) {
            var2.add(var4.getId());
         }
      }

      if (var2.size() == 0) {
         return null;
      } else {
         return (ColorScheme)this.ac.getAllMap().get(var2.get(Class27.c.nextInt(var2.size())));
      }
   }

   public Fly t(int var1) {
      return (Fly)this.bd().get(var1);
   }

   public Color u(String var1) {
      if (var1 != null && var1.length() != 0) {
         Title var2;
         if ((var2 = this.a(var1)) != null && var2.getColor() != null) {
            if (var2.getColor().startsWith("#c")) {
               return Class681.c(var2.getColor().substring(3 >> 2, 92 & 43));
            } else if (var2.getColor().startsWith("#R")) {
               return Color.RED;
            } else if (var2.getColor().startsWith("#G")) {
               return Color.GREEN;
            } else if (var2.getColor().startsWith("#B")) {
               return Color.BLUE;
            } else if (var2.getColor().startsWith("#W")) {
               return Color.WHITE;
            } else if (var2.getColor().startsWith("#K")) {
               return Color.BLACK;
            } else {
               return var2.getColor().startsWith("#Y") ? Color.YELLOW : null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public AllSuit v() {
      if (this.ax != null) {
         return this.ax;
      } else {
         synchronized(y) {
            if (this.ax != null) {
               return this.ax;
            } else {
               this.bv("suit");
               return this.ax;
            }
         }
      }
   }

   public Class603(int var1, String var2, int var3) {
      this.a = var1;
      StringBuffer var4;
      (var4 = new StringBuffer()).append("http://");
      var4.append(var2);
      var4.append(":");
      var4.append(var3);
      var4.append("/GetTXT/");
      this.j = var4.toString();
      System.out.println(this.j);
      this.c = new Class571(this);
   }

   public AllActive w() {
      if (this.b != null) {
         return this.b;
      } else {
         synchronized(y) {
            if (this.b != null) {
               return this.b;
            } else {
               this.bv("active");
               return this.b;
            }
         }
      }
   }

   public RoleSummoning x(BigDecimal var1) {
      return (RoleSummoning)this.h().get(var1);
   }

   public static List<TYC> y(String var0) {
      if (var0 != null && !var0.equals("")) {
         ArrayList var1 = new ArrayList();
         String[] var2 = var0.split("\\|");

         int var3;
         for(int var10000 = var3 = 2 & 5; var10000 < var2.length; var10000 = var3) {
            TYC var4 = new TYC(var2[var3]);
            ++var3;
            var1.add(var4);
         }

         return var1;
      } else {
         return null;
      }
   }

   public AllStarSoul z() {
      if (this.at != null) {
         return this.at;
      } else {
         synchronized(y) {
            if (this.at != null) {
               return this.at;
            } else {
               this.bv("starSoul");
               return this.at;
            }
         }
      }
   }

   public PalData aa(int var1) {
      return (PalData)this.ar().getAllPalData().get(var1);
   }

   public String ab(String var1) {
      MapModel var2;
      return (var2 = this.ay(var1)) != null ? var2.getMapName() : "未知地图";
   }

   public long ac(int var1, int var2) {
      if (var2 > (7167 & 25799)) {
         var2 = 2551 & 30415;
      }

      long var3 = ((BigDecimal)this.c().get(var2)).longValue();
      if (var1 >= --3) {
         var3 *= 3L;
      }

      if (var2 > (110 & 117) && var3 < 5000000L) {
         var3 = (new BigDecimal("6181894660")).longValue();
      }

      return var3;
   }

   public boolean ad() {
      return (boolean)(this.p != null ? --1 : 0);
   }

   public ColorScheme ae(String var1) {
      this.bl();
      Iterator var3 = this.ac.getAllMap().values().iterator();

      for(Iterator var10000 = var3; var10000.hasNext(); var10000 = var3) {
         ColorScheme var2;
         if ((var2 = (ColorScheme)var3.next()).getName().equals(var1)) {
            return var2;
         }
      }

      return null;
   }

   public static void main(String[] var0) {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      be("AllXuanBao", "allXuanBao", "xuanbao");
   }

   public List<TYCModel> af(long var1) {
      this.i();
      return (List)this.g.get(var1);
   }

   public Map<Integer, ChongjipackBean> ag() {
      if (this.e != null) {
         return this.e;
      } else {
         synchronized(y) {
            if (this.e != null) {
               return this.e;
            } else {
               this.bv("chongjipack");
               return this.e;
            }
         }
      }
   }

   public AllAchieve ah() {
      if (this.ap != null) {
         return this.ap;
      } else {
         synchronized(y) {
            if (this.ap != null) {
               return this.ap;
            } else {
               this.bv("achieve");
               return this.ap;
            }
         }
      }
   }

   public Goodstable[] ai() {
      this.cc();
      return this.ab;
   }

   public AllXuanBao aj() {
      if (this.ao != null) {
         return this.ao;
      } else {
         synchronized(y) {
            if (this.ao != null) {
               return this.ao;
            } else {
               this.bv("xuanbao");
               return this.ao;
            }
         }
      }
   }

   public byte[] ak(URL var1) {
      try {
         long var2 = System.currentTimeMillis();
         ByteArrayOutputStream var4 = new ByteArrayOutputStream();
         InputStream var5 = var1.openStream();
         byte[] var10000 = new byte[13676 & 20115];
         boolean var10002 = true;
         byte[] var6 = var10000;
         int var7 = 2 & 5;

         for(InputStream var9 = var5; (var7 = var9.read(var6)) != -4 >> 2; var9 = var5) {
            var4.write(var6, 3 & 4, var7);
         }

         var4.close();
         var5.close();
         if ((var2 = System.currentTimeMillis() - var2) > 1000L) {
            System.err.println("资源下载完毕:耗时" + var2);
         }

         return var4.toByteArray();
      } catch (IOException var8) {
         System.err.println("下载资源失败 error=" + var8.getMessage() + ":" + var1.getPath());
         return null;
      }
   }

   public AllGuide al() {
      if (this.d != null) {
         return this.d;
      } else {
         synchronized(y) {
            if (this.d != null) {
               return this.d;
            } else {
               this.bv("guide");
               return this.d;
            }
         }
      }
   }

   public TaskData am(int var1) {
      return (TaskData)this.ap().getAllTaskData().get(var1);
   }

   public StallBuyData an(int var1) {
      return (StallBuyData)this.bn().getBuyDataMap().get(var1);
   }

   public XuanYin ao(int var1) {
      return (XuanYin)this.aj().getXuanyinMap().get(var1);
   }

   public AllTask ap() {
      if (this.w != null) {
         return this.w;
      } else {
         synchronized(y) {
            if (this.w != null) {
               return this.w;
            } else {
               this.bv("task");
               return this.w;
            }
         }
      }
   }

   public Activity aq(int var1) {
      return (Activity)this.br().getActivityMap().get(var1);
   }

   public AllPal ar() {
      if (this.h != null) {
         return this.h;
      } else {
         synchronized(y) {
            if (this.h != null) {
               return this.h;
            } else {
               this.bv("pal");
               return this.h;
            }
         }
      }
   }

   public petExchange as(int var1) {
      return (petExchange)this.cn().getAllPetExchange().get(var1);
   }

   public Robots at(String var1) {
      return (Robots)this.cp().getRobotsMap().get(var1);
   }

   public AllLabor au() {
      if (this.ad != null) {
         return this.ad;
      } else {
         synchronized(y) {
            if (this.ad != null) {
               return this.ad;
            } else {
               this.bv("labor");
               return this.ad;
            }
         }
      }
   }

   public Activity av() {
      return this.br().getActivityPetManual();
   }

   public long aw(int var1, int var2) {
      return (long)((double)this.d(var1, var2) * 0.7D);
   }

   public AllTx ax() {
      if (this.n != null) {
         return this.n;
      } else {
         synchronized(y) {
            if (this.n != null) {
               return this.n;
            } else {
               this.bv("tx");
               return this.n;
            }
         }
      }
   }

   public MapModel ay(String var1) {
      return (MapModel)this.bb().getAllMap().get(var1);
   }

   public AllDoorBean az() {
      if (this.q != null) {
         return this.q;
      } else {
         synchronized(y) {
            if (this.q != null) {
               return this.q;
            } else {
               this.bv("door");
               return this.q;
            }
         }
      }
   }

   public List<Eshop> ba() {
      if (this.aw != null) {
         return this.aw;
      } else {
         synchronized(y) {
            if (this.aw != null) {
               return this.aw;
            } else {
               this.bv("eshop");
               return this.aw;
            }
         }
      }
   }

   public AllMapBean bb() {
      if (this.ae != null) {
         return this.ae;
      } else {
         synchronized(y) {
            if (this.ae != null) {
               return this.ae;
            } else {
               this.bv("map");
               return this.ae;
            }
         }
      }
   }

   public AllTitleBean bc() {
      if (this.r != null) {
         return this.r;
      } else {
         synchronized(y) {
            if (this.r != null) {
               return this.r;
            } else {
               this.bv("title");
               return this.r;
            }
         }
      }
   }

   public Map<Integer, Fly> bd() {
      if (this.f != null) {
         return this.f;
      } else {
         synchronized(y) {
            if (this.f != null) {
               return this.f;
            } else {
               this.bv("fly");
               return this.f;
            }
         }
      }
   }

   public static void be(String var0, String var1, String var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("\tpublic ");
      var3.append(var0);
      var3.append(" get");
      var3.append(var0);
      var3.append("() {\n\t\tif (");
      var3.append(var1);
      var3.append("!=null) return ");
      var3.append(var1);
      var3.append(";\n\t\tsynchronized (lockText) {\n\t\t\tif (");
      var3.append(var1);
      var3.append("!=null) return ");
      var3.append(var1);
      var3.append(";\n\t\t\tdeviceClassForMes(\"");
      var3.append(var2);
      var3.append("\");return ");
      var3.append(var1);
      var3.append(";\n\t\t}\n\t}");
      System.out.println(var3);
   }

   public Skill bf(String var1) {
      return (Skill)this.ci().get(var1);
   }

   public Skill bg(String var1) {
      this.s = this.ci();

      Iterator var2;
      for(Iterator var10000 = var2 = this.s.keySet().iterator(); var10000.hasNext(); var10000 = var2) {
         String var3 = (String)var2.next();
         Skill var4;
         if ((var4 = (Skill)this.s.get(var3)).getSkillname().equals(var1)) {
            return var4;
         }
      }

      return null;
   }

   public AllFB bh() {
      if (this.l != null) {
         return this.l;
      } else {
         synchronized(y) {
            if (this.l != null) {
               return this.l;
            } else {
               this.bv("fb");
               return this.l;
            }
         }
      }
   }

   public BabyResult bi(String var1) {
      this.bu();
      int var2 = this.m.getAllBabyResults().size() - (2 ^ 3);

      for(int var10000 = var2; var10000 >= 0; var10000 = var2) {
         BabyResult var3;
         if ((var3 = (BabyResult)this.m.getAllBabyResults().get(var2)).getNan().equals(var1)) {
            return var3;
         }

         if (var3.getNv().equals(var1)) {
            return var3;
         }

         --var2;
      }

      return null;
   }

   public String bj(String var1) {
      return (String)this.i().get(var1);
   }

   public List<ChongjipackBean> bk(int var1, String var2) {
      ArrayList var3 = new ArrayList();
      Iterator var5;
      Iterator var10000 = var5 = this.ag().values().iterator();

      while(true) {
         label33:
         while(var10000.hasNext()) {
            ChongjipackBean var4;
            if ((var4 = (ChongjipackBean)var5.next()).getPacktype() == var1) {
               if (!Class394.r(var4.getPackname(), var2)) {
                  var10000 = var5;
                  continue;
               }

               int var6;
               for(int var7 = var6 = 0; var7 < var3.size(); var7 = var6) {
                  if (var4.getPackgradetype() <= ((ChongjipackBean)var3.get(var6)).getPackgradetype()) {
                     var3.add(var6, var4);
                     var10000 = var5;
                     continue label33;
                  }

                  ++var6;
               }

               var3.add(var4);
            }

            var10000 = var5;
         }

         return var3;
      }
   }

   public AllColorScheme bl() {
      if (this.ac != null) {
         return this.ac;
      } else {
         synchronized(y) {
            if (this.ac != null) {
               return this.ac;
            } else {
               this.bv("color");
               return this.ac;
            }
         }
      }
   }

   public AllFM bm() {
      if (this.av != null) {
         return this.av;
      } else {
         synchronized(y) {
            if (this.av != null) {
               return this.av;
            } else {
               this.bv("fm");
               return this.av;
            }
         }
      }
   }

   public AllStallBuy bn() {
      if (this.x != null) {
         return this.x;
      } else {
         synchronized(y) {
            if (this.x != null) {
               return this.x;
            } else {
               this.bv("stallbuy");
               return this.x;
            }
         }
      }
   }

   public Door bo(String var1) {
      return (Door)this.az().getAlldoor().get(var1);
   }

   public AllNpcBean bp() {
      if (this.ag != null) {
         return this.ag;
      } else {
         synchronized(y) {
            if (this.ag != null) {
               return this.ag;
            } else {
               this.bv("npc");
               return this.ag;
            }
         }
      }
   }

   public Map<Integer, GemOld> bq() {
      if (this.k != null) {
         return this.k;
      } else {
         synchronized(y) {
            if (this.k != null) {
               return this.k;
            } else {
               this.bv("gem");
               return this.k;
            }
         }
      }
   }

   public ActivitySeries br() {
      if (this.p != null) {
         return this.p;
      } else {
         synchronized(y) {
            if (this.p != null) {
               return this.p;
            } else {
               this.bv("ActivitySeries");
               return this.p;
            }
         }
      }
   }

   public Bbuy bs(BigDecimal var1) {
      return (Bbuy)this.cf().getAllbbuy().get(var1.intValue());
   }

   public List<ChongjipackBean> bt(int var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3;
      Iterator var10000 = var3 = this.ag().values().iterator();

      while(true) {
         label29:
         while(var10000.hasNext()) {
            ChongjipackBean var4;
            if ((var4 = (ChongjipackBean)var3.next()).getPacktype() != var1) {
               var10000 = var3;
            } else {
               int var5;
               for(int var6 = var5 = 0; var6 < var2.size(); var6 = var5) {
                  if (var4.getPackgradetype() <= ((ChongjipackBean)var2.get(var5)).getPackgradetype()) {
                     var2.add(var5, var4);
                     var10000 = var3;
                     continue label29;
                  }

                  ++var5;
               }

               var10000 = var3;
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   public AllBabyResult bu() {
      if (this.m != null) {
         return this.m;
      } else {
         synchronized(y) {
            if (this.m != null) {
               return this.m;
            } else {
               this.bv("babyresult");
               return this.m;
            }
         }
      }
   }

   public void bv(String var1) {
      String var2 = this.cm(var1 + ".txt");
      Map var41;
      int var73;
      Iterator var75;
      switch(var1.hashCode()) {
      case -1726141466:
         while(false) {
         }

         if (!var1.equals("xuanbao")) {
            return;
         } else {
            AllXuanBao var72 = (AllXuanBao)Class695.b().fromJson(var2, AllXuanBao.class);
            var72.a();
            this.ao = var72;
         }
      default:
         return;
      case -1422950650:
         if (!var1.equals("active")) {
            return;
         }

         AllActive var61 = (AllActive)Class695.b().fromJson(var2, AllActive.class);
         this.b = var61;
         return;
      case -1172895151:
         if (!var1.equals("achieve")) {
            return;
         }

         AllAchieve var55 = (AllAchieve)Class695.b().fromJson(var2, AllAchieve.class);
         this.ap = var55;
         return;
      case -1165870106:
         if (!var1.equals("question")) {
            return;
         }

         Map var64 = (Map)Class695.b().fromJson(var2, (new TypeToken<Map<Integer, Question>>() {
         }).getType());
         this.as = var64;
         return;
      case -1036776069:
         if (!var1.equals("chongjipack")) {
            return;
         } else {
            var41 = (Map)Class695.b().fromJson(var2, (new TypeToken<Map<Integer, ChongjipackBean>>() {
            }).getType());
            ArrayList var53 = new ArrayList();
            Iterator var68;
            var75 = var68 = var41.values().iterator();

            while(true) {
               label367:
               while(var75.hasNext()) {
                  ChongjipackBean var66;
                  if ((var66 = (ChongjipackBean)var68.next()).getPacktype() == (31 & 107)) {
                     int var70 = var66.getHuitime().indexOf("|");
                     Point var23;
                     Point var10001 = var23 = new Point();
                     var23.x = Class394.b(var66.getHuitime(), 2 & 5, var70);
                     var10001.y = Class394.b(var66.getHuitime(), var70 + (5 >> 2), var66.getHuitime().length());
                     var66.setPointLvl(var10001);
                     var66.setHuitime((String)null);

                     Iterator var43;
                     for(var75 = var43 = var53.iterator(); var75.hasNext(); var75 = var43) {
                        Class223 var38;
                        if (Class394.r((var38 = (Class223)var43.next()).a, var66.getPackname())) {
                           var75 = var68;
                           var38.b = Math.min(var38.b, (long)var66.getPackgradetype());
                           continue label367;
                        }
                     }

                     var53.add(new Class223(var66.getPackname(), (long)var66.getPackgradetype()));
                  }

                  var75 = var68;
               }

               int var67;
               for(var73 = var67 = 0; var73 < var53.size() - 1; var73 = var67) {
                  int var69;
                  for(var73 = var69 = 1; var73 < var53.size() - var67; var73 = var69) {
                     if (((Class223)var53.get(var69 - 1)).b > ((Class223)var53.get(var69)).b) {
                        Class223 var71 = (Class223)var53.get(var69 - 1);
                        var53.set(var69 - 1, (Class223)var53.get(var69));
                        var53.set(var69, var71);
                     }

                     ++var69;
                  }

                  ++var67;
               }

               for(var73 = var67 = 0; var73 < var53.size(); var73 = var67) {
                  ((Class223)var53.get(var67)).b = (long)((22 & 127) + var67++);
               }

               this.e = var41;
               this.al = var53;
               return;
            }
         }
      case -925703351:
         if (!var1.equals("robots")) {
            return;
         }

         RobotsBean var40 = (RobotsBean)Class695.b().fromJson(var2, RobotsBean.class);
         this.am = var40;
         return;
      case -881086228:
         if (!var1.equals("talent")) {
            return;
         }

         AllTalent var46 = (AllTalent)Class695.b().fromJson(var2, AllTalent.class);
         this.t = var46;
         return;
      case 3260:
         if (!var1.equals("fb")) {
            return;
         }

         AllFB var57 = (AllFB)Class695.b().fromJson(var2, AllFB.class);
         this.l = var57;
         return;
      case 3271:
         if (!var1.equals("fm")) {
            return;
         }

         AllFM var59 = (AllFM)Class695.b().fromJson(var2, AllFM.class);
         this.av = var59;
         return;
      case 3716:
         if (!var1.equals("tx")) {
            return;
         }

         AllTx var44 = (AllTx)Class695.b().fromJson(var2, AllTx.class);
         this.n = var44;
         return;
      case 100893:
         if (!var1.equals("exp")) {
            return;
         }

         RoleExpBean var42 = (RoleExpBean)Class695.b().fromJson(var2, RoleExpBean.class);
         this.aa = var42.getRolePetExpMap();
         return;
      case 101491:
         if (!var1.equals("fly")) {
            return;
         }

         Map var65 = (Map)Class695.b().fromJson(var2, (new TypeToken<Map<Integer, Fly>>() {
         }).getType());
         this.f = var65;
         return;
      case 102223:
         if (!var1.equals("gem")) {
            return;
         }

         var41 = (Map)Class695.b().fromJson(var2, (new TypeToken<Map<Integer, GemOld>>() {
         }).getType());
         this.k = var41;
         return;
      case 107868:
         if (!var1.equals("map")) {
            return;
         }

         AllMapBean var39 = (AllMapBean)Class695.b().fromJson(var2, AllMapBean.class);
         this.ae = var39;
         return;
      case 109281:
         if (!var1.equals("npc")) {
            return;
         }

         AllNpcBean var37 = (AllNpcBean)Class695.b().fromJson(var2, AllNpcBean.class);
         this.ag = var37;
         return;
      case 110747:
         if (!var1.equals("pal")) {
            return;
         }

         AllPal var51 = (AllPal)Class695.b().fromJson(var2, AllPal.class);
         this.h = var51;
         return;
      case 110879:
         if (!var1.equals("pet")) {
            return;
         }

         Map var22 = (Map)Class695.b().fromJson(var2, (new TypeToken<Map<BigDecimal, RoleSummoning>>() {
         }).getType());
         this.z = var22;
         return;
      case 115326:
         if (!var1.equals("tyc")) {
            return;
         } else {
            HashMap var35 = (HashMap)Class695.b().fromJson(var2, HashMap.class);
            HashMap var52 = new HashMap();
            Iterator var36;
            var75 = var36 = var35.entrySet().iterator();

            while(true) {
               while(var75.hasNext()) {
                  Entry var47;
                  String var49;
                  if (!(var49 = (String)(var47 = (Entry)var36.next()).getKey()).startsWith("新天演策-")) {
                     var75 = var36;
                  } else {
                     label331: {
                        String var50 = var49.substring(--5);
                        int var31 = -4 >> 2;
                        int var11 = 3 ^ 3;
                        if (var50.equals("男人")) {
                           var31 = 2 & 5;
                           var11 = --1;
                           var73 = var31;
                        } else if (var50.equals("女人")) {
                           var31 = 3 ^ 3;
                           var11 = 1 ^ 3;
                           var73 = var31;
                        } else if (var50.equals("男魔")) {
                           var31 = 3 >> 2;
                           var11 = --3;
                           var73 = var31;
                        } else if (var50.equals("女魔")) {
                           var31 = 5 >> 3;
                           var11 = --4;
                           var73 = var31;
                        } else if (var50.equals("男仙")) {
                           var31 = 2 & 5;
                           var11 = --5;
                           var73 = var31;
                        } else if (var50.equals("女仙")) {
                           var31 = 3 ^ 3;
                           var11 = 110 & 23;
                           var73 = var31;
                        } else if (var50.equals("男鬼")) {
                           var31 = 2 & 5;
                           var11 = 111 & 23;
                           var73 = var31;
                        } else if (var50.equals("女鬼")) {
                           var31 = 3 ^ 3;
                           var11 = 28 & 107;
                           var73 = var31;
                        } else if (var50.equals("男龙")) {
                           var31 = 2 & 5;
                           var11 = 9 & 127;
                           var73 = var31;
                        } else if (var50.equals("女龙")) {
                           var31 = 3 ^ 3;
                           var11 = 62 & 75;
                           var73 = var31;
                        } else {
                           int var12;
                           if ((var12 = var50.indexOf("#")) != -4 >> 2) {
                              int var13 = SkillUtil.getSmIndex(var50.substring(3 & 4, var12));
                              int var14 = SkillUtil.getSmIndex(var50.substring(var12 + (5 >> 2)));
                              if (var13 == 0 || var14 == 0) {
                                 break label331;
                              }

                              if (var13 == var14) {
                                 var75 = var36;
                                 continue;
                              }

                              if (var13 > var14) {
                                 var73 = var13;
                                 var13 = var14;
                                 var14 = var73;
                              }

                              var31 = 2;
                              var11 = var14 << (42 & 93) | var13;
                              var73 = var31;
                           } else {
                              var31 = 1;
                              var11 = SkillUtil.getSmIndex(var50);
                              var73 = var31;
                           }
                        }

                        if (var73 != -1) {
                           if (var11 == 0) {
                              var75 = var36;
                              continue;
                           }

                           String var54 = (String)var47.getValue();
                           LinkedList var56 = new LinkedList();
                           String[] var58 = var54.split("\\|");
                           int var60 = var31 == 0 ? 3 & 4 : 1;

                           int var62;
                           for(var73 = var62 = 3 ^ 3; var73 < var58.length; var73 = var62) {
                              String[] var63 = var58[var62].split("#");

                              int var18;
                              for(var73 = var18 = 3 >> 2; var73 < var63.length; var73 = var18) {
                                 TYCModel var19 = new TYCModel(var31, var11, var18);
                                 var19.setLvl(var60 + var62);
                                 String var10003 = var63[var18];
                                 ++var18;
                                 var19.setSkillId(Integer.parseInt(var10003));
                                 var56.add(var19);
                              }

                              ++var62;
                           }

                           var52.put((long)var31 << (49 & 110) | (long)var11, var56);
                           var36.remove();
                        }
                     }

                     var75 = var36;
                  }
               }

               this.aj = var35;
               this.g = var52;
               return;
            }
         }
      case 3017444:
         if (!var1.equals("bbuy")) {
            return;
         }

         AllBbuy var34 = (AllBbuy)Class695.b().fromJson(var2, AllBbuy.class);
         this.ak = var34;
         return;
      case 3035219:
         if (!var1.equals("buff")) {
            return;
         }

         AllBuff var15 = (AllBuff)Class695.b().fromJson(var2, AllBuff.class);
         this.ar = var15;
         return;
      case 3089326:
         if (!var1.equals("door")) {
            return;
         }

         AllDoorBean var33 = (AllDoorBean)Class695.b().fromJson(var2, AllDoorBean.class);
         this.q = var33;
         return;
      case 3541773:
         if (!var1.equals("suit")) {
            return;
         }

         AllSuit var32 = (AllSuit)Class695.b().fromJson(var2, AllSuit.class);
         this.ax = var32;
         return;
      case 3552645:
         if (!var1.equals("task")) {
            return;
         }

         AllTask var45 = (AllTask)Class695.b().fromJson(var2, AllTask.class);
         var45.a();
         this.w = var45;
         return;
      case 92627697:
         if (!var1.equals("acard")) {
            return;
         }

         AllACard var7 = (AllACard)Class695.b().fromJson(var2, AllACard.class);
         this.u = var7;
         return;
      case 94842723:
         if (!var1.equals("color")) {
            return;
         }

         AllColorScheme var30 = (AllColorScheme)Class695.b().fromJson(var2, AllColorScheme.class);
         this.ac = var30;
         return;
      case 96805083:
         if (!var1.equals("eshop")) {
            return;
         }

         EshopBean var29 = (EshopBean)Class695.b().fromJson(var2, EshopBean.class);
         this.aw = var29.getEshops();
         return;
      case 96891546:
         if (!var1.equals("event")) {
            return;
         }

         AllEventModelBean var48 = (AllEventModelBean)Class695.b().fromJson(var2, AllEventModelBean.class);
         this.ah = var48;
         return;
      case 98539350:
         if (!var1.equals("goods")) {
            return;
         } else {
            GoodsBean var28 = (GoodsBean)Class695.b().fromJson(var2, GoodsBean.class);
            Goodstable[] var10000 = new Goodstable[123 & 28];
            boolean var10002 = true;
            Goodstable[] var10 = var10000;
            int var4 = 3 & 4;

            int var5;
            for(var73 = var5 = 123 & 54; var73 < 74; var73 = var5) {
               Goodstable var6;
               if ((var6 = (Goodstable)var28.getAllGoodsMap().remove(new BigDecimal(var5))) != null) {
                  var10[var4] = var6;
                  var10[var4].setRgid(var10[var4++].getGoodsid());
               }

               ++var5;
            }

            var28.a();
            this.o = var28;
            this.ab = var10;
            return;
         }
      case 98712316:
         if (!var1.equals("guide")) {
            return;
         }

         AllGuide var27 = (AllGuide)Class695.b().fromJson(var2, AllGuide.class);
         this.d = var27;
         return;
      case 102727728:
         if (!var1.equals("labor")) {
            return;
         }

         AllLabor var17 = (AllLabor)Class695.b().fromJson(var2, AllLabor.class);
         this.ad = var17;
         return;
      case 109496913:
         if (!var1.equals("skill")) {
            return;
         }

         SkillBean var26 = (SkillBean)Class695.b().fromJson(var2, SkillBean.class);
         var26.a();
         this.s = var26.getSkillMap();
         return;
      case 110371416:
         if (!var1.equals("title")) {
            return;
         } else {
            AllTitleBean var8;
            if (var2 != null) {
               var8 = (AllTitleBean)Class695.b().fromJson(var2, AllTitleBean.class);
               this.r = var8;
               return;
            }

            var8 = new AllTitleBean();
            HashMap var9 = new HashMap();
            var8.setTitleMap(var9);
            this.r = var8;
            return;
         }
      case 780014690:
         if (!var1.equals("petExchange")) {
            return;
         }

         AllPetExchange var3 = (AllPetExchange)Class695.b().fromJson(var2, AllPetExchange.class);
         this.au = var3;
         return;
      case 880075398:
         if (!var1.equals("ActivitySeries")) {
            return;
         }

         ActivitySeries var20 = (ActivitySeries)Class695.b().fromJson(var2, ActivitySeries.class);
         var20.a();
         this.p = var20;
         return;
      case 1063146611:
         if (!var1.equals("babyresult")) {
            return;
         }

         AllBabyResult var25 = (AllBabyResult)Class695.b().fromJson(var2, AllBabyResult.class);
         this.m = var25;
         return;
      case 1311020774:
         if (!var1.equals("stallbuy")) {
            return;
         }

         AllStallBuy var21 = (AllStallBuy)Class695.b().fromJson(var2, AllStallBuy.class);
         var21.a();
         this.x = var21;
         return;
      case 1315829605:
         if (!var1.equals("starSoul")) {
            return;
         }

         AllStarSoul var16 = (AllStarSoul)Class695.b().fromJson(var2, AllStarSoul.class);
         this.at = var16;
         return;
      case 2028001277:
         if (!var1.equals("alchemySHS")) {
            return;
         }

         this.i = new AlchemySet(var2);
         return;
      case 2142580055:
         if (var1.equals("npcshop")) {
            NpcShopBean var24 = (NpcShopBean)Class695.b().fromJson(var2, NpcShopBean.class);
            this.v = var24;
         }
      }
   }

   public RoleTxBean bw(int var1) {
      return (RoleTxBean)this.ax().getTxmap().get(var1);
   }

   public RoleSuitBean bx(int var1) {
      return (RoleSuitBean)this.v().getRolesuit().get(var1);
   }

   public AllBuff by() {
      if (this.ar != null) {
         return this.ar;
      } else {
         synchronized(y) {
            if (this.ar != null) {
               return this.ar;
            } else {
               this.bv("buff");
               return this.ar;
            }
         }
      }
   }

   public NpcShopBean bz() {
      if (this.v != null) {
         return this.v;
      } else {
         synchronized(y) {
            if (this.v != null) {
               return this.v;
            } else {
               this.bv("npcshop");
               return this.v;
            }
         }
      }
   }

   public Class571 ca() {
      return this.c;
   }

   public XuanBao cb(int var1) {
      return (XuanBao)this.aj().getXuanbaoMap().get(var1);
   }

   public GoodsBean cc() {
      if (this.o != null) {
         return this.o;
      } else {
         synchronized(y) {
            if (this.o != null) {
               return this.o;
            } else {
               this.bv("goods");
               return this.o;
            }
         }
      }
   }

   public Question cd(int var1) {
      return (Question)this.ch().get(var1);
   }

   public AllACard ce() {
      if (this.u != null) {
         return this.u;
      } else {
         synchronized(y) {
            if (this.u != null) {
               return this.u;
            } else {
               this.bv("acard");
               return this.u;
            }
         }
      }
   }

   public AllBbuy cf() {
      if (this.ak != null) {
         return this.ak;
      } else {
         synchronized(y) {
            if (this.ak != null) {
               return this.ak;
            } else {
               this.bv("bbuy");
               return this.ak;
            }
         }
      }
   }

   public Talent cg(int var1) {
      return (Talent)this.g().getAllTalent().get(var1);
   }

   public Map<Integer, Question> ch() {
      if (this.as != null) {
         return this.as;
      } else {
         synchronized(y) {
            if (this.as != null) {
               return this.as;
            } else {
               this.bv("question");
               return this.as;
            }
         }
      }
   }

   public Map<String, Skill> ci() {
      if (this.s != null) {
         return this.s;
      } else {
         synchronized(y) {
            if (this.s != null) {
               return this.s;
            } else {
               this.bv("skill");
               return this.s;
            }
         }
      }
   }

   public String cj(int var1) {
      ActivityFC var2 = var1 != 0 ? this.m(var1) : null;
      return var2 != null ? var2.getValue() : null;
   }

   public NpcInfoBean ck(String var1) {
      return (NpcInfoBean)this.bp().getAllNpcInfo().get(var1);
   }

   public GemOld cl(int var1) {
      return (GemOld)this.bq().get(var1);
   }

   public String cm(String var1) {
      String var2 = null;

      try {
         byte[] var4;
         if ((var4 = this.ak(new URL(this.j + var1 + "?" + System.currentTimeMillis()))) == null) {
            Thread.sleep(2000L);
            System.out.println("二次加载:" + var1);
            var4 = this.ak(new URL(this.j + var1 + "?" + System.currentTimeMillis()));
         }

         if (var4 == null) {
            return null;
         } else {
            var2 = Class142.e(new String(var4, Class142.e));
            return var2;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         return null;
      }
   }

   public AllPetExchange cn() {
      if (this.au != null) {
         return this.au;
      } else {
         synchronized(y) {
            if (this.au != null) {
               return this.au;
            } else {
               this.bv("petExchange");
               return this.au;
            }
         }
      }
   }

   public Class223 co(int var1) {
      this.ag();
      int var2 = 3 >> 2;

      for(int var10000 = var2; var10000 < this.al.size(); var10000 = var2) {
         Class223 var3 = (Class223)this.al.get(var2);
         if ((long)var1 == var3.b) {
            return var3;
         }

         ++var2;
      }

      return null;
   }

   public RobotsBean cp() {
      if (this.am != null) {
         return this.am;
      } else {
         synchronized(y) {
            if (this.am != null) {
               return this.am;
            } else {
               this.bv("robots");
               return this.am;
            }
         }
      }
   }

   public Activity cq() {
      return this.br().getActivityBeau();
   }
}
