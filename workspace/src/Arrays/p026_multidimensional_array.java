public class p026_multidimensional_array {
    public static void main(String[] args) {
        int iarr[][] = new int[2][3];
        iarr[0][0]=1;
        iarr[0][1]=20;
        iarr[0][1]=3;

        iarr[1][0]=4;
        iarr[1][1]=5;
        iarr[1][2]=6;

        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.println(iarr[i][j]);
                //System.out.println(" ");
            }
        }
    }
}
