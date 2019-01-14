package cars;

public enum CarModel {


    SHEVROLET (250000),
    PONTIAC(200000),
    FORD(100000),
    MERCEDES(175000),
    BMW(195000),
    AUDI(185000),
    VOLKSWAGEN(125000);

    private int priceOfCarModel;

    CarModel(int priceOfCarModel){
        this.priceOfCarModel = priceOfCarModel;
    }
}
