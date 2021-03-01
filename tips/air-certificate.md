

Certificate for AIR-App Code Signing
------------------------------------

#### Create

```sh
% adt -certificate -cn zz -ou yy -o xx -c JP 2048-RSA ww vv

# zz: name (e.g. SelfSign)
# yy: organization unit
# xx: organization name
# ww: certificate name (e.g. sign.p12)
# vv: password 4 certificate
```

###### references

* [Creating a self-signed certificate with ADT](https://help.adobe.com/en_US/air/build/WS5b3ccc516d4fbf351e63e3d118666ade46-7f74.html)


#### Migrate

```sh
% adt -migrate -storetype zz -keystore yy -storepass xx ww vv

# zz: storetype (e.g. pkcs12)
# yy: old certificate (e.g. /path/to/my/old-sign.p12)
# xx: password 4 certificate
# ww: air file signed w/ new certificate (e.g. new-signed-app.air)
# vv: create air filename (e.g. migrated-app.air)
```

###### references

* [Signing an updated version of an AIR application](https://help.adobe.com/en_US/air/build/WS13ACB483-1711-43c0-9049-0A7251630A7D.html)
