# spring-integration


#### 1. Server

1. Generate keystore

    keytool -genkey -alias server-key -keystore server-keystore.jks -keyalg RSA

2. Generate certificate

    keytool -export -alias server-key -file server-certificate.cer -keystore server-keystore.jks

3. Generate truststore

    keytool -import -alias client-key -file client-certificate.cer -keystore server-truststore.jks


#### 2. Client

1. Generate keystore

    keytool -genkey -alias client-key -keystore client-keystore.jks -keyalg RSA

2. Generate certificate

    keytool -export -alias client-key -file client-certificate.cer -keystore client-keystore.jks

3. Generate truststore

    keytool -import -alias server-key -file server-certificate.cer -keystore client-truststore.jks
