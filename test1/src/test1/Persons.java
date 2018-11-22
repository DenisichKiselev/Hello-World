package test1;

public class Persons {
	private int personsHeigt;//рост человека
	private double personsWeight;//вес человека
	private int personsAge;//возраст человека
	private String personsGender;//пол человека
	private String personsName;
	public int setPersonsAge(int age) {	// объявляем сетер для записи в переменную значения
		this.personsAge = age;
		//System.out.println("Переменной присвоено значение");
		return personsAge;
	}
	public int getPersonsAge() {	//объявляем гетер для доступа к переменной
		//System.out.println("Значение переменной считано");
		return personsAge;
	}
	public int getPersonsHeigt() {
		return personsHeigt;
	}
	public void setPersonsHeigt(int personsHeigt) {
		this.personsHeigt = personsHeigt;
	}
	public double getPersonsWeight() {
		return personsWeight;
	}
	public void setPersonsWeight(double personsWeight) {
		this.personsWeight = personsWeight;
	}
	public String isPersonsGender() {
		return personsGender;
	}
	public void setPersonsGender(String personsGender) {
		this.personsGender = personsGender;
	}				
	public Persons(String name, int heigt, double weight, int age, String gender) {
		
	this.setPersonsName(name);
	this.personsAge = age;
	this.personsGender = gender;
	this.personsHeigt = heigt;
	this.personsWeight = weight;
	
}
	public String getPersonsName() {
		return personsName;
	}
	public void setPersonsName(String personsName) {
		this.personsName = personsName;
	}
	public  void vivodNaEkran() {
		System.out.println("Имя человека: " + personsName);
		System.out.println("Рост человека: " + personsHeigt);
		System.out.println("Возраст человека: " + personsAge);
		System.out.println("Вес человека: " + personsWeight);
		System.out.println("Пол человека: " + personsGender);
	}
	
}

