package POO_avanzada.parking;

import java.time.LocalDateTime;

import POO_avanzada.parking.model.Combustible;
import POO_avanzada.parking.model.Parking;
import POO_avanzada.parking.model.Tipo;
import POO_avanzada.parking.model.Vehiculo;

public class Main {


	public static void main(String[] args)  {
		
		Parking parking = new Parking();
		
			Vehiculo uno = new Vehiculo("Audi","A1","ABCD1234",Combustible.GASOIL,LocalDateTime.now(),Tipo.AUTOMOVIL);
			Vehiculo dos = new Vehiculo("Mercedes","A2","ABC2234",Combustible.ELECTRICO,LocalDateTime.now(),Tipo.AUTOMOVIL);
			
			try {
				System.out.println(parking.añadirVehiculo(uno));
				System.out.println(parking.añadirVehiculo(dos));
				System.out.println(parking.toString());
				System.out.println(parking.quitarVehiculo("ABCD1234"));
				System.out.println(parking.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}

		
		
		
	}

}
