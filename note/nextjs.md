


- CRAよりも楽ができる

- ルーティングが楽
  - react-routerが不要。LINKコンポーネントが存在する。
  - ページとURLの関連付けが簡単
  - 動的なルーティングが可能

- Metadataの設定が楽
  - ページ毎にMetadataを設定できる
  - SEO対策に有効

- Code Splitting
  - 必要なJSだけ読み込む

- Pre Fetching
  - 関連のあるJSを事前に読み込む

- SSR - Server Side Rendering
  - SEOに強い
  - リクエストやアクセスが多いと、サーバーに負荷がかかるというデメリットもある
    - 逆に表示が遅くなってしまいかねない

- SG - Static Generation
  - 静的ジェネレーション
  - ビルド時に静的ファイルを生成してデプロイされる
  - 表示の高速化、サーバー負荷の軽減
  - ブログとかECサイトの商品ページとか、データの変化が無いページに関しては静的ジェネレーションを使おう。

- 仲間に Gatsby.js がいる（なんか使ったなぁ）

- next-env.d.ts
  - https://qiita.com/282Haniwa/items/ff3fc9cd783f6f418a35

- パスと一致するpagesディレクトリ配下の各ファイルにルーティングされる
  - これがデフォルト仕様
  - このルーティングに独自実装を組み込みたい場合にカスタムサーバを利用します。
  - 例えば、特定のパスの場合のCookie操作やリダイレクト処理の実装などが挙げられる。
  - https://nextjs-ja-translation-docs.vercel.app/docs/advanced-features/custom-server



## Keywords


- JAMスタック
  - Javascript + API + MarkDown の頭文字を取って JAM と呼ばれている。
  - 表示速度が早い。
  - セキュリティにも強いらしい。どう強いのかは不明。

