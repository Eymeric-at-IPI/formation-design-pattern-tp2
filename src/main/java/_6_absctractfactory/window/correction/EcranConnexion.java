package _6_absctractfactory.window.correction;

public abstract class EcranConnexion {

    public void dessinerEcran() {
        Screen screen = createScreen();
        screen.add(createInput());
        screen.add(createInput());
        screen.add(createButton());
    }

    protected abstract Button createButton();

    protected abstract Input createInput();

    protected abstract Screen createScreen();
}
