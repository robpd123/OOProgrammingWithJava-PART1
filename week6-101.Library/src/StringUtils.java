/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
public class StringUtils {

    public static boolean included(String word, String searched) {

        word = word.toUpperCase();
        searched = searched.toUpperCase();

        word = word.trim();
        searched = searched.trim();

        if (word.contains(searched)) {
           // System.out.println("word: " + word +" not foundin ");
            return true;
        }
        return false;
    }

}
