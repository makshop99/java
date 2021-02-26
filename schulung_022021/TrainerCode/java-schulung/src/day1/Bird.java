package day1;

public class Bird extends Animal implements Flying {
    private WeekDay weekDay;

    public Bird(String name) {
        super(name);
    }


    @Override
    public void sayName() {
        System.out.println("My name is: " + getName() + " piep");
    }

    @Override
    public void fly(int heigth) {
        System.out.println("I'm flying " + heigth + " meters high");
    }
}
