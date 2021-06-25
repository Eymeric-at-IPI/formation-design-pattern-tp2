package _5_visitor;

public interface Visitor {
    void doForBanque(Banque banque);

    void doForStationService(StationService stationService);

    void doForLieuTouristique(LieuTouristique lieuTouristique);
}
