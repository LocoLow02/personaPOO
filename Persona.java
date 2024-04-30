public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    public void mostrarNombre(){
    System.out.println("Mi nombre es: "+this.nombre);
    }
    public void mostrarApellido(){
    System.out.println("Mi apellido es: "+this.apellido);
    }
    public void mostrarEdad(){
    System.out.println("Mi edad es: "+this.edad);
    }
    public void mostrarAltura(){
    System.out.println("Mi altura es: "+this.altura);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
    }
}