package br.org.serratec;
public class TesteImovel {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Andre");
        
        
        Imovel imovel1 = new Imovel("Casa", 900000., p1);

        System.out.println(imovel1);
    }
}
