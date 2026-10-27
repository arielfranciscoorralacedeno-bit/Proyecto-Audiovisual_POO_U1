public class ReelTikTok extends ContenidoAudiovisual {
    private String usuarioCreador;
    private int cantidadLikes;

    public ReelTikTok(String titulo, int duracionEnMinutos, String genero, String usuarioCreador, int cantidadLikes) {
        super(titulo, duracionEnMinutos, genero);
        this.usuarioCreador = usuarioCreador;
        this.cantidadLikes = cantidadLikes;
    }

    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public int getCantidadLikes() {
        return cantidadLikes;
    }

    public void setCantidadLikes(int cantidadLikes) {
        this.cantidadLikes = cantidadLikes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("--- REEL DE TIKTOK ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Usuario: " + usuarioCreador + " | Me gusta: " + cantidadLikes);
        System.out.println("----------------------");
    }
}