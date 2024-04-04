package e4;

public class Electrodomestico {
	protected double precioBase = 100;

	protected enum color {
		blanco, negro, rojo, azul, gris
	};

	protected enum consumoEnergetico {
		A, B, C, D, E, F
	};

	protected consumoEnergetico consum = consumoEnergetico.F;
	protected color col = color.blanco;
	protected double peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precioBase, consumoEnergetico consum, color col, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		this.consum = consum;
		this.col = col;

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public consumoEnergetico getConsum() {
		return consum;
	}

	public color getCol() {
		return col;
	}

	public double getPeso() {
		return peso;
	}
	
	private boolean comprobarConsumoEnergetico(char letra) {
		boolean res=false;
		for (consumoEnergetico var : consumoEnergetico.values()) {
			if (var.letra()=) {
				
			}
			}
		return res;
	}
boolean comprobarColor(String color) {
	boolean res=false;

	return res;
}
}
