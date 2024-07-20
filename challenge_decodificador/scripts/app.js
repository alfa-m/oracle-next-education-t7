function limpaTudo() {
  document.querySelector("#entrada_decodificacao").value = "";
  document.querySelector("#saida_decodificacao").innerHTML = "";
}

function criptografa() {
  let textoEntrada = document.querySelector("#entrada_decodificacao").value;
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
  document.querySelector("#saida_decodificacao").innerHTML =
    textoSaida.join("");
}

function descriptografa() {
  let textoEntrada = document.querySelector("#entrada_decodificacao").value;
  let textoSaida = textoEntrada.replaceAll("ai", "a");
  textoSaida = textoSaida.replaceAll("enter", "e");
  textoSaida = textoSaida.replaceAll("imes", "i");
  textoSaida = textoSaida.replaceAll("ober", "o");
  textoSaida = textoSaida.replaceAll("ufat", "u");
  document.querySelector("#saida_decodificacao").innerHTML = textoSaida;
}

function copiaTexto() {
  let textoCopiado = document.querySelector("#saida_decodificacao").innerHTML;
  document.querySelector("#entrada_decodificacao").value = textoCopiado;
  navigator.clipboard.writeText(textoCopiado);
}
