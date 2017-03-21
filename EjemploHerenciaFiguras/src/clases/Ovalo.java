package clases;

import java.awt.Color;
import java.awt.Graphics;

public class Ovalo extends Figura{
	private int diametro1;
	private int diametro2;


	public Ovalo(int x, int y, Color color, int diametro1, int diametro2) {
		super(x, y, color);
		this.diametro1 = diametro1;
		this.diametro2 = diametro2;
	}

	public Ovalo(){}

	public int getDiametro1() {
		return diametro1;
	}

	public void setDiametro1(int diametro1) {
		this.diametro1 = diametro1;
	}

	public int getDiametro2() {
		return diametro2;
	}

	public void setDiametro2(int diametro2) {
		this.diametro2 = diametro2;
	}

	@Override
	public String toString() {
		return "Ovalo [diametro1=" + diametro1 + ", diametro2=" + diametro2 + "]";
	}

	@Override
	public void dibujar(Graphics g) {
		g.setColor(this.color);
		g.drawOval(this.x, this.y, this.diametro1, this.diametro2);
	}

}
