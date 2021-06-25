package _2_factorymethod.logisics;

public class AirLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Avion();
    }
}
