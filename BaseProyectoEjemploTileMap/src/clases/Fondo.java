package clases;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import juego.Juego;

public class Fondo {
	private int x;
	private int x2;
	private int y;
	private int velocidad;
	private int anchoImagen;
	private int altoImagen;
	private String llaveImagen;
	private String llaveImagen2;

	private int contadorImagen = 0;
	public Fondo(int x, int y, int velocidad, String llaveImagen, String llaveImagen2) {
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.llaveImagen = llaveImagen;
		this.llaveImagen2 = llaveImagen2;
		anchoImagen = Juego.imagenes.get(llaveImagen).getWidth();
		altoImagen = Juego.imagenes.get(llaveImagen).getHeight();
		this.x2 = x+anchoImagen;
	}

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
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
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

	public void pintar(Graphics2D g2D, ImageObserver imgObs){
		g2D.drawImage(Juego.imagenes.get(llaveImagen), x, y, imgObs);
		g2D.drawImage(Juego.imagenes.get(llaveImagen2), x2, y, imgObs);
	}

	public void mover(){

		x-=velocidad;
		x2-=velocidad;

		if (x<=-anchoImagen)
			x=anchoImagen;

		if (x2<=-anchoImagen)
			x2=anchoImagen;

		//else
		//	x=0;
	}
}