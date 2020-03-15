# Türk Dil Kurumu Kelime Veritabanı

TDK üzerinde açık kaynak olarak bulunan https://sozluk.gov.tr/autocomplete.json dosyasındaki kelimelerin Spring Framework kullanılarak https://sozluk.gov.tr/gts?ara={kelime} endpointine istek atarak dönen değerin parse edilip MySQL veritabanına aktaran projenin kaynak dosyalarıdır.
Aynı zamanda çekilen kelimelerin .sql dosyalarını da içermektedir.
Projelerinizde kullanmak üzere ~90.000 kelime ve atasözü içermektedir

#### application.properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/<VERITABANI_ADI>?useSSL=false&connectionCollation=utf8_general_ci&characterSetResult=utf8
spring.datasource.username=<VERITABANI_KULLANICI_ADI>
spring.datasource.password=<VERITABANI_PAROLASI>
...
```
