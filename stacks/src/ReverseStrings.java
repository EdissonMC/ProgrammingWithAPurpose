//
// Here is the input from a sample run:
//         Enter a line of text > the beginning of a story
//         Enter a line of text > is often different than
//         Enter a line of text > the end of a story

//         Reverse output is:
//         the end of a story
//         is often different than the beginning of a story

//  Sample use of stack. Outputs strings in reverse order of entry

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackInterface1<String> stringStack;
        stringStack = new StackBaseArrayBounded<String>(3);
        String line;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter a line of text > ");
            line = scan.nextLine();
            stringStack.push(line);
        }

        System.out.println("\nReverse is:\n");

        while (!stringStack.isEmpty()) {
            line = stringStack.top();
            stringStack.pop();
            System.out.println(line);
        }

    }
}


