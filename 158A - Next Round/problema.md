# A. Siguiente Ronda
Límite de tiempo por test: 3 segundos
Límite de memoria por test: 256 megabytes

"El concursante que obtenga una puntuación igual o superior a la del concursante que quedó en la k-ésima posición avanzará a la siguiente ronda, siempre que su puntuación sea positiva..." — extracto de las reglas del concurso.

- Un total de n participantes participaron en el concurso (n ≥ k), y ya conoces sus puntuaciones. Calcula cuántos participantes avanzarán a la siguiente ronda.

## Entrada
- La primera línea contiene dos enteros n y k (1 ≤ k ≤ n ≤ 50) separados por un espacio.

- La segunda línea contiene n enteros separados por espacio: a₁, a₂, ..., aₙ (0 ≤ aᵢ ≤ 100), donde aᵢ es la puntuación obtenida por el participante que ocupó la i-ésima posición.
- La secuencia está en orden no creciente (es decir, para todo i de 1 a n - 1 se cumple: aᵢ ≥ aᵢ₊₁).

## Salida
- Imprime el número de participantes que avanzan a la siguiente ronda.

### Nota

En el primer ejemplo, el participante que quedó en quinto lugar obtuvo 7 puntos. Como el participante que quedó en sexto lugar también obtuvo 7 puntos, hay 6 avances.

En el segundo ejemplo nadie obtuvo una puntuación positiva.