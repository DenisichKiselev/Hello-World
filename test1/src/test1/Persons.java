package test1;

public class Persons {
	private int personsHeigt;//���� ��������
	private double personsWeight;//��� ��������
	private int personsAge;//������� ��������
	private String personsGender;//��� ��������
	private String personsName;
	public int setPersonsAge(int age) {	// ��������� ����� ��� ������ � ���������� ��������
		this.personsAge = age;
		//System.out.println("���������� ��������� ��������");
		return personsAge;
	}
	public int getPersonsAge() {	//��������� ����� ��� ������� � ����������
		//System.out.println("�������� ���������� �������");
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
		System.out.println("��� ��������: " + personsName);
		System.out.println("���� ��������: " + personsHeigt);
		System.out.println("������� ��������: " + personsAge);
		System.out.println("��� ��������: " + personsWeight);
		System.out.println("��� ��������: " + personsGender);
	}
	
}

