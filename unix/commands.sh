#!/bin/bash -x
#!/bin/bash -e
#!/bin/bash -v

#### ファイル一覧表示 ###############################################################

# ファイル一覧を更新日で降順ソートして表示。大量にログファイルがあったりするとこで使える。
ls -ltr

# 拡張子毎にまとめて表示してくれる
ls -lX

#### ファイル閲覧 && 編集 ###########################################################

# readonlyで開く
view hoge.txt

#### 検索 ###########################################################################

# ファイル名検索。指定したディレクトリ以下を再帰的に探してくれる
find . -name "*hoge*"

# 文字列検索。指定したディレクトリ以下のファイルから指定された文字列を再帰的に探してファイル名を吐き出しちゃう。
grep "hoge" -r . --color

#### 接続 ###########################################################################

# 指定したリモートホストにSSH接続
ssh -i path/to/sshkey username@hostname


#### ファイル監視 ###################################################################

# 軽く監視する時。書込みが無い場合はファイルへのアクセスは行われない。
tailf hoge.log

# 監視しているファイル名が変わった際、開き直してくれる。
tail -F hoge.log

# ファイル名表示 + 色付け
tail -F -v hoge.log | grep "hoge" --color

# 監視とlessコマンドを切り替えながらファイル監視できる。
# ctrl + c  -> less
# shift + f -> monitoring
less +F hoge.log

#### 環境変数 #######################################################################

# grep結果を色付けしてくれる
export GREP_OPTIONS='--color=auto'