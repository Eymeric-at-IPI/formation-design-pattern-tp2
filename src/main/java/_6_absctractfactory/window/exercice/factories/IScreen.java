package _6_absctractfactory.window.exercice.factories;

import _6_absctractfactory.window.exercice.web.WebComponent;

/**
 * Concept of button
 */
public interface IScreen {
    public void add(IComponent webComponent);

    public String speak();
}
