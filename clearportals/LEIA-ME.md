# Clear Portals (etapa 1)

Mod para Minecraft Java 26.3 com Fabric que deixa o portal do Nether translúcido.
Nesta etapa você enxerga o mundo atual através do portal. A visão da outra dimensão
é a etapa 2, que vem depois que esta compilar e funcionar.

## Como transformar isso em um mod (sem instalar nada no computador)

O GitHub compila o mod para você. Siga na ordem.

### 1. Criar o repositório
1. Entre em https://github.com e faça login.
2. Clique em **New repository** (botão verde, ou o "+" no canto de cima).
3. Em *Repository name* escreva `clearportals`.
4. Deixe marcado **Public** (grátis e sem limite de compilações).
5. Não marque nenhuma das opções de "Add a README", ".gitignore" ou "license".
6. Clique em **Create repository**.

### 2. Enviar os arquivos
1. Extraia o arquivo `clearportals.zip` em uma pasta do seu computador.
2. Na página do repositório recém-criado, clique no link **uploading an existing file**.
3. Abra a pasta extraída, selecione **tudo que está dentro dela** (as pastas `src` e `.github` e os arquivos soltos) e arraste para a página.
4. Espere terminar o envio e clique em **Commit changes**.

Atenção: no Mac, pastas que começam com ponto (como `.github`) ficam escondidas.
Para mostrá-las no Finder, aperte `Cmd + Shift + .`.

### 3. Esperar a compilação
1. Clique na aba **Actions** do repositório.
2. Vai aparecer uma execução chamada **Compilar o mod**. A primeira vez leva uns 5 minutos.
3. Bolinha amarela = compilando. Marca verde = deu certo. X vermelho = deu erro.

Se a aba Actions não mostrar nada, a pasta `.github` não foi enviada. Me avise
que eu te passo o texto para criar esse arquivo pelo próprio site.

### 4. Baixar o mod
1. Clique na execução que ficou com a marca verde.
2. Desça até a seção **Artifacts** e clique em **clear-portals-mod**.
3. Vai baixar um `.zip`. Extraia: dentro está o arquivo `clearportals-0.1.0.jar`.

### 5. Instalar no Minecraft
1. Instale o **Fabric Loader 0.19.5 ou mais novo** para o Minecraft 26.3 (instalador em https://fabricmc.net/use).
2. Baixe o **Fabric API 0.163.0+26.3** (Modrinth ou CurseForge) para o Minecraft 26.3.
3. Coloque o `.jar` do Fabric API e o `clearportals-0.1.0.jar` na pasta `mods` do Minecraft
   (no Windows: aperte `Win + R`, digite `%appdata%\.minecraft\mods` e Enter. Crie a pasta `mods` se não existir).
4. Abra o launcher e jogue com o perfil do Fabric.

## Se der erro (X vermelho)
1. Clique na execução com X vermelho, depois em **build**.
2. Abra a etapa que está marcada em vermelho e copie as últimas 30 linhas do texto.
3. Cole aqui na conversa comigo. Erro na primeira compilação é normal em mod novo, e eu corrijo.

## O que tem em cada pasta
- `src/client/java/...`: o código do mod.
- `src/main/resources/assets/minecraft/textures/block/`: a textura translúcida do portal.
- `src/main/resources/fabric.mod.json`: nome e requisitos do mod.
- `build.gradle`, `gradle.properties`, `settings.gradle`: configuração da compilação.
- `.github/workflows/build.yml`: a receita que manda o GitHub compilar.
