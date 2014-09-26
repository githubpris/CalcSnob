package calcsnob;

public class Nobre {

    public static Nobre instancia; //Singleton
    private int proximoNobre;
    private int totalArmazenamento;
    private int numeroNobres;
    private int restante;

    private Nobre() {
    }
    
    public static Nobre getInstance()
    {
        if (instancia == null)
                instancia = new Nobre();
        
        return instancia;
    }

    public void setProximoNobre(int proximoNobre) {
        this.proximoNobre = proximoNobre;
    }

    public int getProximoNobre() {
        return proximoNobre;
    }

    public void setTotalArmazenamento(int totalArmazenamento) {
        this.totalArmazenamento = totalArmazenamento;
    }

    public int getTotalArmazenamento() {
        return totalArmazenamento;
    }

    public void setNumeroNobres(int numeroNobres) {
        this.numeroNobres = numeroNobres;
    }

    public int getNumeroNobres() {
        return numeroNobres;
    }

    public void setRestante(int restante) {
        this.restante = restante;
    }

    public int getRestante() {
        return restante;
    }

    public void calcularNobres() {
        while (totalArmazenamento > proximoNobre) {
            totalArmazenamento = totalArmazenamento - proximoNobre;
            proximoNobre = (proximoNobre + 1);
            numeroNobres++;
        }
    }

    public void calcularNecessarioProximoNobre() {
        restante = proximoNobre - totalArmazenamento;
    }
}
