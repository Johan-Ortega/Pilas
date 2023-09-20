
package pilas;

import javax.swing.JOptionPane;


public class Pilas {

    
    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Pila pila = new Pila();
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento a la pila\n"
                        + "2. Sacar un elemento de la pila\n"
                        + "3. ¿La pila esta vacia?\n"
                        + "4. ¿Que elemento esta en la cima?\n"
                        + "5. Tamaño de la pila\n"
                        + "6. Vaciar pila\n"
                        + "7. Salir\n"
                        + "¿Que deseas hacer?", "Menu de opciones", JOptionPane.INFORMATION_MESSAGE));
                
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a agregar", "Apilando datos",
                                JOptionPane.INFORMATION_MESSAGE));
                        pila.agregar(elemento);
                        break;
                    
                    case 2:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento sacado es " + pila.sacar(),
                                    "Sacando elemento de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 3:
                        if(pila.estaVacia()){
                           JOptionPane.showMessageDialog(null, "La pila SI esta vacia",
                                   "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else{
                            JOptionPane.showMessageDialog(null, "La pila NO esta vacia",
                                    "La pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 4:
                        if(!pila.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es " + pila.cima(),
                                    "Cima de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es " + pila.tamanioPila(),
                                "Tamaño de la pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    case 6:
                        if(!pila.estaVacia()){
                            pila.limpiarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado ",
                                "Vaciando pila", JOptionPane.INFORMATION_MESSAGE);
                        } else{
                            JOptionPane.showMessageDialog(null, "No hay nada que vaciar",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while(opcion != 7);
    }
    
}
