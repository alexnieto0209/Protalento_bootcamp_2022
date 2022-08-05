package com.protalento.practica_semanal_2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Scanner java= new Scanner(System.in);
      System.out.print("ingrese un dia: ");
      int dia= java.nextInt();
      System.out.print("ingrese un mes: ");
      int mes= java.nextInt();
      System.out.print("ingrese el año: ");
      int anio= java.nextInt();
      
      if (anio >=1900 && anio <=2099) {
    	  if ((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0)) {
    		  if (mes >=1 && mes <=12) {
    			  if (mes ==2) {
    				  if(dia >=1 && dia<=29) {
    					  System.out.println("entonces el año es viciesto: "+anio);
    					  System.out.println("tu fecha ingresada es correcta: "+dia+"/"+mes+"/"+anio);
    					
    				  }else {
    					  System.out.println("tu fecha es incorrecta porque el dia es invalido");
    				  }
    			  }else if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
    				  if (dia >=1 && dia<=31) {
    					  System.out.println("tu fecha ingresada es correcta: "+dia+"/"+mes+"/"+anio);
    					  	  
    				  }else {
    					  System.out.println("dia invalido, el contenido maximo de dias por mes es 31");
    				  }
    			  }else if (mes==4 || mes==6 || mes==9 || mes==11) {
    				  if (dia >=1 && dia<=30) {
    					  System.out.println("tu fecha ingresada es correcta: "+dia+"/"+mes+"/"+anio);
    				  }else {
    					  System.out.println("dia invalido, el contenido maximo de dias por mes es 30");
    				  }
    			  }
    			  
    		  }else {
    			  System.out.println("el mes ingresado debe ser entre 1 y 12");
    		  }
    	  }else if ((anio % 4 != 0) && (anio % 100 == 0 || anio % 400 != 0)) {
    		  if (mes >=1 && mes <=12) {
    			  if (mes ==2) {
    				  if (dia >=1 && dia <=28) {
    					  System.out.println("entonces el año no es viciesto: "+anio);
    					  System.out.println("tu fecha ingresada es correcta: "+dia+"/"+mes+"/"+anio);
    					  
    					  
    				  }else {
    					  System.out.println("dia invalido, el contenido de dias por mes es 28 en año viciesto");
    				  }
    			  }else if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
    				  if (dia >=1 && dia<=31) {
    					  System.out.println("tu fecha ingresada es correcta: "+dia+"/"+mes+"/"+anio);
    					  	  
    				  }else {
    					  System.out.println("dia invalido, el contenido maximo de dias por mes es 31");
    				  }
    			  }else if (mes==4 || mes==6 || mes==9 || mes==11) {
    				  if (dia >=1 && dia<=30) {
    					  System.out.println("tu fecha ingresada es correcta: "+dia+"/"+mes+"/"+anio);
    				  }else {
    					  System.out.println("dia invalido, el contenido maximo de dias por mes es 30");
    				  }
    			  }
    		  }else {
    			  System.out.println("mes invalido, el mes ingresado debe ser entre 1 y 12");
    		  }
    		  
    	  }
      }else {
    	  System.out.println("año invalido, el programa funciona entre 1900 y 2099.");
      }
   java.close();
    }
}
