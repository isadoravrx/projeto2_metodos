public class Polinomial_lagrange {
  Pair<Double> p[];

  Polinomial_lagrange(Pair<Double> p[]) {
    this. p = p;
  }

  int interpolacao_lagrange(double xinterpolado){
    return (int)interpolacao(xinterpolado);

  }
  double interpolacao(double xinterpolado){
    double l0 = ln(xinterpolado, 0.0);
    double l1 = ln(xinterpolado, 1.0);
    double l2 = ln(xinterpolado, 2.0);
    double l[] = { l0, l1, l2 };

    double yinterpolado = 0;
    for (int j = 0; j < 3; j++) {
      yinterpolado += p[j].y * l[j];
    }
    
    return yinterpolado;
  }

  double ln(double x, double l) {
    if (l == 0) {
      return ((double)((x - p[1].x) * (x - p[2].x))) / ((double)((p[0].x - p[1].x) * (p[0].x - p[2].x)));
    } else if (l == 1) {
      return ((double) ((x - p[0].x) * (x - p[2].x))) / ((double) ((p[1].x - p[0].x) * (p[1].x - p[2].x)));
    }
    
    return ((double) ((x - p[0].x) * (x - p[1].x))) / ((double) ((p[2].x - p[0].x) * (p[2].x - p[1].x)));
  }
}