package autobusesxml;

public class ObjetoJSON {
	private double temp_max,temp_min;
	private String sunrise2, sunset2;
	public ObjetoJSON(double temp_max, double temp_min, String sunrise2, String sunset2) {
		super();
		this.temp_max = temp_max;
		this.temp_min = temp_min;
		this.sunrise2 = sunrise2;
		this.sunset2 = sunset2;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public String getSunrise2() {
		return sunrise2;
	}
	public void setSunrise2(String sunrise2) {
		this.sunrise2 = sunrise2;
	}
	public String getSunset2() {
		return sunset2;
	}
	public void setSunset2(String sunset2) {
		this.sunset2 = sunset2;
	}
	@Override
	public String toString() {
		return "temp_max: "+temp_max+",temp_min: "+temp_min+",sunrise:"+sunrise2+", sunset: "+sunset2+";";
	}
	
}
