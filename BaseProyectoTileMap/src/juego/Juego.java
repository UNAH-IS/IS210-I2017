package juego;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

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

	public static HashMap<String,BufferedImage> imagenes = new HashMap<String,BufferedImage>();
	private Tile tile1;

	private int escenarioTiles[][]={
			{1,1,1,1,1,1},
			{0,0,0,0,0,0},
			{0,0,0,0,0,0}
	};
	public Juego(){
		cargarImagenes();
		inicializarObjetosJuego();
		incializarVentana();

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
		tile1 = new Tile(10,10, "cuadro_azul",0);
	}

	public void verificarColisiones(){
		//System.out.println("Verificando colisiones");
	}

	public void limpiarMemoria(){
		//System.out.println("Limpiando memoria");
	}

	//Cargar Imagenes
	public void cargarImagenes(){
		try {
			BufferedImage tiles = ImageIO.read(getClass().getResource("/recursos/tiles.png"));
			imagenes.put("cuadro_azul", tiles.getSubimage(0, 0, 112, 97));


		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	//Metodo para pintar los componentes del juego
	private void pintar(){
        //System.out.println("Pintando");
        g2D = (Graphics2D)dobleBuffer.getDrawGraphics(); //Obtener la instancia de Graphics para pintar los elementos

        //Puede borrar las siguientes 4 lineas
        g2D.setColor(new Color(239,252,255)); //Definir el color negro en el contexto
        g2D.fillRect(0, 0, ANCHO_VENTANA, ALTO_VENTANA); //Dibujar un rectangulo
        g2D.setColor(Color.WHITE); //Definir el color blanco en el contexto


        for (int i=0;i<escenarioTiles.length;i++){
        	for(int j=0;j<escenarioTiles.length;j++){
        		switch (escenarioTiles[i][j]) {
				case 1:
					tile1.dibujar(g2D, this);
					break;
				}
        	}
        }

        /*g2D.drawImage(imagenes.get("cuadro_azul"),0,0,this);
        g2D.drawImage(imagenes.get("cuadro_azul"),95,0,this);
        g2D.drawImage(imagenes.get("cuadro_azul"),190,0,this);
        g2D.drawImage(imagenes.get("cuadro_azul"),285,0,this);
        g2D.drawImage(imagenes.get("cuadro_azul"),380,0,this);*/

        dobleBuffer.show(); //Mostrar lo que se ha dibujado
	}

	public void actualizar(){

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
    	   verificarColisiones();
    	   limpiarMemoria();
    	   //Aplicar la pausa.
    	   try{Thread.sleep((lastLoopTime-System.nanoTime() + OPTIMAL_TIME)/1000000 );} //Puede sustituir el valor de la pausa por un valor fijo
    	   catch(Exception e){};
       }
    }

	//Metodo que se ejecuta cuando el usuario presiona una tecla
	public void keyPressed(KeyEvent e){
        switch(e.getKeyCode()){
        	case KeyEvent.VK_SPACE:
        		System.out.println("Presiono espacio");

        		break;
        }
    }

	//Metodo que se ejecuta cuando el usuario suelta una tecla
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
	        case KeyEvent.VK_SPACE:
	        	System.out.println("Solto espacio");
	        	break;
        }
    }
    //Sin uso, pero a fuerzas se debe redefinir
  	public void keyTyped(KeyEvent e) {}

    public static void main(String[] args){
		new Juego(); //Crear un objeto del tipo Juego.
	}
}