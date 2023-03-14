/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Operaciones.Operacion;
import java.util.Scanner;

/**
 *
 * @author LizzW
 */
public class Servicio {
    private Scanner sc = new Scanner(System.in);
    Operacion nums = new Operacion();
   
    public void crearOperacion(){
        System.out.println("Ingrese número 1");
        nums.setNumero1(sc.nextInt());
        
        System.out.println("Ingrese número 2");
        nums.setNumero2(sc.nextInt());
    }
    
    public int suma(){
        return nums.getNumero1() + nums.getNumero2();
    }
    
    public int resta(){
        return nums.getNumero1() - nums.getNumero2();
    }
    
    public int multiplicacion(){
        if(nums.getNumero1()==0||nums.getNumero2()==0){
            System.out.println("¡ERROR!: ALGUNO de los numeros ingresados es CERO");
            return 0;
        }else{
            return nums.getNumero1() * nums.getNumero2();
        }
    }
    
    public double dividir(){
        if(nums.getNumero1()==0||nums.getNumero2()==0){
            System.out.println("¡ERROR!: ALGUNO de los numeros ingresados es CERO");
            return 0;
        }else{
            return (double)nums.getNumero1() / (double)nums.getNumero2();
        }
    }
}
