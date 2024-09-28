package nivell1.exercise3.com.main;

import nivell1.exercise3.com.modules.Capitals;

public class Main {
    public static void main(String[] args){
        Capitals arr = new Capitals();
        System.out.println("Accedim a la 4a posició de l'array.");
        try{
            System.out.println(arr.getElemByPos(3));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
