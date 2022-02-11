


- SOLID原則は大事
  - SRP(単一責任の原則)
  - 古い時代のオブジェクト指向に関する部分が多いから注意
- 凝集度と結合度
  - 実装したメソッドは、そのクラスに置いていいのかよく考えよう
  - https://www.ogis-ri.co.jp/otc/hiroba/technical/Cohesion_Coupling/Cohesion_Coupling.html
- 安定性依存原則
  - 容易に公開するな！
  - 容易に public にすると、他パッケージから依存されたりして変更しにくくなるぞ
- テスト戦略は大事
  - [テスト戦略ドキュメントの書き方](https://ja.myservername.com/how-write-test-strategy-document)
  - [ソフトウェアテストの7原則と実務上の留意点](https://shiftasia.com/ja/column/2020071412000001-2/)

- 大事なこと
  - 副作用（主に入出力）を局所化する
  - ロジックを純粋関数で実装する
  - イミュータブルを心がける
  - 依存を最低限に

- ドメインルールが一か所で実装されていることが重要
- 何でもかんでもUtilクラスにまとめたりしない
- ドメインルールは自然な形で利用できるところに置く。
  - Controller, Serviceなどの利用側で意識して呼び出さないといけないよりも、例えば画面の入力値を保持するオブジェクトの中でやる、DBから取得した値を保持するオブジェクトでやる、とか。

## Architecture

- Clean Architecture
- ヘキサゴナルアーキテクチャ
- オニオンアーキテクチャ

## 設計手法

- DDD Domain Driven Design


## 開発手法

- UDD Usecase Driven Development
- TDD Test Driven Development

