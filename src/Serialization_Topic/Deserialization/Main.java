package Serialization_Topic.Deserialization;

import Serialization_Topic.Deserialization.Serialization.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {

        try{
            FileInputStream FIS = new FileInputStream("ob.txt");

            ObjectInputStream OIS = new ObjectInputStream(FIS);

            Student student = (Student) OIS.readObject();

            student.displayName();

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}
