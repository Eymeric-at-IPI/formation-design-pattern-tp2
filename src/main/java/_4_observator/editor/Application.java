package _4_observator.editor;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();

        LogObserver logObserver = new LogObserver();
        editor.subscribe(logObserver);

        EmailObserver emailObserver = new EmailObserver();
        editor.subscribe(emailObserver);

    }
}
