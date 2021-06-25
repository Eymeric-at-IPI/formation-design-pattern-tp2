package _6_absctractfactory.window.exercice.web;


import _6_absctractfactory.window.exercice.factories.IComponent;
import _6_absctractfactory.window.exercice.factories.IScreen;

public class WebScreen implements IScreen {

    @Override
    public void add(IComponent component) {

    }

    @Override
    public String speak() {
        return "Hey I a screen for Web support !";
    }
}
