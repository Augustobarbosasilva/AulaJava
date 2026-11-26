import automovel.Carro;
public class Auto {
   public static void main(String[] args) {
   Carro carro=new Carro();
   carro.setModelo("Palio");
   carro.setAno(1999);
   System.out.println(carro.getModelo()+ " Ano:"+ carro.getAno());

}


}
