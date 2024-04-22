package ar.edu.unju.fi.test;

import ar.edu.unju.fi.moodel.automovil;
import ar.edu.unju.fi.moodel.constantes.colores;

public class TestCrearAutomovil {

	public static void main(String[] args) {
		automovil auto= new automovil();
		auto.setMarca("Renaulto");
		auto.setColor(colores.NEGRO);
		
		System.out.println("Marca: "+auto.getMarca()+
					"\nColor: "+auto.getColor());
	}

}
