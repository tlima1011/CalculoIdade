public class TestaIdade {

    public static void main(String[] args) {
        
           Scanner sc = new Scanner(System.in);

		   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		    try {
			    System.out.print("Informe a Data de Nascimento: ");
                String nascimento = sc.nextLine();
                Date dataNascimento = sdf.parse(nascimento);
                System.out.println("Idade: " + Idade.calcularIdade(dataNascimento) + " anos.");
            } catch (ParseException e) {
                System.out.println("Formato de Data inválida (dd/MM/yyyy): " + e.getMessage());
            }
            sc.close();
   } 
}

