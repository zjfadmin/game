package com.xy.text;

import com.xy.K;
import com.xy.ac;
import com.xy.bp;
import com.xy.by;
import com.xy.cY;
import com.xy.dx;
import com.xy.eC;
import com.xy.eM;
import com.xy.eP;
import com.xy.em;
import com.xy.ev;
import com.xy.fR;
import com.xy.fa;
import com.xy.gD;
import com.xy.hd;
import com.xy.ho;
import com.xy.iO;
import com.xy.ii;
import com.xy.ik;
import com.xy.kn;
import com.xy.lg;
import com.xy.lz;
import com.xy.z;
import com.xy.battle.BattleControl;
import com.xy.battle.BattleScene;
import com.xy.bean.BeauBean;
import com.xy.bean.ConfirmBean;
import com.xy.entity.RoleSummoning;
import com.xy.game.GameMouse;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.richtext.ChatBox;
import com.xy.richtext.NoticeBoxNew1;
import com.xy.richtext.SystemBoxNew1;
import com.xy.richtext.TipBox;
import com.xy.scene.DLDScene;
import com.xy.scene.DNTGScene;
import com.xy.scene.Scene;
import com.xy.script.ScriptAutomation;
import com.xy.socket.GameClient;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JComponent;

public class GameView extends JComponent {
   public ScreenData screenData;
   private LinkedList<TipBox> tipList;
   public ScriptAutomation automation;
   private BattleControl battleControl;
   public RoleData roleData;
   private lg objectArea;
   public ChatBox chatBox;
   public fa XZUnit;
   private GameClient client;
   private LinkedList<NoticeBoxNew1> noticeList;
   private GameMouse gameMouse;
   public long timeTask;
   private long refreshTime;
   private eM formManagement;
   private GameLabelView labelView;
   private Point mousePoint;
   public GameTXMask gameTXMask;
   public ii mapScene;
   public long moveRobot;
   public boolean isDraw;
   private SystemBoxNew1 systemBox;
   public ik choseImg;
   public boolean isLoadMap;
   public bp mapCamera;
   private z mouse;
   public SystemData systemData;
   public GameFrame gameFrame;
   static final int REFRESHTIME = 500;
   public int rlTime;
   public Scene scene;
   public eC roleUnit;
   private GameReadBar gameReadBar;
   public by baseView;
   public boolean XZ;
   public FlyEquip flyEquip;
   private boolean refreshData;
   private int mouseIndex;

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      GameView var10000;
      if (this.refreshData) {
         var10000 = this;
         this.refreshData = Boolean.FALSE;
      } else {
         if (ev.l() - this.refreshTime > 500L) {
            this.o();
         }

         var10000 = this;
      }

      var10000.fz(var1);
   }

   public void f(String var1) {
      this.fw(var1);
      this.chatBox.addChat(119 & 14, "#X#Y" + var1);
   }

   public void dg() {
      this.mapCamera.m();
      this.baseView.setBounds(3 ^ 3, 3 ^ 3, this.screenData.getScreen_x(), this.screenData.getScreen_y());
      this.baseView.cc();
      ac var1;
      if ((var1 = (ac)this.formManagement.m(127 & 9)) != null) {
         var1.vf(-9 & -1, 5 >> 3, var1.getWidth(), var1.getHeight());
      }

      this.q();
   }

   public GameReadBar getGameReadBar() {
      return this.gameReadBar;
   }

   public synchronized boolean abd(long var1, int var3, int var4) {
      int var5 = 5 >> 3;

      try {
         if (this.mapScene == null || var1 != this.mapScene.b()) {
            if (this.mapScene != null && this.mapScene.b() == 3333L) {
               this.getFormManagement().n(109 & 27);
            } else if (var1 == 3333L) {
               this.getFormManagement().a(47 & 89);
            }

            var5 = 1;
            if (this.mapScene != null) {
               this.abf((boolean)(3 & 5), this.mapScene.ad().getMapMusic() + ".mp3");
               ho.j(this.mapScene.r);
               this.mapScene.r();
            }

            this.mapScene = this.objectArea.j(var1, this.mapScene);
            this.mapCamera.s(this.mapScene);
            if (this.battleControl.battleScene == null) {
               this.abh((boolean)(--1), this.mapScene.ad().getMapMusic() + ".mp3");
            }

            this.baseView.f(this.mapScene.d.getMapName());
            K var6;
            if ((var6 = (K)this.getFormManagement().m(30 & 119)) != null) {
               var6.bl();
            }
         }

         this.mapCamera.b(var3, var4);
         this.baseView.lb("[" + var3 / (126 & 21) + "," + var4 / (117 & 30) + "]");
         if (var5 != 0) {
            this.gameReadBar.setCountDown();
            return (boolean)var5;
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

      return (boolean)var5;
   }

   public void im(String var1) {
      if (!hd.o(var1)) {
         GameView var2 = this;
         synchronized(this) {
            GameView var5;
            label31: {
               String[] var6;
               String[] var10000 = var6 = var1.split("\\|");
               int var3 = Integer.parseInt(var10000[2 & 5]);
               if (var10000.length == --1) {
                  if (this.scene != null && this.scene.getSceneId() == var3) {
                     var5 = var2;
                     this.scene.a();
                     this.scene = null;
                     break label31;
                  }
               } else {
                  if (this.scene != null) {
                     if (this.scene.getSceneId() == var3) {
                        var5 = var2;
                        this.scene.e(var6);
                     } else {
                        this.scene.a();
                        this.scene = null;
                        this.dq(var3, var6);
                        var5 = var2;
                     }
                     break label31;
                  }

                  this.dq(var3, var6);
               }

               var5 = var2;
            }

         }
      }
   }

   public static String[] abe(int var0) {
      String[] var2 = null;
      if (var0 == (3 & 5)) {
         String[] var10000 = new String[--1];
         boolean var10002 = true;
         var10000[3 & 4] = new String("1_127.0.0.1_7771_8881_尘缘未了_1");
         var2 = var10000;
      }

      return var2;
   }

   public GameLabelView getLabelView() {
      return this.labelView;
   }

   public z getMouse() {
      if (this.XZUnit != null && this.mouseIndex == eP.l && this.getBattleScene() == null) {
         return dx.q(cY.m(this.XZUnit instanceof eC ? eP.i : eP.b));
      } else {
         if (this.mouse == null) {
            this.mouse = dx.q(cY.k(this.mouseIndex));
         }

         return this.mouse;
      }
   }

   public void setMouseIndex(int var1) {
      if (this.mouseIndex != var1) {
         this.mouseIndex = var1;
         this.mouse = null;
      }
   }

   public void fw(String var1) {
      this.tipList.addFirst(new TipBox("#Y" + var1, this));
   }

   public int getBattleCamp() {
      return this.battleControl.battleCamp;
   }

   public void abf(boolean var1, String var2) {
      if (this.systemData.h() && var1) {
         this.gameFrame.nf(var2, this);
      }

   }

   public boolean bl() {
      return this.refreshData;
   }

   public void o() {
      this.refreshTime = ev.l();
      this.refreshData = Boolean.TRUE;
   }

   public void p() {
      if (this.systemData.h()) {
         if (this.battleControl.battleScene != null) {
            this.gameFrame.nc(this.battleControl.battleScene.getMusic(), this);
            return;
         }

         if (this.mapScene != null) {
            this.gameFrame.nc(this.mapScene.ad().getMapMusic() + ".mp3", this);
            return;
         }
      }

      this.gameFrame.nc((String)null, this);
   }

   public eM getFormManagement() {
      return this.formManagement;
   }

   public Point abg(int var1, int var2) {
      Point var3;
      if ((var3 = this.mousePoint) == null) {
         return this.vn(var1, var2);
      } else if (var3.getX() + (double)var1 + 25.0D <= (double)this.screenData.Screen_x && var3.getY() + (double)var2 + 25.0D <= (double)this.screenData.Screen_y) {
         return new Point((int)var3.getX() + (31 & 121), (int)var3.getY() + (25 & 127));
      } else if (var3.getX() + (double)var1 + 25.0D <= (double)this.screenData.Screen_x && var3.getY() - (double)var2 - 25.0D > 0.0D) {
         return new Point((int)var3.getX() + (127 & 25), (int)var3.getY() - var2 - (59 & 93));
      } else if (var3.getX() - (double)var1 - 25.0D > 0.0D && var3.getY() - (double)var2 - 25.0D > 0.0D) {
         return new Point((int)var3.getX() - var1 - (31 & 121), (int)var3.getY() - var2 - (61 & 91));
      } else if (var3.getX() - (double)var1 - 25.0D > 0.0D && var3.getY() + (double)var2 + 25.0D <= (double)this.screenData.Screen_y) {
         return new Point((int)var3.getX() - var1 - (89 & 63), (int)var3.getY() + (59 & 93));
      } else {
         return var3.getX() + (double)var1 + 25.0D <= (double)this.screenData.Screen_x ? new Point((int)var3.getX() + (91 & 61), (int)var3.getY() - this.screenData.Screen_y / (5 >> 1) + (58 & 79)) : new Point((int)var3.getX() - var1 - (89 & 63), (int)var3.getY() - this.screenData.Screen_y / --2 + (63 & 89));
      }
   }

   public void dq(int var1, String[] var2) {
      if (var1 == (9207 & 24571)) {
         this.scene = new DNTGScene(var2, this);
      } else {
         if (var1 == (30711 & 3070)) {
            this.scene = new DLDScene(var2, this);
         }

      }
   }

   public void s() {
      BigDecimal var1 = this.roleData.getLoginResult().getSummoning_id();
      iO var2 = this.getBattleScene() != null ? this.getBattleScene().getPetUnit(this.roleData.getRoleId()) : null;
      RoleSummoning var3 = var2 != null ? this.roleData.getPet(new BigDecimal(var2.bt().getId())) : null;
      GameView var10000;
      if (var3 != null) {
         var1 = var3.getSid();
         var10000 = this;
      } else {
         var2 = null;
         var10000 = this;
      }

      if (!hd.v(var10000.roleData.getChosePetId(), var1)) {
         this.roleData.setChosePetId(var1);
         this.baseView.kk(this.roleData.getChosePet(), var2);
         fR var4;
         if ((var4 = (fR)this.getFormManagement().d(95 & 38)) != null) {
            var4.bk(var1);
         }

      }
   }

   public void aal(ConfirmBean var1) {
      ((kn)this.formManagement.e(107 & 124)).aal(var1);
   }

   public void d() {
      long var1 = ev.l();
      ListIterator var3 = this.tipList.listIterator();
      TipBox var4 = null;

      ListIterator var10000;
      for(var10000 = var3; var10000.hasNext(); var10000 = var3) {
         if ((var4 = (TipBox)var3.next()).IsTime(var1)) {
            var4.clear();
            var3.remove();
         }
      }

      var3 = this.noticeList.listIterator();
      var4 = null;

      for(var10000 = var3; var10000.hasNext(); var10000 = var3) {
         NoticeBoxNew1 var5;
         if ((var5 = (NoticeBoxNew1)var3.next()).IsTime(var1)) {
            var5.clear();
            var3.remove();
         }
      }

      if (this.systemBox != null) {
         this.systemBox.isTime(var1);
      }

      if (this.gameReadBar.readBar != null) {
         this.gameReadBar.c();
      }

      if (this.flyEquip != null && (ev.l() - this.flyEquip.getTime() > 2000L || this.roleData.goodChoses[14 & 127] != null)) {
         GameUtil.f(this.flyEquip.getX(), this.flyEquip.getY(), 5 >> 3, this.flyEquip.a(), this);
      }

   }

   public int getMouseIndex() {
      return this.mouseIndex;
   }

   public void abh(boolean var1, String var2) {
      if (this.systemData.h() && var1) {
         this.gameFrame.nb(var1, var2, this);
      } else {
         if (this.systemData.k() && !var1) {
            this.gameFrame.nb(var1, var2, this);
         }

      }
   }

   public BattleScene getBattleScene() {
      return this.battleControl.battleScene;
   }

   public void cc() {
      if (this.mapScene != null) {
         ho.j(this.mapScene.r);
      }

   }

   public void fx(String var1) {
      this.noticeList.addFirst(new NoticeBoxNew1(var1, this));
      if (this.getClient().gameText) {
         this.chatBox.addTextListFile(--4, var1);
      }

   }

   public static Point abi(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 - var2 > 0 && var1 - var3 / (1 ^ 3) > 0 && var1 + var3 / (5 >> 1) <= var5) {
         return new Point(var0 - var2, var1 - var3 / (5 >> 1));
      } else if (var0 + var2 + (27 & 125) <= var4 && var1 - var3 / --2 > 0 && var1 + var3 / --2 <= var5) {
         return new Point(var0 + (31 & 121), var1 - var3 / --2);
      } else if (var0 + var2 + (29 & 123) <= var4 && var1 + var3 + (59 & 93) <= var5) {
         return new Point(var0 + (123 & 29), var1 + (57 & 95));
      } else if (var0 + var2 + (61 & 91) <= var4 && var1 - var3 - (61 & 91) > 0) {
         return new Point(var0 + (121 & 31), var1 - var3 - (123 & 29));
      } else if (var0 - var2 - (25 & 127) > 0 && var1 - var3 - (123 & 29) > 0) {
         return new Point(var0 - var2 - (95 & 57), var1 - var3 - (125 & 27));
      } else if (var0 - var2 - (61 & 91) > 0 && var1 + var3 + (25 & 127) <= var5) {
         return new Point(var0 - var2 - 25, var1 + 25);
      } else {
         return var0 + var2 + 25 <= var4 ? new Point(var0 + 25, var1 - var5 / (5 >> 1) + 10) : new Point(var0 - var2 - 25, var1 - var5 / (5 >> 1) + 25);
      }
   }

   public by getBaseView() {
      return this.baseView;
   }

   public void setViewTitleData() {
      if (this.roleUnit != null) {
         BeauBean var1 = this.roleData.getBeau();
         this.labelView.getNameLabel().setText(this.roleUnit.aw());
         this.labelView.getHeadImg().fw(cY.l("s" + this.roleUnit.r.getSpecies_id().intValue()));
         GameFrame var10000 = this.gameFrame;
         BigDecimal var10002;
         GameView var10003;
         if (var1 != null) {
            var10002 = new BigDecimal(var1.getBeau());
            var10003 = this;
         } else {
            var10002 = this.roleUnit.r.getRole_id();
            var10003 = this;
         }

         var10000.setViewTitle(this, var10002, var10003.roleUnit.r.getRolename());
      }
   }

   public GameView(GameFrame var1, GameClient var2) {
      this.mouseIndex = eP.l;
      this.mousePoint = new Point();
      this.roleUnit = null;
      this.tipList = null;
      this.noticeList = null;
      this.setLayout((LayoutManager)null);
      this.setBackground(lz.cu);
      this.gameFrame = var1;
      this.client = var2;
      this.objectArea = em.g(this.client.getAreaId(), this.client.getIp(), this.client.getPortWeb());
      this.systemData = new SystemData();
      this.screenData = new ScreenData(this.systemData.getShowView());
      this.roleData = new RoleData(var2.getRoleId(), this);
      this.battleControl = new BattleControl(this);
      this.automation = new ScriptAutomation(this);
      this.choseImg = new ik();
      this.labelView = new GameLabelView(this);
      this.mapCamera = new bp(this);
      this.baseView = new by(this);
      this.add(this.baseView);
      this.formManagement = new eM(this);
      this.gameMouse = new GameMouse(this);
      this.addMouseListener(this.gameMouse);
      this.tipList = new LinkedList();
      this.noticeList = new LinkedList();
      this.chatBox = new ChatBox(this.screenData.ChatFram_X, this);
      this.gameReadBar = new GameReadBar(this);
      this.gameTXMask = new GameTXMask(this);
   }

   public void setViewTitle() {
      if (this.roleUnit != null) {
         BeauBean var1 = this.roleData.getBeau();
         this.labelView.getNameLabel().setText(this.roleUnit.aw());
         GameFrame var10000 = this.gameFrame;
         BigDecimal var10002;
         GameView var10003;
         if (var1 != null) {
            var10002 = new BigDecimal(var1.getBeau());
            var10003 = this;
         } else {
            var10002 = this.roleUnit.r.getRole_id();
            var10003 = this;
         }

         var10000.setViewTitle(this, var10002, var10003.roleUnit.r.getRolename());
      }
   }

   public void abj(String var1, int var2, String var3) {
      if (this.systemBox == null) {
         SystemBoxNew1 var10001 = new SystemBoxNew1;
         String var10004;
         GameView var10005;
         if (var3 != null) {
            var10004 = var3;
            var10005 = this;
         } else {
            var10004 = "HF1";
            var10005 = this;
         }

         var10001.<init>(var1, var10004, var10005);
         this.systemBox = var10001;
      } else {
         this.systemBox.addText(var1);
      }
   }

   public void fu(Graphics var1) {
      Iterator var10000;
      int var2;
      int var4;
      Iterator var5;
      int var6;
      Graphics var10;
      if (this.noticeList.size() != 0) {
         var2 = this.screenData.Screen_y / --4;
         var4 = this.getY();
         var1.translate(3 ^ 3, var2);
         var10000 = var5 = this.noticeList.iterator();

         while(true) {
            if (!var10000.hasNext()) {
               var10 = var1;
               break;
            }

            NoticeBoxNew1 var3;
            if ((var6 = (var3 = (NoticeBoxNew1)var5.next()).getHeight()) == 0) {
               var10000 = var5;
               var3.loadText();
            } else {
               var1.translate(5 >> 3, -var6);
               if ((var2 -= var6) - var4 <= 0) {
                  var10 = var1;
                  break;
               }

               var3.paint(var1);
               var10000 = var5;
            }
         }

         var10.translate(0, -var2);
      }

      if (this.tipList.size() != 0 || this.automation.script && this.getBattleScene() == null) {
         var2 = this.screenData.Screen_y / --2;
         var4 = this.getY();
         var1.translate(3 & 4, var2);
         TipBox var7;
         if (this.automation.script && this.getBattleScene() == null) {
            var7 = this.automation.getTipBox();
            var1.translate((this.screenData.Screen_x - var7.getWidth() + (22 & 125)) / --2, -var7.getHeight());
            var2 -= var7.getHeight();
            var7.paint(var1);
            var1.translate(-(this.screenData.Screen_x - var7.getWidth() + (127 & 20)) / --2, 3 >> 2);
         }

         var10000 = var5 = this.tipList.iterator();

         while(true) {
            if (!var10000.hasNext()) {
               var10 = var1;
               break;
            }

            if ((var6 = (var7 = (TipBox)var5.next()).getHeight()) == 0) {
               var10000 = var5;
               var7.loadText();
            } else {
               var1.translate(2 & 5, -var6);
               if ((var2 -= var6) - var4 <= 0) {
                  var10 = var1;
                  break;
               }

               var7.paint(var1);
               var10000 = var5;
            }
         }

         var10.translate(0, -var2);
      }

      if (this.systemBox != null) {
         this.systemBox.paint(var1);
      }

      if (this.gameReadBar.readBar != null) {
         this.gameReadBar.a(var1);
      }

      if (this.gameTXMask.draw) {
         this.gameTXMask.c(var1);
      }

      Point var8 = this.gameFrame.nd();
      this.mousePoint.move(var8.x - this.getX(), var8.y - this.getY());
      if (this.choseImg.p != null) {
         ho.d(var1, this.choseImg.p, var8.x - (25 & 127), var8.y - (57 & 95), 119 & 58, 119 & 58);
      }

      z var9;
      if ((var9 = this.getMouse()) != null) {
         var9.d(ev.l(), 3 >> 2);
         var9.aa(var1, var8.x, var8.y);
      }

   }

   public Point getMousePoint() {
      return this.mousePoint;
   }

   public Point vn(int var1, int var2) {
      return new Point((this.screenData.Screen_x - var1) / (1 ^ 3), (this.screenData.Screen_y - var2) / (5 >> 1));
   }

   public boolean t() {
      if (this.roleData.y()) {
         ((gD)this.getFormManagement().e(111 & 48)).as(hd.o(this.roleData.getLoginResult().getPassword()) ? 2 & 5 : 2);
         return (boolean)(--1);
      } else {
         return false;
      }
   }

   public GameClient getClient() {
      return this.client;
   }

   public BattleControl getBattleControl() {
      return this.battleControl;
   }

   public void fz(Graphics var1) {
      if (this.isDraw) {
         try {
            if (this.battleControl.battleScene != null) {
               this.battleControl.battleScene.j(var1, this.battleControl);
               return;
            }

            this.mapCamera.e(var1);
            if (this.scene != null) {
               this.scene.h(var1);
               return;
            }

            this.mapScene.s(var1, this);
            if (this.gameReadBar.countDown != null) {
               this.gameReadBar.countDown.b(var1, this);
               return;
            }
         } catch (Exception var2) {
         }

      }
   }

   public void q() {
      this.baseView.d();
   }

   public lg getObjectArea() {
      return this.objectArea;
   }
}
