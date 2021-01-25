/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

/**
 *
 * @author Sunil Shetty
 */
import java.util.regex.*;
public class RegularEx2 {
    public static void main(String[]args){
        Pattern pattern = Pattern.compile("sunil",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome Sunil");
        System.out.println(Pattern.matches("[abc]", "a"));
        if(matcher.find())
        {
            String match = matcher.group();
            System.out.println(match);
        }
    }
    
}
