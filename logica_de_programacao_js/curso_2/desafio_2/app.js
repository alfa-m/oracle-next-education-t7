// Criar uma função que exibe "Olá, mundo!" no console.
function olaMundo() {
  console.log("Olá, mundo!");
}

// Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.
function olaUsuario(nome) {
  console.log(`Olá, ${nome}`);
}

// Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.
function dobraNumero(numero) {
  return numero * 2;
}

// Criar uma função que recebe três números como parâmetros e retorna a média deles.
function mediaTresNumeros(numero1, numero2, numero3) {
  return (numero1 + numero2 + numero3) / 3;
}

// Criar uma função que recebe dois números como parâmetros e retorna o maior deles.
function escolheMaiorNumero(numero1, numero2) {
  let maiorNumero;

  if (numero1 > numero2) {
    maiorNumero = numero1;
  } else {
    maiorNumero = numero2;
  }

  return maiorNumero;
}

// Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo.
function numeroAoQuadrado(numero) {
  return numero * numero;
}

olaMundo();
olaUsuario("Alfa");
console.log(dobraNumero(3));
console.log(mediaTresNumeros(1, 2, 3));
console.log(escolheMaiorNumero(3, 6));
console.log(numeroAoQuadrado(4));
