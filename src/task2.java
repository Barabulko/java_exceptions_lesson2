public class task2 {
    public static void main(String[] args){
//        String intArray = "test";
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
