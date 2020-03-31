package autobusesxml;

import java.util.ArrayList;

public class PintaHTML {

	public static String crearTabla(ObjetoJSON x) {
		
		
	        String html="<html><head></head><body><table border=1><tr><th>Temperatura Maxima</th><th>Temperatura minima</th><th>Sunrise</th><th>Sunset</th></tr>";
	       
	        	
	            html=html+"<tr><td>"+x.getTemp_max()+"</td><td>"+x.getTemp_min()+"</td><td>"+x.getSunrise2()+"</td><td>"+x.getSunset2()+"</td></tr>";
	        
	        html=html+"</table></body></html>";
	        return html;
	    
	}

}
