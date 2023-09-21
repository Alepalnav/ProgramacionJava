package logicaJuego;

public class Constantes {
	public static final int TAMANNO 					= 10;
	public static final int NUM_ROCAS 					= 5;
	public static final int NUM_GEMAS 					= 5;
	public static final int NUM_POCIONES 				= 3;
	public static final int NUM_DINERO 					= 2;

	public static final int ROCA 						= 1;
	public static final int GEMA 						= 2;
	public static final int POCION 						= 3;
	public static final int DINERO 						= 4;
	public static final int ELFO 						= 5;
	public static final int MAGO 						= 6;
	public static final int GUERRERO 					= 7;
	public static final int OGRO 						= 8;
	
	public static final int NUM_JUGADORES 				= 4;
		
	public static final char[] NOMBRE_JUGADORES 		= {'X','Y','Z','U'};
	
	public static final int ELFO_VELOCIDAD 				= 7;
	public static final int ELFO_MAGIA 					= 6;
	public static final int ELFO_FUERZA					= 5;
	public static final int OGRO_VELOCIDAD 				= 4;
	public static final int OGRO_MAGIA					= 4;
	public static final int OGRO_FUERZA					= 7;
	public static final int GUERRERO_VELOCIDAD			= 5;
	public static final int GUERRERO_MAGIA				= 5;
	public static final int GUERRERO_FUERZA				= 6;
	public static final int MAGO_VELOCIDAD				= 6;
	public static final int MAGO_MAGIA					= 7;
	public static final int MAGO_FUERZA 				= 4;	
	
	public static final int EMPATE						= 0;	//Hay empate ninguno de los dos gana la lucha
	public static final int GANA_USA_POCIMA				= 1; 	//Gana el jugador y se utiliza pocima del enemigo para que no muera
	public static final int GANA_DINERO					= 2; 	//Gana el jugador y se lleva todo el dinero del enemigo
	public static final int GANA_MUERE					= 3; 	//Gana el jugador y el enemigo muere
	public static final int PIERDE_USA_POCIMA			= 4; 	//Gana el enemigo y se utiliza pocima del jugador para que no muera
	public static final int PIERDE_DINERO				= 5; 	//Gana el enemigo y se lleva todo el dinero del jugador
	public static final int PIERDE_MUERE				= 6; 	//Gana el enemigo y el jugador muere
	
	public static final int ROMPE_ROCA_CON_GEMA 		= 0;
	public static final int GANA_A_LA_ROCA 				= 1;
	public static final int PIERDE_A_LA_ROCA 			= 2;
	
	public static final String CURRENT_USER_DIRECTORY 	= System.getProperty("user.dir");
	public static final String IMAGE_ICON_DIRECTORY 	= "/img/";
	public static final String IMAGE_EXTENSION			= ".png";
}
