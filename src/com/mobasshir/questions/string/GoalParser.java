package com.mobasshir.questions.string;

public class GoalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < command.length(); i++) {
        // if (command.charAt(i) == 'G') {
        // sb.append("G");
        // } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
        // sb.append("o");
        // } else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a' &&
        // command.charAt(i+2) == 'l' && command.charAt(i+3) == ')') {
        // sb.append("al");
        // }
        // }
        // System.out.println(sb.toString());
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        System.out.println(command);
    }
}
