/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIiiiiiiiIIII
 *  com.xy.a.IiIiIiiiIIiiI
 *  com.xy.a.a.iiIiIiiiiIiii
 *  com.xy.a.iIiIiiiiiiiIi
 *  com.xy.a.iiIiiiiiIIiIi
 *  com.xy.a.iiIiiiiiIIiii
 *  com.xy.battle.BattleControl
 *  com.xy.battle.BattleScene
 *  com.xy.bean.BeauBean
 *  com.xy.bean.ConfirmBean
 *  com.xy.d.IiIiIiiiiIIiI
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.entity.RoleSummoning
 *  com.xy.game.GameMouse
 *  com.xy.game.GameUtil
 *  com.xy.game.RoleData
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.n.IIiIiiiiIiiIi
 *  com.xy.n.iIiIIiiiIiiiI
 *  com.xy.q.IIiiIiiiIIiIi
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.ChatBox
 *  com.xy.richtext.NoticeBoxNew1
 *  com.xy.richtext.SystemBoxNew1
 *  com.xy.richtext.TipBox
 *  com.xy.scene.DLDScene
 *  com.xy.scene.DNTGScene
 *  com.xy.scene.Scene
 *  com.xy.script.ScriptAutomation
 *  com.xy.socket.GameClient
 *  com.xy.text.FlyEquip
 *  com.xy.text.GameFrame
 *  com.xy.text.GameLabelView
 *  com.xy.text.GameReadBar
 *  com.xy.text.GameTXMask
 *  com.xy.text.ScreenData
 *  com.xy.text.SystemData
 *  com.xy.v.IIiIiiiiIiIII
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.v.iiIiIiiiIIIiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIIIIiiiIiiII
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.IiIiIiiiiIIiI
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.text;

import com.xy.a.IIiiiiiiiIIII;
import com.xy.a.IiIiIiiiIIiiI;
import com.xy.a.a.iiIiIiiiiIiii;
import com.xy.a.iIiIiiiiiiiIi;
import com.xy.a.iiIiiiiiIIiIi;
import com.xy.a.iiIiiiiiIIiii;
import com.xy.battle.BattleControl;
import com.xy.battle.BattleScene;
import com.xy.bean.BeauBean;
import com.xy.bean.ConfirmBean;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.entity.RoleSummoning;
import com.xy.game.GameMouse;
import com.xy.game.GameUtil;
import com.xy.game.RoleData;
import com.xy.q.IIiiIiiiIIiIi;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.ChatBox;
import com.xy.richtext.NoticeBoxNew1;
import com.xy.richtext.SystemBoxNew1;
import com.xy.richtext.TipBox;
import com.xy.scene.DLDScene;
import com.xy.scene.DNTGScene;
import com.xy.scene.Scene;
import com.xy.script.ScriptAutomation;
import com.xy.socket.GameClient;
import com.xy.text.FlyEquip;
import com.xy.text.GameFrame;
import com.xy.text.GameLabelView;
import com.xy.text.GameReadBar;
import com.xy.text.GameTXMask;
import com.xy.text.ScreenData;
import com.xy.text.SystemData;
import com.xy.v.IIiIiiiiIiIII;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.v.iiIiIiiiIIIiI;
import com.xy.w.IIIIIiiiIiIii;
import com.xy.w.IIIIIiiiIiiII;
import com.xy.w.IIiIiiiiIiiIi;
import com.xy.w.IiIiIiiiiIIiI;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.swing.JComponent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GameView
extends JComponent {
    private LinkedList<TipBox> tipList = null;
    private GameLabelView labelView;
    private GameMouse gameMouse;
    public IiIiIiiiIIiiI baseView;
    private IiiiiiiiiIIII objectArea;
    public long moveRobot;
    public RoleData roleData;
    static final int REFRESHTIME = 500;
    private IIiiIiiiIIiIi formManagement;
    public SystemData systemData;
    public boolean isDraw;
    private Point mousePoint;
    public ScreenData screenData;
    public iiiiiiiiiiIiI XZUnit;
    private IIIIIiiiIiIii mouse;
    public Scene scene;
    private BattleControl battleControl;
    public boolean XZ;
    public IiIiIiiiiIIiI choseImg;
    private GameReadBar gameReadBar;
    public GameFrame gameFrame;
    private LinkedList<NoticeBoxNew1> noticeList = null;
    public com.xy.d.iiIiIiiiiIiii roleUnit = null;
    private long refreshTime;
    private GameClient client;
    public com.xy.n.IIiIiiiiIiiIi mapCamera;
    public int rlTime;
    public GameTXMask gameTXMask;
    private boolean refreshData;
    public FlyEquip flyEquip;
    public ScriptAutomation automation;
    public com.xy.n.iIiIIiiiIiiiI mapScene;
    private int mouseIndex = iiIiIiiiIIIiI.IiIIIiiiiIiiI;
    private SystemBoxNew1 systemBox;
    public ChatBox chatBox;
    public long timeTask;
    public boolean isLoadMap;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.refreshData) {
            this.refreshData = Boolean.FALSE;
        } else if (iIiIIiiiIiiiI.ALLATORIxDEMO() - this.refreshTime > 500L) {
            this.IIIIIiiiiIIii();
        }
        this.iIiIiiiiIIiii(g);
    }

    public Point iIiIiiiiIIiii(int w, int h) {
        Point IiiiiiiiIIIII = this.mousePoint;
        if (IiiiiiiiIIIII == null) {
            return this.ALLATORIxDEMO(w, h);
        }
        if (IiiiiiiiIIIII.getX() + (double)w + 25.0 <= (double)this.screenData.Screen_x && IiiiiiiiIIIII.getY() + (double)h + 25.0 <= (double)this.screenData.Screen_y) {
            return new Point((int)IiiiiiiiIIIII.getX() + 25, (int)IiiiiiiiIIIII.getY() + 25);
        }
        if (IiiiiiiiIIIII.getX() + (double)w + 25.0 <= (double)this.screenData.Screen_x && IiiiiiiiIIIII.getY() - (double)h - 25.0 > 0.0) {
            return new Point((int)IiiiiiiiIIIII.getX() + 25, (int)IiiiiiiiIIIII.getY() - h - 25);
        }
        if (IiiiiiiiIIIII.getX() - (double)w - 25.0 > 0.0 && IiiiiiiiIIIII.getY() - (double)h - 25.0 > 0.0) {
            return new Point((int)IiiiiiiiIIIII.getX() - w - 25, (int)IiiiiiiiIIIII.getY() - h - 25);
        }
        if (IiiiiiiiIIIII.getX() - (double)w - 25.0 > 0.0 && IiiiiiiiIIIII.getY() + (double)h + 25.0 <= (double)this.screenData.Screen_y) {
            return new Point((int)IiiiiiiiIIIII.getX() - w - 25, (int)IiiiiiiiIIIII.getY() + 25);
        }
        if (!(IiiiiiiiIIIII.getX() + (double)w + 25.0 <= (double)this.screenData.Screen_x)) return new Point((int)IiiiiiiiIIIII.getX() - w - 25, (int)IiiiiiiiIIIII.getY() - this.screenData.Screen_y / 2 + 25);
        return new Point((int)IiiiiiiiIIIII.getX() + 25, (int)IiiiiiiiIIIII.getY() - this.screenData.Screen_y / 2 + 10);
    }

    public IiIiIiiiIIiiI getBaseView() {
        return this.baseView;
    }

    public void IIIIIiiiiIIii() {
        this.refreshTime = iIiIIiiiIiiiI.ALLATORIxDEMO();
        this.refreshData = Boolean.TRUE;
    }

    public void iiiiiiiiIIiii() {
        this.mapCamera.ALLATORIxDEMO();
        this.baseView.setBounds(0, 0, this.screenData.getScreen_x(), this.screenData.getScreen_y());
        this.baseView.ALLATORIxDEMO();
        iiIiiiiiIIiIi IiiiiiiiIIIII = (iiIiiiiiIIiIi)this.formManagement.iIiIiiiiIIiii(9);
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.iIiIiiiiIIiii(-9, 0, IiiiiiiiIIIII.getWidth(), IiiiiiiiIIIII.getHeight());
        }
        this.iiiIiiiiiiIIi();
    }

    public void iIiIiiiiIIiIi(String text) {
        this.noticeList.addFirst(new NoticeBoxNew1(text, this));
        if (!this.getClient().gameText) return;
        this.chatBox.addTextListFile(4, text);
    }

    public void ALLATORIxDEMO(int sceneId, String[] vs) {
        if (sceneId == 1011) {
            this.scene = new DNTGScene(vs, this);
            return;
        }
        if (sceneId != 1014) return;
        this.scene = new DLDScene(vs, this);
    }

    public Point ALLATORIxDEMO(int w, int h) {
        return new Point((this.screenData.Screen_x - w) / 2, (this.screenData.Screen_y - h) / 2);
    }

    public void IiiIiiiiiiIiI() {
        RoleSummoning IiiiiiiiIIIII;
        BigDecimal IiiiiiiiIIIII2 = this.roleData.getLoginResult().getSummoning_id();
        com.xy.d.IiIiIiiiiIIiI IiiiiiiiIIIII3 = this.getBattleScene() != null ? this.getBattleScene().getPetUnit(this.roleData.getRoleId()) : null;
        RoleSummoning roleSummoning = IiiiiiiiIIIII = IiiiiiiiIIIII3 != null ? this.roleData.getPet(new BigDecimal(IiiiiiiiIIIII3.ALLATORIxDEMO().getId())) : null;
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII.getSid();
        } else {
            IiiiiiiiIIIII3 = null;
        }
        if (IIiiIiiiiIIiI.ALLATORIxDEMO((BigDecimal)this.roleData.getChosePetId(), (BigDecimal)IiiiiiiiIIIII2)) {
            return;
        }
        this.roleData.setChosePetId(IiiiiiiiIIIII2);
        this.baseView.ALLATORIxDEMO(this.roleData.getChosePet(), IiiiiiiiIIIII3);
        iiIiIiiiiIiii IiiiiiiiIIIII4 = (iiIiIiiiiIiii)this.getFormManagement().ALLATORIxDEMO(6);
        if (IiiiiiiiIIIII4 == null) return;
        IiiiiiiiIIIII4.ALLATORIxDEMO(IiiiiiiiIIIII2);
    }

    public void iIiIiiiiIIiIi() {
        long IiiiiiiiIIIII = iIiIIiiiIiiiI.ALLATORIxDEMO();
        ListIterator IiiiiiiiIIIII2 = this.tipList.listIterator();
        TipBox IiiiiiiiIIIII3 = null;
        while (IiiiiiiiIIIII2.hasNext()) {
            IiiiiiiiIIIII3 = (TipBox)IiiiiiiiIIIII2.next();
            if (!IiiiiiiiIIIII3.IsTime(IiiiiiiiIIIII)) continue;
            IiiiiiiiIIIII3.clear();
            IiiiiiiiIIIII2.remove();
        }
        ListIterator IiiiiiiiIIIII4 = this.noticeList.listIterator();
        NoticeBoxNew1 IiiiiiiiIIIII5 = null;
        while (IiiiiiiiIIIII4.hasNext()) {
            IiiiiiiiIIIII5 = (NoticeBoxNew1)IiiiiiiiIIIII4.next();
            if (!IiiiiiiiIIIII5.IsTime(IiiiiiiiIIIII)) continue;
            IiiiiiiiIIIII5.clear();
            IiiiiiiiIIIII4.remove();
        }
        if (this.systemBox != null) {
            this.systemBox.isTime(IiiiiiiiIIIII);
        }
        if (this.gameReadBar.readBar != null) {
            this.gameReadBar.ALLATORIxDEMO();
        }
        if (this.flyEquip == null) return;
        if (iIiIIiiiIiiiI.ALLATORIxDEMO() - this.flyEquip.getTime() <= 2000L) {
            if (this.roleData.goodChoses[14] == null) return;
        }
        GameUtil.ALLATORIxDEMO((int)this.flyEquip.getX(), (int)this.flyEquip.getY(), (int)0, (boolean)this.flyEquip.ALLATORIxDEMO(), (GameView)this);
    }

    public IIiiIiiiIIiIi getFormManagement() {
        return this.formManagement;
    }

    public int getMouseIndex() {
        return this.mouseIndex;
    }

    public void iIiIiiiiIIiii(boolean loop, String path) {
        if (this.systemData.IIiiIiiiiIiII() && loop) {
            this.gameFrame.ALLATORIxDEMO(loop, path, this);
            return;
        }
        if (!this.systemData.iIiIiiiiIIiIi()) return;
        if (loop) return;
        this.gameFrame.ALLATORIxDEMO(loop, path, this);
    }

    public int getBattleCamp() {
        return this.battleControl.battleCamp;
    }

    public void iiiIiiiiiiIIi() {
        this.baseView.IIIIIiiiiIIii();
    }

    /*
     * WARNING - void declaration
     */
    public void setViewTitleData() {
        void IiiiiiiiIIIII;
        if (this.roleUnit == null) {
            return;
        }
        BeauBean beauBean = this.roleData.getBeau();
        this.labelView.getNameLabel().setText(this.roleUnit.ALLATORIxDEMO());
        this.labelView.getHeadImg().iIiIiiiiIIiii(IIiIiiiiIiiIi.iiiIiiiiiiIIi((String)("s" + this.roleUnit.iIiIiiiiIiIii.getSpecies_id().intValue())));
        this.gameFrame.setViewTitle(this, IiiiiiiiIIIII != null ? new BigDecimal(IiiiiiiiIIIII.getBeau()) : this.roleUnit.iIiIiiiiIiIii.getRole_id(), this.roleUnit.iIiIiiiiIiIii.getRolename());
    }

    public void iIiIiiiiIIiii() {
        if (this.systemData.IIiiIiiiiIiII()) {
            if (this.battleControl.battleScene != null) {
                this.gameFrame.iIiIiiiiIIiii(this.battleControl.battleScene.getMusic(), this);
                return;
            }
            if (this.mapScene != null) {
                this.gameFrame.iIiIiiiiIIiii(String.valueOf(this.mapScene.ALLATORIxDEMO().getMapMusic()) + ".mp3", this);
                return;
            }
        }
        this.gameFrame.iIiIiiiiIIiii(null, this);
    }

    public boolean iIiIiiiiIIiii() {
        return this.refreshData;
    }

    public BattleScene getBattleScene() {
        return this.battleControl.battleScene;
    }

    public Point getMousePoint() {
        return this.mousePoint;
    }

    public void ALLATORIxDEMO(String text, int type, String skin) {
        if (this.systemBox != null) {
            this.systemBox.addText(text);
            return;
        }
        this.systemBox = new SystemBoxNew1(text, skin != null ? skin : "HF1", this);
    }

    public void iIiIiiiiIIiii(Graphics g) {
        if (!this.isDraw) {
            return;
        }
        try {
            if (this.battleControl.battleScene != null) {
                this.battleControl.battleScene.ALLATORIxDEMO(g, this.battleControl);
                return;
            }
            this.mapCamera.ALLATORIxDEMO(g);
            if (this.scene != null) {
                this.scene.ALLATORIxDEMO(g);
                return;
            }
            this.mapScene.iiiIiiiiiiIIi(g, this);
            if (this.gameReadBar.countDown == null) return;
            this.gameReadBar.countDown.ALLATORIxDEMO(g, this);
            return;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Enabled unnecessary exception pruning
     */
    public synchronized boolean ALLATORIxDEMO(long mapId, int x, int y) {
        boolean IiiiiiiiIIIII = false;
        try {
            if (this.mapScene == null || mapId != this.mapScene.ALLATORIxDEMO()) {
                if (this.mapScene != null && this.mapScene.ALLATORIxDEMO() == 3333L) {
                    this.getFormManagement().iiiIiiiiiiIIi(9);
                } else if (mapId == 3333L) {
                    this.getFormManagement().iIiIiiiiIIiIi(9);
                }
                IiiiiiiiIIIII = true;
                if (this.mapScene != null) {
                    this.ALLATORIxDEMO(true, String.valueOf(this.mapScene.ALLATORIxDEMO().getMapMusic()) + ".mp3");
                    IIIIIiiiIiiII.ALLATORIxDEMO((com.xy.n.IIIIIiiiIiiII)this.mapScene.iIiiIiiiiiiII);
                    this.mapScene.iiiIiiiiiiIIi();
                }
                this.mapScene = this.objectArea.ALLATORIxDEMO(mapId, this.mapScene);
                this.mapCamera.ALLATORIxDEMO(this.mapScene);
                if (this.battleControl.battleScene == null) {
                    this.iIiIiiiiIIiii(true, String.valueOf(this.mapScene.ALLATORIxDEMO().getMapMusic()) + ".mp3");
                }
                this.baseView.IiiIiiiiiiIiI(this.mapScene.iiIiiiiiiiIii.getMapName());
                iIiIiiiiiiiIi IiiiiiiiIIIII2 = (iIiIiiiiiiiIi)this.getFormManagement().iIiIiiiiIIiii(22);
                if (IiiiiiiiIIIII2 != null) {
                    IiiiiiiiIIIII2.iIiIiiiiIIiii();
                }
            }
            this.mapCamera.iIiIiiiiIIiii(x, y);
            this.baseView.iiiiiiiiIIiii("[" + x / 20 + "," + y / 20 + "]");
            if (!IiiiiiiiIIIII) return IiiiiiiiIIIII;
            this.gameReadBar.setCountDown();
            return IiiiiiiiIIIII;
        }
        catch (Exception IiiiiiiiIIIII3) {
            IiiiiiiiIIIII3.printStackTrace();
        }
        return IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(boolean loop, String path) {
        if (!this.systemData.IIiiIiiiiIiII()) return;
        if (!loop) return;
        this.gameFrame.ALLATORIxDEMO(path, this);
    }

    public void ALLATORIxDEMO(ConfirmBean confirmBean) {
        ((IIiiiiiiiIIII)this.formManagement.iiiIiiiiiiIIi(104)).ALLATORIxDEMO(confirmBean);
    }

    public GameView(GameFrame gameFrame, GameClient gameClient) {
        this.mousePoint = new Point();
        this.setLayout(null);
        this.setBackground(iiIIiiiiIiiII.IIiIiiiiIIiII);
        this.gameFrame = gameFrame;
        this.client = gameClient;
        this.objectArea = IIiIiiiiIiIII.ALLATORIxDEMO((int)this.client.getAreaId(), (String)this.client.getIp(), (int)this.client.getPortWeb());
        this.systemData = new SystemData();
        this.screenData = new ScreenData(this.systemData.getShowView());
        this.roleData = new RoleData(gameClient.getRoleId(), this);
        this.battleControl = new BattleControl(this);
        this.automation = new ScriptAutomation(this);
        this.choseImg = new IiIiIiiiiIIiI();
        this.labelView = new GameLabelView(this);
        this.mapCamera = new com.xy.n.IIiIiiiiIiiIi(this);
        this.baseView = new IiIiIiiiIIiiI(this);
        this.add((Component)this.baseView);
        this.formManagement = new IIiiIiiiIIiIi(this);
        this.gameMouse = new GameMouse(this);
        this.addMouseListener((MouseListener)this.gameMouse);
        this.tipList = new LinkedList();
        this.noticeList = new LinkedList();
        this.chatBox = new ChatBox(this.screenData.ChatFram_X, this);
        this.gameReadBar = new GameReadBar(this);
        this.gameTXMask = new GameTXMask(this);
    }

    public IiiiiiiiiIIII getObjectArea() {
        return this.objectArea;
    }

    public GameLabelView getLabelView() {
        return this.labelView;
    }

    public void setViewTitle() {
        if (this.roleUnit == null) {
            return;
        }
        BeauBean IiiiiiiiIIIII = this.roleData.getBeau();
        this.labelView.getNameLabel().setText(this.roleUnit.ALLATORIxDEMO());
        this.gameFrame.setViewTitle(this, IiiiiiiiIIIII != null ? new BigDecimal(IiiiiiiiIIIII.getBeau()) : this.roleUnit.iIiIiiiiIiIii.getRole_id(), this.roleUnit.iIiIiiiiIiIii.getRolename());
    }

    public void setMouseIndex(int mouseIndex) {
        if (this.mouseIndex == mouseIndex) {
            return;
        }
        this.mouseIndex = mouseIndex;
        this.mouse = null;
    }

    public BattleControl getBattleControl() {
        return this.battleControl;
    }

    public void ALLATORIxDEMO(Graphics g) {
        IIIIIiiiIiIii IiiiiiiiIIIII;
        if (this.noticeList.size() != 0) {
            int IiiiiiiiIIIII4 = this.screenData.Screen_y / 4;
            int IiiiiiiiIIIII3 = this.getY();
            g.translate(0, IiiiiiiiIIIII4);
            for (NoticeBoxNew1 noticeBoxNew1 : this.noticeList) {
                int IiiiiiiiIIIII2 = noticeBoxNew1.getHeight();
                if (IiiiiiiiIIIII2 == 0) {
                    noticeBoxNew1.loadText();
                    continue;
                }
                g.translate(0, -IiiiiiiiIIIII2);
                if ((IiiiiiiiIIIII4 -= IiiiiiiiIIIII2) - IiiiiiiiIIIII3 <= 0) break;
                noticeBoxNew1.paint(g);
            }
            g.translate(0, -IiiiiiiiIIIII4);
        }
        if (this.tipList.size() != 0 || this.automation.script && this.getBattleScene() == null) {
            int IiiiiiiiIIIII2 = this.screenData.Screen_y / 2;
            int IiiiiiiiIIIII3 = this.getY();
            g.translate(0, IiiiiiiiIIIII2);
            if (this.automation.script && this.getBattleScene() == null) {
                TipBox tipBox = this.automation.getTipBox();
                g.translate((this.screenData.Screen_x - tipBox.getWidth() + 20) / 2, -tipBox.getHeight());
                IiiiiiiiIIIII2 -= tipBox.getHeight();
                tipBox.paint(g);
                g.translate(-(this.screenData.Screen_x - tipBox.getWidth() + 20) / 2, 0);
            }
            for (TipBox tipBox : this.tipList) {
                int IiiiiiiiIIIII4 = tipBox.getHeight();
                if (IiiiiiiiIIIII4 == 0) {
                    tipBox.loadText();
                    continue;
                }
                g.translate(0, -IiiiiiiiIIIII4);
                if ((IiiiiiiiIIIII2 -= IiiiiiiiIIIII4) - IiiiiiiiIIIII3 <= 0) break;
                tipBox.paint(g);
            }
            g.translate(0, -IiiiiiiiIIIII2);
        }
        if (this.systemBox != null) {
            this.systemBox.paint(g);
        }
        if (this.gameReadBar.readBar != null) {
            this.gameReadBar.ALLATORIxDEMO(g);
        }
        if (this.gameTXMask.draw) {
            this.gameTXMask.ALLATORIxDEMO(g);
        }
        Point IiiiiiiiIIIII6 = this.gameFrame.ALLATORIxDEMO();
        this.mousePoint.move(IiiiiiiiIIIII6.x - this.getX(), IiiiiiiiIIIII6.y - this.getY());
        if (this.choseImg.ALLATORIxDEMO != null) {
            IIIIIiiiIiiII.ALLATORIxDEMO((Graphics)g, (Image)this.choseImg.ALLATORIxDEMO, (int)(IiiiiiiiIIIII6.x - 25), (int)(IiiiiiiiIIIII6.y - 25), (int)50, (int)50);
        }
        if ((IiiiiiiiIIIII = this.getMouse()) == null) return;
        IiiiiiiiIIIII.ALLATORIxDEMO(iIiIIiiiIiiiI.ALLATORIxDEMO(), 0);
        IiiiiiiiIIIII.ALLATORIxDEMO(g, IiiiiiiiIIIII6.x, IiiiiiiiIIIII6.y);
    }

    public void iiiIiiiiiiIIi(String text) {
        this.iIiIiiiiIIiii(text);
        this.chatBox.addChat(6, "#X#Y" + text);
    }

    public void ALLATORIxDEMO() {
        if (this.mapScene == null) return;
        IIIIIiiiIiiII.ALLATORIxDEMO((com.xy.n.IIIIIiiiIiiII)this.mapScene.iIiiIiiiiiiII);
    }

    public GameReadBar getGameReadBar() {
        return this.gameReadBar;
    }

    public boolean ALLATORIxDEMO() {
        if (!this.roleData.iIiIiiiiIIiIi()) return false;
        ((iiIiiiiiIIiii)this.getFormManagement().iiiIiiiiiiIIi(32)).iIiIiiiiIIiii(IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)this.roleData.getLoginResult().getPassword()) ? 0 : 2);
        return true;
    }

    public GameClient getClient() {
        return this.client;
    }

    public void iIiIiiiiIIiii(String text) {
        this.tipList.addFirst(new TipBox("#Y" + text, this));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void ALLATORIxDEMO(String sceneMsg) {
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)sceneMsg)) {
            return;
        }
        GameView gameView = this;
        synchronized (gameView) {
            String[] IiiiiiiiIIIII = sceneMsg.split("\\|");
            int IiiiiiiiIIIII2 = Integer.parseInt(IiiiiiiiIIIII[0]);
            if (IiiiiiiiIIIII.length == 1) {
                if (this.scene == null) return;
                if (this.scene.getSceneId() != IiiiiiiiIIIII2) return;
                this.scene.ALLATORIxDEMO();
                this.scene = null;
            } else if (this.scene != null) {
                if (this.scene.getSceneId() == IiiiiiiiIIIII2) {
                    this.scene.ALLATORIxDEMO(IiiiiiiiIIIII);
                } else {
                    this.scene.ALLATORIxDEMO();
                    this.scene = null;
                    this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII);
                }
            } else {
                this.ALLATORIxDEMO(IiiiiiiiIIIII2, IiiiiiiiIIIII);
            }
            return;
        }
    }

    public IIIIIiiiIiIii getMouse() {
        if (this.XZUnit != null && this.mouseIndex == iiIiIiiiIIIiI.IiIIIiiiiIiiI && this.getBattleScene() == null) {
            return com.xy.w.iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.iIiIiiiiIIiii((String)(this.XZUnit instanceof com.xy.d.iiIiIiiiiIiii ? iiIiIiiiIIIiI.IIIIiiiiiiiII : iiIiIiiiIIIiI.iIIiIiiiiiiIi)));
        }
        if (this.mouse != null) return this.mouse;
        this.mouse = com.xy.w.iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.ALLATORIxDEMO((int)this.mouseIndex));
        return this.mouse;
    }

    public static Point ALLATORIxDEMO(int x, int y, int w, int h, int sw, int sh) {
        if (x - w > 0 && y - h / 2 > 0 && y + h / 2 <= sh) {
            return new Point(x - w, y - h / 2);
        }
        if (x + w + 25 <= sw && y - h / 2 > 0 && y + h / 2 <= sh) {
            return new Point(x + 25, y - h / 2);
        }
        if (x + w + 25 <= sw && y + h + 25 <= sh) {
            return new Point(x + 25, y + 25);
        }
        if (x + w + 25 <= sw && y - h - 25 > 0) {
            return new Point(x + 25, y - h - 25);
        }
        if (x - w - 25 > 0 && y - h - 25 > 0) {
            return new Point(x - w - 25, y - h - 25);
        }
        if (x - w - 25 > 0 && y + h + 25 <= sh) {
            return new Point(x - w - 25, y + 25);
        }
        if (x + w + 25 > sw) return new Point(x - w - 25, y - sh / 2 + 25);
        return new Point(x + 25, y - sh / 2 + 10);
    }
}
