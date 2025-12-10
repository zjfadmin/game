package com.xy;

import com.xy.entity.Mount;
import com.xy.entity.RoleSummoning;
import com.xy.formula.ExpUtil;
import com.xy.game.RoleData;
import com.xy.game.RolePet;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Graphics;
import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Class199 extends Class345 {
   private DefaultListModel<String> avj;
   private JList<String> all;
   private Class245[] iu;
   private JScrollPane o;
   private JScrollPane mv;
   private Class285 avk;
   private JLabel[] hj;
   private Class643[] acs;
   private Class436[] an;
   private Class19 avl;

   public void o() {
      RoleData var1 = this.vd();
      this.avj.removeAllElements();
      int var2 = -4 >> 2;
      int var5 = var1.getLoginResult().getMount_id();

      int var10000;
      int var4;
      for(var10000 = var4 = 3 >> 2; var10000 < var1.mounts.size(); var10000 = var4) {
         Mount var3 = (Mount)var1.mounts.get(var4);
         if (var5 == var3.getMountid()) {
            this.avj.addElement("(*)" + var3.getMountname());
            var2 = var4;
         } else {
            this.avj.addElement(var3.getMountname());
         }

         ++var4;
      }

      this.avk.q();
      RoleData var10001;
      if (var2 == -4 >> 2) {
         var10000 = 2 ^ 3;
         var10001 = var1;
      } else {
         var10000 = 0;
         var10001 = var1;
      }

      if ((var10000 & (var10001.mounts.size() != 0 ? 5 >> 2 : 0)) != 0) {
         var2 = 3 ^ 3;
      }

      if (var2 != -4 >> 2) {
         this.all.setSelectedIndex(var2);
      }

   }

   public void adi(Mount var1) {
      RoleData var9;
      if ((var9 = this.vd()) != null) {
         var9.setChoseMountId(var1 != null ? var1.getMid() : null);
         this.s();
         if (var1 == null) {
            this.ve().n(84 & 63);
         } else {
            int var8;
            if ((var8 = var1.getMountlvl()) > (111 & 116)) {
               var8 -= 100;
            }

            int var4 = (int)Math.floor((double)((float)var1.getSpri() + (float)var8 / 10.0F * (float)var1.getSpri() / 2.0F));
            int var5 = (int)Math.floor((double)((float)var1.getPower() + (float)var8 / 10.0F * (float)var1.getPower() / 2.0F));
            int var6 = (int)Math.floor((double)((float)var1.getBone() + (float)var8 / 10.0F * (float)var1.getBone() / 2.0F));
            int var2;
            int var3;
            int var7;
            if ((var3 = (var7 = var1.getMountCZ()) >> (55 & 78)) > 0) {
               for(int var10000 = var2 = 2 & 5; var10000 < 3; var10000 = var2) {
                  if ((var7 >> --2 * var2 & 3 >> 1) != 0) {
                     int var10 = (var7 >> (1 ^ 3) * var2 + (3 >> 1) & --1) == 3 >> 1 ? 3 & 5 : 0;
                     if (var2 == 0) {
                        var4 += var10 != 0 ? var3 : -var3;
                     } else if (var2 == 3 >> 1) {
                        var5 += var10 != 0 ? var3 : -var3;
                     } else if (var2 == (1 ^ 3)) {
                        var6 += var10 != 0 ? var3 : -var3;
                     }
                  }

                  ++var2;
               }
            }

            this.acs[3 & 4].setText(var9.getLoginResult().getMount_id() == var1.getMountid() ? "休息" : "骑乘");
            this.iu[2 & 5].setText(var1.getMountlvlString());
            this.iu[2 ^ 3].setText("" + var1.getLive());
            this.iu[1 ^ 3].setText(String.valueOf(var4));
            this.iu[--3].setText(String.valueOf(var5));
            this.iu[--4].setText(String.valueOf(var6));
            Class199 var12;
            if (var8 < (126 & 101)) {
               var12 = this;
               this.iu[--5].setText(var1.getExp() + "/" + ExpUtil.getMountExp(var1.getMountlvl()));
            } else {
               var12 = this;
               this.iu[--5].setText(var1.getExp() + "/999999");
            }

            var12.avl = Class330.ai((long)var1.getMountid() << (43 & 124) | var9.getLoginResult().getSpecies_id().longValue(), 5 >> 1, 3 & 5, (String)null);
            Class287 var11;
            if ((var11 = (Class287)this.aej.getFormManagement().m(94 & 53)) != null) {
               var11.adi(var1);
            }

         }
      }
   }

   protected void paintChildren(Graphics var1) {
      super.paintChildren(var1);
      if (this.avl != null) {
         this.avl.a(var1, 110 & 127, 23222 & 9725, 3 & 4, Class280.l());
      }

   }

   public void p() {
      RoleData var1;
      if ((var1 = this.vd()) != null) {
         Mount var2;
         if ((var2 = var1.getChoseMount()) != null) {
            RolePet var4;
            RoleSummoning var3 = (var4 = var1.getRolePet(this.avk.gl())) != null ? var4.getPet() : null;
            if (var3 == null) {
               this.aej.f("请选择你要管制的召唤兽！");
            } else {
               Mount var5;
               if ((var5 = var1.getPetMount(var3.getSid())) != null && var5.getMountid() != var2.getMountid()) {
                  this.aej.f("该召唤兽已被其他坐骑管制");
               } else {
                  int var6 = 0;
                  int var10000;
                  if (var2.getSid() != null && var3.getSid().compareTo(var2.getSid()) == 0) {
                     var10000 = var6 = -4 >> 2;
                     var2.setSid((BigDecimal)null);
                  } else if (var2.getOthrersid() != null && var3.getSid().compareTo(var2.getOthrersid()) == 0) {
                     var10000 = var6 = -2 & -1;
                     var2.setOthrersid((BigDecimal)null);
                  } else if (var2.getSid3() != null && var3.getSid().compareTo(var2.getSid3()) == 0) {
                     var10000 = var6 = -1 & -3;
                     var2.setSid3((BigDecimal)null);
                  } else if (var2.getSid() == null) {
                     var2.setSid(var3.getSid());
                     var10000 = var6 = 5 >> 2;
                  } else if (var2.getOthrersid() == null) {
                     var2.setOthrersid(var3.getSid());
                     var10000 = var6 = 1 ^ 3;
                  } else {
                     if (var2.getMountlvl() > (100 & 127) && var2.getSid3() == null) {
                        var10000 = --3;
                        var2.setSid3(var3.getSid());
                        var6 = var10000;
                     }

                     var10000 = var6;
                  }

                  if (var10000 == 0) {
                     this.aej.f("目前坐骑管制上限!");
                  } else {
                     this.avk.q();
                     String var7 = Agreement.getSendTextAES("changemountvalue", Class695.b().toJson(var2));
                     this.uw().d(var7);
                  }
               }
            }
         }
      }
   }

   public void s() {
      int var10000 = 2 & 5;
      this.avl = null;

      for(int var1 = var10000; var10000 < this.iu.length; var10000 = var1) {
         this.iu[var1++].setText((String)null);
      }

   }

   public Class199(GameView var1) {
      int var10004 = 47 & 127;
      int var10017 = -1 & -2;
      super(79 & 55, --2, Class345.aef, var1);
      this.va(var10017, 3 ^ 3, 16317 & 16862, 27099 & 6143, Class345.aeo);
      this.uv(Class511.q("sc/d/1.png", 93 & 102, 93 & 102, 93 & 102, 93 & 102, (boolean)(3 ^ 3)), "坐骑");
      this.avj = new DefaultListModel();
      this.all = new JList();
      this.all.setOpaque((boolean)(3 >> 2));
      this.all.setSelectionBackground(Class581.wm);
      this.all.setSelectionForeground(Color.white);
      this.all.setForeground(Color.white);
      this.all.setFont(Class681.ce);
      this.all.setBackground(Class681.cu);
      this.all.setModel(this.avj);
      this.all.addListSelectionListener(new ListSelectionListener() {
         public void valueChanged(ListSelectionEvent var1) {
            try {
               if (Class199.this.all.getSelectedIndex() >= 0) {
                  Mount var2 = (Mount)Class199.this.vd().mounts.get(Class199.this.all.getSelectedIndex());
                  Class199.this.adi(var2);
                  return;
               }
            } catch (Exception var3) {
               var3.printStackTrace();
            }

         }
      });
      this.mv = Class133.f(var10004, 10634 & 22399, 5326 & 27581, 16639 & 16287, this.all, 126 & 21);
      this.add(this.mv);
      JLabel var3 = Class133.c(31941 & 1019, 16125 & 16887, 126 & 111, 125 & 22, 5 >> 3, Color.white, Class681.ak);
      JLabel var2 = Class133.c(2031 & 31039, 5623 & 27389, 70, 20, 3 ^ 3, Color.white, Class681.ak);
      var3.setText("召唤兽");
      var2.setText("管制坐骑");
      this.add(var3);
      this.add(var2);
      this.avk = new Class285(this);
      this.avk.setBounds(3 >> 2, 3 >> 2, 200, 20);
      this.o = Class133.f(193, 265, 200, 160, this.avk, 20);
      this.add(this.o);
      Class643[] var10001 = new Class643[--5];
      boolean var10003 = true;
      this.acs = var10001;

      int var4;
      int var10000;
      for(var10000 = var4 = 2 & 5; var10000 < this.acs.length; var10000 = var4) {
         this.acs[var4] = new Class643("sc/e/7.png", 5 >> 2, 61 + var4, Class681.ak, Class681.c, "", this);
         this.acs[var4].setBounds(44 + 73 * var4, 432, 59, 25);
         this.acs[var4].setText(var4 == 0 ? "休息" : (var4 == 3 >> 1 ? "管制" : (var4 == (1 ^ 3) ? "喂养" : (var4 == --3 ? "技能" : (var4 == --4 ? "放生" : "")))));
         this.add(this.acs[var4++]);
      }

      JLabel[] var6 = new JLabel[9];
      var10003 = true;
      this.hj = var6;

      Class199 var5;
      for(var10000 = var4 = 3 >> 2; var10000 < this.hj.length; var10000 = var4) {
         if (var4 != 7 && var4 != 8) {
            this.hj[var4] = Class133.c(198, 28 + 34 * var4, 36, 19, 3 >> 2, var4 >= 6 && var4 <= 8 ? Color.white : Color.black, Class681.ak);
            this.hj[var4].setText(var4 == 0 ? "等级" : (var4 == --1 ? "体力" : (var4 == (1 ^ 3) ? "灵性" : (var4 == --3 ? "力量" : (var4 == --4 ? "根骨" : (var4 == --5 ? "经验" : (var4 == 6 ? "坐骑列表" : (var4 == 7 ? "召唤兽" : (var4 == 8 ? "管制坐骑" : "")))))))));
            if (var4 == 6) {
               var5 = this;
               this.hj[var4].setBounds(45, 245, 143, 21);
            } else if (var4 == 7) {
               var5 = this;
               this.hj[var4].setBounds(222, 245, 63, 21);
            } else {
               if (var4 == 8) {
                  this.hj[var4].setBounds(308, 245, 73, 21);
               }

               var5 = this;
            }

            var5.add(this.hj[var4]);
         }

         ++var4;
      }

      Class245[] var7 = new Class245[6];
      var10003 = true;
      this.iu = var7;

      for(var10000 = var4 = 3 ^ 3; var10000 < this.iu.length; var10000 = var4) {
         this.iu[var4] = Class133.a(243, 28 + 34 * var4, 138, 19, 10, Color.white, Class681.q);
         this.iu[var4].eq(Class511.q("sc/d/17.png", 6, 6, 6, 6, (boolean)(3 >> 2)));
         this.add(this.iu[var4++]);
      }

      Class436[] var8 = new Class436[--5];
      var10003 = true;
      this.an = var8;

      for(var10000 = var4 = 3 & 4; var10000 < this.an.length; var10000 = var4) {
         this.an[var4] = new Class436();
         if (var4 == 0) {
            var5 = this;
            this.an[var4].eq(Class511.q("sc/d/16.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(2 & 5)));
            this.an[var4].setBounds(45, 24, 143, 200);
         } else if (var4 == --1) {
            var5 = this;
            this.an[var4].eq(Class511.q("sc/d/25.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
            this.an[var4].setBounds(45, 245, 143, 21);
         } else if (var4 == --2) {
            var5 = this;
            this.an[var4].eq(Class511.q("sc/d/25.png", 1 ^ 3, 1 ^ 3, 1 ^ 3, 1 ^ 3, (boolean)(3 ^ 3)));
            this.an[var4].setBounds(191, 245, 204, 21);
         } else if (var4 == --3) {
            var5 = this;
            this.an[var4].eq(Class511.q("sc/d/24.png", --2, --2, --2, --2, (boolean)(3 >> 2)));
            this.an[var4].setBounds(45, 245, 143, 180);
         } else {
            if (var4 == 4) {
               this.an[var4].eq(Class511.q("sc/d/24.png", 2, 2, 2, 2, false));
               this.an[var4].setBounds(191, 245, 204, 180);
            }

            var5 = this;
         }

         var5.add(this.an[var4++]);
      }

   }

   public void d() {
      RoleData var4;
      if ((var4 = this.vd()) != null) {
         Mount var2;
         if ((var2 = var4.getChoseMount()) != null) {
            int var10000;
            int var1;
            int var3;
            String var5;
            if ((var3 = var4.getLoginResult().getMount_id()) != var2.getMountid()) {
               for(var10000 = var1 = 0; var10000 < var4.mounts.size(); var10000 = var1) {
                  if (var3 == ((Mount)var4.mounts.get(var1)).getMountid()) {
                     this.avj.set(var1, ((Mount)var4.mounts.get(var1)).getMountname());
                  } else if (var2.getMountid() == ((Mount)var4.mounts.get(var1)).getMountid()) {
                     this.avj.set(var1, "(*)" + ((Mount)var4.mounts.get(var1)).getMountname());
                  }

                  ++var1;
               }

               var4.getLoginResult().setMount_id(var2.getMountid());
               var5 = Agreement.getSendTextAES("rolechange", "M" + var2.getMountid() + "=" + var2.getMid());
               this.uw().d(var5);
               this.acs[5 >> 3].setText("休息");
            } else {
               var10000 = var1 = 3 & 4;

               RoleData var6;
               while(true) {
                  if (var10000 >= var4.mounts.size()) {
                     var6 = var4;
                     break;
                  }

                  if (var3 == ((Mount)var4.mounts.get(var1)).getMountid()) {
                     this.avj.set(var1, ((Mount)var4.mounts.get(var1)).getMountname());
                     var6 = var4;
                     break;
                  }

                  ++var1;
                  var10000 = var1;
               }

               var6.getLoginResult().setMount_id(3 >> 2);
               var5 = Agreement.getSendTextAES("rolechange", "M");
               this.uw().d(var5);
               this.acs[3 ^ 3].setText("骑乘");
            }
         }
      }
   }

   public void q() {
      this.o();
      super.q();
   }

   public boolean t() {
      this.adi((Mount)null);
      return super.t();
   }
}
