


# Test Driven Development

- [ArchUnit](https://www.archunit.org/)
- [TDD Guided By ZOMBIES](https://blog.wingman-sw.com/tdd-guided-by-zombies)

TDDは、設計のひらめきが正しい瞬間に訪れることを保証するものではない。
しかし、自信を与えてくれるテストときちんと手入れされたコードは、ひらめきへの備えであり、
いざひらめいたときに、それを具現化するための備えでもある。

- GIGO
  - Garbage In, Garbage Out
  - 意図した通りではなく、書いた通りに動く

- ユニットテスト
  - クラスやメソッドが対象の「最も小さいテスト」
- ソフトウェアテスト
  - ある特定の条件下において、ソフトウェアの振る舞いを記録し、期待される結果と比較/検証するプロセス

全てを網羅したテストなんてものは無い。
完璧なテストは存在しない。
限りある中でのベストなテストを書く。

ソフトウェアテストでは 「期待通りの振る舞いをするか」 を確認する。
期待値(expected)と実測値(actual)を比較すればよい。この比較検証のことを「アサーション」という。

- SUT
  - System Under Test
  - テスト対象オブジェクトを表す

曖昧さは極力無くして、具体的なテストケースにしたほうがよい。

- White Box
  - 内部ロジックを考慮したテスト
- Black Box
  - 入出力のみを見るテスト

ソフトウェアテストは以下4フェーズで行われる。

- 事前準備
- 実行
- 検証
- 後処理

テストを実行および成功させるために必要なデータなどの前提条件のことを `Fixture(Context)` という。
Fixtureを用意することを「セットアップ」と呼び、メソッド毎にFixtureをセットアップする手法を「インラインセットアップ」と呼ぶ。


## Refs

- https://gihyo.jp/dev/serial/01/tdd
- https://docs.microsoft.com/ja-jp/devops/develop/shift-left-make-testing-fast-reliable
- https://speakerdeck.com/twada/test-driven-architecture-aws-dev-day-tokyo-2018?slide=95
  - 外部に依存したコードもテストで駆動する / Test-Driven Architecture - AWS Dev Day Tokyo 2018
- https://t-wada.hatenablog.jp/entry/clean-code-that-works
  - 動作するきれいなコード: SeleniumConf Tokyo 2019 基調講演文字起こし+α
- https://www.slideshare.net/t_wada/jasst-2014-hokkaidotwadatdd
  - Test Yourself - テストを書くと何がどう変わるか





