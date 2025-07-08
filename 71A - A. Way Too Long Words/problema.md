# A. Palabras Demasiado Largas

A veces, algunas palabras como "localization" o "internationalization" son tan largas que escribirlas muchas veces en un texto resulta bastante tedioso.

Vamos a considerar una palabra como demasiado larga si su longitud es estrictamente mayor que 10 caracteres. Todas las palabras demasiado largas deben reemplazarse con una abreviatura especial.

Esta abreviatura se forma de la siguiente manera: se escribe la primera y la última letra de la palabra, y entre ellas se coloca el número de letras que hay entre la primera y la última. Ese número se escribe en sistema decimal y no contiene ceros a la izquierda.

## Por ejemplo:

"localization" se escribirá como "l10n"

"internationalization" se escribirá como "i18n"

Se te propone automatizar el proceso de convertir las palabras largas en sus respectivas abreviaturas. Todas las palabras demasiado largas deben reemplazarse por su abreviatura, y las palabras que no sean demasiado largas no deben modificarse.

## Entrada
La primera línea contiene un número entero n (1 ≤ n ≤ 100).
Cada una de las siguientes n líneas contiene una palabra.
Todas las palabras están formadas solo por letras minúsculas del alfabeto latino y tienen una longitud de entre 1 y 100 caracteres.

## Salida
Imprime n líneas.
La línea i debe contener el resultado de abreviar (si corresponde) la i-ésima palabra de la entrada.