package tcp;

import java.io.Serializable;

public class Mensagem implements Serializable {
    
    private String velha1;
    private String velha2;
    private String velha3;
    private String velha4;
    private String velha5;
    private String velha6;
    private String velha7;
    private String velha8;
    private String velha9;
    private String titulo;
    private String conteudo;

    public Mensagem() {
    }

    public Mensagem(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    
    

    public Mensagem(String velha1, String velha2, String velha3, String velha4, String velha5, String velha6, String velha7, String velha8, String velha9) {
        this.velha1 = velha1;
        this.velha2 = velha2;
        this.velha3 = velha3;
        this.velha4 = velha4;
        this.velha5 = velha5;
        this.velha6 = velha6;
        this.velha7 = velha7;
        this.velha8 = velha8;
        this.velha9 = velha9;
        
    }
    
    

    public String getVelha1() {
        return velha1;
    }

    public void setVelha1(String velha1) {
        this.velha1 = velha1;
    }

    public String getVelha2() {
        return velha2;
    }

    public void setVelha2(String velha2) {
        this.velha2 = velha2;
    }

    public String getVelha3() {
        return velha3;
    }

    public void setVelha3(String velha3) {
        this.velha3 = velha3;
    }

    public String getVelha4() {
        return velha4;
    }

    public void setVelha4(String velha4) {
        this.velha4 = velha4;
    }

    public String getVelha5() {
        return velha5;
    }

    public void setVelha5(String velha5) {
        this.velha5 = velha5;
    }

    public String getVelha6() {
        return velha6;
    }

    public void setVelha6(String velha6) {
        this.velha6 = velha6;
    }

    public String getVelha7() {
        return velha7;
    }

    public void setVelha7(String velha7) {
        this.velha7 = velha7;
    }

    public String getVelha8() {
        return velha8;
    }

    public void setVelha8(String velha8) {
        this.velha8 = velha8;
    }

    public String getVelha9() {
        return velha9;
    }

    public void setVelha9(String velha9) {
        this.velha9 = velha9;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

   
    
}
