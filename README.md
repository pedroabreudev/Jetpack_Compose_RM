# Aluvery

Projeto de estudo de um App de entrega de comidas e bebidas em geral feito em Compose.

## 🔨 Funcionalidades do projeto

O Aluvery apresenta um catálogo de produtos variados como comidas, doces, bebidas etc. Também, ele permite realizar:

- Busca de produtos a partir do nome ou descrição
- Formulário de cadastro de novos produtos
- Apresentação de novos produtos na primeira seção do catálogo

<img src="https://user-images.githubusercontent.com/8989346/196525814-e2d68b0a-6185-4d7a-823d-7b71afebdc69.gif" width="30%"/>

## ✔️ Técnicas e tecnologias utilizadas

Para a implementação do projeto foram utilizadas as seguintes técnicas:

- Jetpack Compose
- Kotlin
- Activity
- Composables
  - Layout (`Column`, `Row` e `Box`)
  - `Image`
  - `Text`
- Modifier
- Separação de componentes e telas
- Reutilização de composables

- `Lazy Layouts`: otimização da performance de implementações de linhas ou colunas com muitos elementos
- `OutlinedTextField`: implementação do campo de texto com os padrões do Material Design
- `Gerenciamento de estado`: utilização de estados mutáveis para reagir com as mudanças do campo de texto
- `Personalização baseado em Slot`: personalização flexível em locais específicos de determinados composables
- `Apresentação de conteúdo dinâmico`: exploração da técnica para apresentar ou não um conteúdo dependendo do estado
- `Modifier padrão`: flexibilização para personalizar composables em nível de componentes
- `Implementação de filtro`: uso consciente de códigos computacionais dentro de composables
- `State Hoisting`: técnica para reutilizar composables que precisam de gerenciamento de estado permitindo que o invocador seja o responsável pelo estado

- `Scaffold`: para estruturar componentes do Material Design
- `FloatingActionButton`: para acessar o formulário e o 
- `Slot`: para reutilizar composables base do App
- `Button`: para salvar produtos a partir do formulário
- `Melhoria de experiência do formulário`: aplicação de scroll e preview de imagem ao carregar uma URL válida
- `Melhoria dos teclados nos campos de texto`: modificação nos tipos de teclados, ações de ime, capitalização e filtro nos valores inseridos
- `DAO`: classe responsável em salvar e buscar produtos salvos
- `Gerenciamento de estados com State Holder`: criação de um objeto responsável em manter os estados e eventos do composable de tela
- `Boas práticas no State Holder`: elevação de estados e eventos, como também, o uso do `remember()` para reagir a todos os estados necessários
- `Implementação de composables Stateful e Stateless`: implementação de duas versões do mesmo composable para facilitar a reutilização (Stateful) para flexibilizar a personalização (Stateless)


## 🛠️ Abrir e rodar o projeto

Após baixar o projeto, você pode abrir com o Android Studio. Para isso, na tela de launcher clique em:

- **Open an Existing Project** (ou alguma opção similar)
- Procure o local onde o projeto está e o selecione (Caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo)
- Por fim clique em OK

O Android Studio deve executar algumas tasks do Gradle para configurar o projeto, aguarde até finalizar. Ao finalizar as tasks, você pode executar o App 🏆
