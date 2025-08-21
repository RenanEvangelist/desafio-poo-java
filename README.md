# 🚀 Desafio: Aprendendo na Prática Programação Orientada a Objetos em Java

![Java](https://img.shields.io/badge/Java-11-orange?logo=java)
![OOP](https://img.shields.io/badge/Paradigma-POO-blue)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

## 📖 Sobre o Projeto
Este projeto foi desenvolvido como parte do **Desafio da Digital Innovation One (DIO)**, com o objetivo de colocar em prática os **pilares da Programação Orientada a Objetos (POO)**:

- 🔹 **Abstração**
- 🔹 **Encapsulamento**
- 🔹 **Herança**
- 🔹 **Polimorfismo**

O domínio escolhido foi o de um **Bootcamp de Programação**, onde temos **Cursos, Mentorias e Devs** que participam e acumulam **XP** conforme avançam.

---

## 🏛 Estrutura do Projeto
O sistema foi modelado com as seguintes classes:

- **Classe Abstrata**
  - `Conteudo` → Representa o conceito genérico de conteúdo (curso/mentoria).

- **Classes Concretas**
  - `Curso` → Herda de `Conteudo`.
  - `Mentoria` → Herda de `Conteudo`.

- **Outras Classes**
  - `Bootcamp` → Agrupa os conteúdos e os devs inscritos.
  - `Dev` → Representa o aluno participante do bootcamp.

- **Classe Main**
  - Executa a simulação: cria cursos, mentorias, bootcamp e devs.

---

## 📂 Estrutura de Pastas
A organização do projeto segue a estrutura de pacotes Java:

```bash
desafio/
 ├── Main.java
 └── dominio/
     ├── Bootcamp.java
     ├── Conteudo.java
     ├── Curso.java
     ├── Dev.java
     └── Mentoria.java
