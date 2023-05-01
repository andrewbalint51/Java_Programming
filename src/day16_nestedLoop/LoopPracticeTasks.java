package day16_nestedLoop;

public class LoopPracticeTasks {

    public static void main(String[] args) {



    }






    public static void nestedLoop1(){

        for(int i =1; i<=10;i++ ){

            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
        1. Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
         */

    }

    public static void nestedLoop2(){
        /*
        2. Use a nested loop to print the following output:
        Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
        Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
        Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
        Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
        Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez
         */
        for(char i='A';i<='E';i++ ){

            for(char j='a';j<='z';j++){
                System.out.print(""+i+j+" ");
            }
            System.out.println();
        }
    }

}
