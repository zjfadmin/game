/*
 * Decompiled with CFR 0.152.
 */
package com.xy.q;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIiIiiiiIiiIi {
    private Font iIiiIiiiiiiII;
    private List<String> IIiiIiiiIIiIi;
    private String iIiIiiiiIiIii;
    private Object IiIIIiiiiIiiI;
    private Map<String, IIiIiiiiIiiIi> iiIiiiiiiiIii;
    private Icon IiiiiiiiIIIII;
    private Color ALLATORIxDEMO;

    public void ALLATORIxDEMO(IIiIiiiiIiiIi node) {
        IIiIiiiiIiiIi IiiiiiiiIIIII = this.ALLATORIxDEMO(node.iIiIiiiiIiIii);
        if (IiiiiiiiIIIII != null) {
            IiiiiiiiIIIII.ALLATORIxDEMO(node);
            return;
        }
        if (this.iiIiiiiiiiIii == null) {
            this.iiIiiiiiiiIii = new HashMap<String, IIiIiiiiIiiIi>();
        }
        if (this.IIiiIiiiIIiIi == null) {
            this.IIiiIiiiIIiIi = new LinkedList<String>();
        }
        this.iiIiiiiiiiIii.put(node.iIiIiiiiIiIii, node);
        this.IIiiIiiiIIiIi.add(node.iIiIiiiiIiIii);
    }

    public IIiIiiiiIiiIi(String name, Object data) {
        this.iIiIiiiiIiIii = name;
        this.IiIIIiiiiIiiI = data;
    }

    public void ALLATORIxDEMO(Icon icon) {
        this.IiiiiiiiIIIII = icon;
    }

    public void ALLATORIxDEMO(List<String> list) {
        this.IIiiIiiiIIiIi = list;
    }

    public String ALLATORIxDEMO() {
        return this.iIiIiiiiIiIii;
    }

    public Color ALLATORIxDEMO() {
        return this.ALLATORIxDEMO;
    }

    public void ALLATORIxDEMO(Font font) {
        this.iIiiIiiiiiiII = font;
    }

    public Icon ALLATORIxDEMO() {
        return this.IiiiiiiiIIIII;
    }

    public void ALLATORIxDEMO(Map<String, IIiIiiiiIiiIi> map) {
        this.iiIiiiiiiiIii = map;
    }

    public void ALLATORIxDEMO(Object data) {
        this.IiIIIiiiiIiiI = data;
    }

    public Object ALLATORIxDEMO() {
        return this.IiIIIiiiiIiiI;
    }

    public void ALLATORIxDEMO(String name) {
        this.iIiIiiiiIiIii = name;
    }

    public IIiIiiiiIiiIi ALLATORIxDEMO(String name) {
        if (this.iiIiiiiiiiIii == null) return null;
        return this.iiIiiiiiiiIii.get(name);
    }

    public void ALLATORIxDEMO(Color color) {
        this.ALLATORIxDEMO = color;
    }

    public List<String> ALLATORIxDEMO() {
        return this.IIiiIiiiIIiIi;
    }

    public Map<String, IIiIiiiiIiiIi> ALLATORIxDEMO() {
        return this.iiIiiiiiiiIii;
    }

    public Font ALLATORIxDEMO() {
        return this.iIiiIiiiiiiII;
    }
}
