public class Person {
    private String name;
    private  int age;
    private  String lastName;
    private  String address;
    private  int birthYear;


    public Person(String name, int age, String lastName, String address, int birthYear) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.address = address;
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
