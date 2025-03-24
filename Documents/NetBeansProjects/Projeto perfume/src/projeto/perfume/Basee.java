/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.perfume;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class Basee {
    ArrayList lista = new ArrayList();
    public Basee(){
      
}
  public void salvar(String produto){
        lista.add(produto);
        JOptionPane.showMessageDialog(null, produto+"salvo com sucesso!");  
}
public String listar(){
        String resultado = "Lista de produtos \n";
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {
                resultado += lista.get(i) + "\n";
            }
        } else {
            resultado = "LISTA VAZIA!!";
        }
return resultado;
       
    }

}

