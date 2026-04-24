# 🎮 Legends of Java - Sistema RPG

## 📌 Sobre o projeto

Este projeto foi desenvolvido como prática de Programação Orientada a Objetos em Java, simulando um sistema simples de RPG.

A ideia é representar um mundo onde diferentes tipos de personagens podem lutar entre si, usar habilidades especiais e evoluir conforme ganham experiência.

---

## 🧠 O que o sistema faz

O sistema gira em torno de personagens que possuem atributos como vida, mana, ataque e defesa. Cada personagem pode interagir em batalhas, receber dano, se curar e ganhar experiência ao derrotar inimigos.

Com o tempo, esses personagens evoluem de nível, ficando mais fortes e desbloqueando melhorias nos seus atributos.

---

## ⚔️ Personagens disponíveis

O jogo conta com três tipos principais de personagens:

* **Guerreiro** ⚔️
  Focado em combate físico, possui alto poder de ataque e boa defesa.

* **Mago** 🔮
  Utiliza mana para lançar feitiços poderosos e ataques mágicos de grande dano.

* **Arqueiro** 🏹
  Especialista em ataques à distância, utilizando flechas e ataques rápidos.

Cada classe possui sua própria habilidade especial, tornando o combate mais estratégico.

---

## 🔥 Sistema de batalha

As batalhas acontecem entre dois personagens até que um deles perca toda sua vida.

Durante o combate:

* Cada personagem ataca na sua vez
* O dano é calculado com base em ataque e defesa
* É possível usar habilidades especiais
* Personagens podem ser derrotados e ganhar experiência

---

## 📈 Evolução dos personagens

Ao ganhar experiência, os personagens podem subir de nível.

Quando isso acontece:

* Seus atributos aumentam (vida, mana, ataque e defesa)
* A vida e mana são restauradas
* A experiência é resetada para continuar a evolução

Isso cria uma progressão natural de poder durante o jogo.

---

## 🏆 Torneio

Além das batalhas normais, o sistema também permite um torneio entre vários personagens.

Nesse modo:

* Os personagens se enfrentam em duelos eliminatórios
* O vencedor segue para a próxima rodada
* O processo continua até restar apenas um campeão

---

## 🧱 Organização do projeto

O projeto foi organizado em pacotes para manter uma boa estrutura:

* **modelo** → classes dos personagens
* **sistema** → lógica de batalha (Arena)
* **principal** → execução do jogo

---

## 🎯 Conceitos aplicados

Este projeto foi desenvolvido com foco em:

* Classes abstratas
* Herança
* Polimorfismo
* Encapsulamento
* Sobrescrita de métodos
* Estruturas de repetição e lógica de combate
* Uso de ArrayList

---

## ▶️ Como executar

Basta executar a classe principal `JogoRPG`, localizada no pacote principal.

Ela cria os personagens, demonstra o sistema e executa batalhas e torneios automaticamente.

---

## 🚀 Considerações finais

Este projeto foi uma forma de praticar conceitos fundamentais de Java de forma mais divertida, simulando um sistema de jogo.

A lógica pode ser expandida futuramente com novas classes, habilidades e sistemas mais complexos.
