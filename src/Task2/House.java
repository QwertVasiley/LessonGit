package Task2;

public abstract class House {
    private int amountOfFloor;
    private int amountOfPeople;
    private boolean isHeating;


    public int getAmountOfFloor() {
        return amountOfFloor;
    }


    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public boolean getIsHeating() {
        return isHeating;
    }

    public void heatingStatus(boolean heating) {
        isHeating = heating;
    }
}



