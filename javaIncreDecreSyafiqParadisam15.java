public class javaIncreDecreSyafiqParadisam15 {

    public static void main(String[] args) {
        postIncreDecre postIncreDecre = new postIncreDecre();
        preIncreDecrement preIncreDecrement = new preIncreDecrement();
        postIncreDecre.printPostIncrement();
        postIncreDecre.printPostDecrement();
        preIncreDecrement.printPreIncrement();
        preIncreDecrement.printPreDecrement();
    }
}

class postIncreDecre {
    int a;
    int changes;

    void printPostIncrement() {
        a = 10;
        changes = a++;
        System.out.println("POST INCREMENT ");
        System.out.println("==============");
        System.out.println("variabel A = " + changes);
        System.out.println("variabel A = " + changes);
        System.out.println("variabel A = " + a);
    }

    void printPostDecrement() {
        a = 10;
        changes = a--;
        System.out.println("POST DECREMENT");
        System.out.println("==============");
        System.out.println("variabel A = " + changes);
        System.out.println("variabel A = " + changes);
        System.out.println("variabel A = " + a);
    }

}

class preIncreDecrement {
    int b;
    int changes;
    void printPreIncrement() {
        b = 10;
        System.out.println("PRE INCREMENT");
        System.out.println("==============");
        System.out.println("VARIABEL B = " + b);
        changes = ++b;
        System.out.println("VARIABEL B = " + changes);
        System.out.println("VARIABEL B = " + changes);
    }
    
    void printPreDecrement() {
        b = 10;        
        System.out.println("PRE DECREMENT");
        System.out.println("==============");
        System.out.println("VARIABEL B = " + b);
        changes = --b;
        System.out.println("VARIABEL B = " + changes);
        System.out.println("VARIABEL B = " + changes);
    }
}