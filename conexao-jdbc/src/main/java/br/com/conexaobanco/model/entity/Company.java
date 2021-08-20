package br.com.conexaobanco.model.entity;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company(String name, Double anuallncome, int numberOfEmployees) {
        super(name, anuallncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public Double tax() {
        if(getNumberOfEmployees() > 10){

            return  getAnuallncome() * 0.14;

        }else{
            return  getAnuallncome() * 0.16;

        }
    }
}
