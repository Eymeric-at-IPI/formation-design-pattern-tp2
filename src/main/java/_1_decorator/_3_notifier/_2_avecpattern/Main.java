package _1_decorator._3_notifier._2_avecpattern;

import _1_decorator._3_notifier.Application;
import _1_decorator._3_notifier.Notifier;

public class Main {

    public static void main(String[] args) {
        Application application = new Application();

        SlackDecoratorNotifier notifier = new SlackDecoratorNotifier(new FacebookBaseDecoratorNotifier(new NoneNotifier()));

        if (true) {
            notifier = new SlackDecoratorNotifier(notifier);
        }

        application.setNotifier(notifier);

        application.doSomething();
    }
}
