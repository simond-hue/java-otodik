package negyedik;

public enum Bolygok {
    MERKUR(3.30e+23,2.440e+6),
    VENUSZ(4.87e+24,6.052e+6),
    FOLD(5.97e+24,6.378e+6),
    MARS(6.42e+23,3.397e+6),
    JUPITER(1.90e+27,7.1492e+7),
    SZATURNUSZ(5.68e+26,2.5559e+7),
    URANUSZ(8.68e+25,6.0268e+7),
    NEPTUNUSZ(1.02e+26,2.4766e+7),
    PLUTO(5.98e+24,1.37e+6);
    
    private double tomeg;
    private double sugar;
    private final double G = 6.67433e-11;
    
    private Bolygok(double tomeg, double sugar){
        this.tomeg = tomeg;
        this.sugar = sugar;
    }

    public double getTomeg() { return tomeg; }
    public double getSugar() { return sugar; }
    public double getGravitacio() { return this.G*this.tomeg/Math.pow(this.sugar,2); }
    public double getSuly(double tomeg){ return tomeg*this.getGravitacio(); }
}
