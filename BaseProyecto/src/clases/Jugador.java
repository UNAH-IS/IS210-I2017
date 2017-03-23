package clases;

import java.awt.Graphics2D;
import java.awt.image.ImageObserver;

import juego.Juego;

public class Jugador {
	private int x;
	private int y;
	private int anchoImagen;
	private int altoImagen;
	private String llaveImagen;
	private int velocidad=2;
	//private String llaveImagen2;

	private int contadorIteraciones;

	public Jugador(int x, int y, int anchoImagen, int altoImagen, String llaveImagen) {
		super();
		this.x = x;
		this.y = y;
		this.anchoImagen = anchoImagen;
		this.altoImagen = altoImagen;
		this.llaveImagen = llaveImagen;
	}

	public Jugador(int x, int y, String llaveImagen) {
		this.x = x;
		this.y = y;
		this.llaveImagen = llaveImagen;
		//this.llaveImagen = llaveImagen2;
	}

	public Jugador(){}

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

	@Override
	public String toString() {
		return "Jugador [x=" + x + ", y=" + y + ", anchoImagen=" + anchoImagen + ", altoImagen=" + altoImagen
				+ ", llaveImagen=" + llaveImagen + "]";
	}

	public void dibujar(Graphics2D g2D, ImageObserver imgObs){
		g2D.drawImage(Juego.imagenes.get(llaveImagen),x,y,imgObs);
	}

	public void mover(){
		contadorIteraciones++;
		if(contadorIteraciones<=3){
			llaveImagen = "auto2";
		}else if (contadorIteraciones>=6){
			llaveImagen = "auto";
			contadorIteraciones = 0;
		}

		if (this.x>Juego.ANCHO_VENTANA)
			this.x=-100;
		else
			this.x+=velocidad;
	}

}
