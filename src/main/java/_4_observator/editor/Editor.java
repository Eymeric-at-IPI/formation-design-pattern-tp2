package _4_observator.editor;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private List<EditorObserver> editorObservers = new ArrayList<>();

    public void save() {
        for (EditorObserver editorObserver : editorObservers) {
            editorObserver.editorSaved();
        }
    }

    public void subscribe(EditorObserver editorObserver) {
        editorObservers.add(editorObserver);
    }
}
