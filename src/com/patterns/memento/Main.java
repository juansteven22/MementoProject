package com.patterns.memento;

public class Main {

    public static void main(String[] args) {
        // Creamos un Editor (Originator)
        Editor editor = new Editor();
        
        // Creamos un History (Caretaker), encargado de gestionar los Mementos
        History history = new History();
        
        // Primera operación: escribimos algo
        editor.write("Hola, este es el texto inicial.");
        // Guardamos el estado actual en el historial
        history.push(editor.save());
        
        // Imprimimos el estado
        System.out.println("Texto actual: " + editor.getText());
        
        // Segunda operación: seguimos escribiendo
        editor.write(" Y agregamos esta parte.");
        // Guardamos
        history.push(editor.save());
        
        // Imprimimos el estado
        System.out.println("Texto actual: " + editor.getText());
        
        // Tercera operación: nuevamente agregamos algo más
        editor.write(" ¡Ups, tal vez esto no era necesario!");
        // No guardamos aún, vamos a mostrarlo
        System.out.println("Texto antes de deshacer: " + editor.getText());
        
        // Decidimos deshacer (Restauramos al estado anterior)
        editor.restore(history.pop());
        
        // Imprimimos el estado luego de deshacer
        System.out.println("Texto después de deshacer: " + editor.getText());
        
        // Incluso podemos deshacer una vez más
        editor.restore(history.pop());
        System.out.println("Texto después de deshacer otra vez: " + editor.getText());
    }
}
