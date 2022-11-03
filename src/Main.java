public class Main {
    public static void main(String[] args) {
        University university=new University();
        university.setTeacher("Muhhamed agai");
        university.setStudents("Taalaybekov");
        university.setFounded(2022);

        University university1=new University();
        university1.setTeacher("Rahim agai");
        university1.setStudents("Baytik");
        university1.setFounded(2022);

        University university2=new University();
        university2.setTeacher("Aijamal ezhe");
        university2.setStudents("Taalaybekovich");
        university2.setFounded(2022);

        University[]universities={university,university1,university2};

        for (University univer:universities) {
            System.out.println();

        System.out.println(univer.getTeacher());
        System.out.println(univer.getStudents());
        System.out.println(univer.getFounded());

        }
        School school=new School();
        school.setNumber(88);
        school.setTeacher("Gulmira Asanovna");
        school.setStudent("T.Baytik");

        School school1=new School();
        school1.setNumber(88);
        school1.setTeacher("Fatima Usupovmna");
        school1.setStudent("T.Baytik");

        School school2=new School();
        school2.setNumber(10);
        school2.setTeacher("Nurshat Turdukozhoevna");
        school2.setStudent("T.Baytik");

        School[] schooli={school,school1,school2};
        for (School schools:schooli) {
            System.out.println();
            System.out.println(schools.getNumber());
            System.out.println(schools.getTeacher());
            System.out.println(schools.getStudent());


        }
        Car car=new Car();
        car.setModel("LX500");
        car.setName("lexus");
        car.setPrice(1500);

        Car car1=new Car();
        car1.setModel("SE");
        car1.setName("Camry");
        car1.setPrice(15000);

        Car car2=new Car();
        car2.setModel("X5");
        car2.setName("BMW");
        car2.setPrice(150000);

        Car[] cars={car,car1,car2};
        for (Car carss:cars) {
            System.out.println();
            System.out.printf("%s,%s,%s\n",carss.getModel(),carss.getName(),carss.getPrice());

        }


        Person person=new Person();
        person.setName("Baytik");
        person.setSurname("Taalaybekov");
        person.setAge(20);

        Person person1=new Person();
        person1.setName("Syimyk");
        person1.setSurname("Jumagulov");
        person1.setAge(21);

        Person person2=new Person();
        person2.setName("Davran");
        person2.setSurname("Joldoshbaev");
        person2.setAge(17);

        Person[] names={person,person1,person2};
        for (Person name:names) {
            System.out.println();
            System.out.println(name.getName());
            System.out.println(name.getSurname());
            System.out.println(name.getAge());

        }





        }




}