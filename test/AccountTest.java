import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    Account account;

    @BeforeEach
    public void setUp(){
        account = new Account();
    }

    @Test
    public void testThatMyAccountBalanceIsZeroWhenNewlyCreated(){
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testThatWhenAccountIsCreatedBalanceIsZero(){
        //Given
//        Account account = new Account();

        //when

        //check
        assertEquals(0, account.getBalance());
    }
    @Test
    public void testThatWhenIDeposit5k_IGetBalanceOf5k(){
        //Given
//        Account account = new Account();

        //when
        account.deposit(5_000);
        //check
        assertEquals(5_000, account.getBalance());
    }

    @Test
    public void testThatWhenIHaveABalanceOf5k_ICanWithdraw2k(){
        //Given
        Account account = new Account();

        //when
        account.deposit(5_000);
        account.withdraw(2_000);
        //check
        assertEquals(3_000, account.getBalance());
    }

    @Test
    public void testThatWhenIHaveABalanceOf3k_ICantWithdraw5k(){
        account.deposit(3_000);

        try {
            account.withdraw(5_000);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testThatICanCreateAPin(){
        account.setPIN(1234);

        account.verifyPIN(1234);
        assertEquals(1234, account.getPIN());
    }

    @Test
    public void testThatWhenIInputAWrongPasswordICantDoAnyTransaction(){
        account.setPIN(1234);

        try{
            account.verifyPIN(2314);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testThat
}