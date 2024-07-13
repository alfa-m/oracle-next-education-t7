let titulo1 = document.querySelector("h1");
titulo1.innerHTML = "Hora do desafio";

function mensagemConsole() {
  console.log("O botão foi clicado");
}

function mensagemAlerta() {
  alert("Eu amo JS");
}

function mensagemPrompt() {
  let cidade = prompt("Por favor, insira o nome de uma cidade");
  alert(`Estive em ${cidade} e lembrei de você`);
}

function calculaSoma() {
  alert("Calculadora de soma");
  let numero1 = prompt("Por favor, insira o primeiro número");
  let numero2 = prompt("Por favor, insira o segundo número");
  let resultado = parseInt(numero1) + parseInt(numero2);
  alert(`A soma de ${numero1} e ${numero2} é ${resultado}`);
}
