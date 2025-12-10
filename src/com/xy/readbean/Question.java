/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class Question {
    private transient String[] values;
    private String value;
    private String key;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public String[] getValues() {
        if (this.values != null) return this.values;
        this.values = this.value.split("\\|");
        this.value = null;
        return this.values;
    }

    public int getId() {
        return this.id;
    }

    public int getIndex(String text) {
        this.getValues();
        int IiiiiiiiIIIII = 0;
        while (IiiiiiiiIIIII < this.values.length) {
            if (this.values[IiiiiiiiIIIII].equals(text)) {
                return IiiiiiiiIIIII + 1;
            }
            ++IiiiiiiiIIIII;
        }
        return 0;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public String getKey() {
        return this.key;
    }
}
