package com.shanek.isbntools;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class StockManagementTests {

    ExternalISBNDataService testWebService;
    StockManager stockManager;
    ExternalISBNDataService testDatabaseService;

    @Before
    public void setup() {
        testWebService = mock(ExternalISBNDataService.class);
        stockManager = new StockManager();
        stockManager.setWebService(testWebService);
        testDatabaseService = mock(ExternalISBNDataService.class);
        stockManager.setDatabaseService(testDatabaseService);
    }

    //    @Test
    //    public void testCanGetACorrectLocatorCode() {
    //
    //        ExternalISBNDataService testWebService = new ExternalISBNDataService() {
    //            @Override
    //            public Book lookup(String isbn) {
    //                return new Book(isbn,
    //                    "Of Mice And Men",
    //                    "J. Steinbeck");
    //            }
    //        };
    //
    //        ExternalISBNDataService testDatabaseService = new ExternalISBNDataService() {
    //            @Override
    //            public Book lookup(String isbn) {
    //                return null;
    //            }
    //        };
    //        StockManager stockManager = new StockManager();
    //        stockManager.setWebService(testWebService);
    //        stockManager.setDatabaseService(testDatabaseService);
    //        String isbn = "0140177396"; // Of Mice and Men
    //        // last 4 digits of the isbn, first initial of name, number of words in title
    //        String locatorCode = stockManager.getLocatorCode(isbn);
    //        assertEquals("7396J4",
    //            locatorCode);
    //    }
    @Test
    public void testCanGetACorrectLocatorCode() {

        when(testWebService.lookup(anyString())).thenReturn(new Book("9781885440020",
            "Italian Immigrant Cooking",
            "E. Rigante"));

        when(testDatabaseService.lookup("0140177396")).thenReturn(null);

        String isbn = "9781885440020";
        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("0020E3",
            locatorCode);
    }

    @Test
    public void databaseIsUsedIfDataIsPresent() {

        when(testDatabaseService.lookup("0140177396")).thenReturn(new Book("0140177396",
            "abc",
            "abc"));

        String isbn = "0140177396"; // Of Mice and Men
        String locatorCode = stockManager.getLocatorCode(isbn);

        verify(testDatabaseService,
            times(1)).lookup("0140177396");
        verify(testWebService,
            times(0)).lookup(anyString());
    }

    @Test
    public void webserviceIsUsedIfDataIsNotPresentInDatabase() {

        when(testDatabaseService.lookup("0140177396")).thenReturn(null);
        when(testWebService.lookup("0140177396")).thenReturn(new Book("0140177396",
            "abc",
            "abc"));

        String isbn = "0140177396"; // Of Mice and Men
        String locatorCode = stockManager.getLocatorCode(isbn);

        verify(testDatabaseService,
            times(1)).lookup("0140177396");
        verify(testWebService,
            times(1)).lookup("0140177396");
    }
}
