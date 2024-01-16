/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GAME_PAK_SON;

/**
 *
 * @author User
 */
public class Joke {
    public static void main(String[] args) {
        Joke_Player player = new Joke_Player();
        if (player.random ==0){
            player.joke_1();
        }else if (player.random == 1){
            player.joke_2();
        }else if (player.random == 2){
            player.joke_3();
        }
        
    }
    
}
