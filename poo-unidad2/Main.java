public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   SISTEMA DE CONTENIDO AUDIOVISUAL - UPS  ");
        System.out.println("=========================================\n");

        // 1. Probando clases originales y sus relaciones
        Actor actorPrincipal = new Actor("Keanu Reeves", "Estadounidense", 59);
        Pelicula miPelicula = new Pelicula("Matrix", 136, "Ciencia Ficción", actorPrincipal);

        Temporada temp1 = new Temporada(1, 8);
        SerieDeTV miSerie = new SerieDeTV("Stranger Things", 50, "Suspenso", temp1);

        Investigador investigadorDoc = new Investigador("Dra. Jane Goodall", "Zoología");
        Documental miDocumental = new Documental("The Primates", 90, "Naturaleza", investigadorDoc);

        // 2. Probando las nuevas subclases de la actualidad
        StreamEnVivo miStream = new StreamEnVivo("Maratón de Código en Java", 180, "Educación", "Twitch", "ProgramadorLatam");
        ReelTikTok miReel = new ReelTikTok("¡Aprende POO en 60 segundos!", 1, "Tecnología", "@code_master", 12500);

        // 3. Demostración de Polimorfismo (Arreglo de ContenidoAudiovisual)
        ContenidoAudiovisual[] catalogo = { miPelicula, miSerie, miDocumental, miStream, miReel };

        System.out.println("--- MOSTRANDO CATÁLOGO COMPLETO (POLIMORFISMO) ---");
        for (ContenidoAudiovisual contenido : catalogo) {
            contenido.mostrarDetalles();
            System.out.println();
        }
    }
}