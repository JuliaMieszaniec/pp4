package pl.jmieszaniec.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAllowsAsssignCreditLimit(){
        //arrange
        CreditCard card = new CreditCard();
        //act
        card.assignCredit(BigDecimal.valueOf(1000));
        //assert
        assertEquals(
                BigDecimal.valueOf(1000),
                card.getBalance());

    }
    @Test
    void itDenyCreditLimitBelowThreshold(){
        CreditCard card = new CreditCard();
        try{
            card.assignCredit(BigDecimal.valueOf(50));
            faiil("Exception should be raised");
        } catch (CreditBelowThresholdException e){
            assertTrue(true);
        }
    }
}
