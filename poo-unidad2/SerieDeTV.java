public class SerieDeTV extends ContenidoAudiovisual {
    private Temporada temporadaPrincipal; // Relación con la clase Temporada

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, Temporada temporadaPrincipal) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadaPrincipal = temporadaPrincipal;
    }

    public Temporada getTemporadaPrincipal() {
        return temporadaPrincipal;
    }

    public void setTemporadaPrincipal(Temporada temporadaPrincipal) {
        this.temporadaPrincipal = temporadaPrincipal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- SERIE DE TV ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración promedio por capítulo: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        if (temporadaPrincipal != null) {
            temporadaPrincipal.mostrarDetalles();
        }
        System.out.println("-------------------");
    }
}