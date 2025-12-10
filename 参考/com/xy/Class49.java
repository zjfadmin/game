package com.xy;

import com.xy.bean.RoleShow;
import com.xy.formula.FormulaNum;
import com.xy.formula.GoodType;
import com.xy.game.GameMove;
import com.xy.game.GameUtil;
import com.xy.game.HandleOption;
import com.xy.game.RoleData;
import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.richtext.InputBean;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Class49 extends Class345 {
   private <undefinedtype> ase;
   private Class322 asf;
   private Class436[] asg;
   private int adv;
   private double ash;
   private Class604 asi;
   private <undefinedtype>[] asj;
   private int xy;
   private Class322 ask;
   private Image asl;
   private Class322 asm;
   private String aom;
   private Image[] asn;
   private boolean ku;
   private String vt;
   private List<null> aso;
   private List<null> ep;
   private Class245 ga;
   private JComponent asp;
   private List<Class322> vz;
   private static Class8 afi;
   private MapModel qe;
   private Class116 asq;
   private Class245 ac;
   private double asr;
   private <undefinedtype> ass;
   private Image rv;

   public void ahw(int var1, Object var2, Class93 var3) {
      if (var1 == (815 & 32223)) {
         NpcInfoBean var4;
         if ((var4 = this.vc().ck(String.valueOf(var2))) != null) {
            if (this.ase == null) {
               this.ase = new MouseListener() {
                  private InputBean awy;
                  private RichLabel bw;
                  private List<RichLabel> ez;

                  public void mouseClicked(MouseEvent var1) {
                  }

                  public void amh(NpcInfoBean var1) {
                     this.awy = null;
                     Class603 var5 = Class49.this.vc();
                     int var2;
                     Object var7;
                     int var10000;
                     if ((var7 = var1.getDoors()) == null && !Class394.o(var1.getNpctable().getNpcway())) {
                        var7 = new ArrayList();
                        String var4 = var1.getNpctable().getNpcway();
                        var2 = 3 ^ 3;

                        int var6;
                        for(var10000 = var6 = 3 ^ 3; var10000 != var4.length(); var10000 = var6) {
                           if ((var6 = var4.indexOf("|", var2 + (3 & 5))) == -4 >> 2) {
                              var6 = var4.length();
                           }

                           FormulaNum var3 = new FormulaNum(var4.substring(var2, var6));
                           int var8 = 3 & 4;
                           int var9 = var3.getSize();

                           for(var10000 = var8; var10000 < var9; var10000 = var8) {
                              long var10 = var3.getZhi(var8);
                              Door var12;
                              if ((var12 = var5.bo(String.valueOf(var10))) != null) {
                                 ((List)var7).add(var12);
                              }

                              ++var8;
                           }

                           var2 = var6 + (4 ^ 5);
                        }

                        var1.setDoors((List)var7);
                     }

                     int var14 = var7 != null ? ((List)var7).size() : 0;

                     for(var10000 = var2 = 3 & 4; var10000 < var14; var10000 = var2) {
                        Door var15 = (Door)((List)var7).get(var2);
                        RichLabel var13 = var2 < this.ez.size() ? (RichLabel)this.ez.get(var2) : null;
                        if (var13 == null) {
                           var13 = new RichLabel("", Class681.ce);
                           this.ez.add(var13);
                           this.add(var13);
                        }

                        MapModel var16 = var5.ay(var15.getDoormap());
                        InputBean var17 = new InputBean(63 & 77);
                        var17.setId(new BigDecimal(var15.getDoorid()));
                        var17.setName(var16 != null ? var16.getMapName() : "未知地图");
                        StringBuffer var18;
                        (var18 = new StringBuffer()).append("#Y");
                        var18.append("#V");
                        var18.append(Class695.b().toJson(var17));
                        var18.append("#L");
                        int var10005 = 3 & 5;
                        int var10007 = 119 & 15;
                        var13.setTextSize(var18.toString(), 13244 & 19703);
                        int var10008 = (60 & 99) + var2 * (119 & 30);
                        int var10009 = var13.getWidth();
                        ++var2;
                        var13.setBounds(var10007, var10008, var10009, 30 & 119);
                        var13.setVisible((boolean)var10005);
                     }

                     for(var10000 = var2 = var14; var10000 < this.ez.size(); var10000 = var2) {
                        Object var19 = this.ez.get(var2);
                        ++var2;
                        ((RichLabel)var19).setVisible((boolean)(2 & 5));
                     }

                     this.setBounds(5 >> 3, 5 >> 3, 3067 & 29885, Math.max(90 & 127, (126 & 47) + var14 * (95 & 54)));
                  }

                  public void mouseExited(MouseEvent var1) {
                  }

                  public void mousePressed(MouseEvent var1) {
                     if (var1.isMetaDown()) {
                        Class49.this.ase.setVisible((boolean)(3 >> 2));
                     } else {
                        int var2;
                        for(int var10000 = var2 = 0; var10000 < this.ez.size(); var10000 = var2) {
                           RichLabel var3;
                           if (!(var3 = (RichLabel)this.ez.get(var2)).isVisible()) {
                              return;
                           }

                           this.awy = var3.isMonitor(var1.getX() - var3.getX(), var1.getY() - var3.getY());
                           if (this.awy != null) {
                              this.awy.setM((boolean)(3 >> 1));
                              return;
                           }

                           ++var2;
                        }

                     }
                  }

                  public {
                     this.bw = new RichLabel("#Y可传送到以下地点:", Class681.ce, 12532 & 20415);
                     this.bw.setBounds(71 & 63, 63 & 75, this.bw.getWidth(), this.bw.getHeight());
                     this.add(this.bw);
                     this.addMouseListener(this);
                     this.ez = new ArrayList();
                  }

                  public void mouseReleased(MouseEvent var1) {
                     if (this.awy != null) {
                        this.awy.setM((boolean)(3 & 4));
                        Door var4;
                        MapModel var2 = (var4 = Class49.this.vc().bo(this.awy.getId().toString())) != null ? Class49.this.vc().ay(var4.getDoormap()) : null;
                        if (var2 == null) {
                           return;
                        }

                        if (!Class49.this.aip(var2)) {
                           return;
                        }

                        int var6 = var4.getDoorpoint().indexOf("|");
                        int var3 = Class394.b(var4.getDoorpoint(), 3 >> 2, var6);
                        int var5 = Class394.b(var4.getDoorpoint(), var6 + (3 >> 1), var4.getDoorpoint().length());
                        var3 = (int)((double)var3 / Class49.this.asr - 13.0D);
                        var5 = (int)((double)var5 / Class49.this.asr - 6.0D);
                        var3 += Class49.this.asg[1 ^ 3].getX();
                        var5 += Class49.this.asg[--2].getY();
                        Class49.this.xy = var3;
                        Class49.this.adv = var5;
                        Class49.this.ku = (boolean)(5 >> 2);
                     }

                  }

                  public void mouseEntered(MouseEvent var1) {
                  }
               };
            }

            this.ase.amh(var4);
            Point var5 = GameView.abi(var3.getX(), var3.getY(), this.ase.getWidth(), this.ase.getHeight(), this.getWidth(), this.getHeight());
            this.ase.setBounds(var5.x, var5.y, this.ase.getWidth(), this.ase.getHeight());
            this.add(this.ase, 2 & 5);
            this.ase.setVisible((boolean)(3 & 5));
         }
      } else {
         if (var1 == (14236 & 18803)) {
            ((Class4)this.ve().e(9213 & 23711)).iv(this.qe);
         }

      }
   }

   public void ahy(MapModel var1, NpcInfoBean var2) {
      NpcInfoBean var10000;
      if (this.qe != null && this.qe.getMapId() == var1.getMapId()) {
         var10000 = var2;
         this.o();
      } else {
         if (!this.aip(var1)) {
            return;
         }

         var10000 = var2;
      }

      int var4 = Integer.parseInt(var10000.getNpctable().getTx());
      int var3 = Integer.parseInt(var2.getNpctable().getTy());
      this.ass = (<undefinedtype>)(new Object((int)((double)var4 / this.asr - 4.5D), (int)((double)var3 / this.ash - 4.5D), var2.getNpctable().getNpcname()) {
         private int b;
         private int c;
         private int d;
         private String e;
         private int f;
         private int g;

         public {
            this.g = var2;
            this.c = var3;
            this.e = var4 != null ? var4 : "";
         }

         public void a(Graphics var1) {
            var1.setFont(Class681.bm);
            var1.setColor(Color.green);
            if (this.f == 0) {
               this.f = var1.getFontMetrics().stringWidth(this.e);
               this.d = this.g + (14 & 125);
               this.b = this.c + (91 & 44);
            }

            var1.drawString(this.e, this.d, this.b);
            if (Class280.l() / 100L % 2L == 0L) {
               if (Class49.this.rv == null) {
                  Class49.this.rv = Class511.a("sc/e/111.png");
               }

               var1.drawImage(Class49.this.rv, this.g, this.c, (ImageObserver)null);
            } else {
               if (Class49.this.asl == null) {
                  Class49.this.asl = Class511.a("sc/e/112.png");
               }

               var1.drawImage(Class49.this.asl, this.g, this.c, (ImageObserver)null);
            }
         }
      });
      <undefinedtype> var10002 = this.ass;
      var10002.g = var10002.g + this.asg[1 ^ 3].getX();
      <undefinedtype> var10001 = this.ass;
      var10001.c = var10001.c + this.asg[5 >> 1].getY();
      this.ve().a(this.ae());
   }

   public void o() {
      RoleData var5 = this.vd();
      ArrayList var4 = new ArrayList();

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < var5.goodPacks.length; var10000 = var3) {
         GoodFight var1;
         Goodstable var2;
         if ((var2 = var5.getGood(var5.goodPacks[var3])) != null && GoodType.au(var2.getType()) && (var1 = var2.getFight()) != null) {
            for(; var1 != null; var1 = var1.getNextFight()) {
               if ((long)var1.getMap() == this.qe.getMapId()) {
                  Object var6 = new Object(var2.getRgid(), var1) {
                     private int b;
                     private int c;
                     private GoodFight d;
                     private BigDecimal e;

                     public {
                        this.e = var2;
                        this.d = var3;
                        this.b = (int)((double)var3.getX() / Class49.this.asr - 2.5D);
                        this.c = (int)((double)var3.getY() / Class49.this.ash - 2.5D);
                        this.b += Class49.this.asg[1 ^ 3].getX();
                        this.c += Class49.this.asg[5 >> 1].getY();
                     }

                     public void d(Graphics var1) {
                        if (Class49.afi == null) {
                           Class49.afi = Class330.s(Class222.m("fight"), (short[])null);
                        }

                        if (Class49.afi != null) {
                           Class49.afi.d(Class280.l(), 3 >> 2);
                           Class49.afi.aa(var1, this.b, this.c);
                        }
                     }
                  };
                  var4.add(var6);
               }
            }
         }

         ++var3;
      }

      this.aso = var4;
   }

   public Class49(GameView var1) {
      int var10001 = --2;
      super(62 & 87, 5 >> 1, Class345.aef, var1);
      this.asi = Class511.q("sc/e/75.png", 38 & 95, 38 & 95, 38 & 95, 38 & 95, (boolean)(3 & 4));
      this.asq = new Class116(-4 >> 2, -4 >> 2, 3 & 4, 3 & 4);
      Image[] var5 = new Image[var10001];
      boolean var10003 = true;
      this.asn = var5;
      this.va(-4 >> 2, 3 & 4, 26591 & 7039, 7661 & 25590, Class345.aeo);
      this.uv(Class511.q("sc/d/86.png", 81 & 126, 117 & 46, 81 & 126, 109 & 54, (boolean)(2 & 5)), (String)null);
      this.ad(new Class116(3 & 4, 3 & 4, --3, 3 & 4));
      this.add(this.aeb = new Class386());
      int var10012 = 6317 & 26591;
      int var10014 = 111 & 22;
      this.bm(1 ^ 3, 122 & 39, 123 & 36);
      this.aea.setImage("sc/e/73.png");
      this.aea.setBounds(this.getWidth() - (110 & 61), --5, 62 & 111, 41 & 118);
      this.ga = Class133.a(var10014, --5, 13196 & 19699, 31 & 121, 10, Color.white, Class681.ce);
      this.ac = Class133.a(var10012, --5, 95, 25, 10, Color.white, Class681.ce);
      this.ga.setText(" 查询NPC名字");
      this.ac.setText(" 查询坐标");
      this.ga.eq(Class511.q("sc/e/29.png", --3, --3, --3, --3, (boolean)(3 ^ 3)));
      this.ac.eq(Class511.q("sc/e/29.png", --3, --3, --3, --3, (boolean)(5 >> 3)));
      this.ask = new Class322("sc/e/117.png", 5 >> 1, 2 & 5, this);
      this.asf = new Class322("sc/e/116.png", --2, 3 >> 2, this);
      this.ask.setBounds(111, 6, 23, 23);
      this.asf.setBounds(213, 6, 23, 23);
      this.add(this.ask);
      this.add(this.asf);
      this.add(this.ga);
      this.add(this.ac);
      this.asm = new Class322("sc/e/118.png", 3 >> 1, 272, Class681.q, (Color[])null, "高级搜索", this);
      this.asm.setForeground(Class681.c("#cFFFFED"));
      this.asm.setOffsetTexts(Class681.cl);
      this.asm.setBounds(245, 6, 76, 23);
      this.add(this.asm);
      <undefinedtype>[] var7 = new <undefinedtype>[--5];
      var10003 = true;
      this.asj = var7;

      int var3;
      int var10000;
      for(var10000 = var3 = 5 >> 3; var10000 < this.asj.length; var10000 = var3) {
         <undefinedtype>[] var4 = this.asj;
         var10001 = var3;
         MouseListener var8 = new MouseListener(var3, this) {
            private Class436 uc;
            private boolean lb;
            private int cy;
            private JLabel ax;

            public void mouseExited(MouseEvent var1) {
            }

            public void mouseEntered(MouseEvent var1) {
            }

            public {
               int var10002 = 3 >> 2;
               this.cy = var2;
               this.ax = Class133.b(var10002, 5 >> 3, 5 >> 3, 5 >> 3, Class681.j, Class681.ce);
               this.ax.setText(var2 == 0 ? "全部" : (var2 == (2 ^ 3) ? "传送" : (var2 == (1 ^ 3) ? "普通" : (var2 == --3 ? "任务" : (var2 == --4 ? "商业" : "")))));
               this.lb = (boolean)(var2 == 3 >> 1 ? 3 & 5 : 0);
               this.uc = new Class436(this.lb ? "sc/e/109.png" : "sc/e/108.png");
               this.uc.addMouseListener(this);
               var3.add(this.ax);
               var3.add(this.uc);
            }

            public void mouseClicked(MouseEvent var1) {
               this.lb = (boolean)(this.lb ? 3 & 4 : 1);
               this.uc.fw(this.lb ? "sc/e/109.png" : "sc/e/108.png");
               int var2 = this.cy == 0 ? --1 : Class49.this.asj.length;

               for(int var10000 = var2; var10000 < Class49.this.asj.length; var10000 = var2) {
                  Class49.this.asj[var2].lb = this.lb;
                  Class49.this.asj[var2].uc.fw(Class49.this.asj[var2].lb ? "sc/e/109.png" : "sc/e/108.png");
                  ++var2;
               }

               Class49.this.p();
            }

            public void mouseReleased(MouseEvent var1) {
            }

            public void mousePressed(MouseEvent var1) {
            }
         };
         ++var3;
         var4[var10001] = var8;
      }

      Class436[] var10 = new Class436[--3];
      var10003 = true;
      this.asg = var10;

      for(var10000 = var3 = 3 ^ 3; var10000 < this.asg.length; var10000 = var3) {
         this.asg[var3] = new Class436();
         Class49 var6;
         if (var3 == 0) {
            var6 = this;
            this.asg[var3].fw("sc/d/88.png");
            this.asg[var3].setBounds(788, 66, 29, 179);
         } else if (var3 == (4 ^ 5)) {
            var6 = this;
            this.asg[var3].eq(Class511.q("sc/d/87.png", 10, 10, 10, 200, (boolean)(2 & 5)));
            this.asg[var3].setBounds(776, 34, 82, 420);
         } else {
            if (var3 == 5 >> 1) {
               this.asg[var3].setBounds(3, 34, 772, 420);
               MouseListener var2 = new MouseListener() {
                  public void mousePressed(MouseEvent var1) {
                  }

                  public void mouseDragged(MouseEvent var1) {
                  }

                  public void mouseClicked(MouseEvent var1) {
                  }

                  public void mouseReleased(MouseEvent var1) {
                     int var2 = var1.getX();
                     int var4 = var1.getY();
                     if (var1.isMetaDown()) {
                        var2 = (int)((double)var2 * Class49.this.asr);
                        var4 = (int)((double)var4 * Class49.this.ash);
                        HandleOption.n(Class49.this.qe, var2, var4, Class49.this.aej, Class49.this.aej.systemData.l());
                     } else {
                        Iterator var5;
                        Iterator var10000 = var5 = Class49.this.aso.iterator();

                        int var9;
                        while(true) {
                           if (!var10000.hasNext()) {
                              var9 = var2;
                              break;
                           }

                           <undefinedtype> var3 = (<undefinedtype>)var5.next();
                           if (Class49.afi == null) {
                              var9 = var2;
                              break;
                           }

                           if (Class49.afi.o(var1.getX() + Class49.this.asg[1 ^ 3].getX() - var3.b, var1.getY() + Class49.this.asg[5 >> 1].getY() - var3.c)) {
                              Goodstable var6;
                              if ((var6 = Class49.this.vd().getGood(var3.e)) == null) {
                                 return;
                              }

                              ((Class472)Class49.this.ve().e(123 & 31)).lp(var6, var3.d.getMenu());
                              return;
                           }

                           var10000 = var5;
                        }

                        var2 = (int)((double)var9 * Class49.this.asr);
                        var4 = (int)((double)var4 * Class49.this.ash);
                        if (Class49.this.aej.mapScene.d == Class49.this.qe) {
                           GameUtil.a(var2 / (118 & 29), var4 / (52 & 95), 2 & 5, Class49.this.aej);
                        } else {
                           RoleShow var7 = Class49.this.aej.roleUnit.r;
                           List var8;
                           if ((var8 = Class49.this.aej.getObjectArea().ca().d(var7.getMapid().intValue(), var7.getX(), var7.getY(), 3 >> 2, (int)Class49.this.qe.getMapId(), var2, var4, 5 >> 3, 5 >> 3, Class49.this.aej.roleData)) == null) {
                              Class49.this.aej.f("你所在位置无法达到目的地");
                           } else {
                              Class49.this.aej.automation.b(var8);
                           }
                        }
                     }
                  }

                  public void mouseExited(MouseEvent var1) {
                     Class49.this.aom = null;
                  }

                  public void mouseEntered(MouseEvent var1) {
                  }

                  public void mouseMoved(MouseEvent var1) {
                     int var2 = var1.getX();
                     int var3 = var1.getY();
                     Iterator var5;
                     Iterator var10000 = var5 = Class49.this.aso.iterator();

                     int var6;
                     while(true) {
                        if (!var10000.hasNext()) {
                           var6 = var2;
                           break;
                        }

                        <undefinedtype> var4 = (<undefinedtype>)var5.next();
                        if (Class49.afi == null) {
                           var6 = var2;
                           break;
                        }

                        if (Class49.afi.o(var1.getX() + Class49.this.asg[5 >> 1].getX() - var4.b, var1.getY() + Class49.this.asg[--2].getY() - var4.c)) {
                           Class49.this.aom = var4.d.getMenu();
                           Class49.this.asq.a = var1.getX() + (76 & 59);
                           Class49.this.asq.b = var1.getY() + (108 & 31);
                           Class49.this.asq.d = -4 >> 2;
                           return;
                        }

                        var10000 = var5;
                     }

                     var2 = (int)((double)var6 * (Class49.this.asr / 20.0D));
                     var3 = (int)((double)var3 * (Class49.this.ash / 20.0D));
                     Class49.this.aom = "(" + var2 + "," + var3 + ")";
                     Class49.this.asq.a = var1.getX() + (127 & 8);
                     Class49.this.asq.b = var1.getY() + (110 & 29);
                     Class49.this.asq.d = -4 >> 2;
                  }
               };
               this.asg[var3].addMouseListener(var2);
               this.asg[var3].addMouseMotionListener(var2);
               this.asp = new JComponent() {
                  protected void paintChildren(Graphics var1) {
                     super.paintChildren(var1);
                     Class49.this.fu(var1);
                  }

                  protected void paintComponent(Graphics var1) {
                     super.paintComponent(var1);
                     Class49.this.fz(var1);
                  }
               };
               this.add(this.asp, 3 ^ 3);
            }

            var6 = this;
         }

         var6.add(this.asg[var3++]);
      }

      this.ep = new ArrayList();
      this.aso = new ArrayList();
      this.vz = new ArrayList();
   }

   public boolean bl() {
      Class471 var1;
      if ((var1 = this.aej.mapScene) == null) {
         return (boolean)(3 & 4);
      } else {
         return (boolean)(this.qe != null && this.qe.getMapId() == var1.l ? 4 ^ 5 : this.aip(var1.d));
      }
   }

   protected void fu(Graphics var1) {
      if (this.ass != null) {
         this.ass.a(var1);
      }

      if (this.ku || this.qe == this.aej.mapScene.d && this.aej.roleUnit.au()) {
         if (this.asn[5 >> 3] == null) {
            this.asn[3 ^ 3] = Class511.a("sc/e/114.png");
            this.asn[5 >> 2] = Class511.a("sc/e/115.png");
         }

         if (this.ku) {
            if (this.qe == this.aej.mapScene.d && this.aej.roleUnit.au()) {
               this.ku = (boolean)(3 & 4);
               this.vt = null;
               this.d();
            }
         } else {
            this.d();
         }

         Graphics var10000;
         if (Class280.l() / 100L % 2L == 0L) {
            var1.drawImage(this.asn[2 & 5], this.xy, this.adv - (117 & 30), 119 & 31, 23 & 125, (ImageObserver)null);
            var10000 = var1;
         } else {
            var1.drawImage(this.asn[3 ^ 3], this.xy, this.adv - (93 & 55), 55 & 95, 53 & 95, (ImageObserver)null);
            var10000 = var1;
         }

         var10000.drawImage(this.asn[4 ^ 5], this.xy - (3 >> 1), this.adv, 31 & 121, 15 & 123, (ImageObserver)null);
      }

      if (this.aom != null) {
         var1.setColor(Color.YELLOW);
         var1.setFont(Class681.ce);
         if (this.asq.d == -4 >> 2) {
            this.asq.d = var1.getFontMetrics().stringWidth(this.aom) + (30 & 103);
            this.asq.c = var1.getFontMetrics().getHeight() + (86 & 47);
         }

         var1.translate(this.asq.a, this.asq.b);
         this.asi.g(var1, this.asq.d, this.asq.c);
         var1.translate(-this.asq.a, -this.asq.b);
         var1.drawString(this.aom, this.asq.a + --3, this.asq.b + (113 & 30));
      }

   }

   public void p() {
      int var14 = 3 >> 2;

      int var2;
      int var10000;
      for(var10000 = var2 = 3 & 5; var10000 < this.asj.length; var10000 = var2) {
         if (this.asj[var2].lb) {
            var14 |= (2 ^ 3) << var2;
         }

         ++var2;
      }

      for(var10000 = var2 = 2 & 5; var10000 < this.vz.size(); var10000 = var2) {
         Object var19 = this.vz.get(var2);
         ++var2;
         ((Class322)var19).setVisible((boolean)(5 >> 3));
      }

      if (var14 == 0) {
         this.ep.clear();
      } else {
         var2 = 0;
         Class603 var18 = this.vc();
         boolean var15 = this.asj[3 >> 2].lb;
         ArrayList var4 = new ArrayList();
         FormulaNum[] var5 = this.qe.getNpcs();
         int var6 = 3 ^ 3;
         int var7 = var5 != null ? var5.length : 0;

         for(var10000 = var6; var10000 < var7; var10000 = var6) {
            FormulaNum var8 = var5[var6];
            int var9 = 2 & 5;
            int var10 = var8.getSize();

            for(var10000 = var9; var10000 < var10; var10000 = var9) {
               long var11 = var8.getZhi(var9);
               NpcInfoBean var13;
               if ((var13 = var18.ck(String.valueOf(var11))) != null && !Class394.o(var13.getNpctable().getNpctype()) && !Class394.o(var13.getNpctable().getNpcname())) {
                  int var1;
                  if ((var1 = Integer.parseInt(var13.getNpctable().getNpctype())) == 5 >> 1) {
                     if (var15 || this.asj[2 ^ 3].lb) {
                        Class322 var3 = var2 < this.vz.size() ? (Class322)this.vz.get(var2) : null;
                        if (var3 == null) {
                           var3 = new Class322("sc/e/110.png", 3 >> 1, 22303 & 10735, this);
                           this.asp.add(var3, 5 >> 3);
                           this.vz.add(var3);
                        }

                        ++var2;
                        int var16 = Integer.parseInt(var13.getNpctable().getTx());
                        int var17 = Integer.parseInt(var13.getNpctable().getTy());
                        var16 = (int)((double)var16 / this.asr - 13.5D) + this.asg[--2].getX();
                        var17 = (int)((double)var17 / this.ash - 13.5D) + this.asg[--2].getY();
                        int var10001 = 5 >> 2;
                        var3.bq(var11);
                        var3.setBounds(var16, var17, 127 & 27, 127 & 27);
                        var3.setVisible((boolean)var10001);
                     }
                  } else if ((var1 < --5 || var1 > (46 & 91)) && (var1 < (47 & 93) || var1 > (47 & 95)) && var1 != (63 & 82) && var1 != (53 & 111) && var1 != (127 & 45) && var1 != (50 & 127) && var1 != (120 & 95) && var1 != (123 & 103) && var1 != (120 & 127) && var1 != (123 & 125) && var1 != (123 & 127) && var1 != (126 & 125) && var1 != (127 & 125) && var1 != 131 && var1 != 136 && var1 != 735 && var1 != 2025) {
                     if (var15 || this.asj[--2].lb) {
                        this.aik(var4, var13, 5 >> 3);
                     }
                  } else if (var15 || this.asj[--4].lb) {
                     this.aik(var4, var13, 5 >> 2);
                  }
               }

               ++var9;
            }

            ++var6;
         }

         this.ep = var4;
      }
   }

   public void s() {
      this.p();
      this.o();
   }

   public <undefinedtype> aig(int var1) {
      Iterator var3;
      for(Iterator var10000 = var3 = this.ep.iterator(); var10000.hasNext(); var10000 = var3) {
         <undefinedtype> var2;
         if ((var2 = (<undefinedtype>)var3.next()).b == var1) {
            return var2;
         }
      }

      return null;
   }

   public void aik(List<null> var1, NpcInfoBean var2, int var3) {
      List var10000;
      int var4;
      Object var5;
      if ((var5 = this.aig(var4 = Integer.parseInt(var2.getNpctable().getNpcid()))) == null) {
         int var6 = Integer.parseInt(var2.getNpctable().getTx());
         int var7 = Integer.parseInt(var2.getNpctable().getTy());
         var5 = new Object(var4, (int)((double)var6 / this.asr - 4.5D), (int)((double)var7 / this.ash - 4.5D), var2.getNpctable().getNpcname()) {
            private int a;
            private int b;
            private int d;
            private int e;
            private int f;
            private String g;
            private int h;
            private int i;

            public {
               this.f = var3;
               this.h = var4;
               this.g = var5 != null ? var5 : "";
            }

            public void f(Graphics var1) {
               var1.setFont(Class681.bm);
               var1.setColor(this.e == (2 ^ 3) ? Color.cyan : Color.green);
               if (this.d == 0) {
                  this.d = var1.getFontMetrics().stringWidth(this.g);
                  this.a = this.f - this.d / (5 >> 1) + --5;
                  this.i = this.h + (126 & 9);
               }

               var1.drawString(this.g, this.a, this.i);
            }
         };
         var10000 = var1;
         ((<undefinedtype>)var5).e = var3;
         ((<undefinedtype>)var5).f = ((<undefinedtype>)var5).f + this.asg[1 ^ 3].getX();
         ((<undefinedtype>)var5).h = ((<undefinedtype>)var5).h + this.asg[--2].getY();
      } else {
         if (var1 == this.ep) {
            return;
         }

         var10000 = var1;
      }

      var10000.add(var5);
   }

   public void d() {
      int var10001;
      GameMove var1;
      if ((var1 = this.aej.roleUnit.bb()) == null) {
         var10001 = 3 >> 2;
         int var10003 = 3 >> 2;
         this.vt = null;
         this.xy = var10003;
         this.adv = var10001;
      } else {
         int var2;
         int var3;
         if (Class394.o(var1.getValue())) {
            var2 = var1.x2;
            var3 = var1.y2;
            var2 = (int)((double)var2 / this.asr - 12.5D);
            var3 = (int)((double)var3 / this.asr - 6.0D);
            var2 += this.asg[5 >> 1].getX();
            var10001 = var3 + this.asg[--2].getY();
            this.xy = var2;
            this.adv = var10001;
         } else {
            if (this.vt != var1.getValue()) {
               this.vt = var1.getValue();
               var2 = this.vt.lastIndexOf("*");
               var3 = this.vt.lastIndexOf("*", var2 - --1);
               int var4 = Class394.b(this.vt, var3 + (4 ^ 5), var2);
               var2 = Class394.b(this.vt, var2 + (4 ^ 5), this.vt.length());
               var4 = (int)((double)var4 / this.asr - 12.5D);
               var2 = (int)((double)var2 / this.asr - 6.0D);
               var4 += this.asg[5 >> 1].getX();
               var2 += this.asg[--2].getY();
               this.xy = var4;
               this.adv = var2;
            }

         }
      }
   }

   public boolean aip(MapModel var1) {
      Class610 var2;
      if ((var2 = Class511.m(String.valueOf(var1.getMapModel()))) == null) {
         return (boolean)(5 >> 3);
      } else {
         int var10007 = 3 & 4;
         this.qe = var1;
         this.ass = null;
         this.ku = (boolean)var10007;
         this.vt = null;
         this.asg[5 >> 1].hf(var2.e());
         this.asg[1 ^ 3].setBounds(--3, 59 & 102, var2.e().getWidth((ImageObserver)null), var2.e().getHeight((ImageObserver)null));
         this.asg[3 & 4].setBounds(this.asg[--2].getWidth() + (95 & 47), 94 & 99, 63 & 93, 20211 & 12735);
         this.asg[5 >> 2].setBounds(this.asg[1 ^ 3].getWidth() + --3, 126 & 35, 91 & 118, this.asg[5 >> 1].getHeight());

         int var10000;
         int var3;
         for(var10000 = var3 = 3 & 4; var10000 < this.asj.length; var10000 = var3) {
            this.asj[var3].uc.setBounds((53 & 94) + (108 & 87) * var3, (53 & 111) + this.asg[5 >> 1].getHeight(), 53 & 94, 53 & 94);
            JLabel var5 = this.asj[var3].ax;
            int var10001 = (59 & 111) + (78 & 117) * var3;
            int var10002 = (119 & 45) + this.asg[5 >> 1].getHeight();
            ++var3;
            var5.setBounds(var10001, var10002, 63 & 109, 124 & 23);
         }

         int var10003 = -4 >> 2;
         this.aeb.uz(var1.getMapName(), (Class604)null);
         this.vb(this.asg[1 ^ 3].getWidth() + 47, 46, 34, (var1.getMapName().length() + (5 >> 2)) * 34);
         this.vf(var10003, 3 & 4, this.asg[--2].getWidth() + 90, this.asg[--2].getHeight() + 64);
         this.asp.setBounds(3 & 4, 3 & 4, this.asg[--2].getWidth() + 90, this.asg[--2].getHeight() + 64);
         if (this.ase != null) {
            this.ase.setVisible((boolean)(3 ^ 3));
         }

         Point var4 = Class511.g(var1.getMapModel());
         var10000 = 2 ^ 3;
         this.asr = (double)var4.x / (double)this.asg[5 >> 1].getWidth();
         this.ash = (double)var4.y / (double)this.asg[2].getHeight();
         this.s();
         return (boolean)var10000;
      }
   }

   protected void fz(Graphics var1) {
      Iterator var3;
      Iterator var10000 = var3 = this.ep.iterator();

      while(var10000.hasNext()) {
         <undefinedtype> var2 = (<undefinedtype>)var3.next();
         var10000 = var3;
         var2.f(var1);
      }

      var10000 = var3 = this.aso.iterator();

      while(var10000.hasNext()) {
         <undefinedtype> var4 = (<undefinedtype>)var3.next();
         var10000 = var3;
         var4.d(var1);
      }

      if (this.aej.mapScene.d == this.qe) {
         var1.drawImage(Class511.p(), (int)((double)this.aej.roleUnit.ab / this.asr - 5.0D) + this.asg[5 >> 1].getX(), (int)((double)this.aej.roleUnit.al / this.ash - 5.0D) + this.asg[5 >> 1].getY(), 111 & 26, 111 & 26, (ImageObserver)null);
      }

   }

   public void iv(MapModel var1) {
      this.ass = null;
      Class49 var10000;
      if (this.qe != null && this.qe.getMapId() == var1.getMapId()) {
         var10000 = this;
         this.o();
      } else {
         if (!this.aip(var1)) {
            return;
         }

         var10000 = this;
      }

      var10000.ve().a(this.ae());
   }
}
