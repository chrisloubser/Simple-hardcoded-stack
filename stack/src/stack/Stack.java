/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Christo
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myStack aStack = new myStack();
        aStack.push(1);
        aStack.push(2);
        aStack.push(3);
        aStack.push(4);
        aStack.push(5);
        while(aStack.isEmpty()!=true){
            System.out.println(aStack.pop());
        }
    }
    
}
