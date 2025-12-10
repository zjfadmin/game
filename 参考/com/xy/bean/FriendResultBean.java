package com.xy.bean;

import com.xy.entity.Friendtable;
import java.util.List;

public class FriendResultBean {
   private List<Friendtable> friendtables;

   public List<Friendtable> getFriendtables() {
      return this.friendtables;
   }

   public void setFriendtables(List<Friendtable> var1) {
      this.friendtables = var1;
   }
}
