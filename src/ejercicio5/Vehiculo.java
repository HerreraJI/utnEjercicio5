package *;


public class Vehiculo {
    
    private int cantidadDeRuedas;
    private String color;
    private int modelo; //debe estar entre1900 y el año actual
    private int ultimaRTV;
    private String patente;
    private String tipoVehiculo;

    public Vehiculo(String patente, String tipoVehiculo) {
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    //esta vencida si hace mas de dos años que fue hecha
    public boolean laRevisionTecnicaEstaAlDia (int anioRTV, int anioActual){
        
        return anioActual -  anioRTV < 2;        
    }
    
    public void datosString(){
        String estado = "vencida";
        if(laRevisionTecnicaEstaAlDia (getUltimaRTV(), 2023)){
           estado = "Al dia";
        }
        System.out.println("Patente: "+getPatente()+"- Tipo Vehículo: " +
getTipoVehiculo()+"- Modelo: "+getModelo()+"- Revisión Técnica: "+estado);
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        if(modelo<1900 || modelo>2023){
            System.out.println("el modelo no puede ser menor a 1900 ni mayor a 2023. VOLVER A INTENTAR");
        }else
            this.modelo = modelo;
    }

    public int getUltimaRTV() {
        return ultimaRTV;
    }

    public void setUltimaRTV(int ultimaRTV) {
        this.ultimaRTV = ultimaRTV;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        
        this.patente = patente;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        String mensajeERROR = "No es un vehiculo permitidp";
        switch (tipoVehiculo){
            case "auto":
            case "pickup":
            case "moto":
            case "camion":
                this.tipoVehiculo = tipoVehiculo;
                break;
            default:
                System.out.println(mensajeERROR);               
        }
                
                    
        
    }
    
    
}
