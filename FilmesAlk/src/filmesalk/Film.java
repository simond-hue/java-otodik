package filmesalk;

public class Film {
    protected String cim;
    protected int korhatar;

    public String getCim() {
        return cim;
    }

    public int getKorhatar() {
        return korhatar;
    }

    public Film(String cim, int korhatar) {
        this.cim = cim;
        this.korhatar = korhatar;
    }
    
    public boolean getAjalnott(int korhatar){
        return this.korhatar<korhatar?true:false;
    }

    @Override
    public String toString() {
        return String.format(this.cim + " --- " + this.korhatar);
    }
    
    
}
