package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidadPaginas,cantidadFrames;
		int []paginas;
		
		cantidadPaginas=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Cantidad de Páginas"));
		cantidadFrames=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad de frames"));
		
		paginas= new int[cantidadPaginas];
		
		for(int c=0;c<cantidadPaginas;c++){
			paginas[c]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese valor de paginas ["+(c+1)+"]"));
		}

		Fifo fifo=new Fifo();
		fifo.setCantidadFrames(cantidadFrames);
		fifo.setCantidadPaginas(cantidadPaginas);
		fifo.setPaginas(paginas);
		fifo.fifo();
		
		LRU lru=new LRU();
		lru.setCantidadPaginas(cantidadPaginas);
		lru.setCantidadFrames(cantidadFrames);
		lru.setPaginas(paginas);
		lru.lru();
	}

}
