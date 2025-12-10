/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.iiIIiiiiIiiII
 */
package com.xy.richtext;

import com.xy.v.iiIIiiiiIiiII;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TextListFile {
    public List<iiIIiiiiIiiII> points;
    public int id;
    public LinkedList<String> fileList;

    public TextListFile(int n) {
        this.id = n;
        this.points = new ArrayList<iiIIiiiiIiiII>();
        this.fileList = new LinkedList();
    }
}
