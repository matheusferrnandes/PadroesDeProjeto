package br.com.facade;

public class ApartamentoService implements IApartamentoService{

    public void procurarPorEnd(){}

    public void procurarPorPreço(){}

    public void procurarPorContato(){}

  public void alugarApartaento(){
    procurarPorContato();
    procurarPorEnd();
    procurarPorPreço();
}
}