// A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
//
//         Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().
//
//         A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].
//
//         By this logic, we say a sequence of brackets is balanced if the following conditions are met:
//
//         It contains no unmatched brackets.
//         The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
//         Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.
//

// Function Description
//
//         Complete the function isBalanced in the editor below.
//
//         isBalanced has the following parameter(s):
//
//         string s: a string of brackets

// Returns
//
//         string: either YES or NO
//         Input Format
//
//         The first line contains a single integer , the number of strings.
//         Each of the next  lines contains a single string , a sequence of brackets.
// Constraints
//
//         , where  is the length of the sequence.
//         All chracters in the sequences ∈ { {, }, (, ), [, ] }.
//         Output Format
//
//         For each string, return YES or NO.
//
// STDIN           Function
//         -----           --------
//         3               n = 3
//         {[()]}          first s = '{[()]}'
//         {[(])}          second s = '{[(])}'
//         {{[[(())]]}}    third s ='{{[[(())]]}}'
// Sample Output
//
//         YES
//         NO
//         YES
// Explanation
//
//         The string {[()]} meets both criteria for being a balanced string.
//         The string {[(])} is not balanced because the brackets enclosed by the matched pair { and } are not balanced: [(]).
//         The string {{[[(())]]}} meets both criteria for being a balanced string.

import java.util.Stack;

public class BracketBalanced3 {
    boolean prueba = "hola".contains("o");

    private static String flipCloseBracket(String bracket) {
        switch (bracket) {
            case "{":
                return "}";
            case "(":
                return ")";
            case "[":
                return "]";
            default:
                return "";
        }
    }

    public static String isBalanced(String s) {
        // Write your code here
        Stack<String> pila1 = new Stack<String>();
        Stack<String> pila2 = new Stack<String>();

        System.out.println("pila1 : " + pila1.toString());
        System.out.println("pila2 : " + pila2.toString());
        int coincidencias = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("rotando " + i);
            String word1 = String.valueOf(s.charAt(i));
            String recoveryWord;


            if ("{([".contains(word1)) {
                System.out.println("Push word1 : " + word1);
                pila1.push(word1);
            }

            try {
                // if (word1.equals(")") || word1.equals("]") || word1.equals("}")) {
                if (")]}".contains(word1)) {

                    recoveryWord = pila1.pop();
                    System.out.println("verificando a " + word1);
                    System.out.printf("Pop recovery %s %s %n ", recoveryWord, word1);
                    if (recoveryWord.equals(flipCloseBracket(word1))) {
                        System.out.println("Correcto.." + coincidencias);
                        coincidencias++;
                        // return "NO";
                    }

                }
            }
            catch (Exception e) {
                return "NO";
            }


        }
        System.out.println("coincidencias " + coincidencias);
        System.out.println("s.length() / 2 :> " + s.length() / 2);

        if (coincidencias == s.length() / 2) {
            return "YES";
        }

        return "NO";
    }


    public static void main(String[] args) {
        System.out.println("BracketBalanced");

        // String prueba = "{[()]}"; // YES
        // String prueba = "{[(])}"; // NO
        // String prueba = "(())"; // YES
        // String prueba = "{{([])}}"; // YES
        // String prueba = "{{)[](}}"; // NO
        // String prueba = "{(([])[])[]]}"; // NO

        String prueba = "{(([])[])[]}"; // YES

        // String prueba = "{(([])[])[]]}"; // NO


        // String prueba = "{(([])[])[]}[]"; // YES

        System.out.println(prueba.length());

        System.out.println("BALANCEADO...." + BracketBalanced3.isBalanced(prueba));

    }
}
