package eapli.base.customermanagement.domain;


import eapli.base.customermanagement.domain.Email;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailTest {


    private Email email1 = new Email("ola@gmail.com");
    private Email email2 = new Email("sadas@gmail.com");
    private Email email3 = new Email("ola@gmail.com");

    @Test
    public void checkEmail(){

        Email email;
        String expectedMessage = "Incorrect Email Format!";
        String actualMessage = null;
        String actualMessage2 = null;

        try {
            email = new Email("ASdassdasasad");
        }catch (IllegalArgumentException ex){
            actualMessage = ex.getMessage();
        }


        try {
            email = new Email("ola@gmail.com");
        }catch (IllegalArgumentException ex){
            actualMessage2 = ex.getMessage();
        }

        assertEquals(expectedMessage,actualMessage);
        assertNotEquals(expectedMessage,actualMessage2);

    }

    @Test
    public void compareTo(){


        assertEquals(0, email1.compareTo(email3));
        assertEquals(-1, email1.compareTo(email2));
    }
}
