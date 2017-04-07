package clases;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import juego.Juego;

public class Tile {
	private int x;
	private int y;
	private int velocidad;
	private int anchoImagen;
	private int altoImagen;
	private String llaveImagen;

	public Tile(int x, int y, int velocidad, String llaveImagen) {
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.llaveImagen = llaveImagen;
		anchoImagen = Juego.imagenes.get(llaveImagen).getWidth();
		altoImagen = Juego.imagenes.get(llaveImagen).getHeight();
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
	}

	public void mover(){
		x-=velocidad;
	}
}