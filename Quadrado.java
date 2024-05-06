public class Quadrado {
    public double lado;
    
    public Quadrado(){
        this.lado = 0;
    }
    

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    public String interpretar() {
        String resultado = "";
        double area = this.calcularArea();
        if (area == 0)
            resultado += "Não existe área zero";
        else if (area == 100)
            resultado += "Você tem 1 are";
        else if(area == 500)
            resultado += "Você tem 5 ares";
        else if(area == 1000)
            resultado += "Você tem 10 ares";
        else if (area == 10000)
            resultado += "Você tem 1 hectare";
        else if(area == 50000)
            resultado += "Você tem 5 hectares";
        else if(area == 100000)
            resultado += "Você tem 10 hectares";
        else if(area > 0)
            resultado += "Sua área é: " + area;
        
        return resultado;
    }
}
