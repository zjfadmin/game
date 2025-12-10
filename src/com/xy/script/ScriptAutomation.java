/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.a.iiIiIiiiiIIII
 *  com.xy.a.q.IiIIIiiiiIiii
 *  com.xy.bean.RoleShow
 *  com.xy.d.IIIIIiiiIiIii
 *  com.xy.d.IIIIIiiiIiiII
 *  com.xy.d.IIiIiiiiIiIII
 *  com.xy.d.iiIiIiiiiIiii
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.formula.GoodType
 *  com.xy.game.GameUtil
 *  com.xy.game.HandleGood
 *  com.xy.game.HandleOption
 *  com.xy.game.NpcOption
 *  com.xy.game.RoleData
 *  com.xy.game.Task
 *  com.xy.game.TaskProgress
 *  com.xy.n.IIiiIiiiiIIiI
 *  com.xy.readbean.Door
 *  com.xy.readbean.GoodFight
 *  com.xy.readbean.Goodstable
 *  com.xy.richtext.TipBox
 *  com.xy.script.ScriptEnd
 *  com.xy.script.ScriptIndex
 *  com.xy.script.ScriptOpen
 *  com.xy.script.ScriptTask
 *  com.xy.socket.Agreement
 *  com.xy.socket.GameClient
 *  com.xy.socket.ParamTool
 *  com.xy.text.FlyEquip
 *  com.xy.text.GameView
 *  com.xy.v.iIiIIiiiIiiiI
 */
package com.xy.script;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.a.iiIiIiiiiIIII;
import com.xy.a.q.IiIIIiiiiIiii;
import com.xy.bean.RoleShow;
import com.xy.d.IIIIIiiiIiIii;
import com.xy.d.IIIIIiiiIiiII;
import com.xy.d.IIiIiiiiIiIII;
import com.xy.d.iiIiIiiiiIiii;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.formula.GoodType;
import com.xy.game.GameUtil;
import com.xy.game.HandleGood;
import com.xy.game.HandleOption;
import com.xy.game.NpcOption;
import com.xy.game.RoleData;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.n.IIiiIiiiiIIiI;
import com.xy.readbean.Door;
import com.xy.readbean.GoodFight;
import com.xy.readbean.Goodstable;
import com.xy.richtext.TipBox;
import com.xy.script.ScriptEnd;
import com.xy.script.ScriptIndex;
import com.xy.script.ScriptOpen;
import com.xy.script.ScriptTask;
import com.xy.socket.Agreement;
import com.xy.socket.GameClient;
import com.xy.socket.ParamTool;
import com.xy.text.FlyEquip;
import com.xy.text.GameView;
import com.xy.v.iIiIIiiiIiiiI;
import java.awt.Point;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ScriptAutomation {
    private boolean assist;
    private TipBox tipBox;
    private int timeInterval;
    private ScriptTask scriptTask;
    private int access;
    private List<Object> scriptList;
    public boolean script = false;
    public GameView gameView;

    private /* synthetic */ void ALLATORIxDEMO(int size, ScriptOpen open) {
        if (open.getType() == 0) {
            Goodstable IiiiiiiiIIIII;
            boolean IiiiiiiiIIIII2 = false;
            if (this.gameView.getClient().VALUE.indexOf("P") != -1 && this.gameView.roleData.getEquipGood(14) == null && (IiiiiiiiIIIII = this.gameView.roleData.getUsableFly()) != null) {
                String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"rolechange", (String)("FE" + IiiiiiiiIIIII.getRgid()));
                this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
                IiiiiiiiIIIII2 = true;
                this.gameView.flyEquip = new FlyEquip(open.getX() / 20, open.getY() / 20, true, iIiIIiiiIiiiI.ALLATORIxDEMO());
            }
            if (!IiiiiiiiIIIII2) {
                GameUtil.ALLATORIxDEMO((int)(open.getX() / 20), (int)(open.getY() / 20), (int)0, (boolean)true, (GameView)this.gameView);
            }
        } else if (open.getType() == 1) {
            Door IiiiiiiiIIIII = this.gameView.getObjectArea().ALLATORIxDEMO(String.valueOf(open.getId()));
            if (IiiiiiiiIIIII != null) {
                HandleOption.ALLATORIxDEMO((Door)IiiiiiiiIIIII, (int)3, (GameView)this.gameView);
            }
        } else if (open.getType() == 2) {
            this.gameView.getFormManagement().iiiIiiiiiiIIi(27);
            Door IiiiiiiiIIIII = this.gameView.getObjectArea().ALLATORIxDEMO(String.valueOf(open.getId()));
            if (IiiiiiiiIIIII != null) {
                HandleOption.ALLATORIxDEMO((Door)IiiiiiiiIIIII, (int)3, (GameView)this.gameView);
            }
        } else if (open.getType() == 3) {
            Goodstable IiiiiiiiIIIII = this.gameView.roleData.getGood(new BigDecimal(open.getId()));
            if (IiiiiiiiIIIII == null || !GoodType.IIiIIiiiIiIIi((long)IiiiiiiiIIIII.getType())) {
                this.gameView.iiiIiiiiiiIIi("\u5b54\u660e\u706f\u5750\u6807\u5df2\u4e22\u5931,\u672c\u6b21\u81ea\u52a8\u53d6\u6d88");
                return;
            }
            GoodFight IiiiiiiiIIIII4 = IiiiiiiiIIIII.getFight().getFight(open.getMap(), open.getX(), open.getY());
            if (IiiiiiiiIIIII4 == null) {
                this.gameView.iiiIiiiiiiIIi("\u5b54\u660e\u706f\u5750\u6807\u5df2\u4e22\u5931,\u672c\u6b21\u81ea\u52a8\u53d6\u6d88");
                return;
            }
            HandleOption.ALLATORIxDEMO((boolean)true, (GoodFight)IiiiiiiiIIIII4, (Goodstable)IiiiiiiiIIIII, (GameView)this.gameView);
            this.gameView.getFormManagement().iiiIiiiiiiIIi(27);
        } else if (open.getType() == 4) {
            HandleOption.ALLATORIxDEMO((int)open.getMap(), (int)open.getX(), (int)open.getY(), (GameView)this.gameView);
        } else if (open.getType() == 10) {
            Goodstable IiiiiiiiIIIII = this.gameView.roleData.getGood(new BigDecimal(open.getId()));
            if (IiiiiiiiIIIII == null || !GoodType.IIiIIiiiIiIIi((long)IiiiiiiiIIIII.getType())) {
                this.gameView.iiiIiiiiiiIIi("\u5b54\u660e\u706f\u5750\u6807\u5df2\u4e22\u5931,\u672c\u6b21\u81ea\u52a8\u53d6\u6d88");
                return;
            }
            HandleGood.IIIiiiiiiIIiI((Goodstable)IiiiiiiiIIIII, (RoleData)this.gameView.roleData);
        } else if (open.getType() == 11) {
            IIiIiiiiIiIII IiiiiiiiIIIII = this.gameView.mapScene.ALLATORIxDEMO(open.getId());
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.ALLATORIxDEMO(this.gameView);
            }
        } else if (open.getType() == 12) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.gameView.getFormManagement().iIiIiiiiIIiii(27);
            if (IiiiiiiiIIIII != null && IiiiiiiiIIIII.ALLATORIxDEMO() instanceof IIiIiiiiIiIII) {
                IIiIiiiiIiIII IiiiiiiiIIIII5 = (IIiIiiiiIiIII)IiiiiiiiIIIII.ALLATORIxDEMO();
                NpcOption.ALLATORIxDEMO((int)open.getMap(), (int)((int)open.getId()), null, (String)IiiiiiiiIIIII5.iiiIiiiiiiiIi.getNpcway(), (GameView)this.gameView);
            }
            this.gameView.getFormManagement().iiiIiiiiiiIIi(27);
        } else if (open.getType() == 13) {
            IIiIiiiiIiIII IiiiiiiiIIIII = this.gameView.mapScene.ALLATORIxDEMO(open.getId());
            if (IiiiiiiiIIIII != null) {
                IiIIIiiiiIiii IiiiiiiiIIIII6 = (IiIIIiiiiIiii)this.gameView.getFormManagement().iIiIiiiiIIiii(27);
                if (IiiiiiiiIIIII6 == null) {
                    iiIiIiiiiIiii.ALLATORIxDEMO((iiiiiiiiiiIiI)IiiiiiiiIIIII, (GameView)this.gameView);
                    return;
                }
                if (IiiiiiiiIIIII6.ALLATORIxDEMO() != IiiiiiiiIIIII) {
                    this.gameView.getFormManagement().iiiIiiiiiiIIi(27);
                    return;
                }
                Goodstable IiiiiiiiIIIII7 = this.gameView.roleData.ALLATORIxDEMO(new BigDecimal(open.getMap()));
                if (IiiiiiiiIIIII7 == null) {
                    this.gameView.iiiIiiiiiiIIi("\u6ca1\u6709\u76f8\u5e94\u7269\u54c1");
                    return;
                }
                IiiiiiiiIIIII6.ALLATORIxDEMO(IiiiiiiiIIIII7, true);
                IiiiiiiiIIIII6.IiiIiiiiiiIiI();
                this.scriptList.set(size, null);
                return;
            }
        } else if (open.getType() == 14) {
            IIIIIiiiIiIii IiiiiiiiIIIII = this.gameView.roleData.getTaskSystem().getTaskUnit(open.getId(), this.gameView.mapScene.IiiiIiiiIiIII);
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.ALLATORIxDEMO(this.gameView);
            }
        } else if (open.getType() == 15) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.gameView.getFormManagement().iIiIiiiiIIiii(27);
            if (IiiiiiiiIIIII != null) {
                HandleOption.ALLATORIxDEMO((int)0, (iIIiiiiiIIIIi)IiiiiiiiIIIII);
            }
            this.gameView.getFormManagement().iiiIiiiiiiIIi(27);
        } else if (open.getType() == 16) {
            IIIIIiiiIiiII IiiiiiiiIIIII = this.gameView.mapScene.iIiIiiiiIIiii((int)open.getId());
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.ALLATORIxDEMO(this.gameView);
            }
        } else if (open.getType() == 17) {
            iIIiiiiiIIIIi IiiiiiiiIIIII = (iIIiiiiiIIIIi)this.gameView.getFormManagement().iIiIiiiiIIiii(27);
            if (IiiiiiiiIIIII != null) {
                HandleOption.ALLATORIxDEMO((int)0, (iIIiiiiiIIIIi)IiiiiiiiIIIII);
            }
            this.gameView.getFormManagement().iiiIiiiiiiIIi(27);
        }
        this.scriptList.remove(size);
    }

    public ScriptAutomation(GameView gameView) {
        this.gameView = gameView;
    }

    public void setTipText(String text) {
        this.getTipBox().setText(text);
    }

    public void iIiIiiiiIIiIi() {
        if (this.access != 0) return;
        this.ALLATORIxDEMO(false, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void iiiIiiiiiiIIi() {
        ScriptAutomation scriptAutomation = this;
        synchronized (scriptAutomation) {
            if (this.gameView.getBattleScene() != null) {
                return;
            }
            if (!this.gameView.roleUnit.iIiIiiiiIIiIi()) {
                this.ALLATORIxDEMO(false, 0);
                return;
            }
            if (!this.scriptTask.ALLATORIxDEMO()) {
                return;
            }
            if (this.scriptTask.getNpcID() == 0) {
                ScriptIndex IiiiiiiiIIIII = this.scriptTask.getScriptIndex(0, null);
                this.scriptTask.ALLATORIxDEMO();
                ScriptAutomation scriptAutomation2 = this;
                if (IiiiiiiiIIIII != null) {
                    scriptAutomation2.ALLATORIxDEMO(IiiiiiiiIIIII);
                } else {
                    scriptAutomation2.ALLATORIxDEMO();
                }
                return;
            }
            Task IiiiiiiiIIIII = this.gameView.roleData.getTaskSystem().getSetTask(this.scriptTask.getTaskSetID());
            if (IiiiiiiiIIIII != null) {
                this.scriptTask.ALLATORIxDEMO();
                this.ALLATORIxDEMO(IiiiiiiiIIIII);
                return;
            }
            if (this.scriptTask.ALLATORIxDEMO() >= 0) {
                RoleShow IiiiiiiiIIIII2;
                int IiiiiiiiIIIII3;
                int n = IiiiiiiiIIIII3 = this.scriptTask.iiiIiiiiiiIIi() ? this.access : 1;
                if (this.scriptTask.iiiIiiiiiiIIi() && this.access == 1 && this.gameView.getClient().ALLATORIxDEMO(2, 12)) {
                    Goodstable goodstable = IiiiiiiiIIIII2 = this.gameView.systemData.IiiIiiiiiiIiI() ? this.gameView.roleData.ALLATORIxDEMO(105L) : null;
                    if (IiiiiiiiIIIII2 != null) {
                        IiiiiiiiIIIII2.ALLATORIxDEMO(1);
                        ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII2, (int)1, (GameClient)this.gameView.getClient());
                        if (IiiiiiiiIIIII2.getUsetime() <= 0) {
                            this.gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII2.getRgid());
                        }
                    } else {
                        IiiiiiiiIIIII3 = 0;
                    }
                }
                IiiiiiiiIIIII2 = this.gameView.roleUnit.iIiIiiiiIiIii;
                List IiiiiiiiIIIII4 = this.gameView.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2.getMapid().intValue(), IiiiiiiiIIIII2.getX(), IiiiiiiiIIIII2.getY(), 0, this.scriptTask.getMap(), this.scriptTask.getX(), this.scriptTask.getY(), 0, IiiiiiiiIIIII3, this.gameView.roleData);
                if (IiiiiiiiIIIII4 == null) {
                    this.gameView.iiiIiiiiiiIIi("\u4f60\u6240\u5728\u4f4d\u7f6e\u65e0\u6cd5\u8fbe\u5230\u76ee\u7684\u5730");
                    this.ALLATORIxDEMO();
                    return;
                }
                ScriptOpen IiiiiiiiIIIII5 = new ScriptOpen(11, (long)this.scriptTask.getNpcID());
                IiiiiiiiIIIII4.add(0, IiiiiiiiIIIII5);
                ScriptOpen IiiiiiiiIIIII6 = new ScriptOpen(12, (long)this.scriptTask.getTaskID(), this.scriptTask.getTaskSetID(), 0, 0, 0);
                IiiiiiiiIIIII4.add(0, IiiiiiiiIIIII6);
                this.ALLATORIxDEMO(IiiiiiiiIIIII4);
            } else {
                if (this.scriptTask.iiiIiiiiiiIIi()) {
                    this.ALLATORIxDEMO();
                    return;
                }
                ArrayList<Object> IiiiiiiiIIIII7 = new ArrayList<Object>();
                ScriptOpen IiiiiiiiIIIII8 = new ScriptOpen(4, 0L, this.scriptTask.getMap(), this.scriptTask.getX(), this.scriptTask.getY(), 0);
                IiiiiiiiIIIII7.add(0, IiiiiiiiIIIII8);
                ScriptEnd IiiiiiiiIIIII9 = new ScriptEnd(this.scriptTask.getMap(), this.scriptTask.getX(), this.scriptTask.getY(), 0);
                IiiiiiiiIIIII7.add(0, IiiiiiiiIIIII9);
                IiiiiiiiIIIII7.add(null);
                IiiiiiiiIIIII7.add(null);
                ScriptEnd IiiiiiiiIIIII10 = new ScriptEnd(1);
                IiiiiiiiIIIII7.add(IiiiiiiiIIIII10);
                this.ALLATORIxDEMO(IiiiiiiiIIIII7);
            }
            this.scriptTask.ALLATORIxDEMO();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(List<Object> list) {
        ScriptAutomation scriptAutomation = this;
        synchronized (scriptAutomation) {
            this.script = true;
            this.scriptList = list;
            return;
        }
    }

    public TipBox getTipBox() {
        if (this.tipBox != null) {
            return this.tipBox;
        }
        this.tipBox = new TipBox("#Y\u81ea\u52a8\u5bfb\u8def\u4e2d", null);
        return this.tipBox;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     */
    public void iIiIiiiiIIiii() {
        ScriptAutomation scriptAutomation = this;
        synchronized (scriptAutomation) {
            if (this.scriptTask == null) {
                this.ALLATORIxDEMO(false, 0);
            } else {
                this.scriptList = null;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(boolean assist, int access) {
        ScriptAutomation scriptAutomation = this;
        synchronized (scriptAutomation) {
            this.assist = assist;
            this.access = access;
            this.script = false;
            this.scriptList = null;
            this.scriptTask = null;
            this.gameView.getGameReadBar().setReadBar(0, 0, null, 0.0, 0L, null);
            iiIiIiiiiIIII IiiiiiiiIIIII = (iiIiIiiiiIIII)this.gameView.getFormManagement().iIiIiiiiIIiii(145);
            if (IiiiiiiiIIIII == null) return;
            IiiiiiiiIIIII.iiiIiiiiiiIIi(false);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(Task task, int state) {
        ScriptAutomation scriptAutomation = this;
        synchronized (scriptAutomation) {
            if (this.scriptTask == null) return;
            if (this.scriptTask.getTaskSetID() != task.getTaskData().getTaskSetID()) {
                return;
            }
            if (state != 9 && state != 8) {
                if (state != 4) return;
                this.scriptTask.setTimeAssist();
                return;
            }
            this.ALLATORIxDEMO();
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(ScriptTask scriptTask, boolean assist, int access) {
        ScriptAutomation scriptAutomation = this;
        synchronized (scriptAutomation) {
            this.ALLATORIxDEMO(assist, access);
            this.scriptTask = scriptTask;
            scriptTask.setTimeAssist();
            this.script = true;
            return;
        }
    }

    public void ALLATORIxDEMO(ScriptTask scriptTask) {
        this.ALLATORIxDEMO(scriptTask, false, 0);
    }

    public void ALLATORIxDEMO(Task task) {
        RoleShow IiiiiiiiIIIII;
        TaskProgress IiiiiiiiIIIII2 = task.getTaskProgress(this.scriptTask);
        if (IiiiiiiiIIIII2 == null) {
            this.ALLATORIxDEMO();
            return;
        }
        if (IiiiiiiiIIIII2.getType() == 0) {
            ScriptIndex IiiiiiiiIIIII3 = this.scriptTask.getScriptIndex(0, IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII3 == null) {
                this.ALLATORIxDEMO();
                return;
            }
            this.ALLATORIxDEMO(IiiiiiiiIIIII3);
            return;
        }
        if (IiiiiiiiIIIII2.getType() == 6) {
            ScriptIndex IiiiiiiiIIIII4 = this.scriptTask.getScriptIndex(1, IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII4 == null) {
                this.ALLATORIxDEMO();
                return;
            }
            this.ALLATORIxDEMO(IiiiiiiiIIIII4);
            return;
        }
        if (IiiiiiiiIIIII2.getType() == 4) {
            RoleShow IiiiiiiiIIIII5;
            BigDecimal IiiiiiiiIIIII6 = new BigDecimal(IiiiiiiiIIIII2.getDId());
            int IiiiiiiiIIIII7 = this.gameView.roleData.getGoodNum(IiiiiiiiIIIII6);
            if (IiiiiiiiIIIII7 + IiiiiiiiIIIII2.getSum() < IiiiiiiiIIIII2.getMax()) {
                this.gameView.iiiIiiiiiiIIi("\u6ca1\u6709\u8db3\u591f\u7684\u7269\u54c1");
                this.ALLATORIxDEMO();
                return;
            }
            ScriptIndex IiiiiiiiIIIII8 = this.scriptTask.getScriptIndex(2, IiiiiiiiIIIII2);
            if (IiiiiiiiIIIII8 == null) {
                this.ALLATORIxDEMO();
                return;
            }
            int IiiiiiiiIIIII9 = this.access;
            if (this.access == 1 && this.gameView.getClient().ALLATORIxDEMO(2, 12)) {
                Goodstable goodstable = IiiiiiiiIIIII5 = this.gameView.systemData.IiiIiiiiiiIiI() ? this.gameView.roleData.ALLATORIxDEMO(105L) : null;
                if (IiiiiiiiIIIII5 != null) {
                    IiiiiiiiIIIII5.ALLATORIxDEMO(1);
                    ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII5, (int)1, (GameClient)this.gameView.getClient());
                    if (IiiiiiiiIIIII5.getUsetime() <= 0) {
                        this.gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII5.getRgid());
                    }
                } else {
                    IiiiiiiiIIIII9 = 0;
                }
            }
            IiiiiiiiIIIII5 = this.gameView.roleUnit.iIiIiiiiIiIii;
            IIiiIiiiiIIiI IiiiiiiiIIIII10 = IiiiiiiiIIIII8.getMapPoint();
            List IiiiiiiiIIIII11 = this.gameView.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII5.getMapid().intValue(), IiiiiiiiIIIII5.getX(), IiiiiiiiIIIII5.getY(), 0, IiiiiiiiIIIII10.iIiIiiiiIIiii(), IiiiiiiiIIIII10.ALLATORIxDEMO(), IiiiiiiiIIIII10.iiiIiiiiiiIIi(), 0, IiiiiiiiIIIII9, this.gameView.roleData);
            if (IiiiiiiiIIIII11 == null) {
                this.gameView.iiiIiiiiiiIIi("\u4f60\u6240\u5728\u4f4d\u7f6e\u65e0\u6cd5\u8fbe\u5230\u76ee\u7684\u5730");
                this.ALLATORIxDEMO();
                return;
            }
            ScriptOpen IiiiiiiiIIIII12 = new ScriptOpen(13, (long)IiiiiiiiIIIII2.getGId(), IiiiiiiiIIIII2.getDId(), IiiiiiiiIIIII2.getMax() - IiiiiiiiIIIII2.getSum(), 0, 0);
            IiiiiiiiIIIII11.add(0, IiiiiiiiIIIII12);
            this.ALLATORIxDEMO(IiiiiiiiIIIII11);
            return;
        }
        if (IiiiiiiiIIIII2.getMap() == 0) return;
        int IiiiiiiiIIIII13 = this.access;
        if (this.access == 1 && this.gameView.getClient().ALLATORIxDEMO(2, 12)) {
            Goodstable goodstable = IiiiiiiiIIIII = this.gameView.systemData.IiiIiiiiiiIiI() ? this.gameView.roleData.ALLATORIxDEMO(105L) : null;
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.ALLATORIxDEMO(1);
                ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)1, (GameClient)this.gameView.getClient());
                if (IiiiiiiiIIIII.getUsetime() <= 0) {
                    this.gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                }
            } else {
                IiiiiiiiIIIII13 = 0;
            }
        }
        IiiiiiiiIIIII = this.gameView.roleUnit.iIiIiiiiIiIii;
        List IiiiiiiiIIIII14 = this.gameView.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII.getMapid().intValue(), IiiiiiiiIIIII.getX(), IiiiiiiiIIIII.getY(), 0, IiiiiiiiIIIII2.getMap(), IiiiiiiiIIIII2.getX(), IiiiiiiiIIIII2.getY(), 0, IiiiiiiiIIIII13, this.gameView.roleData);
        if (IiiiiiiiIIIII14 == null) {
            this.gameView.iiiIiiiiiiIIi("\u4f60\u6240\u5728\u4f4d\u7f6e\u65e0\u6cd5\u8fbe\u5230\u76ee\u7684\u5730");
            this.ALLATORIxDEMO();
            return;
        }
        ScriptOpen IiiiiiiiIIIII15 = new ScriptOpen(IiiiiiiiIIIII2.getType() == 1 ? 14 : 11, (long)IiiiiiiiIIIII2.getDId());
        IiiiiiiiIIIII14.add(0, IiiiiiiiIIIII15);
        if (IiiiiiiiIIIII2.getType() == 1 || IiiiiiiiIIIII2.getType() == 2) {
            ScriptOpen IiiiiiiiIIIII16 = new ScriptOpen(15, (long)IiiiiiiiIIIII2.getDId());
            IiiiiiiiIIIII14.add(0, IiiiiiiiIIIII16);
        }
        this.ALLATORIxDEMO(IiiiiiiiIIIII14);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO() {
        if (this.scriptList == null && this.scriptTask == null) {
            return;
        }
        if (!this.gameView.isLoadMap) {
            return;
        }
        ScriptAutomation scriptAutomation = this;
        synchronized (scriptAutomation) {
            Object IiiiiiiiIIIII;
            if (this.scriptList == null) {
                if (this.scriptTask == null) return;
                this.iiiIiiiiiiIIi();
                return;
            }
            int IiiiiiiiIIIII2 = this.scriptList.size();
            if (IiiiiiiiIIIII2 == 0) {
                this.iIiIiiiiIIiii();
                return;
            }
            if ((IiiiiiiiIIIII = this.scriptList.get(--IiiiiiiiIIIII2)) == null) {
                this.scriptList.remove(IiiiiiiiIIIII2);
                return;
            }
            if (IiiiiiiiIIIII instanceof ScriptOpen) {
                this.ALLATORIxDEMO(IiiiiiiiIIIII2, (ScriptOpen)IiiiiiiiIIIII);
            } else {
                if (!(IiiiiiiiIIIII instanceof ScriptEnd)) return;
                this.ALLATORIxDEMO(IiiiiiiiIIIII2, (ScriptEnd)IiiiiiiiIIIII);
            }
            return;
        }
    }

    public boolean ALLATORIxDEMO() {
        if (this.assist) {
            int IiiiiiiiIIIII;
            int n = IiiiiiiiIIIII = this.scriptTask != null ? this.scriptTask.getTaskSetID() : 0;
            if (((iiIiIiiiiIIII)this.gameView.getFormManagement().iiiIiiiiiiIIi(145)).ALLATORIxDEMO(IiiiiiiiIIIII)) {
                return true;
            }
        }
        this.ALLATORIxDEMO(false, 0);
        return false;
    }

    private /* synthetic */ void ALLATORIxDEMO(int size, ScriptEnd end) {
        if (end.getType() == 0) {
            iiIiIiiiiIiii IiiiiiiiIIIII = this.gameView.roleUnit;
            if (IiiiiiiiIIIII.iIiIiiiiIiIii.getMapid() != (long)end.getMap()) return;
            if (Math.abs(IiiiiiiiIIIII.iiIiIiiiiIIIi - end.getX()) >= 100) return;
            if (Math.abs(IiiiiiiiIIIII.IIiiiiiiiIIIi - end.getY()) >= 100) return;
            this.scriptList.remove(size);
            return;
        }
        if (end.getType() != 1) return;
        this.ALLATORIxDEMO();
    }

    public void ALLATORIxDEMO(ScriptIndex scriptIndex) {
        Object IiiiiiiiIIIII;
        RoleShow IiiiiiiiIIIII2 = this.gameView.roleUnit.iIiIiiiiIiIii;
        IIiiIiiiiIIiI IiiiiiiiIIIII3 = scriptIndex.getMapPoint();
        if (IiiiiiiiIIIII3.iIiIiiiiIIiii() != IiiiiiiiIIIII2.getMapid().intValue()) {
            Object IiiiiiiiIIIII4;
            int IiiiiiiiIIIII5 = this.access;
            if (this.access == 1 && this.gameView.getClient().ALLATORIxDEMO(2, 12)) {
                Goodstable goodstable = IiiiiiiiIIIII4 = this.gameView.systemData.IiiIiiiiiiIiI() ? this.gameView.roleData.ALLATORIxDEMO(105L) : null;
                if (IiiiiiiiIIIII4 != null) {
                    IiiiiiiiIIIII4.ALLATORIxDEMO(1);
                    ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII4, (int)1, (GameClient)this.gameView.getClient());
                    if (IiiiiiiiIIIII4.getUsetime() <= 0) {
                        this.gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII4.getRgid());
                    }
                } else {
                    IiiiiiiiIIIII5 = 0;
                }
            }
            if ((IiiiiiiiIIIII4 = this.gameView.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2.getMapid().intValue(), IiiiiiiiIIIII2.getX(), IiiiiiiiIIIII2.getY(), 0, IiiiiiiiIIIII3.iIiIiiiiIIiii(), IiiiiiiiIIIII3.ALLATORIxDEMO(), IiiiiiiiIIIII3.iiiIiiiiiiIIi(), 0, IiiiiiiiIIIII5, this.gameView.roleData)) == null) {
                this.gameView.iiiIiiiiiiIIi("\u4f60\u6240\u5728\u4f4d\u7f6e\u65e0\u6cd5\u8fbe\u5230\u76ee\u7684\u5730");
                this.ALLATORIxDEMO();
                return;
            }
            this.ALLATORIxDEMO((List<Object>)IiiiiiiiIIIII4);
            return;
        }
        if (scriptIndex.getType() != 0) {
            if (scriptIndex.getType() != 1) return;
            Point IiiiiiiiIIIII6 = this.gameView.mapScene.iIiiIiiiiiiII.ALLATORIxDEMO();
            List IiiiiiiiIIIII7 = this.gameView.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2.getMapid().intValue(), IiiiiiiiIIIII2.getX(), IiiiiiiiIIIII2.getY(), 0, IiiiiiiiIIIII2.getMapid().intValue(), IiiiiiiiIIIII6.x, IiiiiiiiIIIII6.y, 0, 0, this.gameView.roleData);
            if (IiiiiiiiIIIII7 == null) return;
            this.ALLATORIxDEMO(IiiiiiiiIIIII7);
            return;
        }
        IIIIIiiiIiiII IiiiiiiiIIIII8 = this.gameView.mapScene.ALLATORIxDEMO(scriptIndex.getKey(), this.gameView.roleUnit.iiIiIiiiiIIIi, this.gameView.roleUnit.IIiiiiiiiIIIi, this.scriptTask);
        if (IiiiiiiiIIIII8 == null) {
            return;
        }
        int IiiiiiiiIIIII9 = this.access;
        if (this.access == 1 && this.gameView.getClient().ALLATORIxDEMO(2, 12)) {
            Object object = IiiiiiiiIIIII = this.gameView.systemData.IiiIiiiiiiIiI() ? this.gameView.roleData.ALLATORIxDEMO(105L) : null;
            if (IiiiiiiiIIIII != null) {
                IiiiiiiiIIIII.ALLATORIxDEMO(1);
                ParamTool.ALLATORIxDEMO((Goodstable)IiiiiiiiIIIII, (int)1, (GameClient)this.gameView.getClient());
                if (IiiiiiiiIIIII.getUsetime() <= 0) {
                    this.gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII.getRgid());
                }
            } else {
                IiiiiiiiIIIII9 = 0;
            }
        }
        if ((IiiiiiiiIIIII = this.gameView.getObjectArea().ALLATORIxDEMO().ALLATORIxDEMO(IiiiiiiiIIIII2.getMapid().intValue(), IiiiiiiiIIIII2.getX(), IiiiiiiiIIIII2.getY(), 0, IiiiiiiiIIIII2.getMapid().intValue(), IiiiiiiiIIIII8.iiIiIiiiiIIIi, IiiiiiiiIIIII8.IIiiiiiiiIIIi, 0, IiiiiiiiIIIII9, this.gameView.roleData)) == null) {
            this.scriptTask.iIiIiiiiIIiii();
            return;
        }
        this.scriptTask.ALLATORIxDEMO((long)IiiiiiiiIIIII8.IiiiiiiiIIIII.getI().intValue());
        ScriptOpen IiiiiiiiIIIII10 = new ScriptOpen(16, (long)IiiiiiiiIIIII8.IiiiiiiiIIIII.getI().intValue());
        IiiiiiiiIIIII.add(0, IiiiiiiiIIIII10);
        ScriptOpen IiiiiiiiIIIII11 = new ScriptOpen(17, (long)IiiiiiiiIIIII8.IiiiiiiiIIIII.getI().intValue());
        IiiiiiiiIIIII.add(0, IiiiiiiiIIIII11);
        this.ALLATORIxDEMO((List<Object>)IiiiiiiiIIIII);
    }
}
