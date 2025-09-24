package unlam.edu.ar.pb2;

import java.util.Scanner;

public class PruebaEstacionamiento {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Estacionamiento estacionamiento = new Estacionamiento("Avenida", 10 ,10);
		
		System.out.println("Bienvenido a " + estacionamiento.getNombre().toUpperCase());
		
		MenuEstacionamiento opcion;
		
		do {
		System.out.println("Nuestras opciones: \n");
		MenuEstacionamiento menu[]= MenuEstacionamiento.values();
	
		
		for(int i=0;i<menu.length;i++) {
			System.out.println(menu[i]);
		}
		
		System.out.println( "\n" + "Ingrese una de las opciones: ");
		opcion = menu[teclado.nextInt()];
		
		switch(opcion) {
		case INGRESO_VEHICULOS:
			ingresarVehiculo(estacionamiento);
			break;
		case UBICAR_VEHICULO:
			ubicarVehiculo(estacionamiento);
			break;
		case RETIRAR_VEHICULO:
			retirarVehiculo(estacionamiento);
			break;
		case SALIR:
			break;
		default:
			break;
		}
		}while(opcion!=MenuEstacionamiento.SALIR);
		
		System.out.println("Muchas gracias por venir, te esperamos la próxima!!!");
		teclado.close();
	}

	private static void retirarVehiculo(Estacionamiento est) {
		// TODO Auto-generated method stub
		
	}

	private static void ubicarVehiculo(Estacionamiento est) {
		// TODO Auto-generated method stub
		
	}

	private static void ingresarVehiculo(Estacionamiento est) {
		// TODO Auto-generated method stub
		
	}
	
	

}
