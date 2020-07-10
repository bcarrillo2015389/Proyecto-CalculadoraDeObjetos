/*
Programador:
    Brian Anthony Carrillo Monzón
Creación:
    24 de abril de 2019

Modificaciones:
    27 de abril:
        Creación de instrucciones en botones de MasMenos, RaizCuadrado, XAlCuadrado, Punto
        con sus respectivas validaciones
    28 de abril:
        Creación de instrucciones en botones C, CE, Porcentaje, PartidoX
        con sus respectivas validaciones
 */
package org.briancarrillo.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {
    float dato1, dato2, resultado;
    boolean punto=false;
    boolean estado=false;
    boolean uso=false;
    int op=0;
    
    
    @FXML Button btnMasMenos;
    @FXML Button btnCero;
    @FXML Button btnPunto;
    @FXML Button btnIgual;
    @FXML Button btnUno;
    @FXML Button btnDos;
    @FXML Button btnTres;
    @FXML Button btnMas;
    @FXML Button btnCuatro;
    @FXML Button btnCinco;
    @FXML Button btnSeis;
    @FXML Button btnMenos;
    @FXML Button btnSiete;
    @FXML Button btnOcho;
    @FXML Button btnNueve;
    @FXML Button btnMultiplicacion;
    @FXML Button btnCE;
    @FXML Button btnC;
    @FXML Button btnUnoPartidoX;
    @FXML Button btnDivision;
    @FXML Button btnPorcentaje;
    @FXML Button btnRaizCuadrada;
    @FXML Button btnXCuadrado;
    @FXML TextField txtValores;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        if(event.getSource()==btnUno){
            if(txtValores.getText().equals("MathError")){
                
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            txtValores.setText(txtValores.getText()+"1");
        
        }else if(event.getSource()==btnDos){
            if(txtValores.getText().equals("MathError")){
                    
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"2");
        
        }else if(event.getSource()==btnTres){
            if(txtValores.getText().equals("MathError")){
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"3");
        
        }else if(event.getSource()==btnCuatro){
            if(txtValores.getText().equals("MathError")){
                
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
           if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"4");
        
        }else if(event.getSource()==btnCinco){
            if(txtValores.getText().equals("MathError")){
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"5");
       
        }else if(event.getSource()==btnSeis){
            if(txtValores.getText().equals("MathError")){
                
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"6");
        
        }else if(event.getSource()==btnSiete){
            if(txtValores.getText().equals("MathError")){
                
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"7");
        
        }else if(event.getSource()==btnOcho){
            if(txtValores.getText().equals("MathError")){
                
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"8");
        
        }else if(event.getSource()==btnNueve){
            if(txtValores.getText().equals("MathError")){
                
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"9");
        
        }else if(event.getSource()==btnCero){
            if(txtValores.getText().equals("MathError")){
                
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(estado==true && uso==true){
                txtValores.setText("");
                punto=false;
                dato1=0;
                uso=false;
            }
            
            
            txtValores.setText(txtValores.getText()+"0");
        
        }else if(event.getSource()==btnMas){
            
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                if(estado)
                    dato1=0;
                   
                dato1=dato1+Float.parseFloat(txtValores.getText());
                txtValores.setText("");
                op=1;
                punto=false;
                estado=false;
            }
            
        }else if(event.getSource()==btnMenos){
            
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                if(estado)
                    dato1=0;
                
                if(dato1==0)
                    dato1=Float.parseFloat(txtValores.getText());
                
                else 
                    dato1=dato1-Float.parseFloat(txtValores.getText());
                
                txtValores.setText("");
                op=2;
                punto=false;
                estado=false;
            }
            
        }else if(event.getSource()==btnMultiplicacion){
            
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                dato1=Float.parseFloat(txtValores.getText());
                txtValores.setText("");
                op=3;
                punto=false;
                estado=false;
            }
            
        }else if(event.getSource()==btnDivision){
            
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                dato1=Float.parseFloat(txtValores.getText());
                txtValores.setText("");
                op=4;
                punto=false;
                estado=false;
            }
            
        }else if(event.getSource()==btnPunto){
            
            if(!txtValores.getText().equals("MathError")){
                
                if(estado==true && uso==true){
                    txtValores.setText("");
                    punto=false;
                    dato1=0;
                    uso=false;
                }
                
                if(punto==false && !txtValores.getText().equals("")){
                txtValores.setText(txtValores.getText()+".");
                
                punto=true;
                
                }else if(punto==false && txtValores.getText().equals("")){
                txtValores.setText("0.");
                punto=true;
                }
            }
        
        }else if(event.getSource()==btnCE){
            
            if(txtValores.getText().equals("MathError")){
                dato1=0;
                dato2=0;
                op=0;
                uso=false;
                estado=false;
            }
            
            txtValores.setText("");
            punto=false;
            
            if(estado)
                dato1=0;
           
            
        }else if(event.getSource()==btnC){
            txtValores.setText("");
            dato1=0;
            dato2=0;
            punto=false;
            op=0;
            uso=false;
            
            if(estado)
                estado=false;
            
        }else if(event.getSource()==btnUnoPartidoX){
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                
                if(Float.parseFloat(txtValores.getText())!=0){
                    txtValores.setText(String.valueOf(1/(Float.parseFloat(txtValores.getText()))));
                    punto=true;
            
                }else{
                    txtValores.setText("MathError");
                    punto=true;
                }
            }
        }else if(event.getSource()==btnMasMenos){
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                
                if(Float.parseFloat(txtValores.getText())!=0)
                txtValores.setText(String.valueOf(-1*(Float.parseFloat(txtValores.getText()))));
                else{
                 txtValores.setText("MathError");
                 punto=true;
                }
            }
            
        }else if(event.getSource()==btnXCuadrado){
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                
                    txtValores.setText(String.valueOf(Math.pow(Float.parseFloat(txtValores.getText()),2)));
                    punto=true;
            }
            
        }else if(event.getSource()==btnRaizCuadrada){
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                
                if(Float.parseFloat(txtValores.getText())>=0){
                   txtValores.setText(String.valueOf(Math.sqrt(Float.parseFloat(txtValores.getText())))); 
                   punto=true;
                }else{
                    txtValores.setText("MathError");
                    punto=true; 
                }
            }
            
        }else if(event.getSource()==btnPorcentaje){
             if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                 
                    txtValores.setText(String.valueOf(Float.parseFloat(txtValores.getText())/100));
                    punto=true;
             }
                    
        }else if(event.getSource()==btnIgual){
            
            if(txtValores.getText().equals("MathError")){
                
                txtValores.setText("");
                punto=false;
                op=0;
            }
            
            if(!txtValores.getText().equals("MathError") && !txtValores.getText().equals("")){
                
                if(estado==false)
                    dato2=Float.parseFloat(txtValores.getText());
                else
                    dato1=Float.parseFloat(txtValores.getText());
            
            switch(op){
                case 1:
                    txtValores.setText("");
                
                    resultado=dato1+dato2;
                    txtValores.setText(String.valueOf(resultado));
                    estado=true;
                    punto=true;
                    uso=true;
                break;
                
                case 2:
                    txtValores.setText("");
                
                    resultado=dato1-dato2;
                    txtValores.setText(String.valueOf(resultado));
                    estado=true;
                    punto=true;
                    uso=true;
                break;
                
                case 3:
                    txtValores.setText("");
                
                    resultado=dato1*dato2;
                    txtValores.setText(String.valueOf(resultado));
                    estado=true;
                    punto=true;
                    uso=true;
                break;
                
                case 4:
                txtValores.setText("");
                
                    if(dato2!=0){
                        resultado=dato1/dato2;
                        txtValores.setText(String.valueOf(resultado));
                        estado=true;
                        punto=true;
                    }else{
                        txtValores.setText("MathError");
                        punto=true;
                    }
                    
                default:
                    txtValores.setText(String.valueOf(Float.parseFloat(txtValores.getText())));
                
            }
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
