package day09_javaFaker_testBase;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {



    @Test
    public void test1(){
        Faker faker= new Faker();
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.numerify(\"050-592-44-00\") = " + faker.numerify("050-592-44-00"));
    }
}
