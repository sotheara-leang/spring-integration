# spring-integration


#### 1. Server

- Generate keystore

    keytool -genkey -alias server-key -keystore server-keystore.jks -keyalg RSA

- Generate certificate

    keytool -export -alias server-key -file server-certificate.cer -keystore server-keystore.jks

- Generate truststore

    keytool -import -alias client-key -file client-certificate.cer -keystore server-truststore.jks


#### 2. Client

- Generate keystore

    keytool -genkey -alias client-key -keystore client-keystore.jks -keyalg RSA

- Generate certificate

    keytool -export -alias client-key -file client-certificate.cer -keystore client-keystore.jks

- Generate truststore

    keytool -import -alias server-key -file server-certificate.cer -keystore client-truststore.jks

#### 3. VM Parameter

- Debug SSL Handshake: -Djavax.net.debug=ssl:handshake
