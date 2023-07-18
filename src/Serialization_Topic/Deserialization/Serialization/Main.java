package Serialization_Topic.Deserialization.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        try{
            Student student1 = new Student("Yesh","yesh@gmail.com",22,"Bangalore");

            FileOutputStream FOS = new FileOutputStream("ob.txt");

            ObjectOutputStream OOS = new ObjectOutputStream(FOS);

            OOS.writeObject(student1);

            OOS.close();
            FOS.close();

            System.out.println("Created");


        }catch (Exception ec){
            System.out.println(ec);
        }

    }
}