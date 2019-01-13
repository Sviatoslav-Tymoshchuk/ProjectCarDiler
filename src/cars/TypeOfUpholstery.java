package cars;

public enum TypeOfUpholstery {

    WELUR (0),
    SKIN (1000),
    PICKLEDSKIN (2000);

    private int typeOfUpholsteryPrice;

    TypeOfUpholstery(int typeOfUpholsteryPrice){
        this.typeOfUpholsteryPrice = typeOfUpholsteryPrice;
    }
}
