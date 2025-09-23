package unlam.edu.ar.pb2;

import java.util.Scanner;

public class PruebaEstacionamiento {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		MenuEstacionamiento menu[]= MenuEstacionamiento.values();
		MenuEstacionamiento opcion;
		
		for(int i=0;i<menu.length;i++) {
			System.out.println(menu[i]);
		}
		
		System.out.println( "\n" + "Ingrese una de las opciones: ");
		opcion = menu[teclado.nextInt()];
		
		switch(opcion) {
		case INGRESO_VEHICULOS:
			ingresarVehiculo();
			break;
		case UBICAR_VEHICULO:
			ubicarVehiculo();
			break;
		case RETIRAR_VEHICULO:
			retirarVehiculo();
			break;
		default:
			break;
		}
	}

	private static void retirarVehiculo() {
		// TODO Auto-generated method stub
		
	}

	private static void ubicarVehiculo() {
		// TODO Auto-generated method stub
		
	}

	private static void ingresarVehiculo() {
		// TODO Auto-generated method stub
		
	}

}
