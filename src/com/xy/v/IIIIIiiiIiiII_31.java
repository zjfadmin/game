/*
 * Decompiled with CFR 0.152.
 */
package com.xy.v;

import java.util.LinkedList;

public class IIIIIiiiIiiII<T> {
    private int IiiiiiiiIIIII;
    private LinkedList<T> ALLATORIxDEMO = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public T ALLATORIxDEMO() {
        IIIIIiiiIiiII iIIIIiiiIiiII = this;
        synchronized (iIIIIiiiIiiII) {
            if (this.ALLATORIxDEMO.size() != 0) return this.ALLATORIxDEMO.removeFirst();
            return null;
        }
    }

    public IIIIIiiiIiiII() {
        this(50);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ALLATORIxDEMO(T t) {
        IIIIIiiiIiiII iIIIIiiiIiiII = this;
        synchronized (iIIIIiiiIiiII) {
            if (this.ALLATORIxDEMO.size() >= this.IiiiiiiiIIIII) {
                return;
            }
            this.ALLATORIxDEMO.addLast(t);
            return;
        }
    }

    public IIIIIiiiIiiII(int max) {
        this.IiiiiiiiIIIII = max;
        this.ALLATORIxDEMO = new LinkedList();
    }
}
