package _4_observator.ui;

public class Application implements ObserverOnClick {

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    private void run() {
        LogObserver observer = new LogObserver();

        Button button = new Button();
        button.subscribe(observer);

        Anchor anchor = new Anchor();
        anchor.subscribe(observer);
        anchor.subscribe(this);
        anchor.subscribe(new ObserverOnClick() {
            @Override
            public void onClick() {
                System.out.println("test");
            }
        });

        anchor.subscribe(() -> System.out.println("hello"));

        anchor.click();
    }

    @Override
    public void onClick() {
        //TODO
    }
}
