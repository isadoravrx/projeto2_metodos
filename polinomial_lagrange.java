public class polinomial_lagrange {
  Pair<Integer> p[];

  polinomial_lagrange(Pair<Integer> p[]) {
    this. p = p;
  }

  float interpolacao(float xinterpolado){
    float l0 = ln(xinterpolado, 0);
    float l1 = ln(xinterpolado, 1);
    float l2 = ln(xinterpolado, 2);
    float l[] = { l0, l1, l2 };

    float yinterpolado = 0;
    for (int j = 0; j < 3; j++) {
      yinterpolado += p[j].y * l[j];
    }
    
    return yinterpolado;
  }

  float ln(float x, float l) {
    if (l == 0) {
      return ((float) ((x - p[1].x) * (x - p[2].x))) / ((float) ((p[0].x - p[1].x) * (p[0].x - p[2].x)));
    } else if (l == 1) {
      return ((float) ((x - p[0].x) * (x - p[2].x))) / ((float) ((p[1].x - p[0].x) * (p[1].x - p[2].x)));
    }
    return ((float) ((x - p[0].x) * (x - p[1].x))) / ((float) ((p[2].x - p[0].x) * (p[2].x - p[1].x)));
  }
}