# 🎮 Legends of Java - Sistema RPG

## 📋 Descrição

Este projeto foi desenvolvido como exercício prático de **Programação Orientada a Objetos (POO)** em Java.

O sistema simula um RPG (Role-Playing Game) com diferentes tipos de personagens que podem batalhar, utilizar habilidades especiais e evoluir de nível.

---

## 🎯 Objetivo

Aplicar na prática os principais conceitos de POO:

* Classes e Objetos
* Encapsulamento
* Herança
* Polimorfismo
* Classes Abstratas
* Métodos Abstratos
* Sobrescrita de Métodos
* Construtores
* Uso de ArrayList

---

## ⚙️ Funcionalidades

### 🧙‍♂️ Personagens

* Guerreiro ⚔️
* Mago 🔮
* Arqueiro 🏹

Cada personagem possui:

* Vida e Mana
* Ataque e Defesa
* Habilidade especial única
* Sistema de experiência e evolução

---

### ⚔️ Sistema de Combate

* Batalhas entre personagens
* Cálculo de dano baseado em atributos
* Verificação de morte
* Ganho de experiência ao derrotar inimigos

---

### ✨ Habilidades Especiais

* **Guerreiro**: Investida Furiosa
* **Mago**: Meteoro Arcano
* **Arqueiro**: Chuva de Flechas

---

### 📈 Sistema de Progressão

* Ganho de experiência (EXP)
* Level up automático ao atingir 100 EXP
* Aumento de atributos:

  * Vida
  * Mana
  * Ataque
  * Defesa

---

### 🏆 Torneio

* Sistema eliminatório
* Personagens lutam até restar um campeão

---

## 🧱 Estrutura do Projeto

```text
src/
└── br/com/rpg/
    ├── modelo/
    │   ├── Personagem.java
    │   ├── Guerreiro.java
    │   ├── Mago.java
    │   └── Arqueiro.java
    │
    ├── sistema/
    │   └── Arena.java
    │
    └── principal/
        └── JogoRPG.java
```

---

## 🧠 Conceitos de POO Aplicados

### ✔️ Classe Abstrata

* `Personagem` define estrutura base para todos os personagens

### ✔️ Herança

* Guerreiro, Mago e Arqueiro herdam de `Personagem`

### ✔️ Polimorfismo

* Uso de `ArrayList<Personagem>` para tratar diferentes classes de forma uniforme

### ✔️ Encapsulamento

* Atributos protegidos e controle de acesso via métodos

### ✔️ Sobrescrita de Métodos

* Cada classe implementa seu próprio `atacar()` e `usarHabilidadeEspecial()`

---

## ▶️ Como Executar

1. Abra o projeto no **IntelliJ IDEA**
2. Navegue até:

   ```
   br.com.rpg.principal.JogoRPG
   ```
3. Execute a classe com método `main`
4. Acompanhe a execução pelo console

---

## 🧪 Demonstrações no Código

* Criação de personagens
* Uso de polimorfismo
* Execução de habilidades especiais
* Sistema de experiência e level up
* Batalha entre personagens
* Torneio completo

---

## 📌 Requisitos Atendidos

### ✔️ Técnicos

* Classe abstrata implementada
* Métodos abstratos utilizados
* 3 classes concretas criadas
* Uso de polimorfismo
* Encapsulamento aplicado
* Construtores implementados
* Sobrescrita com `@Override`

### ✔️ Funcionais

* Sistema de combate funcional
* Sistema de experiência e evolução
* Habilidades únicas por classe
* Gerenciamento de recursos (vida, mana, flechas)
* Batalhas entre personagens
* Torneio eliminatório

---

## 🏆 Versão

**v1.0** – Sistema completo funcional

---

## ✨ Autor

Daniel Dornelas

---

## 🚀 Melhorias Futuras

* Interface gráfica (JavaFX/Swing)
* Sistema de itens (poções, armas)
* Entrada de dados com Scanner
* Sistema de crítico e esquiva
* Novas classes de personagens

---

## 📷 (Opcional)

Adicione aqui prints da execução do sistema

```
Exemplo:
![Batalha](link_da_imagem)
```
