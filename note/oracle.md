

## Impdp

Data Pump Import.

import into table.

```bash
impdp user/pass@DB directory=directory_object dumpfile=foobar.dmp logfile=foobar.log tables=SCHEHA.%
```

import into schema.

```bash
impdp user/pass@DB directory=directory_object dumpfile=foobar.dmp logfile=foobar.log schema=SCOTT
```

import into different schema.

```bash
impdp user/pass@DB directory=directory_object dumpfile=foobar.dmp logfile=foobar.log remap_schema=SCOTT:ALICE
```

Stop the impdp

`ctrl+c` はNG。`ctrl+c` を1回押して、`kill_job` するs。

```bash
> Import> kill_job
```




## Expdp

Data Pump Export.

Estimate dump file size.

```bash
expdp scott/tiger@db schemas=SCOTT estimate_only=y
```

Dump Schema.

```bash
expdp scott/tiger@db directory=DATA_PUMP_DIR dumpfile=scott.dmp logfile=scott.log schemas=SCOTT
```



## How2 Use SQL*Plus on macOS

MacOSに、Oracle Instant Clientを導入して、`SQL*Plus`を使用する方法。

ORACLE公式サイトより、下記2つダウンロード。

- `instantclient-basic-macos.x64-12.2.0.1.0-2.zip`
- `instantclient-sqlplus-macos.x64-12.2.0.1.0-2.zip`

`/usr/local/oracle/` に解凍したものを移動。

以下、`.zshrc` に記述。

```bash
# Oracle
export ORACLE_HOME=/usr/local/oracle
export PATH=$PATH:$ORACLE_HOME/instantclient_12_2
```

必要であれば `tnsnames.ora` を `$ORACLE_HOME/network/admin/` に作成すると良い。



