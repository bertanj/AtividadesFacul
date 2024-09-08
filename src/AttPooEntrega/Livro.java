package AttPooEntrega;

    public class Livro {
        private String titulo;
        private String autor;
        private int totpag;

        public Livro(String titulo, String autor, int totpag) {
            this.titulo = titulo;
            this.autor = autor;
            this.totpag = totpag;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getTotpag() {
            return totpag;
        }

        public void setTotpag(int totpag) {
            this.totpag = totpag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", totpag=" + totpag +
                    '}';
        }
    }
