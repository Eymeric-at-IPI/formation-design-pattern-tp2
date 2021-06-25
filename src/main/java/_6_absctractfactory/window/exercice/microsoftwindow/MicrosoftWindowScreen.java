package _6_absctractfactory.window.exercice.microsoftwindow;

import _6_absctractfactory.window.exercice.factories.IComponent;
import _6_absctractfactory.window.exercice.factories.IScreen;

public class MicrosoftWindowScreen implements IScreen {

    @Override
    public void add(IComponent component) {

    }

    @Override
    public String speak() {
        return "Hey I a screen for Microsoft support !";
    }

}
