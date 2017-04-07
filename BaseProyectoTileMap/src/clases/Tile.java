package clases;

import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

import juego.Juego;

public class Tile {
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private String llaveImagen;
	private int velocidad;
	public Tile(int x, int y, int ancho, int alto, String llaveImagen, int velocidad) {
		super();
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.llaveImagen = llaveImagen;
		this.velocidad = velocidad;
	}

	public Tile(int x, int y,  String llaveImagen, int velocidad) {
		super();
		this.x = x;
		this.y = y;
		this.ancho = Juego.imagenes.get(llaveImagen).getWidth();
		this.alto = Juego.imagenes.get(llaveImagen).getHeight();;
		this.llaveImagen = llaveImagen;
		this.velocidad = velocidad;
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
		g2D.drawImage(Juego.imagenes.get(llaveImagen), x, y, imgObs);
	}
}
