package work03;

public abstract class Abt {
    private int number;
    private String name;
    private int age;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public final void model(){
        tongZhi();
    }

    public abstract void tongZhi();
}
