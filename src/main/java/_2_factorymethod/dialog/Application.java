package _2_factorymethod.dialog;

public class Application {
    public static void main(String[] args) {
        // variante window
        WindowDialog windowDialog = new WindowDialog();
        windowDialog.render();

        // variante web
        WebDialog webDialog = new WebDialog();
        webDialog.render();
    }
}
