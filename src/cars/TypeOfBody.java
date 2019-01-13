package cars;

public enum TypeOfBody {

    SEDAN (0),
    PICKUP (2000),
    HATCHBACK (1000),
    KOMBI (1000);

    private int typeOfBodyPrice;

    TypeOfBody(int typeOfBodyPrice){
        this.typeOfBodyPrice = typeOfBodyPrice;
    }

    public int getTypeOfBodyPrice() {
        return typeOfBodyPrice;
    }
}
