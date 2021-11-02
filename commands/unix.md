


makeup path

```
echo $PATH | sed 's/:/\n/g'
```

作成後60日経過しているファイルの削除

```sh
find /path/to/my/dir -mtime +59 -name "*.txt" | xargs --no-run-if-empty rm
```

ファイル作成（日付指定）

```sh
touch foobar.txt -t 300012310000
```


