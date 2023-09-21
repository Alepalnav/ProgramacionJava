package elementos;

import java.util.Objects;
import java.util.Random;

import logica.juego.Constantes;


public class Coordenada {
	
//atributos//	
private int x;
private int y;

//constructores//
public Coordenada() {
	super();
	Random random =new Random();
	this.x=(random.nextInt(Constantes.TAMANNO));
	this.y=(random.nextInt(Constantes.TAMANNO));
}
//segundo constructor//
public Coordenada(int x, int y) {
	super();
	if (x>=0 && x<=Constantes.TAMANNO-1 && y>=0 && y<=Constantes.TAMANNO-1 ) {
		this.x = x;
		this.y = y;
	}else {
		this.x=0;
		this.y=0;
	}

}
//guetter y setter//
public int getX() {
	return x;
}
public int getY() {
	return y;
}

@Override
public int hashCode() {
	return Objects.hash(x, y);
}

//equals//
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Coordenada other = (Coordenada) obj;
	return x == other.x && y == other.y;
}
@Override
public String toString() {
	return "Coordenada x = " + x + ", coordenada y = " + y + "";
}


//metodos de la clase coordenada//
/**
 * Permite mover a la derecha, si esta en el borde del tablero devuelve false.
 * @return
 */
public boolean goRight () {
	
	boolean se_mueve=true;
	
	
	if (x==Constantes.TAMANNO-1) {
		se_mueve=false;
	}else {
		x++;
	}
	return se_mueve;
}
/**
 * Permite mover a la izquierda, si esta en el borde izquierdo devuelve false
 * @return
 */
public boolean goLeft() {
	
	boolean se_mueve=true;
	
	if (x==0) {
		
		se_mueve=false;
	}else {
		x--;
	}
	return se_mueve;
}
/**
 * Permite mover hacia arriba, si esta en el borde del tablero, devuelve false.
 * @return
 */
public boolean goUp() {
	
	boolean se_mueve=true;
	
	if (y==0) {
		
		se_mueve=false;
	}else {
		y--;
	}
	return se_mueve;
}
/**
 * Permite mover hacia abajo, si esta en el borde devulve false.
 * @return
 */
public boolean goDown() {
	
	boolean se_mueve=true;
	
	
	if (y==Constantes.TAMANNO-1) {
		
		se_mueve=false;
	}else {
		
		y++;
	}
	return se_mueve;
}
@Override
public Coordenada clone() throws CloneNotSupportedException {
	return new Coordenada(this.x,this.y);
}

}
