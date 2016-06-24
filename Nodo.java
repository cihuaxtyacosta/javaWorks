/*
 * Contains the definition of a node and the methods what can be occuped in a node.
 */
package listaligada;

public class Nodo {
    
    private int number;
    public Nodo next ;
    
    public Nodo (){
        this.number = 1;
        this.next = null;      
    }
    public Nodo ( int constan ){
        this.number = constan;
        this.next = null;
    }
    
    public void setValueNode ( int value) {
        this.number = value;
    }
    
    public int getValueNode () {
        return this.number;
    } 
}
