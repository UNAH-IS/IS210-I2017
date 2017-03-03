package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends JFrame implements KeyListener{
	private int coordenaX=60;
	public Ventana(){
		this.setTitle("Super ventana");
		this.setSize(900, 600);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

		this.addKeyListener(this);
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);
		/*g.drawRect(30, 50, 100, 200);
		g.setColor(new Color(255,0,0));
		for (int i = 0; i<1000; i++)
			g.drawOval(200 + (i*2), 150+ (i*2), 100, 100);
		g.setColor(new Color(0,255,0));
		g.fillRect(350, 100, 50, 50);*/
		System.out.println("Ejecutando metodo paint");
		try {
			g.drawImage(ImageIO.read(getClass().getResource("/img/fondo.jpg")),0, 0, this);
			g.drawImage(ImageIO.read(getClass().getResource("/img/sonic.png")), coordenaX, 300, this);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Ventana();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE){
			System.out.println("Se presiono espacio");
			coordenaX+=5;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
