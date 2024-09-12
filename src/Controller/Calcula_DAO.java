/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static View.Menu_GUI.abaixo_img1;
import static View.Menu_GUI.alt_txt1;
import static View.Menu_GUI.normal_img;
import static View.Menu_GUI.obesoleve_img1;
import static View.Menu_GUI.obesomorbi_img1;
import static View.Menu_GUI.peso_txt1;
import static View.Menu_GUI.resul_txt;
import static View.Menu_GUI.sobrepeso_img;
import java.text.DecimalFormat;

/**
 *
 * @author Filipe
 */
public class Calcula_DAO {
    
    
    
    public static void imc(){
          DecimalFormat deci = new DecimalFormat("0.00");
        
        double altura = Double.parseDouble(alt_txt1.getText());
        double peso = Double.parseDouble(peso_txt1.getText());
        double res = peso/(altura*altura);
        
        if (res < 18.5){
        alt_txt1.setText("");
        peso_txt1.setText("");
        abaixo_img1.setVisible(true);
        resul_txt.setText(String.valueOf("Abaixo do Peso " + deci.format( res)));
    }else if (res >= 18.5 && res <= 24.9 ){
        alt_txt1.setText("");
        peso_txt1.setText("");
        resul_txt.setText(String.valueOf("Normal: " + deci.format( res)));
        normal_img.setVisible(true);
        abaixo_img1.setVisible(false);
        
    }else if (res >= 25.0 && res <= 29.9){
        alt_txt1.setText("");
        peso_txt1.setText("");
        sobrepeso_img.setVisible(true);
         resul_txt.setText(String.valueOf("SobrePeso: " + deci.format( res)));
    }else if (res >= 30.0 && res <=34.9){
        alt_txt1.setText("");
        peso_txt1.setText("");
       resul_txt.setText(String.valueOf("Obesidade Leve " + deci.format( res)));
        obesoleve_img1.setVisible(true);
    }else if (res >=35 && res <= 39.9 ){
        alt_txt1.setText("");
        peso_txt1.setText("");
        resul_txt.setText(String.valueOf("Obesidade Moderada " + deci.format( res)));
        obesoleve_img1.setVisible(true); 
    }else if (res > 39.9){
        alt_txt1.setText("");
        peso_txt1.setText("");
        resul_txt.setText(String.valueOf("Obesidade Morbida " + deci.format( res)));
        obesomorbi_img1.setVisible(true);
    }
        
    }
    
    public static void limpa(){
        peso_txt1.setText("");
        alt_txt1.setText("");
        resul_txt.setText("");
        normal_img.setVisible(false);
        obesoleve_img1.setVisible(false);
        abaixo_img1.setVisible(false);
        obesomorbi_img1.setVisible(false);
        sobrepeso_img.setVisible(false);
    }
}
