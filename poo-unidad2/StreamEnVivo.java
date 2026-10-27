public class StreamEnVivo extends ContenidoAudiovisual {
    private String plataforma;
    private String streamer;

    public StreamEnVivo(String titulo, int duracionEnMinutos, String genero, String plataforma, String streamer) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.streamer = streamer;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getStreamer() {
        return streamer;
    }

    public void setStreamer(String streamer) {
        this.streamer = streamer;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- STREAM EN VIVO ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Plataforma: " + plataforma + " | Creador/Streamer: " + streamer);
        System.out.println("----------------------");
    }
}
