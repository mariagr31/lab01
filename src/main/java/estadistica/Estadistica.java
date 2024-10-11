package estadistica;

public class Estadistica {
    /// Definición de las variables de instancia
    private double sumaX, sumaX2;
    private int numElementos;

    /// ### Agrega el dato d a la serie
    /// @param d valor
    /// 1. Suma 1 al número de elementos
    /// 1. Suma el dato d a la suma total que ya teníamos
    /// 1. Suma el cuadrado de d a la sumaX2
    public void agrega(double d) {
        numElementos++;
        sumaX += d;
        sumaX2 += d*d;
    }

    /// ### Agrega n veces el dato d a la serie
    public void agrega(double d, int n){
       numElementos += n;
       sumaX += n*d;
       sumaX2 += n*d*d;
    }

    /// ### Devuelve la media de los valores
    /// divide la suma total entre el número de elementos
    public double media(){
        return sumaX/numElementos;
    }

    /// ### Devuelve la varianza
    /// divide la suma del cuadrado d elos números entre el número de elementos y a esto se le resta el cuadrado de la media
    public double varianza(){
        return sumaX2/numElementos - Math.pow(media(), 2);
    }
    /// ### Devuelve la desviación tipica
    /// realiza la raíz cuadrada de la varianza
    public double desviacionTipica(){
        return Math.sqrt(varianza());
    }
}
