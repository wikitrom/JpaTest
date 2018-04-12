
Personal EDU only - Testing out JPA usage

Simple instructions to self...

1. Install JBOSS Tools from Eclipse market
2. Setup a maven project
2.1 add dependencies to maven config file (pom-xml)
  - hibernate entity manager 5.2.12
  - mysql connector
3. Setup a DB, e.g. mysql
4. Configure JPA:
  - file: persitent.xml
  - add config stuff to access database

<property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect" />
<property name="hibernate.connection.driver_class" value="com.mysql.jdbc.Driver" />
<property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/<db name>" />
<property name="hibernate.connection.username" value="<uid>" />
<property name="hibernate.connection.password" value="<pwd>" />
