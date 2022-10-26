package tcp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Servidor extends Thread{
    
    private final int PORTA = 5000;
    private ObjectInputStream fluxo_entrada;
    private ObjectOutputStream fluxo_saida;
    private final JTextArea txt;
    private JTextField txtVelha1;
    private JTextField txtVelha2;
    private JTextField txtVelha3;
    private JTextField txtVelha4;
    private JTextField txtVelha5;
    private JTextField txtVelha6;
    private JTextField txtVelha7;
    private JTextField txtVelha8;
    private JTextField txtVelha9;

    public Servidor(JTextArea txt, JTextField txtVelha1, JTextField txtVelha2, JTextField txtVelha3, JTextField txtVelha4, JTextField txtVelha5, JTextField txtVelha6, JTextField txtVelha7, JTextField txtVelha8, JTextField txtVelha9) {
        this.txt = txt;
        this.txtVelha1 = txtVelha1;
        this.txtVelha2 = txtVelha2;
        this.txtVelha3 = txtVelha3;
        this.txtVelha4 = txtVelha4;
        this.txtVelha5 = txtVelha5;
        this.txtVelha6 = txtVelha6;
        this.txtVelha7 = txtVelha7;
        this.txtVelha8 = txtVelha8;
        this.txtVelha9 = txtVelha9;
    }
    
    
    
    public void enviar(Mensagem msg){
        try {
            fluxo_saida.writeObject(msg);
            fluxo_saida.flush();
        } catch (Exception e) {
            System.err.println("ERRO: " + e.getMessage());
        }
    }
    
    @Override
    public void run(){
        try{
            ServerSocket srv = new ServerSocket (PORTA);
            txt.append("Servidor iniciado\n");
            
            while(true){
                txt.append("Aguardnado conexão.... \n");
                Socket con = srv.accept();
                
                txt.append("Conexão de:" + con.getInetAddress().getHostAddress());
                
                fluxo_saida = new ObjectOutputStream(con.getOutputStream());
                fluxo_entrada = new ObjectInputStream(con.getInputStream());
                
                
                //Enviar mensagem para o CLIENTE
                
                
                Mensagem msg;
                do{
                    msg = (Mensagem)fluxo_entrada.readObject();
                    txtVelha1.setText(msg.getVelha1());
                    txtVelha2.setText(msg.getVelha2());
                    txtVelha3.setText(msg.getVelha3());
                    txtVelha4.setText(msg.getVelha4());
                    txtVelha5.setText(msg.getVelha5());
                    txtVelha6.setText(msg.getVelha6());
                    txtVelha7.setText(msg.getVelha7());
                    txtVelha8.setText(msg.getVelha8());
                    txtVelha9.setText(msg.getVelha9());
                    
                    if(msg.getVelha1().equals("O") && (msg.getVelha2().equals("O")) && (msg.getVelha3().equals("O"))){
                    txt.append("Cliente Venceu\n");
                 
                    
                                       
                }else if(msg.getVelha4().equals("O") && (msg.getVelha5().equals("O")) && (msg.getVelha6().equals("O"))){
                    txt.append("Cliente Venceu\n");
                    msg.setVelha1("");
                     
                }else if(msg.getVelha7().equals("O") && (msg.getVelha8().equals("O")) && (msg.getVelha9().equals("O"))){
                    txt.append("Cliente Venceu\n");
                   
                }else if(msg.getVelha1().equals("O") && (msg.getVelha4().equals("O")) && (msg.getVelha7().equals("O"))){
                    txt.append("Cliente Venceu\n");
                   
                }else if(msg.getVelha2().equals("O") && (msg.getVelha5().equals("O")) && (msg.getVelha8().equals("O"))){
                    txt.append("Cliente Venceu\n");
                    
                }else if(msg.getVelha3().equals("O") && (msg.getVelha6().equals("O")) && (msg.getVelha9().equals("O"))){
                    txt.append("Cliente Venceu\n");
                   
                }else if(msg.getVelha1().equals("O") && (msg.getVelha5().equals("O")) && (msg.getVelha9().equals("O"))){
                    txt.append("Cliente Venceu\n");
                    
                }else if(msg.getVelha3().equals("O") && (msg.getVelha5().equals("O")) && (msg.getVelha7().equals("O"))){
                    txt.append("Cliente Venceu\n"); 
                    
                }else if(msg.getVelha1().equals("X") && (msg.getVelha2().equals("X")) && (msg.getVelha3().equals("X"))){
                    txt.append("Servidor Venceu\n");    
                    
                }else if(msg.getVelha4().equals("X") && (msg.getVelha5().equals("X")) && (msg.getVelha6().equals("X"))){
                    txt.append("Servidor Venceu\n");
                  
                }else if(msg.getVelha7().equals("X") && (msg.getVelha8().equals("X")) && (msg.getVelha9().equals("X"))){
                    txt.append("Servidor Venceu\n");
                 
                }else if(msg.getVelha1().equals("X") && (msg.getVelha4().equals("X")) && (msg.getVelha7().equals("X"))){
                    txt.append("Servidor Venceu\n");
                 
                }else if(msg.getVelha2().equals("X") && (msg.getVelha5().equals("X")) && (msg.getVelha8().equals("X"))){
                    txt.append("Servidor Venceu\n");
                  
                }else if(msg.getVelha3().equals("X") && (msg.getVelha6().equals("X")) && (msg.getVelha9().equals("X"))){
                    txt.append("Servidor Venceu\n");
                  
                }else if(msg.getVelha1().equals("X") && (msg.getVelha5().equals("X")) && (msg.getVelha9().equals("X"))){
                    txt.append("Servidor Venceu\n");
                 
                }else if(msg.getVelha3().equals("X") && (msg.getVelha5().equals("X")) && (msg.getVelha7().equals("X"))){
                    txt.append("Servidor Venceu\n");
                
                }
                    
                }while(!msg.getVelha9().toUpperCase().equals("FIM"));
                fluxo_entrada.close();
                fluxo_saida.close();
                con.close();
                
                
            }
        }catch(Exception e){
            System.err.println("ERRO: " + e.getMessage());
        }
}
    
}