
package pilas;

public class Pila {
    private NodoPila cima;
    int tama;
    
    public Pila(){
        cima = null;
        tama = 0;
    }
    
    //Metodo para saber cuando la pila esta vacia
    public boolean estaVacia(){
        return cima == null;
    }
    
    //Metodo para agregar un nodo a la pila y empujar un nodo ya existente
    public void agregar(int elemento){
        NodoPila nuevo = new NodoPila(elemento);
        
        nuevo.siguiente = cima;
        cima = nuevo;
        tama++;
    }
    
    //Metodo para sacar un elemento de la pila
    public int sacar(){
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tama--;
        return auxiliar;
    }
    
    //Metodo para saber quien esta en la cima de la pila
    public int cima(){
        return cima.dato;
    }
    
    //Metodo para saber el tamaño de la pila
    public int tamanioPila(){
        return tama;
    }
    
    //Metodo para vaciar la pila
    public void limpiarPila(){
        while(!estaVacia()){
            sacar();
        }
    }
}
