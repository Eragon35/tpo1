package app.Model;

import lombok.SneakyThrows;

public class Humanoids extends Entity {
    public boolean isHypnotized;
    public boolean isCaptured;
    private Humanoids captured;

    public Humanoids(String name, Coordinates coordinates, boolean isCaptured, boolean isHypnotized) {
        this.name = name;
        this.isHypnotized = isHypnotized;
        this.isCaptured = isCaptured;
        this.coordinates = coordinates;
    }

    @SneakyThrows
    public void capture(Humanoids human) {
        if (human.isCaptured) throw new Exception("Error capture");
        else human.isCaptured = true;
        this.captured = human;
    }

    @SneakyThrows
    public boolean openTheDoor(Door door, Humanoids humanoids) {return !(door.getCoordinates().distance(humanoids.getCoordinates()) > 5);}


    @SneakyThrows
    public void move(Coordinates coordinates) {
        if (name.equals("Trillion") && (captured == null)) throw new Exception("Неправильный порядок истории");
        if (captured.getIsHypnotized()) throw new Exception("Артур как труп, его никуда не утащить");
        if (!name.equals("Trillion") || !captured.getName().equals("Artur")) throw new Exception(name + " взяла какого-то там " + captured.getName() + "а, а должна Триллиан Артура");
        this.coordinates = coordinates;
        captured.setCoordinates(coordinates);
    }
    public boolean getIsCaptured(){return isCaptured;}
    public boolean getIsHypnotized(){return isHypnotized;}
    public void setIsHypnotized(boolean hypnotized){isHypnotized = hypnotized;}
    public void setCoordinates(Coordinates coordinates){this.coordinates = coordinates;}


    public Coordinates getCoordinates(){return coordinates;}

    public String getName() { return name;}
}