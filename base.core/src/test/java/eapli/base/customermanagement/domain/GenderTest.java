package eapli.base.customermanagement.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GenderTest {

    private Gender gender1 = new Gender("Male");
    private Gender gender2 = new Gender("Female");
    private Gender gender3 = new Gender("Male");


    @Test
    public void checkGender(){


        Gender gender4 = new Gender("male");
        Gender gender5 = new Gender("female");
        Gender gender6 = new Gender("other");
        String expectedMessage = "Gender does not exist!";
        String actualMessage = null;
        String actualMessage2 = null;

        try{

            Gender gender = new Gender("AAAA");
        }catch (IllegalArgumentException ex){
            actualMessage = ex.getMessage();
        }

        try{

            Gender gender = new Gender("Male");
        }catch (IllegalArgumentException ex){
            actualMessage2 = ex.getMessage();
        }



        assertEquals(expectedMessage,actualMessage);
        assertNotEquals(expectedMessage,actualMessage2);
        assertEquals(gender4.gender(),"Male");
        assertEquals(gender5.gender(),"Female");
        assertEquals(gender6.gender(),"Other");
    }

    @Test
    public void compareTo(){

        assertEquals(0, gender1.compareTo(gender3));
        assertEquals(-1, gender1.compareTo(gender2));
    }


    @Test
    public void genderTest(){

        assertEquals(gender1.gender(),"Male");
        assertEquals(gender2.gender(),"Female");
    }
}
