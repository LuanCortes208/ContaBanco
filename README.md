# 📚 Projeto Sistema Bancário - Contas Corrente e Poupança

## 📋 Sobre o Projeto

Este projeto simula operações bancárias básicas em Java, incluindo:
- **Conta Corrente** (com saque com taxa e transferências)
- **Conta Poupança** (com aplicação de rendimento)
- **Cliente** (informações pessoais associadas às contas)

O objetivo é:
- **Praticar conceitos fundamentais de Java**, como herança, classes seladas, exceções personalizadas e encapsulamento.
- **Criar uma estrutura sólida** para futuras expansões, como integração com banco de dados, serviços web ou interface gráfica.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Uso |
|:---|:---|:---|
| Java | 17+ | Desenvolvimento principal |
| JUnit | 5.8.2 | Testes unitários |
| Maven/Gradle (opcional) | - | Gestão de dependências/testes |

**Observação:** Java 17 ou superior é obrigatório devido ao uso de **sealed classes**.

---

## ⚙️ Como Funciona

- **Conta Corrente** pode:
    - Sacar valores (com ou sem taxa)
    - Depositar valores
    - Transferir dinheiro para outras contas

- **Conta Poupança** pode:
    - Depositar valores
    - Aplicar rendimentos (simulados conforme a data)

- **Cliente** é o usuário que possui contas.

**Importante:** Saques e transferências validam saldo disponível, lançando exceções em caso de saldo insuficiente.

---

## 🚀 Como Testar o Projeto na Sua Máquina

### 📥 Requisitos Mínimos
- Java 17 instalado ([Download Java SE 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html))
- IDE instalada (Visual Studio Code, Eclipse, IntelliJ) ou apenas Terminal
- Recomendado: Maven ou Gradle para gerenciar dependências (opcional)

---

### 💻 1. Testar usando **Visual Studio Code**

**Extensões recomendadas:**
- _Java Extension Pack_ (inclui Language Support for Java, Debugger, Maven)
- _Test Explorer UI_ (opcional para gerenciar testes JUnit)

**Passos:**
1. Instale o Java e as extensões acima no VS Code.
2. Clone o projeto:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
3. Abra a pasta do projeto no VS Code.
4. Compile os arquivos:
   ```bash
   Ctrl + Shift + B
   ```
5. Rode os testes:
    - Abra o arquivo `ContaOperationsTest.java`
    - Clique em "Run Test" acima das anotações `@Test`
    - Ou pressione `Ctrl + Shift + P`, digite `Test: Run All Tests`.

---

### 💻 2. Testar usando **IntelliJ IDEA** ou **Eclipse**

**Configurações especiais:**
- Certifique-se que a linguagem do projeto está configurada para **Java 17**.
- Caso use Maven/Gradle, importe o projeto como **Project From Existing Sources**.

**Passos:**
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Abra o projeto na IDE.
3. Certifique-se que a JDK do projeto é **Java 17**.
4. Compile o projeto (`Build -> Build Project`).
5. Rode os testes:
    - Clique com botão direito na pasta `tests` > `Run Tests`.
    - Ou clique no ícone de play nas classes ou métodos de teste.

---

### 💻 3. Testar usando **Terminal Puro** (Linux, MacOS, Windows)

**Passos:**
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. Navegue até a pasta:
   ```bash
   cd seu-repositorio
   ```
3. Compile os arquivos `.java`:
   ```bash
   javac -d bin -sourcepath src src/models/*.java src/enums/*.java src/tests/*.java
   ```
4. Execute os testes manualmente usando `JUnit ConsoleLauncher`:

    - Baixe o JUnit 5.8.2 JAR: [JUnit 5.8.2 Release](https://github.com/junit-team/junit5/releases/tag/r5.8.2)
    - Execute no terminal:
      ```bash
      java -jar junit-platform-console-standalone-1.8.2.jar --class-path bin --scan-class-path
      ```

**Observação:** Se preferir, use um script `build.sh` para automatizar (futuramente).

---

## 🧰 Troubleshooting (Erros Comuns)

| Problema | Solução |
|:---|:---|
| `sealed classes` não reconhecidas | Verifique se está usando **Java 17** ou superior |
| `No tests found` no terminal | Confirme que o `@Test` está importado de `org.junit.jupiter.api.Test` |
| `Cannot resolve symbol` em imports | Configure corretamente o SDK na sua IDE (Java 17) |

---

## 📈 Futuras Melhorias

- Implementação de persistência de dados (banco de dados)
- API REST para operações bancárias
- Interface gráfica para simular o internet banking
- Mais testes unitários e testes de integração

---

## 🤝 Créditos

- Projeto desenvolvido para fins educacionais, baseado em boas práticas de Java moderno.
- Dependências externas: [JUnit 5.8.2](https://junit.org/junit5/docs/5.8.2/api/)

---