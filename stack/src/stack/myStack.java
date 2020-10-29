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
public class myStack {
    int top;
    int[] a;
    
    public myStack(){
        // constructor is first thing that executes
        top = -1;
        a = new int[10];
    }
    void push(int item){
        top ++;
        a[top] = item;
        
    }
    boolean isEmpty(){
        if  (top == -1){
            return true;
        }else{
            return false;            
                            }
    }
    int pop(){
        int returnValue = a[top];
        --top; 
        return returnValue;
    }
    
    boolean isFull(){
        if (top == a.length - 1)
            return true;
        else {
            return false;
        }
    }
    int peek(){
        return a[top];
    }
}
