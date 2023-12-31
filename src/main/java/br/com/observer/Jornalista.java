package br.com.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Jornalista implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String Titulo, Sumario, Imagem, Texto;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public String getSumario() {
        return Sumario;
    }

    public void setSumario(String sumario) {
        Sumario = sumario;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getImagem() {
        return Imagem;
    }

    public void setImagem(String imagem) {
        Imagem = imagem;
    }

    public void publish(String Titulo) {
        this.Titulo = Titulo;
        this.Sumario = Sumario;
        this.Imagem = Imagem;
        this.Texto = Texto;
        notifyObserver();

    }
    @Override
    public void registerObserver(br.com.observer.Observer observer) {
          observers.add((Observer) observer);
    }

    @Override
    public void removeObserver(br.com.observer.Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public void notifyObservers() {
        observers.forEach(this::accept);
    }


    public String toString(){
         return "Jornalista{" +
                 "observers=" + observers +
                 ", title" + Titulo +
                 ", sumario" + Sumario +
                 ", imagem=" + Imagem +
                 ", texto=" + Texto +
                 "}";
}

    private void accept(Observer observer) {
        observer.update(this);
    }
}