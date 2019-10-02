package filmesalk;

public class DVD extends Film {
    private String[] nyelvek;
    
    public DVD(String nev, int korhatar, String[] nyelvek){
        super(nev,korhatar);
        this.nyelvek = nyelvek;
    }

    @Override
    public String toString() {
        String nyelvek = "";
        for(int i = 0; i < this.nyelvek.length; i++){
            nyelvek += this.nyelvek[i] + " ";
        }
        return super.toString() + " DVD " + nyelvek;
    }
}
