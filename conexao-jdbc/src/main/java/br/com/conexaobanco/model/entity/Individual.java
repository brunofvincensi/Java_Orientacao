package br.com.conexaobanco.model.entity;

public class Individual extends TaxPayer{

    private Double healthExpenditures;


    public Individual(String name, Double anuallncome, Double healthExpenditures) {
        super(name, anuallncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public Double tax() {

        if(getAnuallncome() >= 20000){
        return (getAnuallncome() * 0.25) - (getHealthExpenditures() * 0.5);}
        else{

            return getAnuallncome() * 0.15;
        }

    }
}
