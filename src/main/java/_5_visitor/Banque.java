package _5_visitor;

public class Banque implements PointDInteret {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForBanque(this);
    }
}
