// Crie um programa que utilize o console.log para exibir uma mensagem de boas-vindas.
console.log("Boas-vindas!");

// Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o console.log para exibir a mensagem "Olá, [seu nome]!" no console do navegador.
let nome = "Alfa";
console.log(`Olá, ${nome}!`);

// Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o alert para exibir a mensagem "Olá, [seu nome]!" .
alert(`Olá, ${nome}!`);

// Utilize o prompt e faça a seguinte pergunta: Qual a linguagem de programação que você mais gosta?. Em seguida, armazene a resposta em uma variável e mostre no console do navegador.
let linguagemFavorita = prompt(
  "Qual a linguagem de programação que você mais gosta?"
);
console.log(linguagemFavorita);

// Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a soma desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A soma de [valor1] e [valor2] é igual a [resultado]." no console.
let valor1 = 6;
let valor2 = 2;
let resultadoSoma = valor1 + valor2;
console.log(`A soma de ${valor1} e ${valor2} é igual a ${resultadoSoma}.`);

// Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a subtração desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A diferença entre [valor1] e [valor2] é igual a [resultado]." no console.
let resultadoSubtracao = valor1 - valor2;
console.log(
  `A diferença de ${valor1} e ${valor2} é igual a ${resultadoSubtracao}.`
);

// Peça ao usuário para inserir sua idade com prompt. Com base na idade inserida, utilize um if para verificar se a pessoa é maior ou menor de idade, exibindo uma mensagem apropriada no console.
let idadeUsuario = parseInt(prompt("Insira sua idade"));

if (idadeUsuario >= 18) {
  console.log("O usuário é maior de idade");
} else {
  console.log("O usuário é menor de idade");
}

// Crie uma variável "numero" e peça um valor com prompt verifique se é positivo, negativo ou zero. Use if-else para imprimir a respectiva mensagem.
let numeroUsuario = parseInt(prompt("Insira um número"));
if (numeroUsuario == 0) {
  console.log("O número é igual a zero");
} else {
  if (numeroUsuario < 0) {
    console.log("O número é negativo");
  } else {
    console.log("O número é positivo");
  }
}

// Use um loop while para imprimir os números de 1 a 10 no console.
let contador = 1;

while (contador <= 10) {
  console.log(contador);
  contador++;
}

// Crie uma variável "nota" e atribua um valor numérico a ela. Use if-else para determinar se a nota é maior ou igual a 7 e exiba "Aprovado" ou "Reprovado" no console.
let nota = parseFloat(prompt("Insira sua nota"));

if (nota >= 7.0) {
  console.log("Aprovado");
} else {
  console.log("Reprovado");
}

// Use o Math.random para gerar qualquer número aleatório e exiba esse número no console.
let numeroAleatorio1 = parseInt(Math.random());
console.log(numeroAleatorio1);

// Use o Math.random para gerar um número inteiro entre 1 e 10 e exiba esse número no console.
let numeroAleatorio2 = parseInt(Math.random() * 10 + 1);
console.log(numeroAleatorio2);

// Use o Math.random para gerar um número inteiro entre 1 e 1000 e exiba esse número no console.
let numeroAleatorio3 = parseInt(Math.random() * 1000 + 1);
console.log(numeroAleatorio3);
