package Polymorphism.PersonTell;

public class Text {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        American american = new American();
        Korean korean = new Korean();
        Person[] persons = new Person[3];
        persons[0] = chinese;
        persons[1] = american;
        persons[2] = korean;
        for(Person p:persons){          //for增强办法
            p.said();
        }
    }
}

