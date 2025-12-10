/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.q.IiIIiiiiiIiiI
 *  com.xy.game.Task
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.readbean.Goodstable
 *  com.xy.readbean.TaskData
 *  com.xy.scene.CountDown
 *  com.xy.socket.Agreement
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.iIiIIiiiIiiiI
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.text;

import com.xy.a.q.IiIIiiiiiIiiI;
import com.xy.game.Task;
import com.xy.q.iiIIiiiiIiiII;
import com.xy.readbean.Goodstable;
import com.xy.readbean.TaskData;
import com.xy.scene.CountDown;
import com.xy.socket.Agreement;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.iIiIIiiiIiiiI;
import com.xy.w.IIIIIiiiIiiII;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.List;

public class GameReadBar {
    private Image readBarImg;
    private double readBarTime;
    private GameView gameView;
    public int readBarType;
    private int readBarId;
    public CountDown countDown;
    private int readBarSize = 9999;
    private Object readBarData;
    public String readBar;
    private long readBarTimeStart;
    private Image readBarBack;

    public void setCountDown() {
        if (!this.gameView.isDraw) {
            return;
        }
        List IiiiiiiiIIIII = this.gameView.roleData.getTaskSystem().getTaskList();
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.size()) {
            if (this.setCountDown((Task)IiiiiiiiIIIII.get(IiiiiiiiIIIII2))) {
                return;
            }
            ++IiiiiiiiIIIII2;
        }
        this.ALLATORIxDEMO((TaskData)null);
    }

    public void ALLATORIxDEMO() {
        long IiiiiiiiIIIII = iIiIIiiiIiiiI.ALLATORIxDEMO() - this.readBarTimeStart;
        double IiiiiiiiIIIII2 = (double)IiiiiiiiIIIII >= this.readBarTime ? 1.0 : (double)IiiiiiiiIIIII / this.readBarTime;
        if (!(IiiiiiiiIIIII2 >= 1.0)) return;
        if (this.readBarType == 1) {
            String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"clickmonsters", (String)("R" + this.readBarId));
            this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
        } else if (this.readBarType == 2) {
            String IiiiiiiiIIIII4 = Agreement.getSendTextAES((String)"clickmonsters", (String)("FZB" + this.readBarId));
            this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII4);
        } else if (this.readBarType == 3) {
            Goodstable IiiiiiiiIIIII5;
            if (this.readBarData instanceof BigDecimal && (IiiiiiiiIIIII5 = this.gameView.roleData.getGood((BigDecimal)this.readBarData)) != null && IiiiiiiiIIIII5.getType() == 118L) {
                if (this.gameView.roleData.getGoodPackSum(-1L, new BigDecimal(-1), 1) == 0) {
                    this.gameView.iIiIiiiiIIiii("\u4f60\u7684\u80cc\u5305\u5df2\u6ee1");
                    this.setReadBar(0, -1, null, 0.0, 0L, null);
                    this.readBarBack = null;
                    this.readBarImg = null;
                    return;
                }
                int IiiiiiiiIIIII6 = Math.max(1, IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII5.getValue(), (String)"\u9700\u8981\u6570\u91cf=", (String)"|"));
                if (IiiiiiiiIIIII6 > IiiiiiiiIIIII5.getUsetime()) {
                    this.gameView.iIiIiiiiIIiii("\u4f60\u9700\u8981\u51d1\u591f" + IiiiiiiiIIIII6 + "\u4e2a\u76f8\u540c\u7269\u54c1\u624d\u80fd\u5f00\u542f");
                    this.setReadBar(0, -1, null, 0.0, 0L, null);
                    this.readBarBack = null;
                    this.readBarImg = null;
                    return;
                }
                IiiiiiiiIIIII5.ALLATORIxDEMO(IiiiiiiiIIIII6);
                if (IiiiiiiiIIIII5.getUsetime() <= 0) {
                    this.gameView.roleData.iIiIiiiiIIiii(IiiiiiiiIIIII5.getRgid());
                }
                String IiiiiiiiIIIII7 = Agreement.getSendTextAES((String)"user", (String)IiiiiiiiIIIII5.getRgid().toString());
                this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII7);
                --this.readBarId;
                if (this.readBarId > 0 && IiiiiiiiIIIII5.getUsetime() > 0) {
                    this.setReadBar(this.readBarId, 3, "(" + this.readBarId + ")\u5f00\u542f" + IiiiiiiiIIIII5.getGoodsname(), Math.max(300.0, this.readBarTime), iIiIIiiiIiiiI.ALLATORIxDEMO(), IiiiiiiiIIIII5.getRgid());
                    return;
                }
            }
        } else if (this.readBarType == 5) {
            String IiiiiiiiIIIII8 = (String)this.readBarData;
            String IiiiiiiiIIIII9 = Agreement.getSendTextAES((String)"taskN", (String)IiiiiiiiIIIII8);
            this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII9);
        }
        this.setReadBar(0, -1, null, 0.0, 0L, null);
        this.readBarBack = null;
        this.readBarImg = null;
    }

    public GameReadBar(GameView gameView) {
        this.gameView = gameView;
    }

    public void ALLATORIxDEMO(TaskData taskData) {
        if (this.countDown == null) {
            return;
        }
        if (taskData != null && taskData.getTaskID() != this.countDown.getId()) {
            return;
        }
        this.countDown = null;
    }

    public void setReadBar(int readBarId, int readBarType, String readBar, double readBarTime, long readBarTimeStart, Object readBarData) {
        boolean IiiiiiiiIIIII = this.readBarType == 2 || readBarType == 2;
        this.readBarId = readBarId;
        this.readBarType = readBarType;
        this.readBar = readBar;
        this.readBarTime = readBarTime;
        this.readBarTimeStart = readBarTimeStart;
        this.readBarData = readBarData;
        this.readBarSize = 9999;
        if (!IiiiiiiiIIIII) return;
        IiIIiiiiiIiiI IiiiiiiiIIIII2 = (IiIIiiiiiIiiI)this.gameView.getFormManagement().iIiIiiiiIIiii(133);
        if (IiiiiiiiIIIII2 != null) {
            IiiiiiiiIIIII2.ALLATORIxDEMO().iiiIiiiiiiIIi(this.readBarType == 2);
        }
        if (this.readBarType != 0) return;
        String IiiiiiiiIIIII3 = Agreement.getSendTextAES((String)"clickmonsters", (String)("FZC" + readBarId));
        this.gameView.getClient().ALLATORIxDEMO(IiiiiiiiIIIII3);
    }

    public boolean setCountDown(Task task) {
        if (task == null) {
            return false;
        }
        TaskData IiiiiiiiIIIII = task.getTaskData();
        if (IiiiiiiiIIIII == null) {
            return false;
        }
        if (IiiiiiiiIIIII.getTime() == 0) {
            return false;
        }
        String IiiiiiiiIIIII2 = IiiiiiiiIIIII.getUnknowType("\u5012\u8ba1\u65f6");
        if (IiiiiiiiIIIII2 == null) {
            return false;
        }
        if (this.gameView.mapScene.ALLATORIxDEMO() != (long)Integer.parseInt(IiiiiiiiIIIII2)) {
            return false;
        }
        if (this.countDown != null && this.countDown.getId() == IiiiiiiiIIIII.getTaskID()) {
            return true;
        }
        this.countDown = new CountDown(IiiiiiiiIIIII.getTaskID(), IiiiiiiiIIIII.getTaskName(), task.getTime() + (long)(IiiiiiiiIIIII.getTime() * 60 * 1000));
        return true;
    }

    public void ALLATORIxDEMO(Graphics g) {
        double IiiiiiiiIIIII;
        long IiiiiiiiIIIII2 = iIiIIiiiIiiiI.ALLATORIxDEMO() - this.readBarTimeStart;
        double d = IiiiiiiiIIIII = (double)IiiiiiiiIIIII2 >= this.readBarTime ? 1.0 : (double)IiiiiiiiIIIII2 / this.readBarTime;
        if (this.readBarBack == null) {
            this.readBarBack = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/72");
        }
        if (this.readBarImg == null) {
            this.readBarImg = IIIIIiiiIiiII.iiiIiiiiiiIIi((String)"sc/c/73");
        }
        int IiiiiiiiIIIII3 = (this.gameView.screenData.Screen_x - 98) / 2;
        int IiiiiiiiIIIII4 = (int)((double)this.gameView.screenData.Screen_y * 0.75);
        g.drawImage(this.readBarBack, IiiiiiiiIIIII3, IiiiiiiiIIIII4, null);
        g.drawImage(this.readBarImg, IiiiiiiiIIIII3 + 3, IiiiiiiiIIIII4 + 3, (int)(92.0 * IiiiiiiiIIIII), 3, null);
        g.setColor(Color.white);
        g.setFont(iiIIiiiiIiiII.iiIiiiiiiIIiI);
        if (this.readBarSize == 9999) {
            this.readBarSize = (98 - g.getFontMetrics().stringWidth(this.readBar)) / 2;
        }
        g.drawString(this.readBar, IiiiiiiiIIIII3 + this.readBarSize, IiiiiiiiIIIII4 - 4);
    }
}
