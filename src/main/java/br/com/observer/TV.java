package br.com.observer;

public class TV {

    public void update (Subject subject){
        if(subject instanceof Jornalista){
            Jornalista jornalista = (Jornalista) subject;
            System.out.println("Notificando pela TV:" + jornalista.toString());

        }
    }
}
