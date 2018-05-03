package com.mah.bo;
public class Title {
      private String titleValue;
  
      public Title(){
      }
      
      public Title(String titleValue){
            this.titleValue = titleValue;
      }
      
      public String getTitleValue() {
            return titleValue;
      }
  
      public void setTitleValue(String titleValue) {
            this.titleValue = titleValue;
      }

	@Override
	public String toString() {
		return "Title [titleValue=" + titleValue + "]";
	}
      
      
}