package egitEclipse;

public class Restaurante {
	private double papas;
    private double chocos;

    public Restaurante(){
        chocos=40;
        papas=15;
    };
    public Restaurante(double numPatatas, double numChocos){
       papas=numPatatas;
       chocos=numChocos;
    }
    public double addChocos(double masChocos){
        return chocos=chocos+ masChocos;
     }
     public double addPapas( double masPapas){
         
        return papas=papas+ masPapas;
     }
     public void setChocos(double numChocos){
         chocos=numChocos;
     }
     public double getChocos(){
         return chocos;
     }
     public void setPapas(double numPatatas){
        papas= numPatatas;
     }
     public double getPapas(){
         return papas;
     }
}
