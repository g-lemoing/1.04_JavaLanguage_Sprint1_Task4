package nivell2.exercise2.com;

public class ObjCompare {
    public ObjCompare(){
    }
    public static boolean compReference(ObjCompare obj1, ObjCompare obj2){
        return obj1 == obj2;
    }

    public static void main(String[] args){
        ObjCompare obj1 = new ObjCompare();
        ObjCompare obj2 = new ObjCompare();
        System.out.println("Si comparem un objecte vs. ell mateix, tenen la mateixa referència? " + compReference(obj1, obj1));
        System.out.println("Si comparem un objecte vs. un altre, tenen la mateixa referència? " + compReference(obj1, obj2));

    }
}
