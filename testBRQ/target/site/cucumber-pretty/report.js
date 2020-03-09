$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/realizarCompra.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#utf-8"
    }
  ],
  "line": 4,
  "name": "Realizar compra",
  "description": "",
  "id": "realizar-compra",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@UATTesting"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Realizar compra com sucesso",
  "description": "",
  "id": "realizar-compra;realizar-compra-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 7,
  "name": "que abro o navegador e acesso o site",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "realizo compra",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "valido compra efetuada",
  "keyword": "Entao "
});
formatter.match({
  "location": "compraStepDef.abrirNavegador()"
});
formatter.result({
  "duration": 15943675500,
  "status": "passed"
});
formatter.match({
  "location": "compraStepDef.realizarCompra()"
});
formatter.result({
  "duration": 24007566700,
  "status": "passed"
});
formatter.match({
  "location": "compraStepDef.validarCompra()"
});
formatter.result({
  "duration": 118376400,
  "status": "passed"
});
});