package _1_decorator._3_notifier._2_avecpattern;

import _1_decorator._3_notifier.Notifier;

public class Facebook2NotifierDecorator implements Notifier {

    private Notifier interieur;

    public Facebook2NotifierDecorator(Notifier interieur) {
        this.interieur = interieur;
    }

    @Override
    public void notifier(String message) {
        interieur.notifier(message);
        System.out.println("envoie d'un message facebook " + message);
    }
}
