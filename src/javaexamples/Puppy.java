/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
  Use of Objects
*/
package javaexamples;

/**
 *
 * @author LNCORTES
 */
public class Puppy {
   static int puppyNum = 0; 
   
   int puppyAge;

   public Puppy(String name) {
      // This constructor has one parameter, name.
      puppyNum++;
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) {
      puppyAge = age;
   }

   public int getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }

   public static void main(String []args) {
      /* Object creation */
      Puppy myPuppy = new Puppy( "tommy" );

      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age */
      myPuppy.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge );
      
      Puppy myOtherPuppy = new Puppy("Bonny");
      System.out.print("puppyNum: ");
      System.out.println(String.valueOf(puppyNum));
      
      Puppy myAntherPuppy = new Puppy("Asha");
      System.out.print("puppyNum: ");
      System.out.println(String.valueOf(puppyNum));
   }
}