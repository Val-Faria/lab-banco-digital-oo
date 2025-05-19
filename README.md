# 💻 Banco Digital com Java e POO

Projeto desenvolvido como parte do desafio da [DIO](https://web.dio.me/) para reforçar os conceitos de **Programação Orientada a Objetos (POO)** em Java, com um sistema bancário completo e interativo.

> 🔗 Fork realizado e personalizado por [**Val Faria**](https://github.com/Val-Faria)

---

## 🧠 Conceitos Abordados

- ✅ Abstração
- ✅ Encapsulamento
- ✅ Herança
- ✅ Polimorfismo
- ✅ Organização de classes e responsabilidades

---

## 🚀 Funcionalidades

- 👤 Cadastro de clientes
- 🏦 Criação de conta corrente e conta poupança
- 💰 Depósito e saque
- 🔁 Transferência entre contas
- 📄 Emissão de extrato detalhado
- 🎛️ Interação com o usuário via terminal
- 🌍 Suporte a caracteres UTF-8 (acentuação correta nos nomes)

---

## ✨ Melhorias feitas por **Val Faria**

| Tipo de melhoria              | Descrição |
|------------------------------|-----------|
| 🧩 Organização de código      | Refatoração completa para melhor leitura e modularização |
| 🎯 Entrada via terminal       | Inserção de dados com `Scanner`, tornando o sistema interativo |
| 🔐 Validações                 | Prevenção de saques/transferências com saldo insuficiente |
| 🔤 Correção de Encoding       | Suporte a UTF-8 para evitar erros como "JoÃ£o" |
| 🧾 Extrato detalhado          | Impressão clara das operações realizadas por cliente |
| 📌 Responsabilidade única     | Separação clara entre classes como `Banco`, `Cliente`, `Conta`, etc |

---

## 🛠️ Como executar

```bash
# Clone o repositório
git clone https://github.com/Val-Faria/lab-banco-digital-oo.git
cd lab-banco-digital-oo

# Compile os arquivos Java
javac *.java

# Execute o programa
java Main

## 📁 Estrutura de Classes
📦 lab-banco-digital-oo
 ┣ 📜 Banco.java
 ┣ 📜 Cliente.java
 ┣ 📜 Conta.java
 ┣ 📜 ContaCorrente.java
 ┣ 📜 ContaPoupanca.java
 ┣ 📜 IConta.java
 ┗ 📜 Main.java

## 👩‍💻 Sobre a autora
Val Faria
🎓 Estudante de Análise e Desenvolvimento de Sistemas
🚀 Em transição de carreira com foco em Backend Java
💡 Apaixonada por desafios de lógica, POO e automação

🔗 GitHub: github.com/Val-Faria