package _1_decorator._3_notifier._2_avecpattern;

import _1_decorator._3_notifier.Notifier;

public class BaseDecoratorNotifier implements Notifier {

    protected Notifier notifier;

    public BaseDecoratorNotifier(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void notifier(String message) {
        notifier.notifier(message);
    }
}
