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
import org.json.simple.JSONObject;

class json {

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", 100);
      obj.put("balance", 1000.21);
      obj.put("is_vip", true);

      System.out.println(obj);
   }
}