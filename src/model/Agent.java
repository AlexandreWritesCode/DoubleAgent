package model;

public class Agent {
	private String name;
	private double latitude;
	private double longitude;
	private int age;
	private Gender sex;
	public Agent(String name, String latitude, String longitude, String age, String sex){ // constructors
		this.name = name;
		this.latitude = Double.parseDouble(latitude);
		this.longitude = Double.parseDouble(longitude);
		this.age = Integer.parseInt(age);
		if (sex.equals("Female")) {
			this.sex = Gender.FEMALE;
		} else {
			this.sex = Gender.MALE;
		}
	}
	
	public String getName(){ // getters
		return this.name;
	}
	public double getLatitude(){
		return this.latitude;
	}
	public double getLongitude(){
		return this.longitude;
	}	
	public int getAge(){
		return this.age;
	}
	public Gender getGender(){
		return this.sex;
	}
}
