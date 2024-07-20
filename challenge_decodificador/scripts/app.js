let entrada = document.getElementById("entrada_decodificacao");
let saida = document.getElementById("saida_decodificacao");
let imagem = document.getElementById("secao_sem_texto");
let botaoCopiar = document.getElementById("botao_copiar");

imagem.style.display = "flex";
saida.style.display = "none";
botaoCopiar.style.display = "none";

function limpaTudo() {
  entrada.value = "";
  saida.innerHTML = "";
  imagem.style.display = "flex";
  saida.style.display = "none";
  botaoCopiar.style.display = "none";
}

function criptografa() {
  imagem.style.display = "none";
  saida.style.display = "flex";
  saida.style.flexDirection = "column";
  botaoCopiar.style.display = "block";

  let textoEntrada = entrada.value;
  let textoSaida = [];
  for (let i in textoEntrada) {
    let letra = textoEntrada[i];
    switch (letra) {
      case "a":
        textoSaida.push("ai");
        break;

      case "e":
        textoSaida.push("enter");
        break;

      case "i":
        textoSaida.push("imes");
        break;

      case "o":
        textoSaida.push("ober");
        break;

      case "u":
        textoSaida.push("ufat");
        break;

      default:
        textoSaida.push(letra);
        break;
    }
  }
  saida.innerHTML = textoSaida.join("");
}

function descriptografa() {
  imagem.style.display = "none";
  saida.style.display = "flex";
  saida.style.flexDirection = "column";
  botaoCopiar.style.display = "block";

  let textoEntrada = entrada.value;
  let textoSaida = textoEntrada.replaceAll("ai", "a");
  textoSaida = textoSaida.replaceAll("enter", "e");
  textoSaida = textoSaida.replaceAll("imes", "i");
  textoSaida = textoSaida.replaceAll("ober", "o");
  textoSaida = textoSaida.replaceAll("ufat", "u");
  saida.innerHTML = textoSaida;
}

function copiaTexto() {
  let textoCopiado = saida.innerHTML;
  entrada.value = textoCopiado;
  navigator.clipboard.writeText(textoCopiado);
}
