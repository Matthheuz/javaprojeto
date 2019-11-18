
package coffebucks;
import javax.swing.JOptionPane;

public class Coffebucks {

    
    public static void main(String[] args) {
       Menu menu = new Menu();
        try{
       menu.quant = Integer.parseInt(JOptionPane.showInputDialog("Digite sua quantidade"));
       menu.cod = Integer.parseInt(JOptionPane.showInputDialog("Digite seu código(1,2,3,4,5 ou 6)"));
       if(menu.cod==1){
           menu.preco = (float) 2.20;
          
       }
       else if (menu.cod==2){
           menu.preco = (float) 3.30;
          
       }
       else if (menu.cod==3){
           menu.preco = (float) 3.50;
          
       }
       else if (menu.cod==4){
           menu.preco = (float) 2.50;
          
       }
       else if (menu.cod==5){
           menu.preco = (float) 2.80;
          
       }
       else if (menu.cod==6){
           menu.preco = (float) 3.50;
          
       }
       
     
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Número inválido");
            System.err.println("Erro: " + e.getMessage());
        }
    }
    
}
