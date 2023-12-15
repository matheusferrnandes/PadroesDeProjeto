package br.com.adapter;

import java.io.File;

public interface Persistencia {

    void gravar(File file);
    File ler (String id);
}
