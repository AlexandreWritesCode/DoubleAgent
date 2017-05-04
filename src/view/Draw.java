package view;

import java.io.PrintWriter;

import model.Agent;
import model.Database;
import model.Gender;
public class Draw {
	final private static int WIDTH = 800;
	final private static int HEIGHT = 700;
	final private static String FEMALE = "blue";
	final private static String MALE = "red";
	final private static String FILL = "#000000";
	
	static public void htmlSetup(PrintWriter writer){
	    writer.println("<!DOCTYPE html> <html> <head> <title>Alexandre Cabello\'s CrossCHX submission</title> <meta charset=\"utf-8\" /> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
	    writer.println(header());
	    writer.println("</head> <body>");
	    writer.println(map());
	}
	
	public static void agents(PrintWriter writer, Database roster) {
		Agent[] agent = roster.getRoster();
		String genderColored;
		for (int i = 0; i < agent.length-1; i++) {
			if (agent[i].getGender().equals(Gender.MALE)) {
				genderColored=MALE;
			} else { // female
				genderColored=FEMALE;
			}
			writer.println("L.circle(["+agent[i].getLatitude()+","+agent[i].getLatitude()+"], {color: '"+ genderColored
			+"', fillColor: '"+FILL+"', fillOpacity: 1, radius: 5000}).addTo(mymap)" // change size and opacity as you'd like
			+ ".bindPopup(\""
			+agent[i].getName()+"<br>"
			+"Age: "+agent[i].getAge()+" | "
			+"Gender: "+agent[i].displayGender()+"<br>"
			+agent[i].getLatitude()+", "+agent[i].getLongitude()+"\").openPopup();");
		}
	}

	static private String header (){
		String s = "<link rel=\"stylesheet\" href=\"https://unpkg.com/leaflet@1.0.3/dist/leaflet.css\"";
		s+="integrity=\"sha512-07I2e+7D8p6he1SIM+1twR5TIrhUQn9+I6yjqD53JQjFiMf8EtC93ty0/5vJTZGF8aAocvHYNEDJajGdNx1IsQ==\"";
		s+="crossorigin=\"\"/>";
		s+="<script src=\"https://unpkg.com/leaflet@1.0.3/dist/leaflet.js\"";
		s+="integrity=\"sha512-A7vV8IFfih/D732iSSKi20u/ooOfj/AGehOKq0f4vLT1Zr2Y+RX7C+w8A1gaSasGtRUZpF/NZgzSAu4/Gc41Lg==\"";
		s+="crossorigin=\"\"></script>";
		s+="<script src='https://api.mapbox.com/mapbox-gl-js/v0.36.0/mapbox-gl.js'></script>"; // mapbox
		s+="<link href='https://api.mapbox.com/mapbox-gl-js/v0.36.0/mapbox-gl.css' rel='stylesheet' />"; 
		return s;
	}
	
	static private String map (){
		String s = "<div id=\"mapid\" style=\"width: "+WIDTH+"px; height: "+HEIGHT+"px;\"></div>";
		s += "<script>var mymap = L.map('mapid').setView([51.505, -0.09], 0);"; 
		s+="L.tileLayer('https://api.mapbox.com/styles/v1/mapbox/{id}/tiles/256/{z}/{x}/{y}?access_token={accessToken}', {";
		s+="attribution: 'Map data &copy; <a href=\"http://openstreetmap.org\">OpenStreetMap</a> contributors, <a href=\"http://creativecommons.org/licenses/by-sa/2.0/\">CC-BY-SA</a>, Imagery © <a href=\"http://mapbox.com\">Mapbox</a>',";
		s+="maxZoom: 18,";
		s+="id: 'satellite-v9',";
		s+="accessToken: 'pk.eyJ1IjoicGlja2xlZGNyb2lzc2FudCIsImEiOiJjajJhb2phbjgwMDdxMndwaWtocDV2Nm9uIn0.ilz51LUQZVg7fyE16GWXvQ'";
		s+="}).addTo(mymap);";
		return s;
	}
	
	static public void close(PrintWriter writer){
		 writer.println("</script> </body> </html>");
		 writer.close();
	}
}
