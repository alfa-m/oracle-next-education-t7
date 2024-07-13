// Crie um contador que comece em 1 e vá até 10 usando um loop while. Mostre cada número.
let contador1 = 1;

while (contador1 <= 10) {
  console.log(contador1);
  contador1++;
}

// Crie um contador que começa em 10 e vá até 0 usando um loop while. Mostre cada número.
let contador2 = 10;

while (contador2 >= 0) {
  console.log(contador2);
  contador2--;
}

// Crie um programa de contagem regressiva. Peça um número e conte deste número até 0, usando um loop while no console do navegador.
let numeroContagemRegressiva = parseInt(prompt("Por favor, insira um número"));

while (numeroContagemRegressiva >= 0) {
  console.log(numeroContagemRegressiva);
  numeroContagemRegressiva--;
}

// Crie um programa de contagem progressiva. Peça um número e conte de 0 até esse número, usando um loop while no console do navegador.
let numeroContagemProgressiva = parseInt(prompt("Por favor, insira um número"));
let contador3 = 0;

while (contador3 <= numeroContagemProgressiva) {
  console.log(contador3);
  contador3++;
}
