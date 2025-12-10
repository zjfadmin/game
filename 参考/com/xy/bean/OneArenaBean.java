package com.xy.bean;

import java.util.List;

public class OneArenaBean {
   private int place;
   private List<OneArenaRole> arenaList;
   private List<OneArenaNotes> notesList;
   private OneArenaNotes notes;

   public List<OneArenaNotes> getNotesList() {
      return this.notesList;
   }

   public void setArenaList(List<OneArenaRole> var1) {
      this.arenaList = var1;
   }

   public List<OneArenaRole> getArenaList() {
      return this.arenaList;
   }

   public OneArenaNotes getNotes() {
      return this.notes;
   }

   public int getPlace() {
      return this.place;
   }

   public void setPlace(int var1) {
      this.place = var1;
   }

   public void setNotesList(List<OneArenaNotes> var1) {
      this.notesList = var1;
   }

   public void setNotes(OneArenaNotes var1) {
      this.notes = var1;
   }
}
