public class Documental extends ContenidoAudiovisual {
    private Investigador investigador; // Relación con la clase Investigador

    public Documental(String titulo, int duracionEnMinutos, String genero, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.investigador = investigador;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- DOCUMENTAL ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        if (investigador != null) {
            investigador.mostrarDetalles();
        }
        System.out.println("------------------");
    }
}
