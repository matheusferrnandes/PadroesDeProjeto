package br.com.adapter;

import java.io.File;

public class Demo {

    public void main(String []args){

        String caminhofile = "/temp/teste.txt";

        Dropbox dropbox = new Dropbox();
        Persistencia persistencia = new DropboxAdapter();
        persistencia.gravar(new File(caminhofile));

    }
}
