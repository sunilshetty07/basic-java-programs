/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

/**
 *
 * @author sunil shetty
 */
//A lambda expression is a short block of code which takes in parameters and returns a value.
//syntax: parameter -> expression
/*
for more than one parameter
(parameter1, parameter2) -> expression
*/
/*
Expressions are limited. They have to immediately return a value, and 
they cannot contain variables, assignments or statements such as if or for.
*/

import java.util.*;
public class LambdaExpression {
    public static void main(String[]args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n)-> {System.out.println(n);});
    }    
}
