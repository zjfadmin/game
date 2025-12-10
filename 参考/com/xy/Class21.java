package com.xy;

import com.xy.game.RoleData;
import com.xy.readbean.aCard;
import com.xy.richtext.RichLabel;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTable.DropLocation;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;

public class Class21 extends Class345 {
   private aCard mk;
   private RichLabel bp;
   private JScrollPane hd;
   private Vector<Vector<Object>> ml;
   private Class44[] gb;
   private Class217 mm;
   private Class529[] mh;
   private Class436[] cs;
   private Class529[] mn;
   private int j;
   private JTable mo;
   private JLabel[] ly;
   private JScrollPane af;

   public void d() {
      this.gw(this.vc().ce().getaMap(), this.mm.getText().trim());
   }

   public void gt(boolean var1) {
      if (this.mk != null) {
         RoleData var2 = this.vd();
         if (this.mk.getType() == 0) {
            if ((new BigDecimal(this.mk.getMoney())).compareTo(var2.getLoginResult().getGold()) > 0) {
               this.aej.f("大话币不足");
               return;
            }
         } else if ((new BigDecimal(this.mk.getMoney())).compareTo(var2.getLoginResult().getCodecard()) > 0) {
            this.aej.f("仙玉不足");
            return;
         }

         String var3 = Agreement.getSendTextAES("usercard", (var1 ? 3 ^ 3 : 1) + "|" + this.mk.getId());
         this.uw().d(var3);
      }
   }

   public void r(boolean var1) {
      RoleData var4 = this.vd();
      aCard var5 = null;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < this.gb.length; var10000 = var2) {
         this.gb[var2].c(2 & 5, (Object)null);
         this.gb[var2++].setVisible((boolean)(4 ^ 5));
      }

      String var7 = this.uw().gameMount ? var4.getPackRecord().getOtherValue("BS") : var4.getPackRecord().getlCard();
      if (!Class394.o(var7)) {
         Class603 var9 = this.vc();
         String[] var8 = var7.split(this.uw().gameMount ? "#" : "\\|");

         int var3;
         for(var10000 = var3 = 3 >> 2; var10000 < var8.length && var3 < this.gb.length; var10000 = var3) {
            aCard var6;
            if ((var6 = (aCard)var9.ce().getaMap().get(Integer.decode(var8[var3]))) != null) {
               this.gb[var3].c(11 & 127, var6);
               if (var5 == null) {
                  var5 = var6;
               }
            }

            ++var3;
         }
      }

      if (var1) {
         this.gu(var5);
      }

   }

   public Class21(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10005 = -4 >> 2;
      int var10007 = 2 & 5;
      super(95 & 121, 5 >> 1, Class345.aef, var1);
      this.j = var10007;
      this.va(var10005, 5 >> 3, 20287 & 13280, 439 & 32751, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 109 & 86, 109 & 86, 109 & 86, 109 & 86, (boolean)(3 ^ 3)), "七十二变");
      Class529[] var8 = new Class529[var10001];
      boolean var10003 = true;
      this.mn = var8;

      int var3;
      Class529[] var7;
      int var10000;
      Font var17;
      int var10006;
      String var10009;
      Class21 var10010;
      for(var10000 = var3 = 2 & 5; var10000 < this.mn.length; var10000 = var3) {
         var7 = this.mn;
         Class529 var10002 = new Class529;
         var10005 = 5 >> 1;
         var10006 = (127 & 11) + var3;
         var17 = Class681.cw;
         if (var3 == 0) {
            var10009 = "金钱变身";
            var10010 = this;
         } else if (var3 == (3 & 5)) {
            var10009 = "仙玉变身";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var10002.<init>("sc/e/52.png", var10005, var10006, var17, (Color[])null, var10009, var10010);
         var7[var3] = var10002;
         this.mn[var3].setOffsetTexts(Class681.cl);
         this.mn[var3].setBounds((29183 & 3963) + (111 & 118) * var3, 127 & 21, 111 & 116, 56 & 95);
         this.add(this.mn[var3++]);
      }

      JLabel[] var10 = new JLabel[--3];
      var10003 = true;
      this.ly = var10;

      Class21 var11;
      for(var10000 = var3 = 5 >> 3; var10000 < this.ly.length; var10000 = var3) {
         JLabel[] var9 = this.ly;
         int var12 = 3 ^ 3;
         int var10004 = 3 ^ 3;
         var10006 = 3 & 4;
         Color var18;
         int var10008;
         if (var3 != 0 && var3 != (1 ^ 3)) {
            var18 = Color.white;
            var10008 = var3;
         } else {
            var18 = Color.black;
            var10008 = var3;
         }

         var9[var3] = Class133.c(var10004, var10004, var12, var10004, var10006, var18, var10008 == 2 ? Class681.ab : Class681.ak);
         this.ly[var3].setText(var3 == 0 ? "卡名" : (var3 == (2 ^ 3) ? "属性" : (var3 == (1 ^ 3) ? "五行相克：金克木、木克土、土克水、水克火、火克金" : "")));
         if (var3 == 0) {
            var11 = this;
            this.ly[var3].setBounds(18127 & 15227, 127 & 24, 126 & 43, 63 & 83);
         } else if (var3 == --1) {
            var11 = this;
            this.ly[var3].setBounds(111 & 61, 111 & 61, 26359 & 6558, 21);
         } else {
            if (var3 == --2) {
               this.ly[var3].setBounds(45, 24, 312, 20);
            }

            var11 = this;
         }

         var11.add(this.ly[var3++]);
      }

      this.bp = new RichLabel("", Class681.ab);
      this.af = Class133.f(49, 66, 145, 325, this.bp, 20);
      this.add(this.af);
      Vector var4 = new Vector();
      var4.addElement("功能");
      var4.addElement("卡名");
      var4.addElement("时间");
      var4.addElement("金钱");
      this.ml = new Vector();
      int[] var10012 = new int[--4];
      boolean var10014 = true;
      var10012[3 >> 2] = 60;
      var10012[3 & 5] = 120;
      var10012[1 ^ 3] = 80;
      var10012[--3] = 120;
      this.mo = Class133.e(this.ml, var4, Class681.bx, Color.white, var10012);
      this.mo.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               int var2;
               if ((var2 = Class21.this.mo.getSelectedRow()) != -4 >> 2) {
                  Vector var3 = (Vector)Class21.this.ml.get(var2);
                  aCard var4 = (aCard)Class21.this.vc().ce().getaMap().get((Integer)var3.get(--4));
                  Class21.this.gu(var4);
               }
            }
         }
      });
      DefaultTableCellRenderer var5;
      (var5 = new DefaultTableCellRenderer() {
         public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
            if (var1 == null) {
               return this;
            } else {
               DropLocation var7;
               if ((var7 = var1.getDropLocation()) != null && !var7.isInsertRow() && !var7.isInsertColumn() && var7.getRow() == var5 && var7.getColumn() == var6) {
                  var3 = 3 & 5;
               }

               int var10000;
               if (var3 != 0) {
                  super.setBackground(Class681.bk);
                  var10000 = var6;
               } else {
                  super.setBackground(Class681.cu);
                  var10000 = var6;
               }

               <undefinedtype> var8;
               if (var10000 == 0) {
                  this.setForeground(Class21.this.gy((String)var2));
                  var8 = this;
               } else {
                  var8 = this;
                  super.setForeground(var1.getForeground());
               }

               var8.setFont(var1.getFont());
               this.setValue(var2);
               return this;
            }
         }
      }).setHorizontalAlignment(3 >> 2);
      this.mo.setDefaultRenderer(Object.class, var5);
      this.hd = Class133.f(379, 45, 394, 350, this.mo, 20);
      this.add(this.hd);
      var8 = new Class529[--3];
      var10003 = true;
      this.mh = var8;

      for(var10000 = var3 = 3 ^ 3; var10000 < this.mh.length; var10000 = var3) {
         var7 = this.mh;
         Class529 var13 = new Class529;
         String var16 = var3 == 0 ? "sc/e/5.png" : "sc/e/46.png";
         var10006 = 13 + var3;
         var17 = var3 == 0 ? Class681.bm : Class681.ak;
         if (var3 == 0) {
            var10009 = "搜索";
            var10010 = this;
         } else if (var3 == (4 ^ 5)) {
            var10009 = "变身造型";
            var10010 = this;
         } else if (var3 == --2) {
            var10009 = "不变身造型";
            var10010 = this;
         } else {
            var10009 = "";
            var10010 = this;
         }

         var13.<init>(var16, 1, var10006, var17, (Color[])null, var10009, var10010);
         var7[var3] = var13;
         if (var3 == 0) {
            this.mh[var3].setBounds(719, 25, 34, 17);
            var11 = this;
         } else {
            this.mh[var3].setForeground(Color.black);
            var11 = this;
            this.mh[var3].setBounds(229, 338 + 30 * (var3 - --1), 119, 25);
         }

         var11.add(this.mh[var3++]);
      }

      this.mm = Class133.n(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(5 >> 3)), Class681.bm, Color.white);
      this.mm.setBounds(633, 24, 120, 19);
      this.add(this.mm);
      Class436[] var14 = new Class436[7];
      var10003 = true;
      this.cs = var14;

      for(var10000 = var3 = 3 & 4; var10000 < this.cs.length; var10000 = var3) {
         this.cs[var3] = new Class436();
         if (var3 == 0) {
            var11 = this;
            this.cs[var3].eq(Class511.q("sc/d/25.png", 5 >> 1, 5 >> 1, 5 >> 1, 5 >> 1, (boolean)(3 ^ 3)));
            this.cs[var3].setBounds(45, 45, 150, 21);
         } else if (var3 == 5 >> 2) {
            var11 = this;
            this.cs[var3].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, false));
            this.cs[var3].setBounds(45, 45, 150, 350);
         } else if (var3 == --2) {
            var11 = this;
            this.cs[var3].eq(Class511.q("sc/d/25.png", 2, 2, 2, 2, false));
            this.cs[var3].setBounds(379, 45, 394, 21);
         } else if (var3 == 3) {
            var11 = this;
            this.cs[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
            this.cs[var3].setBounds(379, 45, 394, 350);
         } else if (var3 == 4) {
            var11 = this;
            this.cs[var3].fw("sc/d/61.png");
            this.cs[var3].setBounds(208, 53, 160, 221);
         } else if (var3 == 5) {
            var11 = this;
            this.cs[var3].setBounds(209, 55, 158, 218);
         } else {
            if (var3 == 6) {
               this.cs[var3].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
               this.cs[var3].setBounds(206, 45, 165, 240);
            }

            var11 = this;
         }

         var11.add(this.cs[var3++]);
      }

      Class116 var6 = new Class116(7, 3, 26, 34);
      Class44[] var15 = new Class44[3];
      var10003 = true;
      this.gb = var15;

      int var2;
      for(var10000 = var2 = 0; var10000 < this.gb.length; var10000 = var2) {
         this.gb[var2] = new Class44(this);
         this.gb[var2].ad(var6);
         this.gb[var2].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
         this.gb[var2].setBounds(214 + 52 * var2, 291, 40, 40);
         this.add(this.gb[var2++]);
      }

   }

   public void gu(aCard var1) {
      this.mk = var1;
      if (this.mk == null) {
         this.cs[--5].fw("sc/d/62.png");
         this.bp.setTextSize("", 14522 & 18375);
      } else {
         this.cs[--5].fw(Class222.l(this.mk.getSkin()));
         String var11 = null;
         String var6 = null;
         String var10 = null;
         String var4 = null;
         String var5 = null;
         StringBuffer var2 = new StringBuffer();
         var2.append("#cffffff名称:" + this.mk.getName() + "#r");
         var2.append("#cff0000消耗:" + this.mk.getMoney() + (this.mk.getType() == 0 ? "大话币" : "仙玉") + "#r");
         String var7 = this.mk.getValue();
         int var9;
         if (var7 != null && !"".equals(var7)) {
            String[] var8 = this.mk.getValue().split("\\|");

            for(int var10000 = var9 = 5 >> 3; var10000 < var8.length; var10000 = var9) {
               int var12;
               if ((var12 = var8[var9].indexOf("=")) != -4 >> 2) {
                  String var3 = var8[var9].substring(3 ^ 3, var12);
                  var7 = var8[var9].substring(var12 + --1);
                  if (!var3.equals("亲和力") && !var3.equals("种族") && !var3.equals("等级")) {
                     if (!var3.equals("加强气血") && !var3.equals("加强魔法") && !var3.equals("加强攻击") && !var3.equals("加强速度")) {
                        if (var3.equals("金")) {
                           var11 = "金: " + var7 + " ";
                        } else if (var3.equals("木")) {
                           var6 = "木: " + var7 + " ";
                        } else if (var3.equals("水")) {
                           var10 = "水: " + var7 + " ";
                        } else if (var3.equals("火")) {
                           var4 = "火: " + var7 + " ";
                        } else if (var3.equals("土")) {
                           var5 = "土: " + var7 + " ";
                        } else {
                           var2.append("#G" + var3 + ":" + var7 + "#r");
                        }
                     } else {
                        var2.append("#Y" + var3 + ":" + var7 + "#r");
                     }
                  } else {
                     var2.append("#W【" + var3 + "】" + var7 + "#r");
                  }
               }

               ++var9;
            }
         }

         var2.append("#c57FAFF持续时间:" + this.mk.getTime() + "分");
         int var13 = --1;
         var9 = 3 & 4;
         if (var11 != null) {
            if (var13 != 0) {
               var2.append("#r　#r#Y");
               var13 = 2 & 5;
            }

            ++var9;
            if (var9 == --3 || var9 == --5) {
               var2.append("#r");
            }

            var2.append(var11);
         }

         if (var6 != null) {
            if (var13 != 0) {
               var2.append("#r　#r#Y");
               var13 = 3 ^ 3;
            }

            ++var9;
            if (var9 == --3 || var9 == --5) {
               var2.append("#r");
            }

            var2.append(var6);
         }

         if (var10 != null) {
            if (var13 != 0) {
               var2.append("#r　#r#Y");
               var13 = 3 >> 2;
            }

            ++var9;
            if (var9 == --3 || var9 == --5) {
               var2.append("#r");
            }

            var2.append(var10);
         }

         if (var4 != null) {
            if (var13 != 0) {
               var2.append("#r　#r#Y");
               var13 = 3 ^ 3;
            }

            ++var9;
            if (var9 == --3 || var9 == --5) {
               var2.append("#r");
            }

            var2.append(var4);
         }

         if (var5 != null) {
            if (var13 != 0) {
               var2.append("#r　#r#Y");
               var13 = 5 >> 3;
            }

            ++var9;
            if (var9 == --3 || var9 == --5) {
               var2.append("#r");
            }

            var2.append(var5);
         }

         this.bp.setTextSize(var2.toString(), 30615 & 2282);
      }
   }

   public void q() {
      int var10002 = 2 & 5;
      this.r((boolean)(--1));
      this.y(var10002);
      super.q();
   }

   public void y(int var1) {
      int var10000 = 3 ^ 3;
      this.j = var1;

      for(int var2 = var10000; var10000 < this.mn.length; var10000 = var2) {
         this.mn[var2].setKeep((boolean)(var2 == var1 ? 4 ^ 5 : 0));
         ++var2;
      }

      this.gw(this.vc().ce().getaMap(), (String)null);
   }

   public void gw(Map<Integer, aCard> var1, String var2) {
      if (Class394.o(var2)) {
         var2 = null;
      }

      this.ml.clear();
      ArrayList var6 = new ArrayList();
      Iterator var5;
      Iterator var10000 = var5 = var1.keySet().iterator();

      while(true) {
         aCard var3;
         Integer var4;
         while(var10000.hasNext()) {
            var4 = (Integer)var5.next();
            if ((var3 = (aCard)var1.get(var4)) != null) {
               if (var3.getType() != this.j) {
                  var10000 = var5;
                  continue;
               }

               if (var2 != null && var3.getName().indexOf(var2) == -4 >> 2) {
                  var10000 = var5;
                  continue;
               }

               var6.add(var4);
            }

            var10000 = var5;
         }

         Collections.sort(var6);

         for(var10000 = var5 = var6.iterator(); var10000.hasNext(); var10000 = var5) {
            var4 = (Integer)var5.next();
            var3 = (aCard)var1.get(var4);
            Vector var7;
            (var7 = new Vector()).add(var3.getGn());
            var7.add(var3.getName());
            var7.add(var3.getTime() + "分");
            var7.add(var3.getMoney() + (var3.getType() == 0 ? "大话币" : "仙玉"));
            var7.add(var4);
            this.ml.addElement(var7);
         }

         this.mo.clearSelection();
         this.hd.getVerticalScrollBar().setValue(2 & 5);
         this.hd.updateUI();
         return;
      }
   }

   public Color gy(String var1) {
      if (var1.equals("强法")) {
         return Color.red;
      } else {
         return var1.equals("抗性") ? Class681.ap : Color.green;
      }
   }
}
