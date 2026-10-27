public class Pelicula extends ContenidoAudiovisual {
    private Actor actorPrincipal; // Relación con la clase Actor

    public Pelicula(String titulo, int duracionEnMinutos, String genero, Actor actorPrincipal) {
        super(titulo, duracionEnMinutos, genero);
        this.actorPrincipal = actorPrincipal;
    }

    public Actor getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(Actor actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- PELÍCULA ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        if (actorPrincipal != null) {
            actorPrincipal.mostrarDetalles();
        }
        System.out.println("----------------");
    }
}