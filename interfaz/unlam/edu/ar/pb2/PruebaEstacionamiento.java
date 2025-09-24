package unlam.edu.ar.pb2;

import java.util.Scanner;

public class PruebaEstacionamiento {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		Estacionamiento estacionamiento = new Estacionamiento("Avenida", 10 ,10);
		
		System.out.println("Bienvenido a " + estacionamiento.getNombre().toUpperCase());
		
		MenuEstacionamiento opcion;
		
		do {
		System.out.println("Nuestras opciones: \n");
		MenuEstacionamiento menu[]= MenuEstacionamiento.values();
	
		
		for(int i=0;i<menu.length;i++) {
			System.out.println(menu[i]);
		}
		int numero;
		System.out.println( "\n" + "Ingrese una de las opciones: ");
		numero=teclado.nextInt();
		if(numero<4) {
			opcion = menu[numero-1];
		}else {
			opcion = menu[4-1];
		}
		
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
			System.out.println("opción incorrecta");
		}
		}while(opcion!=MenuEstacionamiento.SALIR);
		
		System.out.println("Muchas gracias por venir, te esperamos la próxima!!!");
		teclado.close();
	}

	private static void retirarVehiculo(Estacionamiento est) {
		String patente;
		boolean resultado;
		System.out.println("Ingrese la patente del vehículo que quiere retirar: ");
		patente = teclado.next();
		resultado = est.retirarCoche(patente);
		if(resultado) {
			System.out.println("El vehículo se retiro correctamente");
		} else {
			System.out.println("No se encontró el vehículo que se quiso retirar");
		}
	}

	private static void ubicarVehiculo(Estacionamiento est) {
		String patenteBuscada;
		Coche buscado = null;
		System.out.println("ingrese la patente que desea encontrar: ");
		patenteBuscada = teclado.next();
		buscado = est.encontraCoche(patenteBuscada);
		if(buscado!=null) {
			System.out.println("Su auto es " + buscado.getMarca());
		} else {
			System.out.println("No encontramos su auto en el estacionamiento");
		}
		
	}

	private static void ingresarVehiculo(Estacionamiento est) {
		String marca;
		String patente;
		boolean resultado = false;
		System.out.println("Ingrese la marca de su auto: ");
		marca = teclado.next();
		System.out.println("Ingrese la patente de su auto: ");
		patente = teclado.next();
		Coche nuevo = new Coche(marca, patente);
		
		resultado = est.agregarUnCoche(nuevo);
		
		if(resultado) {
			System.out.println("Su auto " + nuevo.getPatente() + " se ingresó correctamente");
		} else {
			System.out.println("No pudimos ingresar su auto");
		}
	}
}
