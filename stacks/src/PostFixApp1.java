// Application: Postfix Expression Evaluator
// Post􏰁ix notation is a notation for writing arithmetic expressions in which the operators
// appear after their operands For example:
// 4572+–*
// Post􏰀ix notation is another format for writing arithmetic expressions.
// In this notation, the operator is written after (post) the two operands.
// For example, to indicate addition of 3 and 5:
// 53+
// The rules for evaluating post􏰀ix expressions with multiple operators are much
// simpler than those for evaluating in􏰀ix expressions;
// simply perform the operations from left to right.
// Consider the following post􏰀ix expression containing two operators.
// 62/5+
// We evaluate the expression by scanning from left to right.
// The 􏰀irst item, 6, is an oper- and, so we go on.
// The second item, 2, is also an operand, so again we continue.
// The third item is the division operator.
// We now apply this operator to the two previous operands.
// Which of the two saved operands is the divisor? The one seen most recently.
// We divide 6 by 2 and substitute 3 back into the expression, replacing 6 2 /.
// Our expression now looks like this:
// 35+
// We continue our scanning. The next item is an operand, 5, so we go on.
// The next (and last) item is the operator +.
// We apply this operator to the two previous operands, obtaining a result of 8.

// In next table we could check of diference betwen expresions
// Post􏰀ix Expression    In􏰀ix Equivalent       Result
// 4572+–*              4×(5–(7+2))            –16
// 34+2×7/              ((3+4)×2)/7              2
// 57+62– ×             (5+7)×(6–2)             48

// Our task is to write a program that evaluates post􏰀ix expressions.
// In addition to computing and displaying the value of an expression,
// our program must display error messages when appropriate
// (“not enough operands,” “too many oper- ands,” and “illegal symbol”).

public class PostFixApp1 {
    public static void main(String[] args) {
        StackBaseArrayListGeneric<String> numeros = new StackBaseArrayListGeneric<>();
        // StackBaseArrayListGeneric<String> operandos = new StackBaseArrayListGeneric<>();

        // String datos = "4572+-*"; // -16

        // String datos = "34+2*7/"; // 2
        String datos = "57+62-*";  // 48
        // String datos = "42+351-*+";  // 18
        // String datos = "42351-+*+*";  // not enough operands
        int resultado = 0;
        for (int i = 0, j = datos.length() - 1; i < datos.length(); i++, j--) {


            String checkNumber = String.valueOf(datos.charAt(i));
            // CLASIFICAR NUMEROS
            if (!(checkNumber.equals("-")
                    || checkNumber.equals("+")
                    || checkNumber.equals("*")
                    || checkNumber.equals("/"))) {

                numeros.push(String.valueOf(datos.charAt(i)));
            }

            String checkOperador = String.valueOf(datos.charAt(i));
            // CLASIFICAR OPERANDOS
            if (checkOperador.equals("-")
                    || checkOperador.equals("+")
                    || checkOperador.equals("*")
                    || checkOperador.equals("/")) {
                // System.out.println(checkOperador);

                try {
                    int num2 = Integer.parseInt(numeros.pop());
                    int num1 = Integer.parseInt(numeros.pop());

                    System.out.println("Num1 : " + num2);
                    System.out.println("Num2 : " + num1);
                    if (checkOperador.equals("+")) {
                        resultado = num1 + num2;

                    }
                    else if (checkOperador.equals("-")) {
                        resultado = num1 - num2;

                    }
                    else if (checkOperador.equals("*")) {
                        resultado = num1 * num2;

                    }
                    else if (checkOperador.equals("/")) {
                        resultado = num1 / num2;

                    }
                    String tempStr = String.valueOf(resultado);
                    System.out.println("tempStr int " + resultado);
                    System.out.println("tempStr " + tempStr);
                    numeros.push(tempStr);


                }
                catch (Exception e) {
                    System.out.print("el estack esta vacio");
                    resultado = -1;
                }


            }

        }
        //    end for


        // resultado = -16;
        System.out.println("resultado " + resultado);
    }
}
