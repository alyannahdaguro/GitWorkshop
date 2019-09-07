/* Alyannah Daguro
AP Computer Science A
9-7-19
*/

// CHALENGES 1 & 2 FOR STRING OPERATIONS

public class Challenges1and2{
	public static void main(String args[]){

// CHALLENGE 1
// Switches first half of word with its second half

String word = "Scissors";
String half1 = word.substring(0, (word.length()/2));
String half2 = word.substring((word.length()/2), word.length());
String mix = half2 + half1;
String endword = mix.toLowerCase();

System.out.println(endword);


word = "Picture";
half1 = word.substring(0, (word.length()/2));
half2 = word.substring((word.length()/2), word.length());
mix = half2 + half1;
endword = mix.toLowerCase();

System.out.println(endword);


word = "Computer";
half1 = word.substring(0, (word.length()/2));
half2 = word.substring((word.length()/2), word.length());
mix = half2 + half1;
endword = mix.toLowerCase();

System.out.println(endword);
System.out.println();


// CHALLENGE 2
// Prints main method + "Hello!" to console

System.out.println(
	"public class Challenge2{ \n	public static void main(String args[]){ \n		System.out.println('Hello!'); \n	} \n}"
	);


}
}
