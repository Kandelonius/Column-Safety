package com.virtualpairprogrammers;

import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Spy;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RepaymentAmountTest {

    @Spy
    LoanApplication loanApplication;

    @Test
    public void testOneYearLoanWholeNumber() {
        loanApplication = spy (new LoanApplication());
        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(12);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();
        // TODO set interest rate to 10%

        LoanCalculatorController controller = new LoanCalculatorController();
        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(110), loanApplication.getRepayment());
    }
}
