package com.patterns.memento;

import java.util.Stack;

public class History {
    private Stack<EditorMemento> historyStack = new Stack<>();

    // Guardamos un memento (push)
    public void push(EditorMemento memento) {
        historyStack.push(memento);
    }
    
    // Recuperamos el último memento almacenado (pop)
    public EditorMemento pop() {
        if (!historyStack.isEmpty()) {
            return historyStack.pop();
        }
        return null;
    }
}
