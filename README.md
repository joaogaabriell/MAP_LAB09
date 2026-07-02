# Lab 09 — Adaptadores List/Map (Padrão Adapter)

Atividade de laboratório da disciplina de **Métodos Avançados de Programação (MAP)**.

## Sobre o projeto

Implementação do padrão de projeto **Adapter (Adaptador)** sobre as coleções do Java:

| Adapter | O que faz |
|---|---|
| `MapToListAdapter<T>` | Faz um `Map<Integer, T>` se comportar como uma `List<T>` |
| `ListToMapAdapter<K, V>` | Faz uma `List<V>` se comportar como um `Map<K, V>` (chaves inteiras = índices) |

Cada adaptador implementa a interface alvo (`List` ou `Map`) delegando as operações à coleção adaptada. Operações sem equivalente direto lançam `UnsupportedOperationException`.

A classe `Main` demonstra os dois adaptadores em uso (adição, remoção, busca e consulta por chave/índice).

## Tecnologias

- Java
- Maven
- JUnit 5 (testes unitários)

## Como executar

```bash
mvn compile exec:java -Dexec.mainClass="Main"
```

Ou abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a classe `Main`.

## Testes

```bash
mvn test
```
