package tortoop;

import java.util.ArrayList;
import java.util.List;

public class Tort {
    private int szamlalo;
    private int nevezo;

    public Tort(int szamlalo, int nevezo) {
        this.szamlalo = szamlalo;
        this.nevezo = nevezo;
    }

    public int getSzamlalo() {
        return szamlalo;
    }

    public int getNevezo() {
        return nevezo;
    }
    
    public boolean isEgyszerusithetoE(){
        List<Integer> szamlaloOszthato = new ArrayList();
        for(int i = 2; i <= this.szamlalo/2; i++){
            if(this.szamlalo % i == 0){
                szamlaloOszthato.add(i);
            }
        }
        int i = 0;
        if(szamlaloOszthato.size() == 0){
            return false;
        }
        else{
            while(i < szamlaloOszthato.size()&& nevezo % szamlaloOszthato.get(i) != 0){
                i++;
            }
            if(i == szamlaloOszthato.size()){
                return false;
            }
            else{
                return true;
            }
        }
        
    }
    
    public boolean isEgeszE(){
        return this.szamlalo%this.nevezo==0?true:false;
    }
    
    public Tort szorzas(Tort a){
        return new Tort(this.szamlalo*a.getSzamlalo(), this.nevezo*a.getNevezo());
    }
    
    public Tort osztas(Tort a){
        return new Tort(this.szamlalo*a.getNevezo(), this.nevezo*a.getSzamlalo());
    }
    
    public int lnko(){
        List<Integer> szamlalo = new ArrayList();
        for(int i = 1; i <= this.szamlalo; i++){
            if(this.szamlalo%i == 0){
                szamlalo.add(i);
            }
        }
        List<Integer> nevezo = new ArrayList();
        for(int i = 1; i <= this.nevezo; i++){
            if(this.nevezo % i == 0){
                nevezo.add(i);
            }
        }
        if(this.isEgyszerusithetoE()){
            for(int i = szamlalo.size()-1; i>=0; i--){
                for(int j = nevezo.size()-1; i>=0; i--){
                    if(szamlalo.get(i) == nevezo.get(j)){
                        return szamlalo.get(i);
                    }
                }
            }
            return -1;
        }
        else{
            return -1;
        }
    }
}
