/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.q.iiIIiiiiIiiII
 *  com.xy.richtext.RichLabel
 *  com.xy.scene.Scene
 *  com.xy.text.GameView
 */
package com.xy.scene;

import com.xy.q.iiIIiiiiIiiII;
import com.xy.richtext.RichLabel;
import com.xy.scene.Scene;
import com.xy.text.GameView;
import java.awt.Graphics;

public class DLDScene
implements Scene {
    private int v2;
    private RichLabel richLabel;
    private GameView gameView;
    private int v1;

    public void ALLATORIxDEMO() {
    }

    public boolean ALLATORIxDEMO(int x, int y) {
        return false;
    }

    public DLDScene(String[] vs, GameView gameView) {
        this.gameView = gameView;
        this.ALLATORIxDEMO(vs);
    }

    public void ALLATORIxDEMO(Graphics g) {
        this.gameView.mapScene.iiiIiiiiiiIIi(g, this.gameView);
    }

    public RichLabel getRichLabel() {
        return this.richLabel;
    }

    public void ALLATORIxDEMO(String[] vs) {
        int IiiiiiiiIIIII = 1;
        while (IiiiiiiiIIIII < vs.length) {
            if (IiiiiiiiIIIII == 1) {
                this.v1 = Integer.parseInt(vs[IiiiiiiiIIIII]);
            } else if (IiiiiiiiIIIII == 2) {
                this.v2 = Integer.parseInt(vs[IiiiiiiiIIIII]);
            }
            ++IiiiiiiiIIIII;
        }
        StringBuffer IiiiiiiiIIIII2 = new StringBuffer();
        IiiiiiiiIIIII2.append("#Y\u5927\u4e71\u6597#r#W\u5b58\u6d3b\u961f\u4f0d:");
        IiiiiiiiIIIII2.append(this.v2 - this.v1);
        IiiiiiiiIIIII2.append("/");
        IiiiiiiiIIIII2.append(this.v2);
        if (this.richLabel == null) {
            this.richLabel = new RichLabel(IiiiiiiiIIIII2.toString(), iiIIiiiiIiiII.iiIiiiiiiIIiI, 165);
            return;
        }
        this.richLabel.setTextSize(IiiiiiiiIIIII2.toString(), 165);
    }

    public int getSceneId() {
        return 1014;
    }
}
