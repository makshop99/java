package com.jtraining.day3.business;

public class Customer
{
    private String CustomerId;
    private String CustomerName;
    private String CustomerFirstname;
    private int CustomerAge;

    public Customer() {
    }

    public Customer(String customerId, String customerName, String customerFirstname, int customerAge, boolean customerFemale) {
        CustomerId = customerId;
        CustomerName = customerName;
        CustomerFirstname = customerFirstname;
        CustomerAge = customerAge;
        CustomerFemale = customerFemale;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerFirstname() {
        return CustomerFirstname;
    }

    public void setCustomerFirstname(String customerFirstname) {
        CustomerFirstname = customerFirstname;
    }

    public int getCustomerAge() {
        return CustomerAge;
    }

    public void setCustomerAge(int customerAge) {
        CustomerAge = customerAge;
    }

    public boolean isCustomerFemale() {
        return CustomerFemale;
    }

    public void setCustomerFemale(boolean customerFemale) {
        CustomerFemale = customerFemale;
    }

    private boolean CustomerFemale;

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerId='" + CustomerId + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerFirstname='" + CustomerFirstname + '\'' +
                ", CustomerAge=" + CustomerAge +
                ", CustomerFemale=" + CustomerFemale +
                '}';
    }
}
