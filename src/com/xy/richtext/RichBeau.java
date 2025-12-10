/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.richtext.RichBeauUnit
 *  com.xy.richtext.RichLabel
 *  com.xy.w.IIIIIiiiIiiII
 */
package com.xy.richtext;

import com.xy.richtext.RichBeauUnit;
import com.xy.richtext.RichLabel;
import com.xy.w.IIIIIiiiIiiII;

public class RichBeau {
    private int skin;
    private RichBeauUnit[] units;
    private int lvl;

    public boolean isDraw() {
        if (this.skin < 1) return false;
        if (this.skin > 5) return false;
        return true;
    }

    public RichBeau() {
    }

    public RichBeau(String data) {
        this(data, 0, data.length());
    }

    public RichBeauUnit[] getUnits() {
        return this.units;
    }

    public void setUnits(RichBeauUnit[] units) {
        this.units = units;
    }

    /*
     * Unable to fully structure code
     */
    public RichBeau(String data, int index, int indexFlag) {
        super();
        IiiiiiiiIIIII = 0;
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < indexFlag) {
            block5: {
                block6: {
                    block4: {
                        IiiiiiiiIIIII = data.indexOf(",", index + 1);
                        if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > indexFlag) {
                            IiiiiiiiIIIII = indexFlag;
                        }
                        if (IiiiiiiiIIIII != 0) break block4;
                        this.lvl = Integer.parseInt(data.substring(index, IiiiiiiiIIIII));
                        break block5;
                    }
                    if (IiiiiiiiIIIII != true) break block6;
                    this.units = new RichBeauUnit[IiiiiiiiIIIII - index];
                    IiiiiiiiIIIII = 0;
                    if (true) ** GOTO lbl25
                }
                if (IiiiiiiiIIIII == 2) {
                    this.skin = Integer.parseInt(data.substring(index, IiiiiiiiIIIII));
                }
                break block5;
                do {
                    v0 = IiiiiiiiIIIII;
                    v1 = new RichBeauUnit(data.charAt(index + IiiiiiiiIIIII) - 48);
                    ++IiiiiiiiIIIII;
                    this.units[v0] = v1;
lbl25:
                    // 2 sources

                } while (IiiiiiiiIIIII < this.units.length);
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII + 1;
        }
        if (this.lvl < 2) return;
        this.skin = 5;
    }

    public boolean init() {
        if (!this.isDraw()) return false;
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.units.length) {
            RichBeauUnit richBeauUnit = this.units[IiiiiiiiIIIII];
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(RichLabel.PATH)).append(this.skin).append("\\").append(this.units[IiiiiiiiIIIII].getBh()).append(".png");
            ++IiiiiiiiIIIII;
            richBeauUnit.setImage(IIIIIiiiIiiII.iiiIiiiiiiIIi((String)stringBuilder.toString()));
        }
        IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.units.length) {
            if (this.units[IiiiiiiiIIIII].getWidth() == -1) {
                try {
                    Thread.sleep(10L);
                }
                catch (Exception IiiiiiiiIIIII2) {
                    IiiiiiiiIIIII2.printStackTrace();
                }
                --IiiiiiiiIIIII;
            }
            ++IiiiiiiiIIIII;
        }
        return true;
    }
}
