public class Main {
    public static void main(String[] args) {
        System.out.println("Hllo World! I'm learning git");

        System.out.println("Printing pattern!");
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("Printing logic 2 for pattern");
        for(int i=5;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}