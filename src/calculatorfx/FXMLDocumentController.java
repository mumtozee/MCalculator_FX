package calculatorfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class FXMLDocumentController implements Initializable
{
    @FXML
    public TextField ekran;
    public boolean next = false;
    public boolean has_dot = false;
    public boolean plus_index = false;
    public boolean minus_index = false;
    public boolean div_index = false;
    public boolean mult_index = false;
    public int number = 0;
    
    public static String output = "0";
    
    public void ClickNumBtn1(ActionEvent e)
    {
        Write("1");
    }
    public void ClickNumBtn2(ActionEvent e)
    {
        Write("2");
    }
    
    public void ClickNumBtn3(ActionEvent e)
    {
        Write("3");
    }
    
    public void ClickNumBtn4(ActionEvent e)
    {
        Write("4");
    }
    
    public void ClickNumBtn5(ActionEvent e)
    {
        Write("5");
    }
    
    public void ClickNumBtn6(ActionEvent e)
    {
        Write("6");
    }
    
    public void ClickNumBtn7(ActionEvent e)
    {
        Write("7");
    }
    
    public void ClickNumBtn8(ActionEvent e)
    {
        Write("8");
    }
    
    public void ClickNumBtn9(ActionEvent e)
    {
        Write("9");
    }
    
    public void ClickNumBtn0(ActionEvent e)
    {
        Write("0");
    }
    
    public void ClickNumBtnDot(ActionEvent e)
    {
        if(next == true)
        {
            output = "0.";
            ekran.setText(output);
        }
        else if(next == false)
        {
            has_dot = false;
            for(int i = 0; i < output.length(); i++)
            {
                if(output.charAt(i) == '.')
                {
                    has_dot = true;
                }
            }
            if(has_dot != true)
            {
                output += ".";
                ekran.setText(output);
            }
        }
    }
    
    public void Write(String n)
    {
        if(output == "-0" || output == "0")
        {
            output = n;
            ekran.setText(output);
        }
        else if((plus_index == true || minus_index == true || div_index == true || mult_index == true) || 
                (plus_index == false && minus_index == false && div_index == false && mult_index == false))
        {
            if(next == true)
            {
                output = n;
                ekran.setText(output);
                next = false;
            }
            else if(next == false)
            {
                output += n;
                ekran.setText(output);
            }
        }
        else
        {
            output += n;
            ekran.setText(output);
        }
    }
    
    public void ClearScreen(ActionEvent e)
    {
        number = 0;
        output = "0";
        ekran.setText(output);
        plus_index = false;
        minus_index = false;
        mult_index = false;
        div_index = false;
        next = false;
    }
    
    public void Reset1(ActionEvent e)
    {
        output = output.substring(0, output.length() - 1);
        
        if(output.length() == 0)
        {
            output = "0";
            ekran.setText(output);
        }
        ekran.setText(output);
    }
    
    public void PlusMinus(ActionEvent e)
    {
        int value = Integer.valueOf(ekran.getText());
        output = String.valueOf(value - (2 * value));
        ekran.setText(output);
    }
    
    public void PlusNums(ActionEvent e)
    {
        if(plus_index == false && minus_index == false && mult_index == false && div_index == false)
        {
            number += Double.valueOf(output);
        }
        else if(plus_index == true)
        {
            number += Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(minus_index == true)
        {
            number -= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(mult_index == true)
        {
            number *= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(div_index == true)
        {
            number /= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        
        plus_index = true;
        minus_index = false;                    
        mult_index = false;
        div_index = false;
        next = true;
    }
    
    public void MinusNums(ActionEvent e)
    {
        if(plus_index == false && minus_index == false && mult_index == false && div_index == false)
        {
            number += Double.valueOf(output);
        }
        else if(plus_index == true)
        {
            number += Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(minus_index == true)
        {
            number -= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(mult_index == true)
        {
            number *= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(div_index == true)
        {
            number /= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        
        plus_index = false;
        minus_index = true;                    
        mult_index = false;
        div_index = false;
        next = true;
    }
    
    public void MultNums(ActionEvent e)
    {
        if(plus_index == false && minus_index == false && mult_index == false && div_index == false)
        {
            number += Double.valueOf(output);
        }
        else if(plus_index == true)
        {
            number += Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(minus_index == true)
        {
            number -= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(mult_index == true)
        {
            number *= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(div_index == true)
        {
            number /= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        
        plus_index = false;
        minus_index = false;                    
        mult_index = true;
        div_index = false;
        next = true;
    }
    
    public void DivNums(ActionEvent e)
    {
        if(plus_index == false && minus_index == false && mult_index == false && div_index == false)
        {
            number += Double.valueOf(output);
        }
        else if(plus_index == true)
        {
            number += Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(minus_index == true)
        {
            number -= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(mult_index == true)
        {
            number *= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        else if(div_index == true)
        {
            number /= Double.valueOf(output);
            output = String.valueOf(number);
            
            if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
            {
                output = output.substring(0, output.length() - 2);
            }                        
            
            ekran.setText(output);
        }
        
        plus_index = false;
        minus_index = false;                    
        mult_index = false;
        div_index = true;
        next = true;
    }
    
    public void Equals(ActionEvent e)
    {
        if(plus_index == true)
        {
            number += Double.valueOf(output);
            output = String.valueOf(number);
        }
        else if(minus_index == true)
        {
            number -= Double.valueOf(output);
            output = String.valueOf(number);
        }
        else if(mult_index == true)
        {
            number *= Double.valueOf(output);
            output = String.valueOf(number);
        }
        else if(div_index == true)
        {
            number /= Double.valueOf(output);
            output = String.valueOf(number);
        }
        else
        {
            
        }
        
        if(output.charAt(output.length() - 1) == '0' && output.charAt(output.length() - 2) == '.')
        {
            output = output.substring(0, output.length() - 2);
        }                        
            
        ekran.setText(output);
        number = 0;
        plus_index = false;
        minus_index = false;                    
        mult_index = false;
        div_index = false;
        next = true;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        
    }
}
