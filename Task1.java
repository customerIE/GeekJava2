import java.util.Scanner;
import java.util.*;
public class Task1
{
	public static void main(String[] args) {
		
		Equation();
	}
	
	public static String GetString(){
	    Scanner str = new Scanner(System.in);
	    String equation;
	    System.out.print("Введите формулу");
	    equation = str.nextLine();
		//str.close();
	    return equation;
	    
	}
	public static void Equation(){
	    Map<String, Integer> states = new HashMap<String, Integer>();
	    
	    states.put("0", 0);
	    Scanner str = new Scanner(System.in);
	    // a + b + c + d + c
	    String equation = GetString();
	    equation = String.format(equation).replace(" ","");
	    String[] st1 = equation.split("\\+");
	    int sum = 0;
	    for (int i = 0; i < st1.length; i++ )
	    {
	        for(Map.Entry<String, Integer> item : states.entrySet()){
	            if(item.getKey() != st1[i]){
	                states.put(st1[i], str.nextInt());
	                break;
	            }
	        }
	    }
		str.close();
	    for(Map.Entry<String, Integer> item : states.entrySet()){
	        sum += item.getValue();
	    }
	    System.out.print(sum); 
	}	
}
