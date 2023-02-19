public class dvostrukiNiz {

    public static void main(String[] args) {

        //Niz u nizu i izvući broj 9 iz niza

        int[][] niz2d = {
                {1,2,3},
                {4,5,6},
                {8,9,7}
        };

        System.out.println(niz2d[2][1]);

        for (int i = 0; i < niz2d.length; i++)
        {
            for (int b = 0; b < niz2d[0].length; b++)
            {
                System.out.print( niz2d[i][b] + " ");
            }
            System.out.println();
        }
    }


}
