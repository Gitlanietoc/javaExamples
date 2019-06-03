/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamples;

/**
 *
 * @author lanietoc
 */
public class sampleUse {   
   static public void main(String args[]) {
      Logger myLogger = new Logger();
      myLogger.setFormat("Hola");
      System.out.println(myLogger.getFormat());
   }
}
