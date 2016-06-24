/*
 Elaborado por CHX
 16/06/16 con Java 1.7 en NeatBeans IDE 8.1

 */
package listaligada;

/**
 *
 * @author chx
 */
public class ListaLigada {
    private Nodo raiz;
    
    public ListaLigada (){
        this.raiz= new Nodo();
    }
    
    public void addQueueLL(int dato){
        
        Nodo current, newNodo;
        
        newNodo = new Nodo(dato);
        current = raiz;
        while(current.next != null)
            current= current.next;    
        current.next = newNodo;        
    }  
    
    public void addStackLL(int dato){
        Nodo newNodo;
        
        newNodo = new Nodo(dato);
        newNodo.next = raiz;
        raiz = newNodo;   
    }
    
    public Nodo searchLL(int dato){
        Nodo current = raiz;
        
        while(current != null && current.getValueNode() != dato)
            current= current.next;
        if (current == null){
            System.out.println("El elemento "+ dato + " no se encuentra en la lista");
            return null;
            }
        else{
            System.out.println("Se encontro el elemento "+current.getValueNode());
            return current;
        }    
    }
    
    public void deleteNodoLL(int dato){
        Nodo current, next;
        
        current = raiz;
        next = raiz.next;
        
        if(raiz.getValueNode() == dato)
            raiz = raiz.next;
        else{
            while(next != null){
                if(next.getValueNode() == dato){
                    current.next= next.next;
                    System.out.println("Se eliminó el nodo con el dato "+dato);
                    return;
                }                    
                current=next;
                next= next.next;
            }
            System.out.println("El número "+dato+" no se encontraba en la lista"); 
        }
    }
    
    public void printLL(){
        Nodo current = raiz;
        
        while (current != null){
            System.out.print(current.getValueNode()+" ");
            current = current.next;
        }
        System.out.println();
    }
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        ListaLigada lista = new ListaLigada();
         
        lista.addQueueLL( 255);
        lista.addQueueLL( 34);
        lista.addQueueLL( 75);
        lista.addQueueLL( 90);
        lista.addQueueLL( 13);
        lista.addQueueLL( 26);
        lista.addQueueLL( 22);
        lista.raiz.setValueNode(45);
        lista.addStackLL(895);
        lista.printLL();
        lista.searchLL(0);
        lista.deleteNodoLL(22);
        lista.printLL();
    }   
}
