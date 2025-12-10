package com.xy;

import com.xy.entity.Mount;
import com.xy.entity.MountSkill;
import com.xy.formula.BaseMountSkill;
import com.xy.formula.PropertyUtil;
import com.xy.game.RoleData;
import com.xy.richtext.RichLabel;
import com.xy.text.GameView;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class287 extends Class345 {
   private Class436[] cs;
   private Class245 eu;
   private JLabel[] hj;
   private RichLabel bw;
   private DefaultListModel<String> fn;
   private JList<String> aqd;

   public void q() {
      Mount var1;
      if ((var1 = this.vd().getChoseMount()) != null) {
         this.adi(var1);
         super.q();
      }
   }

   public void ahb(Mount var1, String var2) {
      if (var1 != null && !Class394.o(var2)) {
         if (this.uw().gameMount) {
            BaseMountSkill var8;
            if ((var8 = PropertyUtil.getBaseMountSkill(var2)) == null) {
               this.bw.setTextSize((String)null, 32251 & 751);
            } else {
               this.bw.setTextSize(var8.getText(var1), 28143 & 4859);
            }
         } else {
            String[] var3 = PropertyUtil.h(var1, var2).split("\\|");
            StringBuffer var6 = new StringBuffer();

            int var7;
            for(int var10000 = var7 = 5 >> 3; var10000 < var3.length; var10000 = var7) {
               if (var6.length() != 0) {
                  var6.append("#r");
               }

               int var4;
               if ((var4 = var3[var7].indexOf("=")) != -4 >> 2) {
                  String var5 = var3[var7].substring(3 ^ 3, var4);
                  String var9 = var3[var7].substring(var4 + (4 ^ 5));
                  var6.append(var5);
                  var6.append(" +");
                  if (var5.equals("抗三尸虫")) {
                     var6.append(Integer.parseInt(var9));
                  } else {
                     var6.append((int)(Float.parseFloat(var9) * 100.0F));
                     var6.append("%");
                  }
               }

               ++var7;
            }

            this.bw.setTextSize(var6.toString(), 29947 & 3055);
         }
      } else {
         this.bw.setTextSize((String)null, 9195 & 23807);
      }
   }

   public Class287(GameView var1) {
      int var10001 = 1 ^ 3;
      int var10017 = -1 & -3;
      super(62 & 85, 5 >> 1, Class345.aef, var1);
      this.va(var10017, 3 ^ 3, 11647 & 21442, 1514 & 31583, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 101 & 94, 101 & 94, 101 & 94, 101 & 94, (boolean)(5 >> 3)), "坐骑技能");
      this.fn = new DefaultListModel();
      this.aqd = new JList();
      this.aqd.setOpaque((boolean)(3 ^ 3));
      this.aqd.setSelectionBackground(new Color(39 & 121, 59 & 110, 53 & 126));
      this.aqd.setSelectionForeground(Color.GREEN);
      this.aqd.setForeground(Color.GREEN);
      this.aqd.setFont(Class681.ca);
      this.aqd.setBackground(Class681.cu);
      this.aqd.setModel(this.fn);
      this.aqd.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            if (!var1.getValueIsAdjusting()) {
               String var4;
               if (Class394.o(var4 = (String)Class287.this.aqd.getSelectedValue())) {
                  return;
               }

               RoleData var2;
               Mount var3 = (var2 = Class287.this.vd()) != null ? var2.getChoseMount() : null;
               if (var3 == null) {
                  return;
               }

               Class287.this.ahb(var3, var4);
            }

         }
      });
      this.aqd.setBounds(59 & 117, 53 & 126, 27383 & 5631, 94 & 103);
      this.add(this.aqd);
      this.bw = new RichLabel("", Class681.ce);
      this.bw.setBounds(117 & 59, 127 & 124, 22767 & 10235, 8127 & 24823);
      this.add(this.bw);
      JLabel[] var3 = new JLabel[var10001];
      boolean var10003 = true;
      this.hj = var3;

      int var10000;
      int var2;
      for(var10000 = var2 = 3 & 4; var10000 < this.hj.length; var10000 = var2) {
         this.hj[var2] = Class133.c(47, 32, 250, 21, 3 >> 2, Class681.c("#cFFFFFF"), Class681.ak);
         this.hj[var2].setText(var2 == 0 ? "坐骑技能" : (var2 == (2 ^ 3) ? "熟练度" : ""));
         this.add(this.hj[var2]);
         if (var2 == --1) {
            this.hj[var2].setBounds(47, 290, 57, 19);
            this.hj[var2].setForeground(Class681.c("#c000000"));
         }

         ++var2;
      }

      var10001 = --5;
      this.eu = Class133.a(112, 290, 184, 19, 10, Color.white, Class681.q);
      this.eu.eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(2 & 5)));
      this.add(this.eu);
      Class436[] var4 = new Class436[var10001];
      var10003 = true;
      this.cs = var4;

      for(var10000 = var2 = 3 & 4; var10000 < this.cs.length; var10000 = var2) {
         this.cs[var2] = new Class436();
         this.add(this.cs[var2]);
         if (var2 == 0) {
            this.cs[var2].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(5 >> 3)));
            this.cs[var2].setBounds(47, 32, 250, 21);
         } else if (var2 == --1) {
            this.cs[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
            this.cs[var2].setBounds(47, 32, 250, 90);
         } else if (var2 == --2) {
            this.cs[var2].eq(Class511.q("sc/d/24.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 & 4)));
            this.cs[var2].setBounds(47, 122, 250, 160);
         }

         ++var2;
      }

   }

   public void adi(Mount var1) {
      this.fn.removeAllElements();
      this.eu.setText(var1 != null ? var1.getProficiency().toString() : null);
      int var10000;
      if (this.uw().gameMount) {
         String var7 = null;
         String var8;
         if (!Class394.o(var8 = var1.getDataValue("JN"))) {
            int var4 = 3 & 4;

            int var5;
            for(var10000 = var5 = 3 >> 2; var10000 < var8.length(); var10000 = var5) {
               if ((var5 = var8.indexOf("#", var4 + (5 >> 2))) == -4 >> 2) {
                  var5 = var8.length();
               }

               String var6 = var8.substring(var4, var5);
               this.fn.addElement(var6);
               if (Class394.o(var7)) {
                  var7 = var6;
               }

               var4 = var5 + (5 >> 2);
            }
         }

         this.ahb(var1, var7);
      } else if (var1 != null && var1.getMountskill() != null && var1.getMountskill().size() != 0) {
         int var2;
         for(var10000 = var2 = 0; var10000 < var1.getMountskill().size(); var10000 = var2) {
            MountSkill var3 = (MountSkill)var1.getMountskill().get(var2);
            ++var2;
            this.fn.addElement(var3.getSkillname());
         }

         if (var1.getMountskill().size() != 0) {
            this.ahb(var1, ((MountSkill)var1.getMountskill().get(3 & 4)).getSkillname());
         }

      } else {
         this.ahb(var1, (String)null);
      }
   }
}
