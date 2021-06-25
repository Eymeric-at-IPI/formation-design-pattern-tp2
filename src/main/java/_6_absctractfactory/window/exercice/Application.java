package _6_absctractfactory.window.exercice;

public class Application {
    public static void main(String[] args) {
        EcranConnexion ecranConnexion = new EcranConnexion(EcranConnexion.SUPPORT_TYPE.TYPE_MICROSOFT);
        ecranConnexion.dessinerEcran();
    }
}