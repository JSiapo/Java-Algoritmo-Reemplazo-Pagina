package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidadPaginas,cantidadFrames;
		
		cantidadPaginas=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Cantidad de Páginas"));
		cantidadFrames=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad de frames"));
		
		Fifo fifo=new Fifo();
		fifo.setCantidadFrames(cantidadFrames);
		fifo.setCantidadPaginas(cantidadPaginas);
		fifo.fifo();
		
		
	}

}
