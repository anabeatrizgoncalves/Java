package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(3, 05, 2021); 
		
		
		Data d2 = new Data(); 
	
		
		String dataFormada1 = d1.obterDataFormatada();
		
		System.out.print(dataFormada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
