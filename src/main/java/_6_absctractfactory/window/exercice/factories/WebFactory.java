package _6_absctractfactory.window.exercice.factories;

import _6_absctractfactory.window.exercice.web.WebButton;
import _6_absctractfactory.window.exercice.web.WebInput;
import _6_absctractfactory.window.exercice.web.WebScreen;

public class WebFactory implements ComponentFactory {

    @Override
    public IScreen createScreen() {
        return new WebScreen();
    }

    @Override
    public IButton createButton() {
        return new WebButton();
    }

    @Override
    public IInput createInput() {
        return new WebInput();
    }
}
