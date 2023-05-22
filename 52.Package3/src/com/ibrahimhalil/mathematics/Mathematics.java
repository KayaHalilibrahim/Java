
package com.ibrahimhalil.mathematics;


public class Mathematics implements IMathematics{
    
    @Override
    public void sum(int a, int b){
        System.out.println("result: " + (a+b));
    } 
    @Override
   public void substraction(int a, int b){
        System.out.println("result: " + (a-b));
    }
 
    @Override
    public void multiply(int a, int b){
        System.out.println("result: " + (a*b));
    }
 
    @Override
    public void divide(int a, int b){
        System.out.println("result: " + ((double)a/b));
    }

    
}
