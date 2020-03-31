package autobusesxml;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		ArrayList<Camara> lista=AccesoFichero.parsearAutobuses();
		String ruta_fichero= "C:\\proyectosjava\\camarasxml\\fichero.html";
		String html_tabla=PintaHTML.crearTabla (lista);
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
