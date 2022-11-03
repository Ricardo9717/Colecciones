package com.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Lista {

	public static void main(String[] args) {
		List<Persona> p = new ArrayList<>();
		Scanner sc =  new Scanner(System.in);
		

//		Persona p1= new Persona("Raul", 37, "2277559988");
//		Persona p2= new Persona("Adriana", 17, "2278635424");
//		Persona p3= new Persona("Maria", 50, "2209874326");
//		Persona p4= new Persona("Jose", 80, "2298256378");
//		Persona p5= new Persona("Humberto", 20, "2218537802");
//		Persona p6 = new Persona();
//		
//		p6.setNombre("Laura");
		
//		p.add(p1);
//		p.add(p2);
//		p.add(p3);
//		p.add(p4);
//		p.add(p5);
//		p.add(p6);
		
		//Cantidad de objetos que quiero crear
		System.out.println("Ingrese el numero de personas que desea agregar");
		int n =  Integer.parseInt(sc.nextLine());
		//variables auxiliares para crear los objetos de tipo Persona
		String nombre, tel;
		int e;
		
		//Llenar la lista
		for(int i =1; i<=n;i++) {
			System.out.println("Ingrese el nombre");
			nombre = sc.nextLine();
			System.out.println("Ingrese la edad");
			e = Integer.parseInt(sc.nextLine());
			System.out.println("Ingrese el relefono");
			tel = sc.nextLine();
			p.add(new Persona(nombre, e, tel));
		}
		
		
		//Imprimir la lista
		for(Persona pp:p ) {
			System.out.println(pp);
		}
	}
}
