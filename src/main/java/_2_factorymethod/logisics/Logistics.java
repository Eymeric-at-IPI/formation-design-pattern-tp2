package _2_factorymethod.logisics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public abstract class Logistics {

    public PlanDelivery planDelivery(int nbItems, int distance) {
        Transport transport = createTransport();
        int nbTansport = BigDecimal.valueOf(nbItems).divide(BigDecimal.valueOf(transport.getCapacite()), 0, RoundingMode.UP).toBigInteger().intValue();
        List<Transport> transports = new ArrayList<>();
        transports.add(transport);

        int hours = BigDecimal.valueOf(distance).divide(BigDecimal.valueOf(transport.getVitesse()), 0, RoundingMode.UP).toBigInteger().intValue();

        while (transports.size() < nbTansport) {
            transports.add(createTransport());
        }
        return new PlanDelivery(transports, hours);
    }

    public abstract Transport createTransport();

}
