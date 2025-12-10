/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.OneArenaNotes
 *  com.xy.bean.OneArenaRole
 */
package com.xy.bean;

import com.xy.bean.OneArenaNotes;
import com.xy.bean.OneArenaRole;
import java.util.List;

public class OneArenaBean {
    private int place;
    private List<OneArenaRole> arenaList;
    private OneArenaNotes notes;
    private List<OneArenaNotes> notesList;

    public void setArenaList(List<OneArenaRole> arenaList) {
        this.arenaList = arenaList;
    }

    public List<OneArenaNotes> getNotesList() {
        return this.notesList;
    }

    public void setNotes(OneArenaNotes notes) {
        this.notes = notes;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setNotesList(List<OneArenaNotes> notesList) {
        this.notesList = notesList;
    }

    public List<OneArenaRole> getArenaList() {
        return this.arenaList;
    }

    public int getPlace() {
        return this.place;
    }

    public OneArenaNotes getNotes() {
        return this.notes;
    }
}
