public class TestaIdade {

    public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
            int idade = 0; 
            
            Idade id = new Idade();
            
            System.out.print("Digite uma data: ");
            String dataNascimento = scan.nextLine();
            //System.out.println(dataNascimento.length());
            idade = id.calcularIdade(dataNascimento);           
            System.out.println(idade);
  
     
    }
    
}

