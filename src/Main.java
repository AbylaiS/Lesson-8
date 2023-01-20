import javax.print.attribute.HashDocAttributeSet;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {
    public static void main(String[] args) {
/*
        Animal myAnimal = new Animal();
        Animal myAnimal2 = new Animal();

        System.out.println(myAnimal2.name);
        System.out.println(myAnimal.name);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.x = 7;

        System.out.println(rectangle1.x);
        System.out.println(rectangle2.x);

        Animal myAnimal4 = new Animal();
        myAnimal4.run();
        myAnimal4.run(250);

        Animal myAnimal5 = new Animal();
        System.out.printf("%s,цвет: %s",
               myAnimal.name, myAnimal.color);
*/
        //Домашнее задание

        Student myStudent = new Student();
        System.out.println(myStudent.name);
        System.out.println(myStudent.surName);
        System.out.println(myStudent.adress);
        System.out.println(myStudent.id);

        Student student1 = new Student();
        student1.name = "Азамат";
        student1.surName = "Смит";
        student1.id = "25";
        System.out.println(student1);

        Student student2 = new Student();
        student2.name = "Кристина";
        student2.surName = "Смит";
        student2.id = "26";
        System.out.println(student2);

        Student myStudent1 = new Student();

        Triangle myTriangle1 = new Triangle();
        Triangle myTriangle2 = new Triangle();
        Triangle myTriangle3 = new Triangle();

        myTriangle1.x = 3;
        myTriangle2.z = 4;
        myTriangle3.c = 5;

        System.out.println(myTriangle1.x + myTriangle2.z + myTriangle3.c); //Периметр
        System.out.println(myTriangle1.x + myTriangle2.z + myTriangle3.c / 2); //Площадь, Это по формуле Герона


        Rectangle myRectangle = new Rectangle();
        myRectangle.x = 5;
        myRectangle.y = 9;
        System.out.println(myRectangle.x * myRectangle.y);
        Rectangle myRectangle1 =new Rectangle();
        myRectangle1.x = 10;
        myRectangle1.y = 14;
        System.out.println(myRectangle1.x * myRectangle1.y);

        Average myAverage = new Average();
        myAverage.a = 5;
        myAverage.b = 6;
        myAverage.c = 7;
        System.out.println(myAverage.findTheSecondNumber());

        Movie myMovie1 = new Movie();
        myMovie1.title = "";
        myMovie1.studio = "";
        myMovie1.rating = "Pg";
        System.out.println(myMovie1);

        Movie myMovie2 = new Movie();
        myMovie2.title = "Фокус";
        myMovie2.studio = "RatPac-Dune Entertainment";
        myMovie2.rating = "R";
        System.out.println(myMovie2);

        Movie myMovie3 = new Movie();
        myMovie3.title = "Главный герой";
        myMovie3.studio = "20th Century Studios";
        System.out.println(myMovie3);
    }
}
