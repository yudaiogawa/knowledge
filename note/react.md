

採用されているサービス

- Slack
- Qiita
- Netflix
- Airbnb
- Dropbox



MEMO

- Virtual DOM
- 高速レンダリング
- DOMの変更箇所がどこなのか把握しないといけない問題をReactは解消する。
- JSX
  - javascript XML
  - トランスパイルされる
  - Javascriptより直感的な表現
  - HTMLを直感的に表現可能
- returnで返すのは1つのタグのみ
- React.Fragment
- Redux x 非同期処理
  - Redux Suga, Redux Thunx
- stateが変更されると再レンダリング
- 親コンポーネントのstateが更新されると、子コンポーネントも再レンダリングされる
- 無駄な再レンダリングを回避する方法
  - React.memo
- React.memo
  - 親のstateが変更されても、子に渡すpropsの値に変化がなければ再レンダリングしない
  - propsの値に変化があるなら、再レンダリングされる
  - 関数コンポーネントをラップして使おう
- React Hooks
  - useState()
  - モジュールとかではなく関数
- stateは直接書き換えてはならない。setState()を使用する。
- Prop-types
  - propsの型定義
- React Native
  - 4 development mobile applications

4 Implementataion

- `default export` は、あまり使用すべきでは無い
  - [なぜ default export を使うべきではないのか？](https://engineering.linecorp.com/ja/blog/you-dont-need-default-export/)

Redux

- 状態の一元管理を可能にする
- storeと呼ばれる箱で状態を一元管理する
- reactだけでは状態管理が大変すぎる
- reactだけだと状態をバケツリレーのように、コンポーネントに引き継いでいく必要が出てくるが大規模なアプリに（階層が深く）なればなるほどきつくなる。
- バケツリレーの対象は、propsってやつ。

Flux

- データフローの設計概念


Keys

- ES6
- JSX
- トランスパイル
- Babel
- webpack
- Props
- State
- 仮想DOM
- Next.js
- Class Component
- Functional Component
- node
- yarn
- npm
- create-react-app
- create-next-app
- Redux


Refs

- [Reactの何がエンジニアを夢中にさせるのか](https://gihyo.jp/dev/serial/01/technical_field/0002?page=2)









