package com.xy.richtext;

import com.xy.dJ;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TextListFile {
   public List<dJ> points;
   public LinkedList<String> fileList;
   public int id;

   public TextListFile(int var1) {
      this.id = var1;
      this.points = new ArrayList();
      this.fileList = new LinkedList();
   }
}
