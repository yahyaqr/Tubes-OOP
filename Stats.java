public class stats{
    private double HP;
    private double att;
    private double def;
    private double spatt;
    private double spdef;
    private double speed;

    public stats(double HP, double att, double def, double spatt, double spdef, double speed){
        this.HP=HP; this.att=att; this.def=def; this.spatt=spatt; this.spdef=spdef; this.speed=speed;
    }
    public double getHP(){
        int d;
        d = (int) java.lang.Math.floor(HP);
        return d;
    }
    public double getAtt() {
        int d;
        d = (int) java.lang.Math.floor(att);
        return d;
    }
    public double getDef() {
        int d;
        d = (int) java.lang.Math.floor(def);
        return d;
    }
    public double getspatt(){
        int d;
        d = (int) java.lang.Math.floor(spatt);
        return d;
    }
    public double getspdef(){
        int d;
        d = (int) java.lang.Math.floor(spdef);
        return d;
    }
    public double getspeed(){
        int d;
        d = (int) java.lang.Math.floor(speed);
        return d;
    }
    public void cetak(){
        System.out.println("HP: "+ getHP());
        System.out.println("Attack: "+getAtt());
        System.out.println("Defense: "+getDef());
        System.out.println("Sp.Atk: "+getspatt());
        System.out.println("Sp.Def: "+getspdef());
        System.out.println("Speed: "+getspeed());
    }
}