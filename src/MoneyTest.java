import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    void moneyTest1() {
        assertEquals(28.37F, Money.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88F), 0.2);
    }

    @Test
    void MoneyTest2() {
        assertEquals(1165.83F, Money.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0F), 0.2);
    }

    @Test
    void MoneyTest3() {
        assertEquals(201.21F, Money.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56F), 0.2);
    }

    @Test
    void moneyTest4() {
        assertEquals(37.51F, Money.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56F), 0.2);
    }

    @Test
    void moneyTest5() {
        assertEquals(138.49, Money.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0F), 0.2);
    }

    @Test
    void moneyTest6() {
        assertEquals(722.14F,Money.change(TipoMoneda.USD, TipoMoneda.GBP, 1000.0F), 0.2);
    }

    @Test
    void moneyTest7() {
        assertEquals(-1F, Money.change(TipoMoneda.PTS, TipoMoneda.EUR, 100.0F));
    }

    @Test
    void moneyTest8() {
        assertEquals(-1F, Money.change(TipoMoneda.EUR, TipoMoneda.PTS, 123.3F));
    }

    @Test
    void moneyTest9() {
        assertEquals(-1F, Money.change(TipoMoneda.USD, TipoMoneda.EUR, -167.34F));
    }
}