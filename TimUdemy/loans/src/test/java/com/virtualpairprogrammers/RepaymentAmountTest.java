package com.virtualpairprogrammers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;
import org.mockito.Spy;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class RepaymentAmountTest {

    @Spy
    LoanApplication loanApplication;

    LoanCalculatorController controller;

    @Before
    public void setup() {
        loanApplication = spy (new LoanApplication());
        controller = new LoanCalculatorController();

        LoanRepository repos = mock(LoanRepository.class);
        JavaMailSender mailSender = mock(JavaMailSender.class);
        RestTemplate rest = mock(RestTemplate.class);

        controller.setData(repos);
        controller.setMailSender(mailSender);
        controller.setRestTemplate(rest);
    }

    @Test
    public void testOneYearLoanWholeNumber() {

        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(12);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();
        // TODO set interest rate to 10%

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(110), loanApplication.getRepayment());
    }

    @Test
    public void testTwoYearLoanWholeNumber() {

        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(24);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(60), loanApplication.getRepayment());
    }

    @Test
    public void testFiveYearLoanRounding() {

        loanApplication.setPrincipal(5000);
        loanApplication.setTermInMonths(60);
        doReturn(new BigDecimal(6.5)).when(loanApplication).getInterestRate();

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(111), loanApplication.getRepayment());
    }
}
