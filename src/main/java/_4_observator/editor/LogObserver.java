package _4_observator.editor;


public class LogObserver implements EditorObserver {

    @Override
    public void editorSaved() {
        System.out.println("L'éditeur a été sauvegardé)");
    }
}
