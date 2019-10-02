package filmesalk;

public class VHS extends Film{
    private int szalaghoszz;
    
    public VHS(String cim, int korhatar, int szalaghossz){
        super(cim, korhatar); 
        this.szalaghoszz = szalaghossz;
    }

    public int getSzalaghoszz() {
        return szalaghoszz;
    }

    public void setSzalaghoszz(int szalaghoszz) {
        this.szalaghoszz = szalaghoszz;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setKorhatar(int korhatar) {
        this.korhatar = korhatar;
    }
    
    @Override
    public String toString() {
        return super.toString()+" VHS szalaghossz: " + this.szalaghoszz;
    }
}
