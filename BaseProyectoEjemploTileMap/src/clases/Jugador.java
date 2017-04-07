package clases;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import juego.Juego;

public class Jugador {
	private String nombreJugador;
	private int x;
	private int y;
	private int velocidad;
	private int anchoImagen;
	private int altoImagen;
	private String llaveImagen;
	public Jugador(String nombreJugador, int x, int y, int velocidad, String llaveImagen) {
		this.nombreJugador = nombreJugador;
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.llaveImagen = llaveImagen;
	}
	public String getNombreJugador() {
		return nombreJugador;
	}
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
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

	public void pintar(Graphics2D g2D, ImageObserver observer){
		g2D.drawImage(Juego.imagenes.get(this.llaveImagen), x, y, observer);
	}

	public void mover(){
		if(Juego.presionoDerecha)
			x+=velocidad;

		if(Juego.presionoIzquierda)
			x-=velocidad;

		if(Juego.presionoArriba)
			y-=velocidad;

		if(Juego.presionoAbajo)
			y+=velocidad;
	}
}

