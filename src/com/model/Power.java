package com.model;

public enum Power {
	  STOCKMAN("库存管理员",1),
	  SALESMAN("进销人员",2),
	  ACCOUNT("财务人员",3),
	  MANAGER("总经理",4),
	  ADMINSTRATOR("系统管理员",0);
	  
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
