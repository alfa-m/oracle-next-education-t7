let ultimosTresNumerosSecretos = [];
//let limite = prompt("Insira o número máximo");
let numeroSecreto = gerarNumeroAleatorio();
let tentativa = 1;
let botaoIniciar = document.querySelector("#chutar");
botaoIniciar.disabled = false;
let botaoReiniciar = document.querySelector("#reiniciar");
botaoReiniciar.disabled = true;
exibirMensagemInicial();

//let titulo = document.querySelector("h1");
//titulo.innerHTML = "Jogo do número secreto";

//let paragrafo = document.querySelector("p");
//paragrafo.innerHTML = "Escolha um número entre 1 e 10";

function alterarHtml(tag, texto) {
  // document.querySelector(#id) funciona igual a document.getElementById(id)
  let campo = document.querySelector(tag);
  campo.innerHTML = texto;
  responsiveVoice.speak(texto, "Brazilian Portuguese Female", { rate: 1.3 });
}

function gerarNumeroAleatorio() {
  // let numeroAleatorio = parseInt(Math.random() * limite + 1);
  let numeroAleatorio = parseInt(Math.random() * 10 + 1);

  if (ultimosTresNumerosSecretos.length == 3) {
    ultimosTresNumerosSecretos.shift();
  }

  if (ultimosTresNumerosSecretos.includes(numeroAleatorio)) {
    return gerarNumeroAleatorio();
  } else {
    ultimosTresNumerosSecretos.push(numeroAleatorio);
    return numeroAleatorio;
  }
}

function verificarChute() {
  let chute = document.querySelector("input").value;
  let tentativaPalavra = tentativa > 1 ? "tentativas" : "tentativa";
  if (chute == numeroSecreto) {
    botaoIniciar.disabled = true;
    // botaoReiniciar.disabled = false funciona igual a botaoReiniciar.removeAttribute('disabled')
    botaoReiniciar.disabled = false;
    alterarHtml("h1", "Acertou!");
    alterarHtml("#instrucao_jogo", "");
    alterarHtml(
      "#dica_jogo",
      `Você acertou o número secreto em ${tentativa} ${tentativaPalavra}`
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
  botaoIniciar.disabled = false;
  // botaoReiniciar.disabled = true funciona igual a botaoReiniciar.setAttribute('disabled', true)
  botaoReiniciar.disabled = true;
  numeroSecreto = gerarNumeroAleatorio();
  tentativa = 1;
}
