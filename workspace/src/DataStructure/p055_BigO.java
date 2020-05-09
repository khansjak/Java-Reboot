public class p055_BigO {
    public void show(int[] numbers , String[] names){

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); //O[n]
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]); //O[m]
        }
    }
}
