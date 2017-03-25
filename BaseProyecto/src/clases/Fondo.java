package clases;

import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

import juego.Juego;

public class Fondo {
	private int x;
	private int x2;
	private int y;
	private int anchoImagen;
	private int altoImagen;
	private String llaveImagen;
	private int velocidad=2;
	//private String llaveImagen2;

	public Fondo(int x, int y, int anchoImagen, int altoImagen, String llaveImagen) {
		super();
		this.x = x;
		this.y = y;
		this.anchoImagen = anchoImagen;
		this.altoImagen = altoImagen;
		this.llaveImagen = llaveImagen;
	}

	public Fondo(int x, int y, String llaveImagen) {
		this.x = x;
		this.y = y;
		this.llaveImagen = llaveImagen;
		this.anchoImagen = Juego.imagenes.get("fondo").getWidth();
		this.altoImagen = Juego.imagenes.get("fondo").getHeight();
		this.x2 = this.x + this.anchoImagen;
	}

	public Fondo(){}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAnchoImagen() {
		return anchoImagen;
	}

	public void setAnchoImagen(int anchoImagen) {
		this.anchoImagen = anchoImagen;
	}

	public int getAltoImagen() {
		return altoImagen;
	}

	public void setAltoImagen(int altoImagen) {
		this.altoImagen = altoImagen;
	}

	public String getLlaveImagen() {
		return llaveImagen;
	}

	public void setLlaveImagen(String llaveImagen) {
		this.llaveImagen = llaveImagen;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public void dibujar(Graphics2D g2D, ImageObserver imgObs){
		g2D.drawImage(Juego.imagenes.get("fondo"),x,y,imgObs);
		g2D.drawImage(Juego.imagenes.get("fondo2"),x2,y,imgObs);
	}

	public void mover(){
		if (this.x2 ==0){
			//System.out.println("La segunda imagen llego al principio");
			this.x = this.anchoImagen;
		}
		if (this.x==0){
			//System.out.println("La segunda imagen llego al principio");
			this.x2 = this.anchoImagen;
		}
		this.x-=velocidad;

		this.x2-=velocidad;
	}

}
