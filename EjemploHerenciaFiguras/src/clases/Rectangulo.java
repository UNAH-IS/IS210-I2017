package clases;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends Figura {
	private int ancho;
	private int alto;

	public Rectangulo(int x, int y, Color color, int ancho, int alto) {
		super(x, y, color);
		this.ancho = ancho;
		this.alto = alto;
	}

	public Rectangulo(){}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}

	@Override
	public void dibujar(Graphics g) {
		g.setColor(this.color);
		g.drawRect(this.x, this.y, this.ancho, this.alto);
	}

}
