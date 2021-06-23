package _1_decorator._3_notifier._2_avecpattern;

import _1_decorator._3_notifier.Notifier;

import java.util.Arrays;

public class SampleUsage {

    public static void main(String... args) {
        Notifier notifier = new NoneNotifier();

        boolean facebookEnabled = Arrays.asList(args).contains("facebook");
        if (facebookEnabled) {
            notifier = new FacebookBaseDecoratorNotifier(notifier);
        }

        boolean slackEnabled = Arrays.asList(args).contains("slack");
        if (slackEnabled) {
            notifier = new SlackDecoratorNotifier(notifier);
        }
        notifier.notifier("Hello world!");
    }
}
