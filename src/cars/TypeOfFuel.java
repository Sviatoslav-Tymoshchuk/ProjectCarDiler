package cars;

public enum TypeOfFuel {

    GASOLINE (0),
    DIESEL (10000),
    HIBRYDE (15000);

    private int typeOfFuelPrice;

    TypeOfFuel(int typeOfFuelPrice){
        this.typeOfFuelPrice = typeOfFuelPrice;
    }

    public int getTypeOfFuelPrice() {
        return typeOfFuelPrice;
    }
}
