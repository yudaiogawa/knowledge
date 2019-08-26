# SQL

## Version

バージョン確認

```sql
SELECT * FROM V$VERSION
```

## User

ユーザ一覧

```sql
SELECT * FROM DBA_USERS ORDER BY USERNAME;
```

## Sequence

DBに登録してある全てのシーケンス

```sql
SELECT * FROM DBA_SEQUENCES;
```

現在のユーザが参照できるシーケンス

```sql
SELECT * FROM ALL_SEQUENCES;
```

現在のユーザがオーナーのシーケンス

```sql
SELECT * FROM USER_SEQUENCES;
```

次のシーケンス値を取得

```sql
SELECT SEQUENCE_NAME.nextval from dual;
```

現在のセッションにて最後に採番したシーケンスを取得。現在のセッションにて採番を行なってない場合には取得できずエラーとなる。

```sql
SELECT SEQUENCE_NAME.currval from dual;
```