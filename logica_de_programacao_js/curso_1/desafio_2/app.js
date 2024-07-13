// Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". Caso contrário, mostre "Boa semana!".
let diaDaSemana = prompt("Qual é o dia da semana?");

if (diaDaSemana == "Sábado" || diaDaSemana == "Domingo") {
  console.log("Bom fim de semana!");
} else {
  console.log("Boa semana!");
}

// Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando.
let numeroUsuario = parseInt(prompt("Insira um número"));

if (numeroUsuario > 0) {
  alert("Número positivo");
}
if (numeroUsuario < 0) {
  alert("Número negativo");
}

// Crie um sistema de pontuação para um jogo. Se a pontuação for maior ou igual a 100, mostre "Parabéns, você venceu!". Caso contrário, mostre "Tente novamente para ganhar.".
let pontuacao = parseInt(prompt("Insira a pontuação"));

if (pontuacao >= 100) {
  console.log("Parabéns, você venceu!");
} else {
  console.log("Tente novamente para ganhar.");
}

// Crie uma mensagem que informa o usuário sobre o saldo da conta, usando uma template string para incluir o valor do saldo.
let saldo = 1800.0;
alert(`Seu saldo é de R$ ${saldo}`);

// Peça ao usuário para inserir seu nome usando prompt. Em seguida, mostre um alerta de boas-vindas usando esse nome.
let nomeUsuario = prompt("Por favor, insira seu nome");
alert(`Boas-vindas, ${nomeUsuario}`);
