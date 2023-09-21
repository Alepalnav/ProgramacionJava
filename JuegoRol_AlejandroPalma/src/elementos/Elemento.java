package elementos;

import java.util.Objects;

public class Elemento {

	protected ElementType elemento;

	public Elemento(ElementType elemento) {
		super();
		this.elemento = elemento;
	}
	
	public String toString() {
		return "Element, elemento = " + elemento + "";
	}

	public ElementType getType() {
		return elemento;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(elemento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Elemento other = (Elemento) obj;
		return elemento == other.elemento;
	}

	
}
