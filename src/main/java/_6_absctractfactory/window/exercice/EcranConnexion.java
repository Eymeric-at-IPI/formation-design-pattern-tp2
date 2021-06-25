package _6_absctractfactory.window.exercice;

import _6_absctractfactory.window.exercice.factories.*;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowButton;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowInput;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowScreen;
import _6_absctractfactory.window.exercice.web.WebButton;


public class EcranConnexion {

    enum SUPPORT_TYPE {
        TYPE_WEB,
        TYPE_MICROSOFT
    }

    private SUPPORT_TYPE support_type;
    private ComponentFactory factory;
    private IScreen screen;

    EcranConnexion(SUPPORT_TYPE _type) {
        this.support_type = _type;
        switch (_type) {
            case TYPE_WEB: this.factory = new WebFactory(); break;
            case TYPE_MICROSOFT: this.factory = new MicrosoftFactory(); break;
            default:
        }
    }

    public void dessinerEcran() {
        this.screen = factory.createScreen();
        this.screen.add(factory.createButton());
        this.screen.add(factory.createButton());
        this.screen.add(factory.createInput());
        System.out.println(screen.speak());
    }

}