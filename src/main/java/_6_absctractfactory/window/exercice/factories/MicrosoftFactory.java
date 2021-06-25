package _6_absctractfactory.window.exercice.factories;

import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowButton;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowInput;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowScreen;

public class MicrosoftFactory implements ComponentFactory {

    @Override
    public IScreen createScreen() {
        return new MicrosoftWindowScreen();
    }

    @Override
    public IButton createButton() {
        return new MicrosoftWindowButton();
    }

    @Override
    public IInput createInput() {
        return new MicrosoftWindowInput();
    }
}
