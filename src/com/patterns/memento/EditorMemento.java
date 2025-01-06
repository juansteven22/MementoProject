package com.patterns.memento;

public class EditorMemento {
    private final String textState;

    // Constructor sólo accesible dentro del mismo paquete
    // (Podría ser package-private o public, según diseño)
    public EditorMemento(String text) {
        this.textState = text;
    }
    
    // Método para obtener el estado (sólo lectura)
    public String getTextState() {
        return textState;
    }
}
