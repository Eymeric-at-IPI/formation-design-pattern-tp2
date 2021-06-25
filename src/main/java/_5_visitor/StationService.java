package _5_visitor;

public class StationService implements PointDInteret {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForStationService(this);
    }
}
