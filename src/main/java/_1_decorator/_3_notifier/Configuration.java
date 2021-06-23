package _1_decorator._3_notifier;

import _1_decorator._3_notifier._1_sanspattern.FacebookNotifier;

public class Configuration {

    public static void main(String[] args) {

        Application application = new Application();
        FacebookNotifier facebookNotifier = new FacebookNotifier();
        application.setNotifier(facebookNotifier);

        application.doSomething();

    }

}
