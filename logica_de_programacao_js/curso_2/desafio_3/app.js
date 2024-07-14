// Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.
function calculaIMC(altura, peso) {
  return peso / (altura * altura);
}

// Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.
function calculaFatorial(numero) {
  if (numero > 1) {
    return numero * calculaFatorial(numero - 1);
  } else {
    return 1;
  }
}

// Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a cotação do dólar igual a R$4,80.
function converteDolarParaReal(valorDolar) {
  return valorDolar * 4.8;
}

// Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura que serão dadas como parâmetro.
function mostraAreaPerimetroRetangulo(altura, largura) {
  let areaRetangulo = altura * largura;
  let perimetroRetangulo = 2 * (altura + largura);
  document.querySelector(
    "#tarefa-4"
  ).innerHTML = `A área do retângulo ${altura}m x ${largura}m é ${areaRetangulo}m² e o perímetro é ${perimetroRetangulo}m.`;
}

// Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será fornecido como parâmetro. Considere Pi = 3,14.
function mostraAreaPerimetroCirculo(raio) {
  let pi = 3.14;
  let areaCirculo = pi * (raio * raio);
  let perimetroCirculo = 2 * pi * raio;
  document.querySelector(
    "#tarefa-5"
  ).innerHTML = `A área do círculo de raio ${raio}m é ${areaCirculo}m² e o perímetro é ${perimetroCirculo}m.`;
}

// Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.
function calculaMostraTabuada(numero) {
  document.querySelector(
    "#tarefa-5"
  ).innerHTML = `Tabuada de ${numero}: ${numero} x 1 = ${
    1 * numero
  }; ${numero} x 2 = ${2 * numero}; ${numero} x 3 = ${
    3 * numero
  }; ${numero} x 4 = ${4 * numero}; ${numero} x 5 = ${
    5 * numero
  }; ${numero} x 6 = ${6 * numero}; ${numero} x 7 = ${
    7 * numero
  }; ${numero} x 8 = ${8 * numero}; ${numero} x 9 = ${
    9 * numero
  }; ${numero} x 10 = ${10 * numero}.`;
}

console.log(calculaIMC(1.54, 76));
console.log(calculaFatorial(5));
console.log(converteDolarParaReal(2.0));
mostraAreaPerimetroRetangulo(2, 3);
mostraAreaPerimetroCirculo(4);
calculaMostraTabuada(2);
