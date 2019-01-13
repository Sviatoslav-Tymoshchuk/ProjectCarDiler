package cars;

public enum Color {

    RED (0),
    GREN (0),
    BLUE (0),
    SILVER (1000),
    GOLD (2500),
    CHAMEEON(5000);

    private int colorPrice;

    Color(int colorPrice){
        this.colorPrice = colorPrice;
    }


    public int getColorPrice() {
        return colorPrice;
    }
}
