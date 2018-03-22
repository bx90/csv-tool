package org.csv.bean;

import com.opencsv.bean.CsvBindByName;

/**
 * @author bsun
 */
public class TestBean {
    @CsvBindByName(column = "A (a)", required = true)
    private String a;
    @CsvBindByName(column = "B", required = true)
    private String b;
    @CsvBindByName(column = "C", required = true)
    private String c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
