public class DiferencasFinitas{

    private Pair<Double> [] valores;
    private double [][] tabela;
    private double h;

    public DiferencasFinitas(Pair<Double> [] valores) throws Exception{
        this.valores = valores;
        if(this.valores.length < 2){
            throw new Exception("Quantidade de variáveis inválida!");
        }
        this.tabela = new double[this.valores.length][this.valores.length];
        this.h = this.valores[1].getX() - this.valores[0].getX();
        calculo();
    }

    public void formulaGregoryNewton(){
        System.out.println("Equação polinomial de Gregory-Newton");
        double valorX0PorH = this.valores[0].getX()/this.h;
        String f = "P" + (this.valores.length - 1) + "(x) = " + this.valores[0].getY() + " + ";
        String z = "(x";
         z = divisaoPorUm(z);
        if(valorX0PorH < 0){
            z += " + " + (valorX0PorH * -1) + ")";
        }
        else{
            z += " - " + valorX0PorH + ")";
        }
        for(int i = 1; i < this.tabela.length; i++){
            f += "(";
            f += z + " * " + multiplicacao(i, z);
            f += this.tabela[i][0] + ")/" + fatorial(i);
            if(i != this.tabela.length - 1){
                f += " + ";
            }
        }
        System.out.println(f);
    }

    private String divisaoPorUm(String z){
        if(h != 1){
            z += "/" + h;
        }
        return z;
    }

    private String multiplicacao(int v, String z){
        String res = "";
        for(int i = 1; i < v; i++){
            res += "(" + z + " - " + i + ") * ";
        }
        return res;
    }

    private int fatorial(int i){
        int f = 1;
        for(int j = i; j > 0; j--){
            f *= j;
        }
        return f;
    }

    private void calculo(){
        for(int i = 0; i < this.tabela.length; i++){
            for(int j = 0; j < this.tabela[i].length - i; j++){
                if(i == 0){
                    this.tabela[i][j] = this.valores[j].getY();
                }
                else{
                    this.tabela[i][j] = this.tabela[i - 1][j + 1] - this.tabela[i - 1][j];
                }
            }
        }
    }

    public void exibirTabela(){
        for(int i = 0; i < this.tabela.length; i++){
            System.out.print(valores[i].getX() + " | ");
            for(int j = 0; j < this.tabela[i].length - i; j++){
                System.out.print(this.tabela[j][i] + " ");
            }
            System.out.println();
        }
    }

    public double Px(double x){
        double res = this.valores[0].getY(), z = (x - this.valores[0].getX())/this.h;
        for(int i = 1; i < this.tabela.length; i++){
            res += (z * mult(i, z) * this.tabela[i][0])/fatorial(i);
        }
        return res;
    }

    private double mult(int v, double z){
        double res = 1;
        for(int i = 1; i < v; i++){
            res *= z - i; 
        }
        return res;
    }
}