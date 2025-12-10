/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.a.iIIiiiiiIIIIi
 *  com.xy.d.iiiiiiiiiiIiI
 *  com.xy.game.Task
 *  com.xy.game.TaskProgress
 *  com.xy.readbean.Robots
 *  com.xy.text.GameView
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiiiiiiIIII
 *  com.xy.v.iIiIIiiiIiiiI
 */
package com.xy.d;

import com.xy.a.iIIiiiiiIIIIi;
import com.xy.d.iiiiiiiiiiIiI;
import com.xy.game.Task;
import com.xy.game.TaskProgress;
import com.xy.readbean.Robots;
import com.xy.text.GameView;
import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiiiiiiIIII;
import com.xy.v.iIiIIiiiIiiiI;
import java.awt.Graphics;

public class IIIIIiiiIiIii
extends iiiiiiiiiiIiI {
    public Task IiiiiiiiIIIII;
    public TaskProgress ALLATORIxDEMO;

    /*
     * Enabled unnecessary exception pruning
     */
    public void ALLATORIxDEMO(Task task, TaskProgress progress, IiiiiiiiiIIII objectArea) {
        try {
            this.IiiiiiiiIIIII = task;
            this.ALLATORIxDEMO = progress;
            this.iiIiIiiiiIIIi = progress.getX();
            this.IIiiiiiiiIIIi = progress.getY();
            this.IiiiiiiiIIIII = (Task)false;
            Robots IiiiiiiiIIIII = objectArea.ALLATORIxDEMO(String.valueOf(progress.getDId()));
            this.IIIiiiiiIIiII = progress.getDName();
            this.iiiIiiiiiiiIi = IiiiiiiiIIIII != null ? (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII.getRobottitle()) ? IiiiiiiiIIIII.getRobottitle() : null) : null;
            this.ALLATORIxDEMO(IiiiiiiiIIIII != null ? IiiiiiiiIIIII.getRobotskin() : "100", null);
            return;
        }
        catch (Exception IiiiiiiiIIIII) {
            IiiiiiiiIIIII.printStackTrace();
            return;
        }
    }

    public void ALLATORIxDEMO(GameView gameView) {
        Robots IiiiiiiiIIIII;
        String IiiiiiiiIIIII2;
        if (this.ALLATORIxDEMO.getType() != 1) {
            if (this.ALLATORIxDEMO.getType() != 0) return;
        }
        String string = IiiiiiiiIIIII2 = (IiiiiiiiIIIII = gameView.getObjectArea().ALLATORIxDEMO(String.valueOf(this.ALLATORIxDEMO.getDId()))) != null ? IIiiIiiiiIIiI.iIiIiiiiIIiii((String)IiiiiiiiIIIII.getOther(), (String)"\u8bfb\u6761=", (String)"|") : null;
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi(IiiiiiiiIIIII2)) {
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII2.indexOf("#");
            long IiiiiiiiIIIII4 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII2, (int)0, (int)IiiiiiiiIIIII3) * 1000L;
            gameView.getGameReadBar().setReadBar(this.IiiiiiiiIIIII.getTaskId(), 5, IiiiiiiiIIIII2.substring(IiiiiiiiIIIII3 + 1), (double)IiiiiiiiIIIII4, iIiIIiiiIiiiI.ALLATORIxDEMO(), (Object)("M" + this.IiiiiiiiIIIII.getTaskId() + "|" + this.ALLATORIxDEMO.getDId()));
            return;
        }
        iIIiiiiiIIIIi IiiiiiiiIIIII5 = (iIIiiiiiIIIIi)gameView.getFormManagement().iiiIiiiiiiIIi(27);
        IiiiiiiiIIIII5.ALLATORIxDEMO(this);
    }

    public int ALLATORIxDEMO(iiiiiiiiiiIiI unit) {
        if (unit.IIIIiiiiiiiII <= this.IIIIiiiiiiiII) return -1;
        return 1;
    }

    public void iiiIiiiiiiIIi(Graphics g) {
    }

    /*
     * WARNING - void declaration
     */
    public IIIIIiiiIiIii(Task task, TaskProgress taskProgress, IiiiiiiiiIIII iiiiiiiiiIIII) {
        void objectArea;
        void progress;
        void task2;
        this.iIIiIiiiiiiIi = 6;
        this.ALLATORIxDEMO((Task)task2, (TaskProgress)progress, (IiiiiiiiiIIII)objectArea);
    }
}
