package _2_factorymethod.logisics;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Camion();
    }
}
