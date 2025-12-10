package com.xy.readbean;

import com.xy.W;
import java.util.List;

public class NpcInfoBean {
   private List<Door> doors;
   private List<Talk> talks;
   private Npctable npctable;

   public void setTalks(List<Talk> var1) {
      this.talks = var1;
   }

   public void setNpctable(Npctable var1) {
      this.npctable = var1;
   }

   public Talk a() {
      return this.talks != null && this.talks.size() != 0 ? (Talk)this.talks.get(W.c.nextInt(this.talks.size())) : null;
   }

   public Npctable getNpctable() {
      return this.npctable;
   }

   public List<Door> getDoors() {
      return this.doors;
   }

   public void setDoors(List<Door> var1) {
      this.doors = var1;
   }

   public List<Talk> getTalks() {
      return this.talks;
   }
}
