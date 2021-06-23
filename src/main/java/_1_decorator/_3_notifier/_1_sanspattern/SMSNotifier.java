package _1_decorator._3_notifier._1_sanspattern;

import _1_decorator._3_notifier.Notifier;

public class SMSNotifier implements Notifier {
    @Override
    public void notifier(String message) {
        System.out.println("envoie d'un sms " + message);
    }
}
