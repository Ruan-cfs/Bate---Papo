# 💬 Bate-Papo Simples - Demonstração de Interatividade e Busca em Java

Este projeto é uma aplicação de chat via console desenvolvida em **Java** para praticar a interação direta com o usuário e a lógica de busca de objetos em listas.

## 🚀 O que estou praticando?
Neste exercício, foquei em tornar o software dinâmico e interativo:
* **Entrada de Dados (`Scanner`):** Uso intensivo da classe `Scanner` para capturar nomes, mensagens e opções de menu, incluindo o gerenciamento do buffer do teclado.
* **Estrutura de Repetição `do-while`:** Implementação de um menu principal que mantém o programa rodando até que o usuário escolha a opção de sair.
* **Lógica de Busca:** Criação de um método para percorrer uma lista de usuários e encontrar um objeto específico através de uma comparação de texto (`equalsIgnoreCase`).
* **Relacionamento entre Objetos:** A classe `Mensagem` conecta dois objetos da classe `Usuario` (remetente e destinatário), demonstrando como associar dados em um sistema real.

## 🎮 Funcionalidades
O sistema oferece um painel de controle com as seguintes opções:
* **Criar Usuário:** Permite registrar novos participantes no sistema de chat.
* **Enviar Mensagem:** O usuário informa quem envia e quem recebe. O sistema valida se ambos existem antes de permitir a escrita da mensagem.
* **Ver Mensagens (Histórico):** Exibe todas as trocas de mensagens realizadas durante a sessão, formatadas como `Remetente -> Destinatário: Conteúdo`.
* **Listar Usuários:** Exibe todos os nomes cadastrados para facilitar a identificação dos destinatários.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK 15).
* **IDE:** IntelliJ IDEA.

## 📝 Como testar
Ao executar a classe `Main`, você verá um menu numerado. Primeiro, use a **opção 1** para criar pelo menos dois usuários. Em seguida, utilize a **opção 2** para simular uma conversa entre eles. Use a **opção 3** a qualquer momento para revisar o que foi enviado.

---
*Este projeto demonstra minha capacidade de criar sistemas funcionais que processam informações em tempo real de acordo com as escolhas do usuário.*
