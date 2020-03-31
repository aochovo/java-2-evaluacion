package autobusesxml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import org.json.JSONObject;

public class AccesoDatos {


		private static Connection c=null;
	    private static java.sql.Statement stmt=null;
		
	    public static void conectarBBDD() {
			
			  try {
		            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/españa","root","");
		            stmt=c.createStatement();
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
	}
	    

		public static ArrayList<Provincia> obtenerProvincias() {
			
			ArrayList<Provincia> lista_provincias=new ArrayList<Provincia>();
			
			try {
				String query="SELECT * FROM `provincias` ORDER by id_provincia ASC";
				ResultSet rs=stmt.executeQuery(query);
				while (rs.next()) {
					
					int id=rs.getInt("id_provincia");
					String provincia=rs.getString("provincia");
					
				Provincia p=new Provincia(id, provincia);
				lista_provincias.add(p);
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return lista_provincias;
		}


		public static String obtenerProvincia(int opcion_provincia) {
			String nombre_provincia="";
			try {
				String query="SELECT * FROM `provincias` where id_provincia="+opcion_provincia;
				ResultSet rs=stmt.executeQuery(query);
				while (rs.next()) {
					
					int id=rs.getInt("id_provincia");
					String provincia=rs.getString("provincia");
					
				 nombre_provincia=provincia;
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			return nombre_provincia;
		}


		public static ObjetoJSON json(String aux) {
			
			JSONObject objeto_json=new JSONObject(aux);
			JSONObject main=objeto_json.getJSONObject("main");
			double temp_max=main.getDouble("temp_max");
			double temp_min=main.getDouble("temp_min");
			
			JSONObject sys=objeto_json.getJSONObject("sys");
			long sunrise=sys.getInt("sunrise");
			long sunset=sys.getInt("sunset");
			String sunrise2=formatTime(Instant.ofEpochSecond(sunrise));
			String sunset2=formatTime(Instant.ofEpochSecond(sunset));
			long epoch = System.currentTimeMillis()/1000;
			
			ObjetoJSON c=new ObjetoJSON(temp_max, temp_min, sunrise2, sunset2);
			
			
			return c;
		
		}


		static final DateTimeFormatter formatter = DateTimeFormatter
		        .ofPattern("h:mm a", Locale.ENGLISH)
		        .withZone(ZoneId.of("Europe/Madrid"));

		static String formatTime(Instant time) {
		    return formatter.format(time);
		}

	}

