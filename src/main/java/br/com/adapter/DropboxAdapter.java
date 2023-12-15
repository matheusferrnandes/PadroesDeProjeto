package br.com.adapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DropboxAdapter implements Persistencia {

    private Dropbox dropBox;

    public DropboxAdapter(){
        this.dropBox = dropBox;
    }

    @Override
    public void gravar(File file) {
      try{
          byte[]bytes = Files.readAllBytes(file.toPath());
      }catch (IOException e){
          e.printStackTrace();
      }
        dropBox.upload(new DropboxFile(file.getAbsolutePath()));
    }

    public File ler(String id){
        DropboxFile dbFile = dropBox.donwload(id);
        return new File(dbFile.getLocalPath());
    }
}

