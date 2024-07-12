//let titulo = document.querySelector("h1");
//titulo.innerHTML = "Jogo do número secreto";

//let paragrafo = document.querySelector("p");
//paragrafo.innerHTML = "Escolha um número entre 1 e 10";

function alterarHtml(tag, texto) {
  // document.querySelector(#id) funciona igual a document.getElementById(id)
  let campo = document.querySelector(tag);
  campo.innerHTML = texto;
}

function gerarNumeroAleatorio() {
  //return parseInt(Math.random() * limite + 1);
  return parseInt(Math.random() * 10 + 1);
}

function verificarChute() {
  let chute = document.querySelector("input").value;
  let tentativaPalavra = tentativa > 1 ? "tentativas" : "tentativa";
  if (chute == numeroSecreto) {
    // botao.disabled = false funciona igual a botao.removeAttribute('disabled')
    botao.disabled = false;
    alterarHtml("#instrucao_jogo", "");
    alterarHtml(
      "#dica_jogo",
      `Você acertou o número secreto (${numeroSecreto}) em ${tentativa} ${tentativaPalavra}`
    );
  } else {
    limparCampo();
    if (chute < numeroSecreto) {
      alterarHtml("#dica_jogo", `O número secreto é maior que ${chute}`);
    } else {
      alterarHtml("#dica_jogo", `O número secreto é menor que ${chute}`);
    }
  }
  tentativa++;
}

function limparCampo() {
  document.querySelector("input").value = "";
}

function exibirMensagemInicial() {
  alterarHtml("h1", "Jogo do número secreto");
  //alterarHtml("#instrucao_jogo", `Escolha um número entre 1 e ${limite}`);
  alterarHtml("#instrucao_jogo", `Escolha um número entre 1 e 10`);
}

function reiniciarJogo() {
  exibirMensagemInicial();
  limparCampo();
  alterarHtml("#dica_jogo", "");
  // botao.disabled = true funciona igual a botao.setAttribute('disabled', true)
  botao.disabled = true;
  numeroSecreto = gerarNumeroAleatorio();
  tentativa = 1;
}

//let limite = prompt("Insira o número máximo");
let numeroSecreto = gerarNumeroAleatorio();
let tentativa = 1;
let botao = document.querySelector("#reiniciar");
botao.disabled = true;
exibirMensagemInicial();
