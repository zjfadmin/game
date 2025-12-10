/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.IIIIIiiiIIIiI
 *  com.xy.a.iiIiIiiiiiIIi
 *  com.xy.bean.CreepsMovePath
 *  com.xy.bean.MonsterBean
 *  com.xy.bean.PathPoint
 *  com.xy.bean.RoleShow
 *  com.xy.bean.StallBean
 *  com.xy.d.IIIIIiiiIiIii
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.IIiIiiiiIiIII
 *  com.xy.d.IIiIiiiiIiiIi
 *  com.xy.d.IiiiIiiiiIiIi
 *  com.xy.d.iiIIiiiiIiiII
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.n.IIIIIiiiIiiII
 *  com.xy.n.IIiIiiiiIiIII
 *  com.xy.readbean.Door
 *  com.xy.readbean.MapModel
 *  com.xy.readbean.NpcInfoBean
 *  com.xy.script.ScriptTask
 *  com.xy.text.GameView
 *  com.xy.text.SystemData
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiIii
 *  com.xy.w.IIiIiiiiIiiIi
 *  com.xy.w.iiiiiiiiiiIiI
 */
package com.xy.n;

import com.xy.a.IIIIIiiiIIIiI;
import com.xy.a.iiIiIiiiiiIIi;
import com.xy.bean.CreepsMovePath;
import com.xy.bean.MonsterBean;
import com.xy.bean.PathPoint;
import com.xy.bean.RoleShow;
import com.xy.bean.StallBean;
import com.xy.d.IIIIIiiiIiIii;
import com.xy.d.IiiiIiiiiIiIi;
import com.xy.d.iiIIiiiiIiiII;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.n.IIIIIiiiIiiII;
import com.xy.n.IIiIiiiiIiIII;
import com.xy.readbean.Door;
import com.xy.readbean.MapModel;
import com.xy.readbean.NpcInfoBean;
import com.xy.script.ScriptTask;
import com.xy.text.GameView;
import com.xy.text.SystemData;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.w.IIiIiiiiIiiIi;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiIIiiiIiiiI {
    public long IiiiIiiiIiIII;
    public static final IiiiIiiiiIiIi IIiiiiiiiIIIi = new IiiiIiiiiIiIi();
    private ArrayList<iiiiiiiiiiIiI> IIIiiiiiIIiII;
    public List<com.xy.d.IIIIIiiiIiiII> iiIiiiiiiIIiI;
    com.xy.d.IIiIiiiiIiiIi iIiiIiiiIiIIi = null;
    public IiiiiiiiiIIII iiiiIiiiIIiii;
    static int iIIiIiiiiiiIi;
    public static final int IIIIiiiiiiiII = 20;
    public List<com.xy.d.IIiIiiiiIiIII> iiIIIiiiiiiiI;
    public List<iiIIiiiiIiiII> IiIiiiiiIIIII;
    static int iiIiIiiiiIIIi;
    public boolean iiiiIiiiIiiII;
    static com.xy.w.IIIIIiiiIiIii[] iiiIiiiiiiiIi;
    public IIIIIiiiIiiII iIiiIiiiiiiII;
    static Color IIiiIiiiIIiIi;
    public ConcurrentHashMap<String, iiIiIiiiiIiii> iIiIiiiiIiIii = new ConcurrentHashMap();
    private ArrayList<iiiiiiiiiiIiI> IiIIIiiiiIiiI;
    public MapModel iiIiiiiiiiIii;
    public List<Door> IiiiiiiiIIIII;
    private com.xy.d.IIiIiiiiIiiIi ALLATORIxDEMO;

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(long time) {
        try {
            var4_2 = this.iIiIiiiiIiIii.values().iterator();
            if (true) ** GOTO lbl10
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
        do {
            IiiiiiiiIIIII = var4_2.next();
            IiiiiiiiIIIII.ALLATORIxDEMO(time, this);
lbl10:
            // 2 sources

        } while (var4_2.hasNext());
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = this.iiIIIiiiiiiiI.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
            this.iiIIIiiiiiiiI.get(++IiiiiiiiIIIII).ALLATORIxDEMO(time, this);
        }
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = this.iiIiiiiiiIIiI.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
            this.iiIiiiiiiIIiI.get(++IiiiiiiiIIIII).ALLATORIxDEMO(time, this);
        }
        IiiiiiiiIIIII = this.IiIiiiiiIIIII.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            this.IiIiiiiiIIIII.get(--IiiiiiiiIIIII).ALLATORIxDEMO(time, this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(NpcInfoBean npcInfoBean) {
        iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
        synchronized (iIiIIiiiIiiiI2) {
            com.xy.d.IIiIiiiiIiIII IiiiiiiiIIIII = new com.xy.d.IIiIiiiiIiIII(npcInfoBean);
            this.iiIIIiiiiiiiI.add(IiiiiiiiIIIII);
            return;
        }
    }

    public void iiiIiiiiiiIIi() {
        this.iiIiiiiiiiIii = null;
        this.iIiiIiiiiiiII = null;
        this.IiiiiiiiIIIII.clear();
        this.iIiIiiiiIIiii();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(String name, int x, int y) {
        var4_4 = this;
        synchronized (var4_4) {
            block9: {
                if (!name.equals("\u70b9\u51fb")) break block9;
                if (this.iIiiIiiiIiIIi != null) ** GOTO lbl-1000
                this.iIiiIiiiIiIIi = new com.xy.d.IIiIiiiiIiiIi(name, x, y);
                ** GOTO lbl11
lbl-1000:
                // 1 sources

                {
                    this.iIiiIiiiIiIIi.ALLATORIxDEMO(x, y);
lbl11:
                    // 2 sources

                    IiiiiiiiIIIII = this.ALLATORIxDEMO;
                    ** while (IiiiiiiiIIIII != null)
                }
lbl-1000:
                // 1 sources

                {
                    if (IiiiiiiiIIIII == this.iIiiIiiiIiIIi) {
                        return;
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII.iiIiiiiiiiIii;
                    continue;
                }
lbl17:
                // 1 sources

                this.iIiiIiiiIiIIi.iiIiiiiiiiIii = null;
                if (this.ALLATORIxDEMO != null) {
                    this.iIiiIiiiIiIIi.iiIiiiiiiiIii = this.ALLATORIxDEMO;
                }
                this.ALLATORIxDEMO = this.iIiiIiiiIiIIi;
                return;
            }
            IiiiiiiiIIIII = new com.xy.d.IIiIiiiiIiiIi(name, x, y);
            if (this.ALLATORIxDEMO != null) {
                IiiiiiiiIIIII.iiIiiiiiiiIii = this.ALLATORIxDEMO;
            }
            this.ALLATORIxDEMO = IiiiiiiiIIIII;
            return;
        }
    }

    public void ALLATORIxDEMO(GameView gameView) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.iiIIIiiiiiiiI.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            String IiiiiiiiIIIII3 = this.iiIIIiiiiiiiI.get(IiiiiiiiIIIII).iIiIiiiiIIiii();
            if (IiiiiiiiIIIII3 != null) {
                gameView.chatBox.addChat(0, "#Q[" + this.iiIIIiiiiiiiI.get(IiiiiiiiIIIII).ALLATORIxDEMO() + "]" + IiiiiiiiIIIII3);
            }
            ++IiiiiiiiIIIII;
        }
    }

    public boolean iIiIiiiiIIiii(int x, int y, int lvl) {
        return this.iIiiIiiiiiiII.iIiIiiiiIIiii(x, y, lvl);
    }

    public iiIiIiiiiIiii iIiIiiiiIIiii(String name) {
        return this.iIiIiiiiIiIii.remove(name);
    }

    public com.xy.d.IIIIIiiiIiiII iIiIiiiiIIiii(int id) {
        int IiiiiiiiIIIII = this.iiIiiiiiiIIiI.size() - 1;
        while (IiiiiiiiIIIII >= 0) {
            com.xy.d.IIIIIiiiIiiII IiiiiiiiIIIII2 = this.iiIiiiiiiIIiI.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII2.IiiiiiiiIIIII.getI() == id) {
                return IiiiiiiiIIIII2;
            }
            --IiiiiiiiIIIII;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public void ALLATORIxDEMO(StallBean stallBean, GameView gameView) {
        block10: {
            if (stallBean.getState() != iiIIiiiiIiiII.iiiIiiiiiiiIi) break block10;
            IiiiiiiiIIIII = (IIIIIiiiIIIiI)gameView.getFormManagement().iIiIiiiiIIiii(153);
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.ALLATORIxDEMO(stallBean);
            }
            if ((IiiiiiiiIIIII = this.ALLATORIxDEMO(stallBean.getRole())) != null) {
                IiiiiiiiIIIII.iIiIiiiiIiIii.setBooth_id(null);
                if (gameView.roleUnit == IiiiiiiiIIIII) {
                    gameView.getFormManagement().iiiIiiiiiiIIi(152);
                }
            }
            IiiiiiiiIIIII = this.IiIiiiiiIIIII.size() - 1;
            if (true) ** GOTO lbl29
        }
        IiiiiiiiIIIII = this.ALLATORIxDEMO(stallBean.getRole());
        if (IiiiiiiiIIIII != null) {
            if (gameView.roleUnit == IiiiiiiiIIIII) {
                if (IiiiiiiiIIIII.iIiIiiiiIiIii.getBooth_id() == null) {
                    IiiiiiiiIIIII = (iiIiIiiiiiIIi)gameView.getFormManagement().iiiIiiiiiiIIi(152);
                    IiiiiiiiIIIII.ALLATORIxDEMO(stallBean);
                }
                gameView.getFormManagement().iiiIiiiiiiIIi(152);
            }
            IiiiiiiiIIIII.iIiIiiiiIiIii.setBooth_id(new BigDecimal(stallBean.getId()));
            IiiiiiiiIIIII.ALLATORIxDEMO(stallBean.getX() + 50, stallBean.getY() + 135, 0);
        }
        IiiiiiiiIIIII = this.IiIiiiiiIIIII.size() - 1;
        if (true) ** GOTO lbl36
        do {
            if (this.IiIiiiiiIIIII.get((int)IiiiiiiiIIIII).IiiiIiiiIiIII.getId() == stallBean.getId()) {
                this.IiIiiiiiIIIII.remove(IiiiiiiiIIIII);
                return;
            }
            --IiiiiiiiIIIII;
lbl29:
            // 2 sources

        } while (IiiiiiiiIIIII >= 0);
        return;
        do {
            if (this.IiIiiiiiIIIII.get((int)IiiiiiiiIIIII).IiiiIiiiIiIII.getId() == stallBean.getId()) {
                this.IiIiiiiiIIIII.get(IiiiiiiiIIIII).ALLATORIxDEMO(stallBean);
                return;
            }
            --IiiiiiiiIIIII;
lbl36:
            // 2 sources

        } while (IiiiiiiiIIIII >= 0);
        this.IiIiiiiiIIIII.add(new iiIIiiiiIiiII(stallBean));
    }

    public iiIiIiiiiIiii ALLATORIxDEMO(String name) {
        return this.iIiIiiiiIiIii.get(name);
    }

    public boolean ALLATORIxDEMO(GameView gameView) {
        iiiiiiiiiiIiI IiiiiiiiIIIII = gameView.XZUnit;
        if (IiiiiiiiIIIII == null) return false;
        if (!gameView.roleUnit.iiiIiiiiiiIIi() && !(IiiiiiiiIIIII instanceof iiIIiiiiIiiII)) {
            return false;
        }
        if (IiiiiiiiIIIII instanceof iiIiIiiiiIiii) {
            IiiiiiiiIIIII.ALLATORIxDEMO(gameView);
            return true;
        }
        if (!gameView.roleUnit.iIiIiiiiIIiIi()) {
            return false;
        }
        if (!(IiiiiiiiIIIII instanceof iiIIiiiiIiiII)) {
            if (!iIiIIiiiIiiiI.ALLATORIxDEMO(IiiiiiiiIIIII.iiIiIiiiiIIIi, IiiiiiiiIIIII.IIiiiiiiiIIIi, gameView)) return true;
        }
        IiiiiiiiIIIII.ALLATORIxDEMO(gameView);
        return true;
    }

    public MapModel ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public com.xy.d.IIiIiiiiIiIII ALLATORIxDEMO(long id) {
        String IiiiiiiiIIIII = String.valueOf(id);
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < this.iiIIIiiiiiiiI.size()) {
            com.xy.d.IIiIiiiiIiIII IiiiiiiiIIIII3 = this.iiIIIiiiiiiiI.get(IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3.iiiIiiiiiiiIi.getNpcid().equals(IiiiiiiiIIIII)) return IiiiiiiiIIIII3;
            ++IiiiiiiiIIIII2;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(iiIiIiiiiIiii roleUnit) {
        iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
        synchronized (iIiIIiiiIiiiI2) {
            if (this.ALLATORIxDEMO(roleUnit.ALLATORIxDEMO()) != null) {
                return;
            }
            this.iIiIiiiiIiIii.put(roleUnit.ALLATORIxDEMO(), roleUnit);
            return;
        }
    }

    static {
        iiiIiiiiiiiIi = new com.xy.w.IIIIIiiiIiIii[3];
        IIiiIiiiIIiIi = new Color(255, 255, 255, 96);
        iiIiIiiiiIIIi = 95;
        iIIiIiiiiiiIi = 50;
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void iiiIiiiiiiIIi(Graphics g, GameView gameView) {
        block33: {
            block32: {
                block31: {
                    this.IiIIIiiiiIiiI.clear();
                    this.IIIiiiiiIIiII.clear();
                    IiiiiiiiIIIII = null;
                    IiiiiiiiIIIII = gameView.getMousePoint().x + gameView.mapCamera.ALLATORIxDEMO();
                    IiiiiiiiIIIII = gameView.getMousePoint().y + gameView.mapCamera.iIiIiiiiIIiii();
                    IiiiiiiiIIIII = gameView.roleUnit.IiiiiiiiIIIII;
                    IiiiiiiiIIIII = gameView.XZ;
                    IiiiiiiiIIIII = gameView.getClient().drawCloud != false && SystemData.isWing == false;
                    IiiiiiiiIIIII = gameView.roleData.getTaskSystem().getUnits();
                    IiiiiiiiIIIII = IiiiiiiiIIIII.size() - 1;
                    while (IiiiiiiiIIIII >= 0) {
                        IiiiiiiiIIIII = (IIIIIiiiIiIii)IiiiiiiiIIIII.get(IiiiiiiiIIIII);
                        if ((IiiiiiiiIIIII.ALLATORIxDEMO.getType() == 5 || (long)IiiiiiiiIIIII.ALLATORIxDEMO.getMap() == this.IiiiIiiiIiIII) && IiiiiiiiIIIII.ALLATORIxDEMO(gameView)) {
                            if (IiiiiiiiIIIII && IiiiiiiiIIIII.IiiiiiiiIIIII == IiiiiiiiIIIII && (IiiiiiiiIIIII == null || IiiiiiiiIIIII.IIiiiiiiiIIIi < IiiiiiiiIIIII.IIiiiiiiiIIIi) && IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII;
                            }
                            this.IiIIIiiiiIiiI.add((iiiiiiiiiiIiI)IiiiiiiiIIIII);
                        }
                        --IiiiiiiiIIIII;
                    }
                    IiiiiiiiIIIII = this.iiIiiiiiiIIiI.size() - 1;
                    while (IiiiiiiiIIIII >= 0) {
                        IiiiiiiiIIIII = this.iiIiiiiiiIIiI.get(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII.ALLATORIxDEMO(gameView)) {
                            if (IiiiiiiiIIIII && IiiiiiiiIIIII.IiiiiiiiIIIII == IiiiiiiiIIIII && (IiiiiiiiIIIII == null || IiiiiiiiIIIII.IIiiiiiiiIIIi < IiiiiiiiIIIII.IIiiiiiiiIIIi) && IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII;
                            }
                            this.IiIIIiiiiIiiI.add((iiiiiiiiiiIiI)IiiiiiiiIIIII);
                        }
                        --IiiiiiiiIIIII;
                    }
                    for (iiIiIiiiiIiii IiiiiiiiIIIII : this.iIiIiiiiIiIii.values()) {
                        if (!IiiiiiiiIIIII.ALLATORIxDEMO(gameView)) continue;
                        if (IiiiiiiiIIIII && IiiiiiiiIIIII.IiiiiiiiIIIII == IiiiiiiiIIIII && (IiiiiiiiIIIII == null || IiiiiiiiIIIII.IIiiiiiiiIIIi < IiiiiiiiIIIII.IIiiiiiiiIIIi) && IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII;
                        }
                        if (IiiiiiiiIIIII && IiiiiiiiIIIII.iIiIiiiiIIiii()) {
                            this.IIIiiiiiIIiII.add((iiiiiiiiiiIiI)IiiiiiiiIIIII);
                            continue;
                        }
                        this.IiIIIiiiiIiiI.add((iiiiiiiiiiIiI)IiiiiiiiIIIII);
                    }
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = this.iiIIIiiiiiiiI.size();
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        IiiiiiiiIIIII = this.iiIIIiiiiiiiI.get(IiiiiiiiIIIII);
                        if (IiiiiiiiIIIII.ALLATORIxDEMO(gameView)) {
                            if (IiiiiiiiIIIII && IiiiiiiiIIIII.IiiiiiiiIIIII == IiiiiiiiIIIII && (IiiiiiiiIIIII == null || IiiiiiiiIIIII.IIiiiiiiiIIIi < IiiiiiiiIIIII.IIiiiiiiiIIIi) && IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII) && !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII.iiiIiiiiiiiIi.getNpctype())) {
                                IiiiiiiiIIIII = IiiiiiiiIIIII;
                            }
                            this.IiIIIiiiiIiiI.add((iiiiiiiiiiIiI)IiiiiiiiIIIII);
                        }
                        ++IiiiiiiiIIIII;
                    }
                    if (SystemData.ISSTALL) {
                        IiiiiiiiIIIII = this.IiIiiiiiIIIII.size() - 1;
                        while (IiiiiiiiIIIII >= 0) {
                            IiiiiiiiIIIII = this.IiIiiiiiIIIII.get(IiiiiiiiIIIII);
                            if (IiiiiiiiIIIII.ALLATORIxDEMO(gameView)) {
                                if (IiiiiiiiIIIII && IiiiiiiiIIIII.IiiiiiiiIIIII == IiiiiiiiIIIII && (IiiiiiiiIIIII == null || !(IiiiiiiiIIIII instanceof iiIIiiiiIiiII) || IiiiiiiiIIIII.IIiiiiiiiIIIi < IiiiiiiiIIIII.IIiiiiiiiIIIi)) {
                                    if (IiiiiiiiIIIII.iIiIiiiiIIiii(IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                                    } else if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.IIiiiiiiiIIIi < IiiiiiiiIIIII.IIiiiiiiiIIIi && IiiiiiiiIIIII.ALLATORIxDEMO(IiiiiiiiIIIII, IiiiiiiiIIIII)) {
                                        IiiiiiiiIIIII = IiiiiiiiIIIII;
                                    }
                                }
                                if (IiiiiiiiIIIII.iiiIiiiiiiIIi()) {
                                    this.IiIIIiiiiIiiI.add((iiiiiiiiiiIiI)IiiiiiiiIIIII);
                                }
                            }
                            --IiiiiiiiIIIII;
                        }
                    }
                    IiiiIiiiiIiIi.iIiIiiiiIIiii(this.IiIIIiiiiIiiI, (int)0, (int)(this.IiIIIiiiiIiiI.size() - 1));
                    IiiiIiiiiIiIi.iIiIiiiiIIiii(this.IIIiiiiiIIiII, (int)0, (int)(this.IIIiiiiiIIiII.size() - 1));
                    gameView.XZUnit = IiiiiiiiIIIII;
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = this.IiIIIiiiiIiiI.size();
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        this.IiIIIiiiiIiiI.get(++IiiiiiiiIIIII).ALLATORIxDEMO(g, (iiiiiiiiiiIiI)IiiiiiiiIIIII, gameView);
                    }
                    IiiiiiiiIIIII = 0;
                    IiiiiiiiIIIII = this.IiIIIiiiiIiiI.size();
                    while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                        v0 = this.IiIIIiiiiIiiI.get(IiiiiiiiIIIII);
                        ++IiiiiiiiIIIII;
                        v0.IiiIiiiiiiIiI(g);
                    }
                    if (!IiiiiiiiIIIII || !gameView.roleUnit.iIiIiiiiIIiii()) break block31;
                    if (!SystemData.ISSTALL) break block32;
                    IiiiiiiiIIIII = this.IiIiiiiiIIIII.size() - 1;
                    if (true) ** GOTO lbl95
                }
                IiiiiiiiIIIII = 0;
                IiiiiiiiIIIII = this.IIIiiiiiIIiII.size();
                if (true) ** GOTO lbl113
                do {
                    if ((IiiiiiiiIIIII = this.IiIiiiiiIIIII.get(IiiiiiiiIIIII)).ALLATORIxDEMO(gameView)) {
                        IiiiiiiiIIIII.iIiIiiiiIIiii(g, (iiiiiiiiiiIiI)IiiiiiiiIIIII, gameView);
                    }
                    --IiiiiiiiIIIII;
lbl95:
                    // 2 sources

                } while (IiiiiiiiIIIII >= 0);
            }
            this.ALLATORIxDEMO(g, gameView);
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = this.IIIiiiiiIIiII.size();
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                this.IIIiiiiiIIiII.get(++IiiiiiiiIIIII).ALLATORIxDEMO(g, (iiiiiiiiiiIiI)IiiiiiiiIIIII, gameView);
            }
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = this.IIIiiiiiIIiII.size();
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                v1 = this.IIIiiiiiIIiII.get(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                v1.IiiIiiiiiiIiI(g);
            }
            break block33;
            do {
                this.IIIiiiiiIIiII.get(++IiiiiiiiIIIII).ALLATORIxDEMO(g, (iiiiiiiiiiIiI)IiiiiiiiIIIII, gameView);
lbl113:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII);
            IiiiiiiiIIIII = 0;
            IiiiiiiiIIIII = this.IIIiiiiiIIiII.size();
            while (IiiiiiiiIIIII < IiiiiiiiIIIII) {
                v2 = this.IIIiiiiiIIiII.get(IiiiiiiiIIIII);
                ++IiiiiiiiIIIII;
                v2.IiiIiiiiiiIiI(g);
            }
            if (SystemData.ISSTALL) {
                IiiiiiiiIIIII = this.IiIiiiiiIIIII.size() - 1;
                while (IiiiiiiiIIIII >= 0) {
                    IiiiiiiiIIIII = this.IiIiiiiiIIIII.get(IiiiiiiiIIIII);
                    if (IiiiiiiiIIIII.ALLATORIxDEMO(gameView)) {
                        IiiiiiiiIIIII.iIiIiiiiIIiii(g, (iiiiiiiiiiIiI)IiiiiiiiIIIII, gameView);
                    }
                    --IiiiiiiiIIIII;
                }
            }
        }
        this.iIiIiiiiIIiii(g, gameView);
    }

    public int iIiIiiiiIIiii() {
        return this.iIiiIiiiiiiII.iIiIiiiiIiIii;
    }

    public iIiIIiiiIiiiI() {
        this.iiIIIiiiiiiiI = new ArrayList<com.xy.d.IIiIiiiiIiIII>();
        this.iiIiiiiiiIIiI = new ArrayList<com.xy.d.IIIIIiiiIiiII>();
        this.IiIiiiiiIIIII = new ArrayList<iiIIiiiiIiiII>();
        this.IiIIIiiiiIiiI = new ArrayList();
        this.IIIiiiiiIIiII = new ArrayList();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public com.xy.d.IIIIIiiiIiiII ALLATORIxDEMO(int id) {
        iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
        synchronized (iIiIIiiiIiiiI2) {
            int IiiiiiiiIIIII = this.iiIiiiiiiIIiI.size() - 1;
            while (IiiiiiiiIIIII >= 0) {
                com.xy.d.IIIIIiiiIiiII IiiiiiiiIIIII2 = this.iiIiiiiiiIIiI.get(IiiiiiiiIIIII);
                if (IiiiiiiiIIIII2.IiiiiiiiIIIII.getI() == id) {
                    this.iiIiiiiiiIIiI.remove(IiiiiiiiIIIII);
                    return IiiiiiiiIIIII2;
                }
                --IiiiiiiiIIIII;
            }
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iIiIiiiiIIiii() {
        iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
        synchronized (iIiIIiiiIiiiI2) {
            this.iIiIiiiiIiIii.clear();
            this.iiIIIiiiiiiiI.clear();
            this.IiIiiiiiIIIII.clear();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(String monster, boolean is, GameView gameView) {
        if (!is && IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)monster)) {
            return;
        }
        iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
        synchronized (iIiIIiiiIiiiI2) {
            try {
                int IiiiiiiiIIIII;
                int IiiiiiiiIIIII2;
                if (is) {
                    this.iiIiiiiiiIIiI.clear();
                    if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)monster)) {
                        return;
                    }
                }
                int IiiiiiiiIIIII3 = 0;
                HashMap<Integer, String> IiiiiiiiIIIII4 = null;
                if (monster.startsWith("M")) {
                    IiiiiiiiIIIII3 = monster.indexOf("|");
                    if (IiiiiiiiIIIII3 == -1) {
                        return;
                    }
                    IiiiiiiiIIIII4 = new HashMap<Integer, String>();
                    IiiiiiiiIIIII2 = 1;
                    IiiiiiiiIIIII = 0;
                    while (IiiiiiiiIIIII != IiiiiiiiIIIII3) {
                        int IiiiiiiiIIIII5;
                        IiiiiiiiIIIII = monster.indexOf("#", IiiiiiiiIIIII2 + 1);
                        if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > IiiiiiiiIIIII3) {
                            IiiiiiiiIIIII = IiiiiiiiIIIII3;
                        }
                        if ((IiiiiiiiIIIII5 = monster.indexOf("^", IiiiiiiiIIIII2 + 1)) == -1) {
                            IiiiiiiiIIIII5 = IiiiiiiiIIIII3;
                        }
                        int IiiiiiiiIIIII6 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)IiiiiiiiIIIII2, (int)IiiiiiiiIIIII5);
                        String IiiiiiiiIIIII7 = monster.substring(IiiiiiiiIIIII5 + 1, IiiiiiiiIIIII);
                        IiiiiiiiIIIII7 = IiiiiiiiIIIII7.replace("^", "*");
                        IiiiiiiiIIIII4.put(IiiiiiiiIIIII6, IiiiiiiiIIIII7);
                        IiiiiiiiIIIII2 = IiiiiiiiIIIII + 1;
                    }
                    ++IiiiiiiiIIIII3;
                }
                IiiiiiiiIIIII2 = IiiiiiiiIIIII3;
                IiiiiiiiIIIII = 0;
                while (IiiiiiiiIIIII != monster.length()) {
                    IiiiiiiiIIIII = monster.indexOf("|", IiiiiiiiIIIII2 + 1);
                    if (IiiiiiiiIIIII == -1) {
                        IiiiiiiiIIIII = monster.length();
                    }
                    this.ALLATORIxDEMO(monster, IiiiiiiiIIIII2, IiiiiiiiIIIII, IiiiiiiiIIIII4);
                    IiiiiiiiIIIII2 = IiiiiiiiIIIII + 1;
                }
            }
            catch (Exception IiiiiiiiIIIII) {
                IiiiiiiiIIIII.printStackTrace();
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void iIiIiiiiIIiii(Graphics g, GameView gameView) {
        if (this.ALLATORIxDEMO == null) {
            return;
        }
        var3_3 = this;
        synchronized (var3_3) {
            IiiiiiiiIIIII = com.xy.v.iIiIIiiiIiiiI.ALLATORIxDEMO();
            IiiiiiiiIIIII = null;
            IiiiiiiiIIIII = this.ALLATORIxDEMO;
            if (true) ** GOTO lbl24
            do {
                if (IiiiiiiiIIIII.ALLATORIxDEMO(g, IiiiiiiiIIIII, gameView.mapCamera)) {
                    if (IiiiiiiiIIIII != null) {
                        IiiiiiiiIIIII.iiIiiiiiiiIii = IiiiiiiiIIIII.iiIiiiiiiiIii;
                    } else {
                        this.ALLATORIxDEMO = IiiiiiiiIIIII.iiIiiiiiiiIii;
                    }
                    IiiiiiiiIIIII = IiiiiiiiIIIII;
                    IiiiiiiiIIIII = IiiiiiiiIIIII.iiIiiiiiiiIii;
                    IiiiiiiiIIIII.iiIiiiiiiiIii = null;
                    continue;
                }
                IiiiiiiiIIIII = IiiiiiiiIIIII;
                IiiiiiiiIIIII = IiiiiiiiIIIII.iiIiiiiiiiIii;
lbl24:
                // 3 sources

            } while (IiiiiiiiIIIII != null);
            return;
        }
    }

    public boolean ALLATORIxDEMO(int x, int y, int lvl) {
        return this.iIiiIiiiiiiII.iiiIiiiiiiIIi(x, y, lvl);
    }

    public com.xy.d.IIIIIiiiIiiII ALLATORIxDEMO(int key, int rx, int ry, ScriptTask scriptTask) {
        int IiiiiiiiIIIII = Integer.MAX_VALUE;
        boolean IiiiiiiiIIIII2 = false;
        com.xy.d.IIIIIiiiIiiII IiiiiiiiIIIII3 = null;
        int IiiiiiiiIIIII4 = this.iiIiiiiiiIIiI.size() - 1;
        while (IiiiiiiiIIIII4 >= 0) {
            com.xy.d.IIIIIiiiIiiII IiiiiiiiIIIII5 = this.iiIiiiiiiIIiI.get(IiiiiiiiIIIII4);
            if (IiiiiiiiIIIII5.IiiiiiiiIIIII.getRobotid() == key && IiiiiiiiIIIII5.IiiiiiiiIIIII.getType() == 0) {
                int IiiiiiiiIIIII6 = (IiiiiiiiIIIII5.iiIiIiiiiIIIi - rx) / 20;
                int IiiiiiiiIIIII7 = (IiiiiiiiIIIII5.IIiiiiiiiIIIi - ry) / 20;
                int IiiiiiiiIIIII8 = IiiiiiiiIIIII6 * IiiiiiiiIIIII6 + IiiiiiiiIIIII7 * IiiiiiiiIIIII7;
                if (!(IiiiiiiiIIIII3 != null && IiiiiiiiIIIII <= IiiiiiiiIIIII8 || IiiiiiiiIIIII3 != null && scriptTask.ALLATORIxDEMO((long)IiiiiiiiIIIII5.IiiiiiiiIIIII.getI().intValue()))) {
                    IiiiiiiiIIIII3 = IiiiiiiiIIIII5;
                    IiiiiiiiIIIII2 = scriptTask.ALLATORIxDEMO((long)IiiiiiiiIIIII3.IiiiiiiiIIIII.getI().intValue());
                    IiiiiiiiIIIII = IiiiiiiiIIIII8;
                    if (IiiiiiiiIIIII < 160 && !IiiiiiiiIIIII2) {
                        return IiiiiiiiIIIII3;
                    }
                }
            }
            --IiiiiiiiIIIII4;
        }
        return IiiiiiiiIIIII3;
    }

    public long ALLATORIxDEMO() {
        return this.IiiiIiiiIiIII;
    }

    private /* synthetic */ void ALLATORIxDEMO(String monster, int index, int end, Map<Integer, String> pointMap) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        String IiiiiiiiIIIII3 = null;
        String IiiiiiiiIIIII4 = null;
        String IiiiiiiiIIIII5 = null;
        int IiiiiiiiIIIII6 = 0;
        int IiiiiiiiIIIII7 = 0;
        while (IiiiiiiiIIIII7 != end) {
            block36: {
                IiiiiiiiIIIII7 = monster.indexOf("#", index);
                if (IiiiiiiiIIIII7 == -1 || IiiiiiiiIIIII7 > end) {
                    IiiiiiiiIIIII7 = end;
                }
                if (IiiiiiiiIIIII6 == 0) {
                    IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)index, (int)IiiiiiiiIIIII7);
                } else if (IiiiiiiiIIIII6 == 1) {
                    IiiiiiiiIIIII3 = monster.substring(index, IiiiiiiiIIIII7);
                    int IiiiiiiiIIIII8 = IiiiiiiiIIIII3.indexOf("&");
                    if (IiiiiiiiIIIII8 != -1) {
                        IiiiiiiiIIIII4 = IiiiiiiiIIIII3.substring(IiiiiiiiIIIII8 + 1);
                        IiiiiiiiIIIII3 = IiiiiiiiIIIII3.substring(0, IiiiiiiiIIIII8);
                    }
                } else if (IiiiiiiiIIIII6 == 2) {
                    IiiiiiiiIIIII5 = monster.substring(index, IiiiiiiiIIIII7);
                } else if (IiiiiiiiIIIII6 == 3) {
                    IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)index, (int)IiiiiiiiIIIII7);
                } else {
                    MonsterBean IiiiiiiiIIIII8 = new MonsterBean();
                    IiiiiiiiIIIII8.setRobotid(Integer.valueOf(IiiiiiiiIIIII));
                    IiiiiiiiIIIII8.setRobotname(IiiiiiiiIIIII3);
                    IiiiiiiiIIIII8.setRobottitle(IiiiiiiiIIIII4);
                    IiiiiiiiIIIII8.setRobotskin(IiiiiiiiIIIII5);
                    IiiiiiiiIIIII8.setRobottype(IiiiiiiiIIIII2);
                    IiiiiiiiIIIII8.setType(0);
                    int IiiiiiiiIIIII9 = 0;
                    int IiiiiiiiIIIII10 = 0;
                    while (IiiiiiiiIIIII10 != IiiiiiiiIIIII7) {
                        int IiiiiiiiIIIII11;
                        Object IiiiiiiiIIIII12;
                        IiiiiiiiIIIII10 = monster.indexOf("^", index + 1);
                        if (IiiiiiiiIIIII10 == -1 || IiiiiiiiIIIII10 > IiiiiiiiIIIII7) {
                            IiiiiiiiIIIII10 = IiiiiiiiIIIII7;
                        }
                        if (IiiiiiiiIIIII9 == 0) {
                            IiiiiiiiIIIII8.setI(Integer.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)index, (int)IiiiiiiiIIIII10)));
                        } else if (IiiiiiiiIIIII9 == 1) {
                            IiiiiiiiIIIII8.setX(Integer.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)index, (int)IiiiiiiiIIIII10)));
                        } else if (IiiiiiiiIIIII9 == 2) {
                            IiiiiiiiIIIII8.setY(Integer.valueOf(IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)index, (int)IiiiiiiiIIIII10)));
                        } else if (monster.charAt(index) == 'S') {
                            IiiiiiiiIIIII8.setType(IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)(index + 1), (int)IiiiiiiiIIIII10));
                            if (IiiiiiiiIIIII8.getType() == 2) {
                                break block36;
                            }
                        } else if (monster.charAt(index) == 'L') {
                            int IiiiiiiiIIIII13;
                            int n = IiiiiiiiIIIII13 = pointMap != null ? monster.indexOf(",", index + 1) : -1;
                            if (IiiiiiiiIIIII13 != -1 && IiiiiiiiIIIII13 <= IiiiiiiiIIIII10 && (IiiiiiiiIIIII12 = pointMap.get(IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)(index + 1), (int)IiiiiiiiIIIII13))) != null) {
                                IiiiiiiiIIIII11 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)(IiiiiiiiIIIII13 + 1), (int)IiiiiiiiIIIII10);
                                CreepsMovePath IiiiiiiiIIIII14 = new CreepsMovePath(IiiiiiiiIIIII8.getX().intValue(), IiiiiiiiIIIII8.getY().intValue(), IiiiiiiiIIIII11, (String)IiiiiiiiIIIII12);
                                IiiiiiiiIIIII8.setMovePath(IiiiiiiiIIIII14);
                            }
                        } else if (monster.charAt(index) == 'H') {
                            int IiiiiiiiIIIII15 = monster.indexOf(",", index + 1);
                            if (IiiiiiiiIIIII15 != -1 && IiiiiiiiIIIII15 <= IiiiiiiiIIIII10) {
                                int IiiiiiiiIIIII16 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)(index + 1), (int)IiiiiiiiIIIII15);
                                IiiiiiiiIIIII11 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)monster, (int)(IiiiiiiiIIIII15 + 1), (int)IiiiiiiiIIIII10);
                                if (IiiiiiiiIIIII8.getHP() != null) {
                                    IiiiiiiiIIIII8.getHP().setX(IiiiiiiiIIIII16);
                                    IiiiiiiiIIIII8.getHP().setY(IiiiiiiiIIIII11);
                                } else {
                                    IiiiiiiiIIIII8.setHP(new PathPoint(IiiiiiiiIIIII16, IiiiiiiiIIIII11));
                                }
                            }
                        } else if (monster.charAt(index) == 'G') {
                            iiIiIiiiiIiii IiiiiiiiIIIII17 = this.ALLATORIxDEMO(new BigDecimal(monster.substring(index + 1, IiiiiiiiIIIII10)));
                            if (IiiiiiiiIIIII17 != null) {
                                IiiiiiiiIIIII8.setFollow(IiiiiiiiIIIII17.ALLATORIxDEMO());
                            }
                        } else if (monster.charAt(index) == 'T') {
                            String[] IiiiiiiiIIIII18 = monster.substring(index + 1, IiiiiiiiIIIII10).split(",");
                            IiiiiiiiIIIII12 = new ArrayList();
                            IiiiiiiiIIIII11 = 0;
                            while (IiiiiiiiIIIII11 < IiiiiiiiIIIII18.length) {
                                String string = IiiiiiiiIIIII18[IiiiiiiiIIIII11];
                                ++IiiiiiiiIIIII11;
                                IiiiiiiiIIIII12.add(Integer.parseInt(string));
                            }
                            if (IiiiiiiiIIIII12.size() >= 2) {
                                IiiiiiiiIIIII8.setTaskList((List)IiiiiiiiIIIII12);
                            }
                        }
                        ++IiiiiiiiIIIII9;
                        index = IiiiiiiiIIIII10 + 1;
                    }
                    com.xy.d.IIIIIiiiIiiII IiiiiiiiIIIII22 = new com.xy.d.IIIIIiiiIiiII(IiiiiiiiIIIII8);
                    this.iiIiiiiiiIIiI.add(IiiiiiiiIIIII22);
                }
            }
            ++IiiiiiiiIIIII6;
            index = IiiiiiiiIIIII7 + 1;
        }
    }

    public void ALLATORIxDEMO() {
        for (iiIiIiiiiIiii IiiiiiiiIIIII : this.iIiIiiiiIiIii.values()) {
            if (IiiiiiiiIIIII.iIiIiiiiIiIii.getMount_id() == 0) continue;
            IiiiiiiiIIIII.ALLATORIxDEMO(null, IiiiiiiiIIIII.iIiIiiiiIiIii);
        }
    }

    public Image ALLATORIxDEMO(int x, int y) {
        if (x < 0) return null;
        if (y < 0) return null;
        if (y >= this.iIiiIiiiiiiII.IIiiiiiiiIIIi.length) return null;
        if (x >= this.iIiiIiiiiiiII.IIiiiiiiiIIIi[0].length) {
            return null;
        }
        IIiIiiiiIiIII IiiiiiiiIIIII = this.iIiiIiiiiiiII.IIiiiiiiiIIIi[y][x];
        if (IiiiiiiiIIIII == null) {
            return null;
        }
        if (IiiiiiiiIIIII.IiiiiiiiIIIII == 0) return IiiiiiiiIIIII.ALLATORIxDEMO;
        if (IiiiiiiiIIIII.ALLATORIxDEMO != null) return IiiiiiiiIIIII.ALLATORIxDEMO;
        this.iIiiIiiiiiiII.ALLATORIxDEMO(IiiiiiiiIIIII);
        return IiiiiiiiIIIII.ALLATORIxDEMO;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(RoleShow roleShow) {
        iIiIIiiiIiiiI iIiIIiiiIiiiI2 = this;
        synchronized (iIiIIiiiIiiiI2) {
            iiIiIiiiiIiii IiiiiiiiIIIII = this.ALLATORIxDEMO(roleShow.getRolename());
            if (IiiiiiiiIIIII == null) {
                IiiiiiiiIIIII = new iiIiIiiiiIiii(roleShow);
                this.iIiIiiiiIiIii.put(IiiiiiiiIIIII.ALLATORIxDEMO(), IiiiiiiiIIIII);
                return;
            }
            IiiiiiiiIIIII.ALLATORIxDEMO(roleShow);
            return;
        }
    }

    public void ALLATORIxDEMO(MapModel mapModel, IIIIIiiiIiiII mapDecoder) {
        this.iiIiiiiiiiIii = mapModel;
        this.iIiiIiiiiiiII = mapDecoder;
        if (this.IiiiiiiiIIIII != null) {
            this.IiiiiiiiIIIII.clear();
        } else {
            this.IiiiiiiiIIIII = new ArrayList<Door>();
        }
        this.iiiiIiiiIiiII = !IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)mapModel.getMapMonster());
        if (IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)mapModel.getMapDoor())) return;
        List IiiiiiiiIIIII = IIiiIiiiiIIiI.ALLATORIxDEMO((String)mapModel.getMapDoor());
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.size()) {
            Door IiiiiiiiIIIII3 = this.iiiiIiiiIIiii.ALLATORIxDEMO((String)IiiiiiiiIIIII.get(IiiiiiiiIIIII2));
            if (IiiiiiiiIIIII3 != null) {
                this.IiiiiiiiIIIII.add(IiiiiiiiIIIII3);
            }
            ++IiiiiiiiIIIII2;
        }
    }

    public static boolean ALLATORIxDEMO(int x, int y, GameView gameView) {
        x = Math.abs(gameView.roleUnit.iiIiIiiiiIIIi - x);
        y = Math.abs(gameView.roleUnit.IIiiiiiiiIIIi - y);
        if (x <= 305) {
            if (y <= 230) return true;
        }
        gameView.iiiIiiiiiiIIi("\u4f60\u8ddd\u79bb\u592a\u8fdc\u4e86,\u8bf7\u9760\u8fd1\u4e00\u70b9");
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(Graphics graphics, GameView gameView) {
        void gameView2;
        void g;
        g.setColor(IIiiIiiiIIiIi);
        graphics.fillRect(0, 0, gameView2.screenData.Screen_x, gameView2.screenData.Screen_y);
        int IiiiiiiiIIIII = (int)(com.xy.v.iIiIIiiiIiiiI.ALLATORIxDEMO() / 50L);
        int IiiiiiiiIIIII2 = gameView2.mapCamera.iIiIiiiiIIiii() - 64;
        IiiiiiiiIIIII2 += 160 - IiiiiiiiIIIII2 % 160;
        int IiiiiiiiIIIII3 = 1 + this.iIiiIiiiiiiII.IiIiiiiiIIIII / 3600;
        int IiiiiiiiIIIII4 = IiiiiiiiIIIII2;
        int IiiiiiiiIIIII5 = IiiiiiiiIIIII2 + gameView2.screenData.Screen_y;
        while (IiiiiiiiIIIII4 < IiiiiiiiIIIII5) {
            int IiiiiiiiIIIII6 = IiiiiiiiIIIII4 / 160;
            IiiiiiiiIIIII6 = IiiiiiiiIIIII6 * 1245 + IiiiiiiiIIIII6 % 3 * 420 + IiiiiiiiIIIII;
            int IiiiiiiiIIIII7 = 0;
            while (IiiiiiiiIIIII7 < 3) {
                int IiiiiiiiIIIII8 = (IiiiiiiiIIIII7 * 1200 + IiiiiiiiIIIII6) % 3600;
                int IiiiiiiiIIIII9 = -1;
                while (IiiiiiiiIIIII9 < IiiiiiiiIIIII3) {
                    com.xy.w.IIIIIiiiIiIii IiiiiiiiIIIII10;
                    Point IiiiiiiiIIIII11 = gameView2.mapCamera.ALLATORIxDEMO(IiiiiiiiIIIII8 + 3600 * IiiiiiiiIIIII9, IiiiiiiiIIIII4);
                    if (IiiiiiiiIIIII11 != null && (IiiiiiiiIIIII10 = com.xy.w.iiiiiiiiiiIiI.iIiIiiiiIIiii((String)IIiIiiiiIiiIi.IIIIiiiiiiiII[IiiiiiiiIIIII7])) != null) {
                        IiiiiiiiIIIII10.ALLATORIxDEMO((Graphics)g, IiiiiiiiIIIII11.x, IiiiiiiiIIIII11.y);
                    }
                    ++IiiiiiiiIIIII9;
                }
                ++IiiiiiiiIIIII7;
            }
            IiiiiiiiIIIII4 += 160;
        }
    }

    public int ALLATORIxDEMO(Door door, int x, int y) {
        if (door == null) {
            return 1001;
        }
        int[] IiiiiiiiIIIII = door.getRects();
        if (IiiiiiiiIIIII != null) return (Math.abs(Math.abs((IiiiiiiiIIIII[0] + IiiiiiiiIIIII[1]) / 2) - x) + Math.abs(Math.abs((IiiiiiiiIIIII[2] + IiiiiiiiIIIII[3]) / 2) - y)) / 2;
        return 1001;
    }

    /*
     * Unable to fully structure code
     */
    public Door ALLATORIxDEMO(int x, int y, int z) {
        block5: {
            if (this.IiiiiiiiIIIII == null) return null;
            if (this.IiiiiiiiIIIII.size() == 0) {
                return null;
            }
            if (!this.iIiiIiiiiiiII.iiIIIiiiiiiiI) break block5;
            var5_4 = this.IiiiiiiiIIIII.iterator();
            if (true) ** GOTO lbl20
        }
        if (!this.iIiiIiiiiiiII.ALLATORIxDEMO(x / IIIIIiiiIiiII.iiIiiiiiiiIii, y / IIIIIiiiIiiII.iiIiiiiiiiIii, z)) {
            return null;
        }
        IiiiiiiiIIIII = null;
        IiiiiiiiIIIII = 1000;
        IiiiiiiiIIIII = 0;
        if (true) ** GOTO lbl27
        do {
            if ((IiiiiiiiIIIII = (IiiiiiiiIIIII = var5_4.next()).getRects()) == null) continue;
            IiiiiiiiIIIII = (IiiiiiiiIIIII[0] + IiiiiiiiIIIII[1]) / 2;
            IiiiiiiiIIIII = (IiiiiiiiIIIII[2] + IiiiiiiiIIIII[3]) / 2;
            if (Math.abs(IiiiiiiiIIIII - x) >= iIiIIiiiIiiiI.iiIiIiiiiIIIi || Math.abs(IiiiiiiiIIIII - y) >= iIiIIiiiIiiiI.iIIiIiiiiiiIi) continue;
            return IiiiiiiiIIIII;
lbl20:
            // 3 sources

        } while (var5_4.hasNext());
        return null;
        do {
            if ((IiiiiiiiIIIII = this.ALLATORIxDEMO(this.IiiiiiiiIIIII.get(IiiiiiiiIIIII), x, y)) < IiiiiiiiIIIII && IiiiiiiiIIIII < 250) {
                IiiiiiiiIIIII = IiiiiiiiIIIII;
                IiiiiiiiIIIII = this.IiiiiiiiIIIII.get(IiiiiiiiIIIII);
            }
            ++IiiiiiiiIIIII;
lbl27:
            // 2 sources

        } while (IiiiiiiiIIIII < this.IiiiiiiiIIIII.size());
        return IiiiiiiiIIIII;
    }

    public iiIiIiiiiIiii ALLATORIxDEMO(BigDecimal id) {
        for (iiIiIiiiiIiii IiiiiiiiIIIII : this.iIiIiiiiIiIii.values()) {
            if (IiiiiiiiIIIII.iIiIiiiiIiIii.getRole_id().compareTo(id) != 0) continue;
            return IiiiiiiiIIIII;
        }
        return null;
    }

    public int ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII.IiIiiiiiIIIII;
    }
}
