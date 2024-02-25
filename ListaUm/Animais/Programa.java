package Animais;

public class Programa {
    public static void main(String[] args) {
        String[] tipos = {"doméstico", "selvagem"};
        String[] habitats = {"terrestre", "aquático", "aéreo"};

        Cachorro cachorro = new Cachorro(1, tipos[0], habitats[0], "Rex", "Labrador", 3);

        
        System.out.println("Dados do cachorro:");
        System.out.println("ID: " + cachorro.getId());
        System.out.println("Tipo: " + cachorro.getTipo());
        System.out.println("Habitat: " + cachorro.getHabitat());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade());
    }
}
