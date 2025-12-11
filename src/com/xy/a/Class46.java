package com.xy.a;

import com.xy.entity.TeamRole;
import com.xy.formula.SkillUtil;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.util.List;
import java.util.Vector;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Class46 extends com.xy.q.Class30 {
   private JScrollPane rf;
   private com.xy.w.Class18 gf;
   private com.xy.i.Class10 va;
   private com.xy.w.Class18 nn;
   private com.xy.i.Class10 vb;
   private com.xy.i.Class10 vc;
   private JTable vd;
   private Vector<Vector<Object>> ve;

   public void g(int var1) {
      if (var1 == 13) {
         int var6;
         if ((var6 = this.vd.getSelectedRow()) != -1) {
            TeamRole var7 = (TeamRole)this.ve.get(var6).get(3);
            this.ve.remove(var6);
            String var9 = "\u0016";
            String var8 = Agreement.getSendTextAES("team5", "A" + var7.getRoleId());
            this.za().k(var8);
         }
      } else if (var1 == 14) {
         int var5;
         if ((var5 = this.vd.getSelectedRow()) != -1) {
            TeamRole var3 = (TeamRole)this.ve.get(var5).get(3);
            this.ve.remove(var5);
            String var10004 = "z";
            String var4 = Agreement.getSendTextAES("team5", "R" + var3.getRoleId());
            this.za().k(var4);
         }
      } else {
         if (var1 == 15) {
            this.ve.clear();
            String var10002 = "\u0012";
            String var2 = Agreement.getSendTextAES("team5", "E");
            this.za().k(var2);
         }
      }
   }

   public void fm(List<TeamRole> var1) {
      this.ve.clear();
      int var2 = 0;
      int var3 = var1 != null ? var1.size() : 0;

      for (int var10000 = var2; var10000 < var3; var10000 = var2) {
         this.mv(var1.get(var2++));
      }

      if (this.vd.getRowCount() > 0) {
         this.vd.setRowSelectionInterval(0, 0);
      }

      this.rf.getVerticalScrollBar().setValue(0);
      this.zc().b(this.lj());
   }

   public Class46(GameView var1) {
      super(30, 2, com.xy.q.Class30.afz, var1);
      String var10009 = "SK\u000fL\u000f\u0019\u000eXNO";
      this.yy(-1, 0, 367, 315, com.xy.q.Class30.agh);
      com.xy.w.Class9 var3 = com.xy.w.Class16.m("sc/d/1.png", 68, 68, 68, 68, false);
      String var10010 = "甆讠劕儲";
      this.yu(var3, "申请加入");
      this.wp(new com.xy.v.Class32(14, 0, 0, 50));
      var10010 = "SK\u000fM\u000f\u001f\u000eXNO";
      String var10015 = "兴误";
      this.va = new com.xy.i.Class10("sc/e/7.png", 1, 13, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "允许", this);
      var10009 = "SK\u000fM\u000f\u001f\u000eXNO";
      String var10014 = "拧纊";
      this.vb = new com.xy.i.Class10("sc/e/7.png", 1, 14, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "拒绝", this);
      String var10008 = "SK\u000fM\u000f\u001f\u000eXNO";
      String var10013 = "渰稭";
      this.vc = new com.xy.i.Class10("sc/e/7.png", 1, 15, com.xy.q.Class49.ch, com.xy.q.Class49.bv, "清空", this);
      this.va.setBounds(50, 225, 59, 26);
      this.vb.setBounds(150, 225, 59, 26);
      this.vc.setBounds(250, 225, 59, 26);
      this.add(this.va);
      this.add(this.vb);
      this.add(this.vc);
      Vector var2 = new Vector();
      String var10005 = "秭旧";
      String var10007 = "筼绰";
      var10009 = "吭秘";
      var2.addElement("名称");
      var2.addElement("等级");
      var2.addElement("种族");
      this.ve = new Vector<>();
      this.vd = com.xy.q.Class1.l(this.ve, var2, com.xy.q.Class49.ac, Color.white, 120, 120, 90);
      this.vd.getSelectionModel().addListSelectionListener(new Class122(this));
      this.rf = com.xy.q.Class1.g(49, 30, 292, 190, this.vd, 20);
      this.add(this.rf);
      var10010 = "$VxQx\u0007b\u001b'[0";
      this.nn = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/25.png", 2, 2, 2, 2, false));
      this.nn.setBounds(49, 30, 292, 21);
      this.add(this.nn);
      String var10011 = "[C\u0007D\u0007\u0012\u001c\u000eXNO";
      this.gf = new com.xy.w.Class18(com.xy.w.Class16.m("sc/d/24.png", 2, 2, 2, 2, false));
      this.gf.setBounds(49, 30, 292, 191);
      this.add(this.gf);
   }

   // $VF: synthetic method
   static JTable ph(Class46 var0) {
      return var0.vd;
   }

   public void mv(TeamRole var1) {
      Vector var2;
      (var2 = new Vector()).add(var1.getName());
      var2.add(com.xy.v.Class4.h(var1.getGrade()));
      var2.add(SkillUtil.getSepciesN(var1.getSpeciesId()));
      var2.add(var1);
      this.ve.addElement(var2);
   }
}
