package br.com.first_code.model;

import java.util.Objects;
import java.util.Scanner;

public class Carro {

    private String modelo;
    private String  marca;
    private String placa;
    private Integer ano_fabrica;
    private Integer RENAVAN;
    private double tabela_fipe;

    public Carro() {
    }

    public Carro(String modelo, String marca, String placa, Integer ano_fabrica, Integer RENAVAN, double tabela_fipe) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano_fabrica = ano_fabrica;
        this.RENAVAN = RENAVAN;
        this.tabela_fipe = tabela_fipe;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAno_fabrica() {
        return ano_fabrica;
    }

    public void setAno_fabrica(Integer ano_fabrica) {
        this.ano_fabrica = ano_fabrica;
    }

    public Integer getRENAVAN() {
        return RENAVAN;
    }

    public void setRENAVAN(Integer RENAVAN) {
        this.RENAVAN = RENAVAN;
    }

    public double getTabela_fipe() {
        return tabela_fipe;
    }

    public void setTabela_fipe(double tabela_fipe) {
        this.tabela_fipe = tabela_fipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Double.compare(carro.tabela_fipe, tabela_fipe) == 0 && modelo.equals(carro.modelo) && marca.equals(carro.marca) && placa.equals(carro.placa) && ano_fabrica.equals(carro.ano_fabrica) && RENAVAN.equals(carro.RENAVAN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, marca, placa, ano_fabrica, RENAVAN, tabela_fipe);
    }

    @Override
    public String toString() {

        Scanner entrada = new Scanner(System.in);
        System.out.printf("Informe o modelo do veículo: ");
        modelo = entrada.next();
        System.out.printf("Informe a marca do veículo: ");
        marca = entrada.next();
        System.out.printf("Informe o ano de fabricação do veículo: ");
        ano_fabrica = entrada.nextInt();
        System.out.printf("Informe o RENAVAN do veículo: ");
        RENAVAN = entrada.nextInt();
        System.out.printf("Informe o valor tabela_fipe do veículo: ");
        tabela_fipe = entrada.nextDouble();


        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", ano_fabricação =" + ano_fabrica +
                ", RENAVAN=" + RENAVAN +
                ", tabela_fipe=" + tabela_fipe +
                '}';
    }
}
