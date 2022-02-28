package app.Model;

public class Door {
   public Door(Coordinates coordinates) {
      this.coordinates = coordinates;
   }

   private Coordinates coordinates;
   private boolean isOpened;

   public Boolean getIsOpened(){
      return this.isOpened;
   }

   public void setIsOpened(Boolean status){
      this.isOpened = status;
   }

   public void setCoordinates(Coordinates coordinates) {
      this.coordinates = coordinates;
   }

   public Coordinates getCoordinates() {
      return coordinates;
   }
}
