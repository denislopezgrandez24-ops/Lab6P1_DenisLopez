/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_denislopez;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author djlop
 */
public class Lab6P1_DenisLopez {
    static Scanner leer = new Scanner(System.in);
    static Random R = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el tamano del arreglo: ");
        int size = leer.nextInt();
        int [] numeros = new int [size];
        numeros=lectura(size);
        int op=menu();
        while(op!=4){
            switch(op){
                case 1:{
                    int[]numeros1=new int[size];
                    numeros1=LECTURA(size);
                    System.out.println("Ingrese el tamano del array: ");
                    imprimir(numeros1);
                    
                    
                    break;
                }
                case 2:{
                    int[]numeros2=new int[size];
                    numeros2=lectura(size);
                    System.out.println("Arreglo 1: ");
                    imprimir(numeros);
                    System.out.println("Arreglo 2: ");
                    imprimir(numeros2);
                     System.out.println("El producto punto es: ");
                    imprimir(productoPunto(numeros,numeros2));
                    break;
                }
                case 3:{
                    
                    break;
                }
                default: {
                    
                }
            }
            op=menu();
        }
    }
    
    public static int menu(){
        System.out.println("Menu");
        System.out.println("1. Ordenamiento de arreglos");
        System.out.println("2. Producto Punto de un Vector");
        System.out.println("3. Primo mayor y menor");
        System.out.println("Ingrese su opcion:");
        int opcion = leer.nextInt();
        return opcion;
    }
    
    public static int[] lectura(int size){
        int temporal[]=new int[size];
        for(int i=0;i<temporal.length;i++){
            System.out.println("Ingrese el valor"+i+"del arreglo: ");
            temporal[i]= leer.nextInt();
    }
      return temporal;
    }
     
    public static void imprimir(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    
    public static int [] lecturarandom(int size){
        int temporal []=new int[size];
        for(int i=0;i<temporal.length;i++){
            temporal[i]= 1+R.nextInt(99);
    }
      return temporal;
        
    }
    
    public static int [] LECTURA(int size){
        int temporal [] = new int [size];
        while(size>5 && size<20){
            for (int i=0;i<temporal.length;i++){
            System.out.println("Array Original : ["+i+"]");
            temporal[i]= leer.nextInt();
        }   
        }
        System.out.println("Valor invalido, ingrese un tamano valido:");
        return temporal;
    }
    
    public static void menorAmayor(int[] size){
        int temporal [] = new int [size.length];
        int min= size[0];
        int max= size[0];
        for (int i=0; i<temporal.length;i++){
            
        }
        
        
    }
    
    public static void mayorAmenor(){
        
    }
    
    public static void imprimirArreglo(){
        
    }
    
    public static int [] productoPunto(int [] x, int [] y){
        int temporal [] = new int [x.length];
        int ubicacion1=0;
        int ubicacion2=0;
        int ubicacion3=0;
        if(x.length!=y.length){
            System.out.println("Los deben tener las misma cantidad de digitos");
        }
        for (int i=0;i<temporal.length;i++){
            temporal[ubicacion1]=x[i];
            ubicacion1+=1;
            for (int j=0;j<temporal.length;j++){
                 temporal[ubicacion2]=y[j];
                 ubicacion2+=1;
                 temporal[ubicacion3]= x[i]*y[j];
                 temporal[ubicacion3]= x[i]+y[j];
            }
        }
        return temporal;
    }
    
    public static int [] llenarArreglo(int[] x){
        int temporal []=new int[x.length];
        for(int i=0;i<temporal.length;i++){
            temporal[i]= 1+R.nextInt(99);
    }
      return temporal;
        
    }
    
    public static int [] llenarArray(int size){
        int temporal []=new int[size];
        for(int i=0;i<temporal.length;i++){
            temporal[i]= 1+R.nextInt(100);
    }
      return temporal;
    }
    
    public static boolean isPrime(int num){
          int divisor =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                divisor+=1;
            }
        }
        if (divisor==2){
            return true;
        }else{
            return false;
        }
    }
  
    public static int [] Primos(int[] lista){
        int[] temporal = new int[lista.length];
        int ubicacion=0;
        for(int i=0;i<lista.length;i++){
            
        }
        return temporal;
        
    }
        
 }
    
    
    
    

