package br.com.conexaobanco.model.entity;

public abstract class TaxPayer {

    private String name;
    private Double anuallncome;

    public TaxPayer(String name, Double anuallncome) {
        this.name = name;
        this.anuallncome = anuallncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnuallncome() {
        return anuallncome;
    }

    public abstract Double tax();


}
