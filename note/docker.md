



- docker-compose.yml の version は、マイナーバージョンまでしっかり記述しろ
- 可能な限り、軽量なイメージを使用する
  - Alpine Linux ベースのイメージとか



## Trouble Shooting

#### WARNING: Found orphan containers ...

`docker-compose up` や `docker-compose down` の実行結果として、以下のWARNINGが出る件。

```console
WARNING: Found orphan containers (docker_quxquux_1) for this project. If you removed or renamed this service in your compose file, you can run this command with the --remove-orphans flag to clean it up.
Removing docker_foobar_1 ... done
Removing network docker_default
ERROR: error while removing network: network docker_default id XXXX has active endpoints
```

僕は、プロジェクト直下に `docker/` を作成して `docker-compose.yml` を置くことが多いが、
その状況下だと、作成されたコンテナ名とかのprefixとしてdockerが使用されてしまうことで、コンテナ名とかが他と被ってしまい、このようなWARNINGが発生してしまうらしい。

解決策の1つですが、`.env` を作成し、以下のようにプロジェクト名を定義すれば良い。

```conf
COMPOSE_PROJECT_NAME=foobar
```

ベスプラでは無いかも。






