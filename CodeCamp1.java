import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CodeCamp1 {

    // int maxRun(String str)
    // Given a string, returns the length of the largest run in the string. A "run" is a series of zero or more adjacent
    // characters that are the same. So the max run of "xxyyyz" is 3, and the max run of "xyz" is 1.
    static int maxRun(String str) {
        String[] palabra = str.split("");
        Map<String, Integer> states = new HashMap<String, Integer>();

        // states.put("z", 1);
        // states.put("a", 2);
        // states.put("m", 3);
        // states.put("n", 4);

        for (int i = 0; i < palabra.length; i++) {
            System.out.println(palabra[i]);
            if (states.get(palabra[i]) != null) {
                System.out.println(states.get(palabra[i]));
                states.put(palabra[i], states.get(palabra[i]) + 1);
            }
            else {
                states.put(palabra[i], 1);
            }

        }

        Set<String> keys = states.keySet();
        int elMayor = 0;
        for (String key : keys) {
            System.out.println(key + "->" + states.get(key));
            if (states.get(key) > elMayor) {
                elMayor = states.get(key);
            }
        }

        // states.get("z");// returns "California"
        System.out.println(elMayor);
        return 0;
    }

    // String Code
    // String blowup(String str)
    // Returns a version of the original string as follows: each digit 0-9 that appears in the original string is
    // replaced by that many occurrences of the character to the right of the digit. So the string "a3tx2z" yields
    // "attttxzzz", and "12x" yields "2xxx". A digit not followed by a character (i.e. at the end of the string)
    // is replaced by nothing.
    static String blowup(String str) {
        // List<String> words = new ArrayList<String>();

        // words.add("this");
        // words.add("and");
        // words.add("that");
        // words.add(2, "otro");
        // // words is now: {"this", "and", "that"}
        // words.size(); // returns 3
        // for (String str2 : words) {
        //     System.out.println(str2);
        // }
        // String gfg1 = String.join(",", "Four", "Five", "Six", "Seven");

        System.out.println(str);

        String s = str; /// "1Wel2come";
        // String[] expected1 = new String[] { "Welcome", "to", "Baeldung" };
        // String[] expected2 = new String[] { "Welcome", "to Baeldung" };
        String[] palabra = s.split("");
        List<String> resultado = new ArrayList<String>();
        for (int i = 0; i < palabra.length; i++) {
            System.out.println(palabra[i]);
            int charToNumber = palabra[i].charAt(0);

            // VERIFICAR SI ES LETRA
            if (charToNumber >= 97 && charToNumber <= 122) {
                System.out.println("anadir una letra");
                resultado.add(palabra[i]);
            }
            // VERIFICAR SI ES NUMERO
            else if (charToNumber >= 48 && charToNumber <= 57) {
                System.out.println("si es numero");
                // System.out.println(charToNumber);

                int aRepetir = palabra[i + 1].charAt(0);

                int veces = Integer.parseInt(palabra[i]);

                // REPRODUCIR EL NUMERO VECES LA MISMA LETRA
                if (aRepetir >= 97 && aRepetir <= 122) {
                    for (int j = 0; j < veces; j++) {
                        resultado.add(palabra[i + 1]);
                    }
                }
                // AGREGANDO EL NUMERO CONTIGUO SIMPLEMENTE
                else {
                    resultado.add(palabra[i + 1]);
                }

                // if (palabra[i] ) {
                //
                // }
            }
        }
        String[] finalArray = new String[resultado.size()];
        finalArray = resultado.toArray(finalArray);

        String myResult = String.join("", finalArray);

        // System.out.println(Arrays.toString(finalArray));
        System.out.println(myResult);

        System.out.println(resultado.toString());

        return "prueba";
    }


    // boolean stringIntersect(String a, String b, int len)
    // Given 2 strings, consider all the substrings within them of length len. Returns true if there are any such
    // substrings which appear in both strings. Compute this in O(n) time using a HashSet. len will be 1 or more
    static boolean stringIntersect(String a, String b, int len) {

        int numberOfSubstring1 = (a.length() - len) + 1;
        int numberOfSubstring2 = (b.length() - len) + 1;

        Set<String> subWords1 = new HashSet<String>();
        Set<String> subWords2 = new HashSet<String>();

        for (int i = 0; i < numberOfSubstring1; i++) {
            // System.out.println(a.substring(i, i + len));
            subWords1.add(a.substring(i, i + len));

        }

        for (int i = 0; i < numberOfSubstring2; i++) {
            // System.out.println(b.substring(i, i + len));
            subWords2.add(b.substring(i, i + len));
        }

        for (String word1 : subWords1) {
            System.out.println(word1);
            for (String word2 : subWords2) {
                System.out.println(word2);
                if (word1.equals(word2)) {
                    System.out.println("MATCH--- :" + word2);
                    return true;
                }
            }
        }


        return false;
    }


    // int charArea(char ch)
    // Given a char to look for, find the smallest rectangle that contains all the occurrences of that char and
    // return the rectangle's area. If there is only a single occurrence of the char, then the rectangle to enclose it is
    // 1x1 and the area is 1. If the character does not appear, return an area of 0. For example, given the grid…
    // abcd
    // a cb
    // xbca
    // The area for 'a' is 12 (3 x 4) while for 'c' it is 3 (3 x 1). The second row contains a ‘ ‘, but that's still
    // just a regular char.
    // For testing, you can set up a 2-d char[row][col] array literal like this (row 0 is "cax")
    // char[][] grid = new char[][] {
    //  {'c', 'a', 'x'},
    //  {'b', ' ', 'b'},
    //  {' ', ' ', 'a'}
    //  };
    static int charArea(char ch) {
        boolean setStartPoint = true;

        // char[][] grid = new char[][] {
        //         { 'a', 'b', 'c', 'd' },
        //         { 'a', ' ', 'c', 'b' },
        //         { 'x', 'b', 'c', 'a' }
        // };
        char[][] grid = new char[][] {
                { 'f', 'b', 'c', 'd' },
                { 'a', 'a', 'c', 'b' },
                { 'x', 'a', 'c', 'b' }
        };

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;


        for (int j = 0; j < grid.length; j++) {

            for (int i = 0; i < grid[j].length; i++) {
                System.out.print(grid[j][i]);
                if (ch == grid[j][i] && setStartPoint) {
                    System.out.println("inicial");
                    x1 = i;
                    y1 = j;
                    setStartPoint = false;
                }
                if (ch == grid[j][i] && !setStartPoint) {
                    System.out.println("secundario");
                    x2 = i;
                    y2 = j;

                }
                // System.out.print("" + i);
            }
            System.out.println("");
        }

        int area = ((x2 - x1) + 1) * ((y2 - y1) + 1);

        System.out.printf("%d %d %n", x2, y2);
        System.out.println("area" + area);
        return 10;
    }

    static int countPlus() {
        char[][] grid = new char[][] {
                { ' ', 'p', 'c', 'd' },
                { 'a', 'p', 'c', 'b' },
                { 'p', 'p', 'p', 'b' },
                { 'f', 'p', 'c', 'd' },
                { 'a', 'p', 'c', 'b' },
                { 'x', 'a', 'c', 'b' }
        };

        for (int j = 0; j < grid.length; j++) {

            for (int i = 0; i < grid[j].length; i++) {

            }
        }


        return 0;
    }

    public static void main(String[] args) {
        // System.out.println(CodeCamp1.blowup("a3tx2z"));
        // System.out.println(CodeCamp1.blowup("12x"));
        // CodeCamp1.maxRun("xxyyyz");
        // CodeCamp1.maxRun("xyz");
        // CodeCamp1.stringIntersect("computador", "telefono", 3);
        // CodeCamp1.stringIntersect("computador", "trabajador", 4);
        // System.out.println(CodeCamp1.stringIntersect("cargador", "margarita", 4));
        CodeCamp1.charArea('c');
    }
}
