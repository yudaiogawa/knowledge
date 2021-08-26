
# Impdp

Data Pump Import.

## Tips

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

`ctrl+c` を押しまくるのはNG。`ctrl+c` を1回押して、`kill_job` と伝えてあげる。

```bash
> Import> kill_job
```
