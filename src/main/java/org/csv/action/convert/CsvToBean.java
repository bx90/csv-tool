package org.csv.action.convert;

import com.opencsv.bean.CsvToBeanBuilder;
import org.csv.bean.TestBean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * @author bsun
 */
public class CsvToBean {
    public List<Object> convertCsvToBean(String filePath) throws FileNotFoundException {
        return new CsvToBeanBuilder(new FileReader(filePath))
                .withType(TestBean.class)
                .build()
                .parse();
    }
}
