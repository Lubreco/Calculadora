/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogh;

/**
 * Adios Mundo
 * @author redes
 * @since 28/02/2020
 */
public class Calculadora {
    private int num1;
    private int num2;
    
    public Calculadora(int a, int b){
        /**
         * @param operador a
         * @param operador b
         */
        num1=a;
        num2=b;
    }
    
    public int suma(){
        /**
         * @return Te devuelve la suma de los dos valores
         */
        int result=num1+num2;
        return result;
    }
    
    public int resta(){
        /**
         * @return Te devuelve la resta de los dos valores
         */
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
        
    public boolean resta2(){
        /**
         * @return devuelve el boleano true
         * @return devuelve el boleano false
         */
        if (num1 > num2)    return true;
        else                return false;
    }
    
    public int multiplica(){
        /**
         * @return Te devuelve la multiplicación de los dos valores
         */
        int result=num1*num2;
        return result;
    }
    
    public int divide(){
        /**
         * @return Te devuelve la divisioón de los dos valores
         */
        int result=num1/num2;
        return result;
    }
    
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }

     public int divide0(){
         /**
          * @return Te devuelve el valor 0 de la división
          * @throws Lanza una excepción cuendo la división da 0
          */
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    */
}
