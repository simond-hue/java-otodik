package negyedik;

public class Negyedik {

    public static void main(String[] args) {
       Bolygok[] bolygok = Bolygok.values();
       
       int tanarTomeg = 82;
       
       for(Bolygok bolygocska : bolygok){
           System.out.printf("%s --- %f a súlya\n",
                   bolygocska.name(),
                   bolygocska.getSuly(tanarTomeg));
       }
    }
    
}
