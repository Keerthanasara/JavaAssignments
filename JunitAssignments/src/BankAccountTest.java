import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;








class BankAccountTest {
    BankAccount m1;

    @BeforeEach
    void init() { m1 = new BankAccount();
    }

    @Test
    void test() {
        int actual = m1.withdraw(6000);

    }

}
