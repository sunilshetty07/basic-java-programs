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
/*searching data in a text

*/
import java.util.regex.*;
public class JavaRegularExpressions {
    public static void main(String[]args){
        //pattern class defines a pattern (to be used in a search)
        //Matcher class used to search for the pattern
        //PatternSyntaxException class: indicates syntax error in a regular expression pattern
        
        Pattern pattern = Pattern.compile("Sunil Shetty", Pattern.CASE_INSENSITIVE);
        /*Pattern.CASE_INSENSITIVE: case letter will be ignored
          Pattern.LITERAL: Special characters in the pattern will not have any special meaning
        and will be treated as ordinary characters when performing a search
          Pattern.UNICODE_CASE ignores the case of letters outside of english alphabet 
        */
        Matcher matcher = pattern.matcher("hello sunil shetty");
        boolean matchfound=matcher.find();
        if(matchfound){
            System.out.println("match found");
        }
        else
            System.out.println("match not found");
        System.out.println("_________________");
        System.out.println("using []");
        Pattern pat=Pattern.compile("[abc]",Pattern.CASE_INSENSITIVE);//search for any one letter from a,b,c
        Matcher match = pat.matcher("aabb");
        boolean found = match.find();
        if(found)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
        System.out.println("_________________");
        System.out.println("using [^]");//find one character not between the brackets
        Pattern pat1=Pattern.compile("[^abc]",Pattern.CASE_INSENSITIVE);//search for any one letter from a,b,c
        Matcher match1 = pat1.matcher("aabb");
        boolean found1 = match1.find();
        if(found1)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        System.out.println("_________________");
        System.out.println("using [0-9]");//for numbers
        Pattern pat2=Pattern.compile("[0-9]",Pattern.CASE_INSENSITIVE);
        Matcher match2 = pat2.matcher("aa0");
        boolean found2 = match2.find();
        if(found2)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
        System.out.println("_________________");
        System.out.println("using |");
        Pattern pat3=Pattern.compile("cat|dog|cow",Pattern.CASE_INSENSITIVE);
        Matcher match3 = pat3.matcher("sunil");
        boolean found3 = match3.find();
        if(found3)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        System.out.println("_________________");
        System.out.println("using .");//find just one instance of any character
        Pattern pat4=Pattern.compile("ab.",Pattern.CASE_INSENSITIVE);
        Matcher match4 = pat4.matcher("ab aaa");
        boolean found4 = match4.find();
        if(found4)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
        System.out.println("_________________");
        System.out.println("using ^");//find a match begining of a string
        Pattern pat5=Pattern.compile("^hello",Pattern.CASE_INSENSITIVE);
        Matcher match5 = pat5.matcher("hello, good morning ");
        boolean found5 = match5.find();
        if(found5)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
        System.out.println("_________________");
        System.out.println("using $");//string match at the end
        Pattern pat6=Pattern.compile("sunil$",Pattern.CASE_INSENSITIVE);
        Matcher match6 = pat6.matcher("my name is Sunil");
        boolean found6 = match6.find();
        if(found6)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
        System.out.println("_________________");
        System.out.println("using \\b");//find match at begining or end of word in a string
        Pattern pat7=Pattern.compile("sunil\\b",Pattern.CASE_INSENSITIVE);//for finding begining //bsunil
        Matcher match7 = pat7.matcher("my name is sunil");
        boolean found7 = match7.find();
        if(found7)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
        System.out.println("_________________");
        System.out.println("using \\d");
        Pattern pat8=Pattern.compile("\\d",Pattern.CASE_INSENSITIVE);//find digit in a given string
        Matcher match8 = pat8.matcher("hi hello 1");
        boolean found8 = match8.find();
        if(found8)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        System.out.println("_________________");
        System.out.println("using \\s");
        Pattern pat9=Pattern.compile("\\s",Pattern.CASE_INSENSITIVE); //find whitespace character in given string
        Matcher match9 = pat9.matcher("sunil ");
        boolean found9 = match9.find();
        if(found9)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        System.out.println("____________________");
        System.out.println("Quantfiers");
        System.out.println("_________________");
        System.out.println("using + qunatifier");
        Pattern pat10=Pattern.compile("sunil+",Pattern.CASE_INSENSITIVE);//Match any string that contain at least one pattern sunil
        Matcher match10 = pat10.matcher("my name is");
        boolean found10 = match10.find();
        if(found10)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
        System.out.println("using * qunatifier");
        Pattern pat11=Pattern.compile("a*",Pattern.CASE_INSENSITIVE);//matches any string that contains zero or one occurance of pattern a
        Matcher match11 = pat11.matcher("sunil a");
        boolean found11 = match11.find();
        if(found11)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        
        System.out.println("using ? qunatifier");
        Pattern pat12=Pattern.compile("[sunil]?",Pattern.CASE_INSENSITIVE); //matches any string that contains zero or one occurance of pattern l 
        Matcher match12 = pat12.matcher("sunil");
        boolean found12 = match12.find();
        if(found12)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        System.out.println("using n{x} qunatifier");
        Pattern pat13=Pattern.compile("sunil sunil",Pattern.CASE_INSENSITIVE);
        Matcher match13 = pat13.matcher("");
        boolean found13 = match13.find();
        if(found13)
        {
            System.out.println("Match found");
        }
        else{
            System.out.println("Match not found");
        }
        System.out.println("? quantifier ....");  
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  

        System.out.println("+ quantifier ....");  
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  

        System.out.println("* quantifier ....");  
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
        
        System.out.println("metacharacters d....");//\\d means digit  
  
        System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
        System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
        System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  

        System.out.println("metacharacters D....");//\\D means non-digit  

        System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
        System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
        System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
        System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  

        System.out.println("metacharacters D with quantifier....");  
        System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times) 
        
        
    }
}
