package org.csv.action.convert;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.csv.bean.TestBean;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

/**
 * @author bsun
 */
// TODO: move to test case
public class BeanToCSV {
    private final static String FILE_PATH = "src/main/resources/Output.csv";
    @Test
    public void test() throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

        TestBean i1 = new TestBean();
        TestBean i2 = new TestBean();

        i1.setA("a");
        i1.setB("TEST NAME1");
        i1.setA("b");
        i2.setC("TEST NAME");


        List<TestBean> beans = Arrays.asList(i1, i2);

        Writer writer = new FileWriter(FILE_PATH);
        StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
                                            .withQuotechar('\'')
                                            .withLineEnd(",\n")
                                            .build();
        beanToCsv.write(beans);
        writer.close();
    }
}
