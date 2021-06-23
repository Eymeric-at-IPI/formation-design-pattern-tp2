package _1_decorator._3_notifier;

import _1_decorator._3_notifier._2_avecpattern.NoneNotifier;

public class Application {
    private Notifier notifier = new NoneNotifier();

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void doSomething() {
        // ....
        this.notifier.notifier("Hello");
        // ....
    }
}
