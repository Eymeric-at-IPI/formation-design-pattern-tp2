package _6_absctractfactory.window.exercice.factories;

public interface ComponentFactory {

    public IScreen createScreen();

    public IButton createButton();

    public IInput createInput();
}
