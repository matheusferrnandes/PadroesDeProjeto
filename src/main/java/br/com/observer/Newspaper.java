package br.com.observer;

public class Newspaper {

    public void update (Subject subject){
        if(subject instanceof Jornalista){
            Jornalista jornalista = (Jornalista) subject;
            System.out.println("Notificando pelo jornal:" + jornalista.toString());

        }
    }


}
