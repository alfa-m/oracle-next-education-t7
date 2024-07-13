alert("Boas vindas ao jogo do número secreto");

let valorMaximo = prompt("Qual o número máximo desejado?");

let numeroSecreto = parseInt(Math.random() * valorMaximo + 1);
//console.log(numeroSecreto);
let numeroChute;
let numeroTentativas = 1;

while (numeroChute != numeroSecreto) {
  numeroChute = prompt(`Escolha um número entre 1 e ${valorMaximo}`);

  if (numeroChute == numeroSecreto) {
    break;
  } else {
    if (numeroChute < numeroSecreto) {
      alert(`O número secreto é maior do que ${numeroChute}. Tente novamente`);
    } else {
      alert(`O número secreto é menor do que ${numeroChute}. Tente novamente`);
    }
    numeroTentativas++;
  }
}

let palavraTentativa = numeroTentativas > 1 ? "tentativas" : "tentativa";

alert(
  `Parabéns! Você descobriu o número secreto (${numeroSecreto}) com ${numeroTentativas} ${palavraTentativa}`
);
