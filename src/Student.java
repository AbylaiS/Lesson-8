public class Student {
    String name;
    String surName;
    String adress;
    String id;

    public Student() {
        name = "Алиса";
        surName = "Смит";
        adress = "Коктем-2";
        id = "24";
    }
    @Override
    public String toString(){
        return String.format("name: %s,surname: %s,adress: %s: id %s," ,name , surName , adress ,id);
    }
}
