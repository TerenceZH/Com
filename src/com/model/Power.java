package com.model;

public enum Power {
	  STOCKMAN("������Ա",1),
	  SALESMAN("������Ա",2),
	  ACCOUNT("������Ա",3),
	  MANAGER("�ܾ���",4),
	  ADMINSTRATOR("ϵͳ����Ա",0);
	  
      private String name;
      private int index;

      private Power(String name, int index) {
          this.name = name;
          this.index = index;
      }

      public static String getName(int index) {
          for (Power c : Power.values()) {
              if (c.getIndex() == index) {
                  return c.getName();
              }
          }
          return null;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getIndex() {
          return index;
      }

      public void setIndex(int index) {
          this.index = index;
      }
      
    

}
