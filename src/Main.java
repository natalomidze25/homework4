public class Main {
    public static void main(String[] args){
        Person person = new Person();
        person.setName("nata");
        person.setLastName("lomidze");
        person.setAddress("tbilisi");
        person.setAge(28);
        person.setBirthYear(1996);



        Person person2 = new Person("nata", 28, "lomidze","tbilisi",1996);
        System.out.println(person2.getName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getAge());
        System.out.println(person2.getAddress());
        System.out.println(person2.getBirthYear());




    }

}