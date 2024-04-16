import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    void moneyTest1() {
        Money moneda = new Money();
        assertEquals(28.37F, moneda.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88F), 0.2);
    }

    @Test
    void MoneyTest2() {
        Money moneda = new Money();
        assertEquals(1165.83F, moneda.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0F), 0.2);
    }

    @Test
    void MoneyTest3() {
        Money moneda = new Money();
        assertEquals(201.21F, moneda.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56F), 0.2);
    }

    @Test
    void moneyTest4() {
        Money moneda = new Money();
        assertEquals(37.51F, moneda.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56F), 0.2);
    }

    @Test
    void moneyTest5() {
        Money moneda = new Money();
        assertEquals(138.49, moneda.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0F), 0.2);
    }

    @Test
    void moneyTest6() {
        Money moneda = new Money();
        assertEquals(722.14F,moneda.change(TipoMoneda.USD, TipoMoneda.GBP, 1000.0F), 0.2);
    }

    @Test
    void moneyTest7() {
        Money moneda = new Money();
        assertEquals(-1F, moneda.change(TipoMoneda.PTS, TipoMoneda.EUR, 100.0F));
    }

    @Test
    void moneyTest8() {
        Money moneda = new Money();
        assertEquals(-1F, moneda.change(TipoMoneda.EUR, TipoMoneda.PTS, 123.3F));
    }

    @Test
    void moneyTest9() {
        Money moneda = new Money();
        assertEquals(-1F, moneda.change(TipoMoneda.USD, TipoMoneda.EUR, -167.34F));
    }
}