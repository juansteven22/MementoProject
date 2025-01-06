package com.patterns.memento;

public class Editor {
    private String text = "";

    // Método para "escribir" en el editor
    public void write(String newText) {
        // Por simplicidad, concatenamos el nuevo texto
        text += newText;
    }
    
    // Guardar estado en un Memento
    public EditorMemento save() {
        // Retornamos un nuevo memento con el estado actual
        return new EditorMemento(text);
    }
    
    // Restaurar estado desde un Memento
    public void restore(EditorMemento memento) {
        if (memento != null) {
            this.text = memento.getTextState();
        }
    }
    
    // Getter para mostrar el texto actual
    public String getText() {
        return text;
    }
}
