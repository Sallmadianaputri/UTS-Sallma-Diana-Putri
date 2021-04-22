/*
 * sallma diana putri 11200930000012
 */
package UTSMatematika;


public class MatematikaCanggih {
    

    int hasil;
    double hasilD;

    void pertambahan (int a, int b,int c){
        hasil = a + b + c;
        System.out.println("(Pemjumlahan) " + a +" + "+ b +" + "+ c +" = " + getHasil() );
    }
    void perkalian (int a, int b, int c){
        hasil = a * b * c;
        System.out.println("(Perkalian) " + a +" * "+ b +" * "+ c + " = " + getHasil() );
    }

    int getHasil() {
        return hasil;
    }

    void modulus(double a, double b){
        hasilD = a % b;
        System.out.println("(Modulus) " + a +" % "+ b +" = " + getHasilD() );
    }
    double getHasilD() {
        return hasilD;
}
}