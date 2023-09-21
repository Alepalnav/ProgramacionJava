package elementos;

import java.util.Objects;

public class Element {
	
//clase element//
protected ElementType elemento;

public Element(ElementType elemento) {
	super();
	this.elemento = elemento;
}

@Override
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
	Element other = (Element) obj;
	return elemento == other.elemento;
}


}