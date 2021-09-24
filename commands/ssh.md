
SSH
---

#### Create SSH Keys

```sh
% ssh-keygen -t rsa -b 4096 -f yy -C zz

# zz: comment, mailaddress (e.g. alice@example.com)
# yy: specify the key file. (e.g. ~/.ssh/foobar/id_rsa)
# RSA n 4096bit
```

#### Configuration

edit `~/.ssh/config`

```sh
Host zz
  HostName yy
  User xx
  IdentityFile ww

# zz: connect name (e.g. example)
# yy: host/domain/ip (e.g. example.com)
# xx: username
# ww: private id path (e.g. ~/.ssh/id_rsa)
```

#### Refs

- https://www.ssh.com/ssh/
- https://cybersecurity-jp.com/security-measures/29197
- https://gigazine.net/news/20200828-ssh-encryption-algorithm
- https://persol-tech-s.co.jp/corporate/security/article.html?id=26
