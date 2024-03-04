package pl.jmieszaniec.creditcard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String name= "Julia";
        Double digit= 2.2;

        greet(name);

    }
    static void greet(String name){
        var helloMassage= String.format("Hello %s", name);
    }
}