package test1;

public class Test1 {
	public static void main (String args []) {
	Persons  MyBody = new Persons("Vasya", 170, 55.6, 18, "Man"); //������� ��������� ������ Persons
	//��������� � ����������� ���������
	MyBody.vivodNaEkran(); //������� �� ����� ���������� ��������� ������������ ������ Persons
	//MyBody.setPersonsAge = 9;
	/*MyBody.setPersonsAge(9);
	MyBody.setPersonsHeigt(176);
	MyBody.setPersonsWeight(85.6);
	MyBody.setPersonsGender("Man");	*/
//	System.out.println("���: " + MyBody.getPersonsName());
//	System.out.println("����: "+MyBody.getPersonsHeigt());		
//	System.out.println("���: "+ MyBody.getPersonsWeight());
//	System.out.println("�������: "+MyBody.getPersonsAge());
//	System.out.println("���:" + MyBody.isPersonsGender()); 
//	System.out.println();
	Persons Student = new Persons("Egor", 165,55.6,17, "Man");
	Student.vivodNaEkran();
//	System.out.println("���: " + Student.getPersonsName());
//	System.out.println("����: "+Student.getPersonsHeigt());		
//	System.out.println("���: "+ Student.getPersonsWeight());
//	System.out.println("�������: "+Student.getPersonsAge());
//	System.out.println("���:" + Student.isPersonsGender()); 
	//Persons [] allPersons = new Persons [2];
	//allPersons [0]= MyBody;
	//allPersons [1]= Student;
	//for (int i=0; i<2; i++) {
	//System.out.println("���: "+allPersons[i].getPersonsName());
	//System.out.println("�������: " + allPersons[i].getPersonsAge());
	//System.out.println("����: " + allPersons[i].getPersonsHeigt());
	//System.out.println("���: "+allPersons[i].getPersonsWeight());
	//System.out.println("���: "+allPersons[i].isPersonsGender()+ "\n");
		//System.out.println(allPersons[i].vivodNaEkran());
	boolean MyBoo = true;
	int chislo;
	if (MyBoo == true) {
		chislo = 1;	} else {
			chislo = 0;
		}
	System.out.println(chislo);
	}
	}


