package com.xy.bean;

import java.util.List;

public class NPCDialog {
   private String type;
   private List<String> functions;
   private String msg;

   public List<String> getFunctions() {
      return this.functions;
   }

   public String getMsg() {
      return this.msg;
   }

   public String getType() {
      return this.type;
   }

   public void setType(String var1) {
      this.type = var1;
   }

   public void setFunctions(List<String> var1) {
      this.functions = var1;
   }

   public void setMsg(String var1) {
      this.msg = var1;
   }
}
