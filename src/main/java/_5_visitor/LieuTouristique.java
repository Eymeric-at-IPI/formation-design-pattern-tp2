package _5_visitor;

public class LieuTouristique implements PointDInteret {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForLieuTouristique(this);
    }
}
