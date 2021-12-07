public class Welcome {
    public static void Delay() {
        try {
            Thread.sleep(600);
        } catch (InterruptedException ex) {
        }

    }
    public static void DelayMsg(){
        Delay();
        System.out.print(Generator.CRed + "L");
        Delay();
        System.out.print(Generator.CRed + "o");
        Delay();
        System.out.print(Generator.CRed + "a");
        Delay();
        System.out.print(Generator.CRed + "d");
        Delay();
        System.out.print(Generator.CRed + "i");
        Delay();
        System.out.print(Generator.CRed + "n");
        Delay();
        System.out.print(Generator.CRed + "g");
        Delay();
        System.out.print(Generator.CBoldRed + ".");
        Delay();
        System.out.print(Generator.CBoldRed + ".");
        Delay();
        System.out.print(Generator.CBoldRed + "." + Generator.ColReset);
    }
}