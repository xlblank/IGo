package com.ggyd.cmcc.igo.bean;


public class Person {

    private String title;
    private String msisdn;
    private int sum;

    public Person() {

    }

    public Person(String title, String msisdn, int sum) {
        this.title = title;
        this.msisdn = msisdn;
        this.sum = sum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
