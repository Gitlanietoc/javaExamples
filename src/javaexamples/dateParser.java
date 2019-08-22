/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexamples;

/**
 *
 * @author LNCORTES
 */
import java.util.*;
import java.text.*;

public class dateParser {

    static String[][] casesList = {{"yyyy-MM-dd", "1818-11-11", "yyyy-mm-dd"},
                                   {"dd-MMM-yyyy", "20-Dic-1969", "yyyy-MM-dd"}};

    public static void main(String args[]) {
        int index = 1;    // Prueba de ejemplo 

        String t_txtFormat_in = casesList[index][0];
        String t_input = casesList[index][1];
        String t_txtFormat_out = casesList[index][2];

        SimpleDateFormat t_ft_i = new SimpleDateFormat(t_txtFormat_in);
        SimpleDateFormat t_ft_o = new SimpleDateFormat(t_txtFormat_out);

        System.out.print("Using: " + casesList[0][0] + ", " + t_input + " Parses as ");
        Date t;
        try {
            t = t_ft_i.parse( t_input );
            
            System.out.println( t_ft_o.format( t ) );
        } catch ( ParseException e ) {
            System.out.println("Unparseable using " + t_ft_i);
        }
    }
}
