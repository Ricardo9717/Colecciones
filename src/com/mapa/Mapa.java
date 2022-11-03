package com.mapa;

import java.util.HashMap;



public class Mapa {

	public static void main(String[] args) {
		HashMap<Integer, Persona> mapa  = new HashMap<>();	
		Persona p1 =  new Persona(10,"Raul", 34, "1284950923");
		Persona p2 =  new Persona(28,"Karla", 30, "1284950923");
		Persona p3 =  new Persona(37,"Jose", 58, "1284950923");
		
		
		
		
		
		
		mapa.put(p1.getId(), p1);
		mapa.put(p2.getId(), p2);
		mapa.put(p3.getId(), p3);
//		p1.setNombre("Roberto");
//		mapa.replace(10, p1);
//		mapa.remove(37);
		
		int n = mapa.size();
		int key[]= {p1.getId(), p2.getId(), p3.getId()};
		
		for(int i =0;i<n;i++) {
			System.out.println(mapa.get(key[i]));
		}
		
		System.out.println(mapa);

	}

}
