package nivell1.exercise3.com.modules;

public class Capitals {
    final private String[] nameList = {"Paris", "London"};
    public Capitals(){
    }
    public String getElemByPos(int pos) throws ArrayIndexOutOfBoundsException{
        if(pos > nameList.length){
            throw new ArrayIndexOutOfBoundsException("Accés a la posició fora dels limits de l'array.");
        }
        return nameList[pos];
    }
}
