package implementacion;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

import clases.Circulo;
import clases.Cuadrado;
import clases.Figura;
import clases.Ovalo;
import clases.Rectangulo;

public class Ventana extends JFrame{
	private ArrayList<Figura> figuras;


	public Ventana(){
		figuras = new ArrayList<Figura>();
		figuras.add(new Rectangulo(100,10,new Color(255,0,0),200,200));
		figuras.add(new Rectangulo(150,200,new Color(0,255,0),150,200));
		figuras.add(new Rectangulo(100,150,new Color(0,0,255),300,200));
		figuras.add(new Rectangulo(200,67,new Color(233,30,198),500,200));
		figuras.add(new Rectangulo(300,56,new Color(233,30,198),500,200));
		figuras.add(new Rectangulo(400,120,new Color(233,30,198),200,200));
		figuras.add(new Rectangulo(54,23,new Color(233,30,198),352,40));
		figuras.add(new Rectangulo(325,234,new Color(233,30,198),320,12));
		figuras.add(new Rectangulo(545,345,new Color(233,30,198),150,120));
		figuras.add(new Ovalo(3,56,new Color(34,45,57),334,200));
		figuras.add(new Ovalo(3,56,new Color(34,45,57),334,222));
		figuras.add(new Ovalo(60,100,new Color(34,45,57),234,12));
		figuras.add(new Ovalo(211,200,new Color(34,45,57),111,440));
		figuras.add(new Circulo(300,200,new Color(255,0,0),100));
		figuras.add(new Cuadrado(300,200,new Color(0,0,0),100));

		setSize(600,600);
		setLocationRelativeTo(null); //Centra el formulario
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dibujando figuras");
		setVisible(true);
	}

	@Override
	public void paint(Graphics g){
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).dibujar(g);
		}
	}

	public static void main(String[] args) {
		new Ventana();
	}

}
