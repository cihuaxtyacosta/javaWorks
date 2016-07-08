package arbolbinario;

/**
 * @author chx
 * Clase que implementa los nodos para la clase árbolBinario
 */
public class NodoAB {
    
    private int number;
    public NodoAB leftSon, rightSon;
          
   public NodoAB (){
        this.number = 50;
        this.leftSon = null;
        this.rightSon = null;      
    }
    
    public NodoAB ( int constant ){
        this.number = constant;
        this.leftSon = null;
        this.rightSon = null;
    }
    
    
    public int getValueNodo(){
        return this.number;
    }
    
    public void setValueNodo(int value){
        this.number = value;
    } 
}
