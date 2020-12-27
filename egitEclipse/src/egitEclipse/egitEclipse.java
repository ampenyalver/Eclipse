package egitEclipse;

public class egitEclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante a1, a2;
        a1=new Restaurante();
        a2=new Restaurante(10.5,6.5);
        double masPapas=5.5;
        double masChocos=8.5;
        System.out.println("*Prevision del restaurante Almacen: ");
        System.out.println("\t Con "+a2.getPapas()+" kilos de papas.");
        System.out.println("\t Con "+a2.getChocos()+" kilos de chocos.\n");
        System.out.println("\t Podemos atender a "+a2.calculaComensales()+" clientes.\n");
        System.out.println("\t Si compramos "+masPapas+ " kilos de papas.");
        System.out.println("\t Si compramos "+masChocos+ " kilos de chocos.\n");
        System.out.println("\t En el almacen tendremos: "+ (redondeo(a2.addPapas(masPapas),2))+ " kilos de papas.");
        System.out.println("\t En el almacen tendremos: "+ (redondeo(a2.addChocos(masChocos),2))+ " kilos de chocos.\n");
        System.out.println("\t Podemos atender a "+ a2.calculaComensales()+ " clientes.");
       
    }
    public static double redondeo(double numero,int decimales){
     //double redondeo = Math.round(numero*100)/100d; // Ejemplo para dos decimales
            double redondeo = Math.round(numero*(Math.pow(10,decimales)))  /  Math.pow(10,decimales);
       /*10 crece en función del número de decimales deseado*/
            return redondeo;
        } 
}

	
