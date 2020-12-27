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
     public int calculaComensales(){
         int numcomensales=0;
         double npapas = papas;
         double nchocos = chocos ;
         while((npapas>=1)&&(nchocos>=0.5)){
           numcomensales=numcomensales+3;
           npapas=npapas-1;
           nchocos=nchocos-0.5;
        }
          return numcomensales; 
      }
}
