
package liststack;


public class ListStack {

    
    public static void main(String[] args) {
       Pila<String> pilaLibros = new Pila<>();
        
       
        System.out.println("¿La pila esta vacia? " + pilaLibros.vacia()); // 
        
        pilaLibros.push("Estructuras de Datos");
        pilaLibros.push("Base de Datos");
        pilaLibros.push("Programacion en Java");
        pilaLibros.push("Calculo");
        pilaLibros.push("Ingles Principiante");
        pilaLibros.push("Algebra");
        
        System.out.println("Cantidad de elementos en la pila: " + pilaLibros.size()); 
        
        System.out.println("Libro en el tope (peek): " + pilaLibros.peek()); 
        
                System.out.println("Extraido (pop): " + pilaLibros.pop()); 
        System.out.println("Extraido (pop): " + pilaLibros.pop()); 
        
        System.out.println("Nuevo tope (peek): " + pilaLibros.peek()); 
        System.out.println("¿La pila está vacia? " + pilaLibros.vacia()); 
    }
}
    
    

