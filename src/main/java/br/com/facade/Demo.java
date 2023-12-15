package br.com.facade;

public class Demo {


    public void main (String []args){

        IApartamentoService service = new ApartamentoService();
        service.alugarApartamento();


    }



}
