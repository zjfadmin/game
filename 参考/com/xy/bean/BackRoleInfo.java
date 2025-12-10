package com.xy.bean;

import com.xy.entity.RoleTable;
import java.util.List;

public class BackRoleInfo {
   private int pageNum;
   private int pages;
   private List<RoleTable> list;

   public int getPageNum() {
      return this.pageNum;
   }

   public int getPages() {
      return this.pages;
   }

   public void setPages(int var1) {
      this.pages = var1;
   }

   public void setList(List<RoleTable> var1) {
      this.list = var1;
   }

   public void setPageNum(int var1) {
      this.pageNum = var1;
   }

   public List<RoleTable> getList() {
      return this.list;
   }
}
