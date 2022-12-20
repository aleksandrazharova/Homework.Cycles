import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcUpBoard() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQR(9802, 10000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcLowerBoard() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSQR(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcUncorrectNumbers() {
        SQRService service = new SQRService();

        int expected = -1;
        int actual = service.calcSQR(300, 3);

        Assertions.assertEquals(expected, actual);
    }
}
