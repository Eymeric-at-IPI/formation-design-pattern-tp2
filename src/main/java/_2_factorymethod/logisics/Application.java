package _2_factorymethod.logisics;

public class Application {

    public static void main(String[] args) {

        Logistics logistics = new AirLogistics();

        PlanDelivery planDelivery = logistics.planDelivery(1001, 600);
        System.out.println("Nombre de transports nécessaire " + planDelivery.getTranports().size());
        System.out.println("Durée (h)" + planDelivery.getDurationHours());
    }

}
