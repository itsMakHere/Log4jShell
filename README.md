# Log4jShell

Prequisites:

1. Java
2. Maven
3. IntelliJ/Eclipse

Steps to run application and reproduce the Log4jShell issue:

1. Clone the repo https://github.com/itsMakHere/Log4jShell.git
2. Import/open the project into IntelliJ/Eclipse
3. Set the VM arguments to following values: ```-Dcom.sun.jndi.ldap.object.trustURLCodebase=true -Dlog4j2.debug=true```
4. Run the Application.java file.
5. You will see in the logs that ```javax.naming.CommunicationException: giq2uc.dnslog.cn:389 [Root exception is java.net.ConnectException: Connection refused: connect]```.

### OR

1. Clone the repo https://github.com/itsMakHere/Log4jShell.git
2. Run ```mvn clean install``` command
3. Run ```java -jar -Dcom.sun.jndi.ldap.object.trustURLCodebase=true -Dlog4j2.debug=true target/Log4jShell-1.0-SNAPSHOT-jar-with-dependencies.jar```
4. You will see in the logs that ```javax.naming.CommunicationException: giq2uc.dnslog.cn:389 [Root exception is java.net.ConnectException: Connection refused: connect]```.

**NOTE: You change the server address to point to you server address in ```Application.java``` file.**

### Getting your own DNS

1. Go to http://www.dnslog.cn/
2. Click on ```Get SubDomain``` button
3. Copy the domain name and paste it into ```Application.java``` by replacing ```giq2uc.dnslog.cn``` with your domain name.
4. Run the application again.
5. You will see the that application tried to hit the pasted url in http://www.dnslog.cn/

For more info head onto this repo: https://github.com/christophetd/log4shell-vulnerable-app