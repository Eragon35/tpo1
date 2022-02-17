package app;

public class Door extends Things{
   private boolean isOpened;

   public Boolean getIsOpened(){
      return this.isOpened;
   }

   public void setIsOpened(boolean status){
      this.isOpened = status;
   }
}
