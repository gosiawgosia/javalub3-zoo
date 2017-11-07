package pl.sdacademy.animals.bear;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void bearShouldBeAliveIfHasEatenWithin10Days() {
        Bear bear = new BlackBear(1);
        bear.eat();

        boolean result = bear.isAlive();
        assertTrue(result == true);
    }


    @Test
    void bearShouldNotBeAliveIfItHasNotEatenForMoreThan10Days() {
        Bear bear = new BlackBear(1, new TestClock());
        bear.eat();

        boolean result = bear.isAlive();
        assertFalse(result);
    }

    
}
//piszemy testy przed implementacją wtedy będzie można ją zrefaktorować
//3 poziomy - najwicej piszemy testy jednostkowe - bo są szybsze, szybka informacja zwrotna.
//testy funkcyjne -
//E2E end to end -
//testy integracyjne - badamy interakcje kilku komponentów w kodzie i te które nas obchodzą.
//mock - implementacja która zachowuje ilość wywołań wybranych metod.
// tworzony zwykle przy pomocy róznego rodzaju bibliotek
//Stub - implementacje obiektów, które zwracają zdefiniowane wartości.
//dependency injection - podanie obiektu poprzez konstruktor zamiast wywołanie prosto z kodu.
//niekompilowanie się kodu wlicza się do testowania kodu.
