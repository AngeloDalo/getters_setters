public class App {
    public static void main(String[] args) throws Exception {
        //nascondiamo attributi di una classe all'esterno mettendoli private diventando accessibili solo tramite dei metodi (getters setters)
        Persona persona = new Persona("Luca", "Rossi");
        //NOO perchè c'è private: System.out.println(persona.nome);
        System.out.println(persona.getNome());
        persona.setNome("Ciro");
        //NOO persona.nome = "ciro"
        System.out.println(persona.getNome());
    }
}
