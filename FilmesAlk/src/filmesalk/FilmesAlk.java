package filmesalk;

public class FilmesAlk {

    public VHS LeghosszabbVHS(Film[] filmek){
        int leghosszabb = 0;
        for(int i = 0; i < filmek.length; i++){
            
        }
    }
    
    public static void main(String[] args) {
        Film[] filmek = new Film[3];
        filmek[0] = new VHS("akfhjahkah", 18, 12);
        String[] nyelvek = { "magyar", "angol"};
        filmek[1] = new DVD("fhgkahjahkl", 12, nyelvek);
        filmek[2] = new VHS("adfkhadjfhafkljh", 18, 12);
        
        for(int i = 0; i < filmek.length; i++){
            System.out.println(filmek[i]);
        }
    }
    
}
