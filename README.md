# Aluvery

Projeto de estudo de um App de entrega de comidas e bebidas em geral feito em Compose.

## 🔨 Funcionalidades do projeto

O Aluvery apresenta um catálogo de produtos variados como comidas, doces, bebidas etc. Também, ele permite realizar pesquisas para buscar produtos desejados a partir de um campo de texto.

<img src="https://user-images.githubusercontent.com/8989346/191754098-cd2b5c5c-54b2-4bae-8d92-28f0d4faa924.gif" width="30%"/>

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

## 🛠️ Abrir e rodar o projeto

Após baixar o projeto, você pode abrir com o Android Studio. Para isso, na tela de launcher clique em:

- **Open an Existing Project** (ou alguma opção similar)
- Procure o local onde o projeto está e o selecione (Caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo)
- Por fim clique em OK

O Android Studio deve executar algumas tasks do Gradle para configurar o projeto, aguarde até finalizar. Ao finalizar as tasks, você pode executar o App 🏆
