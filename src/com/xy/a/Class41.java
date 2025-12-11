package com.xy.a;

import com.xy.game.RoleData;
import com.xy.readbean.Assist;
import com.xy.script.ScriptTask;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Class41 extends com.xy.q.Class30 {
   private Point th;
   private Class94 ti;
   private com.xy.i.Class18 tj;
   private Border tk;
   private com.xy.i.Class18 fn;
   private com.xy.i.Class18 md;
   private com.xy.i.Class18 ce;
   private com.xy.i.Class18 me;

   public void bi(int var1) {
      if (Class94.acq(this.ti) != null) {
         int var2 = Class94.acq(this.ti).dx();
         int var3 = var1 == 0 ? var2 - 1 : (var1 == 1 ? var2 + 1 : (var1 == 2 ? 1 : Class94.acp(this.ti).getComponentCount()));
         if (var3 >= 1 && var3 <= Class94.acp(this.ti).getComponentCount()) {
            Class141 var4 = (Class141)Class94.acr(this.ti).get(var3 - 1);
            boolean var5 = Class94.acq(this.ti).ah();
            int var6 = Class94.acq(this.ti).il();
            Assist var7 = Class94.acq(this.ti).aor();
            Class94.acq(this.ti).aoq(var4.ah(), var4.il(), var4.aor());
            var4.aoq(var5, var6, var7);
            this.nu(var4);
         }
      }
   }

   @Override
   public void l() {
      if (this.dh()) {
         super.l();
      }
   }

   public void y(int var1) {
      if (var1 == 251) {
         RoleData var2;
         RoleData var10000 = var2 = this.yx();
         String var10001 = "杔匿";
         if (var10000.getLimit("月卡") == null) {
            var10001 = "孆匐";
            if (var2.getLimit("季卡") == null) {
               var10001 = "讹勁股覽镝非觝杖匽扈嬿匿";
               this.afx.dp("该功能解锁需要月卡或季卡");
               return;
            }
         }

         if (!this.afx.roleUnit.k()) {
            var10001 = "休追坙摣搻";
            this.afx._do("你还在摆摊");
            return;
         }

         if (var2.getRoleSystem().getIsPk() == 1 || var2.getRoleSystem().getIsGood() == 1) {
            this.th = new Point(var2.getRoleSystem().getIsPk(), var2.getRoleSystem().getIsGood());
            boolean var3 = false;
            if (var2.getRoleSystem().getIsPk() == 1) {
               var2.getRoleSystem().setIsPk(0);
               var3 = true;
            }

            if (var2.getRoleSystem().getIsGood() == 1) {
               var2.getRoleSystem().setIsGood(0);
               var3 = true;
            }

            if (var3) {
               String var4 = Agreement.getSendTextAES("roleSystem", com.xy.v.Class31.a().toJson(var2.getRoleSystem()));
               this.za().k(var4);
            }
         }

         StringBuffer var7 = new StringBuffer();

         Iterator var5;
         for (Iterator var11 = var5 = Class94.acr(this.ti).iterator(); var11.hasNext(); var11 = var5) {
            Class141 var9 = (Class141)var5.next();
            var9.rm(true);
            if (var7.length() != 0) {
               var10001 = "QT";
               var7.append("\r\n");
            }

            if (var9.ah()) {
               var10001 = "j?";
               var10001 = "ON";
            } else {
               var10001 = "\u0011\u001a\u0018";
               var10001 = "OFF";
            }

            var7.append(var10001);
            var7.append(var9.aor().getId());
            String var10003 = "L";
            var7.append("=");
            var7.append(var9.il());
         }

         if (this.at(0)) {
            String var12 = "1?,q=-/7/*r*$*";
            com.xy.v.Class0.g("map/assist.txt", var7.toString());
            return;
         }
      } else {
         if (var1 == 252) {
            this.afx.automation.g(false, 0);
            if (this.th != null) {
               RoleData var6 = this.yx();
               boolean var8 = false;
               if (this.th.x != var6.getRoleSystem().getIsPk()) {
                  var6.getRoleSystem().setIsPk(this.th.x == 0 ? 1 : 0);
                  var8 = true;
               }

               if (this.th.y != var6.getRoleSystem().getIsGood()) {
                  var6.getRoleSystem().setIsGood(this.th.y == 0 ? 1 : 0);
                  var8 = true;
               }

               if (var8) {
                  String var10 = Agreement.getSendTextAES("roleSystem", com.xy.v.Class31.a().toJson(var6.getRoleSystem()));
                  this.za().k(var10);
               }

               this.th = null;
            }

            this.cr(false);
            return;
         }

         if (var1 == 253) {
            this.bi(0);
            return;
         }

         if (var1 == 254) {
            this.bi(1);
            return;
         }

         if (var1 == 255) {
            this.bi(2);
            return;
         }

         if (var1 == 256) {
            this.bi(3);
         }
      }
   }

   public void g(int var1) {
      int var2;
      for (int var10000 = var2 = 0; var10000 < Class94.acr(this.ti).size(); var10000 = ++var2) {
         Class141 var3;
         Assist var4;
         if ((var4 = (var3 = (Class141)Class94.acr(this.ti).get(var2)).aor()) != null && var4.getSid() == var1) {
            var3.aop(var2 + 1, var4);
            return;
         }
      }
   }

   public void ds(long var1, JTextField var3) {
   }

   public Class41(GameView var1) {
      super(145, 2, com.xy.q.Class30.afz, var1);
      String var10004 = "\u0002F^G^vB\u0011@\u000b\u0001K\u0016";
      this.yy(-1, 0, 862, 411, com.xy.q.Class30.agf);
      this.dp("sc/b/S341.png");
      String var10006 = "-?q>q\u001ejifr.29";
      this.me = new com.xy.i.Class18("sc/b/B458.png", 1, 251, this);
      this.me.setBounds(592, 352, 101, 30);
      this.add(this.me);
      String var10007 = "V\u0012\n\u0013\n3\u0011C\u000b\u0001K\u0016";
      this.md = new com.xy.i.Class18("sc/b/B42.png", 1, 253, this);
      this.md.setBounds(500, 358, 17, 17);
      this.add(this.md);
      String var10008 = "/=s<s\u001chmr.29";
      this.ce = new com.xy.i.Class18("sc/b/B43.png", 1, 254, this);
      this.ce.setBounds(520, 358, 17, 17);
      this.add(this.ce);
      String var10009 = "\u0002F^@^\u0011A\u000b\u0001K\u0016";
      String var10012 = "頨";
      this.fn = new com.xy.i.Class18("sc/e/40.png", 1, 255, "顶", this);
      this.fn.setBounds(540, 358, 18, 18);
      this.add(this.fn);
      String var10010 = "\u0002F^@^\u0011A\u000b\u0001K\u0016";
      String var10013 = "廋";
      this.tj = new com.xy.i.Class18("sc/e/40.png", 1, 256, "底", this);
      this.tj.setBounds(560, 358, 18, 18);
      this.add(this.tj);
      this.ti = new Class94(this);
      this.ti.setBounds(213, 60, 490, 288);
      this.add(this.ti);
   }

   public void nu(Class141 var1) {
      Class94.act(this.ti, var1);
      if (this.tk == null && var1 != null) {
         this.tk = BorderFactory.createLineBorder(Color.YELLOW, 2);
      }

      int var2 = 0;
      int var3 = Class94.acp(this.ti).getComponentCount();

      for (int var10000 = var2; var10000 < var3; var10000 = ++var2) {
         Class141 var4 = var2 < Class94.acr(this.ti).size() ? (Class141)Class94.acr(this.ti).get(var2) : null;
         if (var4 != null) {
            var4.setBorder(var4 == var1 ? this.tk : null);
         }
      }
   }

   public boolean du(long var1, JTextField var3) {
      return true;
   }

   public void cr(boolean var1) {
      if (var1) {
         if (this.me.il() != 252) {
            this.me.n(252);
            String var2 = "-?q>q\u001ejigr.29";
            this.me.setImage("sc/b/B459.png");
            Class94.acs(this.ti).setVisible(true);
         }
      } else if (this.me.il() != 251) {
         this.me.n(251);
         String var10002 = "\u0002F^G^gE\u0010I\u000b\u0001K\u0016";
         this.me.setImage("sc/b/B458.png");
         Class94.acs(this.ti).setVisible(false);
      }
   }

   public void fm(List<Assist> var1) {
      if (var1 != null) {
         Class94.act(this.ti, null);
         Class94.acp(this.ti).removeAll();
         int var2 = 0;
         int var3 = var1.size();

         for (int var10000 = var2; var10000 < var3; var10000 = var2) {
            Assist var4 = var1.get(var2);
            Class141 var5 = var2 < Class94.acr(this.ti).size() ? (Class141)Class94.acr(this.ti).get(var2) : null;
            if (var5 == null) {
               var5 = new Class141(this);
               Class94.acr(this.ti).add(var5);
            }

            var5.aop(var2 + 1, var4);
            var5.setBounds(0, 53 * var2, 468, 53);
            var2++;
            Class94.acp(this.ti).add(var5);
         }

         Class94.acp(this.ti).setPreferredSize(new Dimension(468, 53 * Class94.acp(this.ti).getComponentCount()));

         for (int var7 = var2 = var1.size(); var7 < Class94.acr(this.ti).size(); var7 = var2) {
            Class141 var8 = (Class141)Class94.acr(this.ti).get(var2);
            var2++;
            var8.aop(0, null);
         }
      }
   }

   public boolean dh() {
      List var1;
      if ((var1 = this.yt().q().getAssistList()) == null) {
         return false;
      } else {
         Class41 var13;
         label58: {
            label57: {
               try {
                  String var10000 = "H\u0010U^D\u0002V\u0018V\u0005\u000b\u0005]\u0005";
                  List var2;
                  if ((var2 = com.xy.v.Class0.a("map/assist.txt")) != null && var2.size() != 0) {
                     int var3 = 0;
                     int var4 = 0;
                     int var14 = var3;

                     while (true) {
                        if (var14 >= var2.size()) {
                           break label57;
                        }

                        String var5;
                        if (!(var5 = ((String)var2.get(var3)).trim()).equals("")) {
                           String var10003 = "c";
                           int var6 = var5.indexOf("=");
                           String var10002 = "j?";
                           boolean var7;
                           int var16;
                           byte var10001;
                           if (var7 = var5.startsWith("ON")) {
                              var10001 = 2;
                              var16 = var6;
                           } else {
                              var10001 = 3;
                              var16 = var6;
                           }

                           int var8 = Integer.parseInt(var5.substring(var10001, var16));
                           int var9 = Integer.parseInt(var5.substring(var6 + 1));

                           int var10;
                           for (int var15 = var10 = 0; var15 < var1.size(); var15 = ++var10) {
                              Assist var11;
                              if ((var11 = (Assist)var1.get(var10)).getId() == var8) {
                                 var11.setOn(var7);
                                 var11.setNum(var9);
                                 var11.setId(var8);
                                 if (var10 != var4) {
                                    var1.remove(var10);
                                    var1.add(var4, var11);
                                 }

                                 var4++;
                                 break;
                              }
                           }
                        }

                        var14 = ++var3;
                     }
                  }
               } catch (Exception var12) {
                  var12.printStackTrace();
               }

               var13 = this;
               break label58;
            }

            var13 = this;
         }

         var13.fm(var1);
         return true;
      }
   }

   public Long dt(long var1, JTextField var3) {
      if (var1 < 0L) {
         return 0L;
      } else {
         int var4 = 0;
         int var5 = Class94.acr(this.ti).size();

         for (int var10000 = var4; var10000 < var5; var10000 = ++var4) {
            Class141 var6;
            if ((var6 = (Class141)Class94.acr(this.ti).get(var4)).ty() == var3) {
               Assist var7;
               if ((var7 = var6.aor()) == null) {
                  return 0L;
               }

               long var8 = var7.getMax();
               if (var1 > var8) {
                  return var8;
               }

               return null;
            }
         }

         return 0L;
      }
   }

   public boolean at(int var1) {
      ScriptTask var2 = null;
      Iterator var4;
      Iterator var10000 = var4 = Class94.acr(this.ti).iterator();

      ScriptTask var9;
      while (true) {
         if (!var10000.hasNext()) {
            var9 = var2;
            break;
         }

         Class141 var3;
         int var5;
         if ((var5 = (var3 = (Class141)var4.next()).lj()) <= 0) {
            var10000 = var4;
         } else {
            Assist var6;
            if ((var6 = var3.aor()).getSid() != var1) {
               String var8 = var6.getValue();
               String var10001 = "y\r";
               String[] var7 = var8.split("\\|");
               var9 = var2 = new ScriptTask(var7, var5, var6.getSid());
               break;
            }

            var10000 = var4;
            var3.rm(false);
         }
      }

      if (var9 == null) {
         this.cr(false);
         return false;
      } else {
         this.afx.automation.i(var2, true, 1);
         this.cr(true);
         return true;
      }
   }
}
