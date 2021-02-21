

## keytool

Displays the content for keystore entry.

```sh
% keytool -list -v -keystore zz -storetype yy -storepass zz

# zz: keystore path (e.g. /path/to/my/keystore.p12)
# yy: storetype (e.g. pkcs12)
# xx: password 4 certificate
```


## SSH

cf. https://www.ssh.com/ssh/

#### Create SSH Keys

```sh
% ssh-keygen -t rsa -b 4096 -C zz

# zz: comment, mailaddress (e.g. alice@example.com)
# RSA n 4096bit
```

cf. https://cybersecurity-jp.com/security-measures/29197, https://gigazine.net/news/20200828-ssh-encryption-algorithm, https://persol-tech-s.co.jp/corporate/security/article.html?id=26

#### Configuration

```sh
Host zz
  HostName yy
  User xx
  IdentityFile ww

# zz: connect name (e.g. example)
# yy: host/domain/ip (e.g. example.com)
# xx: username
# ww: private id path (e.g. /path/to/my/id_rsa)
```
