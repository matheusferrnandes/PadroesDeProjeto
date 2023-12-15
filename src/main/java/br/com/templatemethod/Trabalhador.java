package br.com.templatemethod;

public abstract class Trabalhador {

     public void executar(){
       iniciarRotina();
       tomarCafé();
       irParaOTrabalho();
       trabalhando();
       retornandoParaCasa();
       relaxar();
       dormir();
     }
    public abstract void trabalhando();
       public void iniciarRotina(){
         System.out.println("Levantando da Cama");
       }
       public void tomarCafé(){
        System.out.println("Tomando Café");
       }
       public void irParaOTrabalho(){
        System.out.println("Indo para o Trabalho");
    }
       public void retornandoParaCasa(){System.out.println("Retornando para Casa");}
       public void relaxar(){System.out.println("Relaxando");}
       public void dormir(){System.out.println("Dormindo");}
}
