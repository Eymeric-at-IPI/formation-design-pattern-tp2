package _2_factorymethod.logisics;

import java.util.List;

public class PlanDelivery {
    private List<Transport> tranports;
    private int durationHours;

    public PlanDelivery(List<Transport> tranports, int durationHours) {
        this.tranports = tranports;
        this.durationHours = durationHours;
    }

    public List<Transport> getTranports() {
        return tranports;
    }

    public int getDurationHours() {
        return durationHours;
    }
}
