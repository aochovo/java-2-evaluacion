package autobusesxml;


import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class ClasePrincipal {


    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		AccesoDatos.conectarBBDD();
    		
    		ArrayList<Provincia> lista_provincias=AccesoDatos.obtenerProvincias();
    		EntradaSalida.devolverPovincias(lista_provincias);
    		
    		int opcion_provincia=EntradaSalida.pedirnProvincia();
    		
    		String nombre_provincia=AccesoDatos.obtenerProvincia(opcion_provincia);
    		
    		String url="http://api.openweathermap.org/data/2.5/weather?q="+nombre_provincia+"&appid=57703a7a9ab7b873a99116a3ea379748";
    		
    		String aux=PeticionWeb.hacerPeticion(url);
    		
    		ObjetoJSON objeto=AccesoDatos.json(aux);
    		String ruta_fichero= "C:\\proyectosjava\\temperaturasjson\\fichero.html";
    		String html_tabla=PintaHTML.crearTabla (objeto);
    		GrabarFichero.grabarLinea(html_tabla,ruta_fichero);
            try{
            String ruta2="\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"";
            Process p=Runtime.getRuntime().exec(ruta2+ruta_fichero);
            p.waitFor();
            System.out.println("Google Chrome launched!");}
            catch (Exception e){
            e.printStackTrace();
                            }
    	}

    }
