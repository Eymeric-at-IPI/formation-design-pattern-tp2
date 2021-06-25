package _6_absctractfactory.window.exercice;

import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowButton;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowInput;
import _6_absctractfactory.window.exercice.microsoftwindow.MicrosoftWindowScreen;

public class EcranConnexion {

    public void dessinerEcran() {
        MicrosoftWindowScreen microsoftWindowScreen = new MicrosoftWindowScreen();
        microsoftWindowScreen.add(new MicrosoftWindowInput());
        microsoftWindowScreen.add(new MicrosoftWindowInput());
        microsoftWindowScreen.add(new MicrosoftWindowButton());
    }
}
