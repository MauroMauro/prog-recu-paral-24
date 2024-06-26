package ar.com.unpaz.principal;

import ar.com.unpaz.procesos.LeerArchivo;
import ar.com.unpaz.procesos.LeerArchivoThrow;
import ar.com.unpaz.procesos.MaximoDeListaParalellStreams;
import ar.com.unpaz.procesos.ParesImparesParallelStreams;
import ar.com.unpaz.procesos.ProcesoLoop;
import ar.com.unpaz.procesos.StreamsFilterSubcadena;

public class Principal {

	public static void main(String[] args) {
		
		ProcesoLoop hiloProcesoLoop = new ProcesoLoop();
		LeerArchivo hiloLeerArchivo = new LeerArchivo();
		LeerArchivoThrow hiloLeerArchivoThrow = new LeerArchivoThrow();
		StreamsFilterSubcadena hiloStreamsFilterSubcadena = new StreamsFilterSubcadena(); 
		MaximoDeListaParalellStreams sMaximoDeListaParalellStreams = new MaximoDeListaParalellStreams();
		ParesImparesParallelStreams sParesImparesParallelStreams = new ParesImparesParallelStreams();
		
		
//		hiloProcesoLoop.start();
//		hiloLeerArchivo.start();
//		hiloLeerArchivo.interrupt();
//		System.out.println("Se interrumpe el hilo. ¿Interrumpido?: " + hiloLeerArchivo.isInterrupted());
//		hiloLeerArchivoThrow.start();
		
		//hiloStreamsFilterSubcadena.start();
		//sMaximoDeListaParalellStreams.run();
		
		sParesImparesParallelStreams.run();

	}

}
