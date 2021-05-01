public class tabuada {
    public static void main(String[] args) throws Exception {
        
        for (int i = 1; i <= 10; i ++) {

            if (i % 2 == 0) {
                continue;
            }

            for (int j = 1; j <= 10; j ++) {
                System.out.print(i + " x " + j + " = " + (i*j));
                if (i < 10) {
                    System.out.print(" ");
                } 
                if (j < 10) {
                    System.out.print(" ");
                }
                if (i*j < 10) {
                    System.out.print(" ");
                }
                System.out.print("  ");
                System.out.println((i+1) + " x " + j + " = " + ((i+1)*j));
            }
            System.out.println();
        }
    }
}
