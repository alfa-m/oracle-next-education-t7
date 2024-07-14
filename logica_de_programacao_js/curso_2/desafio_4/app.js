// Crie uma lista vazia, com o nome listaGenerica.
let listaGenerica = [];
console.log(`${listaGenerica}, tamanho ${listaGenerica.length}`);

// Crie uma lista de linguagens de programação chamada linguagensDeProgramacao com os seguintes elementos: 'JavaScript','C','C++', 'Kotlin' e 'Python'.
let linguagensDeProgramacao = ["JavaScript", "C", "C++", "Kotlin", "Python"];
console.log(
  `${linguagensDeProgramacao}, tamanho ${linguagensDeProgramacao.length}`
);

// Adicione à lista linguagensDeProgramacao os seguintes elementos: 'Java', 'Ruby' e 'GoLang'.
linguagensDeProgramacao.push("Java");
linguagensDeProgramacao.push("Ruby");
linguagensDeProgramacao.push("GoLang");
console.log(
  `${linguagensDeProgramacao}, tamanho ${linguagensDeProgramacao.length}`
);

// Crie uma lista com 3 nomes e exiba no console apenas o primeiro elemento.
let nomes = ["Beyoncé", "Lady Gaga", "Rihanna"];
console.log(`Primeiro nome: ${nomes[0]}`);

// Crie uma lista com 3 nomes e exiba no console apenas o segundo elemento.
console.log(`Segundo nome: ${nomes[1]}`);

// Crie uma lista com 3 nomes e exiba no console apenas o último elemento.
console.log(`Último nome: ${nomes[nomes.length - 1]}`);
