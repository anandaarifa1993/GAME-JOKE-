/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GAME_PAK_SON;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Joke_Player {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    String joke1_jawaban = "puser";
    String joke2_jawaban = "biru don't care";
    String joke3_jawaban = "tunawisma";
    int random = rand.nextInt(3);
    
    void joke_1(){
        System.out.println("Apa yang dekat di mata jauh di hati?");
        System.out.print("jawaban: ");
        String jawaban1 = input.nextLine();
        
        
        jokeIsTrue(joke1_jawaban,jawaban1);
    }
     void joke_2(){
        System.out.println("Warna yang tidak peduli?");
        System.out.print("jawaban: ");
        String jawaban2 = input.nextLine();
        
        
        jokeIsTrue(joke2_jawaban,jawaban2);
     }
     
     void joke_3(){
        System.out.println("Ikan apa yang pengangguran?");
        System.out.print("jawaban: ");
        String jawaban3 = input.nextLine();
        
        
        jokeIsTrue(joke3_jawaban,jawaban3);
      
     }
     
     void jokeIsTrue(String jawabanReal,String jawabanPlayer){
         if(jawabanReal.equals(jawabanPlayer)){
             System.out.println("CIIIEEEE BENEERRRRR!!!!");
         }
          else{
             System.out.println("SSHHEESSHHHH SALAHHH");
          }
     }
}
