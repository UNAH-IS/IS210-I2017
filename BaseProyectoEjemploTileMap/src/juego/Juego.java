package juego;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import clases.Jugador;
import clases.Tile;

public class Juego extends Canvas implements KeyListener{
	private JFrame ventana;
	private BufferStrategy dobleBuffer;
	private Graphics2D g2D;

	private boolean jugando  = false;

	public static final int ANCHO_VENTANA = 700/*DEFINA SUS PROPIAS DIMENSIONES*/;
	public static final int ALTO_VENTANA = 500/*DEFINA SUS PROPIAS DIMENSIONES*/;

	int lastFpsTime; //Variable auxiliar para calculo de la pausa del ciclo principal
	int fps; //Fotogramas por segundo

	private int tileMap[][]={
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 6 ,0 , 0 ,0, 0},
			{0 , 0 , 7 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 8 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 34, 0 ,0 , 1 ,35, 0},
			{0 , 34, 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 10 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 34 , 20 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,25 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 34 , 0 ,30 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 1 ,35, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,34, 0},
			{0 , 0 , 0 ,0 , 1 ,33, 0},
			{0 , 0 , 0 ,0 , 1 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0},
			{0 , 0 , 0 ,0 , 0 ,0, 0}

	};
	private ArrayList<Tile> tiles;
	private Jugador jugador;
	public static boolean presionoIzquierda;
	public static boolean presionoDerecha;
	public static boolean presionoArriba;
	public static boolean presionoAbajo;

	public static HashMap<String,BufferedImage> imagenes = new HashMap<String,BufferedImage>();

	public Juego(){
		cargarImagenes();
		inicializarObjetosJuego();
		incializarVentana();
		cargarTiles();
		createBufferStrategy(2); //Crear una estrategia de doble buffer (metodo optimo para videojuegos)
		dobleBuffer = getBufferStrategy(); //Obtener una instancia de BufferStrategy (para luego dibujar los componentes)

		jugando = true; //Definir la variable logica de juego en true

		this.requestFocus(); //Solicitar el foco para que los eventos del teclado puedan ser capturados por el Canvas.
		this.addKeyListener(this); //Agregar interfaz de escucha para poder interceptar las teclas pulsadas por el usuario.

		cicloPrincipal(); //Ejecutar el ciclo principal del juego (Este no necesariamente debe llamarse desde aqui)
	}

	public void incializarVentana(){
		//Crear la ventana y establecer sus propiedades
		ventana = new JFrame(); //Crear instancia de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminar aplicacion cuando se de click en la X
		ventana.setSize(ANCHO_VENTANA, ALTO_VENTANA); //Establecer las dimensiones de la ventana
		ventana.setLocationRelativeTo(null); //Centrar ventana en el escritorio
		//ventana.setResizable(false);
		//Ventana en fullscreen
		//ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//ventana.setUndecorated(true);
		ventana.setTitle("Establezca el titulo de su conveniencia"); //Definir el titulo de la ventana
		ventana.getContentPane().add(this); //Agregar el Canvas (lienzo) a la ventana
		ventana.setVisible(true); //Mostrar ventana
	}

	public void inicializarObjetosJuego(){
		jugador = new Jugador("Mario",10,10,2,"mario");
		tiles = new ArrayList<Tile>();
	}

	//Cargar Imagenes
	public void cargarImagenes(){
		//Es mas conveniente almacenar las imagenes en un hashmap para poder darle un alias.
		try {
			BufferedImage tiles = ImageIO.read(getClass().getResource("/recursos/tiles_spritesheet.png"));
			imagenes.put("mario", ImageIO.read(getClass().getResource("/recursos/mario.png")));
			imagenes.put("tile1", tiles.getSubimage(0, 0, 70, 70));
			imagenes.put("tile2", tiles.getSubimage(0, 73, 70, 70));
			imagenes.put("tile3", tiles.getSubimage(0, 145, 70, 70));
			imagenes.put("tile4", tiles.getSubimage(0, 217, 70, 70));
			imagenes.put("tile5", tiles.getSubimage(0, 289, 70, 70));
			imagenes.put("tile6", tiles.getSubimage(0, 361, 70, 70));
			imagenes.put("tile7", tiles.getSubimage(0, 433, 70, 70));
			imagenes.put("tile8", tiles.getSubimage(0, 505, 70, 70));
			imagenes.put("tile10", tiles.getSubimage(0, 577, 70, 70));
			imagenes.put("tile11", tiles.getSubimage(0, 577, 70, 70));
			imagenes.put("tile12", tiles.getSubimage(0, 577, 70, 70));
			imagenes.put("tile13", tiles.getSubimage(0, 577, 70, 70));

			imagenes.put("tile14", tiles.getSubimage(73, 0, 70, 70));
			imagenes.put("tile15", tiles.getSubimage(73, 73, 70, 70));
			imagenes.put("tile16", tiles.getSubimage(73, 145, 70, 70));
			imagenes.put("tile17", tiles.getSubimage(73, 217, 70, 70));
			imagenes.put("tile18", tiles.getSubimage(73, 289, 70, 70));
			imagenes.put("tile19", tiles.getSubimage(73, 361, 70, 70));
			imagenes.put("tile20", tiles.getSubimage(73, 433, 70, 70));
			imagenes.put("tile21", tiles.getSubimage(73, 505, 70, 70));
			imagenes.put("tile22", tiles.getSubimage(73, 577, 70, 70));
			imagenes.put("tile23", tiles.getSubimage(73, 577, 70, 70));
			imagenes.put("tile24", tiles.getSubimage(73, 577, 70, 70));
			imagenes.put("tile25", tiles.getSubimage(73, 577, 70, 70));

			imagenes.put("tile26", tiles.getSubimage(504, 0, 70, 70));
			imagenes.put("tile27", tiles.getSubimage(504, 73, 70, 70));
			imagenes.put("tile28", tiles.getSubimage(504, 145, 70, 70));
			imagenes.put("tile29", tiles.getSubimage(504, 217, 70, 70));
			imagenes.put("tile30", tiles.getSubimage(504, 289, 70, 70));
			imagenes.put("tile31", tiles.getSubimage(504, 361, 70, 70));
			imagenes.put("tile32", tiles.getSubimage(504, 433, 70, 70));
			imagenes.put("tile33", tiles.getSubimage(504, 505, 70, 70));
			imagenes.put("tile34", tiles.getSubimage(504, 577, 70, 70));
			imagenes.put("tile35", tiles.getSubimage(504, 649, 70, 70));
			imagenes.put("tile36", tiles.getSubimage(504, 721, 70, 70));
			imagenes.put("tile37", tiles.getSubimage(504, 793, 70, 70));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void cargarTiles(){
		for(int i=0;i<tileMap.length;i++)
        	for(int j=0;j<tileMap[0].length;j++)
        		if (tileMap[i][j]!=0)
        			tiles.add(new Tile(i*70,j*70, 3, "tile"+tileMap[i][j]));
	}

	//Metodo para pintar los componentes del juego
	private void pintar(){
        g2D = (Graphics2D)dobleBuffer.getDrawGraphics(); //Obtener la instancia de Graphics para pintar los elementos

        //Puede borrar las siguientes 4 lineas
        g2D.setColor(new Color(139,225,235)); //Definir el color negro en el contexto
        g2D.fillRect(0, 0, ANCHO_VENTANA, ALTO_VENTANA); //Dibujar un rectangulo
        g2D.setColor(Color.WHITE); //Definir el color blanco en el contexto

        //Pintar tiles
        for(int i=0;i<tiles.size();i++)
        	tiles.get(i).pintar(g2D, this);

        jugador.pintar(g2D, this);
        dobleBuffer.show(); //Mostrar lo que se ha dibujado
	}

	public void actualizar(){
		//Agregue aqui el codigo necesario para actualizar los componentes de juego y construir la logica del juego
		jugador.mover();
		 for(int i=0;i<tiles.size();i++)
	        	tiles.get(i).mover();
	}

	public void cicloPrincipal(){
       //variables para el calculo del tiempo para la pausa, este codigo es opcional, si lo desea puede definir un valor para la pausa en duro.
	   long lastLoopTime = System.nanoTime();
       final int TARGET_FPS = 60;
       final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;

       while (jugando){
    	   //Calculo del tiempo optimo y uniforme para la pausa.
    	   long now = System.nanoTime();
    	   long updateLength = now - lastLoopTime;
    	   lastLoopTime = now;
    	   double delta = updateLength / ((double)OPTIMAL_TIME);
    	   lastFpsTime += updateLength;
    	   fps++;
    	   if (lastFpsTime >= 1000000000){
    		   System.out.println("(FPS: "+fps+")");
    		   lastFpsTime = 0;
    		   fps = 0;
    	   }
    	   //Fin del calculo del tiempo optimo y uniforme para la pausa.

    	   //Metodos para pintar el lienzo y actualizar los componentes de juego
    	   pintar();
    	   actualizar();

    	   //Aplicar la pausa.
    	   try{Thread.sleep((lastLoopTime-System.nanoTime() + OPTIMAL_TIME)/1000000 );} //Puede sustituir el valor de la pausa por un valor fijo
    	   catch(Exception e){};
       }
    }

	//Metodo que se ejecuta cuando el usuario presiona una tecla
	public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
        	case KeyEvent.VK_LEFT:
        		presionoIzquierda=true;
        		break;
        	case KeyEvent.VK_RIGHT:
        		presionoDerecha=true;
        		break;
        	case KeyEvent.VK_UP:
        		presionoArriba=true;
        		break;
        	case KeyEvent.VK_DOWN:
        		presionoAbajo=true;
        		break;
        }
    }

	//Metodo que se ejecuta cuando el usuario suelta una tecla
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
	        case KeyEvent.VK_LEFT:
	    		presionoIzquierda=false;
	    		break;
	    	case KeyEvent.VK_RIGHT:
	    		presionoDerecha=false;
	    		break;
	    	case KeyEvent.VK_UP:
	    		presionoArriba=false;
	    		break;
	    	case KeyEvent.VK_DOWN:
	    		presionoAbajo=false;
	    		break;
        }
    }
    //Sin uso, pero a fuerzas se debe redefinir
  	public void keyTyped(KeyEvent e) {}

    public static void main(String[] args){
		new Juego(); //Crear un objeto del tipo Juego.
	}
}