package Polymorphism.ex2;

public class Grandpa {
    public Animal cuiShape(String type){
        Animal animal;
        if(type.equals("Dog")){
            animal=new Dog();
        }else if(type.equals("Cat")){
            animal=new Cat();
        }else{
            animal=new Pig();
        }
        return animal;
    }
}
