package test1;

public class Test1 {
	public static void main (String args []) {
	Persons  MyBody = new Persons("Vasya", 170, 55.6, 18, "Man"); //создаем экземпляр класса Persons
	//передовая в конструктор аргументы
	MyBody.vivodNaEkran(); //выводим на экран переданные аргументы конструктору класса Persons
	//MyBody.setPersonsAge = 9;
	/*MyBody.setPersonsAge(9);
	MyBody.setPersonsHeigt(176);
	MyBody.setPersonsWeight(85.6);
	MyBody.setPersonsGender("Man");	*/
//	System.out.println("Имя: " + MyBody.getPersonsName());
//	System.out.println("Рост: "+MyBody.getPersonsHeigt());		
//	System.out.println("Вес: "+ MyBody.getPersonsWeight());
//	System.out.println("Возраст: "+MyBody.getPersonsAge());
//	System.out.println("Пол:" + MyBody.isPersonsGender()); 
//	System.out.println();
	Persons Student = new Persons("Egor", 165,55.6,17, "Man");
	Student.vivodNaEkran();
//	System.out.println("Имя: " + Student.getPersonsName());
//	System.out.println("Рост: "+Student.getPersonsHeigt());		
//	System.out.println("Вес: "+ Student.getPersonsWeight());
//	System.out.println("Возраст: "+Student.getPersonsAge());
//	System.out.println("Пол:" + Student.isPersonsGender()); 
	//Persons [] allPersons = new Persons [2];
	//allPersons [0]= MyBody;
	//allPersons [1]= Student;
	//for (int i=0; i<2; i++) {
	//System.out.println("Имя: "+allPersons[i].getPersonsName());
	//System.out.println("Возраст: " + allPersons[i].getPersonsAge());
	//System.out.println("Рост: " + allPersons[i].getPersonsHeigt());
	//System.out.println("Вес: "+allPersons[i].getPersonsWeight());
	//System.out.println("Пол: "+allPersons[i].isPersonsGender()+ "\n");
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


