package org.csv.action.convert;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.testng.Assert.*;

/**
 * @author bsun
 */
public class CsvToBeanTest {
    private final static String FILE_PATH = "src/main/resources/test.csv";
    @Test
    public void convertCsvToBeanTest() throws FileNotFoundException {
        CsvToBean c = new CsvToBean();
        List<Object> objectList = c.convertCsvToBean(FILE_PATH);
        for (Object o : objectList) {
            System.out.println(o);
        }
    }

}