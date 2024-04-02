package com;

public final class Company {

    private final String cname;

    public Company(String cname)
    {
        this.cname=cname;
    }

    public String getCname() {
        return cname;
    }

    public static void main(String[] args) {
        Company company=new Company("BNT");

        System.out.println(company.getCname());

    }
}
