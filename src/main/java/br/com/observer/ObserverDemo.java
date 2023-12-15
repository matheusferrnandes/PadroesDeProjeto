package br.com.observer;

public class ObserverDemo {

    public static void main(String []args){

        Jornalista jor =  new Jornalista();
        jor.registerObserver((Observer) new Newspaper());
        jor.registerObserver((Observer) new TV());

         jor.publish("Titulo" + "Sumario" + "Imagem" + "Texto");

    }

}
