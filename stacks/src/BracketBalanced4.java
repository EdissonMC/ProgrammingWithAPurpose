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

public class BracketBalanced4 {


    public static String isBalanced(String s) {
        System.out.println("BracketBalanced4");
        // Write your code here
        // Write your code here
        char[] stack = new char[s.length()];
        int z_idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("[{(".contains(String.valueOf(c)))
                stack[z_idx++] = c;
            else if (")}]".contains(String.valueOf(c))) {
                if (z_idx == 0)
                    return "NO";
                char cPop = stack[--z_idx];
                // See ASCII table for '{}[]()'
                System.out.println(String.valueOf(c));
                char temp = (char) (c - 1);
                System.out.println(String.valueOf(temp));
                temp = (char) (temp - 1);
                System.out.println(String.valueOf(temp));

                if ((c - 1 != cPop) && (c - 2 != cPop)) {
                    return "NO";
                }
            }
        }
        return z_idx == 0 ? "YES" : "NO";
    }


    public static void main(String[] args) {
        System.out.println("BracketBalanced");

        // String prueba = "{[()]}"; // YES
        // String prueba = "{[(])}"; // NO
        // String prueba = "(())"; // YES
        // String prueba = "{{([])}}"; // YES
        // String prueba = "{{)[](}}"; // NO
        // String prueba = "{(([])[])[]]}"; // NO

        // String prueba = "{(([])[])[]}"; // YES

        String prueba = "{(([])[])[]]}"; // NO


        // String prueba = "{(([])[])[]}[]"; // YES

        System.out.println(prueba.length());

        System.out.println("BALANCEADO...." + BracketBalanced4.isBalanced(prueba));

    }
}
