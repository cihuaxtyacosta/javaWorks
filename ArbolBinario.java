package arbolbinario;

/**
 *@author chx el día 24/06/16
 * Clase que implementa un árbol binario con las operaciones:
 * Add, search, delete, y recorrer.
 */
public class ArbolBinario {
    
    public NodoAB root;
    
    public ArbolBinario(){
        this.root = new NodoAB();
    }
  
// me marca  error en este constructor, en NodoAB(value)    
   public ArbolBinario(int value){
        this.root = new NodoAB ( value );
   }

    public void addNodoAB(int number){
        NodoAB newNodo, current;
        
        current = root;
        newNodo = new NodoAB( number);
        insertNodo(current, newNodo);  
    }
    
    private void insertNodo(NodoAB current, NodoAB newNodo){
        if (current == null)
            return;
        if(current.getValueNodo() == newNodo.getValueNodo()){
            System.out.println("El nodo con el elemento "+newNodo.getValueNodo()+" ya existe");
            return;
            }
        if (current.getValueNodo() > newNodo.getValueNodo()){
            if(current.leftSon == null){
                current.leftSon = newNodo;
                return;
                }
            insertNodo(current.leftSon,newNodo);
            }
        if (current.getValueNodo() < newNodo.getValueNodo()){
            if(current.rightSon == null){
                current.rightSon = newNodo;
                return;
            }
            insertNodo(current.rightSon,newNodo);     
        }
    } 
    
    public void requestNodo(int dato){
        NodoAB current = root;
        searchNodo(dato, current);
    }
    
    private void searchNodo(int number, NodoAB nodo){
        NodoAB current;
        current = nodo;
        
        if (current == null){
            System.out.println("");
            System.out.println("No se encontró el dato "+ number+" en el árbol");
            return;
        }
        if(current.getValueNodo() == number){
            System.out.println("");
            System.out.println("Se encontró el nodo "+ current.getValueNodo());
            return;
        }
        if (current.getValueNodo() > number )
            searchNodo(number,current.leftSon);
        if (current.getValueNodo() < number)
            searchNodo(number,current.rightSon);
    }
    
//    public void deleteNodo(int dato){
//        NodoAB current, father;
//        father = root;
//        current = root;
//        
//        if(current.getValueNodo() == dato){
//            root = searchSucesor(current.rightSon); // pasar el hijo izquierdo
//            return;
//        }
//        if (current.getValueNodo() > dato)
//            searchToDelete(dato,current.leftSon, father);
//        if (current.getValueNodo() < dato)
//            searchToDelete(dato, current.rightSon, father);
//    }
    
    //Para este método es indispensable pasar como argumento el hijo izquierdo
    // del nodo a eliminar, de lo contrario habrá un resultado incorrecto
//    private NodoAB searchSucesor( NodoAB nodo){
//        NodoAB current = nodo;
//  
//        while(current.leftSon != null)
//            current = current.leftSon;
//        return current;
//    }
    
//    private void searchToDelete(int dato, NodoAB nodo, NodoAB padre){
//        NodoAB current, father;
//        father = padre;
//        current = nodo;
//        
//        if(current == null){
//            System.out.println("");
//            System.out.println("No se encontró el nodo a eliminar ");
//            return;
//        }
//               
//        if(current.getValueNodo() == dato){
//            if(father.leftSon.getValueNodo() == dato){
//                padre.leftSon = searchSucesor(current.leftSon); // pasar el hijo izquierdo
//                return;
//                }
//            if(father.rightSon.getValueNodo() == dato){
//                padre.rightSon = searchSucesor(current.leftSon);
//                return;
//            }
//        }
//        if (current.getValueNodo() > dato)
//            searchToDelete(dato,current.leftSon, father);
//        if (current.getValueNodo() < dato)
//            searchToDelete(dato, current.rightSon, father);
//    }
    
    public void printTree(){
        NodoAB current;
        current = root;
        
        System.out.print("root "+current.getValueNodo()+" ");
        printLeftSons(current.leftSon);
        printRightSons(current.rightSon);        
    }    
    
    private void printLeftSons (NodoAB current){
        if(current == null) return;
        System.out.print("L"+current.getValueNodo()+" ");
        printLeftSons(current.leftSon);
        printRightSons(current.rightSon);
    }
    
    private void printRightSons (NodoAB current){
        if (current == null) return;
        System.out.print("R"+current.getValueNodo()+" ");
        printLeftSons(current.leftSon);
        printRightSons(current.rightSon);
    }
    
        public static void main(String[] args) {
        
            ArbolBinario tree = new ArbolBinario(60);
            tree.addNodoAB(15);
            tree.addNodoAB(90);
            tree.addNodoAB(91);
            tree.addNodoAB(89);
            tree.addNodoAB(5);
            tree.addNodoAB(67);
            tree.addNodoAB(78);
            tree.addNodoAB(4);
            tree.printTree();
            tree.requestNodo(89);
            tree.requestNodo(17);
            
//            tree.deleteNodo(60);
            //tree.deleteNodo(15);
//            tree.printTree();
            
    }
    
}
