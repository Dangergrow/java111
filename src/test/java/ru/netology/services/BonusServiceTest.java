package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvFileSource;
public class BonusServiceTest {
    @CsvFileSource(files="src/test/resources/money.csv")
    public void testRegisteredUnderLimit(int count, int money, int income) {
        BonusService service = new BonusService();
        int actual = service.calculate(money, count);

        Assertions.assertEquals(actual, income);
    }
}
