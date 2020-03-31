package autobusesxml;

import java.util.ArrayList;

public class PintaHTML {

	public static String crearTabla(ArrayList<Camara> lista) {
		
		
	        String html="<html><head></head><body><table border=1><tr><th>Nombre Autobus</th><th>Salida</th><th>Llegada</th></tr>";
	        for (Camara x : lista)
	        {
	        	
	            html=html+"<tr><td>"+x.getLatitud()+"</td><td>"+x.getLongitud()+"</td><td><img src='http://"+x.getURL()+"'/></td></tr>";
	        }
	        html=html+"</table></body></html>";
	        return html;
	    
	}

}
