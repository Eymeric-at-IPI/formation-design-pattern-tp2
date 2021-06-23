package _1_decorator._3_notifier._2_avecpattern;

import _1_decorator._3_notifier.Notifier;

public class FacebookBaseDecoratorNotifier extends BaseDecoratorNotifier {

    public FacebookBaseDecoratorNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifier(String message) {
        notifier.notifier(message);
        System.out.println("envoie d'un message facebook " + message);
    }
}
