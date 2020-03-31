package autobusesxml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class AccesoFichero {
	
	public static ArrayList<Camara> parsearAutobuses() {
		// TODO Auto-generated method stub
		SAXBuilder builder=new SAXBuilder();
		ArrayList<Camara> lista=new ArrayList<>();
		try {
			Document doc=builder.build(new File("C:\\proyectosjava\\camarasxml\\camaras.txt"));
			Element elemento_camara=doc.getRootElement();
			List<Element> lista_camaras=elemento_camara.getChildren("Camara");
			for (Element element : lista_camaras) {
				Element posicion=element.getChild("Posicion");
				String latitud=posicion.getChild("Latitud").getValue();
				String longitud=posicion.getChild("Longitud").getValue();
				String URL=element.getChild("URL").getValue();
				Camara a=new Camara(latitud, longitud, URL);
				lista.add(a);
			
				}
				
			}
			
		 catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
}
