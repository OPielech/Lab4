import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    private SimpleCalculator sc;

    @BeforeAll
    static void init(){
        System.out.println("Zaczynamy testy");
    }

    @BeforeEach
    void setup() {
        System.out.println("Zaraz uruchamiamy kolejny test ...");
    }

    @Test
    @DisplayName("Test dodawania")
    void add(){
        sc=new SimpleCalculator();
        assertEquals(3,sc.add(2,1));
    }

    @Test
    @DisplayName("Test mnożenia")
    void multiply(){
        sc=new SimpleCalculator();
        assertEquals(2,sc.multiply(2,1));
    }

    @Test
    @DisplayName("Test dzielenia")
    void divide(){
        sc=new SimpleCalculator();
        assertEquals(4,sc.divide(8,2));
    }

    @Test
    @DisplayName("Test dzielenia z wyjatkiem")
    void divide2(){
        sc=new SimpleCalculator();
        assertThrows(ArithmeticException.class,()->sc.divide(4,0));
    }

    @Test
    @DisplayName(" Test z pustym obiektem")
    void isNull(){
        sc=null;
        assertNull(sc,"Obiekt nie jest pusty");
    }

    @Test
    @DisplayName("Test porównania obiektów")
    void compareObject(){
        sc=new SimpleCalculator();
        SimpleCalculator sc2=new SimpleCalculator();
        assertNotSame(sc,sc2,"Obiekty są takie same");
    }

    @Test
    @DisplayName("Test na prawde")
    void isTrue(){
        sc=new SimpleCalculator();
        assertTrue(sc instanceof SimpleCalculator);
    }

    @AfterEach
    void teardown(){
        System.out.println("Koniec testu");
    }

    @AfterAll
    static void teardownAll(){
        System.out.println("Koniec testow");
    }

}//end of class
